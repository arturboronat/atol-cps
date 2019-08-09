package fr.eseo.atol.examples.cps.atl

import fr.eseo.aof.extensions.AOFExtensions
import fr.eseo.atol.gen.ATOLGen
import fr.eseo.atol.gen.ATOLGen.Metamodel
import java.util.HashMap
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.viatra.examples.cps.CPS.Identifiable
import org.eclipse.viatra.examples.cps.CPS.Transition
import org.eclipse.viatra.examples.cps.deployment.BehaviorState
import org.eclipse.viatra.examples.cps.deployment.BehaviorTransition
import org.eclipse.viatra.examples.cps.deployment.DeploymentApplication
import org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior
import org.eclipse.viatra.examples.cps.deployment.DeploymentElement
import org.eclipse.viatra.examples.cps.deployment.DeploymentHost

@ATOLGen(transformation="src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl", metamodels=#[
	@Metamodel(name="CPS", impl=CPS),
	@Metamodel(name="Deployment", impl=Deployment),
	@Metamodel(name="Trace", impl=Trace)
])
class CPS2DeploymentExplicitRuleCall implements AOFExtensions {
	public val reverseTrace = new HashMap<DeploymentElement, Identifiable>

	def trace(org.eclipse.viatra.examples.cps.deployment.Deployment dep) {
		val allContents = dep.allContents(null)
		(
			allContents.select(DeploymentHost).createTrace
		).concat(
			allContents.select(DeploymentApplication).createTrace
		).concat(
			allContents.select(DeploymentBehavior).createFlatTrace
		).concat(
			allContents.select(BehaviorState).createFlatTrace
		).concat(
			allContents.select(BehaviorTransition).createFlatTrace
		)
	}

	def createTrace(IBox<? extends DeploymentElement> targetElements) {
		targetElements.collectTo[target |
			val ret = Trace.CPS2DeploymentTrace.newInstance
			val source = reverseTrace.get(target) as Identifiable
			ret.cpsElements.add(source)
			ret.deploymentElements.add(target)
			ret
		]
	}

	def createFlatTrace(IBox<? extends DeploymentElement> targetElements) {
		new GroupByAs(targetElements, [
			reverseTrace.get(it)
		],
		[
			val ret = Trace.CPS2DeploymentTrace.newInstance
			ret.cpsElements.add(it)
			ret
		],
		[
			TraceMM._deploymentElements(it)
		]).result
	}

	val nullPair = null -> null

	val sendPartsCache = new HashMap<Transition, IBox<Pair<String, String>>>
	def _sendParts(Transition t) {
		sendPartsCache.computeIfAbsent(t)[it |
			CPSMM._action(it).collect[
				if(it !== null && SignalUtil.isSend(it)) {
					SignalUtil.getAppId(it) -> SignalUtil.getSignalId(it)
				} else {
					nullPair as Pair<?, ?> as Pair<String, String>
				}
			]
		]
	}

	val waitPartsCache = new HashMap<Transition, IBox<String>>
	def _waitParts(Transition t) {
		waitPartsCache.computeIfAbsent(t)[it |
			CPSMM._action(it).collect[e |
				if(e !== null && SignalUtil.isWait(e)) {
					SignalUtil.getSignalId(e)
				} else {
					null
				}
			].asOne(null)
		]
	}

	val keyCache = new HashMap
	def <K, V> IBox<K> key(IBox<Pair<K, V>> it) {
		keyCache.get(it) as IBox<K> ?: {
			val ret = collect[key]
			keyCache.put(it, ret)
			ret
		}
	}

	val valueCache = new HashMap
	def <K, V> IBox<V> value(IBox<Pair<K, V>> it) {
		valueCache.get(it) as IBox<V> ?: {
			val ret = collect[value]
			valueCache.put(it, ret)
			ret
		}
	}
}
