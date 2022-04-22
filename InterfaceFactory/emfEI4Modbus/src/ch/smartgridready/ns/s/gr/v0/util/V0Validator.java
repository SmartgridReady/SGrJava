/**
 */
package ch.smartgridready.ns.s.gr.v0.util;

import ch.smartgridready.ns.s.gr.v0.*;

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
 * @see ch.smartgridready.ns.s.gr.v0.V0Package
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
	public static final String DIAGNOSTIC_SOURCE = "ch.smartgridready.ns.s.gr.v0";

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
			case V0Package.API_TREE_TYPE:
				return validateApiTreeType((ApiTreeType)value, diagnostics, context);
			case V0Package.CONNECTION_STATE:
				return validateConnectionState((ConnectionState)value, diagnostics, context);
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE:
				return validateContactAPIInterfaceDescType((ContactAPIInterfaceDescType)value, diagnostics, context);
			case V0Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case V0Package.DP_ACCESS_PROTECTION_ENABLED_TYPE:
				return validateDpAccessProtectionEnabledType((DpAccessProtectionEnabledType)value, diagnostics, context);
			case V0Package.IP_ADDR_TYPE:
				return validateIpADDRType((IpADDRType)value, diagnostics, context);
			case V0Package.MODBUS_JMES_PATH_TYPE:
				return validateModbusJMESPathType((ModbusJMESPathType)value, diagnostics, context);
			case V0Package.REST_APIJMES_PATH_TYPE1:
				return validateRestAPIJMESPathType1((RestAPIJMESPathType1)value, diagnostics, context);
			case V0Package.RTU_DEV_INSTANCE_TYPE:
				return validateRTUDevInstanceType((RTUDevInstanceType)value, diagnostics, context);
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE:
				return validateRTUtrspSrvInstanceType((RTUtrspSrvInstanceType)value, diagnostics, context);
			case V0Package.RTU_TYPE:
				return validateRTUType((RTUType)value, diagnostics, context);
			case V0Package.SGR_ATTR4_GENERIC_TYPE:
				return validateSGrAttr4GenericType((SGrAttr4GenericType)value, diagnostics, context);
			case V0Package.SGR_ATTR4_MODBUS_TYPE:
				return validateSGrAttr4ModbusType((SGrAttr4ModbusType)value, diagnostics, context);
			case V0Package.SGR_ATTR4_REST_API_TYPE:
				return validateSGrAttr4RestAPIType((SGrAttr4RestAPIType)value, diagnostics, context);
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE:
				return validateSGrBasicGenDataPointTypeType((SGrBasicGenDataPointTypeType)value, diagnostics, context);
			case V0Package.SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE:
				return validateSGrContactAPIDeviceDescriptionType((SGrContactAPIDeviceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_DATA_POINT_DESCRIPTION_TYPE:
				return validateSGrDataPointDescriptionType((SGrDataPointDescriptionType)value, diagnostics, context);
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE:
				return validateSGrDataPointsFrameType((SGrDataPointsFrameType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_DESCRIPTION_TYPE:
				return validateSGrDeviceDescriptionType((SGrDeviceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_DEVICE_PROFILE_TYPE:
				return validateSGrDeviceProfileType((SGrDeviceProfileType)value, diagnostics, context);
			case V0Package.SGR_ENUM_LIST_TYPE:
				return validateSGrEnumListType((SGrEnumListType)value, diagnostics, context);
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE:
				return validateSGrInterfaceDescriptionType((SGrInterfaceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE:
				return validateSGrLegibDocumentationType((SGrLegibDocumentationType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_ATTR_FRAME_TYPE:
				return validateSGrModbusAttrFrameType((SGrModbusAttrFrameType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE:
				return validateSGrModbusDataPointDescriptionType((SGrModbusDataPointDescriptionType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE:
				return validateSGrModbusDataPointsFrameType((SGrModbusDataPointsFrameType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE:
				return validateSGrModbusDeviceDescriptionType((SGrModbusDeviceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE:
				return validateSGrModbusInterfaceDescriptionType((SGrModbusInterfaceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE:
				return validateSGrModbusProfilesFrameType((SGrModbusProfilesFrameType)value, diagnostics, context);
			case V0Package.SGR_NAMELIST_TYPE:
				return validateSGrNamelistType((SGrNamelistType)value, diagnostics, context);
			case V0Package.SGR_PROFILE_DESCRIPTION_TYPE:
				return validateSGrProfileDescriptionType((SGrProfileDescriptionType)value, diagnostics, context);
			case V0Package.SGR_PROFILENUMBER_TYPE:
				return validateSGrProfilenumberType((SGrProfilenumberType)value, diagnostics, context);
			case V0Package.SGR_PROFILES_FRAME_TYPE:
				return validateSGrProfilesFrameType((SGrProfilesFrameType)value, diagnostics, context);
			case V0Package.SGR_REST_API_ATTR_FRAME_TYPE:
				return validateSGrRestAPIAttrFrameType((SGrRestAPIAttrFrameType)value, diagnostics, context);
			case V0Package.SG_RREST_API_BEARER_TYPE:
				return validateSGRrestAPIBearerType((SGRrestAPIBearerType)value, diagnostics, context);
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE:
				return validateSGrRestAPIDataPointDescriptionType((SGrRestAPIDataPointDescriptionType)value, diagnostics, context);
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE:
				return validateSGrRestAPIDataPointsFrameType((SGrRestAPIDataPointsFrameType)value, diagnostics, context);
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE:
				return validateSGrRESTAPIDeviceDescriptionType((SGrRESTAPIDeviceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE:
				return validateSGrRestAPIInterfaceDescriptionType((SGrRestAPIInterfaceDescriptionType)value, diagnostics, context);
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE:
				return validateSGrRestAPIProfilesFrameType((SGrRestAPIProfilesFrameType)value, diagnostics, context);
			case V0Package.SGR_REST_BASIC_TYPE:
				return validateSGrRestBasicType((SGrRestBasicType)value, diagnostics, context);
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE:
				return validateSGrRestDataPointsFrameType((SGrRestDataPointsFrameType)value, diagnostics, context);
			case V0Package.SGR_REST_PROFILES_FRAME_TYPE:
				return validateSGrRestProfilesFrameType((SGrRestProfilesFrameType)value, diagnostics, context);
			case V0Package.SGR_SCALING_TYPE:
				return validateSGrScalingType((SGrScalingType)value, diagnostics, context);
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE:
				return validateSGrSerialInterfaceCapabilityType((SGrSerialInterfaceCapabilityType)value, diagnostics, context);
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE:
				return validateSGrSmoothTransitionType((SGrSmoothTransitionType)value, diagnostics, context);
			case V0Package.SGR_STABILITY_FALLBACK_TYPE:
				return validateSGrStabilityFallbackType((SGrStabilityFallbackType)value, diagnostics, context);
			case V0Package.SGR_TIME_RANGE_TYPE:
				return validateSGrTimeRangeType((SGrTimeRangeType)value, diagnostics, context);
			case V0Package.SGR_VERSION_NUMBER_TYPE:
				return validateSGrVersionNumberType((SGrVersionNumberType)value, diagnostics, context);
			case V0Package.TCP_DEV_INSTANCE_TYPE:
				return validateTCPDevInstanceType((TCPDevInstanceType)value, diagnostics, context);
			case V0Package.TC_PTRSP_SRV_INSTANCE_TYPE:
				return validateTCPtrspSrvInstanceType((TCPtrspSrvInstanceType)value, diagnostics, context);
			case V0Package.TCP_TYPE:
				return validateTCPType((TCPType)value, diagnostics, context);
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE:
				return validateTimeSyncBlockNotificationType((TimeSyncBlockNotificationType)value, diagnostics, context);
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
			case V0Package.DPT_SELECTED_TYPE:
				return validateDptSelectedType((DptSelectedType)value, diagnostics, context);
			case V0Package.EBAUD_RATE_TYPE:
				return validateEBaudRateType((EBaudRateType)value, diagnostics, context);
			case V0Package.EBYTE_LEN_TYPE:
				return validateEByteLenType((EByteLenType)value, diagnostics, context);
			case V0Package.EPARITY_TYPE:
				return validateEParityType((EParityType)value, diagnostics, context);
			case V0Package.ESTOP_BIT_LEN_TYPE:
				return validateEStopBitLenType((EStopBitLenType)value, diagnostics, context);
			case V0Package.MASTER_FUNCTIONS_SUPPORTED_TYPE:
				return validateMasterFunctionsSupportedType((MasterFunctionsSupportedType)value, diagnostics, context);
			case V0Package.MODBUS_INTERFACE_SELECTION_TYPE:
				return validateModbusInterfaceSelectionType((ModbusInterfaceSelectionType)value, diagnostics, context);
			case V0Package.PROFILE_TYPE_ENUM_TYPE:
				return validateProfileTypeEnumType((ProfileTypeEnumType)value, diagnostics, context);
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
			case V0Package.SGR_LANGUAGE_TYPE:
				return validateSGrLanguageType((SGrLanguageType)value, diagnostics, context);
			case V0Package.SGR_MANUFACTURER_ID_TYPE:
				return validateSGrManufacturerIDType((SGrManufacturerIDType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE:
				return validateSGrMeasValueSourceType((SGrMeasValueSourceType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_STATE_TYPE:
				return validateSGrMeasValueStateType((SGrMeasValueStateType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_TENDENCY_TYPE:
				return validateSGrMeasValueTendencyType((SGrMeasValueTendencyType)value, diagnostics, context);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE:
				return validateSGrMROPresenceLevelIndicationType((SGrMROPresenceLevelIndicationType)value, diagnostics, context);
			case V0Package.SGR_NAMELIST_KIND_OF_TYPE:
				return validateSGrNamelistKindOfType((SGrNamelistKindOfType)value, diagnostics, context);
			case V0Package.SGR_POWER_SOURCE_TYPE:
				return validateSGrPowerSourceType((SGrPowerSourceType)value, diagnostics, context);
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
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE:
				return validateSGrSunspStateCodesType((SGrSunspStateCodesType)value, diagnostics, context);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE:
				return validateSGrTransportServicesUsedListType((SGrTransportServicesUsedListType)value, diagnostics, context);
			case V0Package.SGR_UNITS:
				return validateSGrUnits((SGrUnits)value, diagnostics, context);
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
			case V0Package.DP_SIZE_NR_REGISTERS_TYPE:
				return validateDpSizeNrRegistersType((Integer)value, diagnostics, context);
			case V0Package.DP_SIZE_NR_REGISTERS_TYPE_OBJECT:
				return validateDpSizeNrRegistersTypeObject((Integer)value, diagnostics, context);
			case V0Package.DPT_SELECTED_TYPE_OBJECT:
				return validateDptSelectedTypeObject((DptSelectedType)value, diagnostics, context);
			case V0Package.EBAUD_RATE_TYPE_OBJECT:
				return validateEBaudRateTypeObject((EBaudRateType)value, diagnostics, context);
			case V0Package.EBYTE_LEN_TYPE_OBJECT:
				return validateEByteLenTypeObject((EByteLenType)value, diagnostics, context);
			case V0Package.EPARITY_TYPE_OBJECT:
				return validateEParityTypeObject((EParityType)value, diagnostics, context);
			case V0Package.ESTOP_BIT_LEN_TYPE_OBJECT:
				return validateEStopBitLenTypeObject((EStopBitLenType)value, diagnostics, context);
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
			case V0Package.MASTER_FUNCTIONS_SUPPORTED_TYPE_OBJECT:
				return validateMasterFunctionsSupportedTypeObject((MasterFunctionsSupportedType)value, diagnostics, context);
			case V0Package.MODBUS_INTERFACE_SELECTION_TYPE_OBJECT:
				return validateModbusInterfaceSelectionTypeObject((ModbusInterfaceSelectionType)value, diagnostics, context);
			case V0Package.NUM_DPS_TYPE:
				return validateNumDPsType((Integer)value, diagnostics, context);
			case V0Package.NUM_DPS_TYPE_OBJECT:
				return validateNumDPsTypeObject((Integer)value, diagnostics, context);
			case V0Package.NUM_FPS_TYPE:
				return validateNumFPsType((Integer)value, diagnostics, context);
			case V0Package.NUM_FPS_TYPE_OBJECT:
				return validateNumFPsTypeObject((Integer)value, diagnostics, context);
			case V0Package.PLACE_HOLDER4FUTURE_EXTENSIONS_TYPE:
				return validatePlaceHolder4futureExtensionsType((String)value, diagnostics, context);
			case V0Package.PRELIM_STRING_DEF_TYPE:
				return validatePrelimStringDefType((String)value, diagnostics, context);
			case V0Package.PROFILE_TYPE_ENUM_TYPE_OBJECT:
				return validateProfileTypeEnumTypeObject((ProfileTypeEnumType)value, diagnostics, context);
			case V0Package.REST_API_END_POINT_TYPE:
				return validateRestAPIEndPointType((String)value, diagnostics, context);
			case V0Package.REST_API_END_POINT_TYPE1:
				return validateRestAPIEndPointType1((String)value, diagnostics, context);
			case V0Package.REST_APIJMES_PATH_TYPE:
				return validateRestAPIJMESPathType((String)value, diagnostics, context);
			case V0Package.REST_BASIC_PASSWORD_TYPE:
				return validateRestBasicPasswordType((String)value, diagnostics, context);
			case V0Package.REST_BASIC_USERNAME_TYPE:
				return validateRestBasicUsernameType((String)value, diagnostics, context);
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
			case V0Package.SGR_LANGUAGE_TYPE_OBJECT:
				return validateSGrLanguageTypeObject((SGrLanguageType)value, diagnostics, context);
			case V0Package.SGR_MANUFACTURER_ID_TYPE_OBJECT:
				return validateSGrManufacturerIDTypeObject((SGrManufacturerIDType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_SOURCE_TYPE_OBJECT:
				return validateSGrMeasValueSourceTypeObject((SGrMeasValueSourceType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_STATE_TYPE_OBJECT:
				return validateSGrMeasValueStateTypeObject((SGrMeasValueStateType)value, diagnostics, context);
			case V0Package.SGR_MEAS_VALUE_TENDENCY_TYPE_OBJECT:
				return validateSGrMeasValueTendencyTypeObject((SGrMeasValueTendencyType)value, diagnostics, context);
			case V0Package.SGR_MRO_PRESENCE_LEVEL_INDICATION_TYPE_OBJECT:
				return validateSGrMROPresenceLevelIndicationTypeObject((SGrMROPresenceLevelIndicationType)value, diagnostics, context);
			case V0Package.SGR_NAMELIST_KIND_OF_TYPE_OBJECT:
				return validateSGrNamelistKindOfTypeObject((SGrNamelistKindOfType)value, diagnostics, context);
			case V0Package.SGR_POWER_SOURCE_TYPE_OBJECT:
				return validateSGrPowerSourceTypeObject((SGrPowerSourceType)value, diagnostics, context);
			case V0Package.SGR_PRECISION_TYPE:
				return validateSGrPrecisionType((Double)value, diagnostics, context);
			case V0Package.SGR_PRECISION_TYPE_OBJECT:
				return validateSGrPrecisionTypeObject((Double)value, diagnostics, context);
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
			case V0Package.SGR_SPECIAL_QUALITY_REQ_TYPE:
				return validateSGrSpecialQualityReqType((String)value, diagnostics, context);
			case V0Package.SGR_SUNSP_STATE_CODES_TYPE_OBJECT:
				return validateSGrSunspStateCodesTypeObject((SGrSunspStateCodesType)value, diagnostics, context);
			case V0Package.SGR_TRANSPORT_SERVICES_USED_LIST_TYPE_OBJECT:
				return validateSGrTransportServicesUsedListTypeObject((SGrTransportServicesUsedListType)value, diagnostics, context);
			case V0Package.SGR_UNITS_OBJECT:
				return validateSGrUnitsObject((SGrUnits)value, diagnostics, context);
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
	public boolean validateApiTreeType(ApiTreeType apiTreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(apiTreeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionState(ConnectionState connectionState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionState, diagnostics, context);
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
	public boolean validateDpAccessProtectionEnabledType(DpAccessProtectionEnabledType dpAccessProtectionEnabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dpAccessProtectionEnabledType, diagnostics, context);
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
	public boolean validateRestAPIJMESPathType1(RestAPIJMESPathType1 restAPIJMESPathType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restAPIJMESPathType1, diagnostics, context);
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
	public boolean validateSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType sGrContactAPIDeviceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrContactAPIDeviceDescriptionType, diagnostics, context);
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
	public boolean validateSGrDataPointsFrameType(SGrDataPointsFrameType sGrDataPointsFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrDataPointsFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrDeviceDescriptionType(SGrDeviceDescriptionType sGrDeviceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrDeviceDescriptionType, diagnostics, context);
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
	public boolean validateSGrInterfaceDescriptionType(SGrInterfaceDescriptionType sGrInterfaceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrInterfaceDescriptionType, diagnostics, context);
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
	public boolean validateSGrModbusAttrFrameType(SGrModbusAttrFrameType sGrModbusAttrFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusAttrFrameType, diagnostics, context);
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
	public boolean validateSGrModbusDataPointsFrameType(SGrModbusDataPointsFrameType sGrModbusDataPointsFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusDataPointsFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType sGrModbusDeviceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusDeviceDescriptionType, diagnostics, context);
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
	public boolean validateSGrModbusProfilesFrameType(SGrModbusProfilesFrameType sGrModbusProfilesFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrModbusProfilesFrameType, diagnostics, context);
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
	public boolean validateSGrProfilesFrameType(SGrProfilesFrameType sGrProfilesFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrProfilesFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestAPIAttrFrameType(SGrRestAPIAttrFrameType sGrRestAPIAttrFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIAttrFrameType, diagnostics, context);
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
	public boolean validateSGrRestAPIDataPointsFrameType(SGrRestAPIDataPointsFrameType sGrRestAPIDataPointsFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIDataPointsFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType sGrRESTAPIDeviceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRESTAPIDeviceDescriptionType, diagnostics, context);
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
	public boolean validateSGrRestAPIProfilesFrameType(SGrRestAPIProfilesFrameType sGrRestAPIProfilesFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestAPIProfilesFrameType, diagnostics, context);
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
	public boolean validateSGrRestDataPointsFrameType(SGrRestDataPointsFrameType sGrRestDataPointsFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestDataPointsFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrRestProfilesFrameType(SGrRestProfilesFrameType sGrRestProfilesFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrRestProfilesFrameType, diagnostics, context);
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
	public boolean validateSGrTimeRangeType(SGrTimeRangeType sGrTimeRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sGrTimeRangeType, diagnostics, context);
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
	public boolean validateTimeSyncBlockNotificationType(TimeSyncBlockNotificationType timeSyncBlockNotificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSyncBlockNotificationType, diagnostics, context);
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
	public boolean validateDptSelectedType(DptSelectedType dptSelectedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrMeasValueStateType(SGrMeasValueStateType sGrMeasValueStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMeasValueTendencyType(SGrMeasValueTendencyType sGrMeasValueTendencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrNamelistKindOfType(SGrNamelistKindOfType sGrNamelistKindOfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateDptSelectedTypeObject(DptSelectedType dptSelectedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateNumDPsType(int numDPsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumDPsTypeObject(Integer numDPsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFPsType(int numFPsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFPsTypeObject(Integer numFPsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateRestAPIEndPointType(String restAPIEndPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestAPIEndPointType1(String restAPIEndPointType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrMeasValueStateTypeObject(SGrMeasValueStateType sGrMeasValueStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGrMeasValueTendencyTypeObject(SGrMeasValueTendencyType sGrMeasValueTendencyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSGrNamelistKindOfTypeObject(SGrNamelistKindOfType sGrNamelistKindOfTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		boolean result = length <= 750;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(V0Package.eINSTANCE.getTextElementType(), textElementType, length, 750, diagnostics, context);
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
