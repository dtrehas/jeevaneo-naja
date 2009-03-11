/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.jeevaneo.naja.timeentries.TimeentriesPackage
 * @generated
 */
public interface TimeentriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeentriesFactory eINSTANCE = com.jeevaneo.naja.timeentries.impl.TimeentriesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Entries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Entries</em>'.
	 * @generated
	 */
	TimeEntries createTimeEntries();

	/**
	 * Returns a new object of class '<em>Time Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Entry</em>'.
	 * @generated
	 */
	TimeEntry createTimeEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimeentriesPackage getTimeentriesPackage();

} //TimeentriesFactory
