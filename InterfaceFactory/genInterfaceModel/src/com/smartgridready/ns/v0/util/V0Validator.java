/**
 */
package com.smartgridready.ns.v0.util;

import com.smartgridready.ns.v0.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package
 * @generated
 */
public class V0Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final V0Validator INSTANCE = new V0Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.smartgridready.ns.v0";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return V0Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case V0Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case V0Package.SGR_ATTR4_GENERIC_TYPE:
				return validateSGrAttr4GenericType((SGrAttr4GenericType)value, diagnostics, context);
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE:
				return validateSGrBasicGenDataPointTypeType((SGrBasicGenDataPointTypeType)value, diagnostics, context);
			case V0Package.SGR_BITMAPPER_LIST_TYPE:
				return validateSGrBitmapperListType((SGrBitmapperListType)value, diagnostics, context);
			case V0Package.SGR_CHANGE_LOG:
				return validateSGrChangeLog((SGrChangeLog)value, diagnostics, context);
			case V0Package.SGR_DATA_POINT_BASE_TYPE:
				return validateSGrDataPointBaseType((SGrDataPointBaseType)value, diagnostics, context);
			case V0Package.SGR_DATA_POINT_DESCRIPTION_TYPE:
				return validateSGrDataPointDescriptionType((SGrDataPointDescriptionType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_BASE_TYPE:
				return validateSGrDeviceBaseType((SGrDeviceBaseType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_PROFILE_TYPE:
				return validateSGrDeviceProfileType((SGrDeviceProfileType)value, diagnostics, context);
			case V0Package.SGR_ENUM_LIST_TYPE:
				return validateSGrEnumListType((SGrEnumListType)value, diagnostics, context);
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE:
				return validateSGrFlexAssistanceType((SGrFlexAssistanceType)value, diagnostics, context);
			case V0Package.SGR_FUNCTIONAL_PROFILE_BASE_TYPE:
				return validateSGrFunctionalProfileBaseType((SGrFunctionalProfileBaseType)value, diagnostics, context);
			case V0Package.SGR_GEN_DEVICE_FRAME:
				return validateSGrGenDeviceFrame((SGrGenDeviceFrame)value, diagnostics, context);
			case V0Package.SGR_GEN_FUNCTIONAL_PROFILE_TYPE:
				return validateSGrGenFunctionalProfileType((SGrGenFunctionalProfileType)value, diagnostics, context);
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE:
				return validateSGrLegibDocumentationType((SGrLegibDocumentationType)value, diagnostics, context);
			case V0Package.SGR_NAMELIST_TYPE:
				return validateSGrNamelistType((SGrNamelistType)value, diagnostics, context);
			case V0Package.SGR_PROFILE_DESCRIPTION_TYPE:
				return validateSGrProfileDescriptionType((SGrProfileDescriptionType)value, diagnostics, context);
			case V0Package.SGR_PROFILENUMBER_TYPE:
				return validateSGrProfilenumberType((SGrProfilenumberType)value, diagnostics, context);
			case V0Package.SGR_RELEASE_NOTES:
				return validateSGrReleaseNotes((SGrReleaseNotes)value, diagnostics, context);
			case V0Package.SGR_SCALING_TYPE:
				return validateSGrScalingType((SGrScalingType)value, diagnostics, context);
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE:
				return validateSGrSmoothTransitionType((SGrSmoothTransitionType)value, diagnostics, context);
			case V0Package.SGR_STABILITY_FALLBACK_TYPE:
				return validateSGrStabilityFallbackType((SGrStabilityFallbackType)value, diagnostics, context);
			case V0Package.SGR_VERSION_NUMBER_TYPE:
				return validateSGrVersionNumberType((SGrVersionNumberType)value, diagnostics, context);
			case V0Package.CTA_DOM_HOT_WOP_MODE_TYPE:
				return validateCtaDomHotWOpModeType((CtaDomHotWOpModeType)value, diagnostics, context);
			case V0Package.CTA_HC_OP_MODE_TYPE:
				return validateCtaHCOpModeType((CtaHCOpModeType)value, diagnostics, context);
			case V0Package.CTA_HP_OP_MODE_TYPE:
				return validateCtaHPOpModeType((CtaHPOpModeType)value, diagnostics, context);
			case V0Package.CTA_HP_OP_STATE_TYPE:
				return validateCtaHPOpStateType((CtaHPOpStateType)value, diagnostics, context);
			case V0Package.HOV_BUFFER_STATE_TYPE:
				return validateHovBufferStateType((HovBufferStateType)value, diagnostics, context);
			case V0Package.HOV_DOM_HOT_WOP_MODE_TYPE:
				return validateHovDomHotWOpModeType((HovDomHotWOpModeType)value, diagnostics, context);
			case V0Package.HOV_DOM_HOT_WSTATE_TYPE:
				return validateHovDomHotWStateType((HovDomHotWStateType)value, diagnostics, context);
			case V0Package.HOV_HC_OP_MODE_TYPE:
				return validateHovHCOpModeType((HovHCOpModeType)value, diagnostics, context);
			case V0Package.HOV_HC_OP_STATE_TYPE:
				return validateHovHCOpStateType((HovHCOpStateType)value, diagnostics, context);
			case V0Package.HOV_HP_ACT_BUFFER_STATE_TYPE:
				return validateHovHPActBufferStateType((HovHPActBufferStateType)value, diagnostics, context);
			case V0Package.HOV_HP_OP_MODE_TYPE:
				return validateHovHPOpModeType((HovHPOpModeType)value, diagnostics, context);
			case V0Package.HOV_HP_OP_STATE_TYPE:
				return validateHovHPOpStateType((HovHPOpStateType)value, diagnostics, context);
			case V0Package.HOV_SG_READY_SRC_SEL_TYPE:
				return validateHovSGReadySrcSelType((HovSGReadySrcSelType)value, diagnostics, context);
			case V0Package.HOV_TYPE:
				return validateHovType((HovType)value, diagnostics, context);
			case V0Package.LEVEL_OF_OPERATION_TYPE:
				return validateLevelOfOperationType((LevelOfOperationType)value, diagnostics, context);
			case V0Package.PROFILE_TYPE_ENUM_TYPE:
				return validateProfileTypeEnumType((ProfileTypeEnumType)value, diagnostics, context);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE:
				return validateSGrBool2BitRankType((SGrBool2BitRankType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_KIND_TYPE:
				return validateSGrDeviceKindType((SGrDeviceKindType)value, diagnostics, context);
			case V0Package.SG_READY_STATE_LV1_TYPE:
				return validateSGReadyStateLv1Type((SGReadyStateLv1Type)value, diagnostics, context);
			case V0Package.SG_READY_STATE_LV2_TYPE:
				return validateSGReadyStateLv2Type((SGReadyStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_EVSE_STATE_LV1_TYPE:
				return validateSGrEVSEStateLv1Type((SGrEVSEStateLv1Type)value, diagnostics, context);
			case V0Package.SGR_EVSE_STATE_LV2_TYPE:
				return validateSGrEVSEStateLv2Type((SGrEVSEStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_EV_STATE_TYPE:
				return validateSGrEVStateType((SGrEVStateType)value, diagnostics, context);
			case V0Package.SGR_HC_OP_MODE_TYPE:
				return validateSGrHCOpModeType((SGrHCOpModeType)value, diagnostics, context);
			case V0Package.SGR_HC_OP_STATE_TYPE:
				return validateSgrHCOpStateType((SgrHCOpStateType)value, diagnostics, context);
			case V0Package.SGR_HP_OP_MODE_TYPE:
				return validateSGrHPOpModeType((SGrHPOpModeType)value, diagnostics, context);
			case V0Package.SGR_HP_OPSTATE_TYPE:
				return validateSGrHPOpstateType((SGrHPOpstateType)value, diagnostics, context);
			case V0Package.SGR_LANGUAGE_TYPE:
				return validateSGrLanguageType((SGrLanguageType)value, diagnostics, context);
			case V0Package.SGR_MANUFACTURER_ID_TYPE:
				return validateSGrManufacturerIDType((SGrManufacturerIDType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE:
				return validateSGrMeasValueSourceType((SGrMeasValueSourceType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_TYPE:
				return validateSGrMeasValueType((SGrMeasValueType)value, diagnostics, context);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE:
				return validateSGrMROPresenceLevelIndicationType((SGrMROPresenceLevelIndicationType)value, diagnostics, context);
			case V0Package.SGR_OBLIG_LVL_TYPE:
				return validateSGrObligLvlType((SGrObligLvlType)value, diagnostics, context);
			case V0Package.SGR_OCPP_STATE_TYPE:
				return validateSGrOCPPStateType((SGrOCPPStateType)value, diagnostics, context);
			case V0Package.SGR_POWER_SOURCE_TYPE:
				return validateSGrPowerSourceType((SGrPowerSourceType)value, diagnostics, context);
			case V0Package.SGR_RELEASE_STATE:
				return validateSGrReleaseState((SGrReleaseState)value, diagnostics, context);
			case V0Package.SGR_RWP_TYPE:
				return validateSGrRWPType((SGrRWPType)value, diagnostics, context);
			case V0Package.SGR_SGCP_FEED_IN_STATE_LV2_TYPE:
				return validateSGrSGCPFeedInStateLv2Type((SGrSGCPFeedInStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_SGCP_LOAD_STATE_LV2_TYPE:
				return validateSGrSGCPLoadStateLv2Type((SGrSGCPLoadStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_SGCP_SERVICE_TYPE:
				return validateSGrSGCPServiceType((SGrSGCPServiceType)value, diagnostics, context);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE:
				return validateSGrSunspStateCodesType((SGrSunspStateCodesType)value, diagnostics, context);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE:
				return validateSGrTransportServicesUsedListType((SGrTransportServicesUsedListType)value, diagnostics, context);
			case V0Package.SGR_UNITS:
				return validateSGrUnits((SGrUnits)value, diagnostics, context);
			case V0Package.STI_HP_OPSTATE_TYPE:
				return validateStiHPOpstateType((StiHPOpstateType)value, diagnostics, context);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE:
				return validateSubProfileTypeEnumType((SubProfileTypeEnumType)value, diagnostics, context);
			case V0Package.CTA_DOM_HOT_WOP_MODE_TYPE_OBJECT:
				return validateCtaDomHotWOpModeTypeObject((CtaDomHotWOpModeType)value, diagnostics, context);
			case V0Package.CTA_HC_OP_MODE_TYPE_OBJECT:
				return validateCtaHCOpModeTypeObject((CtaHCOpModeType)value, diagnostics, context);
			case V0Package.CTA_HP_OP_MODE_TYPE_OBJECT:
				return validateCtaHPOpModeTypeObject((CtaHPOpModeType)value, diagnostics, context);
			case V0Package.CTA_HP_OP_STATE_TYPE_OBJECT:
				return validateCtaHPOpStateTypeObject((CtaHPOpStateType)value, diagnostics, context);
			case V0Package.HOV_BUFFER_STATE_TYPE_OBJECT:
				return validateHovBufferStateTypeObject((HovBufferStateType)value, diagnostics, context);
			case V0Package.HOV_DOM_HOT_WOP_MODE_TYPE_OBJECT:
				return validateHovDomHotWOpModeTypeObject((HovDomHotWOpModeType)value, diagnostics, context);
			case V0Package.HOV_DOM_HOT_WSTATE_TYPE_OBJECT:
				return validateHovDomHotWStateTypeObject((HovDomHotWStateType)value, diagnostics, context);
			case V0Package.HOV_HC_OP_MODE_TYPE_OBJECT:
				return validateHovHCOpModeTypeObject((HovHCOpModeType)value, diagnostics, context);
			case V0Package.HOV_HC_OP_STATE_TYPE_OBJECT:
				return validateHovHCOpStateTypeObject((HovHCOpStateType)value, diagnostics, context);
			case V0Package.HOV_HP_ACT_BUFFER_STATE_TYPE_OBJECT:
				return validateHovHPActBufferStateTypeObject((HovHPActBufferStateType)value, diagnostics, context);
			case V0Package.HOV_HP_OP_MODE_TYPE_OBJECT:
				return validateHovHPOpModeTypeObject((HovHPOpModeType)value, diagnostics, context);
			case V0Package.HOV_HP_OP_STATE_TYPE_OBJECT:
				return validateHovHPOpStateTypeObject((HovHPOpStateType)value, diagnostics, context);
			case V0Package.HOV_SG_READY_SRC_SEL_TYPE_OBJECT:
				return validateHovSGReadySrcSelTypeObject((HovSGReadySrcSelType)value, diagnostics, context);
			case V0Package.HOV_TYPE_OBJECT:
				return validateHovTypeObject((HovType)value, diagnostics, context);
			case V0Package.LEVEL_OF_OPERATION_TYPE_OBJECT:
				return validateLevelOfOperationTypeObject((LevelOfOperationType)value, diagnostics, context);
			case V0Package.PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return validateProfileTypeEnumTypeObject((ProfileTypeEnumType)value, diagnostics, context);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE_OBJECT:
				return validateSGrBool2BitRankTypeObject((SGrBool2BitRankType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_KIND_TYPE_OBJECT:
				return validateSGrDeviceKindTypeObject((SGrDeviceKindType)value, diagnostics, context);
			case V0Package.SG_READY_STATE_LV1_TYPE_OBJECT:
				return validateSGReadyStateLv1TypeObject((SGReadyStateLv1Type)value, diagnostics, context);
			case V0Package.SG_READY_STATE_LV2_TYPE_OBJECT:
				return validateSGReadyStateLv2TypeObject((SGReadyStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_EVSE_STATE_LV1_TYPE_OBJECT:
				return validateSGrEVSEStateLv1TypeObject((SGrEVSEStateLv1Type)value, diagnostics, context);
			case V0Package.SGR_EVSE_STATE_LV2_TYPE_OBJECT:
				return validateSGrEVSEStateLv2TypeObject((SGrEVSEStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_EV_STATE_TYPE_OBJECT:
				return validateSGrEVStateTypeObject((SGrEVStateType)value, diagnostics, context);
			case V0Package.SGR_HC_OP_MODE_TYPE_OBJECT:
				return validateSGrHCOpModeTypeObject((SGrHCOpModeType)value, diagnostics, context);
			case V0Package.SGR_HC_OP_STATE_TYPE_OBJECT:
				return validateSgrHCOpStateTypeObject((SgrHCOpStateType)value, diagnostics, context);
			case V0Package.SGR_HP_OP_MODE_TYPE_OBJECT:
				return validateSGrHPOpModeTypeObject((SGrHPOpModeType)value, diagnostics, context);
			case V0Package.SGR_HP_OPSTATE_TYPE_OBJECT:
				return validateSGrHPOpstateTypeObject((SGrHPOpstateType)value, diagnostics, context);
			case V0Package.SGR_LANGUAGE_TYPE_OBJECT:
				return validateSGrLanguageTypeObject((SGrLanguageType)value, diagnostics, context);
			case V0Package.SGR_MANUFACTURER_ID_TYPE_OBJECT:
				return validateSGrManufacturerIDTypeObject((SGrManufacturerIDType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE_OBJECT:
				return validateSGrMeasValueSourceTypeObject((SGrMeasValueSourceType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_TYPE_OBJECT:
				return validateSGrMeasValueTypeObject((SGrMeasValueType)value, diagnostics, context);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE_OBJECT:
				return validateSGrMROPresenceLevelIndicationTypeObject((SGrMROPresenceLevelIndicationType)value, diagnostics, context);
			case V0Package.SGR_OBLIG_LVL_TYPE_OBJECT:
				return validateSGrObligLvlTypeObject((SGrObligLvlType)value, diagnostics, context);
			case V0Package.SGR_OCPP_STATE_TYPE_OBJECT:
				return validateSGrOCPPStateTypeObject((SGrOCPPStateType)value, diagnostics, context);
			case V0Package.SGR_POWER_SOURCE_TYPE_OBJECT:
				return validateSGrPowerSourceTypeObject((SGrPowerSourceType)value, diagnostics, context);
			case V0Package.SGR_PRECISION_TYPE:
				return validateSGrPrecisionType((Double)value, diagnostics, context);
			case V0Package.SGR_PRECISION_TYPE_OBJECT:
				return validateSGrPrecisionTypeObject((Double)value, diagnostics, context);
			case V0Package.SGR_RELEASE_STATE_OBJECT:
				return validateSGrReleaseStateObject((SGrReleaseState)value, diagnostics, context);
			case V0Package.SGR_RWP_TYPE_OBJECT:
				return validateSGrRWPTypeObject((SGrRWPType)value, diagnostics, context);
			case V0Package.SGR_SGCP_FEED_IN_STATE_LV2_TYPE_OBJECT:
				return validateSGrSGCPFeedInStateLv2TypeObject((SGrSGCPFeedInStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_SGCP_LOAD_STATE_LV2_TYPE_OBJECT:
				return validateSGrSGCPLoadStateLv2TypeObject((SGrSGCPLoadStateLv2Type)value, diagnostics, context);
			case V0Package.SGR_SGCP_SERVICE_TYPE_OBJECT:
				return validateSGrSGCPServiceTypeObject((SGrSGCPServiceType)value, diagnostics, context);
			case V0Package.SGR_SPECIAL_QUALITY_REQ_TYPE:
				return validateSGrSpecialQualityReqType((String)value, diagnostics, context);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE_OBJECT:
				return validateSGrSunspStateCodesTypeObject((SGrSunspStateCodesType)value, diagnostics, context);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE_OBJECT:
				return validateSGrTransportServicesUsedListTypeObject((SGrTransportServicesUsedListType)value, diagnostics, context);
			case V0Package.SGR_UNITS_OBJECT:
				return validateSGrUnitsObject((SGrUnits)value, diagnostics, context);
			case V0Package.STI_HP_OPSTATE_TYPE_OBJECT:
				return validateStiHPOpstateTypeObject((StiHPOpstateType)value, diagnostics, context);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return validateSubProfileTypeEnumTypeObject((SubProfileTypeEnumType)value, diagnostics, context);
			case V0Package.TEXT_ELEMENT_TYPE:
				return validateTextElementType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrAttr4GenericType(SGrAttr4GenericType sGrAttr4GenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrAttr4GenericType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrBasicGenDataPointTypeType(SGrBasicGenDataPointTypeType sGrBasicGenDataPointTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrBasicGenDataPointTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrBitmapperListType(SGrBitmapperListType sGrBitmapperListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrBitmapperListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrChangeLog(SGrChangeLog sGrChangeLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrChangeLog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDataPointBaseType(SGrDataPointBaseType sGrDataPointBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrDataPointBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDataPointDescriptionType(SGrDataPointDescriptionType sGrDataPointDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrDataPointDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDeviceBaseType(SGrDeviceBaseType sGrDeviceBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrDeviceBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDeviceProfileType(SGrDeviceProfileType sGrDeviceProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrDeviceProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEnumListType(SGrEnumListType sGrEnumListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrEnumListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrFlexAssistanceType(SGrFlexAssistanceType sGrFlexAssistanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrFlexAssistanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrFunctionalProfileBaseType(SGrFunctionalProfileBaseType sGrFunctionalProfileBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrFunctionalProfileBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrGenDeviceFrame(SGrGenDeviceFrame sGrGenDeviceFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrGenDeviceFrame, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrGenFunctionalProfileType(SGrGenFunctionalProfileType sGrGenFunctionalProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrGenFunctionalProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrLegibDocumentationType(SGrLegibDocumentationType sGrLegibDocumentationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrLegibDocumentationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrNamelistType(SGrNamelistType sGrNamelistType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrNamelistType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrProfileDescriptionType(SGrProfileDescriptionType sGrProfileDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrProfileDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrProfilenumberType(SGrProfilenumberType sGrProfilenumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrProfilenumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrReleaseNotes(SGrReleaseNotes sGrReleaseNotes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrReleaseNotes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrScalingType(SGrScalingType sGrScalingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrScalingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSmoothTransitionType(SGrSmoothTransitionType sGrSmoothTransitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrSmoothTransitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrStabilityFallbackType(SGrStabilityFallbackType sGrStabilityFallbackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrStabilityFallbackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrVersionNumberType(SGrVersionNumberType sGrVersionNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrVersionNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaDomHotWOpModeType(CtaDomHotWOpModeType ctaDomHotWOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaHCOpModeType(CtaHCOpModeType ctaHCOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaHPOpModeType(CtaHPOpModeType ctaHPOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaHPOpStateType(CtaHPOpStateType ctaHPOpStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovBufferStateType(HovBufferStateType hovBufferStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovDomHotWOpModeType(HovDomHotWOpModeType hovDomHotWOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovDomHotWStateType(HovDomHotWStateType hovDomHotWStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHCOpModeType(HovHCOpModeType hovHCOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHCOpStateType(HovHCOpStateType hovHCOpStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHPActBufferStateType(HovHPActBufferStateType hovHPActBufferStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHPOpModeType(HovHPOpModeType hovHPOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHPOpStateType(HovHPOpStateType hovHPOpStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovSGReadySrcSelType(HovSGReadySrcSelType hovSGReadySrcSelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovType(HovType hovType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfOperationType(LevelOfOperationType levelOfOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileTypeEnumType(ProfileTypeEnumType profileTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrBool2BitRankType(SGrBool2BitRankType sGrBool2BitRankType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDeviceKindType(SGrDeviceKindType sGrDeviceKindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGReadyStateLv1Type(SGReadyStateLv1Type sgReadyStateLv1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGReadyStateLv2Type(SGReadyStateLv2Type sgReadyStateLv2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEVSEStateLv1Type(SGrEVSEStateLv1Type sGrEVSEStateLv1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEVSEStateLv2Type(SGrEVSEStateLv2Type sGrEVSEStateLv2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEVStateType(SGrEVStateType sGrEVStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrHCOpModeType(SGrHCOpModeType sGrHCOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSgrHCOpStateType(SgrHCOpStateType sgrHCOpStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrHPOpModeType(SGrHPOpModeType sGrHPOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrHPOpstateType(SGrHPOpstateType sGrHPOpstateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrLanguageType(SGrLanguageType sGrLanguageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrManufacturerIDType(SGrManufacturerIDType sGrManufacturerIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMeasValueSourceType(SGrMeasValueSourceType sGrMeasValueSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMeasValueType(SGrMeasValueType sGrMeasValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMROPresenceLevelIndicationType(SGrMROPresenceLevelIndicationType sGrMROPresenceLevelIndicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrObligLvlType(SGrObligLvlType sGrObligLvlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrOCPPStateType(SGrOCPPStateType sGrOCPPStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrPowerSourceType(SGrPowerSourceType sGrPowerSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrReleaseState(SGrReleaseState sGrReleaseState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRWPType(SGrRWPType sGrRWPType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSGCPFeedInStateLv2Type(SGrSGCPFeedInStateLv2Type sGrSGCPFeedInStateLv2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSGCPLoadStateLv2Type(SGrSGCPLoadStateLv2Type sGrSGCPLoadStateLv2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSGCPServiceType(SGrSGCPServiceType sGrSGCPServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSunspStateCodesType(SGrSunspStateCodesType sGrSunspStateCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrTransportServicesUsedListType(SGrTransportServicesUsedListType sGrTransportServicesUsedListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrUnits(SGrUnits sGrUnits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStiHPOpstateType(StiHPOpstateType stiHPOpstateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubProfileTypeEnumType(SubProfileTypeEnumType subProfileTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaDomHotWOpModeTypeObject(CtaDomHotWOpModeType ctaDomHotWOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaHCOpModeTypeObject(CtaHCOpModeType ctaHCOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaHPOpModeTypeObject(CtaHPOpModeType ctaHPOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaHPOpStateTypeObject(CtaHPOpStateType ctaHPOpStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovBufferStateTypeObject(HovBufferStateType hovBufferStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovDomHotWOpModeTypeObject(HovDomHotWOpModeType hovDomHotWOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovDomHotWStateTypeObject(HovDomHotWStateType hovDomHotWStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHCOpModeTypeObject(HovHCOpModeType hovHCOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHCOpStateTypeObject(HovHCOpStateType hovHCOpStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHPActBufferStateTypeObject(HovHPActBufferStateType hovHPActBufferStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHPOpModeTypeObject(HovHPOpModeType hovHPOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovHPOpStateTypeObject(HovHPOpStateType hovHPOpStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovSGReadySrcSelTypeObject(HovSGReadySrcSelType hovSGReadySrcSelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHovTypeObject(HovType hovTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfOperationTypeObject(LevelOfOperationType levelOfOperationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileTypeEnumTypeObject(ProfileTypeEnumType profileTypeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrBool2BitRankTypeObject(SGrBool2BitRankType sGrBool2BitRankTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDeviceKindTypeObject(SGrDeviceKindType sGrDeviceKindTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGReadyStateLv1TypeObject(SGReadyStateLv1Type sgReadyStateLv1TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGReadyStateLv2TypeObject(SGReadyStateLv2Type sgReadyStateLv2TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEVSEStateLv1TypeObject(SGrEVSEStateLv1Type sGrEVSEStateLv1TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEVSEStateLv2TypeObject(SGrEVSEStateLv2Type sGrEVSEStateLv2TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrEVStateTypeObject(SGrEVStateType sGrEVStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrHCOpModeTypeObject(SGrHCOpModeType sGrHCOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSgrHCOpStateTypeObject(SgrHCOpStateType sgrHCOpStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrHPOpModeTypeObject(SGrHPOpModeType sGrHPOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrHPOpstateTypeObject(SGrHPOpstateType sGrHPOpstateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrLanguageTypeObject(SGrLanguageType sGrLanguageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrManufacturerIDTypeObject(SGrManufacturerIDType sGrManufacturerIDTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMeasValueSourceTypeObject(SGrMeasValueSourceType sGrMeasValueSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMeasValueTypeObject(SGrMeasValueType sGrMeasValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMROPresenceLevelIndicationTypeObject(SGrMROPresenceLevelIndicationType sGrMROPresenceLevelIndicationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrObligLvlTypeObject(SGrObligLvlType sGrObligLvlTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrOCPPStateTypeObject(SGrOCPPStateType sGrOCPPStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrPowerSourceTypeObject(SGrPowerSourceType sGrPowerSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrPrecisionType(double sGrPrecisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSGrPrecisionType_Min(sGrPrecisionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSGrPrecisionType_Max(sGrPrecisionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSGrPrecisionType_Min
	 */
	public static final double SGR_PRECISION_TYPE__MIN__VALUE = 0.001;

	/**
	 * Validates the Min constraint of '<em>SGr Precision Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrPrecisionType_Min(double sGrPrecisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = sGrPrecisionType >= SGR_PRECISION_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getSGrPrecisionType(), sGrPrecisionType, SGR_PRECISION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSGrPrecisionType_Max
	 */
	public static final double SGR_PRECISION_TYPE__MAX__VALUE = 15.0;

	/**
	 * Validates the Max constraint of '<em>SGr Precision Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrPrecisionType_Max(double sGrPrecisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = sGrPrecisionType <= SGR_PRECISION_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getSGrPrecisionType(), sGrPrecisionType, SGR_PRECISION_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrPrecisionTypeObject(Double sGrPrecisionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSGrPrecisionType_Min(sGrPrecisionTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateSGrPrecisionType_Max(sGrPrecisionTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrReleaseStateObject(SGrReleaseState sGrReleaseStateObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRWPTypeObject(SGrRWPType sGrRWPTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSGCPFeedInStateLv2TypeObject(SGrSGCPFeedInStateLv2Type sGrSGCPFeedInStateLv2TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSGCPLoadStateLv2TypeObject(SGrSGCPLoadStateLv2Type sGrSGCPLoadStateLv2TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSGCPServiceTypeObject(SGrSGCPServiceType sGrSGCPServiceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSpecialQualityReqType(String sGrSpecialQualityReqType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrSunspStateCodesTypeObject(SGrSunspStateCodesType sGrSunspStateCodesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrTransportServicesUsedListTypeObject(SGrTransportServicesUsedListType sGrTransportServicesUsedListTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrUnitsObject(SGrUnits sGrUnitsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStiHPOpstateTypeObject(StiHPOpstateType stiHPOpstateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubProfileTypeEnumTypeObject(SubProfileTypeEnumType subProfileTypeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextElementType(String textElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextElementType_MinLength(textElementType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextElementType_MaxLength(textElementType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextElementType_MinLength(String textElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textElementType.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(V0Package.eINSTANCE.getTextElementType(), textElementType, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextElementType_MaxLength(String textElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textElementType.length();
		boolean result = length <= 4000;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(V0Package.eINSTANCE.getTextElementType(), textElementType, length, 4000, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //V0Validator
