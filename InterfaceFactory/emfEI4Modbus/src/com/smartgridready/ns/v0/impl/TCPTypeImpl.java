/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.TCPDevInstanceType;
import com.smartgridready.ns.v0.TCPType;
import com.smartgridready.ns.v0.TCPtrspSrvInstanceType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCP Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TCPTypeImpl#getTcpTrspSrvInstance <em>Tcp Trsp Srv Instance</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TCPTypeImpl#getTcpDevInstance <em>Tcp Dev Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCPTypeImpl extends MinimalEObjectImpl.Container implements TCPType {
	/**
	 * The cached value of the '{@link #getTcpTrspSrvInstance() <em>Tcp Trsp Srv Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcpTrspSrvInstance()
	 * @generated
	 * @ordered
	 */
	protected TCPtrspSrvInstanceType tcpTrspSrvInstance;

	/**
	 * The cached value of the '{@link #getTcpDevInstance() <em>Tcp Dev Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcpDevInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<TCPDevInstanceType> tcpDevInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTCPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCPtrspSrvInstanceType getTcpTrspSrvInstance() {
		return tcpTrspSrvInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTcpTrspSrvInstance(TCPtrspSrvInstanceType newTcpTrspSrvInstance, NotificationChain msgs) {
		TCPtrspSrvInstanceType oldTcpTrspSrvInstance = tcpTrspSrvInstance;
		tcpTrspSrvInstance = newTcpTrspSrvInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE, oldTcpTrspSrvInstance, newTcpTrspSrvInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTcpTrspSrvInstance(TCPtrspSrvInstanceType newTcpTrspSrvInstance) {
		if (newTcpTrspSrvInstance != tcpTrspSrvInstance) {
			NotificationChain msgs = null;
			if (tcpTrspSrvInstance != null)
				msgs = ((InternalEObject)tcpTrspSrvInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE, null, msgs);
			if (newTcpTrspSrvInstance != null)
				msgs = ((InternalEObject)newTcpTrspSrvInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE, null, msgs);
			msgs = basicSetTcpTrspSrvInstance(newTcpTrspSrvInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE, newTcpTrspSrvInstance, newTcpTrspSrvInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCPDevInstanceType> getTcpDevInstance() {
		if (tcpDevInstance == null) {
			tcpDevInstance = new EObjectContainmentEList<TCPDevInstanceType>(TCPDevInstanceType.class, this, V0Package.TCP_TYPE__TCP_DEV_INSTANCE);
		}
		return tcpDevInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE:
				return basicSetTcpTrspSrvInstance(null, msgs);
			case V0Package.TCP_TYPE__TCP_DEV_INSTANCE:
				return ((InternalEList<?>)getTcpDevInstance()).basicRemove(otherEnd, msgs);
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
			case V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE:
				return getTcpTrspSrvInstance();
			case V0Package.TCP_TYPE__TCP_DEV_INSTANCE:
				return getTcpDevInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE:
				setTcpTrspSrvInstance((TCPtrspSrvInstanceType)newValue);
				return;
			case V0Package.TCP_TYPE__TCP_DEV_INSTANCE:
				getTcpDevInstance().clear();
				getTcpDevInstance().addAll((Collection<? extends TCPDevInstanceType>)newValue);
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
			case V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE:
				setTcpTrspSrvInstance((TCPtrspSrvInstanceType)null);
				return;
			case V0Package.TCP_TYPE__TCP_DEV_INSTANCE:
				getTcpDevInstance().clear();
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
			case V0Package.TCP_TYPE__TCP_TRSP_SRV_INSTANCE:
				return tcpTrspSrvInstance != null;
			case V0Package.TCP_TYPE__TCP_DEV_INSTANCE:
				return tcpDevInstance != null && !tcpDevInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TCPTypeImpl
