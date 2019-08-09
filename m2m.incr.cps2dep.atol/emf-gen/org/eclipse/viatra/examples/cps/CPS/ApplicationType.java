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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A descriptor for a class of applications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileLocation <em>Exe File Location</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeType <em>Exe Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getZipFileUrl <em>Zip File Url</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getCps <em>Cps</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileSize <em>Exe File Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType()
 * @model kind="class"
 * @generated
 */
public class ApplicationType extends MinimalEObjectImpl.Container implements Identifiable {
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
	 * The default value of the '{@link #getExeFileLocation() <em>Exe File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXE_FILE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExeFileLocation() <em>Exe File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String exeFileLocation = EXE_FILE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExeType() <em>Exe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExeType() <em>Exe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeType()
	 * @generated
	 * @ordered
	 */
	protected String exeType = EXE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipFileUrl() <em>Zip File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipFileUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_FILE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipFileUrl() <em>Zip File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipFileUrl()
	 * @generated
	 * @ordered
	 */
	protected String zipFileUrl = ZIP_FILE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRequirement> requirements;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> instances;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected StateMachine behavior;

	/**
	 * The default value of the '{@link #getExeFileSize() <em>Exe File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final long EXE_FILE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExeFileSize() <em>Exe File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeFileSize()
	 * @generated
	 * @ordered
	 */
	protected long exeFileSize = EXE_FILE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.APPLICATION_TYPE;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getIdentifier <em>Identifier</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Exe File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where to look for the executable file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exe File Location</em>' attribute.
	 * @see #setExeFileLocation(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_ExeFileLocation()
	 * @model
	 * @generated
	 */
	public String getExeFileLocation() {
		return exeFileLocation;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileLocation <em>Exe File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe File Location</em>' attribute.
	 * @see #getExeFileLocation()
	 * @generated
	 */
	public void setExeFileLocation(String newExeFileLocation) {
		String oldExeFileLocation = exeFileLocation;
		exeFileLocation = newExeFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__EXE_FILE_LOCATION, oldExeFileLocation, exeFileLocation));
	}

	/**
	 * Returns the value of the '<em><b>Exe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the executable file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exe Type</em>' attribute.
	 * @see #setExeType(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_ExeType()
	 * @model
	 * @generated
	 */
	public String getExeType() {
		return exeType;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeType <em>Exe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe Type</em>' attribute.
	 * @see #getExeType()
	 * @generated
	 */
	public void setExeType(String newExeType) {
		String oldExeType = exeType;
		exeType = newExeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__EXE_TYPE, oldExeType, exeType));
	}

	/**
	 * Returns the value of the '<em><b>Zip File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip File Url</em>' attribute.
	 * @see #setZipFileUrl(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_ZipFileUrl()
	 * @model
	 * @generated
	 */
	public String getZipFileUrl() {
		return zipFileUrl;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getZipFileUrl <em>Zip File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip File Url</em>' attribute.
	 * @see #getZipFileUrl()
	 * @generated
	 */
	public void setZipFileUrl(String newZipFileUrl) {
		String oldZipFileUrl = zipFileUrl;
		zipFileUrl = newZipFileUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__ZIP_FILE_URL, oldZipFileUrl, zipFileUrl));
	}

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource requirements of the application are stored in this reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_Requirements()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<ResourceRequirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList.Resolving<ResourceRequirement>(ResourceRequirement.class, this, CPSPackage.APPLICATION_TYPE__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * Returns the value of the '<em><b>Cps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getAppTypes <em>App Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the container instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cps</em>' container reference.
	 * @see #setCps(CyberPhysicalSystem)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_Cps()
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getAppTypes
	 * @model opposite="appTypes" required="true" transient="false"
	 * @generated
	 */
	public CyberPhysicalSystem getCps() {
		if (eContainerFeatureID() != CPSPackage.APPLICATION_TYPE__CPS) return null;
		return (CyberPhysicalSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem basicGetCps() {
		if (eContainerFeatureID() != CPSPackage.APPLICATION_TYPE__CPS) return null;
		return (CyberPhysicalSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCps(CyberPhysicalSystem newCps, NotificationChain msgs) {
		msgs = eBasicSetContainer(newCps, CPSPackage.APPLICATION_TYPE__CPS, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getCps <em>Cps</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' container reference.
	 * @see #getCps()
	 * @generated
	 */
	public void setCps(CyberPhysicalSystem newCps) {
		if (newCps != eInternalContainer() || (eContainerFeatureID() != CPSPackage.APPLICATION_TYPE__CPS && newCps != null)) {
			if (EcoreUtil.isAncestor(this, newCps))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCps != null)
				msgs = newCps.eInverseAdd(this, CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES, CyberPhysicalSystem.class, msgs);
			msgs = basicSetCps(newCps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__CPS, newCps, newCps));
	}

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All known instances of this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_Instances()
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getType
	 * @model opposite="type" containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<ApplicationInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList.Resolving<ApplicationInstance>(ApplicationInstance.class, this, CPSPackage.APPLICATION_TYPE__INSTANCES, CPSPackage.APPLICATION_INSTANCE__TYPE);
		}
		return instances;
	}

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional state machine describing the behavior of the application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(StateMachine)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_Behavior()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public StateMachine getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = behavior;
			behavior = (StateMachine)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				InternalEObject newBehavior = behavior;
				NotificationChain msgs = oldBehavior.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPSPackage.APPLICATION_TYPE__BEHAVIOR, null, null);
				if (newBehavior.eInternalContainer() == null) {
					msgs = newBehavior.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPSPackage.APPLICATION_TYPE__BEHAVIOR, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSPackage.APPLICATION_TYPE__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(StateMachine newBehavior, NotificationChain msgs) {
		StateMachine oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	public void setBehavior(StateMachine newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = behavior.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPSPackage.APPLICATION_TYPE__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = newBehavior.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPSPackage.APPLICATION_TYPE__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * Returns the value of the '<em><b>Exe File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the executable in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exe File Size</em>' attribute.
	 * @see #setExeFileSize(long)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType_ExeFileSize()
	 * @model
	 * @generated
	 */
	public long getExeFileSize() {
		return exeFileSize;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileSize <em>Exe File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe File Size</em>' attribute.
	 * @see #getExeFileSize()
	 * @generated
	 */
	public void setExeFileSize(long newExeFileSize) {
		long oldExeFileSize = exeFileSize;
		exeFileSize = newExeFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.APPLICATION_TYPE__EXE_FILE_SIZE, oldExeFileSize, exeFileSize));
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
			case CPSPackage.APPLICATION_TYPE__CPS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCps((CyberPhysicalSystem)otherEnd, msgs);
			case CPSPackage.APPLICATION_TYPE__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
			case CPSPackage.APPLICATION_TYPE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case CPSPackage.APPLICATION_TYPE__CPS:
				return basicSetCps(null, msgs);
			case CPSPackage.APPLICATION_TYPE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case CPSPackage.APPLICATION_TYPE__BEHAVIOR:
				return basicSetBehavior(null, msgs);
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
			case CPSPackage.APPLICATION_TYPE__CPS:
				return eInternalContainer().eInverseRemove(this, CPSPackage.CYBER_PHYSICAL_SYSTEM__APP_TYPES, CyberPhysicalSystem.class, msgs);
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
			case CPSPackage.APPLICATION_TYPE__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_LOCATION:
				return getExeFileLocation();
			case CPSPackage.APPLICATION_TYPE__EXE_TYPE:
				return getExeType();
			case CPSPackage.APPLICATION_TYPE__ZIP_FILE_URL:
				return getZipFileUrl();
			case CPSPackage.APPLICATION_TYPE__REQUIREMENTS:
				return getRequirements();
			case CPSPackage.APPLICATION_TYPE__CPS:
				if (resolve) return getCps();
				return basicGetCps();
			case CPSPackage.APPLICATION_TYPE__INSTANCES:
				return getInstances();
			case CPSPackage.APPLICATION_TYPE__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_SIZE:
				return getExeFileSize();
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
			case CPSPackage.APPLICATION_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_LOCATION:
				setExeFileLocation((String)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__EXE_TYPE:
				setExeType((String)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__ZIP_FILE_URL:
				setZipFileUrl((String)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ResourceRequirement>)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__CPS:
				setCps((CyberPhysicalSystem)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__BEHAVIOR:
				setBehavior((StateMachine)newValue);
				return;
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_SIZE:
				setExeFileSize((Long)newValue);
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
			case CPSPackage.APPLICATION_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_LOCATION:
				setExeFileLocation(EXE_FILE_LOCATION_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_TYPE__EXE_TYPE:
				setExeType(EXE_TYPE_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_TYPE__ZIP_FILE_URL:
				setZipFileUrl(ZIP_FILE_URL_EDEFAULT);
				return;
			case CPSPackage.APPLICATION_TYPE__REQUIREMENTS:
				getRequirements().clear();
				return;
			case CPSPackage.APPLICATION_TYPE__CPS:
				setCps((CyberPhysicalSystem)null);
				return;
			case CPSPackage.APPLICATION_TYPE__INSTANCES:
				getInstances().clear();
				return;
			case CPSPackage.APPLICATION_TYPE__BEHAVIOR:
				setBehavior((StateMachine)null);
				return;
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_SIZE:
				setExeFileSize(EXE_FILE_SIZE_EDEFAULT);
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
			case CPSPackage.APPLICATION_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_LOCATION:
				return EXE_FILE_LOCATION_EDEFAULT == null ? exeFileLocation != null : !EXE_FILE_LOCATION_EDEFAULT.equals(exeFileLocation);
			case CPSPackage.APPLICATION_TYPE__EXE_TYPE:
				return EXE_TYPE_EDEFAULT == null ? exeType != null : !EXE_TYPE_EDEFAULT.equals(exeType);
			case CPSPackage.APPLICATION_TYPE__ZIP_FILE_URL:
				return ZIP_FILE_URL_EDEFAULT == null ? zipFileUrl != null : !ZIP_FILE_URL_EDEFAULT.equals(zipFileUrl);
			case CPSPackage.APPLICATION_TYPE__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case CPSPackage.APPLICATION_TYPE__CPS:
				return basicGetCps() != null;
			case CPSPackage.APPLICATION_TYPE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case CPSPackage.APPLICATION_TYPE__BEHAVIOR:
				return behavior != null;
			case CPSPackage.APPLICATION_TYPE__EXE_FILE_SIZE:
				return exeFileSize != EXE_FILE_SIZE_EDEFAULT;
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
		result.append(", exeFileLocation: ");
		result.append(exeFileLocation);
		result.append(", exeType: ");
		result.append(exeType);
		result.append(", zipFileUrl: ");
		result.append(zipFileUrl);
		result.append(", exeFileSize: ");
		result.append(exeFileSize);
		result.append(')');
		return result.toString();
	}

} // ApplicationType
