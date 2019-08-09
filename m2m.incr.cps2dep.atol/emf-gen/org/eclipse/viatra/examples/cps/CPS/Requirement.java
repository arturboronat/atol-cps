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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a requested requirement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.Requirement#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getAvailablePorts <em>Available Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement()
 * @model kind="class"
 * @generated
 */
public class Requirement extends MinimalEObjectImpl.Container implements Identifiable {
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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationType type;

	/**
	 * This is true if the Type reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> applications;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailablePorts() <em>Available Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailablePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> availablePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.REQUIREMENT;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getIdentifier <em>Identifier</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.REQUIREMENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of instances required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement_Count()
	 * @model
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.REQUIREMENT__COUNT, oldCount, count));
	}

	/**
	 * Returns the value of the '<em><b>Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.Request#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' container reference.
	 * @see #setRequest(Request)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement_Request()
	 * @see org.eclipse.viatra.examples.cps.CPS.Request#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	public Request getRequest() {
		if (eContainerFeatureID() != CPSPackage.REQUIREMENT__REQUEST) return null;
		return (Request)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request basicGetRequest() {
		if (eContainerFeatureID() != CPSPackage.REQUIREMENT__REQUEST) return null;
		return (Request)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		msgs = eBasicSetContainer(newRequest, CPSPackage.REQUIREMENT__REQUEST, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getRequest <em>Request</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' container reference.
	 * @see #getRequest()
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != eInternalContainer() || (eContainerFeatureID() != CPSPackage.REQUIREMENT__REQUEST && newRequest != null)) {
			if (EcoreUtil.isAncestor(this, newRequest))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequest != null)
				msgs = newRequest.eInverseAdd(this, CPSPackage.REQUEST__REQUIREMENTS, Request.class, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.REQUIREMENT__REQUEST, newRequest, newRequest));
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of required application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ApplicationType)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	public ApplicationType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = type;
			type = (ApplicationType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSPackage.REQUIREMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType basicGetType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(ApplicationType newType) {
		ApplicationType oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.REQUIREMENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * Unsets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ApplicationType)
	 * @generated
	 */
	public void unsetType() {
		ApplicationType oldType = type;
		boolean oldTypeESet = typeESet;
		type = null;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CPSPackage.REQUIREMENT__TYPE, oldType, null, oldTypeESet));
	}

	/**
	 * Returns whether the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ApplicationType)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concrete application instances fulfilling the original requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement_Applications()
	 * @model
	 * @generated
	 */
	public EList<ApplicationInstance> getApplications() {
		if (applications == null) {
			applications = new EObjectResolvingEList<ApplicationInstance>(ApplicationInstance.class, this, CPSPackage.REQUIREMENT__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement_Mandatory()
	 * @model default="true"
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.REQUIREMENT__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * Returns the value of the '<em><b>Available Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Ports</em>' attribute list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement_AvailablePorts()
	 * @model
	 * @generated
	 */
	public EList<Integer> getAvailablePorts() {
		if (availablePorts == null) {
			availablePorts = new EDataTypeUniqueEList<Integer>(Integer.class, this, CPSPackage.REQUIREMENT__AVAILABLE_PORTS);
		}
		return availablePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSPackage.REQUIREMENT__REQUEST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRequest((Request)otherEnd, msgs);
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
			case CPSPackage.REQUIREMENT__REQUEST:
				return basicSetRequest(null, msgs);
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
			case CPSPackage.REQUIREMENT__REQUEST:
				return eInternalContainer().eInverseRemove(this, CPSPackage.REQUEST__REQUIREMENTS, Request.class, msgs);
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
			case CPSPackage.REQUIREMENT__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.REQUIREMENT__COUNT:
				return getCount();
			case CPSPackage.REQUIREMENT__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case CPSPackage.REQUIREMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CPSPackage.REQUIREMENT__APPLICATIONS:
				return getApplications();
			case CPSPackage.REQUIREMENT__MANDATORY:
				return isMandatory();
			case CPSPackage.REQUIREMENT__AVAILABLE_PORTS:
				return getAvailablePorts();
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
			case CPSPackage.REQUIREMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.REQUIREMENT__COUNT:
				setCount((Integer)newValue);
				return;
			case CPSPackage.REQUIREMENT__REQUEST:
				setRequest((Request)newValue);
				return;
			case CPSPackage.REQUIREMENT__TYPE:
				setType((ApplicationType)newValue);
				return;
			case CPSPackage.REQUIREMENT__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CPSPackage.REQUIREMENT__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case CPSPackage.REQUIREMENT__AVAILABLE_PORTS:
				getAvailablePorts().clear();
				getAvailablePorts().addAll((Collection<? extends Integer>)newValue);
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
			case CPSPackage.REQUIREMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.REQUIREMENT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case CPSPackage.REQUIREMENT__REQUEST:
				setRequest((Request)null);
				return;
			case CPSPackage.REQUIREMENT__TYPE:
				unsetType();
				return;
			case CPSPackage.REQUIREMENT__APPLICATIONS:
				getApplications().clear();
				return;
			case CPSPackage.REQUIREMENT__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case CPSPackage.REQUIREMENT__AVAILABLE_PORTS:
				getAvailablePorts().clear();
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
			case CPSPackage.REQUIREMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.REQUIREMENT__COUNT:
				return count != COUNT_EDEFAULT;
			case CPSPackage.REQUIREMENT__REQUEST:
				return basicGetRequest() != null;
			case CPSPackage.REQUIREMENT__TYPE:
				return isSetType();
			case CPSPackage.REQUIREMENT__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case CPSPackage.REQUIREMENT__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case CPSPackage.REQUIREMENT__AVAILABLE_PORTS:
				return availablePorts != null && !availablePorts.isEmpty();
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
		result.append(", count: ");
		result.append(count);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", availablePorts: ");
		result.append(availablePorts);
		result.append(')');
		return result.toString();
	}

} // Requirement
