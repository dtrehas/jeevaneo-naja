/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntries#getEntries <em>Entries</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntries#getComment <em>Comment</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.TimeEntries#getTotalLoad <em>Total Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntries()
 * @model
 * @generated
 */
public interface TimeEntries extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.timeentries.TimeEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntries_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeEntry> getEntries();

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
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntries_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.timeentries.TimeEntries#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Load</em>' attribute.
	 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage#getTimeEntries_TotalLoad()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getTotalLoad();

} // TimeEntries
