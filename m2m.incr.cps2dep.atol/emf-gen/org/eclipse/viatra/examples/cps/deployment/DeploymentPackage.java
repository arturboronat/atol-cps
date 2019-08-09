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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentFactory
 * @model kind="package"
 * @generated
 */
public class DeploymentPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://org.eclipse.viatra/model/deployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "deployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentPackage eINSTANCE = org.eclipse.viatra.examples.cps.deployment.DeploymentPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentElement
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentElement()
	 * @generated
	 */
	public static final int DEPLOYMENT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentHost <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentHost
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentHost()
	 * @generated
	 */
	public static final int DEPLOYMENT_HOST = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_HOST__DESCRIPTION = DEPLOYMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_HOST__APPLICATIONS = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_HOST__IP = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_HOST_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_HOST_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentApplication <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentApplication
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentApplication()
	 * @generated
	 */
	public static final int DEPLOYMENT_APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_APPLICATION__DESCRIPTION = DEPLOYMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_APPLICATION__BEHAVIOR = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_APPLICATION__ID = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_APPLICATION_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_APPLICATION_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentBehavior()
	 * @generated
	 */
	public static final int DEPLOYMENT_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_BEHAVIOR__DESCRIPTION = DEPLOYMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_BEHAVIOR__STATES = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_BEHAVIOR__TRANSITIONS = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_BEHAVIOR__CURRENT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_BEHAVIOR_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_BEHAVIOR_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorState <em>Behavior State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorState
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorState()
	 * @generated
	 */
	public static final int BEHAVIOR_STATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_STATE__DESCRIPTION = DEPLOYMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_STATE__OUTGOING = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_STATE_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_STATE_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition <em>Behavior Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorTransition
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorTransition()
	 * @generated
	 */
	public static final int BEHAVIOR_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_TRANSITION__DESCRIPTION = DEPLOYMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_TRANSITION__TO = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_TRANSITION__TRIGGER = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_TRANSITION_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_TRANSITION_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.deployment.Deployment <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.deployment.Deployment
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeployment()
	 * @generated
	 */
	public static final int DEPLOYMENT = 5;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT__HOSTS = 0;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackage() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited) return (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentPackage theDeploymentPackage = registeredDeploymentPackage instanceof DeploymentPackage ? (DeploymentPackage)registeredDeploymentPackage : new DeploymentPackage();

		isInited = true;

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentHost
	 * @generated
	 */
	public EClass getDeploymentHost() {
		return deploymentHostEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentHost#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentHost#getApplications()
	 * @see #getDeploymentHost()
	 * @generated
	 */
	public EReference getDeploymentHost_Applications() {
		return (EReference)deploymentHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentHost#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentHost#getIp()
	 * @see #getDeploymentHost()
	 * @generated
	 */
	public EAttribute getDeploymentHost_Ip() {
		return (EAttribute)deploymentHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentApplication
	 * @generated
	 */
	public EClass getDeploymentApplication() {
		return deploymentApplicationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentApplication#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentApplication#getBehavior()
	 * @see #getDeploymentApplication()
	 * @generated
	 */
	public EReference getDeploymentApplication_Behavior() {
		return (EReference)deploymentApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentApplication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentApplication#getId()
	 * @see #getDeploymentApplication()
	 * @generated
	 */
	public EAttribute getDeploymentApplication_Id() {
		return (EAttribute)deploymentApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior
	 * @generated
	 */
	public EClass getDeploymentBehavior() {
		return deploymentBehaviorEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getStates()
	 * @see #getDeploymentBehavior()
	 * @generated
	 */
	public EReference getDeploymentBehavior_States() {
		return (EReference)deploymentBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getTransitions()
	 * @see #getDeploymentBehavior()
	 * @generated
	 */
	public EReference getDeploymentBehavior_Transitions() {
		return (EReference)deploymentBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior#getCurrent()
	 * @see #getDeploymentBehavior()
	 * @generated
	 */
	public EReference getDeploymentBehavior_Current() {
		return (EReference)deploymentBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorState <em>Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior State</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorState
	 * @generated
	 */
	public EClass getBehaviorState() {
		return behaviorStateEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorState#getOutgoing()
	 * @see #getBehaviorState()
	 * @generated
	 */
	public EReference getBehaviorState_Outgoing() {
		return (EReference)behaviorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition <em>Behavior Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Transition</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorTransition
	 * @generated
	 */
	public EClass getBehaviorTransition() {
		return behaviorTransitionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTo()
	 * @see #getBehaviorTransition()
	 * @generated
	 */
	public EReference getBehaviorTransition_To() {
		return (EReference)behaviorTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorTransition#getTrigger()
	 * @see #getBehaviorTransition()
	 * @generated
	 */
	public EReference getBehaviorTransition_Trigger() {
		return (EReference)behaviorTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.Deployment
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.deployment.Deployment#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.Deployment#getHosts()
	 * @see #getDeployment()
	 * @generated
	 */
	public EReference getDeployment_Hosts() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentElement
	 * @generated
	 */
	public EClass getDeploymentElement() {
		return deploymentElementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentElement#getDescription()
	 * @see #getDeploymentElement()
	 * @generated
	 */
	public EAttribute getDeploymentElement_Description() {
		return (EAttribute)deploymentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deploymentHostEClass = createEClass(DEPLOYMENT_HOST);
		createEReference(deploymentHostEClass, DEPLOYMENT_HOST__APPLICATIONS);
		createEAttribute(deploymentHostEClass, DEPLOYMENT_HOST__IP);

		deploymentApplicationEClass = createEClass(DEPLOYMENT_APPLICATION);
		createEReference(deploymentApplicationEClass, DEPLOYMENT_APPLICATION__BEHAVIOR);
		createEAttribute(deploymentApplicationEClass, DEPLOYMENT_APPLICATION__ID);

		deploymentBehaviorEClass = createEClass(DEPLOYMENT_BEHAVIOR);
		createEReference(deploymentBehaviorEClass, DEPLOYMENT_BEHAVIOR__STATES);
		createEReference(deploymentBehaviorEClass, DEPLOYMENT_BEHAVIOR__TRANSITIONS);
		createEReference(deploymentBehaviorEClass, DEPLOYMENT_BEHAVIOR__CURRENT);

		behaviorStateEClass = createEClass(BEHAVIOR_STATE);
		createEReference(behaviorStateEClass, BEHAVIOR_STATE__OUTGOING);

		behaviorTransitionEClass = createEClass(BEHAVIOR_TRANSITION);
		createEReference(behaviorTransitionEClass, BEHAVIOR_TRANSITION__TO);
		createEReference(behaviorTransitionEClass, BEHAVIOR_TRANSITION__TRIGGER);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__HOSTS);

		deploymentElementEClass = createEClass(DEPLOYMENT_ELEMENT);
		createEAttribute(deploymentElementEClass, DEPLOYMENT_ELEMENT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deploymentHostEClass.getESuperTypes().add(this.getDeploymentElement());
		deploymentApplicationEClass.getESuperTypes().add(this.getDeploymentElement());
		deploymentBehaviorEClass.getESuperTypes().add(this.getDeploymentElement());
		behaviorStateEClass.getESuperTypes().add(this.getDeploymentElement());
		behaviorTransitionEClass.getESuperTypes().add(this.getDeploymentElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentHostEClass, DeploymentHost.class, "DeploymentHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentHost_Applications(), this.getDeploymentApplication(), null, "applications", null, 0, -1, DeploymentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentHost_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, DeploymentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentApplicationEClass, DeploymentApplication.class, "DeploymentApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentApplication_Behavior(), this.getDeploymentBehavior(), null, "behavior", null, 0, 1, DeploymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentApplication_Id(), ecorePackage.getEString(), "id", null, 0, 1, DeploymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentBehaviorEClass, DeploymentBehavior.class, "DeploymentBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentBehavior_States(), this.getBehaviorState(), null, "states", null, 0, -1, DeploymentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentBehavior_Transitions(), this.getBehaviorTransition(), null, "transitions", null, 0, -1, DeploymentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentBehavior_Current(), this.getBehaviorState(), null, "current", null, 0, 1, DeploymentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorStateEClass, BehaviorState.class, "BehaviorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorState_Outgoing(), this.getBehaviorTransition(), null, "outgoing", null, 0, -1, BehaviorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorTransitionEClass, BehaviorTransition.class, "BehaviorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorTransition_To(), this.getBehaviorState(), null, "to", null, 0, 1, BehaviorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTransition_Trigger(), this.getBehaviorTransition(), null, "trigger", null, 0, -1, BehaviorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Hosts(), this.getDeploymentHost(), null, "hosts", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentElementEClass, DeploymentElement.class, "DeploymentElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeploymentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentHost <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentHost
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentHost()
		 * @generated
		 */
		public static final EClass DEPLOYMENT_HOST = eINSTANCE.getDeploymentHost();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPLOYMENT_HOST__APPLICATIONS = eINSTANCE.getDeploymentHost_Applications();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEPLOYMENT_HOST__IP = eINSTANCE.getDeploymentHost_Ip();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentApplication <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentApplication
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentApplication()
		 * @generated
		 */
		public static final EClass DEPLOYMENT_APPLICATION = eINSTANCE.getDeploymentApplication();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPLOYMENT_APPLICATION__BEHAVIOR = eINSTANCE.getDeploymentApplication_Behavior();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEPLOYMENT_APPLICATION__ID = eINSTANCE.getDeploymentApplication_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentBehavior()
		 * @generated
		 */
		public static final EClass DEPLOYMENT_BEHAVIOR = eINSTANCE.getDeploymentBehavior();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPLOYMENT_BEHAVIOR__STATES = eINSTANCE.getDeploymentBehavior_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPLOYMENT_BEHAVIOR__TRANSITIONS = eINSTANCE.getDeploymentBehavior_Transitions();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPLOYMENT_BEHAVIOR__CURRENT = eINSTANCE.getDeploymentBehavior_Current();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorState <em>Behavior State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorState
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorState()
		 * @generated
		 */
		public static final EClass BEHAVIOR_STATE = eINSTANCE.getBehaviorState();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BEHAVIOR_STATE__OUTGOING = eINSTANCE.getBehaviorState_Outgoing();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.BehaviorTransition <em>Behavior Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.BehaviorTransition
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getBehaviorTransition()
		 * @generated
		 */
		public static final EClass BEHAVIOR_TRANSITION = eINSTANCE.getBehaviorTransition();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BEHAVIOR_TRANSITION__TO = eINSTANCE.getBehaviorTransition_To();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BEHAVIOR_TRANSITION__TRIGGER = eINSTANCE.getBehaviorTransition_Trigger();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.Deployment <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.Deployment
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeployment()
		 * @generated
		 */
		public static final EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEPLOYMENT__HOSTS = eINSTANCE.getDeployment_Hosts();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.deployment.DeploymentElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentElement
		 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage#getDeploymentElement()
		 * @generated
		 */
		public static final EClass DEPLOYMENT_ELEMENT = eINSTANCE.getDeploymentElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEPLOYMENT_ELEMENT__DESCRIPTION = eINSTANCE.getDeploymentElement_Description();

	}

} //DeploymentPackage
