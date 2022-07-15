/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrDeviceKindType;
import com.smartgridready.ns.v0.SGrDeviceProfileType;
import com.smartgridready.ns.v0.SGrLegibDocumentationType;
import com.smartgridready.ns.v0.SGrNamelistType;
import com.smartgridready.ns.v0.SGrPowerSourceType;
import com.smartgridready.ns.v0.SGrTransportServicesUsedListType;
import com.smartgridready.ns.v0.SGrVersionNumberType;
import com.smartgridready.ns.v0.V0Package;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>SGr Device Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getDevNameList <em>Dev Name List</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getDevLegibDesc <em>Dev Legib Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getTransportService <em>Transport Service</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getDeviceKind <em>Device Kind</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getSoftwareRevision <em>Software Revision</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getHardwareRevision <em>Hardware Revision</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getBrandName <em>Brand Name</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getPowerSource <em>Power Source</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getNominalPower <em>Nominal Power</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getManufSpecIdent <em>Manuf Spec Ident</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getManufacturerLabel <em>Manufacturer Label</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getRemAuthorID <em>Rem Author ID</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrDeviceProfileTypeImpl#getDevLevelofOperation <em>Dev Levelof Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrDeviceProfileTypeImpl extends MinimalEObjectImpl.Container implements SGrDeviceProfileType {
	/**
	 * The cached value of the '{@link #getDevNameList() <em>Dev Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevNameList()
	 * @generated
	 * @ordered
	 */
	protected SGrNamelistType devNameList;

	/**
	 * The cached value of the '{@link #getDevLegibDesc() <em>Dev Legib Desc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevLegibDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<SGrLegibDocumentationType> devLegibDesc;

	/**
	 * The default value of the '{@link #getTransportService() <em>Transport Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportService()
	 * @generated
	 * @ordered
	 */
	protected static final SGrTransportServicesUsedListType TRANSPORT_SERVICE_EDEFAULT = SGrTransportServicesUsedListType.EEBUS;

	/**
	 * The cached value of the '{@link #getTransportService() <em>Transport Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportService()
	 * @generated
	 * @ordered
	 */
	protected SGrTransportServicesUsedListType transportService = TRANSPORT_SERVICE_EDEFAULT;

	/**
	 * This is true if the Transport Service attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportServiceESet;

	/**
	 * The default value of the '{@link #getDeviceKind() <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceKind()
	 * @generated
	 * @ordered
	 */
	protected static final SGrDeviceKindType DEVICE_KIND_EDEFAULT = SGrDeviceKindType.BATTERY;

	/**
	 * The cached value of the '{@link #getDeviceKind() <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceKind()
	 * @generated
	 * @ordered
	 */
	protected SGrDeviceKindType deviceKind = DEVICE_KIND_EDEFAULT;

	/**
	 * This is true if the Device Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceKindESet;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftwareRevision() <em>Software Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareRevision()
	 * @generated
	 * @ordered
	 */
	protected SGrVersionNumberType softwareRevision;

	/**
	 * The cached value of the '{@link #getHardwareRevision() <em>Hardware Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareRevision()
	 * @generated
	 * @ordered
	 */
	protected SGrVersionNumberType hardwareRevision;

	/**
	 * The default value of the '{@link #getBrandName() <em>Brand Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandName()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrandName() <em>Brand Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandName()
	 * @generated
	 * @ordered
	 */
	protected String brandName = BRAND_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerSource() <em>Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSource()
	 * @generated
	 * @ordered
	 */
	protected static final SGrPowerSourceType POWER_SOURCE_EDEFAULT = SGrPowerSourceType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getPowerSource() <em>Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSource()
	 * @generated
	 * @ordered
	 */
	protected SGrPowerSourceType powerSource = POWER_SOURCE_EDEFAULT;

	/**
	 * This is true if the Power Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerSourceESet;

	/**
	 * The default value of the '{@link #getNominalPower() <em>Nominal Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalPower()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalPower() <em>Nominal Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalPower()
	 * @generated
	 * @ordered
	 */
	protected String nominalPower = NOMINAL_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufSpecIdent() <em>Manuf Spec Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufSpecIdent()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUF_SPEC_IDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufSpecIdent() <em>Manuf Spec Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufSpecIdent()
	 * @generated
	 * @ordered
	 */
	protected String manufSpecIdent = MANUF_SPEC_IDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturerLabel() <em>Manufacturer Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturerLabel() <em>Manufacturer Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerLabel()
	 * @generated
	 * @ordered
	 */
	protected String manufacturerLabel = MANUFACTURER_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemAuthorID() <em>Rem Author ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemAuthorID()
	 * @generated
	 * @ordered
	 */
	protected static final String REM_AUTHOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemAuthorID() <em>Rem Author ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemAuthorID()
	 * @generated
	 * @ordered
	 */
	protected String remAuthorID = REM_AUTHOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevLevelofOperation() <em>Dev Levelof Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevLevelofOperation()
	 * @generated
	 * @ordered
	 */
	protected static final int DEV_LEVELOF_OPERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDevLevelofOperation() <em>Dev Levelof Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevLevelofOperation()
	 * @generated
	 * @ordered
	 */
	protected int devLevelofOperation = DEV_LEVELOF_OPERATION_EDEFAULT;

	/**
	 * This is true if the Dev Levelof Operation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean devLevelofOperationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrDeviceProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrDeviceProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrNamelistType getDevNameList() {
		return devNameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevNameList(SGrNamelistType newDevNameList, NotificationChain msgs) {
		SGrNamelistType oldDevNameList = devNameList;
		devNameList = newDevNameList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST, oldDevNameList, newDevNameList);
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
	public void setDevNameList(SGrNamelistType newDevNameList) {
		if (newDevNameList != devNameList) {
			NotificationChain msgs = null;
			if (devNameList != null)
				msgs = ((InternalEObject)devNameList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST, null, msgs);
			if (newDevNameList != null)
				msgs = ((InternalEObject)newDevNameList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST, null, msgs);
			msgs = basicSetDevNameList(newDevNameList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST, newDevNameList, newDevNameList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SGrLegibDocumentationType> getDevLegibDesc() {
		if (devLegibDesc == null) {
			devLegibDesc = new EObjectContainmentEList<SGrLegibDocumentationType>(SGrLegibDocumentationType.class, this, V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC);
		}
		return devLegibDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrTransportServicesUsedListType getTransportService() {
		return transportService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransportService(SGrTransportServicesUsedListType newTransportService) {
		SGrTransportServicesUsedListType oldTransportService = transportService;
		transportService = newTransportService == null ? TRANSPORT_SERVICE_EDEFAULT : newTransportService;
		boolean oldTransportServiceESet = transportServiceESet;
		transportServiceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE, oldTransportService, transportService, !oldTransportServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTransportService() {
		SGrTransportServicesUsedListType oldTransportService = transportService;
		boolean oldTransportServiceESet = transportServiceESet;
		transportService = TRANSPORT_SERVICE_EDEFAULT;
		transportServiceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE, oldTransportService, TRANSPORT_SERVICE_EDEFAULT, oldTransportServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTransportService() {
		return transportServiceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrDeviceKindType getDeviceKind() {
		return deviceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceKind(SGrDeviceKindType newDeviceKind) {
		SGrDeviceKindType oldDeviceKind = deviceKind;
		deviceKind = newDeviceKind == null ? DEVICE_KIND_EDEFAULT : newDeviceKind;
		boolean oldDeviceKindESet = deviceKindESet;
		deviceKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND, oldDeviceKind, deviceKind, !oldDeviceKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceKind() {
		SGrDeviceKindType oldDeviceKind = deviceKind;
		boolean oldDeviceKindESet = deviceKindESet;
		deviceKind = DEVICE_KIND_EDEFAULT;
		deviceKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND, oldDeviceKind, DEVICE_KIND_EDEFAULT, oldDeviceKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceKind() {
		return deviceKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(BigInteger newSerialNumber) {
		BigInteger oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrVersionNumberType getSoftwareRevision() {
		return softwareRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareRevision(SGrVersionNumberType newSoftwareRevision, NotificationChain msgs) {
		SGrVersionNumberType oldSoftwareRevision = softwareRevision;
		softwareRevision = newSoftwareRevision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION, oldSoftwareRevision, newSoftwareRevision);
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
	public void setSoftwareRevision(SGrVersionNumberType newSoftwareRevision) {
		if (newSoftwareRevision != softwareRevision) {
			NotificationChain msgs = null;
			if (softwareRevision != null)
				msgs = ((InternalEObject)softwareRevision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION, null, msgs);
			if (newSoftwareRevision != null)
				msgs = ((InternalEObject)newSoftwareRevision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION, null, msgs);
			msgs = basicSetSoftwareRevision(newSoftwareRevision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION, newSoftwareRevision, newSoftwareRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrVersionNumberType getHardwareRevision() {
		return hardwareRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardwareRevision(SGrVersionNumberType newHardwareRevision, NotificationChain msgs) {
		SGrVersionNumberType oldHardwareRevision = hardwareRevision;
		hardwareRevision = newHardwareRevision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION, oldHardwareRevision, newHardwareRevision);
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
	public void setHardwareRevision(SGrVersionNumberType newHardwareRevision) {
		if (newHardwareRevision != hardwareRevision) {
			NotificationChain msgs = null;
			if (hardwareRevision != null)
				msgs = ((InternalEObject)hardwareRevision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION, null, msgs);
			if (newHardwareRevision != null)
				msgs = ((InternalEObject)newHardwareRevision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION, null, msgs);
			msgs = basicSetHardwareRevision(newHardwareRevision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION, newHardwareRevision, newHardwareRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrandName() {
		return brandName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrandName(String newBrandName) {
		String oldBrandName = brandName;
		brandName = newBrandName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__BRAND_NAME, oldBrandName, brandName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrPowerSourceType getPowerSource() {
		return powerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerSource(SGrPowerSourceType newPowerSource) {
		SGrPowerSourceType oldPowerSource = powerSource;
		powerSource = newPowerSource == null ? POWER_SOURCE_EDEFAULT : newPowerSource;
		boolean oldPowerSourceESet = powerSourceESet;
		powerSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE, oldPowerSource, powerSource, !oldPowerSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPowerSource() {
		SGrPowerSourceType oldPowerSource = powerSource;
		boolean oldPowerSourceESet = powerSourceESet;
		powerSource = POWER_SOURCE_EDEFAULT;
		powerSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE, oldPowerSource, POWER_SOURCE_EDEFAULT, oldPowerSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPowerSource() {
		return powerSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNominalPower() {
		return nominalPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNominalPower(String newNominalPower) {
		String oldNominalPower = nominalPower;
		nominalPower = newNominalPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__NOMINAL_POWER, oldNominalPower, nominalPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufSpecIdent() {
		return manufSpecIdent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufSpecIdent(String newManufSpecIdent) {
		String oldManufSpecIdent = manufSpecIdent;
		manufSpecIdent = newManufSpecIdent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__MANUF_SPEC_IDENT, oldManufSpecIdent, manufSpecIdent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturerLabel() {
		return manufacturerLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerLabel(String newManufacturerLabel) {
		String oldManufacturerLabel = manufacturerLabel;
		manufacturerLabel = newManufacturerLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__MANUFACTURER_LABEL, oldManufacturerLabel, manufacturerLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemAuthorID() {
		return remAuthorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemAuthorID(String newRemAuthorID) {
		String oldRemAuthorID = remAuthorID;
		remAuthorID = newRemAuthorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__REM_AUTHOR_ID, oldRemAuthorID, remAuthorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDevLevelofOperation() {
		return devLevelofOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevLevelofOperation(int newDevLevelofOperation) {
		int oldDevLevelofOperation = devLevelofOperation;
		devLevelofOperation = newDevLevelofOperation;
		boolean oldDevLevelofOperationESet = devLevelofOperationESet;
		devLevelofOperationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION, oldDevLevelofOperation, devLevelofOperation, !oldDevLevelofOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDevLevelofOperation() {
		int oldDevLevelofOperation = devLevelofOperation;
		boolean oldDevLevelofOperationESet = devLevelofOperationESet;
		devLevelofOperation = DEV_LEVELOF_OPERATION_EDEFAULT;
		devLevelofOperationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION, oldDevLevelofOperation, DEV_LEVELOF_OPERATION_EDEFAULT, oldDevLevelofOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDevLevelofOperation() {
		return devLevelofOperationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST:
				return basicSetDevNameList(null, msgs);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC:
				return ((InternalEList<?>)getDevLegibDesc()).basicRemove(otherEnd, msgs);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION:
				return basicSetSoftwareRevision(null, msgs);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION:
				return basicSetHardwareRevision(null, msgs);
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
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST:
				return getDevNameList();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC:
				return getDevLegibDesc();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE:
				return getTransportService();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND:
				return getDeviceKind();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SERIAL_NUMBER:
				return getSerialNumber();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION:
				return getSoftwareRevision();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION:
				return getHardwareRevision();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__BRAND_NAME:
				return getBrandName();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE:
				return getPowerSource();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__NOMINAL_POWER:
				return getNominalPower();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUF_SPEC_IDENT:
				return getManufSpecIdent();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUFACTURER_LABEL:
				return getManufacturerLabel();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__REM_AUTHOR_ID:
				return getRemAuthorID();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION:
				return getDevLevelofOperation();
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
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST:
				setDevNameList((SGrNamelistType)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC:
				getDevLegibDesc().clear();
				getDevLegibDesc().addAll((Collection<? extends SGrLegibDocumentationType>)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE:
				setTransportService((SGrTransportServicesUsedListType)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND:
				setDeviceKind((SGrDeviceKindType)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SERIAL_NUMBER:
				setSerialNumber((BigInteger)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION:
				setSoftwareRevision((SGrVersionNumberType)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION:
				setHardwareRevision((SGrVersionNumberType)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__BRAND_NAME:
				setBrandName((String)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE:
				setPowerSource((SGrPowerSourceType)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__NOMINAL_POWER:
				setNominalPower((String)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUF_SPEC_IDENT:
				setManufSpecIdent((String)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUFACTURER_LABEL:
				setManufacturerLabel((String)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__REM_AUTHOR_ID:
				setRemAuthorID((String)newValue);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION:
				setDevLevelofOperation((Integer)newValue);
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
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST:
				setDevNameList((SGrNamelistType)null);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC:
				getDevLegibDesc().clear();
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE:
				unsetTransportService();
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND:
				unsetDeviceKind();
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION:
				setSoftwareRevision((SGrVersionNumberType)null);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION:
				setHardwareRevision((SGrVersionNumberType)null);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__BRAND_NAME:
				setBrandName(BRAND_NAME_EDEFAULT);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE:
				unsetPowerSource();
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__NOMINAL_POWER:
				setNominalPower(NOMINAL_POWER_EDEFAULT);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUF_SPEC_IDENT:
				setManufSpecIdent(MANUF_SPEC_IDENT_EDEFAULT);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUFACTURER_LABEL:
				setManufacturerLabel(MANUFACTURER_LABEL_EDEFAULT);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__REM_AUTHOR_ID:
				setRemAuthorID(REM_AUTHOR_ID_EDEFAULT);
				return;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION:
				unsetDevLevelofOperation();
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
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_NAME_LIST:
				return devNameList != null;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEGIB_DESC:
				return devLegibDesc != null && !devLegibDesc.isEmpty();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__TRANSPORT_SERVICE:
				return isSetTransportService();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEVICE_KIND:
				return isSetDeviceKind();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__SOFTWARE_REVISION:
				return softwareRevision != null;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__HARDWARE_REVISION:
				return hardwareRevision != null;
			case V0Package.SGR_DEVICE_PROFILE_TYPE__BRAND_NAME:
				return BRAND_NAME_EDEFAULT == null ? brandName != null : !BRAND_NAME_EDEFAULT.equals(brandName);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__POWER_SOURCE:
				return isSetPowerSource();
			case V0Package.SGR_DEVICE_PROFILE_TYPE__NOMINAL_POWER:
				return NOMINAL_POWER_EDEFAULT == null ? nominalPower != null : !NOMINAL_POWER_EDEFAULT.equals(nominalPower);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUF_SPEC_IDENT:
				return MANUF_SPEC_IDENT_EDEFAULT == null ? manufSpecIdent != null : !MANUF_SPEC_IDENT_EDEFAULT.equals(manufSpecIdent);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__MANUFACTURER_LABEL:
				return MANUFACTURER_LABEL_EDEFAULT == null ? manufacturerLabel != null : !MANUFACTURER_LABEL_EDEFAULT.equals(manufacturerLabel);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__REM_AUTHOR_ID:
				return REM_AUTHOR_ID_EDEFAULT == null ? remAuthorID != null : !REM_AUTHOR_ID_EDEFAULT.equals(remAuthorID);
			case V0Package.SGR_DEVICE_PROFILE_TYPE__DEV_LEVELOF_OPERATION:
				return isSetDevLevelofOperation();
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
		result.append(" (transportService: ");
		if (transportServiceESet) result.append(transportService); else result.append("<unset>");
		result.append(", deviceKind: ");
		if (deviceKindESet) result.append(deviceKind); else result.append("<unset>");
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", brandName: ");
		result.append(brandName);
		result.append(", powerSource: ");
		if (powerSourceESet) result.append(powerSource); else result.append("<unset>");
		result.append(", nominalPower: ");
		result.append(nominalPower);
		result.append(", manufSpecIdent: ");
		result.append(manufSpecIdent);
		result.append(", manufacturerLabel: ");
		result.append(manufacturerLabel);
		result.append(", remAuthorID: ");
		result.append(remAuthorID);
		result.append(", devLevelofOperation: ");
		if (devLevelofOperationESet) result.append(devLevelofOperation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrDeviceProfileTypeImpl
