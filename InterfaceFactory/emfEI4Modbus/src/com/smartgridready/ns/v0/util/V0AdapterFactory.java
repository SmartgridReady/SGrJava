/**
 */
package com.smartgridready.ns.v0.util;

import com.smartgridready.ns.v0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package
 * @generated
 */
public class V0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static V0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = V0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected V0Switch<Adapter> modelSwitch =
		new V0Switch<Adapter>() {
			@Override
			public Adapter caseContactAPIInterfaceDescType(ContactAPIInterfaceDescType object) {
				return createContactAPIInterfaceDescTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDpAccessProtectionEnabledType(DpAccessProtectionEnabledType object) {
				return createDpAccessProtectionEnabledTypeAdapter();
			}
			@Override
			public Adapter caseIpADDRType(IpADDRType object) {
				return createIpADDRTypeAdapter();
			}
			@Override
			public Adapter caseModbusJMESPathType(ModbusJMESPathType object) {
				return createModbusJMESPathTypeAdapter();
			}
			@Override
			public Adapter caseNetworkConnectionStateType(NetworkConnectionStateType object) {
				return createNetworkConnectionStateTypeAdapter();
			}
			@Override
			public Adapter caseRestAPIJMESPathType1(RestAPIJMESPathType1 object) {
				return createRestAPIJMESPathType1Adapter();
			}
			@Override
			public Adapter caseRTUDevInstanceType(RTUDevInstanceType object) {
				return createRTUDevInstanceTypeAdapter();
			}
			@Override
			public Adapter caseRTUtrspSrvInstanceType(RTUtrspSrvInstanceType object) {
				return createRTUtrspSrvInstanceTypeAdapter();
			}
			@Override
			public Adapter caseRTUType(RTUType object) {
				return createRTUTypeAdapter();
			}
			@Override
			public Adapter caseSGrAttr4GenericType(SGrAttr4GenericType object) {
				return createSGrAttr4GenericTypeAdapter();
			}
			@Override
			public Adapter caseSGrAttr4ModbusType(SGrAttr4ModbusType object) {
				return createSGrAttr4ModbusTypeAdapter();
			}
			@Override
			public Adapter caseSGrAttr4RestAPIType(SGrAttr4RestAPIType object) {
				return createSGrAttr4RestAPITypeAdapter();
			}
			@Override
			public Adapter caseSGrBasicGenDataPointTypeType(SGrBasicGenDataPointTypeType object) {
				return createSGrBasicGenDataPointTypeTypeAdapter();
			}
			@Override
			public Adapter caseSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType object) {
				return createSGrContactAPIDeviceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrDataPointDescriptionType(SGrDataPointDescriptionType object) {
				return createSGrDataPointDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrDataPointsFrameType(SGrDataPointsFrameType object) {
				return createSGrDataPointsFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrDeviceDescriptionType(SGrDeviceDescriptionType object) {
				return createSGrDeviceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrDeviceProfileType(SGrDeviceProfileType object) {
				return createSGrDeviceProfileTypeAdapter();
			}
			@Override
			public Adapter caseSGrEnumListType(SGrEnumListType object) {
				return createSGrEnumListTypeAdapter();
			}
			@Override
			public Adapter caseSGrFlexAssistanceType(SGrFlexAssistanceType object) {
				return createSGrFlexAssistanceTypeAdapter();
			}
			@Override
			public Adapter caseSGrInterfaceDescriptionType(SGrInterfaceDescriptionType object) {
				return createSGrInterfaceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrLegibDocumentationType(SGrLegibDocumentationType object) {
				return createSGrLegibDocumentationTypeAdapter();
			}
			@Override
			public Adapter caseSGrModbusAttrFrameType(SGrModbusAttrFrameType object) {
				return createSGrModbusAttrFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrModbusDataPointDescriptionType(SGrModbusDataPointDescriptionType object) {
				return createSGrModbusDataPointDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrModbusDataPointsFrameType(SGrModbusDataPointsFrameType object) {
				return createSGrModbusDataPointsFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType object) {
				return createSGrModbusDeviceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrModbusInterfaceDescriptionType(SGrModbusInterfaceDescriptionType object) {
				return createSGrModbusInterfaceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrModbusProfilesFrameType(SGrModbusProfilesFrameType object) {
				return createSGrModbusProfilesFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrNamelistType(SGrNamelistType object) {
				return createSGrNamelistTypeAdapter();
			}
			@Override
			public Adapter caseSGrProfileDescriptionType(SGrProfileDescriptionType object) {
				return createSGrProfileDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrProfilenumberType(SGrProfilenumberType object) {
				return createSGrProfilenumberTypeAdapter();
			}
			@Override
			public Adapter caseSGrProfilesFrameType(SGrProfilesFrameType object) {
				return createSGrProfilesFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestAPIAttrFrameType(SGrRestAPIAttrFrameType object) {
				return createSGrRestAPIAttrFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGRrestAPIBearerType(SGRrestAPIBearerType object) {
				return createSGRrestAPIBearerTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestAPIDataPointDescriptionType(SGrRestAPIDataPointDescriptionType object) {
				return createSGrRestAPIDataPointDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestAPIDataPointsFrameType(SGrRestAPIDataPointsFrameType object) {
				return createSGrRestAPIDataPointsFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType object) {
				return createSGrRESTAPIDeviceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestAPIInterfaceDescriptionType(SGrRestAPIInterfaceDescriptionType object) {
				return createSGrRestAPIInterfaceDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestAPIProfilesFrameType(SGrRestAPIProfilesFrameType object) {
				return createSGrRestAPIProfilesFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestBasicType(SGrRestBasicType object) {
				return createSGrRestBasicTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestDataPointsFrameType(SGrRestDataPointsFrameType object) {
				return createSGrRestDataPointsFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrRestProfilesFrameType(SGrRestProfilesFrameType object) {
				return createSGrRestProfilesFrameTypeAdapter();
			}
			@Override
			public Adapter caseSGrScalingType(SGrScalingType object) {
				return createSGrScalingTypeAdapter();
			}
			@Override
			public Adapter caseSGrSerialInterfaceCapabilityType(SGrSerialInterfaceCapabilityType object) {
				return createSGrSerialInterfaceCapabilityTypeAdapter();
			}
			@Override
			public Adapter caseSGrSmoothTransitionType(SGrSmoothTransitionType object) {
				return createSGrSmoothTransitionTypeAdapter();
			}
			@Override
			public Adapter caseSGrStabilityFallbackType(SGrStabilityFallbackType object) {
				return createSGrStabilityFallbackTypeAdapter();
			}
			@Override
			public Adapter caseSGrTimeRangeType(SGrTimeRangeType object) {
				return createSGrTimeRangeTypeAdapter();
			}
			@Override
			public Adapter caseSGrVersionNumberType(SGrVersionNumberType object) {
				return createSGrVersionNumberTypeAdapter();
			}
			@Override
			public Adapter caseTCPDevInstanceType(TCPDevInstanceType object) {
				return createTCPDevInstanceTypeAdapter();
			}
			@Override
			public Adapter caseTCPtrspSrvInstanceType(TCPtrspSrvInstanceType object) {
				return createTCPtrspSrvInstanceTypeAdapter();
			}
			@Override
			public Adapter caseTCPType(TCPType object) {
				return createTCPTypeAdapter();
			}
			@Override
			public Adapter caseTimeSyncBlockNotificationType(TimeSyncBlockNotificationType object) {
				return createTimeSyncBlockNotificationTypeAdapter();
			}
			@Override
			public Adapter caseTPIPModbus(TPIPModbus object) {
				return createTPIPModbusAdapter();
			}
			@Override
			public Adapter caseTPipV4genAddrType(TPipV4genAddrType object) {
				return createTPipV4genAddrTypeAdapter();
			}
			@Override
			public Adapter caseTPipV6genAddrType(TPipV6genAddrType object) {
				return createTPipV6genAddrTypeAdapter();
			}
			@Override
			public Adapter caseTPRTUModbus(TPRTUModbus object) {
				return createTPRTUModbusAdapter();
			}
			@Override
			public Adapter caseTrspServiceModbusType(TrspServiceModbusType object) {
				return createTrspServiceModbusTypeAdapter();
			}
			@Override
			public Adapter caseTSGrModbusRegisterRef(TSGrModbusRegisterRef object) {
				return createTSGrModbusRegisterRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.ContactAPIInterfaceDescType <em>Contact API Interface Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.ContactAPIInterfaceDescType
	 * @generated
	 */
	public Adapter createContactAPIInterfaceDescTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.DpAccessProtectionEnabledType <em>Dp Access Protection Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.DpAccessProtectionEnabledType
	 * @generated
	 */
	public Adapter createDpAccessProtectionEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.IpADDRType <em>Ip ADDR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.IpADDRType
	 * @generated
	 */
	public Adapter createIpADDRTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.ModbusJMESPathType <em>Modbus JMES Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.ModbusJMESPathType
	 * @generated
	 */
	public Adapter createModbusJMESPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.NetworkConnectionStateType <em>Network Connection State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.NetworkConnectionStateType
	 * @generated
	 */
	public Adapter createNetworkConnectionStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.RestAPIJMESPathType1 <em>Rest APIJMES Path Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.RestAPIJMESPathType1
	 * @generated
	 */
	public Adapter createRestAPIJMESPathType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.RTUDevInstanceType <em>RTU Dev Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.RTUDevInstanceType
	 * @generated
	 */
	public Adapter createRTUDevInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.RTUtrspSrvInstanceType <em>RT Utrsp Srv Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.RTUtrspSrvInstanceType
	 * @generated
	 */
	public Adapter createRTUtrspSrvInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.RTUType <em>RTU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.RTUType
	 * @generated
	 */
	public Adapter createRTUTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrAttr4GenericType <em>SGr Attr4 Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrAttr4GenericType
	 * @generated
	 */
	public Adapter createSGrAttr4GenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrAttr4ModbusType <em>SGr Attr4 Modbus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrAttr4ModbusType
	 * @generated
	 */
	public Adapter createSGrAttr4ModbusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrAttr4RestAPIType <em>SGr Attr4 Rest API Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrAttr4RestAPIType
	 * @generated
	 */
	public Adapter createSGrAttr4RestAPITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType <em>SGr Basic Gen Data Point Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType
	 * @generated
	 */
	public Adapter createSGrBasicGenDataPointTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrContactAPIDeviceDescriptionType <em>SGr Contact API Device Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrContactAPIDeviceDescriptionType
	 * @generated
	 */
	public Adapter createSGrContactAPIDeviceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDataPointDescriptionType <em>SGr Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDataPointDescriptionType
	 * @generated
	 */
	public Adapter createSGrDataPointDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDataPointsFrameType <em>SGr Data Points Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDataPointsFrameType
	 * @generated
	 */
	public Adapter createSGrDataPointsFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDeviceDescriptionType <em>SGr Device Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDeviceDescriptionType
	 * @generated
	 */
	public Adapter createSGrDeviceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrDeviceProfileType <em>SGr Device Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrDeviceProfileType
	 * @generated
	 */
	public Adapter createSGrDeviceProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrEnumListType <em>SGr Enum List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrEnumListType
	 * @generated
	 */
	public Adapter createSGrEnumListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrFlexAssistanceType <em>SGr Flex Assistance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrFlexAssistanceType
	 * @generated
	 */
	public Adapter createSGrFlexAssistanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrInterfaceDescriptionType <em>SGr Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrInterfaceDescriptionType
	 * @generated
	 */
	public Adapter createSGrInterfaceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrLegibDocumentationType <em>SGr Legib Documentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrLegibDocumentationType
	 * @generated
	 */
	public Adapter createSGrLegibDocumentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrModbusAttrFrameType <em>SGr Modbus Attr Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrModbusAttrFrameType
	 * @generated
	 */
	public Adapter createSGrModbusAttrFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType <em>SGr Modbus Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType
	 * @generated
	 */
	public Adapter createSGrModbusDataPointDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrModbusDataPointsFrameType <em>SGr Modbus Data Points Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrModbusDataPointsFrameType
	 * @generated
	 */
	public Adapter createSGrModbusDataPointsFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrModbusDeviceDescriptionType <em>SGr Modbus Device Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrModbusDeviceDescriptionType
	 * @generated
	 */
	public Adapter createSGrModbusDeviceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType <em>SGr Modbus Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType
	 * @generated
	 */
	public Adapter createSGrModbusInterfaceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrModbusProfilesFrameType <em>SGr Modbus Profiles Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrModbusProfilesFrameType
	 * @generated
	 */
	public Adapter createSGrModbusProfilesFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrNamelistType <em>SGr Namelist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrNamelistType
	 * @generated
	 */
	public Adapter createSGrNamelistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrProfileDescriptionType <em>SGr Profile Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrProfileDescriptionType
	 * @generated
	 */
	public Adapter createSGrProfileDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrProfilenumberType <em>SGr Profilenumber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrProfilenumberType
	 * @generated
	 */
	public Adapter createSGrProfilenumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrProfilesFrameType <em>SGr Profiles Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrProfilesFrameType
	 * @generated
	 */
	public Adapter createSGrProfilesFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestAPIAttrFrameType <em>SGr Rest API Attr Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestAPIAttrFrameType
	 * @generated
	 */
	public Adapter createSGrRestAPIAttrFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGRrestAPIBearerType <em>SG Rrest API Bearer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGRrestAPIBearerType
	 * @generated
	 */
	public Adapter createSGRrestAPIBearerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType <em>SGr Rest API Data Point Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType
	 * @generated
	 */
	public Adapter createSGrRestAPIDataPointDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType <em>SGr Rest API Data Points Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestAPIDataPointsFrameType
	 * @generated
	 */
	public Adapter createSGrRestAPIDataPointsFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType <em>SGr RESTAPI Device Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRESTAPIDeviceDescriptionType
	 * @generated
	 */
	public Adapter createSGrRESTAPIDeviceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType <em>SGr Rest API Interface Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType
	 * @generated
	 */
	public Adapter createSGrRestAPIInterfaceDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType <em>SGr Rest API Profiles Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestAPIProfilesFrameType
	 * @generated
	 */
	public Adapter createSGrRestAPIProfilesFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestBasicType <em>SGr Rest Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestBasicType
	 * @generated
	 */
	public Adapter createSGrRestBasicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestDataPointsFrameType <em>SGr Rest Data Points Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestDataPointsFrameType
	 * @generated
	 */
	public Adapter createSGrRestDataPointsFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrRestProfilesFrameType <em>SGr Rest Profiles Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrRestProfilesFrameType
	 * @generated
	 */
	public Adapter createSGrRestProfilesFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrScalingType <em>SGr Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrScalingType
	 * @generated
	 */
	public Adapter createSGrScalingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType <em>SGr Serial Interface Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrSerialInterfaceCapabilityType
	 * @generated
	 */
	public Adapter createSGrSerialInterfaceCapabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrSmoothTransitionType <em>SGr Smooth Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrSmoothTransitionType
	 * @generated
	 */
	public Adapter createSGrSmoothTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrStabilityFallbackType <em>SGr Stability Fallback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrStabilityFallbackType
	 * @generated
	 */
	public Adapter createSGrStabilityFallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrTimeRangeType <em>SGr Time Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrTimeRangeType
	 * @generated
	 */
	public Adapter createSGrTimeRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.SGrVersionNumberType <em>SGr Version Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.SGrVersionNumberType
	 * @generated
	 */
	public Adapter createSGrVersionNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TCPDevInstanceType <em>TCP Dev Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TCPDevInstanceType
	 * @generated
	 */
	public Adapter createTCPDevInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TCPtrspSrvInstanceType <em>TC Ptrsp Srv Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TCPtrspSrvInstanceType
	 * @generated
	 */
	public Adapter createTCPtrspSrvInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TCPType <em>TCP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TCPType
	 * @generated
	 */
	public Adapter createTCPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TimeSyncBlockNotificationType <em>Time Sync Block Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TimeSyncBlockNotificationType
	 * @generated
	 */
	public Adapter createTimeSyncBlockNotificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TPIPModbus <em>TPIP Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TPIPModbus
	 * @generated
	 */
	public Adapter createTPIPModbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TPipV4genAddrType <em>TPip V4gen Addr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TPipV4genAddrType
	 * @generated
	 */
	public Adapter createTPipV4genAddrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TPipV6genAddrType <em>TPip V6gen Addr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TPipV6genAddrType
	 * @generated
	 */
	public Adapter createTPipV6genAddrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TPRTUModbus <em>TPRTU Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TPRTUModbus
	 * @generated
	 */
	public Adapter createTPRTUModbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TrspServiceModbusType <em>Trsp Service Modbus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TrspServiceModbusType
	 * @generated
	 */
	public Adapter createTrspServiceModbusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef <em>TS Gr Modbus Register Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.smartgridready.ns.v0.TSGrModbusRegisterRef
	 * @generated
	 */
	public Adapter createTSGrModbusRegisterRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //V0AdapterFactory
