/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrAttr4ModbusType;
import com.smartgridready.ns.v0.SGrModbusDataPointType;
import com.smartgridready.ns.v0.SGrModbusFunctionalProfileType;
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
 * An implementation of the model object '<em><b>SGr Modbus Functional Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusFunctionalProfileTypeImpl#getTimeSyncBlockNotification <em>Time Sync Block Notification</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusFunctionalProfileTypeImpl#getModbusAttr <em>Modbus Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusFunctionalProfileTypeImpl#getDpListElement <em>Dp List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusFunctionalProfileTypeImpl extends SGrFunctionalProfileBaseTypeImpl implements SGrModbusFunctionalProfileType {
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
	 * The cached value of the '{@link #getModbusAttr() <em>Modbus Attr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusAttr()
	 * @generated
	 * @ordered
	 */
	protected SGrAttr4ModbusType modbusAttr;

	/**
	 * The cached value of the '{@link #getDpListElement() <em>Dp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusDataPointType> dpListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusFunctionalProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusFunctionalProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrTimeSyncBlockNotificationType> getTimeSyncBlockNotification() {
		if (timeSyncBlockNotification == null) {
			timeSyncBlockNotification = new EObjectContainmentEList<SGrTimeSyncBlockNotificationType>(SGrTimeSyncBlockNotificationType.class, this, V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__TIME_SYNC_BLOCK_NOTIFICATION);
		}
		return timeSyncBlockNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR, oldModbusAttr, newModbusAttr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModbusAttr(SGrAttr4ModbusType newModbusAttr) {
		if (newModbusAttr != modbusAttr) {
			NotificationChain msgs = null;
			if (modbusAttr != null)
				msgs = ((InternalEObject)modbusAttr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR, null, msgs);
			if (newModbusAttr != null)
				msgs = ((InternalEObject)newModbusAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR, null, msgs);
			msgs = basicSetModbusAttr(newModbusAttr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR, newModbusAttr, newModbusAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGrModbusDataPointType> getDpListElement() {
		if (dpListElement == null) {
			dpListElement = new EObjectContainmentEList<SGrModbusDataPointType>(SGrModbusDataPointType.class, this, V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT);
		}
		return dpListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return ((InternalEList<?>)getTimeSyncBlockNotification()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR:
				return basicSetModbusAttr(null, msgs);
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				return ((InternalEList<?>)getDpListElement()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return getTimeSyncBlockNotification();
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR:
				return getModbusAttr();
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				return getDpListElement();
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
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				getTimeSyncBlockNotification().clear();
				getTimeSyncBlockNotification().addAll((Collection<? extends SGrTimeSyncBlockNotificationType>)newValue);
				return;
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR:
				setModbusAttr((SGrAttr4ModbusType)newValue);
				return;
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
				getDpListElement().addAll((Collection<? extends SGrModbusDataPointType>)newValue);
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
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				getTimeSyncBlockNotification().clear();
				return;
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR:
				setModbusAttr((SGrAttr4ModbusType)null);
				return;
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				getDpListElement().clear();
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
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__TIME_SYNC_BLOCK_NOTIFICATION:
				return timeSyncBlockNotification != null && !timeSyncBlockNotification.isEmpty();
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__MODBUS_ATTR:
				return modbusAttr != null;
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE__DP_LIST_ELEMENT:
				return dpListElement != null && !dpListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGrModbusFunctionalProfileTypeImpl
