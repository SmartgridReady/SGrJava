/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.IpADDRType;
import ch.smartgridready.sgr.ns.v0.TPIPModbus;
import ch.smartgridready.sgr.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPIP Modbus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPIPModbusImpl#getPort <em>Port</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPIPModbusImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.TPIPModbusImpl#getSlaveID <em>Slave ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPIPModbusImpl extends MinimalEObjectImpl.Container implements TPIPModbus {
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final long PORT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected long port = PORT_EDEFAULT;

	/**
	 * This is true if the Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portESet;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected IpADDRType address;

	/**
	 * The default value of the '{@link #getSlaveID() <em>Slave ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveID()
	 * @generated
	 * @ordered
	 */
	protected static final int SLAVE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSlaveID() <em>Slave ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveID()
	 * @generated
	 * @ordered
	 */
	protected int slaveID = SLAVE_ID_EDEFAULT;

	/**
	 * This is true if the Slave ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slaveIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPIPModbusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getTPIPModbus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(long newPort) {
		long oldPort = port;
		port = newPort;
		boolean oldPortESet = portESet;
		portESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_MODBUS__PORT, oldPort, port, !oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPort() {
		long oldPort = port;
		boolean oldPortESet = portESet;
		port = PORT_EDEFAULT;
		portESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPIP_MODBUS__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPort() {
		return portESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IpADDRType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(IpADDRType newAddress, NotificationChain msgs) {
		IpADDRType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.TPIP_MODBUS__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(IpADDRType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.TPIP_MODBUS__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.TPIP_MODBUS__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_MODBUS__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSlaveID() {
		return slaveID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlaveID(int newSlaveID) {
		int oldSlaveID = slaveID;
		slaveID = newSlaveID;
		boolean oldSlaveIDESet = slaveIDESet;
		slaveIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.TPIP_MODBUS__SLAVE_ID, oldSlaveID, slaveID, !oldSlaveIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSlaveID() {
		int oldSlaveID = slaveID;
		boolean oldSlaveIDESet = slaveIDESet;
		slaveID = SLAVE_ID_EDEFAULT;
		slaveIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.TPIP_MODBUS__SLAVE_ID, oldSlaveID, SLAVE_ID_EDEFAULT, oldSlaveIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSlaveID() {
		return slaveIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.TPIP_MODBUS__ADDRESS:
				return basicSetAddress(null, msgs);
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
			case V0Package.TPIP_MODBUS__PORT:
				return getPort();
			case V0Package.TPIP_MODBUS__ADDRESS:
				return getAddress();
			case V0Package.TPIP_MODBUS__SLAVE_ID:
				return getSlaveID();
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
			case V0Package.TPIP_MODBUS__PORT:
				setPort((Long)newValue);
				return;
			case V0Package.TPIP_MODBUS__ADDRESS:
				setAddress((IpADDRType)newValue);
				return;
			case V0Package.TPIP_MODBUS__SLAVE_ID:
				setSlaveID((Integer)newValue);
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
			case V0Package.TPIP_MODBUS__PORT:
				unsetPort();
				return;
			case V0Package.TPIP_MODBUS__ADDRESS:
				setAddress((IpADDRType)null);
				return;
			case V0Package.TPIP_MODBUS__SLAVE_ID:
				unsetSlaveID();
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
			case V0Package.TPIP_MODBUS__PORT:
				return isSetPort();
			case V0Package.TPIP_MODBUS__ADDRESS:
				return address != null;
			case V0Package.TPIP_MODBUS__SLAVE_ID:
				return isSetSlaveID();
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
		result.append(" (port: ");
		if (portESet) result.append(port); else result.append("<unset>");
		result.append(", slaveID: ");
		if (slaveIDESet) result.append(slaveID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TPIPModbusImpl
