/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.macrotasks.impl;

import com.jeevaneo.naja.NajaPackage;

import com.jeevaneo.naja.macrotasks.Macrotask;
import com.jeevaneo.naja.macrotasks.MacrotasksFactory;
import com.jeevaneo.naja.macrotasks.MacrotasksPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacrotasksPackageImpl extends EPackageImpl implements MacrotasksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macrotaskEClass = null;

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
	 * @see com.jeevaneo.naja.macrotasks.MacrotasksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MacrotasksPackageImpl() {
		super(eNS_URI, MacrotasksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MacrotasksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MacrotasksPackage init() {
		if (isInited) return (MacrotasksPackage)EPackage.Registry.INSTANCE.getEPackage(MacrotasksPackage.eNS_URI);

		// Obtain or create and register package
		MacrotasksPackageImpl theMacrotasksPackage = (MacrotasksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MacrotasksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MacrotasksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NajaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMacrotasksPackage.createPackageContents();

		// Initialize created meta-data
		theMacrotasksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMacrotasksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MacrotasksPackage.eNS_URI, theMacrotasksPackage);
		return theMacrotasksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacrotask() {
		return macrotaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacrotask_Id() {
		return (EAttribute)macrotaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacrotask_Tasks() {
		return (EReference)macrotaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacrotasksFactory getMacrotasksFactory() {
		return (MacrotasksFactory)getEFactoryInstance();
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
		macrotaskEClass = createEClass(MACROTASK);
		createEAttribute(macrotaskEClass, MACROTASK__ID);
		createEReference(macrotaskEClass, MACROTASK__TASKS);
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
		NajaPackage theNajaPackage = (NajaPackage)EPackage.Registry.INSTANCE.getEPackage(NajaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(macrotaskEClass, Macrotask.class, "Macrotask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacrotask_Id(), ecorePackage.getEString(), "id", "\"\"+ System.currentTimeMillis()", 1, 1, Macrotask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMacrotask_Tasks(), theNajaPackage.getTask(), null, "tasks", null, 0, -1, Macrotask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MacrotasksPackageImpl
