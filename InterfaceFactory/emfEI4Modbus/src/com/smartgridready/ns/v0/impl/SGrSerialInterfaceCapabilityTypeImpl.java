/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.EBaudRateType;
import com.smartgridready.ns.v0.EByteLenType;
import com.smartgridready.ns.v0.EParityType;
import com.smartgridready.ns.v0.EStopBitLenType;
import com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType;
import com.smartgridready.ns.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Serial Interface Capability Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrSerialInterfaceCapabilityTypeImpl#getBaudRatesSupported <em>Baud Rates Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrSerialInterfaceCapabilityTypeImpl#getByteLenSupported <em>Byte Len Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrSerialInterfaceCapabilityTypeImpl#getParitySupported <em>Parity Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrSerialInterfaceCapabilityTypeImpl#getStopBitLenSupported <em>Stop Bit Len Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrSerialInterfaceCapabilityTypeImpl extends MinimalEObjectImpl.Container implements SGrSerialInterfaceCapabilityType {
	/**
	 * The cached value of the '{@link #getBaudRatesSupported() <em>Baud Rates Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRatesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<EBaudRateType> baudRatesSupported;

	/**
	 * The cached value of the '{@link #getByteLenSupported() <em>Byte Len Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLenSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<EByteLenType> byteLenSupported;

	/**
	 * The cached value of the '{@link #getParitySupported() <em>Parity Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParitySupported()
	 * @generated
	 * @ordered
	 */
	protected EList<EParityType> paritySupported;

	/**
	 * The cached value of the '{@link #getStopBitLenSupported() <em>Stop Bit Len Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBitLenSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<EStopBitLenType> stopBitLenSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrSerialInterfaceCapabilityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrSerialInterfaceCapabilityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EBaudRateType> getBaudRatesSupported() {
		if (baudRatesSupported == null) {
			baudRatesSupported = new EDataTypeEList<EBaudRateType>(EBaudRateType.class, this, V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BAUD_RATES_SUPPORTED);
		}
		return baudRatesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EByteLenType> getByteLenSupported() {
		if (byteLenSupported == null) {
			byteLenSupported = new EDataTypeEList<EByteLenType>(EByteLenType.class, this, V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BYTE_LEN_SUPPORTED);
		}
		return byteLenSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParityType> getParitySupported() {
		if (paritySupported == null) {
			paritySupported = new EDataTypeEList<EParityType>(EParityType.class, this, V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__PARITY_SUPPORTED);
		}
		return paritySupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EStopBitLenType> getStopBitLenSupported() {
		if (stopBitLenSupported == null) {
			stopBitLenSupported = new EDataTypeEList<EStopBitLenType>(EStopBitLenType.class, this, V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__STOP_BIT_LEN_SUPPORTED);
		}
		return stopBitLenSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BAUD_RATES_SUPPORTED:
				return getBaudRatesSupported();
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BYTE_LEN_SUPPORTED:
				return getByteLenSupported();
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__PARITY_SUPPORTED:
				return getParitySupported();
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__STOP_BIT_LEN_SUPPORTED:
				return getStopBitLenSupported();
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
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BAUD_RATES_SUPPORTED:
				getBaudRatesSupported().clear();
				getBaudRatesSupported().addAll((Collection<? extends EBaudRateType>)newValue);
				return;
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BYTE_LEN_SUPPORTED:
				getByteLenSupported().clear();
				getByteLenSupported().addAll((Collection<? extends EByteLenType>)newValue);
				return;
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__PARITY_SUPPORTED:
				getParitySupported().clear();
				getParitySupported().addAll((Collection<? extends EParityType>)newValue);
				return;
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__STOP_BIT_LEN_SUPPORTED:
				getStopBitLenSupported().clear();
				getStopBitLenSupported().addAll((Collection<? extends EStopBitLenType>)newValue);
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
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BAUD_RATES_SUPPORTED:
				getBaudRatesSupported().clear();
				return;
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BYTE_LEN_SUPPORTED:
				getByteLenSupported().clear();
				return;
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__PARITY_SUPPORTED:
				getParitySupported().clear();
				return;
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__STOP_BIT_LEN_SUPPORTED:
				getStopBitLenSupported().clear();
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
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BAUD_RATES_SUPPORTED:
				return baudRatesSupported != null && !baudRatesSupported.isEmpty();
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__BYTE_LEN_SUPPORTED:
				return byteLenSupported != null && !byteLenSupported.isEmpty();
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__PARITY_SUPPORTED:
				return paritySupported != null && !paritySupported.isEmpty();
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE__STOP_BIT_LEN_SUPPORTED:
				return stopBitLenSupported != null && !stopBitLenSupported.isEmpty();
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
		result.append(" (baudRatesSupported: ");
		result.append(baudRatesSupported);
		result.append(", byteLenSupported: ");
		result.append(byteLenSupported);
		result.append(", paritySupported: ");
		result.append(paritySupported);
		result.append(", stopBitLenSupported: ");
		result.append(stopBitLenSupported);
		result.append(')');
		return result.toString();
	}

} //SGrSerialInterfaceCapabilityTypeImpl
