/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.MasterFunctionsSupportedType;
import com.smartgridready.ns.v0.ModbusJMESPathType;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Data Point Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getModbusDataType <em>Modbus Data Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getArrLen <em>Arr Len</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getModbusFirstRegisterReference <em>Modbus First Register Reference</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getDpSizeNrRegisters <em>Dp Size Nr Registers</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getBitmask <em>Bitmask</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getMasterFunctionsSupported <em>Master Functions Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrModbusDataPointDescriptionTypeImpl#getModbusJMESPath <em>Modbus JMES Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusDataPointDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusDataPointDescriptionType {
	/**
	 * The cached value of the '{@link #getModbusDataType() <em>Modbus Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusDataType()
	 * @generated
	 * @ordered
	 */
	protected SGrBasicGenDataPointTypeType modbusDataType;

	/**
	 * The default value of the '{@link #getArrLen() <em>Arr Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrLen()
	 * @generated
	 * @ordered
	 */
	protected static final int ARR_LEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArrLen() <em>Arr Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrLen()
	 * @generated
	 * @ordered
	 */
	protected int arrLen = ARR_LEN_EDEFAULT;

	/**
	 * This is true if the Arr Len attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrLenESet;

	/**
	 * The cached value of the '{@link #getModbusFirstRegisterReference() <em>Modbus First Register Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusFirstRegisterReference()
	 * @generated
	 * @ordered
	 */
	protected TSGrModbusRegisterRef modbusFirstRegisterReference;

	/**
	 * The default value of the '{@link #getDpSizeNrRegisters() <em>Dp Size Nr Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpSizeNrRegisters()
	 * @generated
	 * @ordered
	 */
	protected static final int DP_SIZE_NR_REGISTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDpSizeNrRegisters() <em>Dp Size Nr Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpSizeNrRegisters()
	 * @generated
	 * @ordered
	 */
	protected int dpSizeNrRegisters = DP_SIZE_NR_REGISTERS_EDEFAULT;

	/**
	 * This is true if the Dp Size Nr Registers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dpSizeNrRegistersESet;

	/**
	 * The default value of the '{@link #getBitmask() <em>Bitmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitmask()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BITMASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitmask() <em>Bitmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitmask()
	 * @generated
	 * @ordered
	 */
	protected byte[] bitmask = BITMASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMasterFunctionsSupported() <em>Master Functions Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFunctionsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterFunctionsSupportedType> masterFunctionsSupported;

	/**
	 * The cached value of the '{@link #getModbusJMESPath() <em>Modbus JMES Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModbusJMESPath()
	 * @generated
	 * @ordered
	 */
	protected ModbusJMESPathType modbusJMESPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusDataPointDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusDataPointDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrBasicGenDataPointTypeType getModbusDataType() {
		return modbusDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModbusDataType(SGrBasicGenDataPointTypeType newModbusDataType, NotificationChain msgs) {
		SGrBasicGenDataPointTypeType oldModbusDataType = modbusDataType;
		modbusDataType = newModbusDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE, oldModbusDataType, newModbusDataType);
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
	public void setModbusDataType(SGrBasicGenDataPointTypeType newModbusDataType) {
		if (newModbusDataType != modbusDataType) {
			NotificationChain msgs = null;
			if (modbusDataType != null)
				msgs = ((InternalEObject)modbusDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE, null, msgs);
			if (newModbusDataType != null)
				msgs = ((InternalEObject)newModbusDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE, null, msgs);
			msgs = basicSetModbusDataType(newModbusDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE, newModbusDataType, newModbusDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getArrLen() {
		return arrLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrLen(int newArrLen) {
		int oldArrLen = arrLen;
		arrLen = newArrLen;
		boolean oldArrLenESet = arrLenESet;
		arrLenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN, oldArrLen, arrLen, !oldArrLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArrLen() {
		int oldArrLen = arrLen;
		boolean oldArrLenESet = arrLenESet;
		arrLen = ARR_LEN_EDEFAULT;
		arrLenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN, oldArrLen, ARR_LEN_EDEFAULT, oldArrLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArrLen() {
		return arrLenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSGrModbusRegisterRef getModbusFirstRegisterReference() {
		return modbusFirstRegisterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModbusFirstRegisterReference(TSGrModbusRegisterRef newModbusFirstRegisterReference, NotificationChain msgs) {
		TSGrModbusRegisterRef oldModbusFirstRegisterReference = modbusFirstRegisterReference;
		modbusFirstRegisterReference = newModbusFirstRegisterReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE, oldModbusFirstRegisterReference, newModbusFirstRegisterReference);
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
	public void setModbusFirstRegisterReference(TSGrModbusRegisterRef newModbusFirstRegisterReference) {
		if (newModbusFirstRegisterReference != modbusFirstRegisterReference) {
			NotificationChain msgs = null;
			if (modbusFirstRegisterReference != null)
				msgs = ((InternalEObject)modbusFirstRegisterReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE, null, msgs);
			if (newModbusFirstRegisterReference != null)
				msgs = ((InternalEObject)newModbusFirstRegisterReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE, null, msgs);
			msgs = basicSetModbusFirstRegisterReference(newModbusFirstRegisterReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE, newModbusFirstRegisterReference, newModbusFirstRegisterReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDpSizeNrRegisters() {
		return dpSizeNrRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDpSizeNrRegisters(int newDpSizeNrRegisters) {
		int oldDpSizeNrRegisters = dpSizeNrRegisters;
		dpSizeNrRegisters = newDpSizeNrRegisters;
		boolean oldDpSizeNrRegistersESet = dpSizeNrRegistersESet;
		dpSizeNrRegistersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS, oldDpSizeNrRegisters, dpSizeNrRegisters, !oldDpSizeNrRegistersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDpSizeNrRegisters() {
		int oldDpSizeNrRegisters = dpSizeNrRegisters;
		boolean oldDpSizeNrRegistersESet = dpSizeNrRegistersESet;
		dpSizeNrRegisters = DP_SIZE_NR_REGISTERS_EDEFAULT;
		dpSizeNrRegistersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS, oldDpSizeNrRegisters, DP_SIZE_NR_REGISTERS_EDEFAULT, oldDpSizeNrRegistersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDpSizeNrRegisters() {
		return dpSizeNrRegistersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getBitmask() {
		return bitmask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBitmask(byte[] newBitmask) {
		byte[] oldBitmask = bitmask;
		bitmask = newBitmask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__BITMASK, oldBitmask, bitmask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MasterFunctionsSupportedType> getMasterFunctionsSupported() {
		if (masterFunctionsSupported == null) {
			masterFunctionsSupported = new EDataTypeEList<MasterFunctionsSupportedType>(MasterFunctionsSupportedType.class, this, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MASTER_FUNCTIONS_SUPPORTED);
		}
		return masterFunctionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModbusJMESPathType getModbusJMESPath() {
		return modbusJMESPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModbusJMESPath(ModbusJMESPathType newModbusJMESPath, NotificationChain msgs) {
		ModbusJMESPathType oldModbusJMESPath = modbusJMESPath;
		modbusJMESPath = newModbusJMESPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH, oldModbusJMESPath, newModbusJMESPath);
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
	public void setModbusJMESPath(ModbusJMESPathType newModbusJMESPath) {
		if (newModbusJMESPath != modbusJMESPath) {
			NotificationChain msgs = null;
			if (modbusJMESPath != null)
				msgs = ((InternalEObject)modbusJMESPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH, null, msgs);
			if (newModbusJMESPath != null)
				msgs = ((InternalEObject)newModbusJMESPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH, null, msgs);
			msgs = basicSetModbusJMESPath(newModbusJMESPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH, newModbusJMESPath, newModbusJMESPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE:
				return basicSetModbusDataType(null, msgs);
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE:
				return basicSetModbusFirstRegisterReference(null, msgs);
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH:
				return basicSetModbusJMESPath(null, msgs);
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
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE:
				return getModbusDataType();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN:
				return getArrLen();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE:
				return getModbusFirstRegisterReference();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS:
				return getDpSizeNrRegisters();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__BITMASK:
				return getBitmask();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MASTER_FUNCTIONS_SUPPORTED:
				return getMasterFunctionsSupported();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH:
				return getModbusJMESPath();
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
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE:
				setModbusDataType((SGrBasicGenDataPointTypeType)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN:
				setArrLen((Integer)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE:
				setModbusFirstRegisterReference((TSGrModbusRegisterRef)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS:
				setDpSizeNrRegisters((Integer)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__BITMASK:
				setBitmask((byte[])newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MASTER_FUNCTIONS_SUPPORTED:
				getMasterFunctionsSupported().clear();
				getMasterFunctionsSupported().addAll((Collection<? extends MasterFunctionsSupportedType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH:
				setModbusJMESPath((ModbusJMESPathType)newValue);
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
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE:
				setModbusDataType((SGrBasicGenDataPointTypeType)null);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN:
				unsetArrLen();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE:
				setModbusFirstRegisterReference((TSGrModbusRegisterRef)null);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS:
				unsetDpSizeNrRegisters();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__BITMASK:
				setBitmask(BITMASK_EDEFAULT);
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MASTER_FUNCTIONS_SUPPORTED:
				getMasterFunctionsSupported().clear();
				return;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH:
				setModbusJMESPath((ModbusJMESPathType)null);
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
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_DATA_TYPE:
				return modbusDataType != null;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__ARR_LEN:
				return isSetArrLen();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_FIRST_REGISTER_REFERENCE:
				return modbusFirstRegisterReference != null;
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__DP_SIZE_NR_REGISTERS:
				return isSetDpSizeNrRegisters();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__BITMASK:
				return BITMASK_EDEFAULT == null ? bitmask != null : !BITMASK_EDEFAULT.equals(bitmask);
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MASTER_FUNCTIONS_SUPPORTED:
				return masterFunctionsSupported != null && !masterFunctionsSupported.isEmpty();
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE__MODBUS_JMES_PATH:
				return modbusJMESPath != null;
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
		result.append(" (arrLen: ");
		if (arrLenESet) result.append(arrLen); else result.append("<unset>");
		result.append(", dpSizeNrRegisters: ");
		if (dpSizeNrRegistersESet) result.append(dpSizeNrRegisters); else result.append("<unset>");
		result.append(", bitmask: ");
		result.append(bitmask);
		result.append(", masterFunctionsSupported: ");
		result.append(masterFunctionsSupported);
		result.append(')');
		return result.toString();
	}

} //SGrModbusDataPointDescriptionTypeImpl
