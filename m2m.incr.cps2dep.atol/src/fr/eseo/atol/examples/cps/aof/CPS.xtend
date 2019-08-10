package fr.eseo.atol.examples.cps.aof

import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystemPackage
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.papyrus.aof.emf.EMFFactory

/*
 * The purpose of this class is to make CyberPhysicalSystem models navigation in AOF
 * 	- simpler (using extension methods)
 * 	- statically type-checked (by the xtend compiler)
 * This whole file could be automatically generated from the Ecore model.
 */
class CPS {
	public static val factory = EMFFactory.INSTANCE
	public static val cpsPackage = CyberPhysicalSystemPackage.eINSTANCE

	interface Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Identifiable>getMetaClass(cpsPackage.identifiable)
		val identifier = clazz.<String>getPropertyAccessor(cpsPackage.identifiable_Identifier)
	}

	static def _identifier(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Identifiable s) {
		CPS.Identifiable.identifier.apply(s)
	}

	static def identifier(IBox<? extends org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Identifiable> s) {
		s.collectMutable(
			CPS.Identifiable.identifier
		)
	}

	interface CyberPhysicalSystem extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem>getMetaClass(cpsPackage.cyberPhysicalSystem)
		val hostTypes = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostType>getPropertyAccessor(cpsPackage.cyberPhysicalSystem_HostTypes)
		val appTypes = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationType>getPropertyAccessor(cpsPackage.cyberPhysicalSystem_AppTypes)
	}

	static def _hostTypes(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem s) {
		CPS.CyberPhysicalSystem.hostTypes.apply(s)
	}

	static def hostTypes(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem> s) {
		s.collectMutable(
			CPS.CyberPhysicalSystem.hostTypes
		)
	}

	static def _appTypes(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem s) {
		CPS.CyberPhysicalSystem.appTypes.apply(s)
	}

	static def appTypes(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem> s) {
		s.collectMutable(
			CPS.CyberPhysicalSystem.appTypes
		)
	}

	static class HostType implements CPS.Identifiable {
		public static val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostType>getMetaClass(cpsPackage.hostType)
		public static val instances = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance>getPropertyAccessor(cpsPackage.hostType_Instances)

		static def instances(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostType> s) {
			s.collectMutable(
				CPS.HostType.instances
			)
		}
	}

	interface HostInstance extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance>getMetaClass(cpsPackage.hostInstance)
		val nodeIp = clazz.<String>getPropertyAccessor(cpsPackage.hostInstance_NodeIp)
		val applications = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance>getPropertyAccessor(cpsPackage.hostInstance_Applications)
		val communicateWith = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance>getPropertyAccessor(cpsPackage.hostInstance_CommunicateWith)
	}

	static def _nodeIp(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance s) {
		CPS.HostInstance.nodeIp.apply(s)
	}

	static def nodeIp(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance> s) {
		s.collectMutable(
			CPS.HostInstance.nodeIp
		)
	}

	static def _applications(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance s) {
		CPS.HostInstance.applications.apply(s)
	}

	static def applications(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance> s) {
		s.collectMutable(
			CPS.HostInstance.applications
		)
	}

	static def _communicateWith(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance s) {
		CPS.HostInstance.communicateWith.apply(s)
	}

	static def communicateWith(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance> s) {
		s.collectMutable(
			CPS.HostInstance.communicateWith
		)
	}

	interface ApplicationInstance extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance>getMetaClass(cpsPackage.applicationInstance)
		val type = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationType>getPropertyAccessor(cpsPackage.applicationInstance_Type)
		val allocatedTo = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance>getPropertyAccessor(cpsPackage.applicationInstance_AllocatedTo)
	}

	static def _type(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance s) {
		CPS.ApplicationInstance.type.apply(s)
	}

	static def type(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance> s) {
		s.collectMutable(
			CPS.ApplicationInstance.type
		)
	}

	static def _allocatedTo(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance s) {
		CPS.ApplicationInstance.allocatedTo.apply(s)
	}

	interface ApplicationType extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationType>getMetaClass(cpsPackage.applicationType)
		val behavior = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine>getPropertyAccessor(cpsPackage.applicationType_Behavior)
		val instances = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance>getPropertyAccessor(cpsPackage.applicationType_Instances)
	}

	static def behavior(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationType> s) {
		s.collectMutable(
			CPS.ApplicationType.behavior
		)
	}

	static def instances(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationType> s) {
		s.collectMutable(
			CPS.ApplicationType.instances
		)
	}

	interface StateMachine extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine>getMetaClass(cpsPackage.stateMachine)
		val states = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State>getPropertyAccessor(cpsPackage.stateMachine_States)
		val initial = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State>getPropertyAccessor(cpsPackage.stateMachine_Initial)
	}

	static def _states(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine s) {
		CPS.StateMachine.states.apply(s)
	}

	static def states(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine> s) {
		s.collectMutable(
			CPS.StateMachine.states
		)
	}

	static def _initial(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine s) {
		CPS.StateMachine.initial.apply(s)
	}

	static def initial(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine> s) {
		s.collectMutable(
			CPS.StateMachine.initial
		)
	}

	interface State extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State>getMetaClass(cpsPackage.state)
		val outgoingTransitions = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Transition>getPropertyAccessor(cpsPackage.state_OutgoingTransitions)
	}

	static def _outgoingTransitions(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State s) {
		CPS.State.outgoingTransitions.apply(s)
	}

	static def outgoingTransitions(IBox<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State> s) {
		s.collectMutable(
			CPS.State.outgoingTransitions
		)
	}

	interface Transition extends CPS.Identifiable {
		val clazz = factory.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Transition>getMetaClass(cpsPackage.transition)
		val action = clazz.<String>getPropertyAccessor(cpsPackage.transition_Action)
		val targetState = clazz.<org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State>getPropertyAccessor(cpsPackage.transition_TargetState)
	}

	static def _action(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Transition s) {
		CPS.Transition.action.apply(s)
	}

	static def _targetState(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Transition s) {
		CPS.Transition.targetState.apply(s)
	}
}
