/**
 */
package ch.smartgridready.ns.s.gr.v0.impl;

import ch.smartgridready.ns.s.gr.v0.SGReadyStateLv2Type;
import ch.smartgridready.ns.s.gr.v0.SGrEVSEStateLv2Type;
import ch.smartgridready.ns.s.gr.v0.SGrEnumListType;
import ch.smartgridready.ns.s.gr.v0.SGrSGCPFeedInStateLv2Type;
import ch.smartgridready.ns.s.gr.v0.SGrSGCPLoadStateLv2Type;
import ch.smartgridready.ns.s.gr.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Enum List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrEnumListTypeImpl#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrEnumListTypeImpl#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrEnumListTypeImpl#getSgreadyStateLv2 <em>Sgready State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrEnumListTypeImpl#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.impl.SGrEnumListTypeImpl#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrEnumListTypeImpl extends MinimalEObjectImpl.Container implements SGrEnumListType {
	/**
	 * The default value of the '{@link #getSgrEVSEStateLv2() <em>Sgr EVSE State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVSEStateLv2()
	 * @generated
	 * @ordered
	 */
	protected static final SGrEVSEStateLv2Type SGR_EVSE_STATE_LV2_EDEFAULT = SGrEVSEStateLv2Type.EVNORMAL;

	/**
	 * The cached value of the '{@link #getSgrEVSEStateLv2() <em>Sgr EVSE State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVSEStateLv2()
	 * @generated
	 * @ordered
	 */
	protected SGrEVSEStateLv2Type sgrEVSEStateLv2 = SGR_EVSE_STATE_LV2_EDEFAULT;

	/**
	 * This is true if the Sgr EVSE State Lv2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrEVSEStateLv2ESet;

	/**
	 * The default value of the '{@link #getSgrEVSEStateLv1() <em>Sgr EVSE State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVSEStateLv1()
	 * @generated
	 * @ordered
	 */
	protected static final SGrEVSEStateLv2Type SGR_EVSE_STATE_LV1_EDEFAULT = SGrEVSEStateLv2Type.EVNORMAL;

	/**
	 * The cached value of the '{@link #getSgrEVSEStateLv1() <em>Sgr EVSE State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVSEStateLv1()
	 * @generated
	 * @ordered
	 */
	protected SGrEVSEStateLv2Type sgrEVSEStateLv1 = SGR_EVSE_STATE_LV1_EDEFAULT;

	/**
	 * This is true if the Sgr EVSE State Lv1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrEVSEStateLv1ESet;

	/**
	 * The default value of the '{@link #getSgreadyStateLv2() <em>Sgready State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgreadyStateLv2()
	 * @generated
	 * @ordered
	 */
	protected static final SGReadyStateLv2Type SGREADY_STATE_LV2_EDEFAULT = SGReadyStateLv2Type.NORMAL;

	/**
	 * The cached value of the '{@link #getSgreadyStateLv2() <em>Sgready State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgreadyStateLv2()
	 * @generated
	 * @ordered
	 */
	protected SGReadyStateLv2Type sgreadyStateLv2 = SGREADY_STATE_LV2_EDEFAULT;

	/**
	 * This is true if the Sgready State Lv2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgreadyStateLv2ESet;

	/**
	 * The default value of the '{@link #getSgrSGCPLoadStateLv2() <em>Sgr SGCP Load State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSGCPLoadStateLv2()
	 * @generated
	 * @ordered
	 */
	protected static final SGrSGCPLoadStateLv2Type SGR_SGCP_LOAD_STATE_LV2_EDEFAULT = SGrSGCPLoadStateLv2Type.LDNORMAL;

	/**
	 * The cached value of the '{@link #getSgrSGCPLoadStateLv2() <em>Sgr SGCP Load State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSGCPLoadStateLv2()
	 * @generated
	 * @ordered
	 */
	protected SGrSGCPLoadStateLv2Type sgrSGCPLoadStateLv2 = SGR_SGCP_LOAD_STATE_LV2_EDEFAULT;

	/**
	 * This is true if the Sgr SGCP Load State Lv2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrSGCPLoadStateLv2ESet;

	/**
	 * The default value of the '{@link #getSgrSGCPFeedInStateLv2() <em>Sgr SGCP Feed In State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSGCPFeedInStateLv2()
	 * @generated
	 * @ordered
	 */
	protected static final SGrSGCPFeedInStateLv2Type SGR_SGCP_FEED_IN_STATE_LV2_EDEFAULT = SGrSGCPFeedInStateLv2Type.FINORMAL;

	/**
	 * The cached value of the '{@link #getSgrSGCPFeedInStateLv2() <em>Sgr SGCP Feed In State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSGCPFeedInStateLv2()
	 * @generated
	 * @ordered
	 */
	protected SGrSGCPFeedInStateLv2Type sgrSGCPFeedInStateLv2 = SGR_SGCP_FEED_IN_STATE_LV2_EDEFAULT;

	/**
	 * This is true if the Sgr SGCP Feed In State Lv2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrSGCPFeedInStateLv2ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrEnumListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrEnumListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrEVSEStateLv2Type getSgrEVSEStateLv2() {
		return sgrEVSEStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrEVSEStateLv2(SGrEVSEStateLv2Type newSgrEVSEStateLv2) {
		SGrEVSEStateLv2Type oldSgrEVSEStateLv2 = sgrEVSEStateLv2;
		sgrEVSEStateLv2 = newSgrEVSEStateLv2 == null ? SGR_EVSE_STATE_LV2_EDEFAULT : newSgrEVSEStateLv2;
		boolean oldSgrEVSEStateLv2ESet = sgrEVSEStateLv2ESet;
		sgrEVSEStateLv2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2, oldSgrEVSEStateLv2, sgrEVSEStateLv2, !oldSgrEVSEStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrEVSEStateLv2() {
		SGrEVSEStateLv2Type oldSgrEVSEStateLv2 = sgrEVSEStateLv2;
		boolean oldSgrEVSEStateLv2ESet = sgrEVSEStateLv2ESet;
		sgrEVSEStateLv2 = SGR_EVSE_STATE_LV2_EDEFAULT;
		sgrEVSEStateLv2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2, oldSgrEVSEStateLv2, SGR_EVSE_STATE_LV2_EDEFAULT, oldSgrEVSEStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrEVSEStateLv2() {
		return sgrEVSEStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrEVSEStateLv2Type getSgrEVSEStateLv1() {
		return sgrEVSEStateLv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrEVSEStateLv1(SGrEVSEStateLv2Type newSgrEVSEStateLv1) {
		SGrEVSEStateLv2Type oldSgrEVSEStateLv1 = sgrEVSEStateLv1;
		sgrEVSEStateLv1 = newSgrEVSEStateLv1 == null ? SGR_EVSE_STATE_LV1_EDEFAULT : newSgrEVSEStateLv1;
		boolean oldSgrEVSEStateLv1ESet = sgrEVSEStateLv1ESet;
		sgrEVSEStateLv1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1, oldSgrEVSEStateLv1, sgrEVSEStateLv1, !oldSgrEVSEStateLv1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrEVSEStateLv1() {
		SGrEVSEStateLv2Type oldSgrEVSEStateLv1 = sgrEVSEStateLv1;
		boolean oldSgrEVSEStateLv1ESet = sgrEVSEStateLv1ESet;
		sgrEVSEStateLv1 = SGR_EVSE_STATE_LV1_EDEFAULT;
		sgrEVSEStateLv1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1, oldSgrEVSEStateLv1, SGR_EVSE_STATE_LV1_EDEFAULT, oldSgrEVSEStateLv1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrEVSEStateLv1() {
		return sgrEVSEStateLv1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGReadyStateLv2Type getSgreadyStateLv2() {
		return sgreadyStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgreadyStateLv2(SGReadyStateLv2Type newSgreadyStateLv2) {
		SGReadyStateLv2Type oldSgreadyStateLv2 = sgreadyStateLv2;
		sgreadyStateLv2 = newSgreadyStateLv2 == null ? SGREADY_STATE_LV2_EDEFAULT : newSgreadyStateLv2;
		boolean oldSgreadyStateLv2ESet = sgreadyStateLv2ESet;
		sgreadyStateLv2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2, oldSgreadyStateLv2, sgreadyStateLv2, !oldSgreadyStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgreadyStateLv2() {
		SGReadyStateLv2Type oldSgreadyStateLv2 = sgreadyStateLv2;
		boolean oldSgreadyStateLv2ESet = sgreadyStateLv2ESet;
		sgreadyStateLv2 = SGREADY_STATE_LV2_EDEFAULT;
		sgreadyStateLv2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2, oldSgreadyStateLv2, SGREADY_STATE_LV2_EDEFAULT, oldSgreadyStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgreadyStateLv2() {
		return sgreadyStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSGCPLoadStateLv2Type getSgrSGCPLoadStateLv2() {
		return sgrSGCPLoadStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type newSgrSGCPLoadStateLv2) {
		SGrSGCPLoadStateLv2Type oldSgrSGCPLoadStateLv2 = sgrSGCPLoadStateLv2;
		sgrSGCPLoadStateLv2 = newSgrSGCPLoadStateLv2 == null ? SGR_SGCP_LOAD_STATE_LV2_EDEFAULT : newSgrSGCPLoadStateLv2;
		boolean oldSgrSGCPLoadStateLv2ESet = sgrSGCPLoadStateLv2ESet;
		sgrSGCPLoadStateLv2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2, oldSgrSGCPLoadStateLv2, sgrSGCPLoadStateLv2, !oldSgrSGCPLoadStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrSGCPLoadStateLv2() {
		SGrSGCPLoadStateLv2Type oldSgrSGCPLoadStateLv2 = sgrSGCPLoadStateLv2;
		boolean oldSgrSGCPLoadStateLv2ESet = sgrSGCPLoadStateLv2ESet;
		sgrSGCPLoadStateLv2 = SGR_SGCP_LOAD_STATE_LV2_EDEFAULT;
		sgrSGCPLoadStateLv2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2, oldSgrSGCPLoadStateLv2, SGR_SGCP_LOAD_STATE_LV2_EDEFAULT, oldSgrSGCPLoadStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrSGCPLoadStateLv2() {
		return sgrSGCPLoadStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSGCPFeedInStateLv2Type getSgrSGCPFeedInStateLv2() {
		return sgrSGCPFeedInStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type newSgrSGCPFeedInStateLv2) {
		SGrSGCPFeedInStateLv2Type oldSgrSGCPFeedInStateLv2 = sgrSGCPFeedInStateLv2;
		sgrSGCPFeedInStateLv2 = newSgrSGCPFeedInStateLv2 == null ? SGR_SGCP_FEED_IN_STATE_LV2_EDEFAULT : newSgrSGCPFeedInStateLv2;
		boolean oldSgrSGCPFeedInStateLv2ESet = sgrSGCPFeedInStateLv2ESet;
		sgrSGCPFeedInStateLv2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2, oldSgrSGCPFeedInStateLv2, sgrSGCPFeedInStateLv2, !oldSgrSGCPFeedInStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrSGCPFeedInStateLv2() {
		SGrSGCPFeedInStateLv2Type oldSgrSGCPFeedInStateLv2 = sgrSGCPFeedInStateLv2;
		boolean oldSgrSGCPFeedInStateLv2ESet = sgrSGCPFeedInStateLv2ESet;
		sgrSGCPFeedInStateLv2 = SGR_SGCP_FEED_IN_STATE_LV2_EDEFAULT;
		sgrSGCPFeedInStateLv2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2, oldSgrSGCPFeedInStateLv2, SGR_SGCP_FEED_IN_STATE_LV2_EDEFAULT, oldSgrSGCPFeedInStateLv2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrSGCPFeedInStateLv2() {
		return sgrSGCPFeedInStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				return getSgrEVSEStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				return getSgrEVSEStateLv1();
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				return getSgreadyStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				return getSgrSGCPLoadStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				return getSgrSGCPFeedInStateLv2();
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				setSgrEVSEStateLv2((SGrEVSEStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				setSgrEVSEStateLv1((SGrEVSEStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				setSgreadyStateLv2((SGReadyStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				setSgrSGCPLoadStateLv2((SGrSGCPLoadStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				setSgrSGCPFeedInStateLv2((SGrSGCPFeedInStateLv2Type)newValue);
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				unsetSgrEVSEStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				unsetSgrEVSEStateLv1();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				unsetSgreadyStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				unsetSgrSGCPLoadStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				unsetSgrSGCPFeedInStateLv2();
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				return isSetSgrEVSEStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				return isSetSgrEVSEStateLv1();
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				return isSetSgreadyStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				return isSetSgrSGCPLoadStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				return isSetSgrSGCPFeedInStateLv2();
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
		result.append(" (sgrEVSEStateLv2: ");
		if (sgrEVSEStateLv2ESet) result.append(sgrEVSEStateLv2); else result.append("<unset>");
		result.append(", sgrEVSEStateLv1: ");
		if (sgrEVSEStateLv1ESet) result.append(sgrEVSEStateLv1); else result.append("<unset>");
		result.append(", sgreadyStateLv2: ");
		if (sgreadyStateLv2ESet) result.append(sgreadyStateLv2); else result.append("<unset>");
		result.append(", sgrSGCPLoadStateLv2: ");
		if (sgrSGCPLoadStateLv2ESet) result.append(sgrSGCPLoadStateLv2); else result.append("<unset>");
		result.append(", sgrSGCPFeedInStateLv2: ");
		if (sgrSGCPFeedInStateLv2ESet) result.append(sgrSGCPFeedInStateLv2); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrEnumListTypeImpl
