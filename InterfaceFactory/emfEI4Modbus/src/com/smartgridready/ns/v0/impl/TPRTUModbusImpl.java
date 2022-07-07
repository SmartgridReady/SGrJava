/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.EBaudRateType;
import com.smartgridready.ns.v0.EByteLenType;
import com.smartgridready.ns.v0.EParityType;
import com.smartgridready.ns.v0.EStopBitLenType;
import com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType;
import com.smartgridready.ns.v0.TPRTUModbus;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPRTU Modbus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl#getSlaveAddr <em>Slave Addr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl#getBaudRateSelected <em>Baud Rate Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl#getByteLenSelected <em>Byte Len Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl#getParitySelected <em>Parity Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl#getStopBitLenSelected <em>Stop Bit Len Selected</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.TPRTUModbusImpl#getSerialInterfaceCapability <em>Serial Interface Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPRTUModbusImpl extends MinimalEObjectImpl.Container implements TPRTUModbus {
	/**
	 * The default value of the '{@link #getSlaveAddr() <em>Slave Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveAddr()
	 * @generated
	 * @ordered
	 */
	protected static final int SLAVE_ADDR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSlaveAddr() <em>Slave Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveAddr()
	 * @generated
	 * @ordered
	 */
	protected int slaveAddr = SLAVE_ADDR_EDEFAULT;

	/**
	 * This is true if the Slave Addr attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slaveAddrESet;

	/**
	 * The default value of the '{@link #getBaudRateSelected() <em>Baud Rate Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRateSelected()
	 * @generated
	 * @ordered
	 */
	protected static final EBaudRateType BAUD_RATE_SELECTED_EDEFAULT = EBaudRateType._300;

	/**
	 * The cached value of the '{@link #getBaudRateSelected() <em>Baud Rate Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRateSelected()
	 * @generated
	 * @ordered
	 */
	protected EBaudRateType baudRateSelected = BAUD_RATE_SELECTED_EDEFAULT;

	/**
	 * This is true if the Baud Rate Selected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baudRateSelectedESet;

	/**
	 * The default value of the '{@link #getByteLenSelected() <em>Byte Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLenSelected()
	 * @generated
	 * @ordered
	 */
	protected static final EByteLenType BYTE_LEN_SELECTED_EDEFAULT = EByteLenType._7;

	/**
	 * The cached value of the '{@link #getByteLenSelected() <em>Byte Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLenSelected()
	 * @generated
	 * @ordered
	 */
	protected EByteLenType byteLenSelected = BYTE_LEN_SELECTED_EDEFAULT;

	/**
	 * This is true if the Byte Len Selected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean byteLenSelectedESet;

	/**
	 * The default value of the '{@link #getParitySelected() <em>Parity Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParitySelected()
	 * @generated
	 * @ordered
	 */
	protected static final EParityType PARITY_SELECTED_EDEFAULT = EParityType.EVEN;

	/**
	 * The cached value of the '{@link #getParitySelected() <em>Parity Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParitySelected()
	 * @generated
	 * @ordered
	 */
	protected EParityType paritySelected = PARITY_SELECTED_EDEFAULT;

	/**
	 * This is true if the Parity Selected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paritySelectedESet;

	/**
	 * The default value of the '{@link #getStopBitLenSelected() <em>Stop Bit Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBitLenSelected()
	 * @generated
	 * @ordered
	 */
	protected static final EStopBitLenType STOP_BIT_LEN_SELECTED_EDEFAULT = EStopBitLenType._0;

	/**
	 * The cached value of the '{@link #getStopBitLenSelected() <em>Stop Bit Len Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBitLenSelected()
	 * @generated
	 * @ordered
	 */
	protected EStopBitLenType stopBitLenSelected = STOP_BIT_LEN_SELECTED_EDEFAULT;

	/**
	 * This is true if the Stop Bit Len Selected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stopBitLenSelectedESet;

	/**
	 * The cached value of the '{@link #getSerialInterfaceCapability() <em>Serial Interface Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialInterfaceCapability()
	 * @generated
	 * @ordered
	 */
	protected SGrSerialInterfaceCapabilityType serialInterfaceCapability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPRTUModbusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTPRTUModbus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSlaveAddr() {
		return slaveAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlaveAddr(int newSlaveAddr) {
		int oldSlaveAddr = slaveAddr;
		slaveAddr = newSlaveAddr;
		boolean oldSlaveAddrESet = slaveAddrESet;
		slaveAddrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__SLAVE_ADDR, oldSlaveAddr, slaveAddr, !oldSlaveAddrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSlaveAddr() {
		int oldSlaveAddr = slaveAddr;
		boolean oldSlaveAddrESet = slaveAddrESet;
		slaveAddr = SLAVE_ADDR_EDEFAULT;
		slaveAddrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPRTU_MODBUS__SLAVE_ADDR, oldSlaveAddr, SLAVE_ADDR_EDEFAULT, oldSlaveAddrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSlaveAddr() {
		return slaveAddrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBaudRateType getBaudRateSelected() {
		return baudRateSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaudRateSelected(EBaudRateType newBaudRateSelected) {
		EBaudRateType oldBaudRateSelected = baudRateSelected;
		baudRateSelected = newBaudRateSelected == null ? BAUD_RATE_SELECTED_EDEFAULT : newBaudRateSelected;
		boolean oldBaudRateSelectedESet = baudRateSelectedESet;
		baudRateSelectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__BAUD_RATE_SELECTED, oldBaudRateSelected, baudRateSelected, !oldBaudRateSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBaudRateSelected() {
		EBaudRateType oldBaudRateSelected = baudRateSelected;
		boolean oldBaudRateSelectedESet = baudRateSelectedESet;
		baudRateSelected = BAUD_RATE_SELECTED_EDEFAULT;
		baudRateSelectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPRTU_MODBUS__BAUD_RATE_SELECTED, oldBaudRateSelected, BAUD_RATE_SELECTED_EDEFAULT, oldBaudRateSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBaudRateSelected() {
		return baudRateSelectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EByteLenType getByteLenSelected() {
		return byteLenSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteLenSelected(EByteLenType newByteLenSelected) {
		EByteLenType oldByteLenSelected = byteLenSelected;
		byteLenSelected = newByteLenSelected == null ? BYTE_LEN_SELECTED_EDEFAULT : newByteLenSelected;
		boolean oldByteLenSelectedESet = byteLenSelectedESet;
		byteLenSelectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__BYTE_LEN_SELECTED, oldByteLenSelected, byteLenSelected, !oldByteLenSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetByteLenSelected() {
		EByteLenType oldByteLenSelected = byteLenSelected;
		boolean oldByteLenSelectedESet = byteLenSelectedESet;
		byteLenSelected = BYTE_LEN_SELECTED_EDEFAULT;
		byteLenSelectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPRTU_MODBUS__BYTE_LEN_SELECTED, oldByteLenSelected, BYTE_LEN_SELECTED_EDEFAULT, oldByteLenSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetByteLenSelected() {
		return byteLenSelectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EParityType getParitySelected() {
		return paritySelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParitySelected(EParityType newParitySelected) {
		EParityType oldParitySelected = paritySelected;
		paritySelected = newParitySelected == null ? PARITY_SELECTED_EDEFAULT : newParitySelected;
		boolean oldParitySelectedESet = paritySelectedESet;
		paritySelectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__PARITY_SELECTED, oldParitySelected, paritySelected, !oldParitySelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetParitySelected() {
		EParityType oldParitySelected = paritySelected;
		boolean oldParitySelectedESet = paritySelectedESet;
		paritySelected = PARITY_SELECTED_EDEFAULT;
		paritySelectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPRTU_MODBUS__PARITY_SELECTED, oldParitySelected, PARITY_SELECTED_EDEFAULT, oldParitySelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetParitySelected() {
		return paritySelectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStopBitLenType getStopBitLenSelected() {
		return stopBitLenSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopBitLenSelected(EStopBitLenType newStopBitLenSelected) {
		EStopBitLenType oldStopBitLenSelected = stopBitLenSelected;
		stopBitLenSelected = newStopBitLenSelected == null ? STOP_BIT_LEN_SELECTED_EDEFAULT : newStopBitLenSelected;
		boolean oldStopBitLenSelectedESet = stopBitLenSelectedESet;
		stopBitLenSelectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__STOP_BIT_LEN_SELECTED, oldStopBitLenSelected, stopBitLenSelected, !oldStopBitLenSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStopBitLenSelected() {
		EStopBitLenType oldStopBitLenSelected = stopBitLenSelected;
		boolean oldStopBitLenSelectedESet = stopBitLenSelectedESet;
		stopBitLenSelected = STOP_BIT_LEN_SELECTED_EDEFAULT;
		stopBitLenSelectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPRTU_MODBUS__STOP_BIT_LEN_SELECTED, oldStopBitLenSelected, STOP_BIT_LEN_SELECTED_EDEFAULT, oldStopBitLenSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStopBitLenSelected() {
		return stopBitLenSelectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSerialInterfaceCapabilityType getSerialInterfaceCapability() {
		return serialInterfaceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialInterfaceCapability(SGrSerialInterfaceCapabilityType newSerialInterfaceCapability, NotificationChain msgs) {
		SGrSerialInterfaceCapabilityType oldSerialInterfaceCapability = serialInterfaceCapability;
		serialInterfaceCapability = newSerialInterfaceCapability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY, oldSerialInterfaceCapability, newSerialInterfaceCapability);
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
	public void setSerialInterfaceCapability(SGrSerialInterfaceCapabilityType newSerialInterfaceCapability) {
		if (newSerialInterfaceCapability != serialInterfaceCapability) {
			NotificationChain msgs = null;
			if (serialInterfaceCapability != null)
				msgs = ((InternalEObject)serialInterfaceCapability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY, null, msgs);
			if (newSerialInterfaceCapability != null)
				msgs = ((InternalEObject)newSerialInterfaceCapability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY, null, msgs);
			msgs = basicSetSerialInterfaceCapability(newSerialInterfaceCapability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY, newSerialInterfaceCapability, newSerialInterfaceCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY:
				return basicSetSerialInterfaceCapability(null, msgs);
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
			case V0Package.TPRTU_MODBUS__SLAVE_ADDR:
				return getSlaveAddr();
			case V0Package.TPRTU_MODBUS__BAUD_RATE_SELECTED:
				return getBaudRateSelected();
			case V0Package.TPRTU_MODBUS__BYTE_LEN_SELECTED:
				return getByteLenSelected();
			case V0Package.TPRTU_MODBUS__PARITY_SELECTED:
				return getParitySelected();
			case V0Package.TPRTU_MODBUS__STOP_BIT_LEN_SELECTED:
				return getStopBitLenSelected();
			case V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY:
				return getSerialInterfaceCapability();
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
			case V0Package.TPRTU_MODBUS__SLAVE_ADDR:
				setSlaveAddr((Integer)newValue);
				return;
			case V0Package.TPRTU_MODBUS__BAUD_RATE_SELECTED:
				setBaudRateSelected((EBaudRateType)newValue);
				return;
			case V0Package.TPRTU_MODBUS__BYTE_LEN_SELECTED:
				setByteLenSelected((EByteLenType)newValue);
				return;
			case V0Package.TPRTU_MODBUS__PARITY_SELECTED:
				setParitySelected((EParityType)newValue);
				return;
			case V0Package.TPRTU_MODBUS__STOP_BIT_LEN_SELECTED:
				setStopBitLenSelected((EStopBitLenType)newValue);
				return;
			case V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY:
				setSerialInterfaceCapability((SGrSerialInterfaceCapabilityType)newValue);
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
			case V0Package.TPRTU_MODBUS__SLAVE_ADDR:
				unsetSlaveAddr();
				return;
			case V0Package.TPRTU_MODBUS__BAUD_RATE_SELECTED:
				unsetBaudRateSelected();
				return;
			case V0Package.TPRTU_MODBUS__BYTE_LEN_SELECTED:
				unsetByteLenSelected();
				return;
			case V0Package.TPRTU_MODBUS__PARITY_SELECTED:
				unsetParitySelected();
				return;
			case V0Package.TPRTU_MODBUS__STOP_BIT_LEN_SELECTED:
				unsetStopBitLenSelected();
				return;
			case V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY:
				setSerialInterfaceCapability((SGrSerialInterfaceCapabilityType)null);
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
			case V0Package.TPRTU_MODBUS__SLAVE_ADDR:
				return isSetSlaveAddr();
			case V0Package.TPRTU_MODBUS__BAUD_RATE_SELECTED:
				return isSetBaudRateSelected();
			case V0Package.TPRTU_MODBUS__BYTE_LEN_SELECTED:
				return isSetByteLenSelected();
			case V0Package.TPRTU_MODBUS__PARITY_SELECTED:
				return isSetParitySelected();
			case V0Package.TPRTU_MODBUS__STOP_BIT_LEN_SELECTED:
				return isSetStopBitLenSelected();
			case V0Package.TPRTU_MODBUS__SERIAL_INTERFACE_CAPABILITY:
				return serialInterfaceCapability != null;
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
		result.append(" (slaveAddr: ");
		if (slaveAddrESet) result.append(slaveAddr); else result.append("<unset>");
		result.append(", baudRateSelected: ");
		if (baudRateSelectedESet) result.append(baudRateSelected); else result.append("<unset>");
		result.append(", byteLenSelected: ");
		if (byteLenSelectedESet) result.append(byteLenSelected); else result.append("<unset>");
		result.append(", paritySelected: ");
		if (paritySelectedESet) result.append(paritySelected); else result.append("<unset>");
		result.append(", stopBitLenSelected: ");
		if (stopBitLenSelectedESet) result.append(stopBitLenSelected); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TPRTUModbusImpl
