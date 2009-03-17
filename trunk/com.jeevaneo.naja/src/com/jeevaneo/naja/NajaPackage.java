/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja;

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
 * @see com.jeevaneo.naja.NajaFactory
 * @model kind="package"
 * @generated
 */
public interface NajaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "naja";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://naja.jeevaneo.com/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jeevaneo-naja";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NajaPackage eINSTANCE = com.jeevaneo.naja.impl.NajaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.PersonImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOGIN = 1;

	/**
	 * The feature id for the '<em><b>Imputations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IMPUTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Total Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TOTAL_AVAILABILITY = 3;

	/**
	 * The feature id for the '<em><b>Left Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LEFT_AVAILABILITY = 4;

	/**
	 * The feature id for the '<em><b>Planifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PLANIFICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Availability Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AVAILABILITY_START_DATE = 6;

	/**
	 * The feature id for the '<em><b>Available Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AVAILABLE_SCHEDULES = 7;

	/**
	 * The feature id for the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_DATE = 8;

	/**
	 * The feature id for the '<em><b>Max Load Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MAX_LOAD_PER_DAY = 9;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.TaskImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOTAL_LOAD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Imputations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPUTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Planifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PLANIFICATIONS = 3;

	/**
	 * The feature id for the '<em><b>Unaffected Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UNAFFECTED_LOAD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FIRST_DATE = 8;

	/**
	 * The feature id for the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LAST_DATE = 9;

	/**
	 * The feature id for the '<em><b>Imputed Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPUTED_LOAD = 10;

	/**
	 * The feature id for the '<em><b>Total Planified Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOTAL_PLANIFIED_LOAD = 11;

	/**
	 * The feature id for the '<em><b>Unimputed Planified Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UNIMPUTED_PLANIFIED_LOAD = 12;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.ImputationImpl <em>Imputation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.ImputationImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getImputation()
	 * @generated
	 */
	int IMPUTATION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION__DATE = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION__RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION__TASK = 3;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION__LOAD = 4;

	/**
	 * The feature id for the '<em><b>Planification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION__PLANIFICATION = 5;

	/**
	 * The number of structural features of the '<em>Imputation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.PlanificationImpl <em>Planification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.PlanificationImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getPlanification()
	 * @generated
	 */
	int PLANIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__TASK = 2;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__LOAD = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Virtual Imputation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__VIRTUAL_IMPUTATION = 5;

	/**
	 * The feature id for the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__FIRST_DATE = 6;

	/**
	 * The feature id for the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__LAST_DATE = 7;

	/**
	 * The feature id for the '<em><b>Max Load Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__MAX_LOAD_PER_DAY = 8;

	/**
	 * The feature id for the '<em><b>Imputations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__IMPUTATIONS = 9;

	/**
	 * The feature id for the '<em><b>Unimputed Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__UNIMPUTED_LOAD = 10;

	/**
	 * The feature id for the '<em><b>Imputed Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION__IMPUTED_LOAD = 11;

	/**
	 * The number of structural features of the '<em>Planification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.ProjectImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Planifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PLANIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Imputations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IMPUTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CATEGORIES = 4;

	/**
	 * The feature id for the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOTAL_LOAD = 5;

	/**
	 * The feature id for the '<em><b>Unaffected Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__UNAFFECTED_LOAD = 6;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TASKS = 7;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.CategoryImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Parent Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TASKS = 3;

	/**
	 * The feature id for the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TOTAL_LOAD = 4;

	/**
	 * The feature id for the '<em><b>Unaffected Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__UNAFFECTED_LOAD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PRIORITY = 6;

	/**
	 * The feature id for the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__FIRST_DATE = 7;

	/**
	 * The feature id for the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__LAST_DATE = 8;

	/**
	 * The feature id for the '<em><b>Imputed Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IMPUTED_LOAD = 9;

	/**
	 * The feature id for the '<em><b>Total Planified Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TOTAL_PLANIFIED_LOAD = 10;

	/**
	 * The feature id for the '<em><b>Unimputed Planified Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__UNIMPUTED_PLANIFIED_LOAD = 11;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 12;


	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.ScheduleImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__LOAD = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.VirtualImputationImpl <em>Virtual Imputation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.VirtualImputationImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getVirtualImputation()
	 * @generated
	 */
	int VIRTUAL_IMPUTATION = 7;

	/**
	 * The feature id for the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION__TOTAL_LOAD = 0;

	/**
	 * The feature id for the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION__FIRST_DATE = 1;

	/**
	 * The feature id for the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION__LAST_DATE = 2;

	/**
	 * The feature id for the '<em><b>Planification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION__PLANIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION__SCHEDULES = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION__LABEL = 5;

	/**
	 * The number of structural features of the '<em>Virtual Imputation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_IMPUTATION_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.TaskMappingImpl <em>Task Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.TaskMappingImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getTaskMapping()
	 * @generated
	 */
	int TASK_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__EXTERNAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__TASK = 1;

	/**
	 * The number of structural features of the '<em>Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.jeevaneo.naja.impl.TaskMappingsImpl <em>Task Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.naja.impl.TaskMappingsImpl
	 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getTaskMappings()
	 * @generated
	 */
	int TASK_MAPPINGS = 9;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPINGS__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Task Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPINGS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.jeevaneo.naja.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.naja.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see com.jeevaneo.naja.Person#getLogin()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Login();

	/**
	 * Returns the meta object for the reference list '{@link com.jeevaneo.naja.Person#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imputations</em>'.
	 * @see com.jeevaneo.naja.Person#getImputations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Imputations();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getTotalAvailability <em>Total Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Availability</em>'.
	 * @see com.jeevaneo.naja.Person#getTotalAvailability()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TotalAvailability();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getLeftAvailability <em>Left Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Availability</em>'.
	 * @see com.jeevaneo.naja.Person#getLeftAvailability()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LeftAvailability();

	/**
	 * Returns the meta object for the reference list '{@link com.jeevaneo.naja.Person#getPlanifications <em>Planifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planifications</em>'.
	 * @see com.jeevaneo.naja.Person#getPlanifications()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Planifications();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getAvailabilityStartDate <em>Availability Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Start Date</em>'.
	 * @see com.jeevaneo.naja.Person#getAvailabilityStartDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_AvailabilityStartDate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Person#getAvailableSchedules <em>Available Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Schedules</em>'.
	 * @see com.jeevaneo.naja.Person#getAvailableSchedules()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_AvailableSchedules();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getLastDate <em>Last Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Date</em>'.
	 * @see com.jeevaneo.naja.Person#getLastDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Person#getMaxLoadPerDay <em>Max Load Per Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Load Per Day</em>'.
	 * @see com.jeevaneo.naja.Person#getMaxLoadPerDay()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MaxLoadPerDay();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.jeevaneo.naja.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getTotalLoad <em>Total Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Load</em>'.
	 * @see com.jeevaneo.naja.Task#getTotalLoad()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TotalLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.naja.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.jeevaneo.naja.Task#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imputations</em>'.
	 * @see com.jeevaneo.naja.Task#getImputations()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Imputations();

	/**
	 * Returns the meta object for the reference list '{@link com.jeevaneo.naja.Task#getPlanifications <em>Planifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planifications</em>'.
	 * @see com.jeevaneo.naja.Task#getPlanifications()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Planifications();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getUnaffectedLoad <em>Unaffected Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unaffected Load</em>'.
	 * @see com.jeevaneo.naja.Task#getUnaffectedLoad()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_UnaffectedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see com.jeevaneo.naja.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.jeevaneo.naja.Task#getLabel()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Label();

	/**
	 * Returns the meta object for the container reference '{@link com.jeevaneo.naja.Task#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see com.jeevaneo.naja.Task#getCategory()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Category();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getFirstDate <em>First Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Date</em>'.
	 * @see com.jeevaneo.naja.Task#getFirstDate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_FirstDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getLastDate <em>Last Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Date</em>'.
	 * @see com.jeevaneo.naja.Task#getLastDate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_LastDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getImputedLoad <em>Imputed Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imputed Load</em>'.
	 * @see com.jeevaneo.naja.Task#getImputedLoad()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImputedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getTotalPlanifiedLoad <em>Total Planified Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Planified Load</em>'.
	 * @see com.jeevaneo.naja.Task#getTotalPlanifiedLoad()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TotalPlanifiedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Task#getUnimputedPlanifiedLoad <em>Unimputed Planified Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unimputed Planified Load</em>'.
	 * @see com.jeevaneo.naja.Task#getUnimputedPlanifiedLoad()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_UnimputedPlanifiedLoad();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Imputation <em>Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imputation</em>'.
	 * @see com.jeevaneo.naja.Imputation
	 * @generated
	 */
	EClass getImputation();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Imputation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.jeevaneo.naja.Imputation#getComment()
	 * @see #getImputation()
	 * @generated
	 */
	EAttribute getImputation_Comment();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Imputation#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.jeevaneo.naja.Imputation#getDate()
	 * @see #getImputation()
	 * @generated
	 */
	EAttribute getImputation_Date();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.Imputation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.jeevaneo.naja.Imputation#getResource()
	 * @see #getImputation()
	 * @generated
	 */
	EReference getImputation_Resource();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.Imputation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.jeevaneo.naja.Imputation#getTask()
	 * @see #getImputation()
	 * @generated
	 */
	EReference getImputation_Task();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Imputation#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see com.jeevaneo.naja.Imputation#getLoad()
	 * @see #getImputation()
	 * @generated
	 */
	EAttribute getImputation_Load();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.Imputation#getPlanification <em>Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planification</em>'.
	 * @see com.jeevaneo.naja.Imputation#getPlanification()
	 * @see #getImputation()
	 * @generated
	 */
	EReference getImputation_Planification();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Planification <em>Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planification</em>'.
	 * @see com.jeevaneo.naja.Planification
	 * @generated
	 */
	EClass getPlanification();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.jeevaneo.naja.Planification#getLabel()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_Label();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.Planification#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.jeevaneo.naja.Planification#getResource()
	 * @see #getPlanification()
	 * @generated
	 */
	EReference getPlanification_Resource();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.Planification#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.jeevaneo.naja.Planification#getTask()
	 * @see #getPlanification()
	 * @generated
	 */
	EReference getPlanification_Task();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see com.jeevaneo.naja.Planification#getLoad()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_Load();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.jeevaneo.naja.Planification#getComment()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link com.jeevaneo.naja.Planification#getVirtualImputation <em>Virtual Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Imputation</em>'.
	 * @see com.jeevaneo.naja.Planification#getVirtualImputation()
	 * @see #getPlanification()
	 * @generated
	 */
	EReference getPlanification_VirtualImputation();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getFirstDate <em>First Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Date</em>'.
	 * @see com.jeevaneo.naja.Planification#getFirstDate()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_FirstDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getLastDate <em>Last Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Date</em>'.
	 * @see com.jeevaneo.naja.Planification#getLastDate()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_LastDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getMaxLoadPerDay <em>Max Load Per Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Load Per Day</em>'.
	 * @see com.jeevaneo.naja.Planification#getMaxLoadPerDay()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_MaxLoadPerDay();

	/**
	 * Returns the meta object for the reference list '{@link com.jeevaneo.naja.Planification#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imputations</em>'.
	 * @see com.jeevaneo.naja.Planification#getImputations()
	 * @see #getPlanification()
	 * @generated
	 */
	EReference getPlanification_Imputations();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getUnimputedLoad <em>Unimputed Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unimputed Load</em>'.
	 * @see com.jeevaneo.naja.Planification#getUnimputedLoad()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_UnimputedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Planification#getImputedLoad <em>Imputed Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imputed Load</em>'.
	 * @see com.jeevaneo.naja.Planification#getImputedLoad()
	 * @see #getPlanification()
	 * @generated
	 */
	EAttribute getPlanification_ImputedLoad();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.jeevaneo.naja.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.naja.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Project#getPlanifications <em>Planifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planifications</em>'.
	 * @see com.jeevaneo.naja.Project#getPlanifications()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Planifications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Project#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.jeevaneo.naja.Project#getResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Project#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imputations</em>'.
	 * @see com.jeevaneo.naja.Project#getImputations()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Imputations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Project#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see com.jeevaneo.naja.Project#getCategories()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Categories();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Project#getTotalLoad <em>Total Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Load</em>'.
	 * @see com.jeevaneo.naja.Project#getTotalLoad()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_TotalLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Project#getUnaffectedLoad <em>Unaffected Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unaffected Load</em>'.
	 * @see com.jeevaneo.naja.Project#getUnaffectedLoad()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_UnaffectedLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.jeevaneo.naja.Project#getTasks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Tasks();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see com.jeevaneo.naja.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.naja.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see com.jeevaneo.naja.Category#getSubcategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategories();

	/**
	 * Returns the meta object for the container reference '{@link com.jeevaneo.naja.Category#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Category</em>'.
	 * @see com.jeevaneo.naja.Category#getParentCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_ParentCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.Category#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.jeevaneo.naja.Category#getTasks()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getTotalLoad <em>Total Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Load</em>'.
	 * @see com.jeevaneo.naja.Category#getTotalLoad()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_TotalLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getUnaffectedLoad <em>Unaffected Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unaffected Load</em>'.
	 * @see com.jeevaneo.naja.Category#getUnaffectedLoad()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_UnaffectedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see com.jeevaneo.naja.Category#getPriority()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Priority();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getFirstDate <em>First Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Date</em>'.
	 * @see com.jeevaneo.naja.Category#getFirstDate()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_FirstDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getLastDate <em>Last Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Date</em>'.
	 * @see com.jeevaneo.naja.Category#getLastDate()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_LastDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getImputedLoad <em>Imputed Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imputed Load</em>'.
	 * @see com.jeevaneo.naja.Category#getImputedLoad()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_ImputedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getTotalPlanifiedLoad <em>Total Planified Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Planified Load</em>'.
	 * @see com.jeevaneo.naja.Category#getTotalPlanifiedLoad()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_TotalPlanifiedLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Category#getUnimputedPlanifiedLoad <em>Unimputed Planified Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unimputed Planified Load</em>'.
	 * @see com.jeevaneo.naja.Category#getUnimputedPlanifiedLoad()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_UnimputedPlanifiedLoad();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see com.jeevaneo.naja.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Schedule#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.jeevaneo.naja.Schedule#getDate()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Schedule#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see com.jeevaneo.naja.Schedule#getLoad()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Load();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.Schedule#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.jeevaneo.naja.Schedule#getLabel()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Label();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.VirtualImputation <em>Virtual Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Imputation</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation
	 * @generated
	 */
	EClass getVirtualImputation();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.VirtualImputation#getTotalLoad <em>Total Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Load</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation#getTotalLoad()
	 * @see #getVirtualImputation()
	 * @generated
	 */
	EAttribute getVirtualImputation_TotalLoad();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.VirtualImputation#getFirstDate <em>First Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Date</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation#getFirstDate()
	 * @see #getVirtualImputation()
	 * @generated
	 */
	EAttribute getVirtualImputation_FirstDate();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.VirtualImputation#getLastDate <em>Last Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Date</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation#getLastDate()
	 * @see #getVirtualImputation()
	 * @generated
	 */
	EAttribute getVirtualImputation_LastDate();

	/**
	 * Returns the meta object for the container reference '{@link com.jeevaneo.naja.VirtualImputation#getPlanification <em>Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Planification</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation#getPlanification()
	 * @see #getVirtualImputation()
	 * @generated
	 */
	EReference getVirtualImputation_Planification();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.VirtualImputation#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation#getSchedules()
	 * @see #getVirtualImputation()
	 * @generated
	 */
	EReference getVirtualImputation_Schedules();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.VirtualImputation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.jeevaneo.naja.VirtualImputation#getLabel()
	 * @see #getVirtualImputation()
	 * @generated
	 */
	EAttribute getVirtualImputation_Label();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.TaskMapping <em>Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Mapping</em>'.
	 * @see com.jeevaneo.naja.TaskMapping
	 * @generated
	 */
	EClass getTaskMapping();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.naja.TaskMapping#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see com.jeevaneo.naja.TaskMapping#getExternalId()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EAttribute getTaskMapping_ExternalId();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.naja.TaskMapping#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.jeevaneo.naja.TaskMapping#getTask()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EReference getTaskMapping_Task();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.naja.TaskMappings <em>Task Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Mappings</em>'.
	 * @see com.jeevaneo.naja.TaskMappings
	 * @generated
	 */
	EClass getTaskMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.naja.TaskMappings#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see com.jeevaneo.naja.TaskMappings#getMappings()
	 * @see #getTaskMappings()
	 * @generated
	 */
	EReference getTaskMappings_Mappings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NajaFactory getNajaFactory();

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
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.PersonImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LOGIN = eINSTANCE.getPerson_Login();

		/**
		 * The meta object literal for the '<em><b>Imputations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IMPUTATIONS = eINSTANCE.getPerson_Imputations();

		/**
		 * The meta object literal for the '<em><b>Total Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TOTAL_AVAILABILITY = eINSTANCE.getPerson_TotalAvailability();

		/**
		 * The meta object literal for the '<em><b>Left Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LEFT_AVAILABILITY = eINSTANCE.getPerson_LeftAvailability();

		/**
		 * The meta object literal for the '<em><b>Planifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PLANIFICATIONS = eINSTANCE.getPerson_Planifications();

		/**
		 * The meta object literal for the '<em><b>Availability Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AVAILABILITY_START_DATE = eINSTANCE.getPerson_AvailabilityStartDate();

		/**
		 * The meta object literal for the '<em><b>Available Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__AVAILABLE_SCHEDULES = eINSTANCE.getPerson_AvailableSchedules();

		/**
		 * The meta object literal for the '<em><b>Last Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_DATE = eINSTANCE.getPerson_LastDate();

		/**
		 * The meta object literal for the '<em><b>Max Load Per Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MAX_LOAD_PER_DAY = eINSTANCE.getPerson_MaxLoadPerDay();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.TaskImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Total Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TOTAL_LOAD = eINSTANCE.getTask_TotalLoad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Imputations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IMPUTATIONS = eINSTANCE.getTask_Imputations();

		/**
		 * The meta object literal for the '<em><b>Planifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PLANIFICATIONS = eINSTANCE.getTask_Planifications();

		/**
		 * The meta object literal for the '<em><b>Unaffected Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__UNAFFECTED_LOAD = eINSTANCE.getTask_UnaffectedLoad();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__LABEL = eINSTANCE.getTask_Label();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CATEGORY = eINSTANCE.getTask_Category();

		/**
		 * The meta object literal for the '<em><b>First Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FIRST_DATE = eINSTANCE.getTask_FirstDate();

		/**
		 * The meta object literal for the '<em><b>Last Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__LAST_DATE = eINSTANCE.getTask_LastDate();

		/**
		 * The meta object literal for the '<em><b>Imputed Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPUTED_LOAD = eINSTANCE.getTask_ImputedLoad();

		/**
		 * The meta object literal for the '<em><b>Total Planified Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TOTAL_PLANIFIED_LOAD = eINSTANCE.getTask_TotalPlanifiedLoad();

		/**
		 * The meta object literal for the '<em><b>Unimputed Planified Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__UNIMPUTED_PLANIFIED_LOAD = eINSTANCE.getTask_UnimputedPlanifiedLoad();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.ImputationImpl <em>Imputation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.ImputationImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getImputation()
		 * @generated
		 */
		EClass IMPUTATION = eINSTANCE.getImputation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPUTATION__COMMENT = eINSTANCE.getImputation_Comment();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPUTATION__DATE = eINSTANCE.getImputation_Date();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPUTATION__RESOURCE = eINSTANCE.getImputation_Resource();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPUTATION__TASK = eINSTANCE.getImputation_Task();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPUTATION__LOAD = eINSTANCE.getImputation_Load();

		/**
		 * The meta object literal for the '<em><b>Planification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPUTATION__PLANIFICATION = eINSTANCE.getImputation_Planification();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.PlanificationImpl <em>Planification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.PlanificationImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getPlanification()
		 * @generated
		 */
		EClass PLANIFICATION = eINSTANCE.getPlanification();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__LABEL = eINSTANCE.getPlanification_Label();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANIFICATION__RESOURCE = eINSTANCE.getPlanification_Resource();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANIFICATION__TASK = eINSTANCE.getPlanification_Task();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__LOAD = eINSTANCE.getPlanification_Load();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__COMMENT = eINSTANCE.getPlanification_Comment();

		/**
		 * The meta object literal for the '<em><b>Virtual Imputation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANIFICATION__VIRTUAL_IMPUTATION = eINSTANCE.getPlanification_VirtualImputation();

		/**
		 * The meta object literal for the '<em><b>First Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__FIRST_DATE = eINSTANCE.getPlanification_FirstDate();

		/**
		 * The meta object literal for the '<em><b>Last Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__LAST_DATE = eINSTANCE.getPlanification_LastDate();

		/**
		 * The meta object literal for the '<em><b>Max Load Per Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__MAX_LOAD_PER_DAY = eINSTANCE.getPlanification_MaxLoadPerDay();

		/**
		 * The meta object literal for the '<em><b>Imputations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANIFICATION__IMPUTATIONS = eINSTANCE.getPlanification_Imputations();

		/**
		 * The meta object literal for the '<em><b>Unimputed Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__UNIMPUTED_LOAD = eINSTANCE.getPlanification_UnimputedLoad();

		/**
		 * The meta object literal for the '<em><b>Imputed Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANIFICATION__IMPUTED_LOAD = eINSTANCE.getPlanification_ImputedLoad();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.ProjectImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Planifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PLANIFICATIONS = eINSTANCE.getProject_Planifications();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

		/**
		 * The meta object literal for the '<em><b>Imputations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__IMPUTATIONS = eINSTANCE.getProject_Imputations();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CATEGORIES = eINSTANCE.getProject_Categories();

		/**
		 * The meta object literal for the '<em><b>Total Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TOTAL_LOAD = eINSTANCE.getProject_TotalLoad();

		/**
		 * The meta object literal for the '<em><b>Unaffected Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__UNAFFECTED_LOAD = eINSTANCE.getProject_UnaffectedLoad();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TASKS = eINSTANCE.getProject_Tasks();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.CategoryImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();

		/**
		 * The meta object literal for the '<em><b>Parent Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PARENT_CATEGORY = eINSTANCE.getCategory_ParentCategory();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__TASKS = eINSTANCE.getCategory_Tasks();

		/**
		 * The meta object literal for the '<em><b>Total Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TOTAL_LOAD = eINSTANCE.getCategory_TotalLoad();

		/**
		 * The meta object literal for the '<em><b>Unaffected Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__UNAFFECTED_LOAD = eINSTANCE.getCategory_UnaffectedLoad();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__PRIORITY = eINSTANCE.getCategory_Priority();

		/**
		 * The meta object literal for the '<em><b>First Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__FIRST_DATE = eINSTANCE.getCategory_FirstDate();

		/**
		 * The meta object literal for the '<em><b>Last Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__LAST_DATE = eINSTANCE.getCategory_LastDate();

		/**
		 * The meta object literal for the '<em><b>Imputed Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__IMPUTED_LOAD = eINSTANCE.getCategory_ImputedLoad();

		/**
		 * The meta object literal for the '<em><b>Total Planified Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TOTAL_PLANIFIED_LOAD = eINSTANCE.getCategory_TotalPlanifiedLoad();

		/**
		 * The meta object literal for the '<em><b>Unimputed Planified Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__UNIMPUTED_PLANIFIED_LOAD = eINSTANCE.getCategory_UnimputedPlanifiedLoad();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.ScheduleImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__DATE = eINSTANCE.getSchedule_Date();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__LOAD = eINSTANCE.getSchedule_Load();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__LABEL = eINSTANCE.getSchedule_Label();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.VirtualImputationImpl <em>Virtual Imputation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.VirtualImputationImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getVirtualImputation()
		 * @generated
		 */
		EClass VIRTUAL_IMPUTATION = eINSTANCE.getVirtualImputation();

		/**
		 * The meta object literal for the '<em><b>Total Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_IMPUTATION__TOTAL_LOAD = eINSTANCE.getVirtualImputation_TotalLoad();

		/**
		 * The meta object literal for the '<em><b>First Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_IMPUTATION__FIRST_DATE = eINSTANCE.getVirtualImputation_FirstDate();

		/**
		 * The meta object literal for the '<em><b>Last Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_IMPUTATION__LAST_DATE = eINSTANCE.getVirtualImputation_LastDate();

		/**
		 * The meta object literal for the '<em><b>Planification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_IMPUTATION__PLANIFICATION = eINSTANCE.getVirtualImputation_Planification();

		/**
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_IMPUTATION__SCHEDULES = eINSTANCE.getVirtualImputation_Schedules();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_IMPUTATION__LABEL = eINSTANCE.getVirtualImputation_Label();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.TaskMappingImpl <em>Task Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.TaskMappingImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getTaskMapping()
		 * @generated
		 */
		EClass TASK_MAPPING = eINSTANCE.getTaskMapping();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_MAPPING__EXTERNAL_ID = eINSTANCE.getTaskMapping_ExternalId();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MAPPING__TASK = eINSTANCE.getTaskMapping_Task();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.naja.impl.TaskMappingsImpl <em>Task Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.naja.impl.TaskMappingsImpl
		 * @see com.jeevaneo.naja.impl.NajaPackageImpl#getTaskMappings()
		 * @generated
		 */
		EClass TASK_MAPPINGS = eINSTANCE.getTaskMappings();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MAPPINGS__MAPPINGS = eINSTANCE.getTaskMappings_Mappings();

	}

} //NajaPackage
