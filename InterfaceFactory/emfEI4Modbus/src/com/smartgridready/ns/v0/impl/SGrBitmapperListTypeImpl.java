/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.SGrBitmapperListType;
import com.smartgridready.ns.v0.SGrBool2BitRankType;
import com.smartgridready.ns.v0.SGrHPActBufferStateType;
import com.smartgridready.ns.v0.SGrHPOpstateType;
import com.smartgridready.ns.v0.SgrHCOpStateType;
import com.smartgridready.ns.v0.StiHPOpstateStiebelType;
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
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl#getSgrHPOpstate <em>Sgr HP Opstate</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl#getStiHPOpstateStiebel <em>Sti HP Opstate Stiebel</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl#getSgrHCOpstate <em>Sgr HC Opstate</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrBitmapperListTypeImpl#getSgrHPActBufferState <em>Sgr HP Act Buffer State</em>}</li>
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
	 * The default value of the '{@link #getSgrHPOpstate() <em>Sgr HP Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHPOpstate()
	 * @generated
	 * @ordered
	 */
	protected static final SGrHPOpstateType SGR_HP_OPSTATE_EDEFAULT = SGrHPOpstateType.HPPUMPON;

	/**
	 * The cached value of the '{@link #getSgrHPOpstate() <em>Sgr HP Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHPOpstate()
	 * @generated
	 * @ordered
	 */
	protected SGrHPOpstateType sgrHPOpstate = SGR_HP_OPSTATE_EDEFAULT;

	/**
	 * This is true if the Sgr HP Opstate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrHPOpstateESet;

	/**
	 * The default value of the '{@link #getStiHPOpstateStiebel() <em>Sti HP Opstate Stiebel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStiHPOpstateStiebel()
	 * @generated
	 * @ordered
	 */
	protected static final StiHPOpstateStiebelType STI_HP_OPSTATE_STIEBEL_EDEFAULT = StiHPOpstateStiebelType.HP1PUMPON;

	/**
	 * The cached value of the '{@link #getStiHPOpstateStiebel() <em>Sti HP Opstate Stiebel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStiHPOpstateStiebel()
	 * @generated
	 * @ordered
	 */
	protected StiHPOpstateStiebelType stiHPOpstateStiebel = STI_HP_OPSTATE_STIEBEL_EDEFAULT;

	/**
	 * This is true if the Sti HP Opstate Stiebel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stiHPOpstateStiebelESet;

	/**
	 * The default value of the '{@link #getSgrHCOpstate() <em>Sgr HC Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHCOpstate()
	 * @generated
	 * @ordered
	 */
	protected static final SgrHCOpStateType SGR_HC_OPSTATE_EDEFAULT = SgrHCOpStateType.HCOFF;

	/**
	 * The cached value of the '{@link #getSgrHCOpstate() <em>Sgr HC Opstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHCOpstate()
	 * @generated
	 * @ordered
	 */
	protected SgrHCOpStateType sgrHCOpstate = SGR_HC_OPSTATE_EDEFAULT;

	/**
	 * This is true if the Sgr HC Opstate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrHCOpstateESet;

	/**
	 * The default value of the '{@link #getSgrHPActBufferState() <em>Sgr HP Act Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHPActBufferState()
	 * @generated
	 * @ordered
	 */
	protected static final SGrHPActBufferStateType SGR_HP_ACT_BUFFER_STATE_EDEFAULT = SGrHPActBufferStateType.HPBOFF;

	/**
	 * The cached value of the '{@link #getSgrHPActBufferState() <em>Sgr HP Act Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHPActBufferState()
	 * @generated
	 * @ordered
	 */
	protected SGrHPActBufferStateType sgrHPActBufferState = SGR_HP_ACT_BUFFER_STATE_EDEFAULT;

	/**
	 * This is true if the Sgr HP Act Buffer State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrHPActBufferStateESet;

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
	public SGrHPOpstateType getSgrHPOpstate() {
		return sgrHPOpstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrHPOpstate(SGrHPOpstateType newSgrHPOpstate) {
		SGrHPOpstateType oldSgrHPOpstate = sgrHPOpstate;
		sgrHPOpstate = newSgrHPOpstate == null ? SGR_HP_OPSTATE_EDEFAULT : newSgrHPOpstate;
		boolean oldSgrHPOpstateESet = sgrHPOpstateESet;
		sgrHPOpstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE, oldSgrHPOpstate, sgrHPOpstate, !oldSgrHPOpstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrHPOpstate() {
		SGrHPOpstateType oldSgrHPOpstate = sgrHPOpstate;
		boolean oldSgrHPOpstateESet = sgrHPOpstateESet;
		sgrHPOpstate = SGR_HP_OPSTATE_EDEFAULT;
		sgrHPOpstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE, oldSgrHPOpstate, SGR_HP_OPSTATE_EDEFAULT, oldSgrHPOpstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrHPOpstate() {
		return sgrHPOpstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StiHPOpstateStiebelType getStiHPOpstateStiebel() {
		return stiHPOpstateStiebel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStiHPOpstateStiebel(StiHPOpstateStiebelType newStiHPOpstateStiebel) {
		StiHPOpstateStiebelType oldStiHPOpstateStiebel = stiHPOpstateStiebel;
		stiHPOpstateStiebel = newStiHPOpstateStiebel == null ? STI_HP_OPSTATE_STIEBEL_EDEFAULT : newStiHPOpstateStiebel;
		boolean oldStiHPOpstateStiebelESet = stiHPOpstateStiebelESet;
		stiHPOpstateStiebelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL, oldStiHPOpstateStiebel, stiHPOpstateStiebel, !oldStiHPOpstateStiebelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStiHPOpstateStiebel() {
		StiHPOpstateStiebelType oldStiHPOpstateStiebel = stiHPOpstateStiebel;
		boolean oldStiHPOpstateStiebelESet = stiHPOpstateStiebelESet;
		stiHPOpstateStiebel = STI_HP_OPSTATE_STIEBEL_EDEFAULT;
		stiHPOpstateStiebelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL, oldStiHPOpstateStiebel, STI_HP_OPSTATE_STIEBEL_EDEFAULT, oldStiHPOpstateStiebelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStiHPOpstateStiebel() {
		return stiHPOpstateStiebelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SgrHCOpStateType getSgrHCOpstate() {
		return sgrHCOpstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrHCOpstate(SgrHCOpStateType newSgrHCOpstate) {
		SgrHCOpStateType oldSgrHCOpstate = sgrHCOpstate;
		sgrHCOpstate = newSgrHCOpstate == null ? SGR_HC_OPSTATE_EDEFAULT : newSgrHCOpstate;
		boolean oldSgrHCOpstateESet = sgrHCOpstateESet;
		sgrHCOpstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE, oldSgrHCOpstate, sgrHCOpstate, !oldSgrHCOpstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrHCOpstate() {
		SgrHCOpStateType oldSgrHCOpstate = sgrHCOpstate;
		boolean oldSgrHCOpstateESet = sgrHCOpstateESet;
		sgrHCOpstate = SGR_HC_OPSTATE_EDEFAULT;
		sgrHCOpstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE, oldSgrHCOpstate, SGR_HC_OPSTATE_EDEFAULT, oldSgrHCOpstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrHCOpstate() {
		return sgrHCOpstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrHPActBufferStateType getSgrHPActBufferState() {
		return sgrHPActBufferState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrHPActBufferState(SGrHPActBufferStateType newSgrHPActBufferState) {
		SGrHPActBufferStateType oldSgrHPActBufferState = sgrHPActBufferState;
		sgrHPActBufferState = newSgrHPActBufferState == null ? SGR_HP_ACT_BUFFER_STATE_EDEFAULT : newSgrHPActBufferState;
		boolean oldSgrHPActBufferStateESet = sgrHPActBufferStateESet;
		sgrHPActBufferStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE, oldSgrHPActBufferState, sgrHPActBufferState, !oldSgrHPActBufferStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrHPActBufferState() {
		SGrHPActBufferStateType oldSgrHPActBufferState = sgrHPActBufferState;
		boolean oldSgrHPActBufferStateESet = sgrHPActBufferStateESet;
		sgrHPActBufferState = SGR_HP_ACT_BUFFER_STATE_EDEFAULT;
		sgrHPActBufferStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE, oldSgrHPActBufferState, SGR_HP_ACT_BUFFER_STATE_EDEFAULT, oldSgrHPActBufferStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrHPActBufferState() {
		return sgrHPActBufferStateESet;
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE:
				return getSgrHPOpstate();
			case V0Package.SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL:
				return getStiHPOpstateStiebel();
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE:
				return getSgrHCOpstate();
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE:
				return getSgrHPActBufferState();
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE:
				setSgrHPOpstate((SGrHPOpstateType)newValue);
				return;
			case V0Package.SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL:
				setStiHPOpstateStiebel((StiHPOpstateStiebelType)newValue);
				return;
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE:
				setSgrHCOpstate((SgrHCOpStateType)newValue);
				return;
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE:
				setSgrHPActBufferState((SGrHPActBufferStateType)newValue);
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE:
				unsetSgrHPOpstate();
				return;
			case V0Package.SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL:
				unsetStiHPOpstateStiebel();
				return;
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE:
				unsetSgrHCOpstate();
				return;
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE:
				unsetSgrHPActBufferState();
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
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_OPSTATE:
				return isSetSgrHPOpstate();
			case V0Package.SGR_BITMAPPER_LIST_TYPE__STI_HP_OPSTATE_STIEBEL:
				return isSetStiHPOpstateStiebel();
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HC_OPSTATE:
				return isSetSgrHCOpstate();
			case V0Package.SGR_BITMAPPER_LIST_TYPE__SGR_HP_ACT_BUFFER_STATE:
				return isSetSgrHPActBufferState();
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
		result.append(", sgrHPOpstate: ");
		if (sgrHPOpstateESet) result.append(sgrHPOpstate); else result.append("<unset>");
		result.append(", stiHPOpstateStiebel: ");
		if (stiHPOpstateStiebelESet) result.append(stiHPOpstateStiebel); else result.append("<unset>");
		result.append(", sgrHCOpstate: ");
		if (sgrHCOpstateESet) result.append(sgrHCOpstate); else result.append("<unset>");
		result.append(", sgrHPActBufferState: ");
		if (sgrHPActBufferStateESet) result.append(sgrHPActBufferState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrBitmapperListTypeImpl
