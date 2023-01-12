/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrBitmapperListType;
import com.smartgridready.ns.v0.SGrBool2BitRankType;
import com.smartgridready.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Bitmapper List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl#getSgrBool2BitRank <em>Sgr Bool2 Bit Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrBitmapperListTypeImpl extends MinimalEObjectImpl.Container implements SGrBitmapperListType {
	/**
	 * The default value of the '{@link #getSgrBool2BitRank() <em>Sgr Bool2 Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrBool2BitRank()
	 * @generated
	 * @ordered
	 */
	protected static final SGrBool2BitRankType SGR_BOOL2_BIT_RANK_EDEFAULT = SGrBool2BitRankType.BIT0;

	/**
	 * The cached value of the '{@link #getSgrBool2BitRank() <em>Sgr Bool2 Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrBool2BitRank()
	 * @generated
	 * @ordered
	 */
	protected SGrBool2BitRankType sgrBool2BitRank = SGR_BOOL2_BIT_RANK_EDEFAULT;

	/**
	 * This is true if the Sgr Bool2 Bit Rank attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrBool2BitRankESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrBitmapperListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrBitmapperListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrBool2BitRankType getSgrBool2BitRank() {
		return sgrBool2BitRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrBool2BitRank(SGrBool2BitRankType newSgrBool2BitRank) {
		SGrBool2BitRankType oldSgrBool2BitRank = sgrBool2BitRank;
		sgrBool2BitRank = newSgrBool2BitRank == null ? SGR_BOOL2_BIT_RANK_EDEFAULT : newSgrBool2BitRank;
		boolean oldSgrBool2BitRankESet = sgrBool2BitRankESet;
		sgrBool2BitRankESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK, oldSgrBool2BitRank, sgrBool2BitRank, !oldSgrBool2BitRankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrBool2BitRank() {
		SGrBool2BitRankType oldSgrBool2BitRank = sgrBool2BitRank;
		boolean oldSgrBool2BitRankESet = sgrBool2BitRankESet;
		sgrBool2BitRank = SGR_BOOL2_BIT_RANK_EDEFAULT;
		sgrBool2BitRankESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK, oldSgrBool2BitRank, SGR_BOOL2_BIT_RANK_EDEFAULT, oldSgrBool2BitRankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrBool2BitRank() {
		return sgrBool2BitRankESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK:
				return getSgrBool2BitRank();
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK:
				setSgrBool2BitRank((SGrBool2BitRankType)newValue);
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK:
				unsetSgrBool2BitRank();
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_BOOL2_BIT_RANK:
				return isSetSgrBool2BitRank();
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
		result.append(" (sgrBool2BitRank: ");
		if (sgrBool2BitRankESet) result.append(sgrBool2BitRank); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrBitmapperListTypeImpl
