/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.jeevaneo.naja.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.jeevaneo.naja.Person;
import com.jeevaneo.naja.Planification;
import com.jeevaneo.naja.Task;
import com.jeevaneo.naja.NajaPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link com.jeevaneo.naja.impl.PlanificationImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanificationImpl extends EObjectImpl implements Planification {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Person resource;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected int load = LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NajaPackage.Literals.PLANIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Person)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NajaPackage.PLANIFICATION__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Person newResource, NotificationChain msgs) {
		Person oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Person newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, NajaPackage.PERSON__PLANIFICATIONS, Person.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, NajaPackage.PERSON__PLANIFICATIONS, Person.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NajaPackage.PLANIFICATION__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, NajaPackage.TASK__PLANIFICATIONS, Task.class, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, NajaPackage.TASK__PLANIFICATIONS, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(int newLoad) {
		int oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NajaPackage.PLANIFICATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel() {
		return String.format(/*"%s: "+*/"%d on %s"/*, getResource()==null?"nobody!":getResource().getName()*/, load, getTask()==null?"nothing!":getTask().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetLabel() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, NajaPackage.PERSON__PLANIFICATIONS, Person.class, msgs);
				return basicSetResource((Person)otherEnd, msgs);
			case NajaPackage.PLANIFICATION__TASK:
				if (task != null)
					msgs = ((InternalEObject)task).eInverseRemove(this, NajaPackage.TASK__PLANIFICATIONS, Task.class, msgs);
				return basicSetTask((Task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__RESOURCE:
				return basicSetResource(null, msgs);
			case NajaPackage.PLANIFICATION__TASK:
				return basicSetTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__LABEL:
				return getLabel();
			case NajaPackage.PLANIFICATION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case NajaPackage.PLANIFICATION__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case NajaPackage.PLANIFICATION__LOAD:
				return new Integer(getLoad());
			case NajaPackage.PLANIFICATION__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__RESOURCE:
				setResource((Person)newValue);
				return;
			case NajaPackage.PLANIFICATION__TASK:
				setTask((Task)newValue);
				return;
			case NajaPackage.PLANIFICATION__LOAD:
				setLoad(((Integer)newValue).intValue());
				return;
			case NajaPackage.PLANIFICATION__COMMENT:
				setComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__RESOURCE:
				setResource((Person)null);
				return;
			case NajaPackage.PLANIFICATION__TASK:
				setTask((Task)null);
				return;
			case NajaPackage.PLANIFICATION__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case NajaPackage.PLANIFICATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NajaPackage.PLANIFICATION__LABEL:
				return isSetLabel();
			case NajaPackage.PLANIFICATION__RESOURCE:
				return resource != null;
			case NajaPackage.PLANIFICATION__TASK:
				return task != null;
			case NajaPackage.PLANIFICATION__LOAD:
				return load != LOAD_EDEFAULT;
			case NajaPackage.PLANIFICATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (load: ");
		result.append(load);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PlanificationImpl
