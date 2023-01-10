/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.NetworkConnectionStateType;
import com.smartgridready.ns.v0.SGrAttr4ModbusType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusFunctionalProfileType;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Device Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl#getModbusAttr <em>Modbus Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl#getTimeSyncBlockNotification <em>Time Sync Block Notification</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDeviceFrameImpl#getNetworkConnectionState <em>Network Connection State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusDeviceFrameImpl extends SGrDeviceBaseTypeImpl implements SGrModbusDeviceFrame {
	/**
	 * The cached value of the '{@link #getModbusAttr() <em>Modbus Attr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusAttr()
	 * @generated
	 * @ordered
	 */
	protected SGrAttr4ModbusType modbusAttr;

	/**
	 * The cached value of the '{@link #getModbusInterfaceDesc() <em>Modbus Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusInterfaceDesc()
	 * @generated
	 * @ordered
	 */
	protected SGrModbusInterfaceDescriptionType modbusInterfaceDesc;

	/**
	 * The cached value of the '{@link #getFpListElement() <em>Fp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusFunctionalProfileType> fpListElement;

	/**
	 * The cached value of the '{@link #getTimeSyncBlockNotification() <em>Time Sync Block Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSyncBlockNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrTimeSyncBlockNotificationType> timeSyncBlockNotification;

	/**
	 * The cached value of the '{@link #getNetworkConnectionState() <em>Network Connection State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkConnectionState()
	 * @generated
	 * @ordered
	 */
	protected NetworkConnectionStateType networkConnectionState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusDeviceFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusDeviceFrame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrAttr4ModbusType getModbusAttr() {
		return modbusAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModbusAttr(SGrAttr4ModbusType newModbusAttr, NotificationChain msgs) {
		SGrAttr4ModbusType oldModbusAttr = modbusAttr;
		modbusAttr = newModbusAttr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR, oldModbusAttr, newModbusAttr);
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
	public void setModbusAttr(SGrAttr4ModbusType newModbusAttr) {
		if (newModbusAttr != modbusAttr) {
			NotificationChain msgs = null;
			if (modbusAttr != null)
				msgs = ((InternalEObject)modbusAttr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR, null, msgs);
			if (newModbusAttr != null)
				msgs = ((InternalEObject)newModbusAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR, null, msgs);
			msgs = basicSetModbusAttr(newModbusAttr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR, newModbusAttr, newModbusAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrModbusInterfaceDescriptionType getModbusInterfaceDesc() {
		return modbusInterfaceDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModbusInterfaceDesc(SGrModbusInterfaceDescriptionType newModbusInterfaceDesc, NotificationChain msgs) {
		SGrModbusInterfaceDescriptionType oldModbusInterfaceDesc = modbusInterfaceDesc;
		modbusInterfaceDesc = newModbusInterfaceDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC, oldModbusInterfaceDesc, newModbusInterfaceDesc);
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
	public void setModbusInterfaceDesc(SGrModbusInterfaceDescriptionType newModbusInterfaceDesc) {
		if (newModbusInterfaceDesc != modbusInterfaceDesc) {
			NotificationChain msgs = null;
			if (modbusInterfaceDesc != null)
				msgs = ((InternalEObject)modbusInterfaceDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC, null, msgs);
			if (newModbusInterfaceDesc != null)
				msgs = ((InternalEObject)newModbusInterfaceDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC, null, msgs);
			msgs = basicSetModbusInterfaceDesc(newModbusInterfaceDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC, newModbusInterfaceDesc, newModbusInterfaceDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrModbusFunctionalProfileType> getFpListElement() {
		if (fpListElement == null) {
			fpListElement = new EObjectContainmentEList<SGrModbusFunctionalProfileType>(SGrModbusFunctionalProfileType.class, this, V0Package.SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT);
		}
		return fpListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrTimeSyncBlockNotificationType> getTimeSyncBlockNotification() {
		if (timeSyncBlockNotification == null) {
			timeSyncBlockNotification = new EObjectContainmentEList<SGrTimeSyncBlockNotificationType>(SGrTimeSyncBlockNotificationType.class, this, V0Package.SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION);
		}
		return timeSyncBlockNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkConnectionStateType getNetworkConnectionState() {
		return networkConnectionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkConnectionState(NetworkConnectionStateType newNetworkConnectionState, NotificationChain msgs) {
		NetworkConnectionStateType oldNetworkConnectionState = networkConnectionState;
		networkConnectionState = newNetworkConnectionState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE, oldNetworkConnectionState, newNetworkConnectionState);
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
	public void setNetworkConnectionState(NetworkConnectionStateType newNetworkConnectionState) {
		if (newNetworkConnectionState != networkConnectionState) {
			NotificationChain msgs = null;
			if (networkConnectionState != null)
				msgs = ((InternalEObject)networkConnectionState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE, null, msgs);
			if (newNetworkConnectionState != null)
				msgs = ((InternalEObject)newNetworkConnectionState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE, null, msgs);
			msgs = basicSetNetworkConnectionState(newNetworkConnectionState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE, newNetworkConnectionState, newNetworkConnectionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR:
				return basicSetModbusAttr(null, msgs);
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC:
				return basicSetModbusInterfaceDesc(null, msgs);
			case V0Package.SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT:
				return ((InternalEList<?>)getFpListElement()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION:
				return ((InternalEList<?>)getTimeSyncBlockNotification()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE:
				return basicSetNetworkConnectionState(null, msgs);
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
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR:
				return getModbusAttr();
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC:
				return getModbusInterfaceDesc();
			case V0Package.SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT:
				return getFpListElement();
			case V0Package.SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION:
				return getTimeSyncBlockNotification();
			case V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE:
				return getNetworkConnectionState();
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
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR:
				setModbusAttr((SGrAttr4ModbusType)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC:
				setModbusInterfaceDesc((SGrModbusInterfaceDescriptionType)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT:
				getFpListElement().clear();
				getFpListElement().addAll((Collection<? extends SGrModbusFunctionalProfileType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION:
				getTimeSyncBlockNotification().clear();
				getTimeSyncBlockNotification().addAll((Collection<? extends SGrTimeSyncBlockNotificationType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE:
				setNetworkConnectionState((NetworkConnectionStateType)newValue);
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
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR:
				setModbusAttr((SGrAttr4ModbusType)null);
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC:
				setModbusInterfaceDesc((SGrModbusInterfaceDescriptionType)null);
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT:
				getFpListElement().clear();
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION:
				getTimeSyncBlockNotification().clear();
				return;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE:
				setNetworkConnectionState((NetworkConnectionStateType)null);
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
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_ATTR:
				return modbusAttr != null;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__MODBUS_INTERFACE_DESC:
				return modbusInterfaceDesc != null;
			case V0Package.SGR_MODBUS_DEVICE_FRAME__FP_LIST_ELEMENT:
				return fpListElement != null && !fpListElement.isEmpty();
			case V0Package.SGR_MODBUS_DEVICE_FRAME__TIME_SYNC_BLOCK_NOTIFICATION:
				return timeSyncBlockNotification != null && !timeSyncBlockNotification.isEmpty();
			case V0Package.SGR_MODBUS_DEVICE_FRAME__NETWORK_CONNECTION_STATE:
				return networkConnectionState != null;
		}
		return super.eIsSet(featureID);
	}

} //SGrModbusDeviceFrameImpl
