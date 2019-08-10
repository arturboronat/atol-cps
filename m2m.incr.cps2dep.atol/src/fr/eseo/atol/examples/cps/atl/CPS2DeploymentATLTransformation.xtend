package fr.eseo.atol.examples.cps.atl

import org.apache.log4j.Logger
import org.eclipse.papyrus.aof.core.AOFFactory
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.papyrus.aof.core.impl.operation.Copy
//import org.eclipse.viatra.examples.cps.traces.CPSToDeployment
import org.eclipse.viatra.examples.cps.traceability.CPSToDeployment

import static com.google.common.base.Preconditions.*

class CPS2DeploymentATLTransformation {

	extension Logger logger = Logger.getLogger("cps.xform.m2m.atol")

	// DO NOT USE '''xtend literals''' because otherwise the generated .class file
	// will rely on StringConcatenation.append(String), which did not exist in older xtend
	// versions, which will make the .class file not usable from an older version.
	private def traceBegin(String method) {
		trace("Executing " + method + " BEGIN")
	}

	private def traceEnd(String method) {
		trace("Executing " + method + " END")
	}

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

	boolean firstRun = true;
	/**
	 * Executes the simple batch transformation. The transformed model is placed in the traceability model set in the constructor 
	 */
	def void execute() {
		if(firstRun) {
			println("RUNNING")
			firstRun = false

			// Register default instances required by AOF
			try {
				CPS.Identifiable.defaultInstance = CPS.HostInstance.defaultInstance
			} catch(IllegalStateException e) {
				// ignore already set default instance
			}

			val transfo = new CPS2DeploymentExplicitRuleCall
			transfo.HostInstance2DeploymentHost.registerCustomTrace = [
				transfo.reverseTrace.put($1.t, $0.s)
			]
			transfo.ApplicationInstance2DeploymentApplication.registerCustomTrace = [
				transfo.reverseTrace.put($1.t, $0.s)
			]
			transfo.ApplicationInstanceAndStateMachine2DeploymentBehavior.registerCustomTrace = [
				transfo.reverseTrace.put($1.t, $0.sm)
			]
			transfo.ApplicationInstanceAndState2BehaviorState.registerCustomTrace = [
				transfo.reverseTrace.put($1.t, $0.s)
			]
			transfo.ApplicationInstanceAndTransition2BehaviorTransition.registerCustomTrace = [
				transfo.reverseTrace.put($1.t, $0.s)
			]

			// Running transfo
			transfo.CyberPhysicalSystem2Deployment.bind(
				mapping.cps,
				mapping.deployment
			)

			// Adding trace
			transfo.TraceMM._traces(mapping).bind(transfo.trace(mapping.deployment).asAlreadyUniqueOrderedSet)
		}
	}

	def <E> asAlreadyUniqueOrderedSet(IBox<E> source) {
		val result = AOFFactory.INSTANCE.createOrderedSet();
		new Copy(source, result)
		result
	}

	/**
	 * Cleans up the transformation
	 */
	def dispose() {
		traceBegin("dispose()")
		traceEnd("dispose()")
	}
}
