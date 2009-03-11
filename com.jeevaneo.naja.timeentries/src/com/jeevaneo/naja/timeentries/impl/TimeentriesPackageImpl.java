/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries.impl;

import com.jeevaneo.naja.NajaPackage;

import com.jeevaneo.naja.timeentries.TimeEntries;
import com.jeevaneo.naja.timeentries.TimeEntry;
import com.jeevaneo.naja.timeentries.TimeentriesFactory;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;

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
public class TimeentriesPackageImpl extends EPackageImpl implements TimeentriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEntryEClass = null;

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
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimeentriesPackageImpl() {
		super(eNS_URI, TimeentriesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimeentriesPackage init() {
		if (isInited) return (TimeentriesPackage)EPackage.Registry.INSTANCE.getEPackage(TimeentriesPackage.eNS_URI);

		// Obtain or create and register package
		TimeentriesPackageImpl theTimeentriesPackage = (TimeentriesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TimeentriesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TimeentriesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NajaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimeentriesPackage.createPackageContents();

		// Initialize created meta-data
		theTimeentriesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimeentriesPackage.freeze();

		return theTimeentriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEntries() {
		return timeEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEntries_Entries() {
		return (EReference)timeEntriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEntries_Comment() {
		return (EAttribute)timeEntriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEntry() {
		return timeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEntry_Comment() {
		return (EAttribute)timeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEntry_Day() {
		return (EAttribute)timeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEntry_Load() {
		return (EAttribute)timeEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEntry_Resource() {
		return (EReference)timeEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEntry_ExternalId() {
		return (EReference)timeEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEntry_Imputations() {
		return (EReference)timeEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeentriesFactory getTimeentriesFactory() {
		return (TimeentriesFactory)getEFactoryInstance();
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
		timeEntriesEClass = createEClass(TIME_ENTRIES);
		createEReference(timeEntriesEClass, TIME_ENTRIES__ENTRIES);
		createEAttribute(timeEntriesEClass, TIME_ENTRIES__COMMENT);

		timeEntryEClass = createEClass(TIME_ENTRY);
		createEAttribute(timeEntryEClass, TIME_ENTRY__COMMENT);
		createEAttribute(timeEntryEClass, TIME_ENTRY__DAY);
		createEAttribute(timeEntryEClass, TIME_ENTRY__LOAD);
		createEReference(timeEntryEClass, TIME_ENTRY__RESOURCE);
		createEReference(timeEntryEClass, TIME_ENTRY__EXTERNAL_ID);
		createEReference(timeEntryEClass, TIME_ENTRY__IMPUTATIONS);
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
		initEClass(timeEntriesEClass, TimeEntries.class, "TimeEntries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeEntries_Entries(), this.getTimeEntry(), null, "entries", null, 0, -1, TimeEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeEntries_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, TimeEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEntryEClass, TimeEntry.class, "TimeEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEntry_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, TimeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeEntry_Day(), ecorePackage.getEInt(), "day", null, 1, 1, TimeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeEntry_Load(), ecorePackage.getEInt(), "load", null, 1, 1, TimeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeEntry_Resource(), theNajaPackage.getPerson(), null, "resource", null, 1, 1, TimeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeEntry_ExternalId(), theNajaPackage.getTaskMapping(), null, "externalId", null, 1, 1, TimeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeEntry_Imputations(), theNajaPackage.getImputation(), null, "imputations", null, 0, -1, TimeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimeentriesPackageImpl
