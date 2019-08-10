package fr.eseo.atol.examples.cps.aof

import org.eclipse.viatra.examples.cps.deployment.DeploymentPackage
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.papyrus.aof.emf.EMFFactory

/*
 * The purpose of this class is to make Deployment models navigation in AOF
 * 	- simpler (using extension methods)
 * 	- statically type-checked (by the xtend compiler)
 * This whole file could be automatically generated from the Ecore model.
 */
class DEP {
	public static val factory = EMFFactory.INSTANCE
	public static val pack = DeploymentPackage.eINSTANCE
	public static val fact = pack.deploymentFactory

	interface DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.DeploymentElement>getMetaClass(pack.deploymentElement)
		val description = clazz.<String>getPropertyAccessor(pack.deploymentElement_Description)
	}

	static def _description(org.eclipse.viatra.examples.cps.deployment.DeploymentElement s) {
		DEP.DeploymentElement.description.apply(s)
	}

	interface Deployment extends DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.Deployment>getMetaClass(pack.deployment)
		val hosts = clazz.<org.eclipse.viatra.examples.cps.deployment.DeploymentHost>getPropertyAccessor(pack.deployment_Hosts)
	}

	static def _hosts(org.eclipse.viatra.examples.cps.deployment.Deployment s) {
		DEP.Deployment.hosts.apply(s)
	}

	interface DeploymentHost extends DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.DeploymentHost>getMetaClass(pack.deploymentHost)
		val ip = clazz.<String>getPropertyAccessor(pack.deploymentHost_Ip)
		val applications = clazz.<org.eclipse.viatra.examples.cps.deployment.DeploymentApplication>getPropertyAccessor(pack.deploymentHost_Applications)
	}

	static def _ip(org.eclipse.viatra.examples.cps.deployment.DeploymentHost s) {
		DEP.DeploymentHost.ip.apply(s)
	}

	static def ip(IBox<org.eclipse.viatra.examples.cps.deployment.DeploymentHost> s) {
		s.collectMutable(
			DEP.DeploymentHost.ip
		)
	}
	static def _applications(org.eclipse.viatra.examples.cps.deployment.DeploymentHost s) {
		DEP.DeploymentHost.applications.apply(s)
	}

	static def applications(IBox<org.eclipse.viatra.examples.cps.deployment.DeploymentHost> s) {
		s.collectMutable(
			DEP.DeploymentHost.applications
		)
	}

	interface DeploymentApplication extends DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.DeploymentApplication>getMetaClass(pack.deploymentApplication)
		val id = clazz.<String>getPropertyAccessor(pack.deploymentApplication_Id)
		val behavior = clazz.<org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior>getPropertyAccessor(pack.deploymentApplication_Behavior)
	}

	static def _behavior(org.eclipse.viatra.examples.cps.deployment.DeploymentApplication s) {
		DEP.DeploymentApplication.behavior.apply(s)
	}

	static def behavior(IBox<org.eclipse.viatra.examples.cps.deployment.DeploymentApplication> s) {
		s.collectMutable(
			DEP.DeploymentApplication.behavior
		)
	}

	static def _id(org.eclipse.viatra.examples.cps.deployment.DeploymentApplication s) {
		DEP.DeploymentApplication.id.apply(s)
	}

	interface DeploymentBehavior extends DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior>getMetaClass(pack.deploymentBehavior)
		val states = clazz.<org.eclipse.viatra.examples.cps.deployment.BehaviorState>getPropertyAccessor(pack.deploymentBehavior_States)
		val current = clazz.<org.eclipse.viatra.examples.cps.deployment.BehaviorState>getPropertyAccessor(pack.deploymentBehavior_Current)
		val transitions = clazz.<org.eclipse.viatra.examples.cps.deployment.BehaviorTransition>getPropertyAccessor(pack.deploymentBehavior_Transitions)
	}

	static def _states(org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior s) {
		DEP.DeploymentBehavior.states.apply(s)
	}

	static def states(IBox<org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior> s) {
		s.collectMutable(
			DEP.DeploymentBehavior.states
		)
	}

	static def _current(org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior s) {
		DEP.DeploymentBehavior.current.apply(s)
	}

	static def current(IBox<org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior> s) {
		s.collectMutable(
			DEP.DeploymentBehavior.current
		)
	}

	static def _transitions(org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior s) {
		DEP.DeploymentBehavior.transitions.apply(s)
	}

	static def transitions(IBox<org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior> s) {
		s.collectMutable(
			DEP.DeploymentBehavior.transitions
		)
	}

	interface BehaviorState extends DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.BehaviorState>getMetaClass(pack.behaviorState)
		val outgoing = clazz.<org.eclipse.viatra.examples.cps.deployment.BehaviorTransition>getPropertyAccessor(pack.behaviorState_Outgoing)
	}

	static def _outgoing(org.eclipse.viatra.examples.cps.deployment.BehaviorState s) {
		DEP.BehaviorState.outgoing.apply(s)
	}

	static def outgoing(IBox<org.eclipse.viatra.examples.cps.deployment.BehaviorState> s) {
		s.collectMutable(
			DEP.BehaviorState.outgoing
		)
	}

	interface BehaviorTransition extends DeploymentElement {
		val clazz = factory.<org.eclipse.viatra.examples.cps.deployment.BehaviorTransition>getMetaClass(pack.behaviorTransition)
		val to = clazz.<org.eclipse.viatra.examples.cps.deployment.BehaviorState>getPropertyAccessor(pack.behaviorTransition_To)
		val trigger = clazz.<org.eclipse.viatra.examples.cps.deployment.BehaviorTransition>getPropertyAccessor(pack.behaviorTransition_Trigger)
	}

	static def _to(org.eclipse.viatra.examples.cps.deployment.BehaviorTransition s) {
		DEP.BehaviorTransition.to.apply(s)
	}

	static def _trigger(org.eclipse.viatra.examples.cps.deployment.BehaviorTransition s) {
		DEP.BehaviorTransition.trigger.apply(s)
	}
}
