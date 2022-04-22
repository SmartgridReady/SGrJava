/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.SGrDeviceProfileType;
import ch.smartgridready.ns.s.gr.v0.SGrManufacturerIDType;
import ch.smartgridready.ns.s.gr.v0.SGrRESTAPIDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrRestAPIAttrFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrRestAPIInterfaceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrRestAPIProfilesFrameType;
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
 * An implementation of the model object '<em><b>SGr RESTAPI Device Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getDevRestAPIAttrReference <em>Dev Rest API Attr Reference</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getRestAPIInterfaceDesc <em>Rest API Interface Desc</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#isIsLocalControl <em>Is Local Control</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getManufacturerID <em>Manufacturer ID</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrRESTAPIDeviceDescriptionTypeImpl#getManufacturerName <em>Manufacturer Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRESTAPIDeviceDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrRESTAPIDeviceDescriptionType {
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
	 * The cached value of the '{@link #getDevRestAPIAttrReference() <em>Dev Rest API Attr Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevRestAPIAttrReference()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIAttrFrameType> devRestAPIAttrReference;

	/**
	 * The cached value of the '{@link #getRestAPIInterfaceDesc() <em>Rest API Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIInterfaceDesc()
	 * @generated
	 * @ordered
	 */
	protected SGrRestAPIInterfaceDescriptionType restAPIInterfaceDesc;

	/**
	 * The cached value of the '{@link #getFpListElement() <em>Fp List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrRestAPIProfilesFrameType> fpListElement;

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
	protected SGrRESTAPIDeviceDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRESTAPIDeviceDescriptionType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, oldDeviceProfile, newDeviceProfile);
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
				msgs = ((InternalEObject)deviceProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, null, msgs);
			if (newDeviceProfile != null)
				msgs = ((InternalEObject)newDeviceProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, null, msgs);
			msgs = basicSetDeviceProfile(newDeviceProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE, newDeviceProfile, newDeviceProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIAttrFrameType> getDevRestAPIAttrReference() {
		if (devRestAPIAttrReference == null) {
			devRestAPIAttrReference = new EObjectContainmentEList<SGrRestAPIAttrFrameType>(SGrRestAPIAttrFrameType.class, this, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEV_REST_API_ATTR_REFERENCE);
		}
		return devRestAPIAttrReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRestAPIInterfaceDescriptionType getRestAPIInterfaceDesc() {
		return restAPIInterfaceDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType newRestAPIInterfaceDesc, NotificationChain msgs) {
		SGrRestAPIInterfaceDescriptionType oldRestAPIInterfaceDesc = restAPIInterfaceDesc;
		restAPIInterfaceDesc = newRestAPIInterfaceDesc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC, oldRestAPIInterfaceDesc, newRestAPIInterfaceDesc);
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
	public void setRestAPIInterfaceDesc(SGrRestAPIInterfaceDescriptionType newRestAPIInterfaceDesc) {
		if (newRestAPIInterfaceDesc != restAPIInterfaceDesc) {
			NotificationChain msgs = null;
			if (restAPIInterfaceDesc != null)
				msgs = ((InternalEObject)restAPIInterfaceDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC, null, msgs);
			if (newRestAPIInterfaceDesc != null)
				msgs = ((InternalEObject)newRestAPIInterfaceDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC, null, msgs);
			msgs = basicSetRestAPIInterfaceDesc(newRestAPIInterfaceDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC, newRestAPIInterfaceDesc, newRestAPIInterfaceDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrRestAPIProfilesFrameType> getFpListElement() {
		if (fpListElement == null) {
			fpListElement = new EObjectContainmentEList<SGrRestAPIProfilesFrameType>(SGrRestAPIProfilesFrameType.class, this, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT);
		}
		return fpListElement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME, oldDeviceName, deviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL, oldIsLocalControl, isLocalControl, !oldIsLocalControlESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL, oldIsLocalControl, IS_LOCAL_CONTROL_EDEFAULT, oldIsLocalControlESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID, oldManufacturerID, manufacturerID, !oldManufacturerIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID, oldManufacturerID, MANUFACTURER_ID_EDEFAULT, oldManufacturerIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME, oldManufacturerName, manufacturerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				return basicSetDeviceProfile(null, msgs);
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEV_REST_API_ATTR_REFERENCE:
				return ((InternalEList<?>)getDevRestAPIAttrReference()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC:
				return basicSetRestAPIInterfaceDesc(null, msgs);
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				return ((InternalEList<?>)getFpListElement()).basicRemove(otherEnd, msgs);
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
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				return getDeviceProfile();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEV_REST_API_ATTR_REFERENCE:
				return getDevRestAPIAttrReference();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC:
				return getRestAPIInterfaceDesc();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				return getFpListElement();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				return getDeviceName();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				return isIsLocalControl();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				return getManufacturerID();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
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
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				setDeviceProfile((SGrDeviceProfileType)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEV_REST_API_ATTR_REFERENCE:
				getDevRestAPIAttrReference().clear();
				getDevRestAPIAttrReference().addAll((Collection<? extends SGrRestAPIAttrFrameType>)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC:
				setRestAPIInterfaceDesc((SGrRestAPIInterfaceDescriptionType)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				getFpListElement().clear();
				getFpListElement().addAll((Collection<? extends SGrRestAPIProfilesFrameType>)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				setIsLocalControl((Boolean)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				setManufacturerID((SGrManufacturerIDType)newValue);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
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
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				setDeviceProfile((SGrDeviceProfileType)null);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEV_REST_API_ATTR_REFERENCE:
				getDevRestAPIAttrReference().clear();
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC:
				setRestAPIInterfaceDesc((SGrRestAPIInterfaceDescriptionType)null);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				getFpListElement().clear();
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				unsetIsLocalControl();
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				unsetManufacturerID();
				return;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
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
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_PROFILE:
				return deviceProfile != null;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEV_REST_API_ATTR_REFERENCE:
				return devRestAPIAttrReference != null && !devRestAPIAttrReference.isEmpty();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__REST_API_INTERFACE_DESC:
				return restAPIInterfaceDesc != null;
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__FP_LIST_ELEMENT:
				return fpListElement != null && !fpListElement.isEmpty();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__IS_LOCAL_CONTROL:
				return isSetIsLocalControl();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_ID:
				return isSetManufacturerID();
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE__MANUFACTURER_NAME:
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

} //SGrRESTAPIDeviceDescriptionTypeImpl
