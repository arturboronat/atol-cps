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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.viatra.examples.cps.CPS.CPSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.viatra.query.querybasedfeature'"
 * @generated
 */
public class CPSPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "CPS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://org.eclipse.viatra/model/cps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CPSPackage eINSTANCE = org.eclipse.viatra.examples.cps.CPS.CPSPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.Identifiable
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getIdentifiable()
	 * @generated
	 */
	public static final int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIABLE__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem <em>Cyber Physical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem()
	 * @generated
	 */
	public static final int CYBER_PHYSICAL_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Db Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM__DB_URL = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM__APP_TYPES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM__REQUESTS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM__HOST_TYPES = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CYBER_PHYSICAL_SYSTEM_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType <em>Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType()
	 * @generated
	 */
	public static final int APPLICATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Exe File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__EXE_FILE_LOCATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__EXE_TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zip File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__ZIP_FILE_URL = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__REQUIREMENTS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__CPS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__INSTANCES = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__BEHAVIOR = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exe File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE__EXE_FILE_SIZE = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_TYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.HostType <em>Host Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType()
	 * @generated
	 */
	public static final int HOST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Default Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE__DEFAULT_CPU = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE__DEFAULT_RAM = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE__DEFAULT_HDD = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE__CPS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE__INSTANCES = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_TYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement <em>Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement()
	 * @generated
	 */
	public static final int RESOURCE_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Required Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT__REQUIRED_CPU = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT__REQUIRED_RAM = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT__REQUIRED_HDD = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT__TYPE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_REQUIREMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance <em>Host Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance()
	 * @generated
	 */
	public static final int HOST_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Node Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__NODE_IP = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__AVAILABLE_CPU = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__AVAILABLE_RAM = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__AVAILABLE_HDD = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__TOTAL_CPU = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__TOTAL_RAM = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Total Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__TOTAL_HDD = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__APPLICATIONS = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Communicate With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE__COMMUNICATE_WITH = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOST_INSTANCE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance <em>Application Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance()
	 * @generated
	 */
	public static final int APPLICATION_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__STATE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__DB_USER = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__DB_PASSWORD = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__ALLOCATED_TO = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depend On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__DEPEND_ON = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE__PRIORITY = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Application Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Application Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INSTANCE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.Request <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.Request
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequest()
	 * @generated
	 */
	public static final int REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__REQUIREMENTS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement()
	 * @generated
	 */
	public static final int REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__REQUEST = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__TYPE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__APPLICATIONS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__MANDATORY = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Available Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT__AVAILABLE_PORTS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.StateMachine
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__STATES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__INITIAL = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.State
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getState()
	 * @generated
	 */
	public static final int STATE = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__OUTGOING_TRANSITIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.Transition
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_STATE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.examples.cps.CPS.AppState <em>App State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.examples.cps.CPS.AppState
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getAppState()
	 * @generated
	 */
	public static final int APP_STATE = 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyberPhysicalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appStateEEnum = null;

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
	 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CPSPackage() {
		super(eNS_URI, CPSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CPSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CPSPackage init() {
		if (isInited) return (CPSPackage)EPackage.Registry.INSTANCE.getEPackage(CPSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCPSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CPSPackage theCPSPackage = registeredCPSPackage instanceof CPSPackage ? (CPSPackage)registeredCPSPackage : new CPSPackage();

		isInited = true;

		// Create package meta-data objects
		theCPSPackage.createPackageContents();

		// Initialize created meta-data
		theCPSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCPSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CPSPackage.eNS_URI, theCPSPackage);
		return theCPSPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Identifiable
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.Identifiable#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Identifiable#getIdentifier()
	 * @see #getIdentifiable()
	 * @generated
	 */
	public EAttribute getIdentifiable_Identifier() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem <em>Cyber Physical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyber Physical System</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem
	 * @generated
	 */
	public EClass getCyberPhysicalSystem() {
		return cyberPhysicalSystemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getDbUrl <em>Db Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Url</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getDbUrl()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	public EAttribute getCyberPhysicalSystem_DbUrl() {
		return (EAttribute)cyberPhysicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getAppTypes <em>App Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App Types</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getAppTypes()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	public EReference getCyberPhysicalSystem_AppTypes() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requests</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getRequests()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	public EReference getCyberPhysicalSystem_Requests() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Types</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem#getHostTypes()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	public EReference getCyberPhysicalSystem_HostTypes() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Type</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType
	 * @generated
	 */
	public EClass getApplicationType() {
		return applicationTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileLocation <em>Exe File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe File Location</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileLocation()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EAttribute getApplicationType_ExeFileLocation() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeType <em>Exe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe Type</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeType()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EAttribute getApplicationType_ExeType() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getZipFileUrl <em>Zip File Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip File Url</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getZipFileUrl()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EAttribute getApplicationType_ZipFileUrl() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getRequirements()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EReference getApplicationType_Requirements() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cps</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getCps()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EReference getApplicationType_Cps() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getInstances()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EReference getApplicationType_Instances() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getBehavior()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EReference getApplicationType_Behavior() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileSize <em>Exe File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe File Size</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType#getExeFileSize()
	 * @see #getApplicationType()
	 * @generated
	 */
	public EAttribute getApplicationType_ExeFileSize() {
		return (EAttribute)applicationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.HostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Type</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType
	 * @generated
	 */
	public EClass getHostType() {
		return hostTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultCpu <em>Default Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cpu</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultCpu()
	 * @see #getHostType()
	 * @generated
	 */
	public EAttribute getHostType_DefaultCpu() {
		return (EAttribute)hostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultRam <em>Default Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Ram</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultRam()
	 * @see #getHostType()
	 * @generated
	 */
	public EAttribute getHostType_DefaultRam() {
		return (EAttribute)hostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultHdd <em>Default Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Hdd</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType#getDefaultHdd()
	 * @see #getHostType()
	 * @generated
	 */
	public EAttribute getHostType_DefaultHdd() {
		return (EAttribute)hostTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cps</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType#getCps()
	 * @see #getHostType()
	 * @generated
	 */
	public EReference getHostType_Cps() {
		return (EReference)hostTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.HostType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostType#getInstances()
	 * @see #getHostType()
	 * @generated
	 */
	public EReference getHostType_Instances() {
		return (EReference)hostTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement
	 * @generated
	 */
	public EClass getResourceRequirement() {
		return resourceRequirementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredCpu <em>Required Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Cpu</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredCpu()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	public EAttribute getResourceRequirement_RequiredCpu() {
		return (EAttribute)resourceRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredRam <em>Required Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Ram</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredRam()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	public EAttribute getResourceRequirement_RequiredRam() {
		return (EAttribute)resourceRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Hdd</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getRequiredHdd()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	public EAttribute getResourceRequirement_RequiredHdd() {
		return (EAttribute)resourceRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement#getType()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	public EReference getResourceRequirement_Type() {
		return (EReference)resourceRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance <em>Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Instance</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance
	 * @generated
	 */
	public EClass getHostInstance() {
		return hostInstanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getNodeIp <em>Node Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Ip</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getNodeIp()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_NodeIp() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableCpu <em>Available Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Cpu</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableCpu()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_AvailableCpu() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableRam <em>Available Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Ram</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableRam()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_AvailableRam() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableHdd <em>Available Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Hdd</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getAvailableHdd()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_AvailableHdd() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalCpu <em>Total Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cpu</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalCpu()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_TotalCpu() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalRam <em>Total Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Ram</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalRam()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_TotalRam() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalHdd <em>Total Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Hdd</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getTotalHdd()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EAttribute getHostInstance_TotalHdd() {
		return (EAttribute)hostInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getApplications()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EReference getHostInstance_Applications() {
		return (EReference)hostInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance#getCommunicateWith <em>Communicate With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicate With</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance#getCommunicateWith()
	 * @see #getHostInstance()
	 * @generated
	 */
	public EReference getHostInstance_CommunicateWith() {
		return (EReference)hostInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance <em>Application Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Instance</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance
	 * @generated
	 */
	public EClass getApplicationInstance() {
		return applicationInstanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getState()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EAttribute getApplicationInstance_State() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbUser <em>Db User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db User</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbUser()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EAttribute getApplicationInstance_DbUser() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDbPassword()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EAttribute getApplicationInstance_DbPassword() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated To</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getAllocatedTo()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EReference getApplicationInstance_AllocatedTo() {
		return (EReference)applicationInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDependOn <em>Depend On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depend On</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getDependOn()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EReference getApplicationInstance_DependOn() {
		return (EReference)applicationInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getType()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EReference getApplicationInstance_Type() {
		return (EReference)applicationInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance#getPriority()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	public EAttribute getApplicationInstance_Priority() {
		return (EAttribute)applicationInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Request
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.Request#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Request#getRequirements()
	 * @see #getRequest()
	 * @generated
	 */
	public EReference getRequest_Requirements() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement#getCount()
	 * @see #getRequirement()
	 * @generated
	 */
	public EAttribute getRequirement_Count() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Request</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement#getRequest()
	 * @see #getRequirement()
	 * @generated
	 */
	public EReference getRequirement_Request() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	public EReference getRequirement_Type() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement#getApplications()
	 * @see #getRequirement()
	 * @generated
	 */
	public EReference getRequirement_Applications() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement#isMandatory()
	 * @see #getRequirement()
	 * @generated
	 */
	public EAttribute getRequirement_Mandatory() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.viatra.examples.cps.CPS.Requirement#getAvailablePorts <em>Available Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available Ports</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Requirement#getAvailablePorts()
	 * @see #getRequirement()
	 * @generated
	 */
	public EAttribute getRequirement_AvailablePorts() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.StateMachine
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_States() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.CPS.StateMachine#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.StateMachine#getInitial()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Initial() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.State
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.examples.cps.CPS.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_OutgoingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.examples.cps.CPS.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Transition
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.examples.cps.CPS.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Transition#getTargetState()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_TargetState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.examples.cps.CPS.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Action() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.examples.cps.CPS.AppState <em>App State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>App State</em>'.
	 * @see org.eclipse.viatra.examples.cps.CPS.AppState
	 * @generated
	 */
	public EEnum getAppState() {
		return appStateEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public CPSFactory getCPSFactory() {
		return (CPSFactory)getEFactoryInstance();
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
		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__IDENTIFIER);

		cyberPhysicalSystemEClass = createEClass(CYBER_PHYSICAL_SYSTEM);
		createEAttribute(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__DB_URL);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__APP_TYPES);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__REQUESTS);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__HOST_TYPES);

		applicationTypeEClass = createEClass(APPLICATION_TYPE);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__EXE_FILE_LOCATION);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__EXE_TYPE);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__ZIP_FILE_URL);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__REQUIREMENTS);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__CPS);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__INSTANCES);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__BEHAVIOR);
		createEAttribute(applicationTypeEClass, APPLICATION_TYPE__EXE_FILE_SIZE);

		hostTypeEClass = createEClass(HOST_TYPE);
		createEAttribute(hostTypeEClass, HOST_TYPE__DEFAULT_CPU);
		createEAttribute(hostTypeEClass, HOST_TYPE__DEFAULT_RAM);
		createEAttribute(hostTypeEClass, HOST_TYPE__DEFAULT_HDD);
		createEReference(hostTypeEClass, HOST_TYPE__CPS);
		createEReference(hostTypeEClass, HOST_TYPE__INSTANCES);

		resourceRequirementEClass = createEClass(RESOURCE_REQUIREMENT);
		createEAttribute(resourceRequirementEClass, RESOURCE_REQUIREMENT__REQUIRED_CPU);
		createEAttribute(resourceRequirementEClass, RESOURCE_REQUIREMENT__REQUIRED_RAM);
		createEAttribute(resourceRequirementEClass, RESOURCE_REQUIREMENT__REQUIRED_HDD);
		createEReference(resourceRequirementEClass, RESOURCE_REQUIREMENT__TYPE);

		hostInstanceEClass = createEClass(HOST_INSTANCE);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__NODE_IP);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__AVAILABLE_CPU);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__AVAILABLE_RAM);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__AVAILABLE_HDD);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__TOTAL_CPU);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__TOTAL_RAM);
		createEAttribute(hostInstanceEClass, HOST_INSTANCE__TOTAL_HDD);
		createEReference(hostInstanceEClass, HOST_INSTANCE__APPLICATIONS);
		createEReference(hostInstanceEClass, HOST_INSTANCE__COMMUNICATE_WITH);

		applicationInstanceEClass = createEClass(APPLICATION_INSTANCE);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__STATE);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__DB_USER);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__DB_PASSWORD);
		createEReference(applicationInstanceEClass, APPLICATION_INSTANCE__ALLOCATED_TO);
		createEReference(applicationInstanceEClass, APPLICATION_INSTANCE__DEPEND_ON);
		createEReference(applicationInstanceEClass, APPLICATION_INSTANCE__TYPE);
		createEAttribute(applicationInstanceEClass, APPLICATION_INSTANCE__PRIORITY);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__REQUIREMENTS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__COUNT);
		createEReference(requirementEClass, REQUIREMENT__REQUEST);
		createEReference(requirementEClass, REQUIREMENT__TYPE);
		createEReference(requirementEClass, REQUIREMENT__APPLICATIONS);
		createEAttribute(requirementEClass, REQUIREMENT__MANDATORY);
		createEAttribute(requirementEClass, REQUIREMENT__AVAILABLE_PORTS);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__STATES);
		createEReference(stateMachineEClass, STATE_MACHINE__INITIAL);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET_STATE);
		createEAttribute(transitionEClass, TRANSITION__ACTION);

		// Create enums
		appStateEEnum = createEEnum(APP_STATE);
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
		cyberPhysicalSystemEClass.getESuperTypes().add(this.getIdentifiable());
		applicationTypeEClass.getESuperTypes().add(this.getIdentifiable());
		hostTypeEClass.getESuperTypes().add(this.getIdentifiable());
		resourceRequirementEClass.getESuperTypes().add(this.getIdentifiable());
		hostInstanceEClass.getESuperTypes().add(this.getIdentifiable());
		applicationInstanceEClass.getESuperTypes().add(this.getIdentifiable());
		requestEClass.getESuperTypes().add(this.getIdentifiable());
		requirementEClass.getESuperTypes().add(this.getIdentifiable());
		stateMachineEClass.getESuperTypes().add(this.getIdentifiable());
		stateEClass.getESuperTypes().add(this.getIdentifiable());
		transitionEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cyberPhysicalSystemEClass, CyberPhysicalSystem.class, "CyberPhysicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCyberPhysicalSystem_DbUrl(), ecorePackage.getEString(), "dbUrl", null, 0, 1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyberPhysicalSystem_AppTypes(), this.getApplicationType(), this.getApplicationType_Cps(), "appTypes", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyberPhysicalSystem_Requests(), this.getRequest(), null, "requests", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyberPhysicalSystem_HostTypes(), this.getHostType(), this.getHostType_Cps(), "hostTypes", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationTypeEClass, ApplicationType.class, "ApplicationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationType_ExeFileLocation(), ecorePackage.getEString(), "exeFileLocation", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationType_ExeType(), ecorePackage.getEString(), "exeType", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationType_ZipFileUrl(), ecorePackage.getEString(), "zipFileUrl", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Requirements(), this.getResourceRequirement(), null, "requirements", null, 0, -1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Cps(), this.getCyberPhysicalSystem(), this.getCyberPhysicalSystem_AppTypes(), "cps", null, 1, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Instances(), this.getApplicationInstance(), this.getApplicationInstance_Type(), "instances", null, 0, -1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Behavior(), this.getStateMachine(), null, "behavior", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationType_ExeFileSize(), ecorePackage.getELong(), "exeFileSize", null, 0, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostTypeEClass, HostType.class, "HostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostType_DefaultCpu(), ecorePackage.getEInt(), "defaultCpu", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostType_DefaultRam(), ecorePackage.getEInt(), "defaultRam", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostType_DefaultHdd(), ecorePackage.getEInt(), "defaultHdd", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostType_Cps(), this.getCyberPhysicalSystem(), this.getCyberPhysicalSystem_HostTypes(), "cps", null, 1, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostType_Instances(), this.getHostInstance(), null, "instances", null, 0, -1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRequirementEClass, ResourceRequirement.class, "ResourceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRequirement_RequiredCpu(), ecorePackage.getEInt(), "requiredCpu", null, 0, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRequirement_RequiredRam(), ecorePackage.getEInt(), "requiredRam", null, 0, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRequirement_RequiredHdd(), ecorePackage.getEInt(), "requiredHdd", null, 0, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRequirement_Type(), this.getHostType(), null, "type", null, 1, 1, ResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostInstanceEClass, HostInstance.class, "HostInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostInstance_NodeIp(), ecorePackage.getEString(), "nodeIp", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_AvailableCpu(), ecorePackage.getEInt(), "availableCpu", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_AvailableRam(), ecorePackage.getEInt(), "availableRam", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_AvailableHdd(), ecorePackage.getEInt(), "availableHdd", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_TotalCpu(), ecorePackage.getEInt(), "totalCpu", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_TotalRam(), ecorePackage.getEInt(), "totalRam", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostInstance_TotalHdd(), ecorePackage.getEInt(), "totalHdd", null, 0, 1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostInstance_Applications(), this.getApplicationInstance(), this.getApplicationInstance_AllocatedTo(), "applications", null, 0, -1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostInstance_CommunicateWith(), this.getHostInstance(), null, "communicateWith", null, 0, -1, HostInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationInstanceEClass, ApplicationInstance.class, "ApplicationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationInstance_State(), this.getAppState(), "state", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_DbUser(), ecorePackage.getEString(), "dbUser", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_DbPassword(), ecorePackage.getEString(), "dbPassword", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInstance_AllocatedTo(), this.getHostInstance(), this.getHostInstance_Applications(), "allocatedTo", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInstance_DependOn(), this.getApplicationInstance(), null, "dependOn", null, 0, -1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationInstance_Type(), this.getApplicationType(), this.getApplicationType_Instances(), "type", null, 1, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationInstance_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, ApplicationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Requirements(), this.getRequirement(), this.getRequirement_Request(), "requirements", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Count(), ecorePackage.getEInt(), "count", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Request(), this.getRequest(), this.getRequest_Requirements(), "request", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Type(), this.getApplicationType(), null, "type", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Applications(), this.getApplicationInstance(), null, "applications", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Mandatory(), ecorePackage.getEBoolean(), "mandatory", "true", 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_AvailablePorts(), ecorePackage.getEInt(), "availablePorts", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_States(), this.getState(), null, "states", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Initial(), this.getState(), null, "initial", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_TargetState(), this.getState(), null, "targetState", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Action(), ecorePackage.getEString(), "action", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(appStateEEnum, AppState.class, "AppState");
		addEEnumLiteral(appStateEEnum, AppState.RUNNING);
		addEEnumLiteral(appStateEEnum, AppState.STOPPED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "settingDelegates", "org.eclipse.viatra.query.querybasedfeature"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (identifiableEClass,
		   source,
		   new String[] {
			   "documentation", "An identifiable element of the CPS domain has a unique identifier."
		   });
		addAnnotation
		  (getIdentifiable_Identifier(),
		   source,
		   new String[] {
			   "documentation", "An identifier is used as both a user-facing name and an identifier for serialization. Must be unique."
		   });
		addAnnotation
		  (cyberPhysicalSystemEClass,
		   source,
		   new String[] {
			   "documentation", "The cyber-physical system instance acts as a container of a cps model."
		   });
		addAnnotation
		  (applicationTypeEClass,
		   source,
		   new String[] {
			   "documentation", "A descriptor for a class of applications."
		   });
		addAnnotation
		  (getApplicationType_ExeFileLocation(),
		   source,
		   new String[] {
			   "documentation", "Where to look for the executable file."
		   });
		addAnnotation
		  (getApplicationType_ExeType(),
		   source,
		   new String[] {
			   "documentation", "The type of the executable file."
		   });
		addAnnotation
		  (getApplicationType_Requirements(),
		   source,
		   new String[] {
			   "documentation", "The resource requirements of the application are stored in this reference."
		   });
		addAnnotation
		  (getApplicationType_Cps(),
		   source,
		   new String[] {
			   "documentation", "A reference to the container instance."
		   });
		addAnnotation
		  (getApplicationType_Instances(),
		   source,
		   new String[] {
			   "documentation", "All known instances of this type."
		   });
		addAnnotation
		  (getApplicationType_Behavior(),
		   source,
		   new String[] {
			   "documentation", "An optional state machine describing the behavior of the application."
		   });
		addAnnotation
		  (getApplicationType_ExeFileSize(),
		   source,
		   new String[] {
			   "documentation", "The size of the executable in bytes."
		   });
		addAnnotation
		  (hostTypeEClass,
		   source,
		   new String[] {
			   "documentation", "A class describing common properties of a set of hosts."
		   });
		addAnnotation
		  (getHostType_DefaultCpu(),
		   source,
		   new String[] {
			   "documentation", "If a host instance does not set the total CPU attribute, this default value should be used instead."
		   });
		addAnnotation
		  (getHostType_DefaultRam(),
		   source,
		   new String[] {
			   "documentation", "If a host instance does not set the total RAM attribute, this default value should be used instead."
		   });
		addAnnotation
		  (getHostType_DefaultHdd(),
		   source,
		   new String[] {
			   "documentation", "If a host instance does not set the total HDD attribute, this default value should be used instead."
		   });
		addAnnotation
		  (getHostType_Cps(),
		   source,
		   new String[] {
			   "documentation", "A reference to the container model."
		   });
		addAnnotation
		  (getHostType_Instances(),
		   source,
		   new String[] {
			   "documentation", "A list to the instances of the selected host type."
		   });
		addAnnotation
		  (resourceRequirementEClass,
		   source,
		   new String[] {
			   "documentation", "This class represents the requirements of a given application type."
		   });
		addAnnotation
		  (getResourceRequirement_RequiredCpu(),
		   source,
		   new String[] {
			   "documentation", "This field stores the number of CPUs required in a non-negative number."
		   });
		addAnnotation
		  (getResourceRequirement_RequiredRam(),
		   source,
		   new String[] {
			   "documentation", "This field stores the amount of RAM required in MB as a non-negative number."
		   });
		addAnnotation
		  (getResourceRequirement_RequiredHdd(),
		   source,
		   new String[] {
			   "documentation", "This field stores the amount of persistent storage required in MB as a non-negative number."
		   });
		addAnnotation
		  (getResourceRequirement_Type(),
		   source,
		   new String[] {
			   "documentation", "This field represents the required host type."
		   });
		addAnnotation
		  (hostInstanceEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a single host in the system"
		   });
		addAnnotation
		  (getHostInstance_NodeIp(),
		   source,
		   new String[] {
			   "documentation", "The IP address of the given host instance. Must be unique."
		   });
		addAnnotation
		  (getHostInstance_AvailableCpu(),
		   source,
		   new String[] {
			   "documentation", "The number of CPUs that are not bound for any applications."
		   });
		addAnnotation
		  (getHostInstance_AvailableRam(),
		   source,
		   new String[] {
			   "documentation", "The amount of RAM not bound for any applications."
		   });
		addAnnotation
		  (getHostInstance_AvailableHdd(),
		   source,
		   new String[] {
			   "documentation", "The amount of persistent storage not bound for any applications."
		   });
		addAnnotation
		  (getHostInstance_TotalCpu(),
		   source,
		   new String[] {
			   "documentation", "The total number of CPUs available. If unspecified, the default value from the corresponding host type should be used."
		   });
		addAnnotation
		  (getHostInstance_TotalRam(),
		   source,
		   new String[] {
			   "documentation", "The total amount of RAM available. If unspecified, the default value from the corresponding host type should be used."
		   });
		addAnnotation
		  (getHostInstance_TotalHdd(),
		   source,
		   new String[] {
			   "documentation", "The total amount of persistent storage available. If unspecified, the default value from the corresponding host type should be used."
		   });
		addAnnotation
		  (getHostInstance_Applications(),
		   source,
		   new String[] {
			   "documentation", "All application instances running on this host."
		   });
		addAnnotation
		  (getHostInstance_CommunicateWith(),
		   source,
		   new String[] {
			   "documentation", "This reference enumerates host instances the current instance needs to communicate with."
		   });
		addAnnotation
		  (applicationInstanceEClass,
		   source,
		   new String[] {
			   "documentation", "Represents an application instance."
		   });
		addAnnotation
		  (getApplicationInstance_State(),
		   source,
		   new String[] {
			   "documentation", "Represents whether the application is running."
		   });
		addAnnotation
		  (getApplicationInstance_AllocatedTo(),
		   source,
		   new String[] {
			   "documentation", "The host instances this application is running on."
		   });
		addAnnotation
		  (getApplicationInstance_DependOn(),
		   source,
		   new String[] {
			   "documentation", "Other application instances the current one depends on."
		   });
		addAnnotation
		  (getApplicationInstance_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of the application."
		   });
		addAnnotation
		  (getApplicationInstance_Priority(),
		   source,
		   new String[] {
			   "documentation", "The priority of the application; larger number means higher priority."
		   });
		addAnnotation
		  (appStateEEnum,
		   source,
		   new String[] {
			   "documentation", "Represents whether an application is running."
		   });
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a requested requirement."
		   });
		addAnnotation
		  (getRequirement_Count(),
		   source,
		   new String[] {
			   "documentation", "The number of instances required."
		   });
		addAnnotation
		  (getRequirement_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of required application."
		   });
		addAnnotation
		  (getRequirement_Applications(),
		   source,
		   new String[] {
			   "documentation", "The concrete application instances fulfilling the original requirement."
		   });
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[] {
			   "documentation", "A state machine is used to define the behavior of a given application type."
		   });
		addAnnotation
		  (getStateMachine_States(),
		   source,
		   new String[] {
			   "documentation", "All states the state machine uses."
		   });
		addAnnotation
		  (getStateMachine_Initial(),
		   source,
		   new String[] {
			   "documentation", "The specific initial state of the state machine; should be a member of the states reference as well."
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[] {
			   "documentation", "A state of a state machine."
		   });
		addAnnotation
		  (getState_OutgoingTransitions(),
		   source,
		   new String[] {
			   "documentation", "A list of all transitions starting from the current state."
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation", "A transition in a state machine."
		   });
		addAnnotation
		  (getTransition_TargetState(),
		   source,
		   new String[] {
			   "documentation", "The state this transition ends in."
		   });
		addAnnotation
		  (getTransition_Action(),
		   source,
		   new String[] {
			   "documentation", "The action may specify either waiting for a signal with a given ID or sending a signal with a given ID to another application with a given type ID.\r\n- Use waitForSignal(signal) to specify waiting for signal\r\n- Use sendSignal(app, signal) to specify sending a signal to an app\r\n\r\nRestrictions:\r\n- Only one action is allowed in a transition\r\n- There can be only a single application instance for the given application type ID on host instances that the host on which the sending application instance is allocated to can communicate with."
		   });
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
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.Identifiable
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getIdentifiable()
		 * @generated
		 */
		public static final EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IDENTIFIABLE__IDENTIFIER = eINSTANCE.getIdentifiable_Identifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem <em>Cyber Physical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.CyberPhysicalSystem
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getCyberPhysicalSystem()
		 * @generated
		 */
		public static final EClass CYBER_PHYSICAL_SYSTEM = eINSTANCE.getCyberPhysicalSystem();

		/**
		 * The meta object literal for the '<em><b>Db Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CYBER_PHYSICAL_SYSTEM__DB_URL = eINSTANCE.getCyberPhysicalSystem_DbUrl();

		/**
		 * The meta object literal for the '<em><b>App Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CYBER_PHYSICAL_SYSTEM__APP_TYPES = eINSTANCE.getCyberPhysicalSystem_AppTypes();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CYBER_PHYSICAL_SYSTEM__REQUESTS = eINSTANCE.getCyberPhysicalSystem_Requests();

		/**
		 * The meta object literal for the '<em><b>Host Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CYBER_PHYSICAL_SYSTEM__HOST_TYPES = eINSTANCE.getCyberPhysicalSystem_HostTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationType <em>Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationType
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationType()
		 * @generated
		 */
		public static final EClass APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '<em><b>Exe File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_TYPE__EXE_FILE_LOCATION = eINSTANCE.getApplicationType_ExeFileLocation();

		/**
		 * The meta object literal for the '<em><b>Exe Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_TYPE__EXE_TYPE = eINSTANCE.getApplicationType_ExeType();

		/**
		 * The meta object literal for the '<em><b>Zip File Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_TYPE__ZIP_FILE_URL = eINSTANCE.getApplicationType_ZipFileUrl();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_TYPE__REQUIREMENTS = eINSTANCE.getApplicationType_Requirements();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_TYPE__CPS = eINSTANCE.getApplicationType_Cps();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_TYPE__INSTANCES = eINSTANCE.getApplicationType_Instances();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_TYPE__BEHAVIOR = eINSTANCE.getApplicationType_Behavior();

		/**
		 * The meta object literal for the '<em><b>Exe File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_TYPE__EXE_FILE_SIZE = eINSTANCE.getApplicationType_ExeFileSize();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.HostType <em>Host Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.HostType
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostType()
		 * @generated
		 */
		public static final EClass HOST_TYPE = eINSTANCE.getHostType();

		/**
		 * The meta object literal for the '<em><b>Default Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_TYPE__DEFAULT_CPU = eINSTANCE.getHostType_DefaultCpu();

		/**
		 * The meta object literal for the '<em><b>Default Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_TYPE__DEFAULT_RAM = eINSTANCE.getHostType_DefaultRam();

		/**
		 * The meta object literal for the '<em><b>Default Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_TYPE__DEFAULT_HDD = eINSTANCE.getHostType_DefaultHdd();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOST_TYPE__CPS = eINSTANCE.getHostType_Cps();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOST_TYPE__INSTANCES = eINSTANCE.getHostType_Instances();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.ResourceRequirement <em>Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.ResourceRequirement
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getResourceRequirement()
		 * @generated
		 */
		public static final EClass RESOURCE_REQUIREMENT = eINSTANCE.getResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESOURCE_REQUIREMENT__REQUIRED_CPU = eINSTANCE.getResourceRequirement_RequiredCpu();

		/**
		 * The meta object literal for the '<em><b>Required Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESOURCE_REQUIREMENT__REQUIRED_RAM = eINSTANCE.getResourceRequirement_RequiredRam();

		/**
		 * The meta object literal for the '<em><b>Required Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESOURCE_REQUIREMENT__REQUIRED_HDD = eINSTANCE.getResourceRequirement_RequiredHdd();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESOURCE_REQUIREMENT__TYPE = eINSTANCE.getResourceRequirement_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.HostInstance <em>Host Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.HostInstance
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getHostInstance()
		 * @generated
		 */
		public static final EClass HOST_INSTANCE = eINSTANCE.getHostInstance();

		/**
		 * The meta object literal for the '<em><b>Node Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__NODE_IP = eINSTANCE.getHostInstance_NodeIp();

		/**
		 * The meta object literal for the '<em><b>Available Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__AVAILABLE_CPU = eINSTANCE.getHostInstance_AvailableCpu();

		/**
		 * The meta object literal for the '<em><b>Available Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__AVAILABLE_RAM = eINSTANCE.getHostInstance_AvailableRam();

		/**
		 * The meta object literal for the '<em><b>Available Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__AVAILABLE_HDD = eINSTANCE.getHostInstance_AvailableHdd();

		/**
		 * The meta object literal for the '<em><b>Total Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__TOTAL_CPU = eINSTANCE.getHostInstance_TotalCpu();

		/**
		 * The meta object literal for the '<em><b>Total Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__TOTAL_RAM = eINSTANCE.getHostInstance_TotalRam();

		/**
		 * The meta object literal for the '<em><b>Total Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOST_INSTANCE__TOTAL_HDD = eINSTANCE.getHostInstance_TotalHdd();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOST_INSTANCE__APPLICATIONS = eINSTANCE.getHostInstance_Applications();

		/**
		 * The meta object literal for the '<em><b>Communicate With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOST_INSTANCE__COMMUNICATE_WITH = eINSTANCE.getHostInstance_CommunicateWith();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.ApplicationInstance <em>Application Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.ApplicationInstance
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getApplicationInstance()
		 * @generated
		 */
		public static final EClass APPLICATION_INSTANCE = eINSTANCE.getApplicationInstance();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_INSTANCE__STATE = eINSTANCE.getApplicationInstance_State();

		/**
		 * The meta object literal for the '<em><b>Db User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_INSTANCE__DB_USER = eINSTANCE.getApplicationInstance_DbUser();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_INSTANCE__DB_PASSWORD = eINSTANCE.getApplicationInstance_DbPassword();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_INSTANCE__ALLOCATED_TO = eINSTANCE.getApplicationInstance_AllocatedTo();

		/**
		 * The meta object literal for the '<em><b>Depend On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_INSTANCE__DEPEND_ON = eINSTANCE.getApplicationInstance_DependOn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPLICATION_INSTANCE__TYPE = eINSTANCE.getApplicationInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPLICATION_INSTANCE__PRIORITY = eINSTANCE.getApplicationInstance_Priority();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.Request <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.Request
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequest()
		 * @generated
		 */
		public static final EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUEST__REQUIREMENTS = eINSTANCE.getRequest_Requirements();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.Requirement <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.Requirement
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getRequirement()
		 * @generated
		 */
		public static final EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUIREMENT__COUNT = eINSTANCE.getRequirement_Count();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUIREMENT__REQUEST = eINSTANCE.getRequirement_Request();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUIREMENT__APPLICATIONS = eINSTANCE.getRequirement_Applications();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUIREMENT__MANDATORY = eINSTANCE.getRequirement_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Available Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUIREMENT__AVAILABLE_PORTS = eINSTANCE.getRequirement_AvailablePorts();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.StateMachine
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__INITIAL = eINSTANCE.getStateMachine_Initial();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.State
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.Transition
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.examples.cps.CPS.AppState <em>App State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.examples.cps.CPS.AppState
		 * @see org.eclipse.viatra.examples.cps.CPS.CPSPackage#getAppState()
		 * @generated
		 */
		public static final EEnum APP_STATE = eINSTANCE.getAppState();

	}

} //CPSPackage
