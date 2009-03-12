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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.Person#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getLogin <em>Login</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getImputations <em>Imputations</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getTotalAvailability <em>Total Availability</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getLeftAvailability <em>Left Availability</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getPlanifications <em>Planifications</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getAvailabilityStartDate <em>Availability Start Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getAvailableSchedules <em>Available Schedules</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Person#getMaxLoadPerDay <em>Max Load Per Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
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
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_Login()
	 * @model required="true"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Person#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Imputations</b></em>' reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Imputation}.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Imputation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imputations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imputations</em>' reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_Imputations()
	 * @see com.jeevaneo.naja.Imputation#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<Imputation> getImputations();

	/**
	 * Returns the value of the '<em><b>Total Availability</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Availability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Availability</em>' attribute.
	 * @see #setTotalAvailability(int)
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_TotalAvailability()
	 * @model default="0"
	 * @generated
	 */
	int getTotalAvailability();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Person#getTotalAvailability <em>Total Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Availability</em>' attribute.
	 * @see #getTotalAvailability()
	 * @generated
	 */
	void setTotalAvailability(int value);

	/**
	 * Returns the value of the '<em><b>Left Availability</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Availability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Availability</em>' attribute.
	 * @see #isSetLeftAvailability()
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_LeftAvailability()
	 * @model default="0" unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLeftAvailability();

	/**
	 * Returns whether the value of the '{@link com.jeevaneo.naja.Person#getLeftAvailability <em>Left Availability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Left Availability</em>' attribute is set.
	 * @see #getLeftAvailability()
	 * @generated
	 */
	boolean isSetLeftAvailability();

	/**
	 * Returns the value of the '<em><b>Planifications</b></em>' reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Planification}.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Planification#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planifications</em>' reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_Planifications()
	 * @see com.jeevaneo.naja.Planification#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<Planification> getPlanifications();

	/**
	 * Returns the value of the '<em><b>Availability Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Start Date</em>' attribute.
	 * @see #setAvailabilityStartDate(Date)
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_AvailabilityStartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getAvailabilityStartDate();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Person#getAvailabilityStartDate <em>Availability Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Start Date</em>' attribute.
	 * @see #getAvailabilityStartDate()
	 * @generated
	 */
	void setAvailabilityStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Available Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Schedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Schedules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Schedules</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_AvailableSchedules()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<Schedule> getAvailableSchedules();

	/**
	 * Returns the value of the '<em><b>Last Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Date</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_LastDate()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getLastDate();

	/**
	 * Returns the value of the '<em><b>Max Load Per Day</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Load Per Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Load Per Day</em>' attribute.
	 * @see #setMaxLoadPerDay(int)
	 * @see com.jeevaneo.naja.NajaPackage#getPerson_MaxLoadPerDay()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getMaxLoadPerDay();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Person#getMaxLoadPerDay <em>Max Load Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Load Per Day</em>' attribute.
	 * @see #getMaxLoadPerDay()
	 * @generated
	 */
	void setMaxLoadPerDay(int value);

} // Person
