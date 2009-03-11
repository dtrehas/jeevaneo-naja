/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries.tests;

import com.jeevaneo.naja.timeentries.TimeEntry;
import com.jeevaneo.naja.timeentries.TimeentriesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeEntryTest extends TestCase {

	/**
	 * The fixture for this Time Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntry fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeEntryTest.class);
	}

	/**
	 * Constructs a new Time Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeEntry fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntry getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimeentriesFactory.eINSTANCE.createTimeEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TimeEntryTest
