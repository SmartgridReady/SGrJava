/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import com.smartgridready.ns.v0.V0Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TS Gr Modbus Register Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TSGrModbusRegisterRefImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TSGrModbusRegisterRefImpl#getBitRank <em>Bit Rank</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TSGrModbusRegisterRefImpl#getRegisterType <em>Register Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSGrModbusRegisterRefImpl extends MinimalEObjectImpl.Container implements TSGrModbusRegisterRef {
	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger addr = ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitRank() <em>Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRank()
	 * @generated
	 * @ordered
	 */
	protected static final short BIT_RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitRank() <em>Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRank()
	 * @generated
	 * @ordered
	 */
	protected short bitRank = BIT_RANK_EDEFAULT;

	/**
	 * This is true if the Bit Rank attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitRankESet;

	/**
	 * The default value of the '{@link #getRegisterType() <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterType()
	 * @generated
	 * @ordered
	 */
	protected static final TEnumObjectType REGISTER_TYPE_EDEFAULT = TEnumObjectType.COIL;

	/**
	 * The cached value of the '{@link #getRegisterType() <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterType()
	 * @generated
	 * @ordered
	 */
	protected TEnumObjectType registerType = REGISTER_TYPE_EDEFAULT;

	/**
	 * This is true if the Register Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean registerTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSGrModbusRegisterRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTSGrModbusRegisterRef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(BigInteger newAddr) {
		BigInteger oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TS_GR_MODBUS_REGISTER_REF__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBitRank() {
		return bitRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitRank(short newBitRank) {
		short oldBitRank = bitRank;
		bitRank = newBitRank;
		boolean oldBitRankESet = bitRankESet;
		bitRankESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TS_GR_MODBUS_REGISTER_REF__BIT_RANK, oldBitRank, bitRank, !oldBitRankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitRank() {
		short oldBitRank = bitRank;
		boolean oldBitRankESet = bitRankESet;
		bitRank = BIT_RANK_EDEFAULT;
		bitRankESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TS_GR_MODBUS_REGISTER_REF__BIT_RANK, oldBitRank, BIT_RANK_EDEFAULT, oldBitRankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitRank() {
		return bitRankESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEnumObjectType getRegisterType() {
		return registerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterType(TEnumObjectType newRegisterType) {
		TEnumObjectType oldRegisterType = registerType;
		registerType = newRegisterType == null ? REGISTER_TYPE_EDEFAULT : newRegisterType;
		boolean oldRegisterTypeESet = registerTypeESet;
		registerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE, oldRegisterType, registerType, !oldRegisterTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegisterType() {
		TEnumObjectType oldRegisterType = registerType;
		boolean oldRegisterTypeESet = registerTypeESet;
		registerType = REGISTER_TYPE_EDEFAULT;
		registerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE, oldRegisterType, REGISTER_TYPE_EDEFAULT, oldRegisterTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegisterType() {
		return registerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.TS_GR_MODBUS_REGISTER_REF__ADDR:
				return getAddr();
			case V0Package.TS_GR_MODBUS_REGISTER_REF__BIT_RANK:
				return getBitRank();
			case V0Package.TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE:
				return getRegisterType();
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
			case V0Package.TS_GR_MODBUS_REGISTER_REF__ADDR:
				setAddr((BigInteger)newValue);
				return;
			case V0Package.TS_GR_MODBUS_REGISTER_REF__BIT_RANK:
				setBitRank((Short)newValue);
				return;
			case V0Package.TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE:
				setRegisterType((TEnumObjectType)newValue);
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
			case V0Package.TS_GR_MODBUS_REGISTER_REF__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case V0Package.TS_GR_MODBUS_REGISTER_REF__BIT_RANK:
				unsetBitRank();
				return;
			case V0Package.TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE:
				unsetRegisterType();
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
			case V0Package.TS_GR_MODBUS_REGISTER_REF__ADDR:
				return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
			case V0Package.TS_GR_MODBUS_REGISTER_REF__BIT_RANK:
				return isSetBitRank();
			case V0Package.TS_GR_MODBUS_REGISTER_REF__REGISTER_TYPE:
				return isSetRegisterType();
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
		result.append(" (addr: ");
		result.append(addr);
		result.append(", bitRank: ");
		if (bitRankESet) result.append(bitRank); else result.append("<unset>");
		result.append(", registerType: ");
		if (registerTypeESet) result.append(registerType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TSGrModbusRegisterRefImpl
