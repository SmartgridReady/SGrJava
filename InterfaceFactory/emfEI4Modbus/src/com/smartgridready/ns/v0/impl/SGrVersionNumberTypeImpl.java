/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrVersionNumberType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Version Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl#getPrimaryVersionNumber <em>Primary Version Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl#getSecondaryVersionNumber <em>Secondary Version Number</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrVersionNumberTypeImpl#getSubReleaseVersionNumber <em>Sub Release Version Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrVersionNumberTypeImpl extends MinimalEObjectImpl.Container implements SGrVersionNumberType {
	/**
	 * The default value of the '{@link #getPrimaryVersionNumber() <em>Primary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIMARY_VERSION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrimaryVersionNumber() <em>Primary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected int primaryVersionNumber = PRIMARY_VERSION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Primary Version Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean primaryVersionNumberESet;

	/**
	 * The default value of the '{@link #getSecondaryVersionNumber() <em>Secondary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDARY_VERSION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondaryVersionNumber() <em>Secondary Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected int secondaryVersionNumber = SECONDARY_VERSION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Secondary Version Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondaryVersionNumberESet;

	/**
	 * The default value of the '{@link #getSubReleaseVersionNumber() <em>Sub Release Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubReleaseVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SUB_RELEASE_VERSION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubReleaseVersionNumber() <em>Sub Release Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubReleaseVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected int subReleaseVersionNumber = SUB_RELEASE_VERSION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sub Release Version Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subReleaseVersionNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrVersionNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrVersionNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrimaryVersionNumber() {
		return primaryVersionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryVersionNumber(int newPrimaryVersionNumber) {
		int oldPrimaryVersionNumber = primaryVersionNumber;
		primaryVersionNumber = newPrimaryVersionNumber;
		boolean oldPrimaryVersionNumberESet = primaryVersionNumberESet;
		primaryVersionNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER, oldPrimaryVersionNumber, primaryVersionNumber, !oldPrimaryVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrimaryVersionNumber() {
		int oldPrimaryVersionNumber = primaryVersionNumber;
		boolean oldPrimaryVersionNumberESet = primaryVersionNumberESet;
		primaryVersionNumber = PRIMARY_VERSION_NUMBER_EDEFAULT;
		primaryVersionNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER, oldPrimaryVersionNumber, PRIMARY_VERSION_NUMBER_EDEFAULT, oldPrimaryVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrimaryVersionNumber() {
		return primaryVersionNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondaryVersionNumber() {
		return secondaryVersionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryVersionNumber(int newSecondaryVersionNumber) {
		int oldSecondaryVersionNumber = secondaryVersionNumber;
		secondaryVersionNumber = newSecondaryVersionNumber;
		boolean oldSecondaryVersionNumberESet = secondaryVersionNumberESet;
		secondaryVersionNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER, oldSecondaryVersionNumber, secondaryVersionNumber, !oldSecondaryVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondaryVersionNumber() {
		int oldSecondaryVersionNumber = secondaryVersionNumber;
		boolean oldSecondaryVersionNumberESet = secondaryVersionNumberESet;
		secondaryVersionNumber = SECONDARY_VERSION_NUMBER_EDEFAULT;
		secondaryVersionNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER, oldSecondaryVersionNumber, SECONDARY_VERSION_NUMBER_EDEFAULT, oldSecondaryVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondaryVersionNumber() {
		return secondaryVersionNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubReleaseVersionNumber() {
		return subReleaseVersionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubReleaseVersionNumber(int newSubReleaseVersionNumber) {
		int oldSubReleaseVersionNumber = subReleaseVersionNumber;
		subReleaseVersionNumber = newSubReleaseVersionNumber;
		boolean oldSubReleaseVersionNumberESet = subReleaseVersionNumberESet;
		subReleaseVersionNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER, oldSubReleaseVersionNumber, subReleaseVersionNumber, !oldSubReleaseVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubReleaseVersionNumber() {
		int oldSubReleaseVersionNumber = subReleaseVersionNumber;
		boolean oldSubReleaseVersionNumberESet = subReleaseVersionNumberESet;
		subReleaseVersionNumber = SUB_RELEASE_VERSION_NUMBER_EDEFAULT;
		subReleaseVersionNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER, oldSubReleaseVersionNumber, SUB_RELEASE_VERSION_NUMBER_EDEFAULT, oldSubReleaseVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubReleaseVersionNumber() {
		return subReleaseVersionNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER:
				return getPrimaryVersionNumber();
			case V0Package.SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER:
				return getSecondaryVersionNumber();
			case V0Package.SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER:
				return getSubReleaseVersionNumber();
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
			case V0Package.SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER:
				setPrimaryVersionNumber((Integer)newValue);
				return;
			case V0Package.SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER:
				setSecondaryVersionNumber((Integer)newValue);
				return;
			case V0Package.SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER:
				setSubReleaseVersionNumber((Integer)newValue);
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
			case V0Package.SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER:
				unsetPrimaryVersionNumber();
				return;
			case V0Package.SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER:
				unsetSecondaryVersionNumber();
				return;
			case V0Package.SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER:
				unsetSubReleaseVersionNumber();
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
			case V0Package.SGR_VERSION_NUMBER_TYPE__PRIMARY_VERSION_NUMBER:
				return isSetPrimaryVersionNumber();
			case V0Package.SGR_VERSION_NUMBER_TYPE__SECONDARY_VERSION_NUMBER:
				return isSetSecondaryVersionNumber();
			case V0Package.SGR_VERSION_NUMBER_TYPE__SUB_RELEASE_VERSION_NUMBER:
				return isSetSubReleaseVersionNumber();
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
		result.append(" (primaryVersionNumber: ");
		if (primaryVersionNumberESet) result.append(primaryVersionNumber); else result.append("<unset>");
		result.append(", secondaryVersionNumber: ");
		if (secondaryVersionNumberESet) result.append(secondaryVersionNumber); else result.append("<unset>");
		result.append(", subReleaseVersionNumber: ");
		if (subReleaseVersionNumberESet) result.append(subReleaseVersionNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrVersionNumberTypeImpl
