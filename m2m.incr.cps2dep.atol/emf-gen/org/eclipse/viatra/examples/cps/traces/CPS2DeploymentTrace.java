/**
 * Copyright (c) 2014-2016 IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Akos Horvath, Abel Hegedus, Tamas Borbas, Zoltan Ujhelyi - initial API and implementation
 */
package org.eclipse.viatra.examples.cps.traces;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.examples.cps.CPS.Identifiable;

import org.eclipse.viatra.examples.cps.deployment.DeploymentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPS2 Deployment Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace#getCpsElements <em>Cps Elements</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace#getDeploymentElements <em>Deployment Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPS2DeploymentTrace()
 * @model kind="class"
 * @generated
 */
public class CPS2DeploymentTrace extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getCpsElements() <em>Cps Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpsElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> cpsElements;

	/**
	 * The cached value of the '{@link #getDeploymentElements() <em>Deployment Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentElement> deploymentElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPS2DeploymentTrace() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.CPS2_DEPLOYMENT_TRACE;
	}

	/**
	 * Returns the value of the '<em><b>Cps Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps Elements</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPS2DeploymentTrace_CpsElements()
	 * @model
	 * @generated
	 */
	public EList<Identifiable> getCpsElements() {
		if (cpsElements == null) {
			cpsElements = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, TracesPackage.CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS);
		}
		return cpsElements;
	}

	/**
	 * Returns the value of the '<em><b>Deployment Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.deployment.DeploymentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Elements</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPS2DeploymentTrace_DeploymentElements()
	 * @model
	 * @generated
	 */
	public EList<DeploymentElement> getDeploymentElements() {
		if (deploymentElements == null) {
			deploymentElements = new EObjectResolvingEList<DeploymentElement>(DeploymentElement.class, this, TracesPackage.CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS);
		}
		return deploymentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS:
				return getCpsElements();
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS:
				return getDeploymentElements();
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
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS:
				getCpsElements().clear();
				getCpsElements().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS:
				getDeploymentElements().clear();
				getDeploymentElements().addAll((Collection<? extends DeploymentElement>)newValue);
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
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS:
				getCpsElements().clear();
				return;
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS:
				getDeploymentElements().clear();
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
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS:
				return cpsElements != null && !cpsElements.isEmpty();
			case TracesPackage.CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS:
				return deploymentElements != null && !deploymentElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CPS2DeploymentTrace
