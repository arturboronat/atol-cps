package fr.eseo.atol.examples.cps.aof

import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.papyrus.aof.core.AOFFactory
import org.eclipse.papyrus.aof.core.IBinaryFunction
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.papyrus.aof.core.IMetaClass
import org.eclipse.papyrus.aof.core.IOne
import org.eclipse.papyrus.aof.core.IPair
import org.eclipse.papyrus.aof.core.IUnaryFunction
import org.eclipse.papyrus.aof.core.impl.operation.Copy
import org.eclipse.papyrus.aof.core.impl.utils.cache.IUnaryCache
import org.eclipse.papyrus.aof.core.impl.utils.cache.StrongKeysStrongValuesBinaryCache2
import org.eclipse.papyrus.aof.core.impl.utils.cache.StrongKeysStrongValuesUnaryCache
import org.eclipse.papyrus.aof.core.impl.utils.cache.WeakKeysWeakValuesBinaryCache2
import org.eclipse.papyrus.aof.core.impl.utils.cache.WeakKeysWeakValuesUnaryCache
import org.eclipse.papyrus.aof.operations.GroupByAs
import org.eclipse.papyrus.aof.operations.Includes
import org.eclipse.papyrus.aof.operations.SelectBy
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Identifiable
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Transition
import org.eclipse.viatra.examples.cps.deployment.BehaviorState
import org.eclipse.viatra.examples.cps.deployment.BehaviorTransition
import org.eclipse.viatra.examples.cps.deployment.DeploymentApplication
import org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior
import org.eclipse.viatra.examples.cps.deployment.DeploymentElement
import org.eclipse.viatra.examples.cps.deployment.DeploymentHost
import org.eclipse.viatra.examples.cps.traceability.CPSToDeployment
import org.eclipse.viatra.examples.cps.xform.m2m.util.SignalUtil
import org.eclipse.xtend.lib.annotations.Data

import static com.google.common.base.Preconditions.*

import static extension fr.eseo.atol.examples.cps.aof.CPS.*
import static extension fr.eseo.atol.examples.cps.aof.CPS.HostType.*
import static extension fr.eseo.atol.examples.cps.aof.DEP.*
import static extension fr.eseo.atol.examples.cps.aof.Trace.*

class CPS2DeploymentAOFTransformation {

	extension Logger logger = Logger.getLogger("cps.xform.m2m.aof")

	private def traceBegin(String method) {
		trace('''Executing «method» BEGIN''')
	}

	private def traceEnd(String method) {
		trace('''Executing «method» END''')
	}

// @begin "lang"
	def <E> IBox<E> union(IBox<E>...boxes) {
		boxes.reduce[a, b | a.union(b)]
	}

	def <E> IBox<E> concat(IBox<E>...boxes) {
		boxes.reduce[a, b | a.concat(b)]
	}

	def <A> <=>(IBox<A> a, IBox<A> b) {
		a.bind(b)
	}

	var eqOneCache = new StrongKeysStrongValuesBinaryCache2<IBox<?>, IBox<?>, IOne<Boolean>>
	def <E> eqOne(IBox<E> l, IBox<E> r) {
		var ret = eqOneCache.get(l, r)
		if(ret === null) {
			ret = l.zipWith(r)[a, b |
					a == b
				].asOne(false)
			eqOneCache.put(l, r, ret)
		}
		ret
	}

	def <A> eq(IBox<A> l, IBox<A> r) {
		l.zipWith(r)[a, b |
			a == b
		]
	}

	def ||(IBox<Boolean> l, IBox<Boolean> r) {
		l.zipWith(r)[a, b |
			a || b
		]
	}

	val key = [IBox<Pair<Object, Object>> s |
		s.collect[it.key]
	]
	def <A, B> IBox<A> key(IBox<Pair<A, B>> s) {
		cache(s as IBox<?> as IBox<Pair<Object, Object>>, key) as IBox<A>
	}

	val value = [IBox<Pair<Object, Object>> s |
		s.collect[it.value]
	]
	def <A, B> IBox<B> value(IBox<Pair<A, B>> s) {
		cache(s as IBox<?> as IBox<Pair<Object, Object>>, value) as IBox<B>
	}

	def <A> includes(IBox<A> set, IOne<A> elem) {
		new Includes(set, elem).result.asOne(false)
	}

	// also works as includesAll
	def <A> includesEquiv(IBox<A> set, IBox<A> elem) {
		val set_ = set.distinct	// make sure we have a Set or OrderedSet
		set_.union(elem).size.eq(set_.size)
	}

	@Data
	static class Rule<S, T> {
		val IMetaClass<T> targetType
		val IBinaryFunction<S, T, Object> init
	}

	var weakCache = !true
	var forwardCache =
		if(weakCache)
			new WeakKeysWeakValuesBinaryCache2
		else
			new StrongKeysStrongValuesBinaryCache2

	var reverseCache =
		if(weakCache)
			new WeakKeysWeakValuesUnaryCache
		else
			new StrongKeysStrongValuesUnaryCache

	var nbTargetElements = 0

	def <S, T> IBox<T> collectTo(IBox<S> box, Rule<S, T> rule) {
		return box.collect([source |
			if(source === null || (Pair.isInstance(source) && (source as Pair<?, ?>).value === null)) {
				return null
			}
			var target = forwardCache.get(source, rule) as T
			if(target === null) {
				target = rule.targetType.newInstance
				nbTargetElements++
				forwardCache.put(source, rule, target)
				reverseCache.put(target, source)

				rule.init.apply(source, target)
			}
			return target
		], [])	// we add a reverse collector that we do not use in order to get a collect bijective
	}

	val nullPair = null -> null
	def <S, T> IBox<S> collectedFrom(IBox<T> box, Rule<S, T> _) {
		return box.collect[target |
			if(target === null) {return nullPair as Object as S}
			val ret = reverseCache.get(target) as S
			if(ret === null) {
				println("HERE")
			}
			return ret
		]
	}
// @end "lang"

	CPSToDeployment mapping;

	/**
	 * Creates a new transformation instance. The input cyber physical system model is given in the mapping
	 * @param mapping the traceability model root
	 */
	new(CPSToDeployment mapping) {
		traceBegin("constructor")

		checkNotNull(mapping, "Mapping cannot be null!")
		checkArgument(mapping.cps !== null, "CPS not defined in mapping!")
		checkArgument(mapping.deployment !== null, "Deployment not defined in mapping!")

		this.mapping = mapping;

		traceEnd("constructor")
	}

	val IUnaryCache<ApplicationInstance, IBox<Pair<ApplicationInstance, Transition>>> cache = new StrongKeysStrongValuesUnaryCache
	val IUnaryFunction<ApplicationInstance, IBox<Pair<ApplicationInstance, Transition>>> transitionsFromApplicationInstances =
		[ai |
			if(ai === null) {
				// default element for CollectBox
				return IBox.SEQUENCE as IBox<?> as IBox<Pair<ApplicationInstance, Transition>>
			}
			var ret = cache.get(ai)
			if(ret === null) {
				ret = ai._type.behavior.states
						.validOutgoingTransitions
						.collect[ai -> it]
				cache.put(ai, ret)
			}
			return ret
		]

// @begin Helpers
	val isNull = [IBox<State> it |
		it.collect[
			it !== null
		].asOne(false)
	]
	def isNull(IBox<State> s) {
		cache(s, isNull)
	}

	def filterValidTransitions(IBox<Transition> ts) {
		ts.selectMutable[
			it._targetState.isNull
		]
	}

	var fcache =
		if(weakCache)
			new WeakKeysWeakValuesBinaryCache2
		else
			new StrongKeysStrongValuesBinaryCache2
	def <T, R> R cache(T t, (T)=>R f) {
		var ret = fcache.get(f, t) as R
		if(ret === null) {
			ret = f.apply(t)
			fcache.put(f, t, ret)
		}
		return ret
	}

	val _validOutgoingTransitions = [State it |
		it._outgoingTransitions.filterValidTransitions
	]
	def _validOutgoingTransitions(State s) {
		cache(s, _validOutgoingTransitions)
	}

	val validOutgoingTransitions = [IBox<State> it |
		it.outgoingTransitions.filterValidTransitions
	]
	def IBox<Transition> validOutgoingTransitions(IBox<State> s) {
		cache(s, validOutgoingTransitions)
	}

	val _sendParts = [Transition t |
		t._action.collect[
			if(it !== null && SignalUtil.isSend(it)) {
				SignalUtil.getAppId(it) -> SignalUtil.getSignalId(it)
			} else {
				nullPair as Pair<?, ?> as Pair<String, String>
			}
		]
	]

	def _sendParts(Transition t) {
		cache(t, _sendParts)
	}


	val _candidateHostInstances = [ApplicationInstance t |
		val hi = t._allocatedTo
		val cw = hi.communicateWith
		cw.concat(hi)
	]

	def _candidateHostInstances(ApplicationInstance t) {
		cache(t, _candidateHostInstances)
	}

	val _receiverAppInstances = [Pair<ApplicationInstance, Transition> source |
		val sendParts = source.value._sendParts
		source.key._candidateHostInstances.applications.selectMutable[
			it._type.identifier.eqOne(sendParts.key)
		]
	]

	def _receiverAppInstances(Pair<ApplicationInstance, Transition> source) {
		cache(source, _receiverAppInstances)
	}
// @end Helpers

	val Rule<Pair<ApplicationInstance, Transition>, BehaviorTransition> transition2BehaviorTransition =
		new Rule(DEP.BehaviorTransition.clazz)[Pair<ApplicationInstance, Transition> source, target |
			identifiable2DeploymentElement(source.value, target)

			target._to <=>	source.value._targetState.collect[
								source.key -> it
							].collectTo(
								state2BehaviorState
							)

			val sendParts = source.value._sendParts
			val receiverAppInstances =
				source.key._candidateHostInstances.applications
				.selectBy(sendParts.key.asOne(null))[
					it._type.identifier.asOne(null)
				]

			target._trigger <=>	receiverAppInstances.collectMutable(
									transitionsFromApplicationInstances
								)
								.selectBy(sendParts.value.asOne(null))[t |
									t.value.waitParts
								]
								.collectTo(
									transition2BehaviorTransition
								).asOrderedSet
		]

	val _waitParts = [Transition t |
		t._action.collect[e |
			if(e !== null && SignalUtil.isWait(e)) {
				SignalUtil.getSignalId(e)
			} else {
				null
			}
		].asOne(null)
	]
	def waitParts(Transition t) {
		cache(t, _waitParts)
	}

	val Rule<Pair<ApplicationInstance, State>, BehaviorState> state2BehaviorState =
		new Rule(DEP.BehaviorState.clazz)[Pair<ApplicationInstance, State> source, target |
			identifiable2DeploymentElement(source.value, target)

			target._outgoing <=>	source.value._validOutgoingTransitions.collect[
										source.key -> it
									].collectTo(
										transition2BehaviorTransition
									).asOrderedSet
		]

	def identifiable2DeploymentElement(Identifiable source, DeploymentElement target) {
			target._description <=> source._identifier
	}

	val Rule<Pair<ApplicationInstance, StateMachine>, DeploymentBehavior> stateMachine2DeploymentBehavior =
		new Rule(DEP.DeploymentBehavior.clazz)[Pair<ApplicationInstance, StateMachine> source, target |
			identifiable2DeploymentElement(source.value, target)

			target._states <=>	source.value._states.collect[
									source.key -> it
								].collectTo(
									state2BehaviorState
								).asOrderedSet

			target._current <=>	source.value._initial.collect[
									source.key -> it
								].collectTo(
									state2BehaviorState
								)
			target._transitions <=>	source.value._states.validOutgoingTransitions.collect[
										source.key -> it
									].collectTo(
										transition2BehaviorTransition
									).asOrderedSet
		]

	val Rule<ApplicationInstance, DeploymentApplication> applicationInstance2DeploymentApplication =
		new Rule(DEP.DeploymentApplication.clazz)[source, target |
			target._id <=> source._identifier
			target._behavior <=>	source._type.behavior
									.collect[
										source -> it
									].collectTo(
										stateMachine2DeploymentBehavior
									)
		]

	val Rule<HostInstance, DeploymentHost> hostInstance2DeploymentHost =
		new Rule(DEP.DeploymentHost.clazz)[HostInstance source, target |
	
			target._ip <=> source._nodeIp
	
			target._applications <=>	source._applications.collectTo(
											applicationInstance2DeploymentApplication
										)
		]

	def removeNavigationHelperContentAdapter(EObject eo) {
		val adapters = eo.eAdapters
		switch adapters.size {
			case 1: {
				// removing Viatra's NavigationHelperContentAdapter 
				adapters.remove(adapters.get(0))
			}
			case 0: {
				// nothing to do
			}
			default: {
				throw new IllegalStateException
			}
		}
	}

	/**
	 * Executes the simple batch transformation. The transformed model is placed in the traceability model set in the constructor 
	 */
	def void execute() {
		nbExecutes++

		// avoid rebinding on re-executions... should this be detected by AOF? 
		if(mapping.traces.empty) {

			removeNavigationHelperContentAdapter(mapping)
			removeNavigationHelperContentAdapter(mapping.deployment)

											// We do not use the hostInstances derived feature
											// to make sure we are notified of changes.
			mapping.deployment._hosts <=>	mapping.cps._hostTypes.instances.collectTo(
												hostInstance2DeploymentHost
											).asOrderedSet	// only for typing since we know that we have no duplicates
											// because hostTypes yields an OrderedSet and instances is a composition

			println("computing trace")

			// compute traces artificially (could be done before the main binding above)
			// doing it after is probably better for performance
			// because then the trace boxes do not need propagation on first run

			val t = new Thread[
				bindTraceFromTarget2
			]
			t.start
			t.join

			println('''Created «nbTargetElements» target elements & «mapping.traces.size» trace elements.''')
		}
	}

	def getUsedMemory() {
		Runtime.runtime.totalMemory - Runtime.runtime.freeMemory
	}

	def <A> A get(Object o, String fieldName) {
		val field = o.class.getDeclaredField(fieldName)
		field.accessible = true
		field.get(o) as A
	}

	// Rationale: we only keep traces for elements that are actually in the target model
	def bindTraceFromTarget() {
		val allDeploymentHosts =
			mapping.deployment._hosts
		val allDeploymentApplications =
			allDeploymentHosts.applications
		val allDeploymentBehaviors =
			allDeploymentApplications.behavior
		val allBehaviorStates =
			allDeploymentBehaviors.states
		val allBehaviorTransitions =
			allDeploymentBehaviors.transitions

		// all 1-1 links (with some having the same source)
		val allTraceLinks =
			// concat is equivalent to union here, but much less expensive
			concat(
				(allDeploymentHosts.collectedFrom(
					hostInstance2DeploymentHost
				).zip(allDeploymentHosts, true) as IBox<?>) as IBox<IPair<Identifiable, DeploymentElement>>
			,
				(allDeploymentApplications.collectedFrom(
					applicationInstance2DeploymentApplication
				).zip(allDeploymentApplications, true) as IBox<?>) as IBox<IPair<Identifiable, DeploymentElement>>
			,
				(allDeploymentBehaviors.collectedFrom(
					stateMachine2DeploymentBehavior
				).collect[value].zip(allDeploymentBehaviors, true) as IBox<?>) as IBox<IPair<Identifiable, DeploymentElement>>
			,
				(allBehaviorStates.collectedFrom(
					state2BehaviorState
				).collect[value].zip(allBehaviorStates, true) as IBox<?>) as IBox<IPair<Identifiable, DeploymentElement>>
			,
				(allBehaviorTransitions.collectedFrom(
					transition2BehaviorTransition
				).collect[value].zip(allBehaviorTransitions, true) as IBox<?>) as IBox<IPair<Identifiable, DeploymentElement>>
			).select[
				left !== null && right !== null
			]

		mapping._traces <=>	allTraceLinks.collect[
								it.left
							].asOrderedSet	// remove duplicates
							.collectTo(new Rule(Trace.CPS2DeploymentTrace.clazz)[Identifiable e, ret |

								ret.cpsElements.add(e)
								ret._deploymentElements <=>	allTraceLinks.select[
																left === e
															].collect[right].asOrderedSet
							])
	}

	// without flattening, only for flat trace links (no Y)
	def createTrace(IBox<? extends DeploymentElement> targetElements) {
		targetElements.select[it !== null].collectTo[target |
			val ret = Trace.CPS2DeploymentTrace.clazz.newInstance
			val source = reverseCache.get(target) as Identifiable
			ret.cpsElements.add(source)
			ret.deploymentElements.add(target)
			ret
		]
	}

	def createFlatTrace(IBox<? extends DeploymentElement> targetElements) {
		// building sourceTargetPairs reduces calls to cache.get, which is more expensive
		val sourceTargetPairs = targetElements.select[it !== null].collect[target |
			val source = (reverseCache.get(target) as Pair<?, Identifiable>).value
			source -> target
		]
		
		
		sourceTargetPairs.key
		.asOrderedSet	// necessary because there are several target elements for a given source element
		.collectTo[source |
			val ret = Trace.CPS2DeploymentTrace.clazz.newInstance
			ret.cpsElements.add(source)

			ret._deploymentElements <=>	sourceTargetPairs.select[
											it.key === source
										].value
										.asOrderedSet
										as IBox<DeploymentElement>

			ret
		]
	}

	def <E, I, G> groupByAs(IBox<E> source, IUnaryFunction<E, I> getGroupId, IUnaryFunction<I, G> groupCreator, IUnaryFunction<G, IBox<E>> getBox){
		new GroupByAs(source, getGroupId, groupCreator, getBox).result
	}

	def <E, I, G> groupBy(IBox<E> source, IUnaryFunction<E, I> getGroupId){
		new GroupByAs(source, getGroupId, [
			it -> AOFFactory.INSTANCE.<E>createSet
		], [
			it.value
		]).result
	}

	def <E, K> IBox<E> selectBy(IBox<E> source, IOne<K> key, IUnaryFunction<E, IOne<K>> collector) {
		new SelectBy(source, key, collector).result
	}

	def createFlatTraceWithGroupByAs(IBox<? extends DeploymentElement> targetElements) {
		new GroupByAs(targetElements, [
			(reverseCache.get(it) as Pair<?, Identifiable>).value
		],
		[
			val ret = Trace.CPS2DeploymentTrace.clazz.newInstance
			ret.cpsElements.add(it)
			ret
		],
		[
			it._deploymentElements
		]).result
	}

	def bindTraceFromTarget2() {
		val allDeploymentHosts =
			mapping.deployment._hosts
		val allDeploymentApplications =
			allDeploymentHosts.applications
		val allDeploymentBehaviors =
			allDeploymentApplications.behavior
		val allBehaviorStates =
			allDeploymentBehaviors.states
		val allBehaviorTransitions =
			allDeploymentBehaviors.transitions

		val allTraceLinks =
			// concat is equivalent to union here, but much less expensive
			concat(
				createTrace(allDeploymentHosts)
			,
				createTrace(allDeploymentApplications)
			,
				createFlatTraceWithGroupByAs(allDeploymentBehaviors)
			,
				createFlatTraceWithGroupByAs(allBehaviorStates)
			,
				createFlatTraceWithGroupByAs(allBehaviorTransitions)
			)
			.asAlreadyUniqueOrderedSet

		mapping._traces <=>	allTraceLinks
	}

	def <E> asAlreadyUniqueOrderedSet(IBox<E> source) {
		val result = AOFFactory.INSTANCE.createOrderedSet();
		new Copy(source, result)
		result
	}

	var nbExecutes = 0

	/**
	 * Cleans up the transformation
	 */
	def dispose() {
		traceBegin("dispose()")
		forwardCache = null
		reverseCache = null
		fcache = null
		eqOneCache = null
		println('''Number of executions: «nbExecutes»''')
		nbExecutes = 0
		traceEnd("dispose()")
	}
}
