/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.macrotasks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.jeevaneo.naja.macrotasks.MacrotasksFactory
 * @model kind="package"
 * @generated
 */
public interface MacrotasksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "macrotasks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://naja.jeevaneo.com/macrotasks/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "macrotasks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MacrotasksPackage eINSTANCE = com.jeevaneo.naja.macrotasks.impl.MacrotasksPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.macrotasks.impl.MacrotaskImpl <em>Macrotask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.macrotasks.impl.MacrotaskImpl
	 * @see com.jeevaneo.naja.macrotasks.impl.MacrotasksPackageImpl#getMacrotask()
	 * @generated
	 */
	int MACROTASK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROTASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROTASK__TASKS = 1;

	/**
	 * The number of structural features of the '<em>Macrotask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROTASK_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.macrotasks.Macrotask <em>Macrotask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macrotask</em>'.
	 * @see com.jeevaneo.naja.macrotasks.Macrotask
	 * @generated
	 */
	EClass getMacrotask();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.macrotasks.Macrotask#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.jeevaneo.naja.macrotasks.Macrotask#getId()
	 * @see #getMacrotask()
	 * @generated
	 */
	EAttribute getMacrotask_Id();

	/**
	 * Returns the meta object for the reference list '{@link com.jeevaneo.naja.macrotasks.Macrotask#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see com.jeevaneo.naja.macrotasks.Macrotask#getTasks()
	 * @see #getMacrotask()
	 * @generated
	 */
	EReference getMacrotask_Tasks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MacrotasksFactory getMacrotasksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.macrotasks.impl.MacrotaskImpl <em>Macrotask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.macrotasks.impl.MacrotaskImpl
		 * @see com.jeevaneo.naja.macrotasks.impl.MacrotasksPackageImpl#getMacrotask()
		 * @generated
		 */
		EClass MACROTASK = eINSTANCE.getMacrotask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACROTASK__ID = eINSTANCE.getMacrotask_Id();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACROTASK__TASKS = eINSTANCE.getMacrotask_Tasks();

	}

} //MacrotasksPackage
