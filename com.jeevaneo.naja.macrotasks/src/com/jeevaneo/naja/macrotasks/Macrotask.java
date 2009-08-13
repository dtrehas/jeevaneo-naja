/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.macrotasks;

import com.jeevaneo.naja.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macrotask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.macrotasks.Macrotask#getId <em>Id</em>}</li>
 *   <li>{@link com.jeevaneo.naja.macrotasks.Macrotask#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jeevaneo.naja.macrotasks.MacrotasksPackage#getMacrotask()
 * @model
 * @generated
 */
public interface Macrotask extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"\"\"+ System.currentTimeMillis()"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.jeevaneo.naja.macrotasks.MacrotasksPackage#getMacrotask_Id()
	 * @model default="\"\"+ System.currentTimeMillis()" id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.jeevaneo.naja.macrotasks.Macrotask#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.jeevaneo.naja.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see com.jeevaneo.naja.macrotasks.MacrotasksPackage#getMacrotask_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

} // Macrotask
