/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.SGrNamelistKindOfType;
import ch.smartgridready.ns.s.gr.v0.SGrNamelistType;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Namelist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getNameType <em>Name Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getSLV1Name <em>SLV1 Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getSWorkName <em>SWork Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getSManufName <em>SManuf Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getSIEC61850Name <em>SIEC61850 Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getSSAREFName <em>SSAREF Name</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrNamelistTypeImpl#getSEEBUSName <em>SEEBUS Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrNamelistTypeImpl extends MinimalEObjectImpl.Container implements SGrNamelistType {
	/**
	 * The default value of the '{@link #getNameType() <em>Name Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameType()
	 * @generated
	 * @ordered
	 */
	protected static final SGrNamelistKindOfType NAME_TYPE_EDEFAULT = SGrNamelistKindOfType.DEVICE;

	/**
	 * The cached value of the '{@link #getNameType() <em>Name Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameType()
	 * @generated
	 * @ordered
	 */
	protected SGrNamelistKindOfType nameType = NAME_TYPE_EDEFAULT;

	/**
	 * This is true if the Name Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameTypeESet;

	/**
	 * The default value of the '{@link #getSLV1Name() <em>SLV1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSLV1Name()
	 * @generated
	 * @ordered
	 */
	protected static final String SLV1_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSLV1Name() <em>SLV1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSLV1Name()
	 * @generated
	 * @ordered
	 */
	protected String sLV1Name = SLV1_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSWorkName() <em>SWork Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWorkName()
	 * @generated
	 * @ordered
	 */
	protected static final String SWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSWorkName() <em>SWork Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWorkName()
	 * @generated
	 * @ordered
	 */
	protected String sWorkName = SWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSManufName() <em>SManuf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSManufName()
	 * @generated
	 * @ordered
	 */
	protected static final String SMANUF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSManufName() <em>SManuf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSManufName()
	 * @generated
	 * @ordered
	 */
	protected String sManufName = SMANUF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIEC61850Name() <em>SIEC61850 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIEC61850Name()
	 * @generated
	 * @ordered
	 */
	protected static final String SIEC61850_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIEC61850Name() <em>SIEC61850 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIEC61850Name()
	 * @generated
	 * @ordered
	 */
	protected String sIEC61850Name = SIEC61850_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSAREFName() <em>SSAREF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSAREFName()
	 * @generated
	 * @ordered
	 */
	protected static final String SSAREF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSAREFName() <em>SSAREF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSAREFName()
	 * @generated
	 * @ordered
	 */
	protected String sSAREFName = SSAREF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSEEBUSName() <em>SEEBUS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEEBUSName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEEBUS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSEEBUSName() <em>SEEBUS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEEBUSName()
	 * @generated
	 * @ordered
	 */
	protected String sEEBUSName = SEEBUS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrNamelistTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrNamelistType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrNamelistKindOfType getNameType() {
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameType(SGrNamelistKindOfType newNameType) {
		SGrNamelistKindOfType oldNameType = nameType;
		nameType = newNameType == null ? NAME_TYPE_EDEFAULT : newNameType;
		boolean oldNameTypeESet = nameTypeESet;
		nameTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__NAME_TYPE, oldNameType, nameType, !oldNameTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNameType() {
		SGrNamelistKindOfType oldNameType = nameType;
		boolean oldNameTypeESet = nameTypeESet;
		nameType = NAME_TYPE_EDEFAULT;
		nameTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_NAMELIST_TYPE__NAME_TYPE, oldNameType, NAME_TYPE_EDEFAULT, oldNameTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNameType() {
		return nameTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSLV1Name() {
		return sLV1Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSLV1Name(String newSLV1Name) {
		String oldSLV1Name = sLV1Name;
		sLV1Name = newSLV1Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__SLV1_NAME, oldSLV1Name, sLV1Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSWorkName() {
		return sWorkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSWorkName(String newSWorkName) {
		String oldSWorkName = sWorkName;
		sWorkName = newSWorkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__SWORK_NAME, oldSWorkName, sWorkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSManufName() {
		return sManufName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSManufName(String newSManufName) {
		String oldSManufName = sManufName;
		sManufName = newSManufName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__SMANUF_NAME, oldSManufName, sManufName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSIEC61850Name() {
		return sIEC61850Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIEC61850Name(String newSIEC61850Name) {
		String oldSIEC61850Name = sIEC61850Name;
		sIEC61850Name = newSIEC61850Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__SIEC61850_NAME, oldSIEC61850Name, sIEC61850Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSAREFName() {
		return sSAREFName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSAREFName(String newSSAREFName) {
		String oldSSAREFName = sSAREFName;
		sSAREFName = newSSAREFName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__SSAREF_NAME, oldSSAREFName, sSAREFName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSEEBUSName() {
		return sEEBUSName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSEEBUSName(String newSEEBUSName) {
		String oldSEEBUSName = sEEBUSName;
		sEEBUSName = newSEEBUSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_NAMELIST_TYPE__SEEBUS_NAME, oldSEEBUSName, sEEBUSName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_NAMELIST_TYPE__NAME_TYPE:
				return getNameType();
			case V0Package.SGR_NAMELIST_TYPE__SLV1_NAME:
				return getSLV1Name();
			case V0Package.SGR_NAMELIST_TYPE__SWORK_NAME:
				return getSWorkName();
			case V0Package.SGR_NAMELIST_TYPE__SMANUF_NAME:
				return getSManufName();
			case V0Package.SGR_NAMELIST_TYPE__SIEC61850_NAME:
				return getSIEC61850Name();
			case V0Package.SGR_NAMELIST_TYPE__SSAREF_NAME:
				return getSSAREFName();
			case V0Package.SGR_NAMELIST_TYPE__SEEBUS_NAME:
				return getSEEBUSName();
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
			case V0Package.SGR_NAMELIST_TYPE__NAME_TYPE:
				setNameType((SGrNamelistKindOfType)newValue);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SLV1_NAME:
				setSLV1Name((String)newValue);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SWORK_NAME:
				setSWorkName((String)newValue);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SMANUF_NAME:
				setSManufName((String)newValue);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SIEC61850_NAME:
				setSIEC61850Name((String)newValue);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SSAREF_NAME:
				setSSAREFName((String)newValue);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SEEBUS_NAME:
				setSEEBUSName((String)newValue);
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
			case V0Package.SGR_NAMELIST_TYPE__NAME_TYPE:
				unsetNameType();
				return;
			case V0Package.SGR_NAMELIST_TYPE__SLV1_NAME:
				setSLV1Name(SLV1_NAME_EDEFAULT);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SWORK_NAME:
				setSWorkName(SWORK_NAME_EDEFAULT);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SMANUF_NAME:
				setSManufName(SMANUF_NAME_EDEFAULT);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SIEC61850_NAME:
				setSIEC61850Name(SIEC61850_NAME_EDEFAULT);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SSAREF_NAME:
				setSSAREFName(SSAREF_NAME_EDEFAULT);
				return;
			case V0Package.SGR_NAMELIST_TYPE__SEEBUS_NAME:
				setSEEBUSName(SEEBUS_NAME_EDEFAULT);
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
			case V0Package.SGR_NAMELIST_TYPE__NAME_TYPE:
				return isSetNameType();
			case V0Package.SGR_NAMELIST_TYPE__SLV1_NAME:
				return SLV1_NAME_EDEFAULT == null ? sLV1Name != null : !SLV1_NAME_EDEFAULT.equals(sLV1Name);
			case V0Package.SGR_NAMELIST_TYPE__SWORK_NAME:
				return SWORK_NAME_EDEFAULT == null ? sWorkName != null : !SWORK_NAME_EDEFAULT.equals(sWorkName);
			case V0Package.SGR_NAMELIST_TYPE__SMANUF_NAME:
				return SMANUF_NAME_EDEFAULT == null ? sManufName != null : !SMANUF_NAME_EDEFAULT.equals(sManufName);
			case V0Package.SGR_NAMELIST_TYPE__SIEC61850_NAME:
				return SIEC61850_NAME_EDEFAULT == null ? sIEC61850Name != null : !SIEC61850_NAME_EDEFAULT.equals(sIEC61850Name);
			case V0Package.SGR_NAMELIST_TYPE__SSAREF_NAME:
				return SSAREF_NAME_EDEFAULT == null ? sSAREFName != null : !SSAREF_NAME_EDEFAULT.equals(sSAREFName);
			case V0Package.SGR_NAMELIST_TYPE__SEEBUS_NAME:
				return SEEBUS_NAME_EDEFAULT == null ? sEEBUSName != null : !SEEBUS_NAME_EDEFAULT.equals(sEEBUSName);
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
		result.append(" (nameType: ");
		if (nameTypeESet) result.append(nameType); else result.append("<unset>");
		result.append(", sLV1Name: ");
		result.append(sLV1Name);
		result.append(", sWorkName: ");
		result.append(sWorkName);
		result.append(", sManufName: ");
		result.append(sManufName);
		result.append(", sIEC61850Name: ");
		result.append(sIEC61850Name);
		result.append(", sSAREFName: ");
		result.append(sSAREFName);
		result.append(", sEEBUSName: ");
		result.append(sEEBUSName);
		result.append(')');
		return result.toString();
	}

} //SGrNamelistTypeImpl
