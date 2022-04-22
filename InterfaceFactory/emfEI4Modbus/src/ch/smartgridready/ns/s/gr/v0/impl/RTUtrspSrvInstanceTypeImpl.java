/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.EBaudRateType;
import ch.smartgridready.ns.s.gr.v0.EByteLenType;
import ch.smartgridready.ns.s.gr.v0.EParityType;
import ch.smartgridready.ns.s.gr.v0.EStopBitLenType;
import ch.smartgridready.ns.s.gr.v0.RTUtrspSrvInstanceType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Utrsp Srv Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.RTUtrspSrvInstanceTypeImpl#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.RTUtrspSrvInstanceTypeImpl#getByteLen <em>Byte Len</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.RTUtrspSrvInstanceTypeImpl#getParity <em>Parity</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.RTUtrspSrvInstanceTypeImpl#getStopBitLen <em>Stop Bit Len</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTUtrspSrvInstanceTypeImpl extends MinimalEObjectImpl.Container implements RTUtrspSrvInstanceType {
	/**
	 * The default value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected static final EBaudRateType BAUD_RATE_EDEFAULT = EBaudRateType._300;

	/**
	 * The cached value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected EBaudRateType baudRate = BAUD_RATE_EDEFAULT;

	/**
	 * This is true if the Baud Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baudRateESet;

	/**
	 * The default value of the '{@link #getByteLen() <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLen()
	 * @generated
	 * @ordered
	 */
	protected static final EByteLenType BYTE_LEN_EDEFAULT = EByteLenType._7;

	/**
	 * The cached value of the '{@link #getByteLen() <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLen()
	 * @generated
	 * @ordered
	 */
	protected EByteLenType byteLen = BYTE_LEN_EDEFAULT;

	/**
	 * This is true if the Byte Len attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean byteLenESet;

	/**
	 * The default value of the '{@link #getParity() <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParity()
	 * @generated
	 * @ordered
	 */
	protected static final EParityType PARITY_EDEFAULT = EParityType.EVEN;

	/**
	 * The cached value of the '{@link #getParity() <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParity()
	 * @generated
	 * @ordered
	 */
	protected EParityType parity = PARITY_EDEFAULT;

	/**
	 * This is true if the Parity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parityESet;

	/**
	 * The default value of the '{@link #getStopBitLen() <em>Stop Bit Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBitLen()
	 * @generated
	 * @ordered
	 */
	protected static final EStopBitLenType STOP_BIT_LEN_EDEFAULT = EStopBitLenType._0;

	/**
	 * The cached value of the '{@link #getStopBitLen() <em>Stop Bit Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBitLen()
	 * @generated
	 * @ordered
	 */
	protected EStopBitLenType stopBitLen = STOP_BIT_LEN_EDEFAULT;

	/**
	 * This is true if the Stop Bit Len attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stopBitLenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTUtrspSrvInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getRTUtrspSrvInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBaudRateType getBaudRate() {
		return baudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaudRate(EBaudRateType newBaudRate) {
		EBaudRateType oldBaudRate = baudRate;
		baudRate = newBaudRate == null ? BAUD_RATE_EDEFAULT : newBaudRate;
		boolean oldBaudRateESet = baudRateESet;
		baudRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE, oldBaudRate, baudRate, !oldBaudRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBaudRate() {
		EBaudRateType oldBaudRate = baudRate;
		boolean oldBaudRateESet = baudRateESet;
		baudRate = BAUD_RATE_EDEFAULT;
		baudRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE, oldBaudRate, BAUD_RATE_EDEFAULT, oldBaudRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBaudRate() {
		return baudRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EByteLenType getByteLen() {
		return byteLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteLen(EByteLenType newByteLen) {
		EByteLenType oldByteLen = byteLen;
		byteLen = newByteLen == null ? BYTE_LEN_EDEFAULT : newByteLen;
		boolean oldByteLenESet = byteLenESet;
		byteLenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN, oldByteLen, byteLen, !oldByteLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetByteLen() {
		EByteLenType oldByteLen = byteLen;
		boolean oldByteLenESet = byteLenESet;
		byteLen = BYTE_LEN_EDEFAULT;
		byteLenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN, oldByteLen, BYTE_LEN_EDEFAULT, oldByteLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetByteLen() {
		return byteLenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EParityType getParity() {
		return parity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParity(EParityType newParity) {
		EParityType oldParity = parity;
		parity = newParity == null ? PARITY_EDEFAULT : newParity;
		boolean oldParityESet = parityESet;
		parityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__PARITY, oldParity, parity, !oldParityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetParity() {
		EParityType oldParity = parity;
		boolean oldParityESet = parityESet;
		parity = PARITY_EDEFAULT;
		parityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__PARITY, oldParity, PARITY_EDEFAULT, oldParityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetParity() {
		return parityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStopBitLenType getStopBitLen() {
		return stopBitLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopBitLen(EStopBitLenType newStopBitLen) {
		EStopBitLenType oldStopBitLen = stopBitLen;
		stopBitLen = newStopBitLen == null ? STOP_BIT_LEN_EDEFAULT : newStopBitLen;
		boolean oldStopBitLenESet = stopBitLenESet;
		stopBitLenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN, oldStopBitLen, stopBitLen, !oldStopBitLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStopBitLen() {
		EStopBitLenType oldStopBitLen = stopBitLen;
		boolean oldStopBitLenESet = stopBitLenESet;
		stopBitLen = STOP_BIT_LEN_EDEFAULT;
		stopBitLenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN, oldStopBitLen, STOP_BIT_LEN_EDEFAULT, oldStopBitLenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStopBitLen() {
		return stopBitLenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE:
				return getBaudRate();
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN:
				return getByteLen();
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__PARITY:
				return getParity();
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN:
				return getStopBitLen();
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
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE:
				setBaudRate((EBaudRateType)newValue);
				return;
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN:
				setByteLen((EByteLenType)newValue);
				return;
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__PARITY:
				setParity((EParityType)newValue);
				return;
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN:
				setStopBitLen((EStopBitLenType)newValue);
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
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE:
				unsetBaudRate();
				return;
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN:
				unsetByteLen();
				return;
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__PARITY:
				unsetParity();
				return;
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN:
				unsetStopBitLen();
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
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BAUD_RATE:
				return isSetBaudRate();
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__BYTE_LEN:
				return isSetByteLen();
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__PARITY:
				return isSetParity();
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE__STOP_BIT_LEN:
				return isSetStopBitLen();
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
		result.append(" (baudRate: ");
		if (baudRateESet) result.append(baudRate); else result.append("<unset>");
		result.append(", byteLen: ");
		if (byteLenESet) result.append(byteLen); else result.append("<unset>");
		result.append(", parity: ");
		if (parityESet) result.append(parity); else result.append("<unset>");
		result.append(", stopBitLen: ");
		if (stopBitLenESet) result.append(stopBitLen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RTUtrspSrvInstanceTypeImpl
