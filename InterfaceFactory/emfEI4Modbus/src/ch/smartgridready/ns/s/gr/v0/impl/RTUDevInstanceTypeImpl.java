/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.RTUDevInstanceType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTU Dev Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.RTUDevInstanceTypeImpl#getDeviceInstName <em>Device Inst Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.RTUDevInstanceTypeImpl#getSlaveAddr <em>Slave Addr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTUDevInstanceTypeImpl extends MinimalEObjectImpl.Container implements RTUDevInstanceType {
	/**
	 * The default value of the '{@link #getDeviceInstName() <em>Device Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInstName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_INST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceInstName() <em>Device Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInstName()
	 * @generated
	 * @ordered
	 */
	protected String deviceInstName = DEVICE_INST_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTUDevInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getRTUDevInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceInstName() {
		return deviceInstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceInstName(String newDeviceInstName) {
		String oldDeviceInstName = deviceInstName;
		deviceInstName = newDeviceInstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RTU_DEV_INSTANCE_TYPE__DEVICE_INST_NAME, oldDeviceInstName, deviceInstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR, oldSlaveAddr, slaveAddr, !oldSlaveAddrESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR, oldSlaveAddr, SLAVE_ADDR_EDEFAULT, oldSlaveAddrESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.RTU_DEV_INSTANCE_TYPE__DEVICE_INST_NAME:
				return getDeviceInstName();
			case V0Package.RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR:
				return getSlaveAddr();
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
			case V0Package.RTU_DEV_INSTANCE_TYPE__DEVICE_INST_NAME:
				setDeviceInstName((String)newValue);
				return;
			case V0Package.RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR:
				setSlaveAddr((Integer)newValue);
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
			case V0Package.RTU_DEV_INSTANCE_TYPE__DEVICE_INST_NAME:
				setDeviceInstName(DEVICE_INST_NAME_EDEFAULT);
				return;
			case V0Package.RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR:
				unsetSlaveAddr();
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
			case V0Package.RTU_DEV_INSTANCE_TYPE__DEVICE_INST_NAME:
				return DEVICE_INST_NAME_EDEFAULT == null ? deviceInstName != null : !DEVICE_INST_NAME_EDEFAULT.equals(deviceInstName);
			case V0Package.RTU_DEV_INSTANCE_TYPE__SLAVE_ADDR:
				return isSetSlaveAddr();
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
		result.append(" (deviceInstName: ");
		result.append(deviceInstName);
		result.append(", slaveAddr: ");
		if (slaveAddrESet) result.append(slaveAddr); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RTUDevInstanceTypeImpl
