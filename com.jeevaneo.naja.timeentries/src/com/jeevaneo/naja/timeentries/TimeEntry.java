/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.Person;

import com.jeevaneo.naja.TaskMapping;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntry#getComment <em>Comment</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntry#getDay <em>Day</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntry#getLoad <em>Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntry#getResource <em>Resource</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntry#getExternalId <em>External Id</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntry#getImputation <em>Imputation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry()
 * @model
 * @generated
 */
public interface TimeEntry extends EObject {
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
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntry#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry_Day()
	 * @model required="true"
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntry#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

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
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry_Load()
	 * @model required="true"
	 * @generated
	 */
	int getLoad();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntry#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(int value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Person)
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry_Resource()
	 * @model required="true"
	 * @generated
	 */
	Person getResource();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntry#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Person value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' reference.
	 * @see #setExternalId(TaskMapping)
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry_ExternalId()
	 * @model required="true"
	 * @generated
	 */
	TaskMapping getExternalId();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntry#getExternalId <em>External Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' reference.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(TaskMapping value);

	/**
	 * Returns the value of the '<em><b>Imputation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imputation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imputation</em>' containment reference.
	 * @see #setImputation(Imputation)
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntry_Imputation()
	 * @model containment="true"
	 * @generated
	 */
	Imputation getImputation();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntry#getImputation <em>Imputation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imputation</em>' containment reference.
	 * @see #getImputation()
	 * @generated
	 */
	void setImputation(Imputation value);

} // TimeEntry
