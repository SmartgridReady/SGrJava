/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.RTUType;
import com.smartgridready.ns.v0.TCPType;
import com.smartgridready.ns.v0.TrspServiceModbusType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trsp Service Modbus Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TrspServiceModbusTypeImpl#getRtu <em>Rtu</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TrspServiceModbusTypeImpl#getTcp <em>Tcp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrspServiceModbusTypeImpl extends MinimalEObjectImpl.Container implements TrspServiceModbusType {
	/**
	 * The cached value of the '{@link #getRtu() <em>Rtu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtu()
	 * @generated
	 * @ordered
	 */
	protected RTUType rtu;

	/**
	 * The cached value of the '{@link #getTcp() <em>Tcp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcp()
	 * @generated
	 * @ordered
	 */
	protected TCPType tcp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrspServiceModbusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTrspServiceModbusType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RTUType getRtu() {
		return rtu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtu(RTUType newRtu, NotificationChain msgs) {
		RTUType oldRtu = rtu;
		rtu = newRtu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU, oldRtu, newRtu);
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
	public void setRtu(RTUType newRtu) {
		if (newRtu != rtu) {
			NotificationChain msgs = null;
			if (rtu != null)
				msgs = ((InternalEObject)rtu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU, null, msgs);
			if (newRtu != null)
				msgs = ((InternalEObject)newRtu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU, null, msgs);
			msgs = basicSetRtu(newRtu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU, newRtu, newRtu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCPType getTcp() {
		return tcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTcp(TCPType newTcp, NotificationChain msgs) {
		TCPType oldTcp = tcp;
		tcp = newTcp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP, oldTcp, newTcp);
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
	public void setTcp(TCPType newTcp) {
		if (newTcp != tcp) {
			NotificationChain msgs = null;
			if (tcp != null)
				msgs = ((InternalEObject)tcp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP, null, msgs);
			if (newTcp != null)
				msgs = ((InternalEObject)newTcp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP, null, msgs);
			msgs = basicSetTcp(newTcp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP, newTcp, newTcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU:
				return basicSetRtu(null, msgs);
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP:
				return basicSetTcp(null, msgs);
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
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU:
				return getRtu();
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP:
				return getTcp();
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
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU:
				setRtu((RTUType)newValue);
				return;
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP:
				setTcp((TCPType)newValue);
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
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU:
				setRtu((RTUType)null);
				return;
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP:
				setTcp((TCPType)null);
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
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__RTU:
				return rtu != null;
			case V0Package.TRSP_SERVICE_MODBUS_TYPE__TCP:
				return tcp != null;
		}
		return super.eIsSet(featureID);
	}

} //TrspServiceModbusTypeImpl
