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
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.Category#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getSubcategories <em>Subcategories</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getUnaffectedLoad <em>Unaffected Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getImputedLoad <em>Imputed Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getTotalPlanifiedLoad <em>Total Planified Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.Category#getUnimputedPlanifiedLoad <em>Unimputed Planified Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.NajaPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
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
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subcategories</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Category}.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Category#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcategories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcategories</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_Subcategories()
	 * @see com.jeevaneo.naja.Category#getParentCategory
	 * @model opposite="parentCategory" containment="true"
	 * @generated
	 */
	EList<Category> getSubcategories();

	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' container reference.
	 * @see #setParentCategory(Category)
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_ParentCategory()
	 * @see com.jeevaneo.naja.Category#getSubcategories
	 * @model opposite="subcategories" transient="false"
	 * @generated
	 */
	Category getParentCategory();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Category#getParentCategory <em>Parent Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category</em>' container reference.
	 * @see #getParentCategory()
	 * @generated
	 */
	void setParentCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Task}.
	 * It is bidirectional and its opposite is '{@link com.jeevaneo.naja.Task#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_Tasks()
	 * @see com.jeevaneo.naja.Task#getCategory
	 * @model opposite="category" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Total Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_TotalLoad()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalLoad();

	/**
	 * Returns the value of the '<em><b>Unaffected Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unaffected Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unaffected Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_UnaffectedLoad()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getUnaffectedLoad();

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
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_Priority()
	 * @model default="0"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.Category#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>First Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Date</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_FirstDate()
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
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_LastDate()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getLastDate();

	/**
	 * Returns the value of the '<em><b>Imputed Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imputed Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imputed Load</em>' attribute.
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_ImputedLoad()
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
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_TotalPlanifiedLoad()
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
	 * @see com.jeevaneo.naja.NajaPackage#getCategory_UnimputedPlanifiedLoad()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUnimputedPlanifiedLoad();

} // Category
