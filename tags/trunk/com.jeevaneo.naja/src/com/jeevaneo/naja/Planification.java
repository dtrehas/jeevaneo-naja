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
 * A representation of the model object '<em><b>Planification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.Planification#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getResource <em>Resource</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getTask <em>Task</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getLoad <em>Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getComment <em>Comment</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getVirtualImputation <em>Virtual Imputation</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Planification#getLastDate <em>Last Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getPlanification()
 * @model
 * @generated
 */
public interface Planification extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_Label()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Person#getPlanifications <em>Planifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Person)
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_Resource()
	 * @see com.jeevaneo.naja.Person#getPlanifications
	 * @model opposite="planifications" required="true"
	 * @generated
	 */
	Person getResource();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Planification#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Person value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Task#getPlanifications <em>Planifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_Task()
	 * @see com.jeevaneo.naja.Task#getPlanifications
	 * @model opposite="planifications" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Planification#getTask <em>Task</em>}' reference.
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
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_Load()
	 * @model required="true"
	 * @generated
	 */
	int getLoad();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Planification#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(int value);

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
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Planification#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Imputation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.VirtualImputation#getPlanification <em>Planification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Imputation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Imputation</em>' containment reference.
	 * @see #setVirtualImputation(VirtualImputation)
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_VirtualImputation()
	 * @see com.jeevaneo.naja.VirtualImputation#getPlanification
	 * @model opposite="planification" containment="true"
	 * @generated
	 */
	VirtualImputation getVirtualImputation();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Planification#getVirtualImputation <em>Virtual Imputation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Imputation</em>' containment reference.
	 * @see #getVirtualImputation()
	 * @generated
	 */
	void setVirtualImputation(VirtualImputation value);

	/**
	 * Returns the value of the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Date</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_FirstDate()
	 * @model changeable="false" derived="true"
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
	 * @see com.jeevaneo.naja.NajaPackage#getPlanification_LastDate()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	Date getLastDate();

} // Planification
