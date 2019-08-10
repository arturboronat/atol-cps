package fr.eseo.atol.examples.cps.aof

import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Identifiable
import org.eclipse.viatra.examples.cps.deployment.DeploymentElement
import org.eclipse.viatra.examples.cps.traceability.TraceabilityPackage
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.papyrus.aof.emf.EMFFactory

/*
 * The purpose of this class is to make Traceability models navigation in AOF
 * 	- simpler (using extension methods)
 * 	- statically type-checked (by the xtend compiler)
 * This whole file could be automatically generated from the Ecore model.
 */
class Trace {
	public static val factory = EMFFactory.INSTANCE
	public static val pack = TraceabilityPackage.eINSTANCE
	public static val fact = pack.traceabilityFactory

	interface CPSToDeployment {
		val clazz = factory.<org.eclipse.viatra.examples.cps.traceability.CPSToDeployment>getMetaClass(pack.CPSToDeployment)
		val traces = clazz.<org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace>getPropertyAccessor(pack.CPSToDeployment_Traces)
	}

	static def _traces(org.eclipse.viatra.examples.cps.traceability.CPSToDeployment s) {
		Trace.CPSToDeployment.traces.apply(s)
	}

	static def traces(IBox<org.eclipse.viatra.examples.cps.traceability.CPSToDeployment> s) {
		s.collectMutable(
			Trace.CPSToDeployment.traces
		)
	}

	interface CPS2DeploymentTrace {
		val clazz = factory.<org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace>getMetaClass(pack.CPS2DeploymentTrace)
		val cpsElements = clazz.<Identifiable>getPropertyAccessor(pack.CPS2DeploymentTrace_CpsElements)
		val deploymentElements = clazz.<DeploymentElement>getPropertyAccessor(pack.CPS2DeploymentTrace_DeploymentElements)
	}

	static def _cpsElements(org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace s) {
		Trace.CPS2DeploymentTrace.cpsElements.apply(s)
	}

	static def cpsElements(IBox<org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace> s) {
		s.collectMutable(
			Trace.CPS2DeploymentTrace.cpsElements
		)
	}

	static def _deploymentElements(org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace s) {
		Trace.CPS2DeploymentTrace.deploymentElements.apply(s)
	}

	static def deploymentElements(IBox<org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace> s) {
		s.collectMutable(
			Trace.CPS2DeploymentTrace.deploymentElements
		)
	}
}