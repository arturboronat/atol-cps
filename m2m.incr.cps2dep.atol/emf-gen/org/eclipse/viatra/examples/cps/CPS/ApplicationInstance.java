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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an application instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbUser <em>Db User</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDependOn <em>Depend On</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance()
 * @model kind="class"
 * @generated
 */
public class ApplicationInstance extends MinimalEObjectImpl.Container implements Identifiable {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final AppState STATE_EDEFAULT = AppState.RUNNING;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected AppState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUser() <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUser() <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUser()
	 * @generated
	 * @ordered
	 */
	protected String dbUser = DB_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected String dbPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected HostInstance allocatedTo;

	/**
	 * The cached value of the '{@link #getDependOn() <em>Depend On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> dependOn;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInstance() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.APPLICATION_INSTANCE;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getIdentifier <em>Identifier</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.examples.cps.CPS.AppState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents whether the application is running.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.viatra.examples.cps.CPS.AppState
	 * @see #setState(AppState)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_State()
	 * @model
	 * @generated
	 */
	public AppState getState() {
		return state;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.viatra.examples.cps.CPS.AppState
	 * @see #getState()
	 * @generated
	 */
	public void setState(AppState newState) {
		AppState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__STATE, oldState, state));
	}

	/**
	 * Returns the value of the '<em><b>Db User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db User</em>' attribute.
	 * @see #setDbUser(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_DbUser()
	 * @model
	 * @generated
	 */
	public String getDbUser() {
		return dbUser;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbUser <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db User</em>' attribute.
	 * @see #getDbUser()
	 * @generated
	 */
	public void setDbUser(String newDbUser) {
		String oldDbUser = dbUser;
		dbUser = newDbUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__DB_USER, oldDbUser, dbUser));
	}

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_DbPassword()
	 * @model
	 * @generated
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	public void setDbPassword(String newDbPassword) {
		String oldDbPassword = dbPassword;
		dbPassword = newDbPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The host instances this application is running on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference.
	 * @see #setAllocatedTo(HostInstance)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_AllocatedTo()
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getApplications
	 * @model opposite="applications"
	 * @generated
	 */
	public HostInstance getAllocatedTo() {
		if (allocatedTo != null && allocatedTo.eIsProxy()) {
			InternalEObject oldAllocatedTo = allocatedTo;
			allocatedTo = (HostInstance)eResolveProxy(oldAllocatedTo);
			if (allocatedTo != oldAllocatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO, oldAllocatedTo, allocatedTo));
			}
		}
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostInstance basicGetAllocatedTo() {
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedTo(HostInstance newAllocatedTo, NotificationChain msgs) {
		HostInstance oldAllocatedTo = allocatedTo;
		allocatedTo = newAllocatedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO, oldAllocatedTo, newAllocatedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated To</em>' reference.
	 * @see #getAllocatedTo()
	 * @generated
	 */
	public void setAllocatedTo(HostInstance newAllocatedTo) {
		if (newAllocatedTo != allocatedTo) {
			NotificationChain msgs = null;
			if (allocatedTo != null)
				msgs = allocatedTo.eInverseRemove(this, CPSPackage.HOST_INSTANCE__APPLICATIONS, HostInstance.class, msgs);
			if (newAllocatedTo != null)
				msgs = newAllocatedTo.eInverseAdd(this, CPSPackage.HOST_INSTANCE__APPLICATIONS, HostInstance.class, msgs);
			msgs = basicSetAllocatedTo(newAllocatedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO, newAllocatedTo, newAllocatedTo));
	}

	/**
	 * Returns the value of the '<em><b>Depend On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other application instances the current one depends on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depend On</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_DependOn()
	 * @model
	 * @generated
	 */
	public EList<ApplicationInstance> getDependOn() {
		if (dependOn == null) {
			dependOn = new EObjectResolvingEList<ApplicationInstance>(ApplicationInstance.class, this, CPSPackage.APPLICATION_INSTANCE__DEPEND_ON);
		}
		return dependOn;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(ApplicationType)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_Type()
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	public ApplicationType getType() {
		if (eContainerFeatureID() != CPSPackage.APPLICATION_INSTANCE__TYPE) return null;
		return (ApplicationType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType basicGetType() {
		if (eContainerFeatureID() != CPSPackage.APPLICATION_INSTANCE__TYPE) return null;
		return (ApplicationType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ApplicationType newType, NotificationChain msgs) {
		msgs = eBasicSetContainer(newType, CPSPackage.APPLICATION_INSTANCE__TYPE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	public void setType(ApplicationType newType) {
		if (newType != eInternalContainer() || (eContainerFeatureID() != CPSPackage.APPLICATION_INSTANCE__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = newType.eInverseAdd(this, CPSPackage.APPLICATION_TYPE__INSTANCES, ApplicationType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the application; larger number means higher priority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance_Priority()
	 * @model
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_INSTANCE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				if (allocatedTo != null)
					msgs = allocatedTo.eInverseRemove(this, CPSPackage.HOST_INSTANCE__APPLICATIONS, HostInstance.class, msgs);
				return basicSetAllocatedTo((HostInstance)otherEnd, msgs);
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetType((ApplicationType)otherEnd, msgs);
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
			case CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				return basicSetAllocatedTo(null, msgs);
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				return basicSetType(null, msgs);
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
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				return eInternalContainer().eInverseRemove(this, CPSPackage.APPLICATION_TYPE__INSTANCES, ApplicationType.class, msgs);
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
			case CPSPackage.APPLICATION_INSTANCE__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.APPLICATION_INSTANCE__STATE:
				return getState();
			case CPSPackage.APPLICATION_INSTANCE__DB_USER:
				return getDbUser();
			case CPSPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				return getDbPassword();
			case CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				if (resolve) return getAllocatedTo();
				return basicGetAllocatedTo();
			case CPSPackage.APPLICATION_INSTANCE__DEPEND_ON:
				return getDependOn();
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CPSPackage.APPLICATION_INSTANCE__PRIORITY:
				return getPriority();
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
			case CPSPackage.APPLICATION_INSTANCE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__STATE:
				setState((AppState)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__DB_USER:
				setDbUser((String)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				setDbPassword((String)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				setAllocatedTo((HostInstance)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__DEPEND_ON:
				getDependOn().clear();
				getDependOn().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				setType((ApplicationType)newValue);
				return;
			case CPSPackage.APPLICATION_INSTANCE__PRIORITY:
				setPriority((Integer)newValue);
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
			case CPSPackage.APPLICATION_INSTANCE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_INSTANCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_INSTANCE__DB_USER:
				setDbUser(DB_USER_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				setDbPassword(DB_PASSWORD_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				setAllocatedTo((HostInstance)null);
				return;
			case CPSPackage.APPLICATION_INSTANCE__DEPEND_ON:
				getDependOn().clear();
				return;
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				setType((ApplicationType)null);
				return;
			case CPSPackage.APPLICATION_INSTANCE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case CPSPackage.APPLICATION_INSTANCE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.APPLICATION_INSTANCE__STATE:
				return state != STATE_EDEFAULT;
			case CPSPackage.APPLICATION_INSTANCE__DB_USER:
				return DB_USER_EDEFAULT == null ? dbUser != null : !DB_USER_EDEFAULT.equals(dbUser);
			case CPSPackage.APPLICATION_INSTANCE__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
			case CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
				return allocatedTo != null;
			case CPSPackage.APPLICATION_INSTANCE__DEPEND_ON:
				return dependOn != null && !dependOn.isEmpty();
			case CPSPackage.APPLICATION_INSTANCE__TYPE:
				return basicGetType() != null;
			case CPSPackage.APPLICATION_INSTANCE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(", state: ");
		result.append(state);
		result.append(", dbUser: ");
		result.append(dbUser);
		result.append(", dbPassword: ");
		result.append(dbPassword);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} // ApplicationInstance
