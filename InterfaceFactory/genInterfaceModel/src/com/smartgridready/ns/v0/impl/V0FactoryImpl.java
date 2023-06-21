/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class V0FactoryImpl extends EFactoryImpl implements V0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static V0Factory init() {
		try {
			V0Factory theV0Factory = (V0Factory)EPackage.Registry.INSTANCE.getEFactory(V0Package.eNS_URI);
			if (theV0Factory != null) {
				return theV0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new V0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case V0Package.DOCUMENT_ROOT: return createDocumentRoot();
			case V0Package.SGR_ATTR4_GENERIC_TYPE: return createSGrAttr4GenericType();
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE: return createSGrBasicGenDataPointTypeType();
			case V0Package.SGR_BITMAPPER_LIST_TYPE: return createSGrBitmapperListType();
			case V0Package.SGR_CHANGE_LOG: return createSGrChangeLog();
			case V0Package.SGR_DATA_POINT_BASE_TYPE: return createSGrDataPointBaseType();
			case V0Package.SGR_DATA_POINT_DESCRIPTION_TYPE: return createSGrDataPointDescriptionType();
			case V0Package.SGR_DEVICE_BASE_TYPE: return createSGrDeviceBaseType();
			case V0Package.SGR_DEVICE_PROFILE_TYPE: return createSGrDeviceProfileType();
			case V0Package.SGR_ENUM_LIST_TYPE: return createSGrEnumListType();
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE: return createSGrFlexAssistanceType();
			case V0Package.SGR_FUNCTIONAL_PROFILE_BASE_TYPE: return createSGrFunctionalProfileBaseType();
			case V0Package.SGR_GEN_DEVICE_FRAME: return createSGrGenDeviceFrame();
			case V0Package.SGR_GEN_FUNCTIONAL_PROFILE_TYPE: return createSGrGenFunctionalProfileType();
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE: return createSGrLegibDocumentationType();
			case V0Package.SGR_NAMELIST_TYPE: return createSGrNamelistType();
			case V0Package.SGR_PROFILE_DESCRIPTION_TYPE: return createSGrProfileDescriptionType();
			case V0Package.SGR_PROFILENUMBER_TYPE: return createSGrProfilenumberType();
			case V0Package.SGR_RELEASE_NOTES: return createSGrReleaseNotes();
			case V0Package.SGR_SCALING_TYPE: return createSGrScalingType();
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE: return createSGrSmoothTransitionType();
			case V0Package.SGR_STABILITY_FALLBACK_TYPE: return createSGrStabilityFallbackType();
			case V0Package.SGR_VERSION_NUMBER_TYPE: return createSGrVersionNumberType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case V0Package.CTA_DOM_HOT_WOP_MODE_TYPE:
				return createCtaDomHotWOpModeTypeFromString(eDataType, initialValue);
			case V0Package.CTA_HC_OP_MODE_TYPE:
				return createCtaHCOpModeTypeFromString(eDataType, initialValue);
			case V0Package.CTA_HP_OP_MODE_TYPE:
				return createCtaHPOpModeTypeFromString(eDataType, initialValue);
			case V0Package.CTA_HP_OP_STATE_TYPE:
				return createCtaHPOpStateTypeFromString(eDataType, initialValue);
			case V0Package.HOV_BUFFER_STATE_TYPE:
				return createHovBufferStateTypeFromString(eDataType, initialValue);
			case V0Package.HOV_DOM_HOT_WOP_MODE_TYPE:
				return createHovDomHotWOpModeTypeFromString(eDataType, initialValue);
			case V0Package.HOV_DOM_HOT_WSTATE_TYPE:
				return createHovDomHotWStateTypeFromString(eDataType, initialValue);
			case V0Package.HOV_HC_OP_MODE_TYPE:
				return createHovHCOpModeTypeFromString(eDataType, initialValue);
			case V0Package.HOV_HC_OP_STATE_TYPE:
				return createHovHCOpStateTypeFromString(eDataType, initialValue);
			case V0Package.HOV_HP_ACT_BUFFER_STATE_TYPE:
				return createHovHPActBufferStateTypeFromString(eDataType, initialValue);
			case V0Package.HOV_HP_OP_MODE_TYPE:
				return createHovHPOpModeTypeFromString(eDataType, initialValue);
			case V0Package.HOV_HP_OP_STATE_TYPE:
				return createHovHPOpStateTypeFromString(eDataType, initialValue);
			case V0Package.HOV_SG_READY_SRC_SEL_TYPE:
				return createHovSGReadySrcSelTypeFromString(eDataType, initialValue);
			case V0Package.HOV_TYPE:
				return createHovTypeFromString(eDataType, initialValue);
			case V0Package.LEVEL_OF_OPERATION_TYPE:
				return createLevelOfOperationTypeFromString(eDataType, initialValue);
			case V0Package.PROFILE_TYPE_ENUM_TYPE:
				return createProfileTypeEnumTypeFromString(eDataType, initialValue);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE:
				return createSGrBool2BitRankTypeFromString(eDataType, initialValue);
			case V0Package.SGR_DEVICE_KIND_TYPE:
				return createSGrDeviceKindTypeFromString(eDataType, initialValue);
			case V0Package.SG_READY_STATE_LV1_TYPE:
				return createSGReadyStateLv1TypeFromString(eDataType, initialValue);
			case V0Package.SG_READY_STATE_LV2_TYPE:
				return createSGReadyStateLv2TypeFromString(eDataType, initialValue);
			case V0Package.SGR_EVSE_STATE_LV1_TYPE:
				return createSGrEVSEStateLv1TypeFromString(eDataType, initialValue);
			case V0Package.SGR_EVSE_STATE_LV2_TYPE:
				return createSGrEVSEStateLv2TypeFromString(eDataType, initialValue);
			case V0Package.SGR_EV_STATE_TYPE:
				return createSGrEVStateTypeFromString(eDataType, initialValue);
			case V0Package.SGR_HC_OP_MODE_TYPE:
				return createSGrHCOpModeTypeFromString(eDataType, initialValue);
			case V0Package.SGR_HC_OP_STATE_TYPE:
				return createSgrHCOpStateTypeFromString(eDataType, initialValue);
			case V0Package.SGR_HP_OP_MODE_TYPE:
				return createSGrHPOpModeTypeFromString(eDataType, initialValue);
			case V0Package.SGR_HP_OPSTATE_TYPE:
				return createSGrHPOpstateTypeFromString(eDataType, initialValue);
			case V0Package.SGR_LANGUAGE_TYPE:
				return createSGrLanguageTypeFromString(eDataType, initialValue);
			case V0Package.SGR_MANUFACTURER_ID_TYPE:
				return createSGrManufacturerIDTypeFromString(eDataType, initialValue);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE:
				return createSGrMeasValueSourceTypeFromString(eDataType, initialValue);
			case V0Package.SGR_MEAS_VALUE_TYPE:
				return createSGrMeasValueTypeFromString(eDataType, initialValue);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE:
				return createSGrMROPresenceLevelIndicationTypeFromString(eDataType, initialValue);
			case V0Package.SGR_OBLIG_LVL_TYPE:
				return createSGrObligLvlTypeFromString(eDataType, initialValue);
			case V0Package.SGR_OCPP_STATE_TYPE:
				return createSGrOCPPStateTypeFromString(eDataType, initialValue);
			case V0Package.SGR_POWER_SOURCE_TYPE:
				return createSGrPowerSourceTypeFromString(eDataType, initialValue);
			case V0Package.SGR_RELEASE_STATE:
				return createSGrReleaseStateFromString(eDataType, initialValue);
			case V0Package.SGR_RWP_TYPE:
				return createSGrRWPTypeFromString(eDataType, initialValue);
			case V0Package.SGR_SGCP_FEED_IN_STATE_LV2_TYPE:
				return createSGrSGCPFeedInStateLv2TypeFromString(eDataType, initialValue);
			case V0Package.SGR_SGCP_LOAD_STATE_LV2_TYPE:
				return createSGrSGCPLoadStateLv2TypeFromString(eDataType, initialValue);
			case V0Package.SGR_SGCP_SERVICE_TYPE:
				return createSGrSGCPServiceTypeFromString(eDataType, initialValue);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE:
				return createSGrSunspStateCodesTypeFromString(eDataType, initialValue);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE:
				return createSGrTransportServicesUsedListTypeFromString(eDataType, initialValue);
			case V0Package.SGR_UNITS:
				return createSGrUnitsFromString(eDataType, initialValue);
			case V0Package.STI_HP_OPSTATE_TYPE:
				return createStiHPOpstateTypeFromString(eDataType, initialValue);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE:
				return createSubProfileTypeEnumTypeFromString(eDataType, initialValue);
			case V0Package.CTA_DOM_HOT_WOP_MODE_TYPE_OBJECT:
				return createCtaDomHotWOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.CTA_HC_OP_MODE_TYPE_OBJECT:
				return createCtaHCOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.CTA_HP_OP_MODE_TYPE_OBJECT:
				return createCtaHPOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.CTA_HP_OP_STATE_TYPE_OBJECT:
				return createCtaHPOpStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_BUFFER_STATE_TYPE_OBJECT:
				return createHovBufferStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_DOM_HOT_WOP_MODE_TYPE_OBJECT:
				return createHovDomHotWOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_DOM_HOT_WSTATE_TYPE_OBJECT:
				return createHovDomHotWStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_HC_OP_MODE_TYPE_OBJECT:
				return createHovHCOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_HC_OP_STATE_TYPE_OBJECT:
				return createHovHCOpStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_HP_ACT_BUFFER_STATE_TYPE_OBJECT:
				return createHovHPActBufferStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_HP_OP_MODE_TYPE_OBJECT:
				return createHovHPOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_HP_OP_STATE_TYPE_OBJECT:
				return createHovHPOpStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_SG_READY_SRC_SEL_TYPE_OBJECT:
				return createHovSGReadySrcSelTypeObjectFromString(eDataType, initialValue);
			case V0Package.HOV_TYPE_OBJECT:
				return createHovTypeObjectFromString(eDataType, initialValue);
			case V0Package.LEVEL_OF_OPERATION_TYPE_OBJECT:
				return createLevelOfOperationTypeObjectFromString(eDataType, initialValue);
			case V0Package.PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return createProfileTypeEnumTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE_OBJECT:
				return createSGrBool2BitRankTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_DEVICE_KIND_TYPE_OBJECT:
				return createSGrDeviceKindTypeObjectFromString(eDataType, initialValue);
			case V0Package.SG_READY_STATE_LV1_TYPE_OBJECT:
				return createSGReadyStateLv1TypeObjectFromString(eDataType, initialValue);
			case V0Package.SG_READY_STATE_LV2_TYPE_OBJECT:
				return createSGReadyStateLv2TypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_EVSE_STATE_LV1_TYPE_OBJECT:
				return createSGrEVSEStateLv1TypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_EVSE_STATE_LV2_TYPE_OBJECT:
				return createSGrEVSEStateLv2TypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_EV_STATE_TYPE_OBJECT:
				return createSGrEVStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_HC_OP_MODE_TYPE_OBJECT:
				return createSGrHCOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_HC_OP_STATE_TYPE_OBJECT:
				return createSgrHCOpStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_HP_OP_MODE_TYPE_OBJECT:
				return createSGrHPOpModeTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_HP_OPSTATE_TYPE_OBJECT:
				return createSGrHPOpstateTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_LANGUAGE_TYPE_OBJECT:
				return createSGrLanguageTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_MANUFACTURER_ID_TYPE_OBJECT:
				return createSGrManufacturerIDTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE_OBJECT:
				return createSGrMeasValueSourceTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_MEAS_VALUE_TYPE_OBJECT:
				return createSGrMeasValueTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE_OBJECT:
				return createSGrMROPresenceLevelIndicationTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_OBLIG_LVL_TYPE_OBJECT:
				return createSGrObligLvlTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_OCPP_STATE_TYPE_OBJECT:
				return createSGrOCPPStateTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_POWER_SOURCE_TYPE_OBJECT:
				return createSGrPowerSourceTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_PRECISION_TYPE:
				return createSGrPrecisionTypeFromString(eDataType, initialValue);
			case V0Package.SGR_PRECISION_TYPE_OBJECT:
				return createSGrPrecisionTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_RELEASE_STATE_OBJECT:
				return createSGrReleaseStateObjectFromString(eDataType, initialValue);
			case V0Package.SGR_RWP_TYPE_OBJECT:
				return createSGrRWPTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_SGCP_FEED_IN_STATE_LV2_TYPE_OBJECT:
				return createSGrSGCPFeedInStateLv2TypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_SGCP_LOAD_STATE_LV2_TYPE_OBJECT:
				return createSGrSGCPLoadStateLv2TypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_SGCP_SERVICE_TYPE_OBJECT:
				return createSGrSGCPServiceTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_SPECIAL_QUALITY_REQ_TYPE:
				return createSGrSpecialQualityReqTypeFromString(eDataType, initialValue);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE_OBJECT:
				return createSGrSunspStateCodesTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE_OBJECT:
				return createSGrTransportServicesUsedListTypeObjectFromString(eDataType, initialValue);
			case V0Package.SGR_UNITS_OBJECT:
				return createSGrUnitsObjectFromString(eDataType, initialValue);
			case V0Package.STI_HP_OPSTATE_TYPE_OBJECT:
				return createStiHPOpstateTypeObjectFromString(eDataType, initialValue);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return createSubProfileTypeEnumTypeObjectFromString(eDataType, initialValue);
			case V0Package.TEXT_ELEMENT_TYPE:
				return createTextElementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case V0Package.CTA_DOM_HOT_WOP_MODE_TYPE:
				return convertCtaDomHotWOpModeTypeToString(eDataType, instanceValue);
			case V0Package.CTA_HC_OP_MODE_TYPE:
				return convertCtaHCOpModeTypeToString(eDataType, instanceValue);
			case V0Package.CTA_HP_OP_MODE_TYPE:
				return convertCtaHPOpModeTypeToString(eDataType, instanceValue);
			case V0Package.CTA_HP_OP_STATE_TYPE:
				return convertCtaHPOpStateTypeToString(eDataType, instanceValue);
			case V0Package.HOV_BUFFER_STATE_TYPE:
				return convertHovBufferStateTypeToString(eDataType, instanceValue);
			case V0Package.HOV_DOM_HOT_WOP_MODE_TYPE:
				return convertHovDomHotWOpModeTypeToString(eDataType, instanceValue);
			case V0Package.HOV_DOM_HOT_WSTATE_TYPE:
				return convertHovDomHotWStateTypeToString(eDataType, instanceValue);
			case V0Package.HOV_HC_OP_MODE_TYPE:
				return convertHovHCOpModeTypeToString(eDataType, instanceValue);
			case V0Package.HOV_HC_OP_STATE_TYPE:
				return convertHovHCOpStateTypeToString(eDataType, instanceValue);
			case V0Package.HOV_HP_ACT_BUFFER_STATE_TYPE:
				return convertHovHPActBufferStateTypeToString(eDataType, instanceValue);
			case V0Package.HOV_HP_OP_MODE_TYPE:
				return convertHovHPOpModeTypeToString(eDataType, instanceValue);
			case V0Package.HOV_HP_OP_STATE_TYPE:
				return convertHovHPOpStateTypeToString(eDataType, instanceValue);
			case V0Package.HOV_SG_READY_SRC_SEL_TYPE:
				return convertHovSGReadySrcSelTypeToString(eDataType, instanceValue);
			case V0Package.HOV_TYPE:
				return convertHovTypeToString(eDataType, instanceValue);
			case V0Package.LEVEL_OF_OPERATION_TYPE:
				return convertLevelOfOperationTypeToString(eDataType, instanceValue);
			case V0Package.PROFILE_TYPE_ENUM_TYPE:
				return convertProfileTypeEnumTypeToString(eDataType, instanceValue);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE:
				return convertSGrBool2BitRankTypeToString(eDataType, instanceValue);
			case V0Package.SGR_DEVICE_KIND_TYPE:
				return convertSGrDeviceKindTypeToString(eDataType, instanceValue);
			case V0Package.SG_READY_STATE_LV1_TYPE:
				return convertSGReadyStateLv1TypeToString(eDataType, instanceValue);
			case V0Package.SG_READY_STATE_LV2_TYPE:
				return convertSGReadyStateLv2TypeToString(eDataType, instanceValue);
			case V0Package.SGR_EVSE_STATE_LV1_TYPE:
				return convertSGrEVSEStateLv1TypeToString(eDataType, instanceValue);
			case V0Package.SGR_EVSE_STATE_LV2_TYPE:
				return convertSGrEVSEStateLv2TypeToString(eDataType, instanceValue);
			case V0Package.SGR_EV_STATE_TYPE:
				return convertSGrEVStateTypeToString(eDataType, instanceValue);
			case V0Package.SGR_HC_OP_MODE_TYPE:
				return convertSGrHCOpModeTypeToString(eDataType, instanceValue);
			case V0Package.SGR_HC_OP_STATE_TYPE:
				return convertSgrHCOpStateTypeToString(eDataType, instanceValue);
			case V0Package.SGR_HP_OP_MODE_TYPE:
				return convertSGrHPOpModeTypeToString(eDataType, instanceValue);
			case V0Package.SGR_HP_OPSTATE_TYPE:
				return convertSGrHPOpstateTypeToString(eDataType, instanceValue);
			case V0Package.SGR_LANGUAGE_TYPE:
				return convertSGrLanguageTypeToString(eDataType, instanceValue);
			case V0Package.SGR_MANUFACTURER_ID_TYPE:
				return convertSGrManufacturerIDTypeToString(eDataType, instanceValue);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE:
				return convertSGrMeasValueSourceTypeToString(eDataType, instanceValue);
			case V0Package.SGR_MEAS_VALUE_TYPE:
				return convertSGrMeasValueTypeToString(eDataType, instanceValue);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE:
				return convertSGrMROPresenceLevelIndicationTypeToString(eDataType, instanceValue);
			case V0Package.SGR_OBLIG_LVL_TYPE:
				return convertSGrObligLvlTypeToString(eDataType, instanceValue);
			case V0Package.SGR_OCPP_STATE_TYPE:
				return convertSGrOCPPStateTypeToString(eDataType, instanceValue);
			case V0Package.SGR_POWER_SOURCE_TYPE:
				return convertSGrPowerSourceTypeToString(eDataType, instanceValue);
			case V0Package.SGR_RELEASE_STATE:
				return convertSGrReleaseStateToString(eDataType, instanceValue);
			case V0Package.SGR_RWP_TYPE:
				return convertSGrRWPTypeToString(eDataType, instanceValue);
			case V0Package.SGR_SGCP_FEED_IN_STATE_LV2_TYPE:
				return convertSGrSGCPFeedInStateLv2TypeToString(eDataType, instanceValue);
			case V0Package.SGR_SGCP_LOAD_STATE_LV2_TYPE:
				return convertSGrSGCPLoadStateLv2TypeToString(eDataType, instanceValue);
			case V0Package.SGR_SGCP_SERVICE_TYPE:
				return convertSGrSGCPServiceTypeToString(eDataType, instanceValue);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE:
				return convertSGrSunspStateCodesTypeToString(eDataType, instanceValue);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE:
				return convertSGrTransportServicesUsedListTypeToString(eDataType, instanceValue);
			case V0Package.SGR_UNITS:
				return convertSGrUnitsToString(eDataType, instanceValue);
			case V0Package.STI_HP_OPSTATE_TYPE:
				return convertStiHPOpstateTypeToString(eDataType, instanceValue);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE:
				return convertSubProfileTypeEnumTypeToString(eDataType, instanceValue);
			case V0Package.CTA_DOM_HOT_WOP_MODE_TYPE_OBJECT:
				return convertCtaDomHotWOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.CTA_HC_OP_MODE_TYPE_OBJECT:
				return convertCtaHCOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.CTA_HP_OP_MODE_TYPE_OBJECT:
				return convertCtaHPOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.CTA_HP_OP_STATE_TYPE_OBJECT:
				return convertCtaHPOpStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_BUFFER_STATE_TYPE_OBJECT:
				return convertHovBufferStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_DOM_HOT_WOP_MODE_TYPE_OBJECT:
				return convertHovDomHotWOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_DOM_HOT_WSTATE_TYPE_OBJECT:
				return convertHovDomHotWStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_HC_OP_MODE_TYPE_OBJECT:
				return convertHovHCOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_HC_OP_STATE_TYPE_OBJECT:
				return convertHovHCOpStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_HP_ACT_BUFFER_STATE_TYPE_OBJECT:
				return convertHovHPActBufferStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_HP_OP_MODE_TYPE_OBJECT:
				return convertHovHPOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_HP_OP_STATE_TYPE_OBJECT:
				return convertHovHPOpStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_SG_READY_SRC_SEL_TYPE_OBJECT:
				return convertHovSGReadySrcSelTypeObjectToString(eDataType, instanceValue);
			case V0Package.HOV_TYPE_OBJECT:
				return convertHovTypeObjectToString(eDataType, instanceValue);
			case V0Package.LEVEL_OF_OPERATION_TYPE_OBJECT:
				return convertLevelOfOperationTypeObjectToString(eDataType, instanceValue);
			case V0Package.PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return convertProfileTypeEnumTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE_OBJECT:
				return convertSGrBool2BitRankTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_DEVICE_KIND_TYPE_OBJECT:
				return convertSGrDeviceKindTypeObjectToString(eDataType, instanceValue);
			case V0Package.SG_READY_STATE_LV1_TYPE_OBJECT:
				return convertSGReadyStateLv1TypeObjectToString(eDataType, instanceValue);
			case V0Package.SG_READY_STATE_LV2_TYPE_OBJECT:
				return convertSGReadyStateLv2TypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_EVSE_STATE_LV1_TYPE_OBJECT:
				return convertSGrEVSEStateLv1TypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_EVSE_STATE_LV2_TYPE_OBJECT:
				return convertSGrEVSEStateLv2TypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_EV_STATE_TYPE_OBJECT:
				return convertSGrEVStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_HC_OP_MODE_TYPE_OBJECT:
				return convertSGrHCOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_HC_OP_STATE_TYPE_OBJECT:
				return convertSgrHCOpStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_HP_OP_MODE_TYPE_OBJECT:
				return convertSGrHPOpModeTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_HP_OPSTATE_TYPE_OBJECT:
				return convertSGrHPOpstateTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_LANGUAGE_TYPE_OBJECT:
				return convertSGrLanguageTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_MANUFACTURER_ID_TYPE_OBJECT:
				return convertSGrManufacturerIDTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE_OBJECT:
				return convertSGrMeasValueSourceTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_MEAS_VALUE_TYPE_OBJECT:
				return convertSGrMeasValueTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE_OBJECT:
				return convertSGrMROPresenceLevelIndicationTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_OBLIG_LVL_TYPE_OBJECT:
				return convertSGrObligLvlTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_OCPP_STATE_TYPE_OBJECT:
				return convertSGrOCPPStateTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_POWER_SOURCE_TYPE_OBJECT:
				return convertSGrPowerSourceTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_PRECISION_TYPE:
				return convertSGrPrecisionTypeToString(eDataType, instanceValue);
			case V0Package.SGR_PRECISION_TYPE_OBJECT:
				return convertSGrPrecisionTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_RELEASE_STATE_OBJECT:
				return convertSGrReleaseStateObjectToString(eDataType, instanceValue);
			case V0Package.SGR_RWP_TYPE_OBJECT:
				return convertSGrRWPTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_SGCP_FEED_IN_STATE_LV2_TYPE_OBJECT:
				return convertSGrSGCPFeedInStateLv2TypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_SGCP_LOAD_STATE_LV2_TYPE_OBJECT:
				return convertSGrSGCPLoadStateLv2TypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_SGCP_SERVICE_TYPE_OBJECT:
				return convertSGrSGCPServiceTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_SPECIAL_QUALITY_REQ_TYPE:
				return convertSGrSpecialQualityReqTypeToString(eDataType, instanceValue);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE_OBJECT:
				return convertSGrSunspStateCodesTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE_OBJECT:
				return convertSGrTransportServicesUsedListTypeObjectToString(eDataType, instanceValue);
			case V0Package.SGR_UNITS_OBJECT:
				return convertSGrUnitsObjectToString(eDataType, instanceValue);
			case V0Package.STI_HP_OPSTATE_TYPE_OBJECT:
				return convertStiHPOpstateTypeObjectToString(eDataType, instanceValue);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return convertSubProfileTypeEnumTypeObjectToString(eDataType, instanceValue);
			case V0Package.TEXT_ELEMENT_TYPE:
				return convertTextElementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrAttr4GenericType createSGrAttr4GenericType() {
		SGrAttr4GenericTypeImpl sGrAttr4GenericType = new SGrAttr4GenericTypeImpl();
		return sGrAttr4GenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrBasicGenDataPointTypeType createSGrBasicGenDataPointTypeType() {
		SGrBasicGenDataPointTypeTypeImpl sGrBasicGenDataPointTypeType = new SGrBasicGenDataPointTypeTypeImpl();
		return sGrBasicGenDataPointTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrBitmapperListType createSGrBitmapperListType() {
		SGrBitmapperListTypeImpl sGrBitmapperListType = new SGrBitmapperListTypeImpl();
		return sGrBitmapperListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrChangeLog createSGrChangeLog() {
		SGrChangeLogImpl sGrChangeLog = new SGrChangeLogImpl();
		return sGrChangeLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrDataPointBaseType createSGrDataPointBaseType() {
		SGrDataPointBaseTypeImpl sGrDataPointBaseType = new SGrDataPointBaseTypeImpl();
		return sGrDataPointBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrDataPointDescriptionType createSGrDataPointDescriptionType() {
		SGrDataPointDescriptionTypeImpl sGrDataPointDescriptionType = new SGrDataPointDescriptionTypeImpl();
		return sGrDataPointDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrDeviceBaseType createSGrDeviceBaseType() {
		SGrDeviceBaseTypeImpl sGrDeviceBaseType = new SGrDeviceBaseTypeImpl();
		return sGrDeviceBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrDeviceProfileType createSGrDeviceProfileType() {
		SGrDeviceProfileTypeImpl sGrDeviceProfileType = new SGrDeviceProfileTypeImpl();
		return sGrDeviceProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEnumListType createSGrEnumListType() {
		SGrEnumListTypeImpl sGrEnumListType = new SGrEnumListTypeImpl();
		return sGrEnumListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrFlexAssistanceType createSGrFlexAssistanceType() {
		SGrFlexAssistanceTypeImpl sGrFlexAssistanceType = new SGrFlexAssistanceTypeImpl();
		return sGrFlexAssistanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrFunctionalProfileBaseType createSGrFunctionalProfileBaseType() {
		SGrFunctionalProfileBaseTypeImpl sGrFunctionalProfileBaseType = new SGrFunctionalProfileBaseTypeImpl();
		return sGrFunctionalProfileBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrGenDeviceFrame createSGrGenDeviceFrame() {
		SGrGenDeviceFrameImpl sGrGenDeviceFrame = new SGrGenDeviceFrameImpl();
		return sGrGenDeviceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrGenFunctionalProfileType createSGrGenFunctionalProfileType() {
		SGrGenFunctionalProfileTypeImpl sGrGenFunctionalProfileType = new SGrGenFunctionalProfileTypeImpl();
		return sGrGenFunctionalProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrLegibDocumentationType createSGrLegibDocumentationType() {
		SGrLegibDocumentationTypeImpl sGrLegibDocumentationType = new SGrLegibDocumentationTypeImpl();
		return sGrLegibDocumentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrNamelistType createSGrNamelistType() {
		SGrNamelistTypeImpl sGrNamelistType = new SGrNamelistTypeImpl();
		return sGrNamelistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrProfileDescriptionType createSGrProfileDescriptionType() {
		SGrProfileDescriptionTypeImpl sGrProfileDescriptionType = new SGrProfileDescriptionTypeImpl();
		return sGrProfileDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrProfilenumberType createSGrProfilenumberType() {
		SGrProfilenumberTypeImpl sGrProfilenumberType = new SGrProfilenumberTypeImpl();
		return sGrProfilenumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrReleaseNotes createSGrReleaseNotes() {
		SGrReleaseNotesImpl sGrReleaseNotes = new SGrReleaseNotesImpl();
		return sGrReleaseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrScalingType createSGrScalingType() {
		SGrScalingTypeImpl sGrScalingType = new SGrScalingTypeImpl();
		return sGrScalingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSmoothTransitionType createSGrSmoothTransitionType() {
		SGrSmoothTransitionTypeImpl sGrSmoothTransitionType = new SGrSmoothTransitionTypeImpl();
		return sGrSmoothTransitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrStabilityFallbackType createSGrStabilityFallbackType() {
		SGrStabilityFallbackTypeImpl sGrStabilityFallbackType = new SGrStabilityFallbackTypeImpl();
		return sGrStabilityFallbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrVersionNumberType createSGrVersionNumberType() {
		SGrVersionNumberTypeImpl sGrVersionNumberType = new SGrVersionNumberTypeImpl();
		return sGrVersionNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaDomHotWOpModeType createCtaDomHotWOpModeTypeFromString(EDataType eDataType, String initialValue) {
		CtaDomHotWOpModeType result = CtaDomHotWOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaDomHotWOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHCOpModeType createCtaHCOpModeTypeFromString(EDataType eDataType, String initialValue) {
		CtaHCOpModeType result = CtaHCOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaHCOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHPOpModeType createCtaHPOpModeTypeFromString(EDataType eDataType, String initialValue) {
		CtaHPOpModeType result = CtaHPOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaHPOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHPOpStateType createCtaHPOpStateTypeFromString(EDataType eDataType, String initialValue) {
		CtaHPOpStateType result = CtaHPOpStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaHPOpStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovBufferStateType createHovBufferStateTypeFromString(EDataType eDataType, String initialValue) {
		HovBufferStateType result = HovBufferStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovBufferStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovDomHotWOpModeType createHovDomHotWOpModeTypeFromString(EDataType eDataType, String initialValue) {
		HovDomHotWOpModeType result = HovDomHotWOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovDomHotWOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovDomHotWStateType createHovDomHotWStateTypeFromString(EDataType eDataType, String initialValue) {
		HovDomHotWStateType result = HovDomHotWStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovDomHotWStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHCOpModeType createHovHCOpModeTypeFromString(EDataType eDataType, String initialValue) {
		HovHCOpModeType result = HovHCOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHCOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHCOpStateType createHovHCOpStateTypeFromString(EDataType eDataType, String initialValue) {
		HovHCOpStateType result = HovHCOpStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHCOpStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPActBufferStateType createHovHPActBufferStateTypeFromString(EDataType eDataType, String initialValue) {
		HovHPActBufferStateType result = HovHPActBufferStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHPActBufferStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPOpModeType createHovHPOpModeTypeFromString(EDataType eDataType, String initialValue) {
		HovHPOpModeType result = HovHPOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHPOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPOpStateType createHovHPOpStateTypeFromString(EDataType eDataType, String initialValue) {
		HovHPOpStateType result = HovHPOpStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHPOpStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovSGReadySrcSelType createHovSGReadySrcSelTypeFromString(EDataType eDataType, String initialValue) {
		HovSGReadySrcSelType result = HovSGReadySrcSelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovSGReadySrcSelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovType createHovTypeFromString(EDataType eDataType, String initialValue) {
		HovType result = HovType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfOperationType createLevelOfOperationTypeFromString(EDataType eDataType, String initialValue) {
		LevelOfOperationType result = LevelOfOperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelOfOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileTypeEnumType createProfileTypeEnumTypeFromString(EDataType eDataType, String initialValue) {
		ProfileTypeEnumType result = ProfileTypeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileTypeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrBool2BitRankType createSGrBool2BitRankTypeFromString(EDataType eDataType, String initialValue) {
		SGrBool2BitRankType result = SGrBool2BitRankType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrBool2BitRankTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrDeviceKindType createSGrDeviceKindTypeFromString(EDataType eDataType, String initialValue) {
		SGrDeviceKindType result = SGrDeviceKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrDeviceKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGReadyStateLv1Type createSGReadyStateLv1TypeFromString(EDataType eDataType, String initialValue) {
		SGReadyStateLv1Type result = SGReadyStateLv1Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGReadyStateLv1TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGReadyStateLv2Type createSGReadyStateLv2TypeFromString(EDataType eDataType, String initialValue) {
		SGReadyStateLv2Type result = SGReadyStateLv2Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGReadyStateLv2TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVSEStateLv1Type createSGrEVSEStateLv1TypeFromString(EDataType eDataType, String initialValue) {
		SGrEVSEStateLv1Type result = SGrEVSEStateLv1Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrEVSEStateLv1TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVSEStateLv2Type createSGrEVSEStateLv2TypeFromString(EDataType eDataType, String initialValue) {
		SGrEVSEStateLv2Type result = SGrEVSEStateLv2Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrEVSEStateLv2TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVStateType createSGrEVStateTypeFromString(EDataType eDataType, String initialValue) {
		SGrEVStateType result = SGrEVStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrEVStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHCOpModeType createSGrHCOpModeTypeFromString(EDataType eDataType, String initialValue) {
		SGrHCOpModeType result = SGrHCOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrHCOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SgrHCOpStateType createSgrHCOpStateTypeFromString(EDataType eDataType, String initialValue) {
		SgrHCOpStateType result = SgrHCOpStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSgrHCOpStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHPOpModeType createSGrHPOpModeTypeFromString(EDataType eDataType, String initialValue) {
		SGrHPOpModeType result = SGrHPOpModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrHPOpModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHPOpstateType createSGrHPOpstateTypeFromString(EDataType eDataType, String initialValue) {
		SGrHPOpstateType result = SGrHPOpstateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrHPOpstateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrLanguageType createSGrLanguageTypeFromString(EDataType eDataType, String initialValue) {
		SGrLanguageType result = SGrLanguageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrManufacturerIDType createSGrManufacturerIDTypeFromString(EDataType eDataType, String initialValue) {
		SGrManufacturerIDType result = SGrManufacturerIDType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrManufacturerIDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrMeasValueSourceType createSGrMeasValueSourceTypeFromString(EDataType eDataType, String initialValue) {
		SGrMeasValueSourceType result = SGrMeasValueSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrMeasValueSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrMeasValueType createSGrMeasValueTypeFromString(EDataType eDataType, String initialValue) {
		SGrMeasValueType result = SGrMeasValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrMeasValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrMROPresenceLevelIndicationType createSGrMROPresenceLevelIndicationTypeFromString(EDataType eDataType, String initialValue) {
		SGrMROPresenceLevelIndicationType result = SGrMROPresenceLevelIndicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrMROPresenceLevelIndicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrObligLvlType createSGrObligLvlTypeFromString(EDataType eDataType, String initialValue) {
		SGrObligLvlType result = SGrObligLvlType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrObligLvlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrOCPPStateType createSGrOCPPStateTypeFromString(EDataType eDataType, String initialValue) {
		SGrOCPPStateType result = SGrOCPPStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrOCPPStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrPowerSourceType createSGrPowerSourceTypeFromString(EDataType eDataType, String initialValue) {
		SGrPowerSourceType result = SGrPowerSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrPowerSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrReleaseState createSGrReleaseStateFromString(EDataType eDataType, String initialValue) {
		SGrReleaseState result = SGrReleaseState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrReleaseStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrRWPType createSGrRWPTypeFromString(EDataType eDataType, String initialValue) {
		SGrRWPType result = SGrRWPType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrRWPTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPFeedInStateLv2Type createSGrSGCPFeedInStateLv2TypeFromString(EDataType eDataType, String initialValue) {
		SGrSGCPFeedInStateLv2Type result = SGrSGCPFeedInStateLv2Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSGCPFeedInStateLv2TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPLoadStateLv2Type createSGrSGCPLoadStateLv2TypeFromString(EDataType eDataType, String initialValue) {
		SGrSGCPLoadStateLv2Type result = SGrSGCPLoadStateLv2Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSGCPLoadStateLv2TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPServiceType createSGrSGCPServiceTypeFromString(EDataType eDataType, String initialValue) {
		SGrSGCPServiceType result = SGrSGCPServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSGCPServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSunspStateCodesType createSGrSunspStateCodesTypeFromString(EDataType eDataType, String initialValue) {
		SGrSunspStateCodesType result = SGrSunspStateCodesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSunspStateCodesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrTransportServicesUsedListType createSGrTransportServicesUsedListTypeFromString(EDataType eDataType, String initialValue) {
		SGrTransportServicesUsedListType result = SGrTransportServicesUsedListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrTransportServicesUsedListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrUnits createSGrUnitsFromString(EDataType eDataType, String initialValue) {
		SGrUnits result = SGrUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StiHPOpstateType createStiHPOpstateTypeFromString(EDataType eDataType, String initialValue) {
		StiHPOpstateType result = StiHPOpstateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStiHPOpstateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProfileTypeEnumType createSubProfileTypeEnumTypeFromString(EDataType eDataType, String initialValue) {
		SubProfileTypeEnumType result = SubProfileTypeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubProfileTypeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaDomHotWOpModeType createCtaDomHotWOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCtaDomHotWOpModeTypeFromString(V0Package.eINSTANCE.getCtaDomHotWOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaDomHotWOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCtaDomHotWOpModeTypeToString(V0Package.eINSTANCE.getCtaDomHotWOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHCOpModeType createCtaHCOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCtaHCOpModeTypeFromString(V0Package.eINSTANCE.getCtaHCOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaHCOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCtaHCOpModeTypeToString(V0Package.eINSTANCE.getCtaHCOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHPOpModeType createCtaHPOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCtaHPOpModeTypeFromString(V0Package.eINSTANCE.getCtaHPOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaHPOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCtaHPOpModeTypeToString(V0Package.eINSTANCE.getCtaHPOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtaHPOpStateType createCtaHPOpStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCtaHPOpStateTypeFromString(V0Package.eINSTANCE.getCtaHPOpStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtaHPOpStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCtaHPOpStateTypeToString(V0Package.eINSTANCE.getCtaHPOpStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovBufferStateType createHovBufferStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovBufferStateTypeFromString(V0Package.eINSTANCE.getHovBufferStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovBufferStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovBufferStateTypeToString(V0Package.eINSTANCE.getHovBufferStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovDomHotWOpModeType createHovDomHotWOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovDomHotWOpModeTypeFromString(V0Package.eINSTANCE.getHovDomHotWOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovDomHotWOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovDomHotWOpModeTypeToString(V0Package.eINSTANCE.getHovDomHotWOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovDomHotWStateType createHovDomHotWStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovDomHotWStateTypeFromString(V0Package.eINSTANCE.getHovDomHotWStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovDomHotWStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovDomHotWStateTypeToString(V0Package.eINSTANCE.getHovDomHotWStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHCOpModeType createHovHCOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovHCOpModeTypeFromString(V0Package.eINSTANCE.getHovHCOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHCOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovHCOpModeTypeToString(V0Package.eINSTANCE.getHovHCOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHCOpStateType createHovHCOpStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovHCOpStateTypeFromString(V0Package.eINSTANCE.getHovHCOpStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHCOpStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovHCOpStateTypeToString(V0Package.eINSTANCE.getHovHCOpStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPActBufferStateType createHovHPActBufferStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovHPActBufferStateTypeFromString(V0Package.eINSTANCE.getHovHPActBufferStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHPActBufferStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovHPActBufferStateTypeToString(V0Package.eINSTANCE.getHovHPActBufferStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPOpModeType createHovHPOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovHPOpModeTypeFromString(V0Package.eINSTANCE.getHovHPOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHPOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovHPOpModeTypeToString(V0Package.eINSTANCE.getHovHPOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovHPOpStateType createHovHPOpStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovHPOpStateTypeFromString(V0Package.eINSTANCE.getHovHPOpStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovHPOpStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovHPOpStateTypeToString(V0Package.eINSTANCE.getHovHPOpStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovSGReadySrcSelType createHovSGReadySrcSelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovSGReadySrcSelTypeFromString(V0Package.eINSTANCE.getHovSGReadySrcSelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovSGReadySrcSelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovSGReadySrcSelTypeToString(V0Package.eINSTANCE.getHovSGReadySrcSelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HovType createHovTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHovTypeFromString(V0Package.eINSTANCE.getHovType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHovTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHovTypeToString(V0Package.eINSTANCE.getHovType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfOperationType createLevelOfOperationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLevelOfOperationTypeFromString(V0Package.eINSTANCE.getLevelOfOperationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelOfOperationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLevelOfOperationTypeToString(V0Package.eINSTANCE.getLevelOfOperationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileTypeEnumType createProfileTypeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProfileTypeEnumTypeFromString(V0Package.eINSTANCE.getProfileTypeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileTypeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProfileTypeEnumTypeToString(V0Package.eINSTANCE.getProfileTypeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrBool2BitRankType createSGrBool2BitRankTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrBool2BitRankTypeFromString(V0Package.eINSTANCE.getSGrBool2BitRankType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrBool2BitRankTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrBool2BitRankTypeToString(V0Package.eINSTANCE.getSGrBool2BitRankType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrDeviceKindType createSGrDeviceKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrDeviceKindTypeFromString(V0Package.eINSTANCE.getSGrDeviceKindType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrDeviceKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrDeviceKindTypeToString(V0Package.eINSTANCE.getSGrDeviceKindType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGReadyStateLv1Type createSGReadyStateLv1TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGReadyStateLv1TypeFromString(V0Package.eINSTANCE.getSGReadyStateLv1Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGReadyStateLv1TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGReadyStateLv1TypeToString(V0Package.eINSTANCE.getSGReadyStateLv1Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGReadyStateLv2Type createSGReadyStateLv2TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGReadyStateLv2TypeFromString(V0Package.eINSTANCE.getSGReadyStateLv2Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGReadyStateLv2TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGReadyStateLv2TypeToString(V0Package.eINSTANCE.getSGReadyStateLv2Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVSEStateLv1Type createSGrEVSEStateLv1TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrEVSEStateLv1TypeFromString(V0Package.eINSTANCE.getSGrEVSEStateLv1Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrEVSEStateLv1TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrEVSEStateLv1TypeToString(V0Package.eINSTANCE.getSGrEVSEStateLv1Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVSEStateLv2Type createSGrEVSEStateLv2TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrEVSEStateLv2TypeFromString(V0Package.eINSTANCE.getSGrEVSEStateLv2Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrEVSEStateLv2TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrEVSEStateLv2TypeToString(V0Package.eINSTANCE.getSGrEVSEStateLv2Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrEVStateType createSGrEVStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrEVStateTypeFromString(V0Package.eINSTANCE.getSGrEVStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrEVStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrEVStateTypeToString(V0Package.eINSTANCE.getSGrEVStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHCOpModeType createSGrHCOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrHCOpModeTypeFromString(V0Package.eINSTANCE.getSGrHCOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrHCOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrHCOpModeTypeToString(V0Package.eINSTANCE.getSGrHCOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SgrHCOpStateType createSgrHCOpStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSgrHCOpStateTypeFromString(V0Package.eINSTANCE.getSgrHCOpStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSgrHCOpStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSgrHCOpStateTypeToString(V0Package.eINSTANCE.getSgrHCOpStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHPOpModeType createSGrHPOpModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrHPOpModeTypeFromString(V0Package.eINSTANCE.getSGrHPOpModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrHPOpModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrHPOpModeTypeToString(V0Package.eINSTANCE.getSGrHPOpModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrHPOpstateType createSGrHPOpstateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrHPOpstateTypeFromString(V0Package.eINSTANCE.getSGrHPOpstateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrHPOpstateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrHPOpstateTypeToString(V0Package.eINSTANCE.getSGrHPOpstateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrLanguageType createSGrLanguageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrLanguageTypeFromString(V0Package.eINSTANCE.getSGrLanguageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrLanguageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrLanguageTypeToString(V0Package.eINSTANCE.getSGrLanguageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrManufacturerIDType createSGrManufacturerIDTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrManufacturerIDTypeFromString(V0Package.eINSTANCE.getSGrManufacturerIDType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrManufacturerIDTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrManufacturerIDTypeToString(V0Package.eINSTANCE.getSGrManufacturerIDType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrMeasValueSourceType createSGrMeasValueSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrMeasValueSourceTypeFromString(V0Package.eINSTANCE.getSGrMeasValueSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrMeasValueSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrMeasValueSourceTypeToString(V0Package.eINSTANCE.getSGrMeasValueSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrMeasValueType createSGrMeasValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrMeasValueTypeFromString(V0Package.eINSTANCE.getSGrMeasValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrMeasValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrMeasValueTypeToString(V0Package.eINSTANCE.getSGrMeasValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrMROPresenceLevelIndicationType createSGrMROPresenceLevelIndicationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrMROPresenceLevelIndicationTypeFromString(V0Package.eINSTANCE.getSGrMROPresenceLevelIndicationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrMROPresenceLevelIndicationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrMROPresenceLevelIndicationTypeToString(V0Package.eINSTANCE.getSGrMROPresenceLevelIndicationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrObligLvlType createSGrObligLvlTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrObligLvlTypeFromString(V0Package.eINSTANCE.getSGrObligLvlType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrObligLvlTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrObligLvlTypeToString(V0Package.eINSTANCE.getSGrObligLvlType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrOCPPStateType createSGrOCPPStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrOCPPStateTypeFromString(V0Package.eINSTANCE.getSGrOCPPStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrOCPPStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrOCPPStateTypeToString(V0Package.eINSTANCE.getSGrOCPPStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrPowerSourceType createSGrPowerSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrPowerSourceTypeFromString(V0Package.eINSTANCE.getSGrPowerSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrPowerSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrPowerSourceTypeToString(V0Package.eINSTANCE.getSGrPowerSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createSGrPrecisionTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrPrecisionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createSGrPrecisionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrPrecisionTypeFromString(V0Package.eINSTANCE.getSGrPrecisionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrPrecisionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrPrecisionTypeToString(V0Package.eINSTANCE.getSGrPrecisionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrReleaseState createSGrReleaseStateObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrReleaseStateFromString(V0Package.eINSTANCE.getSGrReleaseState(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrReleaseStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrReleaseStateToString(V0Package.eINSTANCE.getSGrReleaseState(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrRWPType createSGrRWPTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrRWPTypeFromString(V0Package.eINSTANCE.getSGrRWPType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrRWPTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrRWPTypeToString(V0Package.eINSTANCE.getSGrRWPType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPFeedInStateLv2Type createSGrSGCPFeedInStateLv2TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrSGCPFeedInStateLv2TypeFromString(V0Package.eINSTANCE.getSGrSGCPFeedInStateLv2Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSGCPFeedInStateLv2TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrSGCPFeedInStateLv2TypeToString(V0Package.eINSTANCE.getSGrSGCPFeedInStateLv2Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPLoadStateLv2Type createSGrSGCPLoadStateLv2TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrSGCPLoadStateLv2TypeFromString(V0Package.eINSTANCE.getSGrSGCPLoadStateLv2Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSGCPLoadStateLv2TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrSGCPLoadStateLv2TypeToString(V0Package.eINSTANCE.getSGrSGCPLoadStateLv2Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSGCPServiceType createSGrSGCPServiceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrSGCPServiceTypeFromString(V0Package.eINSTANCE.getSGrSGCPServiceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSGCPServiceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrSGCPServiceTypeToString(V0Package.eINSTANCE.getSGrSGCPServiceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSGrSpecialQualityReqTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSpecialQualityReqTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrSunspStateCodesType createSGrSunspStateCodesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrSunspStateCodesTypeFromString(V0Package.eINSTANCE.getSGrSunspStateCodesType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrSunspStateCodesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrSunspStateCodesTypeToString(V0Package.eINSTANCE.getSGrSunspStateCodesType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrTransportServicesUsedListType createSGrTransportServicesUsedListTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrTransportServicesUsedListTypeFromString(V0Package.eINSTANCE.getSGrTransportServicesUsedListType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrTransportServicesUsedListTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrTransportServicesUsedListTypeToString(V0Package.eINSTANCE.getSGrTransportServicesUsedListType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGrUnits createSGrUnitsObjectFromString(EDataType eDataType, String initialValue) {
		return createSGrUnitsFromString(V0Package.eINSTANCE.getSGrUnits(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSGrUnitsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSGrUnitsToString(V0Package.eINSTANCE.getSGrUnits(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StiHPOpstateType createStiHPOpstateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStiHPOpstateTypeFromString(V0Package.eINSTANCE.getStiHPOpstateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStiHPOpstateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStiHPOpstateTypeToString(V0Package.eINSTANCE.getStiHPOpstateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProfileTypeEnumType createSubProfileTypeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSubProfileTypeEnumTypeFromString(V0Package.eINSTANCE.getSubProfileTypeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubProfileTypeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubProfileTypeEnumTypeToString(V0Package.eINSTANCE.getSubProfileTypeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextElementTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextElementTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0Package getV0Package() {
		return (V0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static V0Package getPackage() {
		return V0Package.eINSTANCE;
	}

} //V0FactoryImpl
