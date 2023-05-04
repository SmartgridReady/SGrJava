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
			case V0Package.HEADER_ENTRY: {
				HeaderEntry headerEntry = (HeaderEntry)theEObject;
				T result = caseHeaderEntry(headerEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.HEADER_LIST: {
				HeaderList headerList = (HeaderList)theEObject;
				T result = caseHeaderList(headerList);
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
			case V0Package.RESPONSE_QUERY: {
				ResponseQuery responseQuery = (ResponseQuery)theEObject;
				T result = caseResponseQuery(responseQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.REST_SERVICE_CALL: {
				RestServiceCall restServiceCall = (RestServiceCall)theEObject;
				T result = caseRestServiceCall(restServiceCall);
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
			case V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE: {
				SGrBasicGenDataPointTypeType sGrBasicGenDataPointTypeType = (SGrBasicGenDataPointTypeType)theEObject;
				T result = caseSGrBasicGenDataPointTypeType(sGrBasicGenDataPointTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_BITMAPPER_LIST_TYPE: {
				SGrBitmapperListType sGrBitmapperListType = (SGrBitmapperListType)theEObject;
				T result = caseSGrBitmapperListType(sGrBitmapperListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_CHANGE_LOG: {
				SGrChangeLog sGrChangeLog = (SGrChangeLog)theEObject;
				T result = caseSGrChangeLog(sGrChangeLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_CONTACT_API_DEVICE_FRAME: {
				SGrContactAPIDeviceFrame sGrContactAPIDeviceFrame = (SGrContactAPIDeviceFrame)theEObject;
				T result = caseSGrContactAPIDeviceFrame(sGrContactAPIDeviceFrame);
				if (result == null) result = caseSGrDeviceBaseType(sGrContactAPIDeviceFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_CONTACT_API_FUNCTIONAL_PROFILE_TYPE: {
				SGrContactAPIFunctionalProfileType sGrContactAPIFunctionalProfileType = (SGrContactAPIFunctionalProfileType)theEObject;
				T result = caseSGrContactAPIFunctionalProfileType(sGrContactAPIFunctionalProfileType);
				if (result == null) result = caseSGrFunctionalProfileBaseType(sGrContactAPIFunctionalProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DATA_POINT_BASE_TYPE: {
				SGrDataPointBaseType sGrDataPointBaseType = (SGrDataPointBaseType)theEObject;
				T result = caseSGrDataPointBaseType(sGrDataPointBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DATA_POINT_DESCRIPTION_TYPE: {
				SGrDataPointDescriptionType sGrDataPointDescriptionType = (SGrDataPointDescriptionType)theEObject;
				T result = caseSGrDataPointDescriptionType(sGrDataPointDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_DEVICE_BASE_TYPE: {
				SGrDeviceBaseType sGrDeviceBaseType = (SGrDeviceBaseType)theEObject;
				T result = caseSGrDeviceBaseType(sGrDeviceBaseType);
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
			case V0Package.SGR_FUNCTIONAL_PROFILE_BASE_TYPE: {
				SGrFunctionalProfileBaseType sGrFunctionalProfileBaseType = (SGrFunctionalProfileBaseType)theEObject;
				T result = caseSGrFunctionalProfileBaseType(sGrFunctionalProfileBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_FUNCTIONAL_PROFILE_FRAME_TYPE: {
				SGrFunctionalProfileFrameType sGrFunctionalProfileFrameType = (SGrFunctionalProfileFrameType)theEObject;
				T result = caseSGrFunctionalProfileFrameType(sGrFunctionalProfileFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_GEN_DEVICE_FRAME: {
				SGrGenDeviceFrame sGrGenDeviceFrame = (SGrGenDeviceFrame)theEObject;
				T result = caseSGrGenDeviceFrame(sGrGenDeviceFrame);
				if (result == null) result = caseSGrDeviceBaseType(sGrGenDeviceFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_GEN_FUNCTIONAL_PROFILE_TYPE: {
				SGrGenFunctionalProfileType sGrGenFunctionalProfileType = (SGrGenFunctionalProfileType)theEObject;
				T result = caseSGrGenFunctionalProfileType(sGrGenFunctionalProfileType);
				if (result == null) result = caseSGrFunctionalProfileBaseType(sGrGenFunctionalProfileType);
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
			case V0Package.SGR_MODBUS_DATA_POINT_TYPE: {
				SGrModbusDataPointType sGrModbusDataPointType = (SGrModbusDataPointType)theEObject;
				T result = caseSGrModbusDataPointType(sGrModbusDataPointType);
				if (result == null) result = caseSGrDataPointBaseType(sGrModbusDataPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_DEVICE_FRAME: {
				SGrModbusDeviceFrame sGrModbusDeviceFrame = (SGrModbusDeviceFrame)theEObject;
				T result = caseSGrModbusDeviceFrame(sGrModbusDeviceFrame);
				if (result == null) result = caseSGrDeviceBaseType(sGrModbusDeviceFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_FUNCTIONAL_PROFILE_TYPE: {
				SGrModbusFunctionalProfileType sGrModbusFunctionalProfileType = (SGrModbusFunctionalProfileType)theEObject;
				T result = caseSGrModbusFunctionalProfileType(sGrModbusFunctionalProfileType);
				if (result == null) result = caseSGrFunctionalProfileBaseType(sGrModbusFunctionalProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_MODBUS_INTERFACE_DESCRIPTION_TYPE: {
				SGrModbusInterfaceDescriptionType sGrModbusInterfaceDescriptionType = (SGrModbusInterfaceDescriptionType)theEObject;
				T result = caseSGrModbusInterfaceDescriptionType(sGrModbusInterfaceDescriptionType);
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
			case V0Package.SGR_REST_API_DATA_POINT_TYPE: {
				SGrRestAPIDataPointType sGrRestAPIDataPointType = (SGrRestAPIDataPointType)theEObject;
				T result = caseSGrRestAPIDataPointType(sGrRestAPIDataPointType);
				if (result == null) result = caseSGrDataPointBaseType(sGrRestAPIDataPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_DEVICE_FRAME: {
				SGrRestAPIDeviceFrame sGrRestAPIDeviceFrame = (SGrRestAPIDeviceFrame)theEObject;
				T result = caseSGrRestAPIDeviceFrame(sGrRestAPIDeviceFrame);
				if (result == null) result = caseSGrDeviceBaseType(sGrRestAPIDeviceFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_FUNCTIONAL_PROFILE_TYPE: {
				SGrRestAPIFunctionalProfileType sGrRestAPIFunctionalProfileType = (SGrRestAPIFunctionalProfileType)theEObject;
				T result = caseSGrRestAPIFunctionalProfileType(sGrRestAPIFunctionalProfileType);
				if (result == null) result = caseSGrFunctionalProfileBaseType(sGrRestAPIFunctionalProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE: {
				SGrRestAPIInterfaceDescriptionType sGrRestAPIInterfaceDescriptionType = (SGrRestAPIInterfaceDescriptionType)theEObject;
				T result = caseSGrRestAPIInterfaceDescriptionType(sGrRestAPIInterfaceDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V0Package.SGR_REST_BASIC_TYPE: {
				SGrRestBasicType sGrRestBasicType = (SGrRestBasicType)theEObject;
				T result = caseSGrRestBasicType(sGrRestBasicType);
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
			case V0Package.SGR_TIME_SYNC_BLOCK_NOTIFICATION_TYPE: {
				SGrTimeSyncBlockNotificationType sGrTimeSyncBlockNotificationType = (SGrTimeSyncBlockNotificationType)theEObject;
				T result = caseSGrTimeSyncBlockNotificationType(sGrTimeSyncBlockNotificationType);
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
	 * Returns the result of interpreting the object as an instance of '<em>Header Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderEntry(HeaderEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderList(HeaderList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Response Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseQuery(ResponseQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Service Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestServiceCall(RestServiceCall object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Bitmapper List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Bitmapper List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrBitmapperListType(SGrBitmapperListType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Contact API Device Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Contact API Device Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrContactAPIDeviceFrame(SGrContactAPIDeviceFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Contact API Functional Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Contact API Functional Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrContactAPIFunctionalProfileType(SGrContactAPIFunctionalProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Data Point Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Data Point Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDataPointBaseType(SGrDataPointBaseType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Device Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Device Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrDeviceBaseType(SGrDeviceBaseType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Functional Profile Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Functional Profile Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrFunctionalProfileBaseType(SGrFunctionalProfileBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Functional Profile Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Functional Profile Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrFunctionalProfileFrameType(SGrFunctionalProfileFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Gen Device Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Gen Device Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrGenDeviceFrame(SGrGenDeviceFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Gen Functional Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Gen Functional Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrGenFunctionalProfileType(SGrGenFunctionalProfileType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Data Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Data Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusDataPointType(SGrModbusDataPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Device Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Device Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusDeviceFrame(SGrModbusDeviceFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Modbus Functional Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Modbus Functional Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrModbusFunctionalProfileType(SGrModbusFunctionalProfileType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Data Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Data Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIDataPointType(SGrRestAPIDataPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Device Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Device Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIDeviceFrame(SGrRestAPIDeviceFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGr Rest API Functional Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Rest API Functional Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrRestAPIFunctionalProfileType(SGrRestAPIFunctionalProfileType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SGr Time Sync Block Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGr Time Sync Block Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrTimeSyncBlockNotificationType(SGrTimeSyncBlockNotificationType object) {
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
