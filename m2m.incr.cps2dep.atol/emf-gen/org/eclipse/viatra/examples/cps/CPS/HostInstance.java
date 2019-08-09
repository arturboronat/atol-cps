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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a single host in the system
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getNodeIp <em>Node Ip</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableCpu <em>Available Cpu</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableRam <em>Available Ram</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableHdd <em>Available Hdd</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalCpu <em>Total Cpu</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalRam <em>Total Ram</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalHdd <em>Total Hdd</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getCommunicateWith <em>Communicate With</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance()
 * @model kind="class"
 * @generated
 */
public class HostInstance extends MinimalEObjectImpl.Container implements Identifiable {
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
	 * The default value of the '{@link #getNodeIp() <em>Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIp()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeIp() <em>Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIp()
	 * @generated
	 * @ordered
	 */
	protected String nodeIp = NODE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableCpu() <em>Available Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableCpu() <em>Available Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCpu()
	 * @generated
	 * @ordered
	 */
	protected int availableCpu = AVAILABLE_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableRam() <em>Available Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableRam()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableRam() <em>Available Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableRam()
	 * @generated
	 * @ordered
	 */
	protected int availableRam = AVAILABLE_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableHdd() <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableHdd() <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableHdd()
	 * @generated
	 * @ordered
	 */
	protected int availableHdd = AVAILABLE_HDD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCpu() <em>Total Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCpu() <em>Total Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCpu()
	 * @generated
	 * @ordered
	 */
	protected int totalCpu = TOTAL_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRam() <em>Total Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRam()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalRam() <em>Total Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRam()
	 * @generated
	 * @ordered
	 */
	protected int totalRam = TOTAL_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalHdd() <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalHdd() <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHdd()
	 * @generated
	 * @ordered
	 */
	protected int totalHdd = TOTAL_HDD_EDEFAULT;

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
	 * The cached value of the '{@link #getCommunicateWith() <em>Communicate With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicateWith()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> communicateWith;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostInstance() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSPackage.Literals.HOST_INSTANCE;
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
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getIdentifier <em>Identifier</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Node Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address of the given host instance. Must be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Ip</em>' attribute.
	 * @see #setNodeIp(String)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_NodeIp()
	 * @model
	 * @generated
	 */
	public String getNodeIp() {
		return nodeIp;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getNodeIp <em>Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Ip</em>' attribute.
	 * @see #getNodeIp()
	 * @generated
	 */
	public void setNodeIp(String newNodeIp) {
		String oldNodeIp = nodeIp;
		nodeIp = newNodeIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__NODE_IP, oldNodeIp, nodeIp));
	}

	/**
	 * Returns the value of the '<em><b>Available Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of CPUs that are not bound for any applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Cpu</em>' attribute.
	 * @see #setAvailableCpu(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_AvailableCpu()
	 * @model
	 * @generated
	 */
	public int getAvailableCpu() {
		return availableCpu;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableCpu <em>Available Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Cpu</em>' attribute.
	 * @see #getAvailableCpu()
	 * @generated
	 */
	public void setAvailableCpu(int newAvailableCpu) {
		int oldAvailableCpu = availableCpu;
		availableCpu = newAvailableCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__AVAILABLE_CPU, oldAvailableCpu, availableCpu));
	}

	/**
	 * Returns the value of the '<em><b>Available Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of RAM not bound for any applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Ram</em>' attribute.
	 * @see #setAvailableRam(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_AvailableRam()
	 * @model
	 * @generated
	 */
	public int getAvailableRam() {
		return availableRam;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableRam <em>Available Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Ram</em>' attribute.
	 * @see #getAvailableRam()
	 * @generated
	 */
	public void setAvailableRam(int newAvailableRam) {
		int oldAvailableRam = availableRam;
		availableRam = newAvailableRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__AVAILABLE_RAM, oldAvailableRam, availableRam));
	}

	/**
	 * Returns the value of the '<em><b>Available Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of persistent storage not bound for any applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Hdd</em>' attribute.
	 * @see #setAvailableHdd(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_AvailableHdd()
	 * @model
	 * @generated
	 */
	public int getAvailableHdd() {
		return availableHdd;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableHdd <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Hdd</em>' attribute.
	 * @see #getAvailableHdd()
	 * @generated
	 */
	public void setAvailableHdd(int newAvailableHdd) {
		int oldAvailableHdd = availableHdd;
		availableHdd = newAvailableHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__AVAILABLE_HDD, oldAvailableHdd, availableHdd));
	}

	/**
	 * Returns the value of the '<em><b>Total Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of CPUs available. If unspecified, the default value from the corresponding host type should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Cpu</em>' attribute.
	 * @see #setTotalCpu(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_TotalCpu()
	 * @model
	 * @generated
	 */
	public int getTotalCpu() {
		return totalCpu;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalCpu <em>Total Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cpu</em>' attribute.
	 * @see #getTotalCpu()
	 * @generated
	 */
	public void setTotalCpu(int newTotalCpu) {
		int oldTotalCpu = totalCpu;
		totalCpu = newTotalCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__TOTAL_CPU, oldTotalCpu, totalCpu));
	}

	/**
	 * Returns the value of the '<em><b>Total Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of RAM available. If unspecified, the default value from the corresponding host type should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Ram</em>' attribute.
	 * @see #setTotalRam(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_TotalRam()
	 * @model
	 * @generated
	 */
	public int getTotalRam() {
		return totalRam;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalRam <em>Total Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Ram</em>' attribute.
	 * @see #getTotalRam()
	 * @generated
	 */
	public void setTotalRam(int newTotalRam) {
		int oldTotalRam = totalRam;
		totalRam = newTotalRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__TOTAL_RAM, oldTotalRam, totalRam));
	}

	/**
	 * Returns the value of the '<em><b>Total Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of persistent storage available. If unspecified, the default value from the corresponding host type should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Hdd</em>' attribute.
	 * @see #setTotalHdd(int)
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_TotalHdd()
	 * @model
	 * @generated
	 */
	public int getTotalHdd() {
		return totalHdd;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalHdd <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Hdd</em>' attribute.
	 * @see #getTotalHdd()
	 * @generated
	 */
	public void setTotalHdd(int newTotalHdd) {
		int oldTotalHdd = totalHdd;
		totalHdd = newTotalHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSPackage.HOST_INSTANCE__TOTAL_HDD, oldTotalHdd, totalHdd));
	}

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All application instances running on this host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_Applications()
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getAllocatedTo
	 * @model opposite="allocatedTo"
	 * @generated
	 */
	public EList<ApplicationInstance> getApplications() {
		if (applications == null) {
			applications = new EObjectWithInverseResolvingEList<ApplicationInstance>(ApplicationInstance.class, this, CPSPackage.HOST_INSTANCE__APPLICATIONS, CPSPackage.APPLICATION_INSTANCE__ALLOCATED_TO);
		}
		return applications;
	}

	/**
	 * Returns the value of the '<em><b>Communicate With</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.examples.cps.CPS.HostInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference enumerates host instances the current instance needs to communicate with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communicate With</em>' reference list.
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance_CommunicateWith()
	 * @model
	 * @generated
	 */
	public EList<HostInstance> getCommunicateWith() {
		if (communicateWith == null) {
			communicateWith = new EObjectResolvingEList<HostInstance>(HostInstance.class, this, CPSPackage.HOST_INSTANCE__COMMUNICATE_WITH);
		}
		return communicateWith;
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
			case CPSPackage.HOST_INSTANCE__APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplications()).basicAdd(otherEnd, msgs);
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
			case CPSPackage.HOST_INSTANCE__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
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
			case CPSPackage.HOST_INSTANCE__IDENTIFIER:
				return getIdentifier();
			case CPSPackage.HOST_INSTANCE__NODE_IP:
				return getNodeIp();
			case CPSPackage.HOST_INSTANCE__AVAILABLE_CPU:
				return getAvailableCpu();
			case CPSPackage.HOST_INSTANCE__AVAILABLE_RAM:
				return getAvailableRam();
			case CPSPackage.HOST_INSTANCE__AVAILABLE_HDD:
				return getAvailableHdd();
			case CPSPackage.HOST_INSTANCE__TOTAL_CPU:
				return getTotalCpu();
			case CPSPackage.HOST_INSTANCE__TOTAL_RAM:
				return getTotalRam();
			case CPSPackage.HOST_INSTANCE__TOTAL_HDD:
				return getTotalHdd();
			case CPSPackage.HOST_INSTANCE__APPLICATIONS:
				return getApplications();
			case CPSPackage.HOST_INSTANCE__COMMUNICATE_WITH:
				return getCommunicateWith();
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
			case CPSPackage.HOST_INSTANCE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__NODE_IP:
				setNodeIp((String)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_CPU:
				setAvailableCpu((Integer)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_RAM:
				setAvailableRam((Integer)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_HDD:
				setAvailableHdd((Integer)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__TOTAL_CPU:
				setTotalCpu((Integer)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__TOTAL_RAM:
				setTotalRam((Integer)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__TOTAL_HDD:
				setTotalHdd((Integer)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends ApplicationInstance>)newValue);
				return;
			case CPSPackage.HOST_INSTANCE__COMMUNICATE_WITH:
				getCommunicateWith().clear();
				getCommunicateWith().addAll((Collection<? extends HostInstance>)newValue);
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
			case CPSPackage.HOST_INSTANCE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__NODE_IP:
				setNodeIp(NODE_IP_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_CPU:
				setAvailableCpu(AVAILABLE_CPU_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_RAM:
				setAvailableRam(AVAILABLE_RAM_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_HDD:
				setAvailableHdd(AVAILABLE_HDD_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__TOTAL_CPU:
				setTotalCpu(TOTAL_CPU_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__TOTAL_RAM:
				setTotalRam(TOTAL_RAM_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__TOTAL_HDD:
				setTotalHdd(TOTAL_HDD_EDEFAULT);
				return;
			case CPSPackage.HOST_INSTANCE__APPLICATIONS:
				getApplications().clear();
				return;
			case CPSPackage.HOST_INSTANCE__COMMUNICATE_WITH:
				getCommunicateWith().clear();
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
			case CPSPackage.HOST_INSTANCE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CPSPackage.HOST_INSTANCE__NODE_IP:
				return NODE_IP_EDEFAULT == null ? nodeIp != null : !NODE_IP_EDEFAULT.equals(nodeIp);
			case CPSPackage.HOST_INSTANCE__AVAILABLE_CPU:
				return availableCpu != AVAILABLE_CPU_EDEFAULT;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_RAM:
				return availableRam != AVAILABLE_RAM_EDEFAULT;
			case CPSPackage.HOST_INSTANCE__AVAILABLE_HDD:
				return availableHdd != AVAILABLE_HDD_EDEFAULT;
			case CPSPackage.HOST_INSTANCE__TOTAL_CPU:
				return totalCpu != TOTAL_CPU_EDEFAULT;
			case CPSPackage.HOST_INSTANCE__TOTAL_RAM:
				return totalRam != TOTAL_RAM_EDEFAULT;
			case CPSPackage.HOST_INSTANCE__TOTAL_HDD:
				return totalHdd != TOTAL_HDD_EDEFAULT;
			case CPSPackage.HOST_INSTANCE__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case CPSPackage.HOST_INSTANCE__COMMUNICATE_WITH:
				return communicateWith != null && !communicateWith.isEmpty();
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
		result.append(", nodeIp: ");
		result.append(nodeIp);
		result.append(", availableCpu: ");
		result.append(availableCpu);
		result.append(", availableRam: ");
		result.append(availableRam);
		result.append(", availableHdd: ");
		result.append(availableHdd);
		result.append(", totalCpu: ");
		result.append(totalCpu);
		result.append(", totalRam: ");
		result.append(totalRam);
		result.append(", totalHdd: ");
		result.append(totalHdd);
		result.append(')');
		return result.toString();
	}

} // HostInstance
