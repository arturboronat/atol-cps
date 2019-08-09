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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.examples.cps.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentFactory init() {
		try {
			DeploymentFactory theDeploymentFactory = (DeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPackage.eNS_URI);
			if (theDeploymentFactory != null) {
				return theDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentPackage.DEPLOYMENT_HOST: return createDeploymentHost();
			case DeploymentPackage.DEPLOYMENT_APPLICATION: return createDeploymentApplication();
			case DeploymentPackage.DEPLOYMENT_BEHAVIOR: return createDeploymentBehavior();
			case DeploymentPackage.BEHAVIOR_STATE: return createBehaviorState();
			case DeploymentPackage.BEHAVIOR_TRANSITION: return createBehaviorTransition();
			case DeploymentPackage.DEPLOYMENT: return createDeployment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentHost createDeploymentHost() {
		DeploymentHost deploymentHost = new DeploymentHost();
		return deploymentHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentApplication createDeploymentApplication() {
		DeploymentApplication deploymentApplication = new DeploymentApplication();
		return deploymentApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentBehavior createDeploymentBehavior() {
		DeploymentBehavior deploymentBehavior = new DeploymentBehavior();
		return deploymentBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorState createBehaviorState() {
		BehaviorState behaviorState = new BehaviorState();
		return behaviorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTransition createBehaviorTransition() {
		BehaviorTransition behaviorTransition = new BehaviorTransition();
		return behaviorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		Deployment deployment = new Deployment();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentPackage getDeploymentPackage() {
		return (DeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentPackage getPackage() {
		return DeploymentPackage.eINSTANCE;
	}

} //DeploymentFactory
