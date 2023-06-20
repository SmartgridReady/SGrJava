/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.CtaDomHotWOpModeType;
import com.smartgridready.ns.v0.CtaHCOpModeType;
import com.smartgridready.ns.v0.CtaHPOpModeType;
import com.smartgridready.ns.v0.CtaHPOpStateType;
import com.smartgridready.ns.v0.HovBufferStateType;
import com.smartgridready.ns.v0.HovDomHotWOpModeType;
import com.smartgridready.ns.v0.HovDomHotWStateType;
import com.smartgridready.ns.v0.HovHCOpModeType;
import com.smartgridready.ns.v0.HovHCOpStateType;
import com.smartgridready.ns.v0.HovHPOpModeType;
import com.smartgridready.ns.v0.HovHPOpStateType;
import com.smartgridready.ns.v0.HovSGReadySrcSelType;
import com.smartgridready.ns.v0.SGReadyStateLv1Type;
import com.smartgridready.ns.v0.SGReadyStateLv2Type;
import com.smartgridready.ns.v0.SGrEVSEStateLv1Type;
import com.smartgridready.ns.v0.SGrEVSEStateLv2Type;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.SGrHCOpModeType;
import com.smartgridready.ns.v0.SGrHPOpModeType;
import com.smartgridready.ns.v0.SGrMeasValueSourceType;
import com.smartgridready.ns.v0.SGrOCPPStateType;
import com.smartgridready.ns.v0.SGrObligLvlType;
import com.smartgridready.ns.v0.SGrPowerSourceType;
import com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPServiceType;
import com.smartgridready.ns.v0.SGrSunspStateCodesType;
import com.smartgridready.ns.v0.V0Package;

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
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrMeasValueSource <em>Sgr Meas Value Source</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrPowerSource <em>Sgr Power Source</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgreadyStateLv2 <em>Sgready State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgreadyStateLv1 <em>Sgready State Lv1</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrSunspStateCodes <em>Sgr Sunsp State Codes</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrEVSEStateLv2 <em>Sgr EVSE State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrEVSEStateLv1 <em>Sgr EVSE State Lv1</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrSGCPLoadStateLv2 <em>Sgr SGCP Load State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrSGCPFeedInStateLv2 <em>Sgr SGCP Feed In State Lv2</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrEVState <em>Sgr EV State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrSGCPService <em>Sgr SGCP Service</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrObligLvl <em>Sgr Oblig Lvl</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrOCPPState <em>Sgr OCPP State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrHPOpMode <em>Sgr HP Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getSgrHCOpMode <em>Sgr HC Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getCtaDomHotWOpMode <em>Cta Dom Hot WOp Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getCtaHPOpState <em>Cta HP Op State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getCtaHPOpMode <em>Cta HP Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getCtaHCOpMode <em>Cta HC Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovHPOpMode <em>Hov HP Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovHCOpMode <em>Hov HC Op Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovSGReadySrcSel <em>Hov SG Ready Src Sel</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovBufferState <em>Hov Buffer State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovHCOpState <em>Hov HC Op State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovDomHotWOpMode <em>Hov Dom Hot WOp Mode</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovDomHotWState <em>Hov Dom Hot WState</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.impl.SGrEnumListTypeImpl#getHovHPOpState <em>Hov HP Op State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrEnumListTypeImpl extends MinimalEObjectImpl.Container implements SGrEnumListType {
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
	protected static final SGReadyStateLv2Type SGREADY_STATE_LV2_EDEFAULT = SGReadyStateLv2Type.HPNULL;

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
	protected static final SGrEVStateType SGR_EV_STATE_EDEFAULT = SGrEVStateType.EVSTATENULL;

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
	 * The default value of the '{@link #getSgrOCPPState() <em>Sgr OCPP State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrOCPPState()
	 * @generated
	 * @ordered
	 */
	protected static final SGrOCPPStateType SGR_OCPP_STATE_EDEFAULT = SGrOCPPStateType.AVAILABLE;

	/**
	 * The cached value of the '{@link #getSgrOCPPState() <em>Sgr OCPP State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrOCPPState()
	 * @generated
	 * @ordered
	 */
	protected SGrOCPPStateType sgrOCPPState = SGR_OCPP_STATE_EDEFAULT;

	/**
	 * This is true if the Sgr OCPP State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrOCPPStateESet;

	/**
	 * The default value of the '{@link #getSgrHPOpMode() <em>Sgr HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHPOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final SGrHPOpModeType SGR_HP_OP_MODE_EDEFAULT = SGrHPOpModeType.WPEMERGOP;

	/**
	 * The cached value of the '{@link #getSgrHPOpMode() <em>Sgr HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHPOpMode()
	 * @generated
	 * @ordered
	 */
	protected SGrHPOpModeType sgrHPOpMode = SGR_HP_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Sgr HP Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrHPOpModeESet;

	/**
	 * The default value of the '{@link #getSgrHCOpMode() <em>Sgr HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHCOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final SGrHCOpModeType SGR_HC_OP_MODE_EDEFAULT = SGrHCOpModeType.HCOFF;

	/**
	 * The cached value of the '{@link #getSgrHCOpMode() <em>Sgr HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgrHCOpMode()
	 * @generated
	 * @ordered
	 */
	protected SGrHCOpModeType sgrHCOpMode = SGR_HC_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Sgr HC Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sgrHCOpModeESet;

	/**
	 * The default value of the '{@link #getCtaDomHotWOpMode() <em>Cta Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaDomHotWOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final CtaDomHotWOpModeType CTA_DOM_HOT_WOP_MODE_EDEFAULT = CtaDomHotWOpModeType.DHWNULL;

	/**
	 * The cached value of the '{@link #getCtaDomHotWOpMode() <em>Cta Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaDomHotWOpMode()
	 * @generated
	 * @ordered
	 */
	protected CtaDomHotWOpModeType ctaDomHotWOpMode = CTA_DOM_HOT_WOP_MODE_EDEFAULT;

	/**
	 * This is true if the Cta Dom Hot WOp Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctaDomHotWOpModeESet;

	/**
	 * The default value of the '{@link #getCtaHPOpState() <em>Cta HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaHPOpState()
	 * @generated
	 * @ordered
	 */
	protected static final CtaHPOpStateType CTA_HP_OP_STATE_EDEFAULT = CtaHPOpStateType.HPNULL;

	/**
	 * The cached value of the '{@link #getCtaHPOpState() <em>Cta HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaHPOpState()
	 * @generated
	 * @ordered
	 */
	protected CtaHPOpStateType ctaHPOpState = CTA_HP_OP_STATE_EDEFAULT;

	/**
	 * This is true if the Cta HP Op State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctaHPOpStateESet;

	/**
	 * The default value of the '{@link #getCtaHPOpMode() <em>Cta HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaHPOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final CtaHPOpModeType CTA_HP_OP_MODE_EDEFAULT = CtaHPOpModeType.HPNULL;

	/**
	 * The cached value of the '{@link #getCtaHPOpMode() <em>Cta HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaHPOpMode()
	 * @generated
	 * @ordered
	 */
	protected CtaHPOpModeType ctaHPOpMode = CTA_HP_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Cta HP Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctaHPOpModeESet;

	/**
	 * The default value of the '{@link #getCtaHCOpMode() <em>Cta HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaHCOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final CtaHCOpModeType CTA_HC_OP_MODE_EDEFAULT = CtaHCOpModeType.HPNULL;

	/**
	 * The cached value of the '{@link #getCtaHCOpMode() <em>Cta HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtaHCOpMode()
	 * @generated
	 * @ordered
	 */
	protected CtaHCOpModeType ctaHCOpMode = CTA_HC_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Cta HC Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctaHCOpModeESet;

	/**
	 * The default value of the '{@link #getHovHPOpMode() <em>Hov HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHPOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final HovHPOpModeType HOV_HP_OP_MODE_EDEFAULT = HovHPOpModeType.HPOFF;

	/**
	 * The cached value of the '{@link #getHovHPOpMode() <em>Hov HP Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHPOpMode()
	 * @generated
	 * @ordered
	 */
	protected HovHPOpModeType hovHPOpMode = HOV_HP_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Hov HP Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovHPOpModeESet;

	/**
	 * The default value of the '{@link #getHovHCOpMode() <em>Hov HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHCOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final HovHCOpModeType HOV_HC_OP_MODE_EDEFAULT = HovHCOpModeType.HCSTANDBY;

	/**
	 * The cached value of the '{@link #getHovHCOpMode() <em>Hov HC Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHCOpMode()
	 * @generated
	 * @ordered
	 */
	protected HovHCOpModeType hovHCOpMode = HOV_HC_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Hov HC Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovHCOpModeESet;

	/**
	 * The default value of the '{@link #getHovSGReadySrcSel() <em>Hov SG Ready Src Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovSGReadySrcSel()
	 * @generated
	 * @ordered
	 */
	protected static final HovSGReadySrcSelType HOV_SG_READY_SRC_SEL_EDEFAULT = HovSGReadySrcSelType.SGR_SRC_OFF;

	/**
	 * The cached value of the '{@link #getHovSGReadySrcSel() <em>Hov SG Ready Src Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovSGReadySrcSel()
	 * @generated
	 * @ordered
	 */
	protected HovSGReadySrcSelType hovSGReadySrcSel = HOV_SG_READY_SRC_SEL_EDEFAULT;

	/**
	 * This is true if the Hov SG Ready Src Sel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovSGReadySrcSelESet;

	/**
	 * The default value of the '{@link #getHovBufferState() <em>Hov Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovBufferState()
	 * @generated
	 * @ordered
	 */
	protected static final HovBufferStateType HOV_BUFFER_STATE_EDEFAULT = HovBufferStateType.BUFOFF;

	/**
	 * The cached value of the '{@link #getHovBufferState() <em>Hov Buffer State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovBufferState()
	 * @generated
	 * @ordered
	 */
	protected HovBufferStateType hovBufferState = HOV_BUFFER_STATE_EDEFAULT;

	/**
	 * This is true if the Hov Buffer State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovBufferStateESet;

	/**
	 * The default value of the '{@link #getHovHCOpState() <em>Hov HC Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHCOpState()
	 * @generated
	 * @ordered
	 */
	protected static final HovHCOpStateType HOV_HC_OP_STATE_EDEFAULT = HovHCOpStateType.HCOFF;

	/**
	 * The cached value of the '{@link #getHovHCOpState() <em>Hov HC Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHCOpState()
	 * @generated
	 * @ordered
	 */
	protected HovHCOpStateType hovHCOpState = HOV_HC_OP_STATE_EDEFAULT;

	/**
	 * This is true if the Hov HC Op State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovHCOpStateESet;

	/**
	 * The default value of the '{@link #getHovDomHotWOpMode() <em>Hov Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovDomHotWOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final HovDomHotWOpModeType HOV_DOM_HOT_WOP_MODE_EDEFAULT = HovDomHotWOpModeType.DHWSTANDBY;

	/**
	 * The cached value of the '{@link #getHovDomHotWOpMode() <em>Hov Dom Hot WOp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovDomHotWOpMode()
	 * @generated
	 * @ordered
	 */
	protected HovDomHotWOpModeType hovDomHotWOpMode = HOV_DOM_HOT_WOP_MODE_EDEFAULT;

	/**
	 * This is true if the Hov Dom Hot WOp Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovDomHotWOpModeESet;

	/**
	 * The default value of the '{@link #getHovDomHotWState() <em>Hov Dom Hot WState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovDomHotWState()
	 * @generated
	 * @ordered
	 */
	protected static final HovDomHotWStateType HOV_DOM_HOT_WSTATE_EDEFAULT = HovDomHotWStateType.DHWOFF;

	/**
	 * The cached value of the '{@link #getHovDomHotWState() <em>Hov Dom Hot WState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovDomHotWState()
	 * @generated
	 * @ordered
	 */
	protected HovDomHotWStateType hovDomHotWState = HOV_DOM_HOT_WSTATE_EDEFAULT;

	/**
	 * This is true if the Hov Dom Hot WState attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovDomHotWStateESet;

	/**
	 * The default value of the '{@link #getHovHPOpState() <em>Hov HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHPOpState()
	 * @generated
	 * @ordered
	 */
	protected static final HovHPOpStateType HOV_HP_OP_STATE_EDEFAULT = HovHPOpStateType.HPOFF;

	/**
	 * The cached value of the '{@link #getHovHPOpState() <em>Hov HP Op State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHovHPOpState()
	 * @generated
	 * @ordered
	 */
	protected HovHPOpStateType hovHPOpState = HOV_HP_OP_STATE_EDEFAULT;

	/**
	 * This is true if the Hov HP Op State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hovHPOpStateESet;

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
	public SGrMeasValueSourceType getSgrMeasValueSource() {
		return sgrMeasValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrMeasValueSource() {
		return sgrMeasValueSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrPowerSourceType getSgrPowerSource() {
		return sgrPowerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrPowerSource() {
		return sgrPowerSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGReadyStateLv2Type getSgreadyStateLv2() {
		return sgreadyStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgreadyStateLv2() {
		return sgreadyStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGReadyStateLv1Type getSgreadyStateLv1() {
		return sgreadyStateLv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgreadyStateLv1() {
		return sgreadyStateLv1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSunspStateCodesType getSgrSunspStateCodes() {
		return sgrSunspStateCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrSunspStateCodes() {
		return sgrSunspStateCodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVSEStateLv2Type getSgrEVSEStateLv2() {
		return sgrEVSEStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrEVSEStateLv2() {
		return sgrEVSEStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVSEStateLv1Type getSgrEVSEStateLv1() {
		return sgrEVSEStateLv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrEVSEStateLv1() {
		return sgrEVSEStateLv1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPLoadStateLv2Type getSgrSGCPLoadStateLv2() {
		return sgrSGCPLoadStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrSGCPLoadStateLv2() {
		return sgrSGCPLoadStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPFeedInStateLv2Type getSgrSGCPFeedInStateLv2() {
		return sgrSGCPFeedInStateLv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrSGCPFeedInStateLv2() {
		return sgrSGCPFeedInStateLv2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVStateType getSgrEVState() {
		return sgrEVState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrEVState() {
		return sgrEVStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPServiceType getSgrSGCPService() {
		return sgrSGCPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrSGCPService() {
		return sgrSGCPServiceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrObligLvlType getSgrObligLvl() {
		return sgrObligLvl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSetSgrObligLvl() {
		return sgrObligLvlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrOCPPStateType getSgrOCPPState() {
		return sgrOCPPState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgrOCPPState(SGrOCPPStateType newSgrOCPPState) {
		SGrOCPPStateType oldSgrOCPPState = sgrOCPPState;
		sgrOCPPState = newSgrOCPPState == null ? SGR_OCPP_STATE_EDEFAULT : newSgrOCPPState;
		boolean oldSgrOCPPStateESet = sgrOCPPStateESet;
		sgrOCPPStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE, oldSgrOCPPState, sgrOCPPState, !oldSgrOCPPStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSgrOCPPState() {
		SGrOCPPStateType oldSgrOCPPState = sgrOCPPState;
		boolean oldSgrOCPPStateESet = sgrOCPPStateESet;
		sgrOCPPState = SGR_OCPP_STATE_EDEFAULT;
		sgrOCPPStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE, oldSgrOCPPState, SGR_OCPP_STATE_EDEFAULT, oldSgrOCPPStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSgrOCPPState() {
		return sgrOCPPStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHPOpModeType getSgrHPOpMode() {
		return sgrHPOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgrHPOpMode(SGrHPOpModeType newSgrHPOpMode) {
		SGrHPOpModeType oldSgrHPOpMode = sgrHPOpMode;
		sgrHPOpMode = newSgrHPOpMode == null ? SGR_HP_OP_MODE_EDEFAULT : newSgrHPOpMode;
		boolean oldSgrHPOpModeESet = sgrHPOpModeESet;
		sgrHPOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE, oldSgrHPOpMode, sgrHPOpMode, !oldSgrHPOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSgrHPOpMode() {
		SGrHPOpModeType oldSgrHPOpMode = sgrHPOpMode;
		boolean oldSgrHPOpModeESet = sgrHPOpModeESet;
		sgrHPOpMode = SGR_HP_OP_MODE_EDEFAULT;
		sgrHPOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE, oldSgrHPOpMode, SGR_HP_OP_MODE_EDEFAULT, oldSgrHPOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSgrHPOpMode() {
		return sgrHPOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHCOpModeType getSgrHCOpMode() {
		return sgrHCOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgrHCOpMode(SGrHCOpModeType newSgrHCOpMode) {
		SGrHCOpModeType oldSgrHCOpMode = sgrHCOpMode;
		sgrHCOpMode = newSgrHCOpMode == null ? SGR_HC_OP_MODE_EDEFAULT : newSgrHCOpMode;
		boolean oldSgrHCOpModeESet = sgrHCOpModeESet;
		sgrHCOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE, oldSgrHCOpMode, sgrHCOpMode, !oldSgrHCOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSgrHCOpMode() {
		SGrHCOpModeType oldSgrHCOpMode = sgrHCOpMode;
		boolean oldSgrHCOpModeESet = sgrHCOpModeESet;
		sgrHCOpMode = SGR_HC_OP_MODE_EDEFAULT;
		sgrHCOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE, oldSgrHCOpMode, SGR_HC_OP_MODE_EDEFAULT, oldSgrHCOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSgrHCOpMode() {
		return sgrHCOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaDomHotWOpModeType getCtaDomHotWOpMode() {
		return ctaDomHotWOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtaDomHotWOpMode(CtaDomHotWOpModeType newCtaDomHotWOpMode) {
		CtaDomHotWOpModeType oldCtaDomHotWOpMode = ctaDomHotWOpMode;
		ctaDomHotWOpMode = newCtaDomHotWOpMode == null ? CTA_DOM_HOT_WOP_MODE_EDEFAULT : newCtaDomHotWOpMode;
		boolean oldCtaDomHotWOpModeESet = ctaDomHotWOpModeESet;
		ctaDomHotWOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__CTA_DOM_HOT_WOP_MODE, oldCtaDomHotWOpMode, ctaDomHotWOpMode, !oldCtaDomHotWOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCtaDomHotWOpMode() {
		CtaDomHotWOpModeType oldCtaDomHotWOpMode = ctaDomHotWOpMode;
		boolean oldCtaDomHotWOpModeESet = ctaDomHotWOpModeESet;
		ctaDomHotWOpMode = CTA_DOM_HOT_WOP_MODE_EDEFAULT;
		ctaDomHotWOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__CTA_DOM_HOT_WOP_MODE, oldCtaDomHotWOpMode, CTA_DOM_HOT_WOP_MODE_EDEFAULT, oldCtaDomHotWOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCtaDomHotWOpMode() {
		return ctaDomHotWOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHPOpStateType getCtaHPOpState() {
		return ctaHPOpState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtaHPOpState(CtaHPOpStateType newCtaHPOpState) {
		CtaHPOpStateType oldCtaHPOpState = ctaHPOpState;
		ctaHPOpState = newCtaHPOpState == null ? CTA_HP_OP_STATE_EDEFAULT : newCtaHPOpState;
		boolean oldCtaHPOpStateESet = ctaHPOpStateESet;
		ctaHPOpStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE, oldCtaHPOpState, ctaHPOpState, !oldCtaHPOpStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCtaHPOpState() {
		CtaHPOpStateType oldCtaHPOpState = ctaHPOpState;
		boolean oldCtaHPOpStateESet = ctaHPOpStateESet;
		ctaHPOpState = CTA_HP_OP_STATE_EDEFAULT;
		ctaHPOpStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE, oldCtaHPOpState, CTA_HP_OP_STATE_EDEFAULT, oldCtaHPOpStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCtaHPOpState() {
		return ctaHPOpStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHPOpModeType getCtaHPOpMode() {
		return ctaHPOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtaHPOpMode(CtaHPOpModeType newCtaHPOpMode) {
		CtaHPOpModeType oldCtaHPOpMode = ctaHPOpMode;
		ctaHPOpMode = newCtaHPOpMode == null ? CTA_HP_OP_MODE_EDEFAULT : newCtaHPOpMode;
		boolean oldCtaHPOpModeESet = ctaHPOpModeESet;
		ctaHPOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE, oldCtaHPOpMode, ctaHPOpMode, !oldCtaHPOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCtaHPOpMode() {
		CtaHPOpModeType oldCtaHPOpMode = ctaHPOpMode;
		boolean oldCtaHPOpModeESet = ctaHPOpModeESet;
		ctaHPOpMode = CTA_HP_OP_MODE_EDEFAULT;
		ctaHPOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE, oldCtaHPOpMode, CTA_HP_OP_MODE_EDEFAULT, oldCtaHPOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCtaHPOpMode() {
		return ctaHPOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHCOpModeType getCtaHCOpMode() {
		return ctaHCOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtaHCOpMode(CtaHCOpModeType newCtaHCOpMode) {
		CtaHCOpModeType oldCtaHCOpMode = ctaHCOpMode;
		ctaHCOpMode = newCtaHCOpMode == null ? CTA_HC_OP_MODE_EDEFAULT : newCtaHCOpMode;
		boolean oldCtaHCOpModeESet = ctaHCOpModeESet;
		ctaHCOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE, oldCtaHCOpMode, ctaHCOpMode, !oldCtaHCOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCtaHCOpMode() {
		CtaHCOpModeType oldCtaHCOpMode = ctaHCOpMode;
		boolean oldCtaHCOpModeESet = ctaHCOpModeESet;
		ctaHCOpMode = CTA_HC_OP_MODE_EDEFAULT;
		ctaHCOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE, oldCtaHCOpMode, CTA_HC_OP_MODE_EDEFAULT, oldCtaHCOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCtaHCOpMode() {
		return ctaHCOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPOpModeType getHovHPOpMode() {
		return hovHPOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovHPOpMode(HovHPOpModeType newHovHPOpMode) {
		HovHPOpModeType oldHovHPOpMode = hovHPOpMode;
		hovHPOpMode = newHovHPOpMode == null ? HOV_HP_OP_MODE_EDEFAULT : newHovHPOpMode;
		boolean oldHovHPOpModeESet = hovHPOpModeESet;
		hovHPOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE, oldHovHPOpMode, hovHPOpMode, !oldHovHPOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovHPOpMode() {
		HovHPOpModeType oldHovHPOpMode = hovHPOpMode;
		boolean oldHovHPOpModeESet = hovHPOpModeESet;
		hovHPOpMode = HOV_HP_OP_MODE_EDEFAULT;
		hovHPOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE, oldHovHPOpMode, HOV_HP_OP_MODE_EDEFAULT, oldHovHPOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovHPOpMode() {
		return hovHPOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHCOpModeType getHovHCOpMode() {
		return hovHCOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovHCOpMode(HovHCOpModeType newHovHCOpMode) {
		HovHCOpModeType oldHovHCOpMode = hovHCOpMode;
		hovHCOpMode = newHovHCOpMode == null ? HOV_HC_OP_MODE_EDEFAULT : newHovHCOpMode;
		boolean oldHovHCOpModeESet = hovHCOpModeESet;
		hovHCOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE, oldHovHCOpMode, hovHCOpMode, !oldHovHCOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovHCOpMode() {
		HovHCOpModeType oldHovHCOpMode = hovHCOpMode;
		boolean oldHovHCOpModeESet = hovHCOpModeESet;
		hovHCOpMode = HOV_HC_OP_MODE_EDEFAULT;
		hovHCOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE, oldHovHCOpMode, HOV_HC_OP_MODE_EDEFAULT, oldHovHCOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovHCOpMode() {
		return hovHCOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovSGReadySrcSelType getHovSGReadySrcSel() {
		return hovSGReadySrcSel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovSGReadySrcSel(HovSGReadySrcSelType newHovSGReadySrcSel) {
		HovSGReadySrcSelType oldHovSGReadySrcSel = hovSGReadySrcSel;
		hovSGReadySrcSel = newHovSGReadySrcSel == null ? HOV_SG_READY_SRC_SEL_EDEFAULT : newHovSGReadySrcSel;
		boolean oldHovSGReadySrcSelESet = hovSGReadySrcSelESet;
		hovSGReadySrcSelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL, oldHovSGReadySrcSel, hovSGReadySrcSel, !oldHovSGReadySrcSelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovSGReadySrcSel() {
		HovSGReadySrcSelType oldHovSGReadySrcSel = hovSGReadySrcSel;
		boolean oldHovSGReadySrcSelESet = hovSGReadySrcSelESet;
		hovSGReadySrcSel = HOV_SG_READY_SRC_SEL_EDEFAULT;
		hovSGReadySrcSelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL, oldHovSGReadySrcSel, HOV_SG_READY_SRC_SEL_EDEFAULT, oldHovSGReadySrcSelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovSGReadySrcSel() {
		return hovSGReadySrcSelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovBufferStateType getHovBufferState() {
		return hovBufferState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovBufferState(HovBufferStateType newHovBufferState) {
		HovBufferStateType oldHovBufferState = hovBufferState;
		hovBufferState = newHovBufferState == null ? HOV_BUFFER_STATE_EDEFAULT : newHovBufferState;
		boolean oldHovBufferStateESet = hovBufferStateESet;
		hovBufferStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE, oldHovBufferState, hovBufferState, !oldHovBufferStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovBufferState() {
		HovBufferStateType oldHovBufferState = hovBufferState;
		boolean oldHovBufferStateESet = hovBufferStateESet;
		hovBufferState = HOV_BUFFER_STATE_EDEFAULT;
		hovBufferStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE, oldHovBufferState, HOV_BUFFER_STATE_EDEFAULT, oldHovBufferStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovBufferState() {
		return hovBufferStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHCOpStateType getHovHCOpState() {
		return hovHCOpState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovHCOpState(HovHCOpStateType newHovHCOpState) {
		HovHCOpStateType oldHovHCOpState = hovHCOpState;
		hovHCOpState = newHovHCOpState == null ? HOV_HC_OP_STATE_EDEFAULT : newHovHCOpState;
		boolean oldHovHCOpStateESet = hovHCOpStateESet;
		hovHCOpStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE, oldHovHCOpState, hovHCOpState, !oldHovHCOpStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovHCOpState() {
		HovHCOpStateType oldHovHCOpState = hovHCOpState;
		boolean oldHovHCOpStateESet = hovHCOpStateESet;
		hovHCOpState = HOV_HC_OP_STATE_EDEFAULT;
		hovHCOpStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE, oldHovHCOpState, HOV_HC_OP_STATE_EDEFAULT, oldHovHCOpStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovHCOpState() {
		return hovHCOpStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovDomHotWOpModeType getHovDomHotWOpMode() {
		return hovDomHotWOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovDomHotWOpMode(HovDomHotWOpModeType newHovDomHotWOpMode) {
		HovDomHotWOpModeType oldHovDomHotWOpMode = hovDomHotWOpMode;
		hovDomHotWOpMode = newHovDomHotWOpMode == null ? HOV_DOM_HOT_WOP_MODE_EDEFAULT : newHovDomHotWOpMode;
		boolean oldHovDomHotWOpModeESet = hovDomHotWOpModeESet;
		hovDomHotWOpModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE, oldHovDomHotWOpMode, hovDomHotWOpMode, !oldHovDomHotWOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovDomHotWOpMode() {
		HovDomHotWOpModeType oldHovDomHotWOpMode = hovDomHotWOpMode;
		boolean oldHovDomHotWOpModeESet = hovDomHotWOpModeESet;
		hovDomHotWOpMode = HOV_DOM_HOT_WOP_MODE_EDEFAULT;
		hovDomHotWOpModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE, oldHovDomHotWOpMode, HOV_DOM_HOT_WOP_MODE_EDEFAULT, oldHovDomHotWOpModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovDomHotWOpMode() {
		return hovDomHotWOpModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovDomHotWStateType getHovDomHotWState() {
		return hovDomHotWState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovDomHotWState(HovDomHotWStateType newHovDomHotWState) {
		HovDomHotWStateType oldHovDomHotWState = hovDomHotWState;
		hovDomHotWState = newHovDomHotWState == null ? HOV_DOM_HOT_WSTATE_EDEFAULT : newHovDomHotWState;
		boolean oldHovDomHotWStateESet = hovDomHotWStateESet;
		hovDomHotWStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE, oldHovDomHotWState, hovDomHotWState, !oldHovDomHotWStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovDomHotWState() {
		HovDomHotWStateType oldHovDomHotWState = hovDomHotWState;
		boolean oldHovDomHotWStateESet = hovDomHotWStateESet;
		hovDomHotWState = HOV_DOM_HOT_WSTATE_EDEFAULT;
		hovDomHotWStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE, oldHovDomHotWState, HOV_DOM_HOT_WSTATE_EDEFAULT, oldHovDomHotWStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovDomHotWState() {
		return hovDomHotWStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPOpStateType getHovHPOpState() {
		return hovHPOpState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHovHPOpState(HovHPOpStateType newHovHPOpState) {
		HovHPOpStateType oldHovHPOpState = hovHPOpState;
		hovHPOpState = newHovHPOpState == null ? HOV_HP_OP_STATE_EDEFAULT : newHovHPOpState;
		boolean oldHovHPOpStateESet = hovHPOpStateESet;
		hovHPOpStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE, oldHovHPOpState, hovHPOpState, !oldHovHPOpStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHovHPOpState() {
		HovHPOpStateType oldHovHPOpState = hovHPOpState;
		boolean oldHovHPOpStateESet = hovHPOpStateESet;
		hovHPOpState = HOV_HP_OP_STATE_EDEFAULT;
		hovHPOpStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE, oldHovHPOpState, HOV_HP_OP_STATE_EDEFAULT, oldHovHPOpStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHovHPOpState() {
		return hovHPOpStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE:
				return getSgrOCPPState();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE:
				return getSgrHPOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE:
				return getSgrHCOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_DOM_HOT_WOP_MODE:
				return getCtaDomHotWOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE:
				return getCtaHPOpState();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE:
				return getCtaHPOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE:
				return getCtaHCOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE:
				return getHovHPOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE:
				return getHovHCOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL:
				return getHovSGReadySrcSel();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE:
				return getHovBufferState();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE:
				return getHovHCOpState();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE:
				return getHovDomHotWOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE:
				return getHovDomHotWState();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE:
				return getHovHPOpState();
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE:
				setSgrOCPPState((SGrOCPPStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE:
				setSgrHPOpMode((SGrHPOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE:
				setSgrHCOpMode((SGrHCOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_DOM_HOT_WOP_MODE:
				setCtaDomHotWOpMode((CtaDomHotWOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE:
				setCtaHPOpState((CtaHPOpStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE:
				setCtaHPOpMode((CtaHPOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE:
				setCtaHCOpMode((CtaHCOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE:
				setHovHPOpMode((HovHPOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE:
				setHovHCOpMode((HovHCOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL:
				setHovSGReadySrcSel((HovSGReadySrcSelType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE:
				setHovBufferState((HovBufferStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE:
				setHovHCOpState((HovHCOpStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE:
				setHovDomHotWOpMode((HovDomHotWOpModeType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE:
				setHovDomHotWState((HovDomHotWStateType)newValue);
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE:
				setHovHPOpState((HovHPOpStateType)newValue);
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE:
				unsetSgrOCPPState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE:
				unsetSgrHPOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE:
				unsetSgrHCOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_DOM_HOT_WOP_MODE:
				unsetCtaDomHotWOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE:
				unsetCtaHPOpState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE:
				unsetCtaHPOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE:
				unsetCtaHCOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE:
				unsetHovHPOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE:
				unsetHovHCOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL:
				unsetHovSGReadySrcSel();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE:
				unsetHovBufferState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE:
				unsetHovHCOpState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE:
				unsetHovDomHotWOpMode();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE:
				unsetHovDomHotWState();
				return;
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE:
				unsetHovHPOpState();
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
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_OCPP_STATE:
				return isSetSgrOCPPState();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HP_OP_MODE:
				return isSetSgrHPOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__SGR_HC_OP_MODE:
				return isSetSgrHCOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_DOM_HOT_WOP_MODE:
				return isSetCtaDomHotWOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_STATE:
				return isSetCtaHPOpState();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HP_OP_MODE:
				return isSetCtaHPOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__CTA_HC_OP_MODE:
				return isSetCtaHCOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_MODE:
				return isSetHovHPOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_MODE:
				return isSetHovHCOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_SG_READY_SRC_SEL:
				return isSetHovSGReadySrcSel();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_BUFFER_STATE:
				return isSetHovBufferState();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HC_OP_STATE:
				return isSetHovHCOpState();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WOP_MODE:
				return isSetHovDomHotWOpMode();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_DOM_HOT_WSTATE:
				return isSetHovDomHotWState();
			case V0Package.SGR_ENUM_LIST_TYPE__HOV_HP_OP_STATE:
				return isSetHovHPOpState();
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
		result.append(" (sgrMeasValueSource: ");
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
		result.append(", sgrOCPPState: ");
		if (sgrOCPPStateESet) result.append(sgrOCPPState); else result.append("<unset>");
		result.append(", sgrHPOpMode: ");
		if (sgrHPOpModeESet) result.append(sgrHPOpMode); else result.append("<unset>");
		result.append(", sgrHCOpMode: ");
		if (sgrHCOpModeESet) result.append(sgrHCOpMode); else result.append("<unset>");
		result.append(", ctaDomHotWOpMode: ");
		if (ctaDomHotWOpModeESet) result.append(ctaDomHotWOpMode); else result.append("<unset>");
		result.append(", ctaHPOpState: ");
		if (ctaHPOpStateESet) result.append(ctaHPOpState); else result.append("<unset>");
		result.append(", ctaHPOpMode: ");
		if (ctaHPOpModeESet) result.append(ctaHPOpMode); else result.append("<unset>");
		result.append(", ctaHCOpMode: ");
		if (ctaHCOpModeESet) result.append(ctaHCOpMode); else result.append("<unset>");
		result.append(", hovHPOpMode: ");
		if (hovHPOpModeESet) result.append(hovHPOpMode); else result.append("<unset>");
		result.append(", hovHCOpMode: ");
		if (hovHCOpModeESet) result.append(hovHCOpMode); else result.append("<unset>");
		result.append(", hovSGReadySrcSel: ");
		if (hovSGReadySrcSelESet) result.append(hovSGReadySrcSel); else result.append("<unset>");
		result.append(", hovBufferState: ");
		if (hovBufferStateESet) result.append(hovBufferState); else result.append("<unset>");
		result.append(", hovHCOpState: ");
		if (hovHCOpStateESet) result.append(hovHCOpState); else result.append("<unset>");
		result.append(", hovDomHotWOpMode: ");
		if (hovDomHotWOpModeESet) result.append(hovDomHotWOpMode); else result.append("<unset>");
		result.append(", hovDomHotWState: ");
		if (hovDomHotWStateESet) result.append(hovDomHotWState); else result.append("<unset>");
		result.append(", hovHPOpState: ");
		if (hovHPOpStateESet) result.append(hovHPOpState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrEnumListTypeImpl
