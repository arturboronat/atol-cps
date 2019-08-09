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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The cyber-physical system instance acts as a container of a cps model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getAppTypes <em>App Types</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem()
 * @model kind="class"
 * @generated
 */
public class CyberPhysicalSystem extends MinimalEObjectImpl.Container implements Identifiable {
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
	 * The default value of the '{@link #getDbUrl() <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUrl() <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUrl()
	 * @generated
	 * @ordered
	 */
	protected String dbUrl = DB_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppTypes() <em>App Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationType> appTypes;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The cached value of the '{@link #getHostTypes() <em>Host Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<HostType> hostTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalSystem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.CYBER_PHYSICAL_SYSTEM;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getIdentifier <em>Identifier</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.CYBER_PHYSICAL_SYSTEM__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Db Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Url</em>' attribute.
	 * @see #setDbUrl(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem_DbUrl()
	 * @model
	 * @generated
	 */
	public String getDbUrl() {
		return dbUrl;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getDbUrl <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Url</em>' attribute.
	 * @see #getDbUrl()
	 * @generated
	 */
	public void setDbUrl(String newDbUrl) {
		String oldDbUrl = dbUrl;
		dbUrl = newDbUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.CYBER_PHYSICAL_SYSTEM__DB_URL, oldDbUrl, dbUrl));
	}

	/**
	 * Returns the value of the '<em><b>App Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.ApplicationType}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Types</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem_AppTypes()
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getCps
	 * @model opposite="cps" containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<ApplicationType> getAppTypes() {
		if (appTypes == null) {
			appTypes = new EObjectContainmentWithInverseEList.Resolving<ApplicationType>(ApplicationType.class, this, CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES, CPSPackage.APPLICATION_TYPE__CPS);
		}
		return appTypes;
	}

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem_Requests()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList.Resolving<Request>(Request.class, this, CPSPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS);
		}
		return requests;
	}

	/**
	 * Returns the value of the '<em><b>Host Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.HostType}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Types</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem_HostTypes()
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType#getCps
	 * @model opposite="cps" containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<HostType> getHostTypes() {
		if (hostTypes == null) {
			hostTypes = new EObjectContainmentWithInverseEList.Resolving<HostType>(HostType.class, this, CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES, CPSPackage.HOST_TYPE__CPS);
		}
		return hostTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppTypes()).basicAdd(otherEnd, msgs);
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHostTypes()).basicAdd(otherEnd, msgs);
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
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES:
				return ((InternalEList<?>)getAppTypes()).basicRemove(otherEnd, msgs);
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return ((InternalEList<?>)getHostTypes()).basicRemove(otherEnd, msgs);
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
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				return getDbUrl();
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES:
				return getAppTypes();
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				return getRequests();
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return getHostTypes();
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
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				setDbUrl((String)newValue);
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES:
				getAppTypes().clear();
				getAppTypes().addAll((Collection<? extends ApplicationType>)newValue);
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				getHostTypes().clear();
				getHostTypes().addAll((Collection<? extends HostType>)newValue);
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
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				setDbUrl(DB_URL_EDEFAULT);
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES:
				getAppTypes().clear();
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				getRequests().clear();
				return;
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				getHostTypes().clear();
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
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__DB_URL:
				return DB_URL_EDEFAULT == null ? dbUrl != null : !DB_URL_EDEFAULT.equals(dbUrl);
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES:
				return appTypes != null && !appTypes.isEmpty();
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
				return requests != null && !requests.isEmpty();
			case CPSPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
				return hostTypes != null && !hostTypes.isEmpty();
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
		result.append(", dbUrl: ");
		result.append(dbUrl);
		result.append(')');
		return result.toString();
	}

} // CyberPhysicalSystem
