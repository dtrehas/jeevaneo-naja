/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.timeentries.impl;

import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.jeevaneo.naja.Imputation;
import com.jeevaneo.naja.NajaFactory;
import com.jeevaneo.naja.NajaPackage;
import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.TaskMapping;
import com.jeevaneo.naja.timeentries.TimeEntry;
import com.jeevaneo.naja.timeentries.TimeentriesFactory;
import com.jeevaneo.naja.timeentries.TimeentriesPackage;
import com.jeevaneo.naja.timeentries.util.TimeentriesAdapterFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Time Entry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl#getDay <em>Day</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link com.jeevaneo.naja.timeentries.impl.TimeEntryImpl#getImputation <em>Imputation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEntryImpl extends EObjectImpl implements TimeEntry {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected int day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected int load = LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Person resource;

	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected TaskMapping externalId;

	/**
	 * The cached value of the '{@link #getImputation() <em>Imputation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImputation()
	 * @generated
	 * @ordered
	 */
	protected Imputation imputation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected TimeEntryImpl() {
		super();
		eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				// System.out.println("OH! " + msg);
				// if (!msg.wasSet())
				// return;

				switch (msg.getFeatureID(Person.class)) {
				case TimeentriesPackage.TIME_ENTRY__DAY:
				case TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID:
				case TimeentriesPackage.TIME_ENTRY__LOAD:
				case TimeentriesPackage.TIME_ENTRY__RESOURCE:
					if (msg.getEventType() == msg.SET
							|| msg.getEventType() == msg.UNSET) {
//						recomputeImputation();
					}
					break;
				}
			}

		});
	}

//	void recomputeImputation() {
//
//		
//		if (eResource() == null) {
//			return;
//		}
//
//		Imputation imputation = getImputation();
//
//		if (null != imputation) {
//			imputation.eUnset(NajaPackage.Literals.IMPUTATION__RESOURCE);
//			imputation.eUnset(NajaPackage.Literals.IMPUTATION__TASK);
//			imputation.eUnset(NajaPackage.Literals.IMPUTATION__PLANIFICATION);
//		}
//		eUnset(TimeentriesPackage.TIME_ENTRY__IMPUTATION);
////		setImputation(null);
//
//		if (getDay() < 20000101) {
//			return;
//		}
//		if (null == getExternalId()) {
//			return;
//		}
//		if (null == getResource()) {
//			return;
//		}
//		if (getLoad() < 1) {
//			return;
//		}
//
//		imputation = NajaFactory.eINSTANCE.createImputation();
//
//		imputation.setComment("generated from timeentry at " + new Date());
//		Date date = computeDate(getDay());
//		imputation.setDate(date);
//		imputation.setLoad(getLoad());
//		// inferPlanification(imputation);
//
//		imputation.setTask(getExternalId().getTask());
//		imputation.setResource(getResource());
//		setImputation(imputation);
//		// System.out.println(getImputation()==imputation);
//		// System.out.println(getImputation().eResource()==null);
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeentriesPackage.Literals.TIME_ENTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(int newDay) {
		int oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(int newLoad) {
		int oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Person getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Person)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeentriesPackage.TIME_ENTRY__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Person newResource) {
		Person oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMapping getExternalId() {
		if (externalId != null && externalId.eIsProxy()) {
			InternalEObject oldExternalId = (InternalEObject)externalId;
			externalId = (TaskMapping)eResolveProxy(oldExternalId);
			if (externalId != oldExternalId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID, oldExternalId, externalId));
			}
		}
		return externalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMapping basicGetExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalId(TaskMapping newExternalId) {
		TaskMapping oldExternalId = externalId;
		externalId = newExternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID, oldExternalId, externalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imputation getImputation() {
		return imputation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImputation(Imputation newImputation, NotificationChain msgs) {
		Imputation oldImputation = imputation;
		imputation = newImputation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__IMPUTATION, oldImputation, newImputation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImputation(Imputation newImputation) {
		if (newImputation != imputation) {
			NotificationChain msgs = null;
			if (imputation != null)
				msgs = ((InternalEObject)imputation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimeentriesPackage.TIME_ENTRY__IMPUTATION, null, msgs);
			if (newImputation != null)
				msgs = ((InternalEObject)newImputation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimeentriesPackage.TIME_ENTRY__IMPUTATION, null, msgs);
			msgs = basicSetImputation(newImputation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeentriesPackage.TIME_ENTRY__IMPUTATION, newImputation, newImputation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeentriesPackage.TIME_ENTRY__IMPUTATION:
				return basicSetImputation(null, msgs);
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
			case TimeentriesPackage.TIME_ENTRY__COMMENT:
				return getComment();
			case TimeentriesPackage.TIME_ENTRY__DAY:
				return new Integer(getDay());
			case TimeentriesPackage.TIME_ENTRY__LOAD:
				return new Integer(getLoad());
			case TimeentriesPackage.TIME_ENTRY__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID:
				if (resolve) return getExternalId();
				return basicGetExternalId();
			case TimeentriesPackage.TIME_ENTRY__IMPUTATION:
				return getImputation();
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
			case TimeentriesPackage.TIME_ENTRY__COMMENT:
				setComment((String)newValue);
				return;
			case TimeentriesPackage.TIME_ENTRY__DAY:
				setDay(((Integer)newValue).intValue());
				return;
			case TimeentriesPackage.TIME_ENTRY__LOAD:
				setLoad(((Integer)newValue).intValue());
				return;
			case TimeentriesPackage.TIME_ENTRY__RESOURCE:
				setResource((Person)newValue);
				return;
			case TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID:
				setExternalId((TaskMapping)newValue);
				return;
			case TimeentriesPackage.TIME_ENTRY__IMPUTATION:
				setImputation((Imputation)newValue);
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
			case TimeentriesPackage.TIME_ENTRY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TimeentriesPackage.TIME_ENTRY__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case TimeentriesPackage.TIME_ENTRY__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case TimeentriesPackage.TIME_ENTRY__RESOURCE:
				setResource((Person)null);
				return;
			case TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID:
				setExternalId((TaskMapping)null);
				return;
			case TimeentriesPackage.TIME_ENTRY__IMPUTATION:
				setImputation((Imputation)null);
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
			case TimeentriesPackage.TIME_ENTRY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TimeentriesPackage.TIME_ENTRY__DAY:
				return day != DAY_EDEFAULT;
			case TimeentriesPackage.TIME_ENTRY__LOAD:
				return load != LOAD_EDEFAULT;
			case TimeentriesPackage.TIME_ENTRY__RESOURCE:
				return resource != null;
			case TimeentriesPackage.TIME_ENTRY__EXTERNAL_ID:
				return externalId != null;
			case TimeentriesPackage.TIME_ENTRY__IMPUTATION:
				return imputation != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", day: ");
		result.append(day);
		result.append(", load: ");
		result.append(load);
		result.append(')');
		return result.toString();
	}

} // TimeEntryImpl
