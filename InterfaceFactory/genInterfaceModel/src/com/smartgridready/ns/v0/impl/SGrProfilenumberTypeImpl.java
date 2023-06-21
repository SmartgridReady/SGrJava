/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.LevelOfOperationType;
import com.smartgridready.ns.v0.ProfileTypeEnumType;
import com.smartgridready.ns.v0.SGrProfilenumberType;
import com.smartgridready.ns.v0.SGrVersionNumberType;
import com.smartgridready.ns.v0.SubProfileTypeEnumType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Profilenumber Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl#getSpecsOwnerId <em>Specs Owner Id</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl#getProfileIdentification <em>Profile Identification</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl#getSubProfileIdent <em>Sub Profile Ident</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl#getSgrLevelOfOperation <em>Sgr Level Of Operation</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrProfilenumberTypeImpl#getVersionNumber <em>Version Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrProfilenumberTypeImpl extends MinimalEObjectImpl.Container implements SGrProfilenumberType {
	/**
	 * The default value of the '{@link #getSpecsOwnerId() <em>Specs Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecsOwnerId()
	 * @generated
	 * @ordered
	 */
	protected static final int SPECS_OWNER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpecsOwnerId() <em>Specs Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecsOwnerId()
	 * @generated
	 * @ordered
	 */
	protected int specsOwnerId = SPECS_OWNER_ID_EDEFAULT;

	/**
	 * This is true if the Specs Owner Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specsOwnerIdESet;

	/**
	 * The default value of the '{@link #getProfileIdentification() <em>Profile Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final ProfileTypeEnumType PROFILE_IDENTIFICATION_EDEFAULT = ProfileTypeEnumType.BATTERY;

	/**
	 * The cached value of the '{@link #getProfileIdentification() <em>Profile Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileIdentification()
	 * @generated
	 * @ordered
	 */
	protected ProfileTypeEnumType profileIdentification = PROFILE_IDENTIFICATION_EDEFAULT;

	/**
	 * This is true if the Profile Identification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileIdentificationESet;

	/**
	 * The default value of the '{@link #getSubProfileIdent() <em>Sub Profile Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProfileIdent()
	 * @generated
	 * @ordered
	 */
	protected static final SubProfileTypeEnumType SUB_PROFILE_IDENT_EDEFAULT = SubProfileTypeEnumType.UNDEF;

	/**
	 * The cached value of the '{@link #getSubProfileIdent() <em>Sub Profile Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProfileIdent()
	 * @generated
	 * @ordered
	 */
	protected SubProfileTypeEnumType subProfileIdent = SUB_PROFILE_IDENT_EDEFAULT;

	/**
	 * This is true if the Sub Profile Ident attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subProfileIdentESet;

	/**
	 * The default value of the '{@link #getSgrLevelOfOperation() <em>Sgr Level Of Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrLevelOfOperation()
	 * @generated
	 * @ordered
	 */
	protected static final LevelOfOperationType SGR_LEVEL_OF_OPERATION_EDEFAULT = LevelOfOperationType.M;

	/**
	 * The cached value of the '{@link #getSgrLevelOfOperation() <em>Sgr Level Of Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrLevelOfOperation()
	 * @generated
	 * @ordered
	 */
	protected LevelOfOperationType sgrLevelOfOperation = SGR_LEVEL_OF_OPERATION_EDEFAULT;

	/**
	 * This is true if the Sgr Level Of Operation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrLevelOfOperationESet;

	/**
	 * The cached value of the '{@link #getVersionNumber() <em>Version Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected SGrVersionNumberType versionNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrProfilenumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrProfilenumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpecsOwnerId() {
		return specsOwnerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecsOwnerId(int newSpecsOwnerId) {
		int oldSpecsOwnerId = specsOwnerId;
		specsOwnerId = newSpecsOwnerId;
		boolean oldSpecsOwnerIdESet = specsOwnerIdESet;
		specsOwnerIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID, oldSpecsOwnerId, specsOwnerId, !oldSpecsOwnerIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecsOwnerId() {
		int oldSpecsOwnerId = specsOwnerId;
		boolean oldSpecsOwnerIdESet = specsOwnerIdESet;
		specsOwnerId = SPECS_OWNER_ID_EDEFAULT;
		specsOwnerIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID, oldSpecsOwnerId, SPECS_OWNER_ID_EDEFAULT, oldSpecsOwnerIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecsOwnerId() {
		return specsOwnerIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileTypeEnumType getProfileIdentification() {
		return profileIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileIdentification(ProfileTypeEnumType newProfileIdentification) {
		ProfileTypeEnumType oldProfileIdentification = profileIdentification;
		profileIdentification = newProfileIdentification == null ? PROFILE_IDENTIFICATION_EDEFAULT : newProfileIdentification;
		boolean oldProfileIdentificationESet = profileIdentificationESet;
		profileIdentificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION, oldProfileIdentification, profileIdentification, !oldProfileIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileIdentification() {
		ProfileTypeEnumType oldProfileIdentification = profileIdentification;
		boolean oldProfileIdentificationESet = profileIdentificationESet;
		profileIdentification = PROFILE_IDENTIFICATION_EDEFAULT;
		profileIdentificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION, oldProfileIdentification, PROFILE_IDENTIFICATION_EDEFAULT, oldProfileIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileIdentification() {
		return profileIdentificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProfileTypeEnumType getSubProfileIdent() {
		return subProfileIdent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubProfileIdent(SubProfileTypeEnumType newSubProfileIdent) {
		SubProfileTypeEnumType oldSubProfileIdent = subProfileIdent;
		subProfileIdent = newSubProfileIdent == null ? SUB_PROFILE_IDENT_EDEFAULT : newSubProfileIdent;
		boolean oldSubProfileIdentESet = subProfileIdentESet;
		subProfileIdentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT, oldSubProfileIdent, subProfileIdent, !oldSubProfileIdentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubProfileIdent() {
		SubProfileTypeEnumType oldSubProfileIdent = subProfileIdent;
		boolean oldSubProfileIdentESet = subProfileIdentESet;
		subProfileIdent = SUB_PROFILE_IDENT_EDEFAULT;
		subProfileIdentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT, oldSubProfileIdent, SUB_PROFILE_IDENT_EDEFAULT, oldSubProfileIdentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubProfileIdent() {
		return subProfileIdentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfOperationType getSgrLevelOfOperation() {
		return sgrLevelOfOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgrLevelOfOperation(LevelOfOperationType newSgrLevelOfOperation) {
		LevelOfOperationType oldSgrLevelOfOperation = sgrLevelOfOperation;
		sgrLevelOfOperation = newSgrLevelOfOperation == null ? SGR_LEVEL_OF_OPERATION_EDEFAULT : newSgrLevelOfOperation;
		boolean oldSgrLevelOfOperationESet = sgrLevelOfOperationESet;
		sgrLevelOfOperationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION, oldSgrLevelOfOperation, sgrLevelOfOperation, !oldSgrLevelOfOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSgrLevelOfOperation() {
		LevelOfOperationType oldSgrLevelOfOperation = sgrLevelOfOperation;
		boolean oldSgrLevelOfOperationESet = sgrLevelOfOperationESet;
		sgrLevelOfOperation = SGR_LEVEL_OF_OPERATION_EDEFAULT;
		sgrLevelOfOperationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION, oldSgrLevelOfOperation, SGR_LEVEL_OF_OPERATION_EDEFAULT, oldSgrLevelOfOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSgrLevelOfOperation() {
		return sgrLevelOfOperationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrVersionNumberType getVersionNumber() {
		return versionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionNumber(SGrVersionNumberType newVersionNumber, NotificationChain msgs) {
		SGrVersionNumberType oldVersionNumber = versionNumber;
		versionNumber = newVersionNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER, oldVersionNumber, newVersionNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNumber(SGrVersionNumberType newVersionNumber) {
		if (newVersionNumber != versionNumber) {
			NotificationChain msgs = null;
			if (versionNumber != null)
				msgs = ((InternalEObject)versionNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER, null, msgs);
			if (newVersionNumber != null)
				msgs = ((InternalEObject)newVersionNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER, null, msgs);
			msgs = basicSetVersionNumber(newVersionNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER, newVersionNumber, newVersionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER:
				return basicSetVersionNumber(null, msgs);
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
			case V0Package.SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID:
				return getSpecsOwnerId();
			case V0Package.SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION:
				return getProfileIdentification();
			case V0Package.SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT:
				return getSubProfileIdent();
			case V0Package.SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION:
				return getSgrLevelOfOperation();
			case V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER:
				return getVersionNumber();
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
			case V0Package.SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID:
				setSpecsOwnerId((Integer)newValue);
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION:
				setProfileIdentification((ProfileTypeEnumType)newValue);
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT:
				setSubProfileIdent((SubProfileTypeEnumType)newValue);
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION:
				setSgrLevelOfOperation((LevelOfOperationType)newValue);
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER:
				setVersionNumber((SGrVersionNumberType)newValue);
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
			case V0Package.SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID:
				unsetSpecsOwnerId();
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION:
				unsetProfileIdentification();
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT:
				unsetSubProfileIdent();
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION:
				unsetSgrLevelOfOperation();
				return;
			case V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER:
				setVersionNumber((SGrVersionNumberType)null);
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
			case V0Package.SGR_PROFILENUMBER_TYPE__SPECS_OWNER_ID:
				return isSetSpecsOwnerId();
			case V0Package.SGR_PROFILENUMBER_TYPE__PROFILE_IDENTIFICATION:
				return isSetProfileIdentification();
			case V0Package.SGR_PROFILENUMBER_TYPE__SUB_PROFILE_IDENT:
				return isSetSubProfileIdent();
			case V0Package.SGR_PROFILENUMBER_TYPE__SGR_LEVEL_OF_OPERATION:
				return isSetSgrLevelOfOperation();
			case V0Package.SGR_PROFILENUMBER_TYPE__VERSION_NUMBER:
				return versionNumber != null;
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
		result.append(" (specsOwnerId: ");
		if (specsOwnerIdESet) result.append(specsOwnerId); else result.append("<unset>");
		result.append(", profileIdentification: ");
		if (profileIdentificationESet) result.append(profileIdentification); else result.append("<unset>");
		result.append(", subProfileIdent: ");
		if (subProfileIdentESet) result.append(subProfileIdent); else result.append("<unset>");
		result.append(", sgrLevelOfOperation: ");
		if (sgrLevelOfOperationESet) result.append(sgrLevelOfOperation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrProfilenumberTypeImpl
