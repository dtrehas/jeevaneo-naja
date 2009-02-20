/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getPlanifications <em>Planifications</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getResources <em>Resources</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getImputations <em>Imputations</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getCategories <em>Categories</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getUnaffectedLoad <em>Unaffected Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Project#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see com.jeevaneo.naja.NajaPackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Planifications</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Planification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planifications</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getProject_Planifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Planification> getPlanifications();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getProject_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getResources();

	/**
	 * Returns the value of the '<em><b>Imputations</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Imputation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imputations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imputations</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getProject_Imputations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imputation> getImputations();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getProject_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Load</em>' attribute.
	 * @see #isSetTotalLoad()
	 * @see com.jeevaneo.naja.NajaPackage#getProject_TotalLoad()
	 * @model unique="false" unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getTotalLoad();

	/**
	 * Returns whether the value of the '{@link com.jeevaneo.naja.Project#getTotalLoad <em>Total Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Load</em>' attribute is set.
	 * @see #getTotalLoad()
	 * @generated
	 */
	boolean isSetTotalLoad();

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
	 * @see com.jeevaneo.naja.NajaPackage#getProject_UnaffectedLoad()
	 * @model unique="false" unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUnaffectedLoad();

	/**
	 * Returns whether the value of the '{@link com.jeevaneo.naja.Project#getUnaffectedLoad <em>Unaffected Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unaffected Load</em>' attribute is set.
	 * @see #getUnaffectedLoad()
	 * @generated
	 */
	boolean isSetUnaffectedLoad();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getProject_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Project
