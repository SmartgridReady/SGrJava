/**
 */
package com.smartgridready.ns.v0.util;

import com.smartgridready.ns.v0.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package
 * @generated
 */
public class V0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static V0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0Switch() {
		if (modelPackage == null) {
			modelPackage = V0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case V0Package.CONTACT_API_INTERFACE_DESC_TYPE: {
				ContactAPIInterfaceDescType contactAPIInterfaceDescType = (ContactAPIInterfaceDescType)theEObject;
				T result = caseContactAPIInterfaceDescType(contactAPIInterfaceDescType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.IP_ADDR_TYPE: {
				IpADDRType ipADDRType = (IpADDRType)theEObject;
				T result = caseIpADDRType(ipADDRType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.MODBUS_JMES_PATH_TYPE: {
				ModbusJMESPathType modbusJMESPathType = (ModbusJMESPathType)theEObject;
				T result = caseModbusJMESPathType(modbusJMESPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.NETWORK_CONNECTION_STATE_TYPE: {
				NetworkConnectionStateType networkConnectionStateType = (NetworkConnectionStateType)theEObject;
				T result = caseNetworkConnectionStateType(networkConnectionStateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.REST_APIJMES_PATH_TYPE1: {
				RestAPIJMESPathType1 restAPIJMESPathType1 = (RestAPIJMESPathType1)theEObject;
				T result = caseRestAPIJMESPathType1(restAPIJMESPathType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.RTU_DEV_INSTANCE_TYPE: {
				RTUDevInstanceType rtuDevInstanceType = (RTUDevInstanceType)theEObject;
				T result = caseRTUDevInstanceType(rtuDevInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.RT_UTRSP_SRV_INSTANCE_TYPE: {
				RTUtrspSrvInstanceType rtUtrspSrvInstanceType = (RTUtrspSrvInstanceType)theEObject;
				T result = caseRTUtrspSrvInstanceType(rtUtrspSrvInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.RTU_TYPE: {
				RTUType rtuType = (RTUType)theEObject;
				T result = caseRTUType(rtuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ACCESS_PROTECTION_ENABLED_TYPE: {
				SGrAccessProtectionEnabledType sGrAccessProtectionEnabledType = (SGrAccessProtectionEnabledType)theEObject;
				T result = caseSGrAccessProtectionEnabledType(sGrAccessProtectionEnabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ATTR4_GENERIC_TYPE: {
				SGrAttr4GenericType sGrAttr4GenericType = (SGrAttr4GenericType)theEObject;
				T result = caseSGrAttr4GenericType(sGrAttr4GenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ATTR4_MODBUS_TYPE: {
				SGrAttr4ModbusType sGrAttr4ModbusType = (SGrAttr4ModbusType)theEObject;
				T result = caseSGrAttr4ModbusType(sGrAttr4ModbusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ATTR4_REST_API_TYPE: {
				SGrAttr4RestAPIType sGrAttr4RestAPIType = (SGrAttr4RestAPIType)theEObject;
				T result = caseSGrAttr4RestAPIType(sGrAttr4RestAPIType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_BASIC_GEN_ARRAY_DP_TYPE_TYPE: {
				SGrBasicGenArrayDPTypeType sGrBasicGenArrayDPTypeType = (SGrBasicGenArrayDPTypeType)theEObject;
				T result = caseSGrBasicGenArrayDPTypeType(sGrBasicGenArrayDPTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE: {
				SGrBasicGenDataPointTypeType sGrBasicGenDataPointTypeType = (SGrBasicGenDataPointTypeType)theEObject;
				T result = caseSGrBasicGenDataPointTypeType(sGrBasicGenDataPointTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_CHANGE_LOG: {
				SGrChangeLog sGrChangeLog = (SGrChangeLog)theEObject;
				T result = caseSGrChangeLog(sGrChangeLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_CONTACT_API_DEVICE_DESCRIPTION_TYPE: {
				SGrContactAPIDeviceDescriptionType sGrContactAPIDeviceDescriptionType = (SGrContactAPIDeviceDescriptionType)theEObject;
				T result = caseSGrContactAPIDeviceDescriptionType(sGrContactAPIDeviceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DATA_POINT_DESCRIPTION_TYPE: {
				SGrDataPointDescriptionType sGrDataPointDescriptionType = (SGrDataPointDescriptionType)theEObject;
				T result = caseSGrDataPointDescriptionType(sGrDataPointDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DATA_POINTS_FRAME_TYPE: {
				SGrDataPointsFrameType sGrDataPointsFrameType = (SGrDataPointsFrameType)theEObject;
				T result = caseSGrDataPointsFrameType(sGrDataPointsFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DEVICE_DESCRIPTION_TYPE: {
				SGrDeviceDescriptionType sGrDeviceDescriptionType = (SGrDeviceDescriptionType)theEObject;
				T result = caseSGrDeviceDescriptionType(sGrDeviceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DEVICE_PROFILE_TYPE: {
				SGrDeviceProfileType sGrDeviceProfileType = (SGrDeviceProfileType)theEObject;
				T result = caseSGrDeviceProfileType(sGrDeviceProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_ENUM_LIST_TYPE: {
				SGrEnumListType sGrEnumListType = (SGrEnumListType)theEObject;
				T result = caseSGrEnumListType(sGrEnumListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_FLEX_ASSISTANCE_TYPE: {
				SGrFlexAssistanceType sGrFlexAssistanceType = (SGrFlexAssistanceType)theEObject;
				T result = caseSGrFlexAssistanceType(sGrFlexAssistanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_INTERFACE_DESCRIPTION_TYPE: {
				SGrInterfaceDescriptionType sGrInterfaceDescriptionType = (SGrInterfaceDescriptionType)theEObject;
				T result = caseSGrInterfaceDescriptionType(sGrInterfaceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_LEGIB_DOCUMENTATION_TYPE: {
				SGrLegibDocumentationType sGrLegibDocumentationType = (SGrLegibDocumentationType)theEObject;
				T result = caseSGrLegibDocumentationType(sGrLegibDocumentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_DATA_POINT_DESCRIPTION_TYPE: {
				SGrModbusDataPointDescriptionType sGrModbusDataPointDescriptionType = (SGrModbusDataPointDescriptionType)theEObject;
				T result = caseSGrModbusDataPointDescriptionType(sGrModbusDataPointDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_DATA_POINTS_FRAME_TYPE: {
				SGrModbusDataPointsFrameType sGrModbusDataPointsFrameType = (SGrModbusDataPointsFrameType)theEObject;
				T result = caseSGrModbusDataPointsFrameType(sGrModbusDataPointsFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_DEVICE_DESCRIPTION_TYPE: {
				SGrModbusDeviceDescriptionType sGrModbusDeviceDescriptionType = (SGrModbusDeviceDescriptionType)theEObject;
				T result = caseSGrModbusDeviceDescriptionType(sGrModbusDeviceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE: {
				SGrModbusInterfaceDescriptionType sGrModbusInterfaceDescriptionType = (SGrModbusInterfaceDescriptionType)theEObject;
				T result = caseSGrModbusInterfaceDescriptionType(sGrModbusInterfaceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_PROFILES_FRAME_TYPE: {
				SGrModbusProfilesFrameType sGrModbusProfilesFrameType = (SGrModbusProfilesFrameType)theEObject;
				T result = caseSGrModbusProfilesFrameType(sGrModbusProfilesFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_NAMELIST_TYPE: {
				SGrNamelistType sGrNamelistType = (SGrNamelistType)theEObject;
				T result = caseSGrNamelistType(sGrNamelistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_PROFILE_DESCRIPTION_TYPE: {
				SGrProfileDescriptionType sGrProfileDescriptionType = (SGrProfileDescriptionType)theEObject;
				T result = caseSGrProfileDescriptionType(sGrProfileDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_PROFILENUMBER_TYPE: {
				SGrProfilenumberType sGrProfilenumberType = (SGrProfilenumberType)theEObject;
				T result = caseSGrProfilenumberType(sGrProfilenumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_PROFILES_FRAME_TYPE: {
				SGrProfilesFrameType sGrProfilesFrameType = (SGrProfilesFrameType)theEObject;
				T result = caseSGrProfilesFrameType(sGrProfilesFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_RELEASE_NOTES: {
				SGrReleaseNotes sGrReleaseNotes = (SGrReleaseNotes)theEObject;
				T result = caseSGrReleaseNotes(sGrReleaseNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SG_RREST_API_BEARER_TYPE: {
				SGRrestAPIBearerType sgRrestAPIBearerType = (SGRrestAPIBearerType)theEObject;
				T result = caseSGRrestAPIBearerType(sgRrestAPIBearerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_DATA_POINT_DESCRIPTION_TYPE: {
				SGrRestAPIDataPointDescriptionType sGrRestAPIDataPointDescriptionType = (SGrRestAPIDataPointDescriptionType)theEObject;
				T result = caseSGrRestAPIDataPointDescriptionType(sGrRestAPIDataPointDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_DATA_POINTS_FRAME_TYPE: {
				SGrRestAPIDataPointsFrameType sGrRestAPIDataPointsFrameType = (SGrRestAPIDataPointsFrameType)theEObject;
				T result = caseSGrRestAPIDataPointsFrameType(sGrRestAPIDataPointsFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_RESTAPI_DEVICE_DESCRIPTION_TYPE: {
				SGrRESTAPIDeviceDescriptionType sGrRESTAPIDeviceDescriptionType = (SGrRESTAPIDeviceDescriptionType)theEObject;
				T result = caseSGrRESTAPIDeviceDescriptionType(sGrRESTAPIDeviceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE: {
				SGrRestAPIInterfaceDescriptionType sGrRestAPIInterfaceDescriptionType = (SGrRestAPIInterfaceDescriptionType)theEObject;
				T result = caseSGrRestAPIInterfaceDescriptionType(sGrRestAPIInterfaceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_PROFILES_FRAME_TYPE: {
				SGrRestAPIProfilesFrameType sGrRestAPIProfilesFrameType = (SGrRestAPIProfilesFrameType)theEObject;
				T result = caseSGrRestAPIProfilesFrameType(sGrRestAPIProfilesFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_BASIC_TYPE: {
				SGrRestBasicType sGrRestBasicType = (SGrRestBasicType)theEObject;
				T result = caseSGrRestBasicType(sGrRestBasicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_DATA_POINTS_FRAME_TYPE: {
				SGrRestDataPointsFrameType sGrRestDataPointsFrameType = (SGrRestDataPointsFrameType)theEObject;
				T result = caseSGrRestDataPointsFrameType(sGrRestDataPointsFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_PROFILES_FRAME_TYPE: {
				SGrRestProfilesFrameType sGrRestProfilesFrameType = (SGrRestProfilesFrameType)theEObject;
				T result = caseSGrRestProfilesFrameType(sGrRestProfilesFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_SCALING_TYPE: {
				SGrScalingType sGrScalingType = (SGrScalingType)theEObject;
				T result = caseSGrScalingType(sGrScalingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_SERIAL_INTERFACE_CAPABILITY_TYPE: {
				SGrSerialInterfaceCapabilityType sGrSerialInterfaceCapabilityType = (SGrSerialInterfaceCapabilityType)theEObject;
				T result = caseSGrSerialInterfaceCapabilityType(sGrSerialInterfaceCapabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_SMOOTH_TRANSITION_TYPE: {
				SGrSmoothTransitionType sGrSmoothTransitionType = (SGrSmoothTransitionType)theEObject;
				T result = caseSGrSmoothTransitionType(sGrSmoothTransitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_STABILITY_FALLBACK_TYPE: {
				SGrStabilityFallbackType sGrStabilityFallbackType = (SGrStabilityFallbackType)theEObject;
				T result = caseSGrStabilityFallbackType(sGrStabilityFallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_TIME_RANGE_TYPE: {
				SGrTimeRangeType sGrTimeRangeType = (SGrTimeRangeType)theEObject;
				T result = caseSGrTimeRangeType(sGrTimeRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_VERSION_NUMBER_TYPE: {
				SGrVersionNumberType sGrVersionNumberType = (SGrVersionNumberType)theEObject;
				T result = caseSGrVersionNumberType(sGrVersionNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TCP_DEV_INSTANCE_TYPE: {
				TCPDevInstanceType tcpDevInstanceType = (TCPDevInstanceType)theEObject;
				T result = caseTCPDevInstanceType(tcpDevInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TC_PTRSP_SRV_INSTANCE_TYPE: {
				TCPtrspSrvInstanceType tcPtrspSrvInstanceType = (TCPtrspSrvInstanceType)theEObject;
				T result = caseTCPtrspSrvInstanceType(tcPtrspSrvInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TCP_TYPE: {
				TCPType tcpType = (TCPType)theEObject;
				T result = caseTCPType(tcpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TIME_SYNC_BLOCK_NOTIFICATION_TYPE: {
				TimeSyncBlockNotificationType timeSyncBlockNotificationType = (TimeSyncBlockNotificationType)theEObject;
				T result = caseTimeSyncBlockNotificationType(timeSyncBlockNotificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TPIP_MODBUS: {
				TPIPModbus tpipModbus = (TPIPModbus)theEObject;
				T result = caseTPIPModbus(tpipModbus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TPIP_V4GEN_ADDR_TYPE: {
				TPipV4genAddrType tPipV4genAddrType = (TPipV4genAddrType)theEObject;
				T result = caseTPipV4genAddrType(tPipV4genAddrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TPIP_V6GEN_ADDR_TYPE: {
				TPipV6genAddrType tPipV6genAddrType = (TPipV6genAddrType)theEObject;
				T result = caseTPipV6genAddrType(tPipV6genAddrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TPRTU_MODBUS: {
				TPRTUModbus tprtuModbus = (TPRTUModbus)theEObject;
				T result = caseTPRTUModbus(tprtuModbus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TRSP_SERVICE_MODBUS_TYPE: {
				TrspServiceModbusType trspServiceModbusType = (TrspServiceModbusType)theEObject;
				T result = caseTrspServiceModbusType(trspServiceModbusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.TS_GR_MODBUS_REGISTER_REF: {
				TSGrModbusRegisterRef tsGrModbusRegisterRef = (TSGrModbusRegisterRef)theEObject;
				T result = caseTSGrModbusRegisterRef(tsGrModbusRegisterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact API Interface Desc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact API Interface Desc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactAPIInterfaceDescType(ContactAPIInterfaceDescType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ip ADDR Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip ADDR Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpADDRType(IpADDRType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modbus JMES Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modbus JMES Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModbusJMESPathType(ModbusJMESPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Connection State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Connection State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkConnectionStateType(NetworkConnectionStateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest APIJMES Path Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest APIJMES Path Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestAPIJMESPathType1(RestAPIJMESPathType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTU Dev Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTU Dev Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTUDevInstanceType(RTUDevInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Utrsp Srv Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Utrsp Srv Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTUtrspSrvInstanceType(RTUtrspSrvInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTU Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTU Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTUType(RTUType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Access Protection Enabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Access Protection Enabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrAccessProtectionEnabledType(SGrAccessProtectionEnabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Attr4 Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Attr4 Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrAttr4GenericType(SGrAttr4GenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Attr4 Modbus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Attr4 Modbus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrAttr4ModbusType(SGrAttr4ModbusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Attr4 Rest API Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Attr4 Rest API Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrAttr4RestAPIType(SGrAttr4RestAPIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Basic Gen Array DP Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Basic Gen Array DP Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrBasicGenArrayDPTypeType(SGrBasicGenArrayDPTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Basic Gen Data Point Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Basic Gen Data Point Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrBasicGenDataPointTypeType(SGrBasicGenDataPointTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Change Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Change Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrChangeLog(SGrChangeLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Contact API Device Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Contact API Device Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Data Point Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Data Point Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDataPointDescriptionType(SGrDataPointDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Data Points Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Data Points Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDataPointsFrameType(SGrDataPointsFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Device Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Device Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDeviceDescriptionType(SGrDeviceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Device Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Device Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDeviceProfileType(SGrDeviceProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Enum List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Enum List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrEnumListType(SGrEnumListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Flex Assistance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Flex Assistance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrFlexAssistanceType(SGrFlexAssistanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Interface Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Interface Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrInterfaceDescriptionType(SGrInterfaceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Legib Documentation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Legib Documentation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrLegibDocumentationType(SGrLegibDocumentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Data Point Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Data Point Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusDataPointDescriptionType(SGrModbusDataPointDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Data Points Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Data Points Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusDataPointsFrameType(SGrModbusDataPointsFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Device Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Device Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Interface Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Interface Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusInterfaceDescriptionType(SGrModbusInterfaceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Profiles Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Profiles Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusProfilesFrameType(SGrModbusProfilesFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Namelist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Namelist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrNamelistType(SGrNamelistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Profile Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Profile Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrProfileDescriptionType(SGrProfileDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Profilenumber Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Profilenumber Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrProfilenumberType(SGrProfilenumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Profiles Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Profiles Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrProfilesFrameType(SGrProfilesFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Release Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Release Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrReleaseNotes(SGrReleaseNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SG Rrest API Bearer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SG Rrest API Bearer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGRrestAPIBearerType(SGRrestAPIBearerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Data Point Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Data Point Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIDataPointDescriptionType(SGrRestAPIDataPointDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Data Points Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Data Points Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIDataPointsFrameType(SGrRestAPIDataPointsFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr RESTAPI Device Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr RESTAPI Device Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Interface Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Interface Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIInterfaceDescriptionType(SGrRestAPIInterfaceDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Profiles Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Profiles Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIProfilesFrameType(SGrRestAPIProfilesFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest Basic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestBasicType(SGrRestBasicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest Data Points Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest Data Points Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestDataPointsFrameType(SGrRestDataPointsFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest Profiles Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest Profiles Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestProfilesFrameType(SGrRestProfilesFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Scaling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrScalingType(SGrScalingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Serial Interface Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Serial Interface Capability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrSerialInterfaceCapabilityType(SGrSerialInterfaceCapabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Smooth Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Smooth Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrSmoothTransitionType(SGrSmoothTransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Stability Fallback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Stability Fallback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrStabilityFallbackType(SGrStabilityFallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Time Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Time Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrTimeRangeType(SGrTimeRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Version Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Version Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrVersionNumberType(SGrVersionNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP Dev Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP Dev Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPDevInstanceType(TCPDevInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Ptrsp Srv Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Ptrsp Srv Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPtrspSrvInstanceType(TCPtrspSrvInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPType(TCPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Sync Block Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Sync Block Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSyncBlockNotificationType(TimeSyncBlockNotificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPIP Modbus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPIP Modbus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPIPModbus(TPIPModbus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPip V4gen Addr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPip V4gen Addr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPipV4genAddrType(TPipV4genAddrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPip V6gen Addr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPip V6gen Addr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPipV6genAddrType(TPipV6genAddrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPRTU Modbus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPRTU Modbus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPRTUModbus(TPRTUModbus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trsp Service Modbus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trsp Service Modbus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrspServiceModbusType(TrspServiceModbusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS Gr Modbus Register Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS Gr Modbus Register Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSGrModbusRegisterRef(TSGrModbusRegisterRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //V0Switch
