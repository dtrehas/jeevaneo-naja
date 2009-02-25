/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.NajaFactory;
import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Schedule;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Person</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getImputations <em>Imputations</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getTotalAvailability <em>Total Availability</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getLeftAvailability <em>Left Availability</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getPlanifications <em>Planifications</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getAvailabilityStartDate <em>Availability Start Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getAvailableSchedules <em>Available Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImputations() <em>Imputations</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImputations()
	 * @generated
	 * @ordered
	 */
	protected EList<Imputation> imputations;

	/**
	 * The default value of the '{@link #getTotalAvailability() <em>Total Availability</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTotalAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_AVAILABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalAvailability() <em>Total Availability</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTotalAvailability()
	 * @generated
	 * @ordered
	 */
	protected int totalAvailability = TOTAL_AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftAvailability() <em>Left Availability</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLeftAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_AVAILABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlanifications() <em>Planifications</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPlanifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Planification> planifications;

	/**
	 * The default value of the '{@link #getAvailabilityStartDate() <em>Availability Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABILITY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityStartDate() <em>Availability Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date availabilityStartDate = AVAILABILITY_START_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableSchedules()
	 * <em>Available Schedules</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAvailableSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Schedule> availableSchedules;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NajaPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PERSON__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Imputation> getImputations() {
		if (imputations == null) {
			imputations = new EObjectWithInverseResolvingEList<Imputation>(Imputation.class, this, NajaPackage.PERSON__IMPUTATIONS, NajaPackage.IMPUTATION__RESOURCE);
		}
		return imputations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalAvailability() {
		return totalAvailability;
	}

	public int getLeftAvailability() {
		int ret = totalAvailability;
		for (Imputation imp : getImputations()) {
			ret -= imp.getLoad();
		}
		for (Planification planif : getPlanifications()) {
			ret -= planif.getLoad();
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetLeftAvailability() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Planification> getPlanifications() {
		if (planifications == null) {
			planifications = new EObjectWithInverseResolvingEList<Planification>(Planification.class, this, NajaPackage.PERSON__PLANIFICATIONS, NajaPackage.PLANIFICATION__RESOURCE);
		}
		return planifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAvailabilityStartDate() {
		return availabilityStartDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setAvailabilityStartDate(Date newAvailabilityStartDate) {
		Date oldAvailabilityStartDate = availabilityStartDate;
		availabilityStartDate = newAvailabilityStartDate;

		if (oldAvailabilityStartDate != newAvailabilityStartDate
				&& null != newAvailabilityStartDate
				&& !newAvailabilityStartDate.equals(oldAvailabilityStartDate)) {
			// changed
			recomputeAvailableSchedules();
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NajaPackage.PERSON__AVAILABILITY_START_DATE,
					oldAvailabilityStartDate, availabilityStartDate));
	}

	private void recomputeAvailableSchedules() {
		// fill it with all "opened" schedules then remove the imputations
		SortedSet<Date> dates = findOpenedDates(availabilityStartDate,
				totalAvailability);
		
		getAvailableSchedules().clear();
		
		// TODO continue!!
		int i = 0;
		for (Date date : dates) {
			System.out.println("" + i++ + "Found opened : " + date);
			Schedule schedule = NajaFactory.eINSTANCE.createSchedule();
			schedule.setDate(date);
			schedule.setLoad(8);
			getAvailableSchedules().add(schedule);
		}

		for (Imputation imputation : getImputations()) {
			Date date = imputation.getDate();

			Iterator<Schedule> iterator = getAvailableSchedules().iterator();
			while (iterator.hasNext()) {
				Schedule schedule = iterator.next();
				System.out.println("Check: " + date + " vs " + schedule.getDate() + " : " + date.equals(schedule.getDate()));
				if (date.equals(schedule.getDate())) {
					schedule.setLoad(schedule.getLoad() - imputation.getLoad());
					System.out.println("Changed " + schedule);
					if (0 == schedule.getLoad()) {
						iterator.remove();
					}
					break;
				}
			}
		}
		
		for (Planification planification : getPlanifications()) {
			//TODO!
		}
	}

	private SortedSet<Date> findOpenedDates(Date firstDate,
			int totalAvailability) {
		SortedSet<Date> ret = new TreeSet<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(firstDate);
		cal.add(Calendar.DAY_OF_WEEK, -1);
		int leftDays = totalAvailability;
		while (leftDays > 0) {
			cal.add(Calendar.DAY_OF_WEEK, 1);
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
					|| cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				// week end
				continue;
			}
			if (isBankHoliday(cal.getTime())) {
				continue;
			}
			ret.add(cal.getTime());
			leftDays--;
		}
		return ret;
	}

	private final static SortedSet<Date> bankHolidays = new TreeSet<Date>();
	static {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// TODO externalize and make parametrizable
		try {
			bankHolidays.add(sdf.parse("2009-05-01"));
			bankHolidays.add(sdf.parse("2009-05-08"));
			bankHolidays.add(sdf.parse("2009-07-14"));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

	}

	private boolean isBankHoliday(Date date) {
		return bankHolidays.contains(date);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getAvailableSchedules() {
		if (availableSchedules == null) {
			availableSchedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, NajaPackage.PERSON__AVAILABLE_SCHEDULES);
		}
		return availableSchedules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAvailability(int newTotalAvailability) {
		int oldTotalAvailability = totalAvailability;
		totalAvailability = newTotalAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PERSON__TOTAL_AVAILABILITY, oldTotalAvailability, totalAvailability));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.PERSON__IMPUTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImputations()).basicAdd(otherEnd, msgs);
			case NajaPackage.PERSON__PLANIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlanifications()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.PERSON__IMPUTATIONS:
				return ((InternalEList<?>)getImputations()).basicRemove(otherEnd, msgs);
			case NajaPackage.PERSON__PLANIFICATIONS:
				return ((InternalEList<?>)getPlanifications()).basicRemove(otherEnd, msgs);
			case NajaPackage.PERSON__AVAILABLE_SCHEDULES:
				return ((InternalEList<?>)getAvailableSchedules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NajaPackage.PERSON__NAME:
				return getName();
			case NajaPackage.PERSON__LOGIN:
				return getLogin();
			case NajaPackage.PERSON__IMPUTATIONS:
				return getImputations();
			case NajaPackage.PERSON__TOTAL_AVAILABILITY:
				return new Integer(getTotalAvailability());
			case NajaPackage.PERSON__LEFT_AVAILABILITY:
				return new Integer(getLeftAvailability());
			case NajaPackage.PERSON__PLANIFICATIONS:
				return getPlanifications();
			case NajaPackage.PERSON__AVAILABILITY_START_DATE:
				return getAvailabilityStartDate();
			case NajaPackage.PERSON__AVAILABLE_SCHEDULES:
				return getAvailableSchedules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NajaPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case NajaPackage.PERSON__LOGIN:
				setLogin((String)newValue);
				return;
			case NajaPackage.PERSON__IMPUTATIONS:
				getImputations().clear();
				getImputations().addAll((Collection<? extends Imputation>)newValue);
				return;
			case NajaPackage.PERSON__TOTAL_AVAILABILITY:
				setTotalAvailability(((Integer)newValue).intValue());
				return;
			case NajaPackage.PERSON__PLANIFICATIONS:
				getPlanifications().clear();
				getPlanifications().addAll((Collection<? extends Planification>)newValue);
				return;
			case NajaPackage.PERSON__AVAILABILITY_START_DATE:
				setAvailabilityStartDate((Date)newValue);
				return;
			case NajaPackage.PERSON__AVAILABLE_SCHEDULES:
				getAvailableSchedules().clear();
				getAvailableSchedules().addAll((Collection<? extends Schedule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NajaPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NajaPackage.PERSON__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case NajaPackage.PERSON__IMPUTATIONS:
				getImputations().clear();
				return;
			case NajaPackage.PERSON__TOTAL_AVAILABILITY:
				setTotalAvailability(TOTAL_AVAILABILITY_EDEFAULT);
				return;
			case NajaPackage.PERSON__PLANIFICATIONS:
				getPlanifications().clear();
				return;
			case NajaPackage.PERSON__AVAILABILITY_START_DATE:
				setAvailabilityStartDate(AVAILABILITY_START_DATE_EDEFAULT);
				return;
			case NajaPackage.PERSON__AVAILABLE_SCHEDULES:
				getAvailableSchedules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NajaPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NajaPackage.PERSON__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case NajaPackage.PERSON__IMPUTATIONS:
				return imputations != null && !imputations.isEmpty();
			case NajaPackage.PERSON__TOTAL_AVAILABILITY:
				return totalAvailability != TOTAL_AVAILABILITY_EDEFAULT;
			case NajaPackage.PERSON__LEFT_AVAILABILITY:
				return isSetLeftAvailability();
			case NajaPackage.PERSON__PLANIFICATIONS:
				return planifications != null && !planifications.isEmpty();
			case NajaPackage.PERSON__AVAILABILITY_START_DATE:
				return AVAILABILITY_START_DATE_EDEFAULT == null ? availabilityStartDate != null : !AVAILABILITY_START_DATE_EDEFAULT.equals(availabilityStartDate);
			case NajaPackage.PERSON__AVAILABLE_SCHEDULES:
				return availableSchedules != null && !availableSchedules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", login: ");
		result.append(login);
		result.append(", totalAvailability: ");
		result.append(totalAvailability);
		result.append(", availabilityStartDate: ");
		result.append(availabilityStartDate);
		result.append(')');
		return result.toString();
	}

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			System.out.println(sdf.parse("2009-05-01"));
			System.out.println(bankHolidays.contains(sdf.parse("2009-05-01")));

		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

} // PersonImpl
