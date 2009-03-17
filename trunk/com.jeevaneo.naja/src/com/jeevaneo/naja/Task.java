/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.Task#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getImputations <em>Imputations</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getPlanifications <em>Planifications</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getUnaffectedLoad <em>Unaffected Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getCategory <em>Category</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getImputedLoad <em>Imputed Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getTotalPlanifiedLoad <em>Total Planified Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Task#getUnimputedPlanifiedLoad <em>Unimputed Planified Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Load</em>' attribute.
	 * @see #setTotalLoad(int)
	 * @see com.jeevaneo.naja.NajaPackage#getTask_TotalLoad()
	 * @model required="true"
	 * @generated
	 */
	int getTotalLoad();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Task#getTotalLoad <em>Total Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Load</em>' attribute.
	 * @see #getTotalLoad()
	 * @generated
	 */
	void setTotalLoad(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.jeevaneo.naja.NajaPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imputations</b></em>' reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Imputation}.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Imputation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imputations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imputations</em>' reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_Imputations()
	 * @see com.jeevaneo.naja.Imputation#getTask
	 * @model opposite="task"
	 * @generated
	 */
	EList<Imputation> getImputations();

	/**
	 * Returns the value of the '<em><b>Planifications</b></em>' reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Planification}.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Planification#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planifications</em>' reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_Planifications()
	 * @see com.jeevaneo.naja.Planification#getTask
	 * @model opposite="task"
	 * @generated
	 */
	EList<Planification> getPlanifications();

	/**
	 * Returns the value of the '<em><b>Unaffected Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unaffected Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unaffected Load</em>' attribute.
	 * @see #isSetUnaffectedLoad()
	 * @see com.jeevaneo.naja.NajaPackage#getTask_UnaffectedLoad()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getUnaffectedLoad();

	/**
	 * Returns whether the value of the '{@link com.jeevaneo.naja.Task#getUnaffectedLoad <em>Unaffected Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unaffected Load</em>' attribute is set.
	 * @see #getUnaffectedLoad()
	 * @generated
	 */
	boolean isSetUnaffectedLoad();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see com.jeevaneo.naja.NajaPackage#getTask_Priority()
	 * @model default="0"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.jeevaneo.naja.NajaPackage#getTask_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Task#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Category#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see com.jeevaneo.naja.NajaPackage#getTask_Category()
	 * @see com.jeevaneo.naja.Category#getTasks
	 * @model opposite="tasks" transient="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Task#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Date</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_FirstDate()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getFirstDate();

	/**
	 * Returns the value of the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Date</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_LastDate()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getLastDate();

	/**
	 * Returns the value of the '<em><b>Imputed Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total sum of every imputation for that particular task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imputed Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_ImputedLoad()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getImputedLoad();

	/**
	 * Returns the value of the '<em><b>Total Planified Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Planified Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Planified Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_TotalPlanifiedLoad()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getTotalPlanifiedLoad();

	/**
	 * Returns the value of the '<em><b>Unimputed Planified Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unimputed Planified Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unimputed Planified Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getTask_UnimputedPlanifiedLoad()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUnimputedPlanifiedLoad();

} // Task
