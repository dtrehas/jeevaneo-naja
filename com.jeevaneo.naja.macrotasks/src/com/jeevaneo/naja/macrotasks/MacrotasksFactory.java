/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.macrotasks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.jeevaneo.naja.macrotasks.MacrotasksPackage
 * @generated
 */
public interface MacrotasksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MacrotasksFactory eINSTANCE = com.jeevaneo.naja.macrotasks.impl.MacrotasksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Macrotask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macrotask</em>'.
	 * @generated
	 */
	Macrotask createMacrotask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MacrotasksPackage getMacrotasksPackage();

} //MacrotasksFactory
