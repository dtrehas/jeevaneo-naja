/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries;

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
 * @see com.jeevaneo.naja.timeentries.TimeentriesFactory
 * @model kind="package"
 * @generated
 */
public interface TimeentriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timeentries";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://naja.jeevaneo.com/timeentries/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "naja-te";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeentriesPackage eINSTANCE = com.jeevaneo.naja.timeentries.impl.TimeentriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.timeentries.impl.TimeEntriesImpl <em>Time Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.timeentries.impl.TimeEntriesImpl
	 * @see com.jeevaneo.naja.timeentries.impl.TimeentriesPackageImpl#getTimeEntries()
	 * @generated
	 */
	int TIME_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Time Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl <em>Time Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.timeentries.impl.TimeEntryImpl
	 * @see com.jeevaneo.naja.timeentries.impl.TimeentriesPackageImpl#getTimeEntry()
	 * @generated
	 */
	int TIME_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__DAY = 1;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__LOAD = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__EXTERNAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Imputation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__IMPUTATION = 5;

	/**
	 * The number of structural features of the '<em>Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.timeentries.TimeEntries <em>Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Entries</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntries
	 * @generated
	 */
	EClass getTimeEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.timeentries.TimeEntries#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntries#getEntries()
	 * @see #getTimeEntries()
	 * @generated
	 */
	EReference getTimeEntries_Entries();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.timeentries.TimeEntries#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntries#getComment()
	 * @see #getTimeEntries()
	 * @generated
	 */
	EAttribute getTimeEntries_Comment();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.timeentries.TimeEntry <em>Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Entry</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry
	 * @generated
	 */
	EClass getTimeEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.timeentries.TimeEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry#getComment()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Comment();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.timeentries.TimeEntry#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry#getDay()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Day();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.timeentries.TimeEntry#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry#getLoad()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Load();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.timeentries.TimeEntry#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry#getResource()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_Resource();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.timeentries.TimeEntry#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Id</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry#getExternalId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_ExternalId();

	/**
	 * Returns the meta object for the containment reference '{@link com.jeevaneo.naja.timeentries.TimeEntry#getImputation <em>Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imputation</em>'.
	 * @see com.jeevaneo.naja.timeentries.TimeEntry#getImputation()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_Imputation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeentriesFactory getTimeentriesFactory();

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
		 * The meta object literal for the '{@link com.jeevaneo.naja.timeentries.impl.TimeEntriesImpl <em>Time Entries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.timeentries.impl.TimeEntriesImpl
		 * @see com.jeevaneo.naja.timeentries.impl.TimeentriesPackageImpl#getTimeEntries()
		 * @generated
		 */
		EClass TIME_ENTRIES = eINSTANCE.getTimeEntries();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRIES__ENTRIES = eINSTANCE.getTimeEntries_Entries();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRIES__COMMENT = eINSTANCE.getTimeEntries_Comment();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl <em>Time Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.timeentries.impl.TimeEntryImpl
		 * @see com.jeevaneo.naja.timeentries.impl.TimeentriesPackageImpl#getTimeEntry()
		 * @generated
		 */
		EClass TIME_ENTRY = eINSTANCE.getTimeEntry();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__COMMENT = eINSTANCE.getTimeEntry_Comment();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__DAY = eINSTANCE.getTimeEntry_Day();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__LOAD = eINSTANCE.getTimeEntry_Load();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__RESOURCE = eINSTANCE.getTimeEntry_Resource();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__EXTERNAL_ID = eINSTANCE.getTimeEntry_ExternalId();

		/**
		 * The meta object literal for the '<em><b>Imputation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__IMPUTATION = eINSTANCE.getTimeEntry_Imputation();

	}

} //TimeentriesPackage
