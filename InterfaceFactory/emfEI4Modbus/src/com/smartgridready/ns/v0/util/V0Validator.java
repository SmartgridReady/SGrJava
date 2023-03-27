/**
 */
package com.smartgridready.ns.v0.util;

import com.smartgridready.ns.v0.*;

import java.math.BigInteger;

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
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE:
				return validateContactAPIInterfaceDescType((ContactAPIInterfaceDescType)value, diagnostics, context);
			case V0Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case V0Package.FUNCTIONAL_PROFILE_TYPE:
				return validateFunctionalProfileType((FunctionalProfileType)value, diagnostics, context);
			case V0Package.HEADER_ENTRY:
				return validateHeaderEntry((HeaderEntry)value, diagnostics, context);
			case V0Package.HEADER_LIST:
				return validateHeaderList((HeaderList)value, diagnostics, context);
			case V0Package.IP_ADDR_TYPE:
				return validateIpADDRType((IpADDRType)value, diagnostics, context);
			case V0Package.MODBUS_JMES_PATH_TYPE:
				return validateModbusJMESPathType((ModbusJMESPathType)value, diagnostics, context);
			case V0Package.NETWORK_CONNECTION_STATE_TYPE:
				return validateNetworkConnectionStateType((NetworkConnectionStateType)value, diagnostics, context);
			case V0Package.RESPONSE_QUERY:
				return validateResponseQuery((ResponseQuery)value, diagnostics, context);
			case V0Package.REST_SERVICE_CALL:
				return validateRestServiceCall((RestServiceCall)value, diagnostics, context);
			case V0Package.RTU_DEV_INSTANCE_TYPE:
				return validateRTUDevInstanceType((RTUDevInstanceType)value, diagnostics, context);
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE:
				return validateRTUtrspSrvInstanceType((RTUtrspSrvInstanceType)value, diagnostics, context);
			case V0Package.RTU_TYPE:
				return validateRTUType((RTUType)value, diagnostics, context);
			case V0Package.SGR_ACCESS_PROTECTION_ENABLED_TYPE:
				return validateSGrAccessProtectionEnabledType((SGrAccessProtectionEnabledType)value, diagnostics, context);
			case V0Package.SGR_ATTR4_GENERIC_TYPE:
				return validateSGrAttr4GenericType((SGrAttr4GenericType)value, diagnostics, context);
			case V0Package.SGR_ATTR4_MODBUS_TYPE:
				return validateSGrAttr4ModbusType((SGrAttr4ModbusType)value, diagnostics, context);
			case V0Package.SGR_ATTR4_REST_API_TYPE:
				return validateSGrAttr4RestAPIType((SGrAttr4RestAPIType)value, diagnostics, context);
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE:
				return validateSGrBasicGenDataPointTypeType((SGrBasicGenDataPointTypeType)value, diagnostics, context);
			case V0Package.SGR_BITMAPPER_LIST_TYPE:
				return validateSGrBitmapperListType((SGrBitmapperListType)value, diagnostics, context);
			case V0Package.SGR_CHANGE_LOG:
				return validateSGrChangeLog((SGrChangeLog)value, diagnostics, context);
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME:
				return validateSGrContactAPIDeviceFrame((SGrContactAPIDeviceFrame)value, diagnostics, context);
			case V0Package.SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE:
				return validateSGrContactAPIFunctionalProfileType((SGrContactAPIFunctionalProfileType)value, diagnostics, context);
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE:
				return validateSGrFunctionalProfileFrameType((SGrFunctionalProfileFrameType)value, diagnostics, context);
			case V0Package.SGR_GEN_DEVICE_FRAME:
				return validateSGrGenDeviceFrame((SGrGenDeviceFrame)value, diagnostics, context);
			case V0Package.SGR_GEN_FUNCTIONAL_PROFILE_TYPE:
				return validateSGrGenFunctionalProfileType((SGrGenFunctionalProfileType)value, diagnostics, context);
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE:
				return validateSGrLegibDocumentationType((SGrLegibDocumentationType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_BITMAP_MAPPER_TYPE:
				return validateSGrModbusBitmapMapperType((SGrModbusBitmapMapperType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE:
				return validateSGrModbusDataPointDescriptionType((SGrModbusDataPointDescriptionType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE:
				return validateSGrModbusDataPointType((SGrModbusDataPointType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_DEVICE_FRAME:
				return validateSGrModbusDeviceFrame((SGrModbusDeviceFrame)value, diagnostics, context);
			case V0Package.SGR_MODBUS_ENUM_MAPPER_TYPE:
				return validateSGrModbusEnumMapperType((SGrModbusEnumMapperType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE:
				return validateSGrModbusFunctionalProfileType((SGrModbusFunctionalProfileType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE:
				return validateSGrModbusInterfaceDescriptionType((SGrModbusInterfaceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_NAMELIST_TYPE:
				return validateSGrNamelistType((SGrNamelistType)value, diagnostics, context);
			case V0Package.SGR_PROFILE_DESCRIPTION_TYPE:
				return validateSGrProfileDescriptionType((SGrProfileDescriptionType)value, diagnostics, context);
			case V0Package.SGR_PROFILENUMBER_TYPE:
				return validateSGrProfilenumberType((SGrProfilenumberType)value, diagnostics, context);
			case V0Package.SGR_RELEASE_NOTES:
				return validateSGrReleaseNotes((SGrReleaseNotes)value, diagnostics, context);
			case V0Package.SG_RREST_API_BEARER_TYPE:
				return validateSGRrestAPIBearerType((SGRrestAPIBearerType)value, diagnostics, context);
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE:
				return validateSGrRestAPIDataPointDescriptionType((SGrRestAPIDataPointDescriptionType)value, diagnostics, context);
			case V0Package.SGR_REST_API_DATA_POINT_TYPE:
				return validateSGrRestAPIDataPointType((SGrRestAPIDataPointType)value, diagnostics, context);
			case V0Package.SGR_REST_API_DEVICE_FRAME:
				return validateSGrRestAPIDeviceFrame((SGrRestAPIDeviceFrame)value, diagnostics, context);
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE:
				return validateSGrRestAPIFunctionalProfileType((SGrRestAPIFunctionalProfileType)value, diagnostics, context);
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE:
				return validateSGrRestAPIInterfaceDescriptionType((SGrRestAPIInterfaceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_REST_BASIC_TYPE:
				return validateSGrRestBasicType((SGrRestBasicType)value, diagnostics, context);
			case V0Package.SGR_SCALING_TYPE:
				return validateSGrScalingType((SGrScalingType)value, diagnostics, context);
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE:
				return validateSGrSerialInterfaceCapabilityType((SGrSerialInterfaceCapabilityType)value, diagnostics, context);
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE:
				return validateSGrSmoothTransitionType((SGrSmoothTransitionType)value, diagnostics, context);
			case V0Package.SGR_STABILITY_FALLBACK_TYPE:
				return validateSGrStabilityFallbackType((SGrStabilityFallbackType)value, diagnostics, context);
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE:
				return validateSGrTimeSyncBlockNotificationType((SGrTimeSyncBlockNotificationType)value, diagnostics, context);
			case V0Package.SGR_VERSION_NUMBER_TYPE:
				return validateSGrVersionNumberType((SGrVersionNumberType)value, diagnostics, context);
			case V0Package.TCP_DEV_INSTANCE_TYPE:
				return validateTCPDevInstanceType((TCPDevInstanceType)value, diagnostics, context);
			case V0Package.TC_PTRSP_SRV_INSTANCE_TYPE:
				return validateTCPtrspSrvInstanceType((TCPtrspSrvInstanceType)value, diagnostics, context);
			case V0Package.TCP_TYPE:
				return validateTCPType((TCPType)value, diagnostics, context);
			case V0Package.TPIP_MODBUS:
				return validateTPIPModbus((TPIPModbus)value, diagnostics, context);
			case V0Package.TPIP_V4GEN_ADDR_TYPE:
				return validateTPipV4genAddrType((TPipV4genAddrType)value, diagnostics, context);
			case V0Package.TPIP_V6GEN_ADDR_TYPE:
				return validateTPipV6genAddrType((TPipV6genAddrType)value, diagnostics, context);
			case V0Package.TPRTU_MODBUS:
				return validateTPRTUModbus((TPRTUModbus)value, diagnostics, context);
			case V0Package.TRSP_SERVICE_MODBUS_TYPE:
				return validateTrspServiceModbusType((TrspServiceModbusType)value, diagnostics, context);
			case V0Package.TS_GR_MODBUS_REGISTER_REF:
				return validateTSGrModbusRegisterRef((TSGrModbusRegisterRef)value, diagnostics, context);
			case V0Package.CTA_DHW_OP_MODE_TYPE:
				return validateCtaDHWOpModeType((CtaDHWOpModeType)value, diagnostics, context);
			case V0Package.EBAUD_RATE_TYPE:
				return validateEBaudRateType((EBaudRateType)value, diagnostics, context);
			case V0Package.EBYTE_LEN_TYPE:
				return validateEByteLenType((EByteLenType)value, diagnostics, context);
			case V0Package.EPARITY_TYPE:
				return validateEParityType((EParityType)value, diagnostics, context);
			case V0Package.ESTOP_BIT_LEN_TYPE:
				return validateEStopBitLenType((EStopBitLenType)value, diagnostics, context);
			case V0Package.HTTP_METHOD:
				return validateHttpMethod((HttpMethod)value, diagnostics, context);
			case V0Package.LEVEL_OF_OPERATION_TYPE:
				return validateLevelOfOperationType((LevelOfOperationType)value, diagnostics, context);
			case V0Package.MASTER_FUNCTIONS_SUPPORTED_TYPE:
				return validateMasterFunctionsSupportedType((MasterFunctionsSupportedType)value, diagnostics, context);
			case V0Package.MODBUS_INTERFACE_SELECTION_TYPE:
				return validateModbusInterfaceSelectionType((ModbusInterfaceSelectionType)value, diagnostics, context);
			case V0Package.PROFILE_TYPE_ENUM_TYPE:
				return validateProfileTypeEnumType((ProfileTypeEnumType)value, diagnostics, context);
			case V0Package.RESPONSE_QUERY_TYPE:
				return validateResponseQueryType((ResponseQueryType)value, diagnostics, context);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE:
				return validateSGrBool2BitRankType((SGrBool2BitRankType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_KIND_TYPE:
				return validateSGrDeviceKindType((SGrDeviceKindType)value, diagnostics, context);
			case V0Package.SGR_DHW_OP_MODE_TYPE:
				return validateSGrDHWOpModeType((SGrDHWOpModeType)value, diagnostics, context);
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
			case V0Package.SGR_HP_ACT_BUFFER_STATE_TYPE:
				return validateSGrHPActBufferStateType((SGrHPActBufferStateType)value, diagnostics, context);
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
			case V0Package.SGR_MODBUS_LAYER6_DEVIATION_TYPE:
				return validateSGrModbusLayer6DeviationType((SGrModbusLayer6DeviationType)value, diagnostics, context);
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
			case V0Package.SGR_REST_API_AUTHENTICATION_ENUM_METHOD_TYPE:
				return validateSGrRestAPIAuthenticationEnumMethodType((SGrRestAPIAuthenticationEnumMethodType)value, diagnostics, context);
			case V0Package.SGR_REST_AP_IDATA_TYPE_TYPE:
				return validateSGrRestAPIdataTypeType((SGrRestAPIdataTypeType)value, diagnostics, context);
			case V0Package.SGR_REST_API_INTERFACE_SELECTIONTYPE:
				return validateSGrRestAPIInterfaceSelectiontype((SGrRestAPIInterfaceSelectiontype)value, diagnostics, context);
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
			case V0Package.STI_HP_OPSTATE_STIEBEL_TYPE:
				return validateStiHPOpstateStiebelType((StiHPOpstateStiebelType)value, diagnostics, context);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE:
				return validateSubProfileTypeEnumType((SubProfileTypeEnumType)value, diagnostics, context);
			case V0Package.TENUM_CONVERSION_FCT:
				return validateTEnumConversionFct((TEnumConversionFct)value, diagnostics, context);
			case V0Package.TENUM_EXCEPTION_CODE_TYPE:
				return validateTEnumExceptionCodeType((TEnumExceptionCodeType)value, diagnostics, context);
			case V0Package.TENUM_OBJECT_TYPE:
				return validateTEnumObjectType((TEnumObjectType)value, diagnostics, context);
			case V0Package.BITMASK_TYPE:
				return validateBitmaskType((byte[])value, diagnostics, context);
			case V0Package.CTA_DHW_OP_MODE_TYPE_OBJECT:
				return validateCtaDHWOpModeTypeObject((CtaDHWOpModeType)value, diagnostics, context);
			case V0Package.DP_SIZE_NR_REGISTERS_TYPE:
				return validateDpSizeNrRegistersType((Integer)value, diagnostics, context);
			case V0Package.DP_SIZE_NR_REGISTERS_TYPE_OBJECT:
				return validateDpSizeNrRegistersTypeObject((Integer)value, diagnostics, context);
			case V0Package.EBAUD_RATE_TYPE_OBJECT:
				return validateEBaudRateTypeObject((EBaudRateType)value, diagnostics, context);
			case V0Package.EBYTE_LEN_TYPE_OBJECT:
				return validateEByteLenTypeObject((EByteLenType)value, diagnostics, context);
			case V0Package.EPARITY_TYPE_OBJECT:
				return validateEParityTypeObject((EParityType)value, diagnostics, context);
			case V0Package.ESTOP_BIT_LEN_TYPE_OBJECT:
				return validateEStopBitLenTypeObject((EStopBitLenType)value, diagnostics, context);
			case V0Package.HTTP_METHOD_OBJECT:
				return validateHttpMethodObject((HttpMethod)value, diagnostics, context);
			case V0Package.IP_V4N1_TYPE:
				return validateIpV4n1Type((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N1_TYPE1:
				return validateIpV4n1Type1((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N2_TYPE:
				return validateIpV4n2Type((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N2_TYPE1:
				return validateIpV4n2Type1((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N3_TYPE:
				return validateIpV4n3Type((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N3_TYPE1:
				return validateIpV4n3Type1((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N4_TYPE:
				return validateIpV4n4Type((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4N4_TYPE1:
				return validateIpV4n4Type1((BigInteger)value, diagnostics, context);
			case V0Package.IP_V4PORT_NR_TYPE:
				return validateIpV4portNrType((Long)value, diagnostics, context);
			case V0Package.IP_V4PORT_NR_TYPE_OBJECT:
				return validateIpV4portNrTypeObject((Long)value, diagnostics, context);
			case V0Package.LEVEL_OF_OPERATION_TYPE_OBJECT:
				return validateLevelOfOperationTypeObject((LevelOfOperationType)value, diagnostics, context);
			case V0Package.MASTER_FUNCTIONS_SUPPORTED_TYPE_OBJECT:
				return validateMasterFunctionsSupportedTypeObject((MasterFunctionsSupportedType)value, diagnostics, context);
			case V0Package.MODBUS_INTERFACE_SELECTION_TYPE_OBJECT:
				return validateModbusInterfaceSelectionTypeObject((ModbusInterfaceSelectionType)value, diagnostics, context);
			case V0Package.PLACE_HOLDER4FUTURE_EXTENSIONS_TYPE:
				return validatePlaceHolder4futureExtensionsType((String)value, diagnostics, context);
			case V0Package.PRELIM_STRING_DEF_TYPE:
				return validatePrelimStringDefType((String)value, diagnostics, context);
			case V0Package.PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return validateProfileTypeEnumTypeObject((ProfileTypeEnumType)value, diagnostics, context);
			case V0Package.RESPONSE_QUERY_TYPE_OBJECT:
				return validateResponseQueryTypeObject((ResponseQueryType)value, diagnostics, context);
			case V0Package.REST_API_END_POINT_TYPE:
				return validateRestAPIEndPointType((String)value, diagnostics, context);
			case V0Package.REST_APIJMES_PATH_TYPE:
				return validateRestAPIJMESPathType((String)value, diagnostics, context);
			case V0Package.REST_BASIC_PASSWORD_TYPE:
				return validateRestBasicPasswordType((String)value, diagnostics, context);
			case V0Package.REST_BASIC_USERNAME_TYPE:
				return validateRestBasicUsernameType((String)value, diagnostics, context);
			case V0Package.SGR_BOOL2_BIT_RANK_TYPE_OBJECT:
				return validateSGrBool2BitRankTypeObject((SGrBool2BitRankType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_KIND_TYPE_OBJECT:
				return validateSGrDeviceKindTypeObject((SGrDeviceKindType)value, diagnostics, context);
			case V0Package.SGR_DHW_OP_MODE_TYPE_OBJECT:
				return validateSGrDHWOpModeTypeObject((SGrDHWOpModeType)value, diagnostics, context);
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
			case V0Package.SGR_HP_ACT_BUFFER_STATE_TYPE_OBJECT:
				return validateSGrHPActBufferStateTypeObject((SGrHPActBufferStateType)value, diagnostics, context);
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
			case V0Package.SGR_MODBUS_LAYER6_DEVIATION_TYPE_OBJECT:
				return validateSGrModbusLayer6DeviationTypeObject((SGrModbusLayer6DeviationType)value, diagnostics, context);
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
			case V0Package.SGR_REST_API_AUTHENTICATION_ENUM_METHOD_TYPE_OBJECT:
				return validateSGrRestAPIAuthenticationEnumMethodTypeObject((SGrRestAPIAuthenticationEnumMethodType)value, diagnostics, context);
			case V0Package.SGR_REST_AP_IDATA_TYPE_TYPE_OBJECT:
				return validateSGrRestAPIdataTypeTypeObject((SGrRestAPIdataTypeType)value, diagnostics, context);
			case V0Package.SGR_REST_API_INTERFACE_SELECTIONTYPE_OBJECT:
				return validateSGrRestAPIInterfaceSelectiontypeObject((SGrRestAPIInterfaceSelectiontype)value, diagnostics, context);
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
			case V0Package.STI_HP_OPSTATE_STIEBEL_TYPE_OBJECT:
				return validateStiHPOpstateStiebelTypeObject((StiHPOpstateStiebelType)value, diagnostics, context);
			case V0Package.SUB_PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return validateSubProfileTypeEnumTypeObject((SubProfileTypeEnumType)value, diagnostics, context);
			case V0Package.TBIT_RANK:
				return validateTBitRank((Short)value, diagnostics, context);
			case V0Package.TBIT_RANK_OBJECT:
				return validateTBitRankObject((Short)value, diagnostics, context);
			case V0Package.TENUM_CONVERSION_FCT_OBJECT:
				return validateTEnumConversionFctObject((TEnumConversionFct)value, diagnostics, context);
			case V0Package.TENUM_EXCEPTION_CODE_TYPE_OBJECT:
				return validateTEnumExceptionCodeTypeObject((TEnumExceptionCodeType)value, diagnostics, context);
			case V0Package.TENUM_OBJECT_TYPE_OBJECT:
				return validateTEnumObjectTypeObject((TEnumObjectType)value, diagnostics, context);
			case V0Package.TEXT_ELEMENT_TYPE:
				return validateTextElementType((String)value, diagnostics, context);
			case V0Package.TI_PPORT_NR_TYPE:
				return validateTIPportNrType((Long)value, diagnostics, context);
			case V0Package.TI_PPORT_NR_TYPE_OBJECT:
				return validateTIPportNrTypeObject((Long)value, diagnostics, context);
			case V0Package.TSLAVE_ID_TYPE:
				return validateTSlaveIDType((Integer)value, diagnostics, context);
			case V0Package.TSLAVE_ID_TYPE_OBJECT:
				return validateTSlaveIDTypeObject((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactAPIInterfaceDescType(ContactAPIInterfaceDescType contactAPIInterfaceDescType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactAPIInterfaceDescType, diagnostics, context);
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
	public boolean validateFunctionalProfileType(FunctionalProfileType functionalProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderEntry(HeaderEntry headerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderList(HeaderList headerList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpADDRType(IpADDRType ipADDRType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipADDRType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModbusJMESPathType(ModbusJMESPathType modbusJMESPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modbusJMESPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkConnectionStateType(NetworkConnectionStateType networkConnectionStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkConnectionStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseQuery(ResponseQuery responseQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestServiceCall(RestServiceCall restServiceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restServiceCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTUDevInstanceType(RTUDevInstanceType rtuDevInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtuDevInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTUtrspSrvInstanceType(RTUtrspSrvInstanceType rtUtrspSrvInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtUtrspSrvInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTUType(RTUType rtuType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtuType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrAccessProtectionEnabledType(SGrAccessProtectionEnabledType sGrAccessProtectionEnabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrAccessProtectionEnabledType, diagnostics, context);
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
	public boolean validateSGrAttr4ModbusType(SGrAttr4ModbusType sGrAttr4ModbusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrAttr4ModbusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrAttr4RestAPIType(SGrAttr4RestAPIType sGrAttr4RestAPIType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrAttr4RestAPIType, diagnostics, context);
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
	public boolean validateSGrContactAPIDeviceFrame(SGrContactAPIDeviceFrame sGrContactAPIDeviceFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrContactAPIDeviceFrame, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrContactAPIFunctionalProfileType(SGrContactAPIFunctionalProfileType sGrContactAPIFunctionalProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrContactAPIFunctionalProfileType, diagnostics, context);
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
	public boolean validateSGrFunctionalProfileFrameType(SGrFunctionalProfileFrameType sGrFunctionalProfileFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrFunctionalProfileFrameType, diagnostics, context);
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
	public boolean validateSGrModbusBitmapMapperType(SGrModbusBitmapMapperType sGrModbusBitmapMapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusBitmapMapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusDataPointDescriptionType(SGrModbusDataPointDescriptionType sGrModbusDataPointDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusDataPointDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusDataPointType(SGrModbusDataPointType sGrModbusDataPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusDataPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusDeviceFrame(SGrModbusDeviceFrame sGrModbusDeviceFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusDeviceFrame, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusEnumMapperType(SGrModbusEnumMapperType sGrModbusEnumMapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusEnumMapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusFunctionalProfileType(SGrModbusFunctionalProfileType sGrModbusFunctionalProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusFunctionalProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusInterfaceDescriptionType(SGrModbusInterfaceDescriptionType sGrModbusInterfaceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusInterfaceDescriptionType, diagnostics, context);
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
	public boolean validateSGRrestAPIBearerType(SGRrestAPIBearerType sgRrestAPIBearerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sgRrestAPIBearerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIDataPointDescriptionType(SGrRestAPIDataPointDescriptionType sGrRestAPIDataPointDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIDataPointDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIDataPointType(SGrRestAPIDataPointType sGrRestAPIDataPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIDataPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIDeviceFrame(SGrRestAPIDeviceFrame sGrRestAPIDeviceFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIDeviceFrame, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIFunctionalProfileType(SGrRestAPIFunctionalProfileType sGrRestAPIFunctionalProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIFunctionalProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIInterfaceDescriptionType(SGrRestAPIInterfaceDescriptionType sGrRestAPIInterfaceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIInterfaceDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestBasicType(SGrRestBasicType sGrRestBasicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestBasicType, diagnostics, context);
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
	public boolean validateSGrSerialInterfaceCapabilityType(SGrSerialInterfaceCapabilityType sGrSerialInterfaceCapabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrSerialInterfaceCapabilityType, diagnostics, context);
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
	public boolean validateSGrTimeSyncBlockNotificationType(SGrTimeSyncBlockNotificationType sGrTimeSyncBlockNotificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrTimeSyncBlockNotificationType, diagnostics, context);
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
	public boolean validateTCPDevInstanceType(TCPDevInstanceType tcpDevInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tcpDevInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCPtrspSrvInstanceType(TCPtrspSrvInstanceType tcPtrspSrvInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tcPtrspSrvInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCPType(TCPType tcpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tcpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPIPModbus(TPIPModbus tpipModbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpipModbus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPipV4genAddrType(TPipV4genAddrType tPipV4genAddrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPipV4genAddrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPipV6genAddrType(TPipV6genAddrType tPipV6genAddrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPipV6genAddrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPRTUModbus(TPRTUModbus tprtuModbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tprtuModbus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrspServiceModbusType(TrspServiceModbusType trspServiceModbusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trspServiceModbusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSGrModbusRegisterRef(TSGrModbusRegisterRef tsGrModbusRegisterRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsGrModbusRegisterRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaDHWOpModeType(CtaDHWOpModeType ctaDHWOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBaudRateType(EBaudRateType eBaudRateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByteLenType(EByteLenType eByteLenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEParityType(EParityType eParityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStopBitLenType(EStopBitLenType eStopBitLenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMethod(HttpMethod httpMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateMasterFunctionsSupportedType(MasterFunctionsSupportedType masterFunctionsSupportedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModbusInterfaceSelectionType(ModbusInterfaceSelectionType modbusInterfaceSelectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateResponseQueryType(ResponseQueryType responseQueryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrDHWOpModeType(SGrDHWOpModeType sGrDHWOpModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrHPActBufferStateType(SGrHPActBufferStateType sGrHPActBufferStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrModbusLayer6DeviationType(SGrModbusLayer6DeviationType sGrModbusLayer6DeviationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrRestAPIAuthenticationEnumMethodType(SGrRestAPIAuthenticationEnumMethodType sGrRestAPIAuthenticationEnumMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIdataTypeType(SGrRestAPIdataTypeType sGrRestAPIdataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIInterfaceSelectiontype(SGrRestAPIInterfaceSelectiontype sGrRestAPIInterfaceSelectiontype, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateStiHPOpstateStiebelType(StiHPOpstateStiebelType stiHPOpstateStiebelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateTEnumConversionFct(TEnumConversionFct tEnumConversionFct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumExceptionCodeType(TEnumExceptionCodeType tEnumExceptionCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumObjectType(TEnumObjectType tEnumObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitmaskType(byte[] bitmaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCtaDHWOpModeTypeObject(CtaDHWOpModeType ctaDHWOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDpSizeNrRegistersType(int dpSizeNrRegistersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDpSizeNrRegistersTypeObject(Integer dpSizeNrRegistersTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBaudRateTypeObject(EBaudRateType eBaudRateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByteLenTypeObject(EByteLenType eByteLenTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEParityTypeObject(EParityType eParityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStopBitLenTypeObject(EStopBitLenType eStopBitLenTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMethodObject(HttpMethod httpMethodObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n1Type(BigInteger ipV4n1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n1Type_Min(ipV4n1Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n1Type_Max(ipV4n1Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n1Type_Min
	 */
	public static final BigInteger IP_V4N1_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n1Type_Min(BigInteger ipV4n1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n1Type.compareTo(IP_V4N1_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n1Type(), ipV4n1Type, IP_V4N1_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n1Type_Max
	 */
	public static final BigInteger IP_V4N1_TYPE__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n1Type_Max(BigInteger ipV4n1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n1Type.compareTo(IP_V4N1_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n1Type(), ipV4n1Type, IP_V4N1_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n1Type1(BigInteger ipV4n1Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n1Type1_Min(ipV4n1Type1, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n1Type1_Max(ipV4n1Type1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n1Type1_Min
	 */
	public static final BigInteger IP_V4N1_TYPE1__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n1 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n1Type1_Min(BigInteger ipV4n1Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n1Type1.compareTo(IP_V4N1_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n1Type1(), ipV4n1Type1, IP_V4N1_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n1Type1_Max
	 */
	public static final BigInteger IP_V4N1_TYPE1__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n1 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n1Type1_Max(BigInteger ipV4n1Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n1Type1.compareTo(IP_V4N1_TYPE1__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n1Type1(), ipV4n1Type1, IP_V4N1_TYPE1__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n2Type(BigInteger ipV4n2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n2Type_Min(ipV4n2Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n2Type_Max(ipV4n2Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n2Type_Min
	 */
	public static final BigInteger IP_V4N2_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n2Type_Min(BigInteger ipV4n2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n2Type.compareTo(IP_V4N2_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n2Type(), ipV4n2Type, IP_V4N2_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n2Type_Max
	 */
	public static final BigInteger IP_V4N2_TYPE__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n2Type_Max(BigInteger ipV4n2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n2Type.compareTo(IP_V4N2_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n2Type(), ipV4n2Type, IP_V4N2_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n2Type1(BigInteger ipV4n2Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n2Type1_Min(ipV4n2Type1, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n2Type1_Max(ipV4n2Type1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n2Type1_Min
	 */
	public static final BigInteger IP_V4N2_TYPE1__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n2 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n2Type1_Min(BigInteger ipV4n2Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n2Type1.compareTo(IP_V4N2_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n2Type1(), ipV4n2Type1, IP_V4N2_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n2Type1_Max
	 */
	public static final BigInteger IP_V4N2_TYPE1__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n2 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n2Type1_Max(BigInteger ipV4n2Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n2Type1.compareTo(IP_V4N2_TYPE1__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n2Type1(), ipV4n2Type1, IP_V4N2_TYPE1__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n3Type(BigInteger ipV4n3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n3Type_Min(ipV4n3Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n3Type_Max(ipV4n3Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n3Type_Min
	 */
	public static final BigInteger IP_V4N3_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n3Type_Min(BigInteger ipV4n3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n3Type.compareTo(IP_V4N3_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n3Type(), ipV4n3Type, IP_V4N3_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n3Type_Max
	 */
	public static final BigInteger IP_V4N3_TYPE__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n3Type_Max(BigInteger ipV4n3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n3Type.compareTo(IP_V4N3_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n3Type(), ipV4n3Type, IP_V4N3_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n3Type1(BigInteger ipV4n3Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n3Type1_Min(ipV4n3Type1, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n3Type1_Max(ipV4n3Type1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n3Type1_Min
	 */
	public static final BigInteger IP_V4N3_TYPE1__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n3 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n3Type1_Min(BigInteger ipV4n3Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n3Type1.compareTo(IP_V4N3_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n3Type1(), ipV4n3Type1, IP_V4N3_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n3Type1_Max
	 */
	public static final BigInteger IP_V4N3_TYPE1__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n3 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n3Type1_Max(BigInteger ipV4n3Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n3Type1.compareTo(IP_V4N3_TYPE1__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n3Type1(), ipV4n3Type1, IP_V4N3_TYPE1__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n4Type(BigInteger ipV4n4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n4Type_Min(ipV4n4Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n4Type_Max(ipV4n4Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n4Type_Min
	 */
	public static final BigInteger IP_V4N4_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n4Type_Min(BigInteger ipV4n4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n4Type.compareTo(IP_V4N4_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n4Type(), ipV4n4Type, IP_V4N4_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n4Type_Max
	 */
	public static final BigInteger IP_V4N4_TYPE__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n4Type_Max(BigInteger ipV4n4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n4Type.compareTo(IP_V4N4_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n4Type(), ipV4n4Type, IP_V4N4_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n4Type1(BigInteger ipV4n4Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpV4n4Type1_Min(ipV4n4Type1, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpV4n4Type1_Max(ipV4n4Type1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n4Type1_Min
	 */
	public static final BigInteger IP_V4N4_TYPE1__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Ip V4n4 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n4Type1_Min(BigInteger ipV4n4Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n4Type1.compareTo(IP_V4N4_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getIpV4n4Type1(), ipV4n4Type1, IP_V4N4_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpV4n4Type1_Max
	 */
	public static final BigInteger IP_V4N4_TYPE1__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Ip V4n4 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4n4Type1_Max(BigInteger ipV4n4Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ipV4n4Type1.compareTo(IP_V4N4_TYPE1__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getIpV4n4Type1(), ipV4n4Type1, IP_V4N4_TYPE1__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4portNrType(long ipV4portNrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(ipV4portNrType, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(ipV4portNrType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4portNrTypeObject(Long ipV4portNrTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(ipV4portNrTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(ipV4portNrTypeObject, diagnostics, context);
		return result;
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
	public boolean validateMasterFunctionsSupportedTypeObject(MasterFunctionsSupportedType masterFunctionsSupportedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModbusInterfaceSelectionTypeObject(ModbusInterfaceSelectionType modbusInterfaceSelectionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceHolder4futureExtensionsType(String placeHolder4futureExtensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrelimStringDefType(String prelimStringDefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateResponseQueryTypeObject(ResponseQueryType responseQueryTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestAPIEndPointType(String restAPIEndPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestAPIJMESPathType(String restAPIJMESPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestBasicPasswordType(String restBasicPasswordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestBasicUsernameType(String restBasicUsernameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrDHWOpModeTypeObject(SGrDHWOpModeType sGrDHWOpModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrHPActBufferStateTypeObject(SGrHPActBufferStateType sGrHPActBufferStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrModbusLayer6DeviationTypeObject(SGrModbusLayer6DeviationType sGrModbusLayer6DeviationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrRestAPIAuthenticationEnumMethodTypeObject(SGrRestAPIAuthenticationEnumMethodType sGrRestAPIAuthenticationEnumMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIdataTypeTypeObject(SGrRestAPIdataTypeType sGrRestAPIdataTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIInterfaceSelectiontypeObject(SGrRestAPIInterfaceSelectiontype sGrRestAPIInterfaceSelectiontypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateStiHPOpstateStiebelTypeObject(StiHPOpstateStiebelType stiHPOpstateStiebelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateTBitRank(short tBitRank, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTBitRank_Min(tBitRank, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBitRank_Max(tBitRank, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTBitRank_Min
	 */
	public static final short TBIT_RANK__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>TBit Rank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBitRank_Min(short tBitRank, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tBitRank >= TBIT_RANK__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(V0Package.eINSTANCE.getTBitRank(), tBitRank, TBIT_RANK__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTBitRank_Max
	 */
	public static final short TBIT_RANK__MAX__VALUE = 15;

	/**
	 * Validates the Max constraint of '<em>TBit Rank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBitRank_Max(short tBitRank, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tBitRank <= TBIT_RANK__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(V0Package.eINSTANCE.getTBitRank(), tBitRank, TBIT_RANK__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBitRankObject(Short tBitRankObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTBitRank_Min(tBitRankObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateTBitRank_Max(tBitRankObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumConversionFctObject(TEnumConversionFct tEnumConversionFctObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumExceptionCodeTypeObject(TEnumExceptionCodeType tEnumExceptionCodeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumObjectTypeObject(TEnumObjectType tEnumObjectTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIPportNrType(long tiPportNrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(tiPportNrType, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(tiPportNrType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIPportNrTypeObject(Long tiPportNrTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedInt_Min(tiPportNrTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedInt_Max(tiPportNrTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSlaveIDType(int tSlaveIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedShort_Min(tSlaveIDType, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedShort_Max(tSlaveIDType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSlaveIDTypeObject(Integer tSlaveIDTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedShort_Min(tSlaveIDTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedShort_Max(tSlaveIDTypeObject, diagnostics, context);
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
