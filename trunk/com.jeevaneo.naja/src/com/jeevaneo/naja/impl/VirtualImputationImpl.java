/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Schedule;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.VirtualImputation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Virtual Imputation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.impl.VirtualImputationImpl#getTotalLoad <em>Total Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.VirtualImputationImpl#getFirstDate <em>First Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.VirtualImputationImpl#getLastDate <em>Last Date</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.VirtualImputationImpl#getPlanification <em>Planification</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.VirtualImputationImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.VirtualImputationImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualImputationImpl extends EObjectImpl implements
		VirtualImputation {
	/**
	 * The default value of the '{@link #getTotalLoad() <em>Total Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_LOAD_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getFirstDate() <em>First Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFirstDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastDate() <em>Last Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_DATE_EDEFAULT = null;

	private Date firstDate = null;
	private Date lastDate = null;
	private int totalLoad = 0;

	/**
	 * The cached value of the '{@link #getSchedules() <em>Schedules</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Schedule> schedules;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected VirtualImputationImpl() {
		super();

		eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);

				switch (msg.getFeatureID(VirtualImputation.class)) {
				case NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES:
					recomputeTotalLoad();
					break;
				default:
					break;
				}
			}

		});
	}

	protected void recomputeTotalLoad() {
		int load = 0;
		for (Schedule schedule : getSchedules()) {
			load += schedule.getLoad();
			if (null == this.firstDate) {
				this.firstDate = schedule.getDate();
			} else {
				if (this.firstDate.after(schedule.getDate())) {
					this.firstDate = schedule.getDate();
				}
			}
			if (null == this.lastDate) {
				this.lastDate = schedule.getDate();
			} else {
				if (this.lastDate.before(schedule.getDate())) {
					this.lastDate = schedule.getDate();
				}
			}
		}
		this.totalLoad = load;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NajaPackage.Literals.VIRTUAL_IMPUTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getTotalLoad() {
		return totalLoad;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getFirstDate() {
		return firstDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getLastDate() {
		return lastDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Planification getPlanification() {
		if (eContainerFeatureID != NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION) return null;
		return (Planification)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanification(
			Planification newPlanification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlanification, NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanification(Planification newPlanification) {
		if (newPlanification != eInternalContainer() || (eContainerFeatureID != NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION && newPlanification != null)) {
			if (EcoreUtil.isAncestor(this, newPlanification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlanification != null)
				msgs = ((InternalEObject)newPlanification).eInverseAdd(this, NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION, Planification.class, msgs);
			msgs = basicSetPlanification(newPlanification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION, newPlanification, newPlanification));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getLabel() {
		String who = "somebody";
		String what = "something";
		Planification planif =getPlanification(); 
		if (null != planif) {
			Person resource = planif.getResource();
			if (null != resource) {
				who = resource.getName();
			}
			Task task = planif.getTask();
			if(null!=task)				
			{
				what=task.getName();
			}
		}
		return String
				.format(
						"%s : %d hours on %s between %4$tY-%4$tm-%4$td and %5$tY-%5$tm-%5$td",
						who, getTotalLoad(), what, firstDate, lastDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlanification((Planification)otherEnd, msgs);
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
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				return basicSetPlanification(null, msgs);
			case NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				return eInternalContainer().eInverseRemove(this, NajaPackage.PLANIFICATION__VIRTUAL_IMPUTATION, Planification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NajaPackage.VIRTUAL_IMPUTATION__TOTAL_LOAD:
				return new Integer(getTotalLoad());
			case NajaPackage.VIRTUAL_IMPUTATION__FIRST_DATE:
				return getFirstDate();
			case NajaPackage.VIRTUAL_IMPUTATION__LAST_DATE:
				return getLastDate();
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				return getPlanification();
			case NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES:
				return getSchedules();
			case NajaPackage.VIRTUAL_IMPUTATION__LABEL:
				return getLabel();
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
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				setPlanification((Planification)newValue);
				return;
			case NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Schedule>)newValue);
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
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				setPlanification((Planification)null);
				return;
			case NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES:
				getSchedules().clear();
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
			case NajaPackage.VIRTUAL_IMPUTATION__TOTAL_LOAD:
				return getTotalLoad() != TOTAL_LOAD_EDEFAULT;
			case NajaPackage.VIRTUAL_IMPUTATION__FIRST_DATE:
				return FIRST_DATE_EDEFAULT == null ? getFirstDate() != null : !FIRST_DATE_EDEFAULT.equals(getFirstDate());
			case NajaPackage.VIRTUAL_IMPUTATION__LAST_DATE:
				return LAST_DATE_EDEFAULT == null ? getLastDate() != null : !LAST_DATE_EDEFAULT.equals(getLastDate());
			case NajaPackage.VIRTUAL_IMPUTATION__PLANIFICATION:
				return getPlanification() != null;
			case NajaPackage.VIRTUAL_IMPUTATION__SCHEDULES:
				return schedules != null && !schedules.isEmpty();
			case NajaPackage.VIRTUAL_IMPUTATION__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
		}
		return super.eIsSet(featureID);
	}

	public static void main(String[] args) {
		System.out.printf("%1$tY-%1$tm-%1$td", new Date());
	}

} // VirtualImputationImpl
