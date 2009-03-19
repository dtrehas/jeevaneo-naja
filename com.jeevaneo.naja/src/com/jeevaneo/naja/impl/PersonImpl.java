/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
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
import com.jeevaneo.naja.VirtualImputation;

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
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PersonImpl#getMaxLoadPerDay <em>Max Load Per Day</em>}</li>
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
	 * The default value of the '{@link #getLastDate() <em>Last Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxLoadPerDay() <em>Max Load Per Day</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxLoadPerDay()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LOAD_PER_DAY_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getMaxLoadPerDay() <em>Max Load Per Day</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxLoadPerDay()
	 * @generated
	 * @ordered
	 */
	protected int maxLoadPerDay = MAX_LOAD_PER_DAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected PersonImpl() {
		super();
		eAdapters().add(new AdapterImpl() {

			private void addImputation(Imputation imputation) {
				// System.out.println("Added an imputation on " + getName() +
				// " "
				// + imputation);
				// reserveSchedule(imputation);
				recomputeAvailableSchedules();
			}

			private void changeImputation(Imputation imputation) {
				// System.out.println("Changed an imputation on " + getName()
				// + " " + imputation);
				recomputeAvailableSchedules();
			}

			private void removeImputation(Imputation imputation) {
				// System.out.println("Removed an imputation from " + getName()
				// + imputation);
				// releaseSchedule(imputation);
				recomputeAvailableSchedules();
			}

			private void addPlanification(Planification newPlan) {
				// System.out.println("Added a planification on " + getName()
				// + " " + newPlan);
				recomputeAvailableSchedules();
			}

			private void removePlanification(Planification oldPlan) {
				// System.out.println("Removed a planification from " +
				// getName()
				// + oldPlan);
				recomputeAvailableSchedules();
			}

			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				// System.out.println("OH! " + msg);
				// if (!msg.wasSet())
				// return;

				switch (msg.getFeatureID(Person.class)) {
				case NajaPackage.PERSON__IMPUTATIONS:
					switch (msg.getEventType()) {
					case Notification.ADD:
						addImputation((Imputation) msg.getNewValue());
						break;
					case Notification.ADD_MANY:
						List<Imputation> imps = (List<Imputation>) msg
								.getNewValue();
						for (Imputation imp : imps) {
							addImputation(imp);
						}
						break;
					case Notification.REMOVE:
						removeImputation((Imputation) msg.getOldValue());
						break;
					case Notification.REMOVE_MANY:
						List<Imputation> imputs = (List<Imputation>) msg
								.getOldValue();
						for (Imputation imp : imputs) {
							removeImputation(imp);
						}
						break;
					}
					break;
				case NajaPackage.PERSON__PLANIFICATIONS:
					switch (msg.getEventType()) {
					case Notification.ADD:
						addPlanification((Planification) msg.getNewValue());
						break;
					case Notification.ADD_MANY:
						List<Planification> plans = (List<Planification>) msg
								.getNewValue();
						for (Planification plan : plans) {
							addPlanification(plan);
						}
						break;
					case Notification.REMOVE:
						removePlanification((Planification) msg.getOldValue());
						break;
					case Notification.REMOVE_MANY:
						List<Planification> planifs = (List<Planification>) msg
								.getOldValue();
						for (Planification planif : planifs) {
							removePlanification(planif);
						}
					}
					break;

				case NajaPackage.PERSON__AVAILABLE_SCHEDULES:
					switch (msg.getEventType()) {
					case Notification.ADD:
					case Notification.ADD_MANY:
						// Collections.sort(getAvailableSchedules(),
						// new Comparator<Schedule>() {
						//
						// @Override
						// public int compare(Schedule o1, Schedule o2) {
						// // TODO check nulls
						// return o1.getDate().compareTo(
						// o2.getDate());
						// }
						// });
						break;
					}
					break;

				case NajaPackage.PERSON__TOTAL_AVAILABILITY:
				case NajaPackage.PERSON__MAX_LOAD_PER_DAY:
					recomputeAvailableSchedules();
					break;
				}
			}

		});
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

	void recomputeAvailableSchedules() {
		getAvailableSchedules().clear();
		if (null == availabilityStartDate) {
			return;
		}

		// fill it with all "opened" schedules then remove the imputations
		SortedSet<Date> dates = Utils.findOpenedDates(availabilityStartDate,
				totalAvailability, maxLoadPerDay);

		// TODO continue!!
		int i = 0;
		int leftAvailability = totalAvailability;

		for (Date date : dates) {
			Schedule schedule = NajaFactory.eINSTANCE.createSchedule();
			schedule.setDate(date);
			schedule.setLoad(Math.min(getMaxLoadPerDay(), Math.min(8,
					leftAvailability)));
			leftAvailability -= schedule.getLoad();
			getAvailableSchedules().add(schedule);
		}

		for (Imputation imputation : getImputations()) {
			reserveSchedule(imputation);
		}

		for (Planification planification : getPlanifications()) {

			VirtualImputation virtualImputation = NajaFactory.eINSTANCE
					.createVirtualImputation();
			planification.setVirtualImputation(virtualImputation);

			Iterator<Schedule> iterator = getAvailableSchedules().iterator();
			int unimputedLoad = planification.getUnimputedLoad();
			while (iterator.hasNext()
					&& virtualImputation.getTotalLoad() < unimputedLoad) {
				Schedule schedule = iterator.next();

				int leftToImpute = planification.getLoad()
						- virtualImputation.getTotalLoad();
				int imputeLoad = Math.min(getMaxLoadPerDay(), Math.min(Math
						.min(leftToImpute, planification.getMaxLoadPerDay()),
						schedule.getLoad()));
				if (schedule.getLoad() > imputeLoad) {
					// split it in two
					schedule.setLoad(schedule.getLoad() - imputeLoad);

					Schedule stillAvailableSchedule = NajaFactory.eINSTANCE
							.createSchedule();
					stillAvailableSchedule.setDate(schedule.getDate());
					stillAvailableSchedule.setLoad(imputeLoad);
					virtualImputation.getSchedules()
							.add(stillAvailableSchedule);
				} else {
					// consume the whole sched
					iterator.remove();
					virtualImputation.getSchedules().add(schedule);
				}
			}
		}
	}

	private void releaseSchedule(Imputation imputation) {
		Date date = imputation.getDate();

		Iterator<Schedule> iterator = getAvailableSchedules().iterator();
		Schedule schedule = null;
		while (iterator.hasNext()) {
			Schedule tmpSchedule = iterator.next();
			if (date.equals(tmpSchedule.getDate())) {
				schedule = tmpSchedule;
				break;
			}
		}
		if (null == schedule) {
			schedule = NajaFactory.eINSTANCE.createSchedule();
			schedule.setDate(date);
			schedule.setLoad(0);
			getAvailableSchedules().add(schedule);
		}
		schedule.setLoad(schedule.getLoad() + imputation.getLoad());
	}

	private void reserveSchedule(Imputation imputation) {
		Date date = imputation.getDate();
		if (null == date) {
			System.err.println("Imputation with null date will be ignored!");
			return;
		}

		Schedule schedule = null;
		Iterator<Schedule> iterator = getAvailableSchedules().iterator();
		while (iterator.hasNext()) {
			Schedule tempSchedule = iterator.next();
			if (sameDay(tempSchedule.getDate(), date)) {
				schedule = tempSchedule;
				// if (tempSchedule.getLoad() < imputation.getLoad()) {
				// System.err.println("Resource " + getName()
				// + " is not available enough for imputation on "
				// + date);
				//
				// imputation.setResource(null);
				// return;
				// // throw new IllegalStateException("User " + getName()+
				// // " is not available for imputation on " + date);
				// }
				tempSchedule.setLoad(tempSchedule.getLoad()
						- imputation.getLoad());
				if (0 >= tempSchedule.getLoad()) {
					iterator.remove();
				}
				break;
			}
		}
		// if (null == schedule) {
		// System.err.println("Resource " + getName()
		// + " is not available for imputation on " + date);
		// imputation.setResource(null);
		// // throw new IllegalStateException("User " + getName()+
		// // " is not available for imputation on " + date);
		// }
	}

	private final static SimpleDateFormat dayFormat = new SimpleDateFormat(
			"yyyyMMdd");

	private boolean sameDay(Date date, Date date2) {
		// return dayFormat.format(date).equals(dayFormat.format(date2));
		return date.equals(date2);
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
	 * 
	 * @generated NOT
	 */
	public Date getLastDate() {
		Date last = null;
		for (Imputation imputation : getImputations()) {
			if (null == last || last.before(imputation.getDate())) {
				last = imputation.getDate();
			}
		}
		for (Planification planification : getPlanifications()) {
			Date planifLast = planification.getLastDate();
			if (null == planifLast) {
				continue;
			}
			if (null == last) {
				last = planifLast;
				continue;
			}
			if (last.before(planifLast)) {
				last = planifLast;
			}
		}
		return last;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLoadPerDay() {
		return maxLoadPerDay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLoadPerDay(int newMaxLoadPerDay) {
		int oldMaxLoadPerDay = maxLoadPerDay;
		maxLoadPerDay = newMaxLoadPerDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PERSON__MAX_LOAD_PER_DAY, oldMaxLoadPerDay, maxLoadPerDay));
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
			case NajaPackage.PERSON__LAST_DATE:
				return getLastDate();
			case NajaPackage.PERSON__MAX_LOAD_PER_DAY:
				return new Integer(getMaxLoadPerDay());
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
			case NajaPackage.PERSON__MAX_LOAD_PER_DAY:
				setMaxLoadPerDay(((Integer)newValue).intValue());
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
			case NajaPackage.PERSON__MAX_LOAD_PER_DAY:
				setMaxLoadPerDay(MAX_LOAD_PER_DAY_EDEFAULT);
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
			case NajaPackage.PERSON__LAST_DATE:
				return LAST_DATE_EDEFAULT == null ? getLastDate() != null : !LAST_DATE_EDEFAULT.equals(getLastDate());
			case NajaPackage.PERSON__MAX_LOAD_PER_DAY:
				return maxLoadPerDay != MAX_LOAD_PER_DAY_EDEFAULT;
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
		result.append(", maxLoadPerDay: ");
		result.append(maxLoadPerDay);
		result.append(')');
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(17 % 8);
		System.out.println(17 / 8);
	}

} // PersonImpl
