/**
 * Copyright (c) 2014-2016 IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Akos Horvath, Abel Hegedus, Tamas Borbas, Zoltan Ujhelyi, Istvan David - initial API and implementation
 */
package org.eclipse.viatra.examples.cps.deployment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentBehavior()
 * @model kind="class"
 * @generated
 */
public class DeploymentBehavior extends MinimalEObjectImpl.Container implements DeploymentElement {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorState> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTransition> transitions;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected BehaviorState current;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentBehavior() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYMENT_BEHAVIOR;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentElement_Description()
	 * @model
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT_BEHAVIOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.deployment.BehaviorState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentBehavior_States()
	 * @model containment="true"
	 * @generated
	 */
	public EList<BehaviorState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<BehaviorState>(BehaviorState.class, this, DeploymentPackage.DEPLOYMENT_BEHAVIOR__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentBehavior_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	public EList<BehaviorTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<BehaviorTransition>(BehaviorTransition.class, this, DeploymentPackage.DEPLOYMENT_BEHAVIOR__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial state of the state machine will be the first current behavior state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(BehaviorState)
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentBehavior_Current()
	 * @model
	 * @generated
	 */
	public BehaviorState getCurrent() {
		if (current != null && current.eIsProxy()) {
			InternalEObject oldCurrent = current;
			current = (BehaviorState)eResolveProxy(oldCurrent);
			if (current != oldCurrent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.DEPLOYMENT_BEHAVIOR__CURRENT, oldCurrent, current));
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorState basicGetCurrent() {
		return current;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	public void setCurrent(BehaviorState newCurrent) {
		BehaviorState oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT_BEHAVIOR__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__DESCRIPTION:
				return getDescription();
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__STATES:
				return getStates();
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__TRANSITIONS:
				return getTransitions();
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__CURRENT:
				if (resolve) return getCurrent();
				return basicGetCurrent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends BehaviorState>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends BehaviorTransition>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__CURRENT:
				setCurrent((BehaviorState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__STATES:
				getStates().clear();
				return;
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__TRANSITIONS:
				getTransitions().clear();
				return;
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__CURRENT:
				setCurrent((BehaviorState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__STATES:
				return states != null && !states.isEmpty();
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR__CURRENT:
				return current != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // DeploymentBehavior
