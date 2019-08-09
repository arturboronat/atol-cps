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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the requirements of a given application type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredCpu <em>Required Cpu</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredRam <em>Required Ram</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement()
 * @model kind="class"
 * @generated
 */
public class ResourceRequirement extends MinimalEObjectImpl.Container implements Identifiable {
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
	 * The default value of the '{@link #getRequiredCpu() <em>Required Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredCpu() <em>Required Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCpu()
	 * @generated
	 * @ordered
	 */
	protected int requiredCpu = REQUIRED_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredRam() <em>Required Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRam()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredRam() <em>Required Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRam()
	 * @generated
	 * @ordered
	 */
	protected int requiredRam = REQUIRED_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredHdd() <em>Required Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredHdd() <em>Required Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHdd()
	 * @generated
	 * @ordered
	 */
	protected int requiredHdd = REQUIRED_HDD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected HostType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequirement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.RESOURCE_REQUIREMENT;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getIdentifier <em>Identifier</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.RESOURCE_REQUIREMENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Required Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field stores the number of CPUs required in a non-negative number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Cpu</em>' attribute.
	 * @see #setRequiredCpu(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement_RequiredCpu()
	 * @model
	 * @generated
	 */
	public int getRequiredCpu() {
		return requiredCpu;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredCpu <em>Required Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Cpu</em>' attribute.
	 * @see #getRequiredCpu()
	 * @generated
	 */
	public void setRequiredCpu(int newRequiredCpu) {
		int oldRequiredCpu = requiredCpu;
		requiredCpu = newRequiredCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU, oldRequiredCpu, requiredCpu));
	}

	/**
	 * Returns the value of the '<em><b>Required Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field stores the amount of RAM required in MB as a non-negative number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Ram</em>' attribute.
	 * @see #setRequiredRam(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement_RequiredRam()
	 * @model
	 * @generated
	 */
	public int getRequiredRam() {
		return requiredRam;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredRam <em>Required Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Ram</em>' attribute.
	 * @see #getRequiredRam()
	 * @generated
	 */
	public void setRequiredRam(int newRequiredRam) {
		int oldRequiredRam = requiredRam;
		requiredRam = newRequiredRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_RAM, oldRequiredRam, requiredRam));
	}

	/**
	 * Returns the value of the '<em><b>Required Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field stores the amount of persistent storage required in MB as a non-negative number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Hdd</em>' attribute.
	 * @see #setRequiredHdd(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement_RequiredHdd()
	 * @model
	 * @generated
	 */
	public int getRequiredHdd() {
		return requiredHdd;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Hdd</em>' attribute.
	 * @see #getRequiredHdd()
	 * @generated
	 */
	public void setRequiredHdd(int newRequiredHdd) {
		int oldRequiredHdd = requiredHdd;
		requiredHdd = newRequiredHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD, oldRequiredHdd, requiredHdd));
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field represents the required host type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(HostType)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement_Type()
	 * @model required="true"
	 * @generated
	 */
	public HostType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = type;
			type = (HostType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSPackage.RESOURCE_REQUIREMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType basicGetType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	public void setType(HostType newType) {
		HostType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.RESOURCE_REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPSPackage.RESOURCE_REQUIREMENT__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				return getRequiredCpu();
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_RAM:
				return getRequiredRam();
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				return getRequiredHdd();
			case CPSPackage.RESOURCE_REQUIREMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CPSPackage.RESOURCE_REQUIREMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				setRequiredCpu((Integer)newValue);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_RAM:
				setRequiredRam((Integer)newValue);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				setRequiredHdd((Integer)newValue);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__TYPE:
				setType((HostType)newValue);
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
			case CPSPackage.RESOURCE_REQUIREMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				setRequiredCpu(REQUIRED_CPU_EDEFAULT);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_RAM:
				setRequiredRam(REQUIRED_RAM_EDEFAULT);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				setRequiredHdd(REQUIRED_HDD_EDEFAULT);
				return;
			case CPSPackage.RESOURCE_REQUIREMENT__TYPE:
				setType((HostType)null);
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
			case CPSPackage.RESOURCE_REQUIREMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_CPU:
				return requiredCpu != REQUIRED_CPU_EDEFAULT;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_RAM:
				return requiredRam != REQUIRED_RAM_EDEFAULT;
			case CPSPackage.RESOURCE_REQUIREMENT__REQUIRED_HDD:
				return requiredHdd != REQUIRED_HDD_EDEFAULT;
			case CPSPackage.RESOURCE_REQUIREMENT__TYPE:
				return type != null;
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
		result.append(", requiredCpu: ");
		result.append(requiredCpu);
		result.append(", requiredRam: ");
		result.append(requiredRam);
		result.append(", requiredHdd: ");
		result.append(requiredHdd);
		result.append(')');
		return result.toString();
	}

} // ResourceRequirement
