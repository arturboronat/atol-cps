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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.viatra.examples.cps.CPS.CPSPackage;

import org.eclipse.viatra.examples.cps.deployment.DeploymentPackage;

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
 * @see org.eclipse.viatra.examples.cps.traces.TracesFactory
 * @model kind="package"
 * @generated
 */
public class TracesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "traces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://org.eclipse.viatra/model/cps-traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cpstraceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TracesPackage eINSTANCE = org.eclipse.viatra.examples.cps.traces.TracesPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment <em>CPS To Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.traces.CPSToDeployment
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPSToDeployment()
	 * @generated
	 */
	public static final int CPS_TO_DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS_TO_DEPLOYMENT__CPS = 0;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS_TO_DEPLOYMENT__DEPLOYMENT = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS_TO_DEPLOYMENT__TRACES = 2;

	/**
	 * The number of structural features of the '<em>CPS To Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS_TO_DEPLOYMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CPS To Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS_TO_DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace <em>CPS2 Deployment Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPS2DeploymentTrace()
	 * @generated
	 */
	public static final int CPS2_DEPLOYMENT_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Cps Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Deployment Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>CPS2 Deployment Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS2_DEPLOYMENT_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CPS2 Deployment Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CPS2_DEPLOYMENT_TRACE_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpsToDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cps2DeploymentTraceEClass = null;

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
	 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracesPackage() {
		super(eNS_URI, TracesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracesPackage init() {
		if (isInited) return (TracesPackage)EPackage.Registry.INSTANCE.getEPackage(TracesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTracesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TracesPackage theTracesPackage = registeredTracesPackage instanceof TracesPackage ? (TracesPackage)registeredTracesPackage : new TracesPackage();

		isInited = true;

		// Initialize simple dependencies
		CPSPackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracesPackage.createPackageContents();

		// Initialize created meta-data
		theTracesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracesPackage.eNS_URI, theTracesPackage);
		return theTracesPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment <em>CPS To Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPS To Deployment</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPSToDeployment
	 * @generated
	 */
	public EClass getCPSToDeployment() {
		return cpsToDeploymentEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getCps()
	 * @see #getCPSToDeployment()
	 * @generated
	 */
	public EReference getCPSToDeployment_Cps() {
		return (EReference)cpsToDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getDeployment()
	 * @see #getCPSToDeployment()
	 * @generated
	 */
	public EReference getCPSToDeployment_Deployment() {
		return (EReference)cpsToDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPSToDeployment#getTraces()
	 * @see #getCPSToDeployment()
	 * @generated
	 */
	public EReference getCPSToDeployment_Traces() {
		return (EReference)cpsToDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace <em>CPS2 Deployment Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPS2 Deployment Trace</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace
	 * @generated
	 */
	public EClass getCPS2DeploymentTrace() {
		return cps2DeploymentTraceEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace#getCpsElements <em>Cps Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cps Elements</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace#getCpsElements()
	 * @see #getCPS2DeploymentTrace()
	 * @generated
	 */
	public EReference getCPS2DeploymentTrace_CpsElements() {
		return (EReference)cps2DeploymentTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace#getDeploymentElements <em>Deployment Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployment Elements</em>'.
	 * @see org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace#getDeploymentElements()
	 * @see #getCPS2DeploymentTrace()
	 * @generated
	 */
	public EReference getCPS2DeploymentTrace_DeploymentElements() {
		return (EReference)cps2DeploymentTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TracesFactory getTracesFactory() {
		return (TracesFactory)getEFactoryInstance();
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
		cpsToDeploymentEClass = createEClass(CPS_TO_DEPLOYMENT);
		createEReference(cpsToDeploymentEClass, CPS_TO_DEPLOYMENT__CPS);
		createEReference(cpsToDeploymentEClass, CPS_TO_DEPLOYMENT__DEPLOYMENT);
		createEReference(cpsToDeploymentEClass, CPS_TO_DEPLOYMENT__TRACES);

		cps2DeploymentTraceEClass = createEClass(CPS2_DEPLOYMENT_TRACE);
		createEReference(cps2DeploymentTraceEClass, CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS);
		createEReference(cps2DeploymentTraceEClass, CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS);
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

		// Obtain other dependent packages
		CPSPackage theCPSPackage = (CPSPackage)EPackage.Registry.INSTANCE.getEPackage(CPSPackage.eNS_URI);
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cpsToDeploymentEClass, CPSToDeployment.class, "CPSToDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCPSToDeployment_Cps(), theCPSPackage.getCyberPhysicalSystem(), null, "cps", null, 0, 1, CPSToDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPSToDeployment_Deployment(), theDeploymentPackage.getDeployment(), null, "deployment", null, 0, 1, CPSToDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPSToDeployment_Traces(), this.getCPS2DeploymentTrace(), null, "traces", null, 0, -1, CPSToDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cps2DeploymentTraceEClass, CPS2DeploymentTrace.class, "CPS2DeploymentTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCPS2DeploymentTrace_CpsElements(), theCPSPackage.getIdentifiable(), null, "cpsElements", null, 0, -1, CPS2DeploymentTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPS2DeploymentTrace_DeploymentElements(), theDeploymentPackage.getDeploymentElement(), null, "deploymentElements", null, 0, -1, CPS2DeploymentTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.traces.CPSToDeployment <em>CPS To Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.traces.CPSToDeployment
		 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPSToDeployment()
		 * @generated
		 */
		public static final EClass CPS_TO_DEPLOYMENT = eINSTANCE.getCPSToDeployment();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CPS_TO_DEPLOYMENT__CPS = eINSTANCE.getCPSToDeployment_Cps();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CPS_TO_DEPLOYMENT__DEPLOYMENT = eINSTANCE.getCPSToDeployment_Deployment();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CPS_TO_DEPLOYMENT__TRACES = eINSTANCE.getCPSToDeployment_Traces();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace <em>CPS2 Deployment Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.traces.CPS2DeploymentTrace
		 * @see org.eclipse.viatra.examples.cps.traces.TracesPackage#getCPS2DeploymentTrace()
		 * @generated
		 */
		public static final EClass CPS2_DEPLOYMENT_TRACE = eINSTANCE.getCPS2DeploymentTrace();

		/**
		 * The meta object literal for the '<em><b>Cps Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CPS2_DEPLOYMENT_TRACE__CPS_ELEMENTS = eINSTANCE.getCPS2DeploymentTrace_CpsElements();

		/**
		 * The meta object literal for the '<em><b>Deployment Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CPS2_DEPLOYMENT_TRACE__DEPLOYMENT_ELEMENTS = eINSTANCE.getCPS2DeploymentTrace_DeploymentElements();

	}

} //TracesPackage
