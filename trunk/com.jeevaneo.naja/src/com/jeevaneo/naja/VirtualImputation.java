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
 * A representation of the model object '<em><b>Virtual Imputation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.VirtualImputation#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.VirtualImputation#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.VirtualImputation#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.VirtualImputation#getPlanification <em>Planification</em>}</li>
 *   <li>{@link com.jeevaneo.naja.VirtualImputation#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link com.jeevaneo.naja.VirtualImputation#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation()
 * @model
 * @generated
 */
public interface VirtualImputation extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Load</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation_TotalLoad()
	 * @model default="0" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	int getTotalLoad();

	/**
	 * Returns the value of the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Date</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation_FirstDate()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation_LastDate()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getLastDate();

	/**
	 * Returns the value of the '<em><b>Planification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Planification#getVirtualImputation <em>Virtual Imputation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planification</em>' container reference.
	 * @see #setPlanification(Planification)
	 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation_Planification()
	 * @see com.jeevaneo.naja.Planification#getVirtualImputation
	 * @model opposite="virtualImputation" required="true" transient="false"
	 * @generated
	 */
	Planification getPlanification();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.VirtualImputation#getPlanification <em>Planification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planification</em>' container reference.
	 * @see #getPlanification()
	 * @generated
	 */
	void setPlanification(Planification value);

	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Schedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation_Schedules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getVirtualImputation_Label()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

} // VirtualImputation
