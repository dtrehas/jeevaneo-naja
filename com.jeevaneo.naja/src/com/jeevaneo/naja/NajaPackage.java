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
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

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
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 8;

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
	 * The number of structural features of the '<em>Imputation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPUTATION_FEATURE_COUNT = 5;

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
	 * The number of structural features of the '<em>Planification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFICATION_FEATURE_COUNT = 5;

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
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 7;


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

	}

} //NajaPackage
