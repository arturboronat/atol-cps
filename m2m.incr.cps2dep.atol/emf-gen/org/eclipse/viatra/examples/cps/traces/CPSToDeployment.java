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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem;

import org.eclipse.viatra.examples.cps.deployment.Deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPS To Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getCps <em>Cps</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPSToDeployment()
 * @model kind="class"
 * @generated
 */
public class CPSToDeployment extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getCps() <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCps()
	 * @generated
	 * @ordered
	 */
	protected CyberPhysicalSystem cps;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<CPS2DeploymentTrace> traces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSToDeployment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.CPS_TO_DEPLOYMENT;
	}

	/**
	 * Returns the value of the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps</em>' reference.
	 * @see #setCps(CyberPhysicalSystem)
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPSToDeployment_Cps()
	 * @model
	 * @generated
	 */
	public CyberPhysicalSystem getCps() {
		if (cps != null && cps.eIsProxy()) {
			InternalEObject oldCps = cps;
			cps = (CyberPhysicalSystem)eResolveProxy(oldCps);
			if (cps != oldCps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracesPackage.CPS_TO_DEPLOYMENT__CPS, oldCps, cps));
			}
		}
		return cps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem basicGetCps() {
		return cps;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getCps <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' reference.
	 * @see #getCps()
	 * @generated
	 */
	public void setCps(CyberPhysicalSystem newCps) {
		CyberPhysicalSystem oldCps = cps;
		cps = newCps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.CPS_TO_DEPLOYMENT__CPS, oldCps, cps));
	}

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see #setDeployment(Deployment)
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPSToDeployment_Deployment()
	 * @model
	 * @generated
	 */
	public Deployment getDeployment() {
		if (deployment != null && deployment.eIsProxy()) {
			InternalEObject oldDeployment = deployment;
			deployment = (Deployment)eResolveProxy(oldDeployment);
			if (deployment != oldDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracesPackage.CPS_TO_DEPLOYMENT__DEPLOYMENT, oldDeployment, deployment));
			}
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployment() {
		return deployment;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getDeployment <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' reference.
	 * @see #getDeployment()
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.CPS_TO_DEPLOYMENT__DEPLOYMENT, oldDeployment, deployment));
	}

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPSToDeployment_Traces()
	 * @model containment="true"
	 * @generated
	 */
	public EList<CPS2DeploymentTrace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<CPS2DeploymentTrace>(CPS2DeploymentTrace.class, this, TracesPackage.CPS_TO_DEPLOYMENT__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.CPS_TO_DEPLOYMENT__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case TracesPackage.CPS_TO_DEPLOYMENT__CPS:
				if (resolve) return getCps();
				return basicGetCps();
			case TracesPackage.CPS_TO_DEPLOYMENT__DEPLOYMENT:
				if (resolve) return getDeployment();
				return basicGetDeployment();
			case TracesPackage.CPS_TO_DEPLOYMENT__TRACES:
				return getTraces();
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
			case TracesPackage.CPS_TO_DEPLOYMENT__CPS:
				setCps((CyberPhysicalSystem)newValue);
				return;
			case TracesPackage.CPS_TO_DEPLOYMENT__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
			case TracesPackage.CPS_TO_DEPLOYMENT__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends CPS2DeploymentTrace>)newValue);
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
			case TracesPackage.CPS_TO_DEPLOYMENT__CPS:
				setCps((CyberPhysicalSystem)null);
				return;
			case TracesPackage.CPS_TO_DEPLOYMENT__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
			case TracesPackage.CPS_TO_DEPLOYMENT__TRACES:
				getTraces().clear();
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
			case TracesPackage.CPS_TO_DEPLOYMENT__CPS:
				return cps != null;
			case TracesPackage.CPS_TO_DEPLOYMENT__DEPLOYMENT:
				return deployment != null;
			case TracesPackage.CPS_TO_DEPLOYMENT__TRACES:
				return traces != null && !traces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CPSToDeployment
