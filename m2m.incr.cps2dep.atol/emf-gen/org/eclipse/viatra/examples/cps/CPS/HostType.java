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
package org.eclipse.viatra.examples.cps.CPS;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing common properties of a set of hosts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultCpu <em>Default Cpu</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultRam <em>Default Ram</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultHdd <em>Default Hdd</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostType#getCps <em>Cps</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostType#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType()
 * @model kind="class"
 * @generated
 */
public class HostType extends MinimalEObjectImpl.Container implements Identifiable {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCpu() <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultCpu() <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCpu()
	 * @generated
	 * @ordered
	 */
	protected int defaultCpu = DEFAULT_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultRam() <em>Default Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRam()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultRam() <em>Default Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRam()
	 * @generated
	 * @ordered
	 */
	protected int defaultRam = DEFAULT_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected int defaultHdd = DEFAULT_HDD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.HOST_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier is used as both a user-facing name and an identifier for serialization. Must be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getIdentifiable_Identifier()
	 * @model id="true"
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Default Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a host instance does not set the total CPU attribute, this default value should be used instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Cpu</em>' attribute.
	 * @see #setDefaultCpu(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType_DefaultCpu()
	 * @model
	 * @generated
	 */
	public int getDefaultCpu() {
		return defaultCpu;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultCpu <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cpu</em>' attribute.
	 * @see #getDefaultCpu()
	 * @generated
	 */
	public void setDefaultCpu(int newDefaultCpu) {
		int oldDefaultCpu = defaultCpu;
		defaultCpu = newDefaultCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_TYPE__DEFAULT_CPU, oldDefaultCpu, defaultCpu));
	}

	/**
	 * Returns the value of the '<em><b>Default Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a host instance does not set the total RAM attribute, this default value should be used instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Ram</em>' attribute.
	 * @see #setDefaultRam(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType_DefaultRam()
	 * @model
	 * @generated
	 */
	public int getDefaultRam() {
		return defaultRam;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultRam <em>Default Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ram</em>' attribute.
	 * @see #getDefaultRam()
	 * @generated
	 */
	public void setDefaultRam(int newDefaultRam) {
		int oldDefaultRam = defaultRam;
		defaultRam = newDefaultRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_TYPE__DEFAULT_RAM, oldDefaultRam, defaultRam));
	}

	/**
	 * Returns the value of the '<em><b>Default Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a host instance does not set the total HDD attribute, this default value should be used instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Hdd</em>' attribute.
	 * @see #setDefaultHdd(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType_DefaultHdd()
	 * @model
	 * @generated
	 */
	public int getDefaultHdd() {
		return defaultHdd;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultHdd <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Hdd</em>' attribute.
	 * @see #getDefaultHdd()
	 * @generated
	 */
	public void setDefaultHdd(int newDefaultHdd) {
		int oldDefaultHdd = defaultHdd;
		defaultHdd = newDefaultHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_TYPE__DEFAULT_HDD, oldDefaultHdd, defaultHdd));
	}

	/**
	 * Returns the value of the '<em><b>Cps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the container model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cps</em>' container reference.
	 * @see #setCps(CyberPhysicalSystem)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType_Cps()
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getHostTypes
	 * @model opposite="hostTypes" required="true" transient="false"
	 * @generated
	 */
	public CyberPhysicalSystem getCps() {
		if (eContainerFeatureID() != CPSPackage.HOST_TYPE__CPS) return null;
		return (CyberPhysicalSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem basicGetCps() {
		if (eContainerFeatureID() != CPSPackage.HOST_TYPE__CPS) return null;
		return (CyberPhysicalSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCps(CyberPhysicalSystem newCps, NotificationChain msgs) {
		msgs = eBasicSetContainer(newCps, CPSPackage.HOST_TYPE__CPS, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getCps <em>Cps</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' container reference.
	 * @see #getCps()
	 * @generated
	 */
	public void setCps(CyberPhysicalSystem newCps) {
		if (newCps != eInternalContainer() || (eContainerFeatureID() != CPSPackage.HOST_TYPE__CPS && newCps != null)) {
			if (EcoreUtil.isAncestor(this, newCps))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCps != null)
				msgs = newCps.eInverseAdd(this, CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES, CyberPhysicalSystem.class, msgs);
			msgs = basicSetCps(newCps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_TYPE__CPS, newCps, newCps));
	}

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.HostInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list to the instances of the selected host type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType_Instances()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<HostInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList.Resolving<HostInstance>(HostInstance.class, this, CPSPackage.HOST_TYPE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSPackage.HOST_TYPE__CPS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCps((CyberPhysicalSystem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSPackage.HOST_TYPE__CPS:
				return basicSetCps(null, msgs);
			case CPSPackage.HOST_TYPE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CPSPackage.HOST_TYPE__CPS:
				return eInternalContainer().eInverseRemove(this, CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES, CyberPhysicalSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPSPackage.HOST_TYPE__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.HOST_TYPE__DEFAULT_CPU:
				return getDefaultCpu();
			case CPSPackage.HOST_TYPE__DEFAULT_RAM:
				return getDefaultRam();
			case CPSPackage.HOST_TYPE__DEFAULT_HDD:
				return getDefaultHdd();
			case CPSPackage.HOST_TYPE__CPS:
				if (resolve) return getCps();
				return basicGetCps();
			case CPSPackage.HOST_TYPE__INSTANCES:
				return getInstances();
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
			case CPSPackage.HOST_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.HOST_TYPE__DEFAULT_CPU:
				setDefaultCpu((Integer)newValue);
				return;
			case CPSPackage.HOST_TYPE__DEFAULT_RAM:
				setDefaultRam((Integer)newValue);
				return;
			case CPSPackage.HOST_TYPE__DEFAULT_HDD:
				setDefaultHdd((Integer)newValue);
				return;
			case CPSPackage.HOST_TYPE__CPS:
				setCps((CyberPhysicalSystem)newValue);
				return;
			case CPSPackage.HOST_TYPE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends HostInstance>)newValue);
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
			case CPSPackage.HOST_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.HOST_TYPE__DEFAULT_CPU:
				setDefaultCpu(DEFAULT_CPU_EDEFAULT);
				return;
			case CPSPackage.HOST_TYPE__DEFAULT_RAM:
				setDefaultRam(DEFAULT_RAM_EDEFAULT);
				return;
			case CPSPackage.HOST_TYPE__DEFAULT_HDD:
				setDefaultHdd(DEFAULT_HDD_EDEFAULT);
				return;
			case CPSPackage.HOST_TYPE__CPS:
				setCps((CyberPhysicalSystem)null);
				return;
			case CPSPackage.HOST_TYPE__INSTANCES:
				getInstances().clear();
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
			case CPSPackage.HOST_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.HOST_TYPE__DEFAULT_CPU:
				return defaultCpu != DEFAULT_CPU_EDEFAULT;
			case CPSPackage.HOST_TYPE__DEFAULT_RAM:
				return defaultRam != DEFAULT_RAM_EDEFAULT;
			case CPSPackage.HOST_TYPE__DEFAULT_HDD:
				return defaultHdd != DEFAULT_HDD_EDEFAULT;
			case CPSPackage.HOST_TYPE__CPS:
				return basicGetCps() != null;
			case CPSPackage.HOST_TYPE__INSTANCES:
				return instances != null && !instances.isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", defaultCpu: ");
		result.append(defaultCpu);
		result.append(", defaultRam: ");
		result.append(defaultRam);
		result.append(", defaultHdd: ");
		result.append(defaultHdd);
		result.append(')');
		return result.toString();
	}

} // HostType
