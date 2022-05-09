/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.NetworkConnectionStateType;
import ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType;
import ch.smartgridready.ns.s.gr.v0.SGrManufacturerIDType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusAttrFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusProfilesFrameType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Modbus Device Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getDevMbAttrReference <em>Dev Mb Attr Reference</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getNetworkConnectionState <em>Network Connection State</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrModbusDeviceDescriptionTypeImpl#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrModbusDeviceDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrModbusDeviceDescriptionType {
	/**
	 * The cached value of the '{@link #getDeviceProfile() <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceProfile()
	 * @generated
	 * @ordered
	 */
	protected SGrDeviceProfileType deviceProfile;

	/**
	 * The cached value of the '{@link #getDevMbAttrReference() <em>Dev Mb Attr Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevMbAttrReference()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrModbusAttrFrameType> devMbAttrReference;

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
	protected EList<SGrModbusProfilesFrameType> fpListElement;

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
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLocalControl() <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocalControl() <em>Is Local Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalControl()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalControl = IS_LOCAL_CONTROL_EDEFAULT;

	/**
	 * This is true if the Is Local Control attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalControlESet;

	/**
	 * The default value of the '{@link #getManufacturerID() <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerID()
	 * @generated
	 * @ordered
	 */
	protected static final SGrManufacturerIDType MANUFACTURER_ID_EDEFAULT = SGrManufacturerIDType.THIRD_PARTY_SRC_INFO;

	/**
	 * The cached value of the '{@link #getManufacturerID() <em>Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerID()
	 * @generated
	 * @ordered
	 */
	protected SGrManufacturerIDType manufacturerID = MANUFACTURER_ID_EDEFAULT;

	/**
	 * This is true if the Manufacturer ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manufacturerIDESet;

	/**
	 * The default value of the '{@link #getManufacturerName() <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerName()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturerName() <em>Manufacturer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerName()
	 * @generated
	 * @ordered
	 */
	protected String manufacturerName = MANUFACTURER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrModbusDeviceDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrModbusDeviceDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrDeviceProfileType getDeviceProfile() {
		return deviceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceProfile(SGrDeviceProfileType newDeviceProfile, NotificationChain msgs) {
		SGrDeviceProfileType oldDeviceProfile = deviceProfile;
		deviceProfile = newDeviceProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, oldDeviceProfile, newDeviceProfile);
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
	public void setDeviceProfile(SGrDeviceProfileType newDeviceProfile) {
		if (newDeviceProfile != deviceProfile) {
			NotificationChain msgs = null;
			if (deviceProfile != null)
				msgs = ((InternalEObject)deviceProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, null, msgs);
			if (newDeviceProfile != null)
				msgs = ((InternalEObject)newDeviceProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, null, msgs);
			msgs = basicSetDeviceProfile(newDeviceProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, newDeviceProfile, newDeviceProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrModbusAttrFrameType> getDevMbAttrReference() {
		if (devMbAttrReference == null) {
			devMbAttrReference = new EObjectContainmentEList<SGrModbusAttrFrameType>(SGrModbusAttrFrameType.class, this, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEV_MB_ATTR_REFERENCE);
		}
		return devMbAttrReference;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC, oldModbusInterfaceDesc, newModbusInterfaceDesc);
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
				msgs = ((InternalEObject)modbusInterfaceDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC, null, msgs);
			if (newModbusInterfaceDesc != null)
				msgs = ((InternalEObject)newModbusInterfaceDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC, null, msgs);
			msgs = basicSetModbusInterfaceDesc(newModbusInterfaceDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC, newModbusInterfaceDesc, newModbusInterfaceDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrModbusProfilesFrameType> getFpListElement() {
		if (fpListElement == null) {
			fpListElement = new EObjectContainmentEList<SGrModbusProfilesFrameType>(SGrModbusProfilesFrameType.class, this, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT);
		}
		return fpListElement;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE, oldNetworkConnectionState, newNetworkConnectionState);
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
				msgs = ((InternalEObject)networkConnectionState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE, null, msgs);
			if (newNetworkConnectionState != null)
				msgs = ((InternalEObject)newNetworkConnectionState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE, null, msgs);
			msgs = basicSetNetworkConnectionState(newNetworkConnectionState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE, newNetworkConnectionState, newNetworkConnectionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLocalControl() {
		return isLocalControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLocalControl(boolean newIsLocalControl) {
		boolean oldIsLocalControl = isLocalControl;
		isLocalControl = newIsLocalControl;
		boolean oldIsLocalControlESet = isLocalControlESet;
		isLocalControlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL, oldIsLocalControl, isLocalControl, !oldIsLocalControlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsLocalControl() {
		boolean oldIsLocalControl = isLocalControl;
		boolean oldIsLocalControlESet = isLocalControlESet;
		isLocalControl = IS_LOCAL_CONTROL_EDEFAULT;
		isLocalControlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL, oldIsLocalControl, IS_LOCAL_CONTROL_EDEFAULT, oldIsLocalControlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsLocalControl() {
		return isLocalControlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrManufacturerIDType getManufacturerID() {
		return manufacturerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerID(SGrManufacturerIDType newManufacturerID) {
		SGrManufacturerIDType oldManufacturerID = manufacturerID;
		manufacturerID = newManufacturerID == null ? MANUFACTURER_ID_EDEFAULT : newManufacturerID;
		boolean oldManufacturerIDESet = manufacturerIDESet;
		manufacturerIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID, oldManufacturerID, manufacturerID, !oldManufacturerIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetManufacturerID() {
		SGrManufacturerIDType oldManufacturerID = manufacturerID;
		boolean oldManufacturerIDESet = manufacturerIDESet;
		manufacturerID = MANUFACTURER_ID_EDEFAULT;
		manufacturerIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID, oldManufacturerID, MANUFACTURER_ID_EDEFAULT, oldManufacturerIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetManufacturerID() {
		return manufacturerIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerName(String newManufacturerName) {
		String oldManufacturerName = manufacturerName;
		manufacturerName = newManufacturerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME, oldManufacturerName, manufacturerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				return basicSetDeviceProfile(null, msgs);
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEV_MB_ATTR_REFERENCE:
				return ((InternalEList<?>)getDevMbAttrReference()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC:
				return basicSetModbusInterfaceDesc(null, msgs);
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				return ((InternalEList<?>)getFpListElement()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE:
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
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				return getDeviceProfile();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEV_MB_ATTR_REFERENCE:
				return getDevMbAttrReference();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC:
				return getModbusInterfaceDesc();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				return getFpListElement();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE:
				return getNetworkConnectionState();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				return getDeviceName();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				return isIsLocalControl();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				return getManufacturerID();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
				return getManufacturerName();
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
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				setDeviceProfile((SGrDeviceProfileType)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEV_MB_ATTR_REFERENCE:
				getDevMbAttrReference().clear();
				getDevMbAttrReference().addAll((Collection<? extends SGrModbusAttrFrameType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC:
				setModbusInterfaceDesc((SGrModbusInterfaceDescriptionType)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				getFpListElement().clear();
				getFpListElement().addAll((Collection<? extends SGrModbusProfilesFrameType>)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE:
				setNetworkConnectionState((NetworkConnectionStateType)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				setIsLocalControl((Boolean)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				setManufacturerID((SGrManufacturerIDType)newValue);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
				setManufacturerName((String)newValue);
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
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				setDeviceProfile((SGrDeviceProfileType)null);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEV_MB_ATTR_REFERENCE:
				getDevMbAttrReference().clear();
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC:
				setModbusInterfaceDesc((SGrModbusInterfaceDescriptionType)null);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				getFpListElement().clear();
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE:
				setNetworkConnectionState((NetworkConnectionStateType)null);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				unsetIsLocalControl();
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				unsetManufacturerID();
				return;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
				setManufacturerName(MANUFACTURER_NAME_EDEFAULT);
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
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				return deviceProfile != null;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEV_MB_ATTR_REFERENCE:
				return devMbAttrReference != null && !devMbAttrReference.isEmpty();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MODBUS_INTERFACE_DESC:
				return modbusInterfaceDesc != null;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				return fpListElement != null && !fpListElement.isEmpty();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__NETWORK_CONNECTION_STATE:
				return networkConnectionState != null;
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				return isSetIsLocalControl();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				return isSetManufacturerID();
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
				return MANUFACTURER_NAME_EDEFAULT == null ? manufacturerName != null : !MANUFACTURER_NAME_EDEFAULT.equals(manufacturerName);
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
		result.append(" (deviceName: ");
		result.append(deviceName);
		result.append(", isLocalControl: ");
		if (isLocalControlESet) result.append(isLocalControl); else result.append("<unset>");
		result.append(", manufacturerID: ");
		if (manufacturerIDESet) result.append(manufacturerID); else result.append("<unset>");
		result.append(", manufacturerName: ");
		result.append(manufacturerName);
		result.append(')');
		return result.toString();
	}

} //SGrModbusDeviceDescriptionTypeImpl
