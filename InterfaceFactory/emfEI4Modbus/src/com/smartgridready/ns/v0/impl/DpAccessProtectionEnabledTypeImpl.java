/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.DpAccessProtectionEnabledType;
import com.smartgridready.ns.v0.TEnumExceptionCodeType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dp Access Protection Enabled Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.DpAccessProtectionEnabledTypeImpl#getModbusException <em>Modbus Exception</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.DpAccessProtectionEnabledTypeImpl#isIsEnabled <em>Is Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DpAccessProtectionEnabledTypeImpl extends MinimalEObjectImpl.Container implements DpAccessProtectionEnabledType {
	/**
	 * The default value of the '{@link #getModbusException() <em>Modbus Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusException()
	 * @generated
	 * @ordered
	 */
	protected static final TEnumExceptionCodeType MODBUS_EXCEPTION_EDEFAULT = TEnumExceptionCodeType.ILLEGAL_FUNCTION;

	/**
	 * The cached value of the '{@link #getModbusException() <em>Modbus Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusException()
	 * @generated
	 * @ordered
	 */
	protected TEnumExceptionCodeType modbusException = MODBUS_EXCEPTION_EDEFAULT;

	/**
	 * This is true if the Modbus Exception attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modbusExceptionESet;

	/**
	 * The default value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnabled = IS_ENABLED_EDEFAULT;

	/**
	 * This is true if the Is Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isEnabledESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DpAccessProtectionEnabledTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getDpAccessProtectionEnabledType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEnumExceptionCodeType getModbusException() {
		return modbusException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModbusException(TEnumExceptionCodeType newModbusException) {
		TEnumExceptionCodeType oldModbusException = modbusException;
		modbusException = newModbusException == null ? MODBUS_EXCEPTION_EDEFAULT : newModbusException;
		boolean oldModbusExceptionESet = modbusExceptionESet;
		modbusExceptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION, oldModbusException, modbusException, !oldModbusExceptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetModbusException() {
		TEnumExceptionCodeType oldModbusException = modbusException;
		boolean oldModbusExceptionESet = modbusExceptionESet;
		modbusException = MODBUS_EXCEPTION_EDEFAULT;
		modbusExceptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION, oldModbusException, MODBUS_EXCEPTION_EDEFAULT, oldModbusExceptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetModbusException() {
		return modbusExceptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsEnabled() {
		return isEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEnabled(boolean newIsEnabled) {
		boolean oldIsEnabled = isEnabled;
		isEnabled = newIsEnabled;
		boolean oldIsEnabledESet = isEnabledESet;
		isEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED, oldIsEnabled, isEnabled, !oldIsEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsEnabled() {
		boolean oldIsEnabled = isEnabled;
		boolean oldIsEnabledESet = isEnabledESet;
		isEnabled = IS_ENABLED_EDEFAULT;
		isEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED, oldIsEnabled, IS_ENABLED_EDEFAULT, oldIsEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsEnabled() {
		return isEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION:
				return getModbusException();
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED:
				return isIsEnabled();
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
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION:
				setModbusException((TEnumExceptionCodeType)newValue);
				return;
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED:
				setIsEnabled((Boolean)newValue);
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
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION:
				unsetModbusException();
				return;
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED:
				unsetIsEnabled();
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
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__MODBUS_EXCEPTION:
				return isSetModbusException();
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE__IS_ENABLED:
				return isSetIsEnabled();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modbusException: ");
		if (modbusExceptionESet) result.append(modbusException); else result.append("<unset>");
		result.append(", isEnabled: ");
		if (isEnabledESet) result.append(isEnabled); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DpAccessProtectionEnabledTypeImpl
