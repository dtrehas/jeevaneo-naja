/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries.tests;

import com.jeevaneo.naja.timeentries.TimeEntries;
import com.jeevaneo.naja.timeentries.TimeentriesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Entries</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeEntriesTest extends TestCase {

	/**
	 * The fixture for this Time Entries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntries fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeEntriesTest.class);
	}

	/**
	 * Constructs a new Time Entries test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEntriesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Entries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeEntries fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Entries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntries getFixture() {
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
		setFixture(TimeentriesFactory.eINSTANCE.createTimeEntries());
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

} //TimeEntriesTest
