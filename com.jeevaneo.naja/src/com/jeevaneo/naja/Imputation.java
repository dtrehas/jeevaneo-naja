/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imputation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.Imputation#getComment <em>Comment</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Imputation#getDate <em>Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Imputation#getResource <em>Resource</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Imputation#getTask <em>Task</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Imputation#getLoad <em>Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Imputation#getPlanification <em>Planification</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getImputation()
 * @model
 * @generated
 */
public interface Imputation extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.jeevaneo.naja.NajaPackage#getImputation_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Imputation#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see com.jeevaneo.naja.NajaPackage#getImputation_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Imputation#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Person#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Person)
	 * @see com.jeevaneo.naja.NajaPackage#getImputation_Resource()
	 * @see com.jeevaneo.naja.Person#getImputations
	 * @model opposite="imputations" required="true"
	 * @generated
	 */
	Person getResource();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Imputation#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Person value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Task#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see com.jeevaneo.naja.NajaPackage#getImputation_Task()
	 * @see com.jeevaneo.naja.Task#getImputations
	 * @model opposite="imputations" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Imputation#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' attribute.
	 * @see #setLoad(int)
	 * @see com.jeevaneo.naja.NajaPackage#getImputation_Load()
	 * @model required="true"
	 * @generated
	 */
	int getLoad();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Imputation#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(int value);

	/**
	 * Returns the value of the '<em><b>Planification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Planification#getImputations <em>Imputations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planification</em>' reference.
	 * @see #setPlanification(Planification)
	 * @see com.jeevaneo.naja.NajaPackage#getImputation_Planification()
	 * @see com.jeevaneo.naja.Planification#getImputations
	 * @model opposite="imputations"
	 * @generated
	 */
	Planification getPlanification();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Imputation#getPlanification <em>Planification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planification</em>' reference.
	 * @see #getPlanification()
	 * @generated
	 */
	void setPlanification(Planification value);

} // Imputation
