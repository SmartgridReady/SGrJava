/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGReadyStateLv1Type;
import ch.smartgridready.sgr.ns.v0.SGReadyStateLv2Type;
import ch.smartgridready.sgr.ns.v0.SGrEVSEStateLv1Type;
import ch.smartgridready.sgr.ns.v0.SGrEVSEStateLv2Type;
import ch.smartgridready.sgr.ns.v0.SGrEVStateType;
import ch.smartgridready.sgr.ns.v0.SGrEnumListType;
import ch.smartgridready.sgr.ns.v0.SGrMeasValueSourceType;
import ch.smartgridready.sgr.ns.v0.SGrMeasValueStateType;
import ch.smartgridready.sgr.ns.v0.SGrMeasValueTendencyType;
import ch.smartgridready.sgr.ns.v0.SGrObligLvlType;
import ch.smartgridready.sgr.ns.v0.SGrPowerSourceType;
import ch.smartgridready.sgr.ns.v0.SGrSGCPFeedInStateLv2Type;
import ch.smartgridready.sgr.ns.v0.SGrSGCPLoadStateLv2Type;
import ch.smartgridready.sgr.ns.v0.SGrSGCPServiceType;
import ch.smartgridready.sgr.ns.v0.SGrSunspStateCodesType;
import ch.smartgridready.sgr.ns.v0.V0Package;

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
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrMeasValueState <em>Sgr Meas Value State</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrMeasValueTendency <em>Sgr Meas Value Tendency</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrPowerSource <em>Sgr Power Source</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgreadyStateLv2 <em>Sgready State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgreadyStateLv1 <em>Sgready State Lv1</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrEVState <em>Sgr EV State</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrSGCPService <em>Sgr SGCP Service</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrEnumListTypeImpl#getSgrObligLvl <em>Sgr Oblig Lvl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrEnumListTypeImpl extends MinimalEObjectImpl.Container implements SGrEnumListType {
	/**
	 * The default value of the '{@link #getSgrMeasValueState() <em>Sgr Meas Value State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrMeasValueState()
	 * @generated
	 * @ordered
	 */
	protected static final SGrMeasValueStateType SGR_MEAS_VALUE_STATE_EDEFAULT = SGrMeasValueStateType.NORMAL;

	/**
	 * The cached value of the '{@link #getSgrMeasValueState() <em>Sgr Meas Value State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrMeasValueState()
	 * @generated
	 * @ordered
	 */
	protected SGrMeasValueStateType sgrMeasValueState = SGR_MEAS_VALUE_STATE_EDEFAULT;

	/**
	 * This is true if the Sgr Meas Value State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrMeasValueStateESet;

	/**
	 * The default value of the '{@link #getSgrMeasValueTendency() <em>Sgr Meas Value Tendency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrMeasValueTendency()
	 * @generated
	 * @ordered
	 */
	protected static final SGrMeasValueTendencyType SGR_MEAS_VALUE_TENDENCY_EDEFAULT = SGrMeasValueTendencyType.RISING;

	/**
	 * The cached value of the '{@link #getSgrMeasValueTendency() <em>Sgr Meas Value Tendency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrMeasValueTendency()
	 * @generated
	 * @ordered
	 */
	protected SGrMeasValueTendencyType sgrMeasValueTendency = SGR_MEAS_VALUE_TENDENCY_EDEFAULT;

	/**
	 * This is true if the Sgr Meas Value Tendency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrMeasValueTendencyESet;

	/**
	 * The default value of the '{@link #getSgrMeasValueSource() <em>Sgr Meas Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrMeasValueSource()
	 * @generated
	 * @ordered
	 */
	protected static final SGrMeasValueSourceType SGR_MEAS_VALUE_SOURCE_EDEFAULT = SGrMeasValueSourceType.MEASURED_VALUE;

	/**
	 * The cached value of the '{@link #getSgrMeasValueSource() <em>Sgr Meas Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrMeasValueSource()
	 * @generated
	 * @ordered
	 */
	protected SGrMeasValueSourceType sgrMeasValueSource = SGR_MEAS_VALUE_SOURCE_EDEFAULT;

	/**
	 * This is true if the Sgr Meas Value Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrMeasValueSourceESet;

	/**
	 * The default value of the '{@link #getSgrPowerSource() <em>Sgr Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrPowerSource()
	 * @generated
	 * @ordered
	 */
	protected static final SGrPowerSourceType SGR_POWER_SOURCE_EDEFAULT = SGrPowerSourceType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getSgrPowerSource() <em>Sgr Power Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrPowerSource()
	 * @generated
	 * @ordered
	 */
	protected SGrPowerSourceType sgrPowerSource = SGR_POWER_SOURCE_EDEFAULT;

	/**
	 * This is true if the Sgr Power Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrPowerSourceESet;

	/**
	 * The default value of the '{@link #getSgreadyStateLv2() <em>Sgready State Lv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgreadyStateLv2()
	 * @generated
	 * @ordered
	 */
	protected static final SGReadyStateLv2Type SGREADY_STATE_LV2_EDEFAULT = SGReadyStateLv2Type.HPNORMAL;

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
	 * The default value of the '{@link #getSgreadyStateLv1() <em>Sgready State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgreadyStateLv1()
	 * @generated
	 * @ordered
	 */
	protected static final SGReadyStateLv1Type SGREADY_STATE_LV1_EDEFAULT = SGReadyStateLv1Type.HPNORMAL;

	/**
	 * The cached value of the '{@link #getSgreadyStateLv1() <em>Sgready State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgreadyStateLv1()
	 * @generated
	 * @ordered
	 */
	protected SGReadyStateLv1Type sgreadyStateLv1 = SGREADY_STATE_LV1_EDEFAULT;

	/**
	 * This is true if the Sgready State Lv1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgreadyStateLv1ESet;

	/**
	 * The default value of the '{@link #getSgrSunspStateCodes() <em>Sgr Sunsp State Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSunspStateCodes()
	 * @generated
	 * @ordered
	 */
	protected static final SGrSunspStateCodesType SGR_SUNSP_STATE_CODES_EDEFAULT = SGrSunspStateCodesType.ISTATUSOFF;

	/**
	 * The cached value of the '{@link #getSgrSunspStateCodes() <em>Sgr Sunsp State Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSunspStateCodes()
	 * @generated
	 * @ordered
	 */
	protected SGrSunspStateCodesType sgrSunspStateCodes = SGR_SUNSP_STATE_CODES_EDEFAULT;

	/**
	 * This is true if the Sgr Sunsp State Codes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrSunspStateCodesESet;

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
	protected static final SGrEVSEStateLv1Type SGR_EVSE_STATE_LV1_EDEFAULT = SGrEVSEStateLv1Type.EVNORMAL;

	/**
	 * The cached value of the '{@link #getSgrEVSEStateLv1() <em>Sgr EVSE State Lv1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVSEStateLv1()
	 * @generated
	 * @ordered
	 */
	protected SGrEVSEStateLv1Type sgrEVSEStateLv1 = SGR_EVSE_STATE_LV1_EDEFAULT;

	/**
	 * This is true if the Sgr EVSE State Lv1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrEVSEStateLv1ESet;

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
	 * The default value of the '{@link #getSgrEVState() <em>Sgr EV State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVState()
	 * @generated
	 * @ordered
	 */
	protected static final SGrEVStateType SGR_EV_STATE_EDEFAULT = SGrEVStateType.EVSTATEUNDEF;

	/**
	 * The cached value of the '{@link #getSgrEVState() <em>Sgr EV State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrEVState()
	 * @generated
	 * @ordered
	 */
	protected SGrEVStateType sgrEVState = SGR_EV_STATE_EDEFAULT;

	/**
	 * This is true if the Sgr EV State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrEVStateESet;

	/**
	 * The default value of the '{@link #getSgrSGCPService() <em>Sgr SGCP Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSGCPService()
	 * @generated
	 * @ordered
	 */
	protected static final SGrSGCPServiceType SGR_SGCP_SERVICE_EDEFAULT = SGrSGCPServiceType.AT_NET_SERVICABLE;

	/**
	 * The cached value of the '{@link #getSgrSGCPService() <em>Sgr SGCP Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrSGCPService()
	 * @generated
	 * @ordered
	 */
	protected SGrSGCPServiceType sgrSGCPService = SGR_SGCP_SERVICE_EDEFAULT;

	/**
	 * This is true if the Sgr SGCP Service attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrSGCPServiceESet;

	/**
	 * The default value of the '{@link #getSgrObligLvl() <em>Sgr Oblig Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrObligLvl()
	 * @generated
	 * @ordered
	 */
	protected static final SGrObligLvlType SGR_OBLIG_LVL_EDEFAULT = SGrObligLvlType.OLSHALL;

	/**
	 * The cached value of the '{@link #getSgrObligLvl() <em>Sgr Oblig Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrObligLvl()
	 * @generated
	 * @ordered
	 */
	protected SGrObligLvlType sgrObligLvl = SGR_OBLIG_LVL_EDEFAULT;

	/**
	 * This is true if the Sgr Oblig Lvl attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrObligLvlESet;

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
	public SGrMeasValueStateType getSgrMeasValueState() {
		return sgrMeasValueState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrMeasValueState(SGrMeasValueStateType newSgrMeasValueState) {
		SGrMeasValueStateType oldSgrMeasValueState = sgrMeasValueState;
		sgrMeasValueState = newSgrMeasValueState == null ? SGR_MEAS_VALUE_STATE_EDEFAULT : newSgrMeasValueState;
		boolean oldSgrMeasValueStateESet = sgrMeasValueStateESet;
		sgrMeasValueStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_STATE, oldSgrMeasValueState, sgrMeasValueState, !oldSgrMeasValueStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrMeasValueState() {
		SGrMeasValueStateType oldSgrMeasValueState = sgrMeasValueState;
		boolean oldSgrMeasValueStateESet = sgrMeasValueStateESet;
		sgrMeasValueState = SGR_MEAS_VALUE_STATE_EDEFAULT;
		sgrMeasValueStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_STATE, oldSgrMeasValueState, SGR_MEAS_VALUE_STATE_EDEFAULT, oldSgrMeasValueStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrMeasValueState() {
		return sgrMeasValueStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrMeasValueTendencyType getSgrMeasValueTendency() {
		return sgrMeasValueTendency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrMeasValueTendency(SGrMeasValueTendencyType newSgrMeasValueTendency) {
		SGrMeasValueTendencyType oldSgrMeasValueTendency = sgrMeasValueTendency;
		sgrMeasValueTendency = newSgrMeasValueTendency == null ? SGR_MEAS_VALUE_TENDENCY_EDEFAULT : newSgrMeasValueTendency;
		boolean oldSgrMeasValueTendencyESet = sgrMeasValueTendencyESet;
		sgrMeasValueTendencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_TENDENCY, oldSgrMeasValueTendency, sgrMeasValueTendency, !oldSgrMeasValueTendencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrMeasValueTendency() {
		SGrMeasValueTendencyType oldSgrMeasValueTendency = sgrMeasValueTendency;
		boolean oldSgrMeasValueTendencyESet = sgrMeasValueTendencyESet;
		sgrMeasValueTendency = SGR_MEAS_VALUE_TENDENCY_EDEFAULT;
		sgrMeasValueTendencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_TENDENCY, oldSgrMeasValueTendency, SGR_MEAS_VALUE_TENDENCY_EDEFAULT, oldSgrMeasValueTendencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrMeasValueTendency() {
		return sgrMeasValueTendencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrMeasValueSourceType getSgrMeasValueSource() {
		return sgrMeasValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrMeasValueSource(SGrMeasValueSourceType newSgrMeasValueSource) {
		SGrMeasValueSourceType oldSgrMeasValueSource = sgrMeasValueSource;
		sgrMeasValueSource = newSgrMeasValueSource == null ? SGR_MEAS_VALUE_SOURCE_EDEFAULT : newSgrMeasValueSource;
		boolean oldSgrMeasValueSourceESet = sgrMeasValueSourceESet;
		sgrMeasValueSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE, oldSgrMeasValueSource, sgrMeasValueSource, !oldSgrMeasValueSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrMeasValueSource() {
		SGrMeasValueSourceType oldSgrMeasValueSource = sgrMeasValueSource;
		boolean oldSgrMeasValueSourceESet = sgrMeasValueSourceESet;
		sgrMeasValueSource = SGR_MEAS_VALUE_SOURCE_EDEFAULT;
		sgrMeasValueSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE, oldSgrMeasValueSource, SGR_MEAS_VALUE_SOURCE_EDEFAULT, oldSgrMeasValueSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrMeasValueSource() {
		return sgrMeasValueSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrPowerSourceType getSgrPowerSource() {
		return sgrPowerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrPowerSource(SGrPowerSourceType newSgrPowerSource) {
		SGrPowerSourceType oldSgrPowerSource = sgrPowerSource;
		sgrPowerSource = newSgrPowerSource == null ? SGR_POWER_SOURCE_EDEFAULT : newSgrPowerSource;
		boolean oldSgrPowerSourceESet = sgrPowerSourceESet;
		sgrPowerSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE, oldSgrPowerSource, sgrPowerSource, !oldSgrPowerSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrPowerSource() {
		SGrPowerSourceType oldSgrPowerSource = sgrPowerSource;
		boolean oldSgrPowerSourceESet = sgrPowerSourceESet;
		sgrPowerSource = SGR_POWER_SOURCE_EDEFAULT;
		sgrPowerSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE, oldSgrPowerSource, SGR_POWER_SOURCE_EDEFAULT, oldSgrPowerSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrPowerSource() {
		return sgrPowerSourceESet;
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
	public SGReadyStateLv1Type getSgreadyStateLv1() {
		return sgreadyStateLv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgreadyStateLv1(SGReadyStateLv1Type newSgreadyStateLv1) {
		SGReadyStateLv1Type oldSgreadyStateLv1 = sgreadyStateLv1;
		sgreadyStateLv1 = newSgreadyStateLv1 == null ? SGREADY_STATE_LV1_EDEFAULT : newSgreadyStateLv1;
		boolean oldSgreadyStateLv1ESet = sgreadyStateLv1ESet;
		sgreadyStateLv1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1, oldSgreadyStateLv1, sgreadyStateLv1, !oldSgreadyStateLv1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgreadyStateLv1() {
		SGReadyStateLv1Type oldSgreadyStateLv1 = sgreadyStateLv1;
		boolean oldSgreadyStateLv1ESet = sgreadyStateLv1ESet;
		sgreadyStateLv1 = SGREADY_STATE_LV1_EDEFAULT;
		sgreadyStateLv1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1, oldSgreadyStateLv1, SGREADY_STATE_LV1_EDEFAULT, oldSgreadyStateLv1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgreadyStateLv1() {
		return sgreadyStateLv1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSunspStateCodesType getSgrSunspStateCodes() {
		return sgrSunspStateCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrSunspStateCodes(SGrSunspStateCodesType newSgrSunspStateCodes) {
		SGrSunspStateCodesType oldSgrSunspStateCodes = sgrSunspStateCodes;
		sgrSunspStateCodes = newSgrSunspStateCodes == null ? SGR_SUNSP_STATE_CODES_EDEFAULT : newSgrSunspStateCodes;
		boolean oldSgrSunspStateCodesESet = sgrSunspStateCodesESet;
		sgrSunspStateCodesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES, oldSgrSunspStateCodes, sgrSunspStateCodes, !oldSgrSunspStateCodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrSunspStateCodes() {
		SGrSunspStateCodesType oldSgrSunspStateCodes = sgrSunspStateCodes;
		boolean oldSgrSunspStateCodesESet = sgrSunspStateCodesESet;
		sgrSunspStateCodes = SGR_SUNSP_STATE_CODES_EDEFAULT;
		sgrSunspStateCodesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES, oldSgrSunspStateCodes, SGR_SUNSP_STATE_CODES_EDEFAULT, oldSgrSunspStateCodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrSunspStateCodes() {
		return sgrSunspStateCodesESet;
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
	public SGrEVSEStateLv1Type getSgrEVSEStateLv1() {
		return sgrEVSEStateLv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrEVSEStateLv1(SGrEVSEStateLv1Type newSgrEVSEStateLv1) {
		SGrEVSEStateLv1Type oldSgrEVSEStateLv1 = sgrEVSEStateLv1;
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
		SGrEVSEStateLv1Type oldSgrEVSEStateLv1 = sgrEVSEStateLv1;
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
	public SGrEVStateType getSgrEVState() {
		return sgrEVState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrEVState(SGrEVStateType newSgrEVState) {
		SGrEVStateType oldSgrEVState = sgrEVState;
		sgrEVState = newSgrEVState == null ? SGR_EV_STATE_EDEFAULT : newSgrEVState;
		boolean oldSgrEVStateESet = sgrEVStateESet;
		sgrEVStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_EV_STATE, oldSgrEVState, sgrEVState, !oldSgrEVStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrEVState() {
		SGrEVStateType oldSgrEVState = sgrEVState;
		boolean oldSgrEVStateESet = sgrEVStateESet;
		sgrEVState = SGR_EV_STATE_EDEFAULT;
		sgrEVStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_EV_STATE, oldSgrEVState, SGR_EV_STATE_EDEFAULT, oldSgrEVStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrEVState() {
		return sgrEVStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrSGCPServiceType getSgrSGCPService() {
		return sgrSGCPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrSGCPService(SGrSGCPServiceType newSgrSGCPService) {
		SGrSGCPServiceType oldSgrSGCPService = sgrSGCPService;
		sgrSGCPService = newSgrSGCPService == null ? SGR_SGCP_SERVICE_EDEFAULT : newSgrSGCPService;
		boolean oldSgrSGCPServiceESet = sgrSGCPServiceESet;
		sgrSGCPServiceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE, oldSgrSGCPService, sgrSGCPService, !oldSgrSGCPServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrSGCPService() {
		SGrSGCPServiceType oldSgrSGCPService = sgrSGCPService;
		boolean oldSgrSGCPServiceESet = sgrSGCPServiceESet;
		sgrSGCPService = SGR_SGCP_SERVICE_EDEFAULT;
		sgrSGCPServiceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE, oldSgrSGCPService, SGR_SGCP_SERVICE_EDEFAULT, oldSgrSGCPServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrSGCPService() {
		return sgrSGCPServiceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrObligLvlType getSgrObligLvl() {
		return sgrObligLvl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSgrObligLvl(SGrObligLvlType newSgrObligLvl) {
		SGrObligLvlType oldSgrObligLvl = sgrObligLvl;
		sgrObligLvl = newSgrObligLvl == null ? SGR_OBLIG_LVL_EDEFAULT : newSgrObligLvl;
		boolean oldSgrObligLvlESet = sgrObligLvlESet;
		sgrObligLvlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL, oldSgrObligLvl, sgrObligLvl, !oldSgrObligLvlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSgrObligLvl() {
		SGrObligLvlType oldSgrObligLvl = sgrObligLvl;
		boolean oldSgrObligLvlESet = sgrObligLvlESet;
		sgrObligLvl = SGR_OBLIG_LVL_EDEFAULT;
		sgrObligLvlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL, oldSgrObligLvl, SGR_OBLIG_LVL_EDEFAULT, oldSgrObligLvlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSgrObligLvl() {
		return sgrObligLvlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_STATE:
				return getSgrMeasValueState();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_TENDENCY:
				return getSgrMeasValueTendency();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE:
				return getSgrMeasValueSource();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE:
				return getSgrPowerSource();
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				return getSgreadyStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1:
				return getSgreadyStateLv1();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES:
				return getSgrSunspStateCodes();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				return getSgrEVSEStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				return getSgrEVSEStateLv1();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				return getSgrSGCPLoadStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				return getSgrSGCPFeedInStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EV_STATE:
				return getSgrEVState();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE:
				return getSgrSGCPService();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL:
				return getSgrObligLvl();
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_STATE:
				setSgrMeasValueState((SGrMeasValueStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_TENDENCY:
				setSgrMeasValueTendency((SGrMeasValueTendencyType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE:
				setSgrMeasValueSource((SGrMeasValueSourceType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE:
				setSgrPowerSource((SGrPowerSourceType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				setSgreadyStateLv2((SGReadyStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1:
				setSgreadyStateLv1((SGReadyStateLv1Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES:
				setSgrSunspStateCodes((SGrSunspStateCodesType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				setSgrEVSEStateLv2((SGrEVSEStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				setSgrEVSEStateLv1((SGrEVSEStateLv1Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				setSgrSGCPLoadStateLv2((SGrSGCPLoadStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				setSgrSGCPFeedInStateLv2((SGrSGCPFeedInStateLv2Type)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EV_STATE:
				setSgrEVState((SGrEVStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE:
				setSgrSGCPService((SGrSGCPServiceType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL:
				setSgrObligLvl((SGrObligLvlType)newValue);
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_STATE:
				unsetSgrMeasValueState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_TENDENCY:
				unsetSgrMeasValueTendency();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE:
				unsetSgrMeasValueSource();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE:
				unsetSgrPowerSource();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				unsetSgreadyStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1:
				unsetSgreadyStateLv1();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES:
				unsetSgrSunspStateCodes();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				unsetSgrEVSEStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				unsetSgrEVSEStateLv1();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				unsetSgrSGCPLoadStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				unsetSgrSGCPFeedInStateLv2();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EV_STATE:
				unsetSgrEVState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE:
				unsetSgrSGCPService();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL:
				unsetSgrObligLvl();
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_STATE:
				return isSetSgrMeasValueState();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_TENDENCY:
				return isSetSgrMeasValueTendency();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_MEAS_VALUE_SOURCE:
				return isSetSgrMeasValueSource();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_POWER_SOURCE:
				return isSetSgrPowerSource();
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV2:
				return isSetSgreadyStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGREADY_STATE_LV1:
				return isSetSgreadyStateLv1();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SUNSP_STATE_CODES:
				return isSetSgrSunspStateCodes();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV2:
				return isSetSgrEVSEStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EVSE_STATE_LV1:
				return isSetSgrEVSEStateLv1();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_LOAD_STATE_LV2:
				return isSetSgrSGCPLoadStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_FEED_IN_STATE_LV2:
				return isSetSgrSGCPFeedInStateLv2();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_EV_STATE:
				return isSetSgrEVState();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_SGCP_SERVICE:
				return isSetSgrSGCPService();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OBLIG_LVL:
				return isSetSgrObligLvl();
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
		result.append(" (sgrMeasValueState: ");
		if (sgrMeasValueStateESet) result.append(sgrMeasValueState); else result.append("<unset>");
		result.append(", sgrMeasValueTendency: ");
		if (sgrMeasValueTendencyESet) result.append(sgrMeasValueTendency); else result.append("<unset>");
		result.append(", sgrMeasValueSource: ");
		if (sgrMeasValueSourceESet) result.append(sgrMeasValueSource); else result.append("<unset>");
		result.append(", sgrPowerSource: ");
		if (sgrPowerSourceESet) result.append(sgrPowerSource); else result.append("<unset>");
		result.append(", sgreadyStateLv2: ");
		if (sgreadyStateLv2ESet) result.append(sgreadyStateLv2); else result.append("<unset>");
		result.append(", sgreadyStateLv1: ");
		if (sgreadyStateLv1ESet) result.append(sgreadyStateLv1); else result.append("<unset>");
		result.append(", sgrSunspStateCodes: ");
		if (sgrSunspStateCodesESet) result.append(sgrSunspStateCodes); else result.append("<unset>");
		result.append(", sgrEVSEStateLv2: ");
		if (sgrEVSEStateLv2ESet) result.append(sgrEVSEStateLv2); else result.append("<unset>");
		result.append(", sgrEVSEStateLv1: ");
		if (sgrEVSEStateLv1ESet) result.append(sgrEVSEStateLv1); else result.append("<unset>");
		result.append(", sgrSGCPLoadStateLv2: ");
		if (sgrSGCPLoadStateLv2ESet) result.append(sgrSGCPLoadStateLv2); else result.append("<unset>");
		result.append(", sgrSGCPFeedInStateLv2: ");
		if (sgrSGCPFeedInStateLv2ESet) result.append(sgrSGCPFeedInStateLv2); else result.append("<unset>");
		result.append(", sgrEVState: ");
		if (sgrEVStateESet) result.append(sgrEVState); else result.append("<unset>");
		result.append(", sgrSGCPService: ");
		if (sgrSGCPServiceESet) result.append(sgrSGCPService); else result.append("<unset>");
		result.append(", sgrObligLvl: ");
		if (sgrObligLvlESet) result.append(sgrObligLvl); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrEnumListTypeImpl
