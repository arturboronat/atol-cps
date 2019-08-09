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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorTransition()
 * @model kind="class"
 * @generated
 */
public class BehaviorTransition extends MinimalEObjectImpl.Container implements DeploymentElement {
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
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected BehaviorState to;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTransition> trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTransition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.BEHAVIOR_TRANSITION;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getDescription <em>Description</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.BEHAVIOR_TRANSITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(BehaviorState)
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorTransition_To()
	 * @model
	 * @generated
	 */
	public BehaviorState getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = to;
			to = (BehaviorState)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.BEHAVIOR_TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorState basicGetTo() {
		return to;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	public void setTo(BehaviorState newTo) {
		BehaviorState oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.BEHAVIOR_TRANSITION__TO, oldTo, to));
	}

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorTransition_Trigger()
	 * @model
	 * @generated
	 */
	public EList<BehaviorTransition> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectResolvingEList<BehaviorTransition>(BehaviorTransition.class, this, DeploymentPackage.BEHAVIOR_TRANSITION__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.BEHAVIOR_TRANSITION__DESCRIPTION:
				return getDescription();
			case DeploymentPackage.BEHAVIOR_TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case DeploymentPackage.BEHAVIOR_TRANSITION__TRIGGER:
				return getTrigger();
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
			case DeploymentPackage.BEHAVIOR_TRANSITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DeploymentPackage.BEHAVIOR_TRANSITION__TO:
				setTo((BehaviorState)newValue);
				return;
			case DeploymentPackage.BEHAVIOR_TRANSITION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends BehaviorTransition>)newValue);
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
			case DeploymentPackage.BEHAVIOR_TRANSITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DeploymentPackage.BEHAVIOR_TRANSITION__TO:
				setTo((BehaviorState)null);
				return;
			case DeploymentPackage.BEHAVIOR_TRANSITION__TRIGGER:
				getTrigger().clear();
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
			case DeploymentPackage.BEHAVIOR_TRANSITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DeploymentPackage.BEHAVIOR_TRANSITION__TO:
				return to != null;
			case DeploymentPackage.BEHAVIOR_TRANSITION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
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

} // BehaviorTransition
