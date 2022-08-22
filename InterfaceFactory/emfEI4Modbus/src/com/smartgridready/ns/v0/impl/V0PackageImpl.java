/**
 */
package com.smartgridready.ns.v0.impl;

import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;

import com.smartgridready.ns.v0.util.V0Validator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class V0PackageImpl extends EPackageImpl implements V0Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "v0.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactAPIInterfaceDescTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipADDRTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modbusJMESPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectionStateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restAPIJMESPathType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtuDevInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtUtrspSrvInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtuTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrAccessProtectionEnabledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrAttr4GenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrAttr4ModbusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrAttr4RestAPITypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrBasicGenArrayDPTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrBasicGenDataPointTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrContactAPIDeviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDataPointDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDataPointsFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDeviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrDeviceProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrEnumListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrFlexAssistanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrInterfaceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrLegibDocumentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrModbusAttrFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrModbusDataPointDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrModbusDataPointsFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrModbusDeviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrModbusInterfaceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrModbusProfilesFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrNamelistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrProfileDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrProfilenumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrProfilesFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestAPIAttrFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sgRrestAPIBearerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestAPIDataPointDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestAPIDataPointsFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRESTAPIDeviceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestAPIInterfaceDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestAPIProfilesFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestBasicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestDataPointsFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrRestProfilesFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrScalingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrSerialInterfaceCapabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrSmoothTransitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrStabilityFallbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrTimeRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrVersionNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpDevInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcPtrspSrvInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSyncBlockNotificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpipModbusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPipV4genAddrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPipV6genAddrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tprtuModbusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trspServiceModbusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsGrModbusRegisterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eBaudRateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eByteLenTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eParityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eStopBitLenTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum masterFunctionsSupportedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modbusInterfaceSelectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum profileTypeEnumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrDeviceKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sgReadyStateLv1TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sgReadyStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrEVSEStateLv1TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrEVSEStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrEVStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrHPOpModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrLanguageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrManufacturerIDTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMeasValueSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMeasValueStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMeasValueTendencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrModbusLayer6DeviationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrModbusReg2BoolArrayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrMROPresenceLevelIndicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrNamelistKindOfTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrObligLvlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrOCPPStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrPowerSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrRestAPIAuthenticationEnumMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrRestAPIdataTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrRestAPIInterfaceSelectiontypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrRWPTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSGCPFeedInStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSGCPLoadStateLv2TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSGCPServiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrSunspStateCodesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrTransportServicesUsedListTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sGrUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subProfileTypeEnumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tEnumConversionFctEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tEnumExceptionCodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tEnumObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bitmaskTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dpSizeNrRegistersTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dpSizeNrRegistersTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBaudRateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteLenTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eParityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStopBitLenTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n1Type1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n2Type1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n3TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n3Type1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n4TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4n4Type1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4portNrTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4portNrTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masterFunctionsSupportedTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modbusInterfaceSelectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType placeHolder4futureExtensionsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prelimStringDefTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType profileTypeEnumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restAPIEndPointTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restAPIEndPointType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restAPIJMESPathTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restBasicPasswordTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restBasicUsernameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrDeviceKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sgReadyStateLv1TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sgReadyStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrEVSEStateLv1TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrEVSEStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrEVStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrHPOpModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrLanguageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrManufacturerIDTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMeasValueSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMeasValueStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMeasValueTendencyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrModbusLayer6DeviationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrModbusReg2BoolArrayTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrMROPresenceLevelIndicationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrNamelistKindOfTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrObligLvlTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrOCPPStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrPowerSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrPrecisionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrPrecisionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrRestAPIAuthenticationEnumMethodTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrRestAPIdataTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrRestAPIInterfaceSelectiontypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrRWPTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSGCPFeedInStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSGCPLoadStateLv2TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSGCPServiceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSpecialQualityReqTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrSunspStateCodesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrTransportServicesUsedListTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sGrUnitsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subProfileTypeEnumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tBitRankEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tBitRankObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tEnumConversionFctObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tEnumExceptionCodeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tEnumObjectTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textElementTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tiPportNrTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tiPportNrTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tSlaveIDTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tSlaveIDTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.smartgridready.ns.v0.V0Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private V0PackageImpl() {
		super(eNS_URI, V0Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link V0Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static V0Package init() {
		if (isInited) return (V0Package)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI);

		// Obtain or create and register package
		Object registeredV0Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		V0PackageImpl theV0Package = registeredV0Package instanceof V0PackageImpl ? (V0PackageImpl)registeredV0Package : new V0PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theV0Package.loadPackage();

		// Fix loaded packages
		theV0Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theV0Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return V0Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theV0Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(V0Package.eNS_URI, theV0Package);
		return theV0Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactAPIInterfaceDescType() {
		if (contactAPIInterfaceDescTypeEClass == null) {
			contactAPIInterfaceDescTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(1);
		}
		return contactAPIInterfaceDescTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAPIInterfaceDescType_NumContacts() {
        return (EAttribute)getContactAPIInterfaceDescType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAPIInterfaceDescType_ContactStabilisationTimeMs() {
        return (EAttribute)getContactAPIInterfaceDescType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(2);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_BaudRatesSupported() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ByteLenSupported() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DeviceProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FunctionalProfiles() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GenDeviceFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ModbusFunctionCodesSupported() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_NetConnectionState() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ParitySupported() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrModbusDataPointDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrModbusInterfaceDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SgrContactAPIDeviceFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrContactAPIDeviceDescriptionType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrModbusDeviceDescriptionType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrModbusDeviceFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrRESTAPIDeviceDescriptionType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SGrRestAPIDeviceFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SgrSerialInterfaceCapability() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StopBitLenSupported() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TrspServiceModbus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIpADDRType() {
		if (ipADDRTypeEClass == null) {
			ipADDRTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(13);
		}
		return ipADDRTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpADDRType_IpV4n1() {
        return (EAttribute)getIpADDRType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpADDRType_IpV4n2() {
        return (EAttribute)getIpADDRType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpADDRType_IpV4n3() {
        return (EAttribute)getIpADDRType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpADDRType_IpV4n4() {
        return (EAttribute)getIpADDRType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModbusJMESPathType() {
		if (modbusJMESPathTypeEClass == null) {
			modbusJMESPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(28);
		}
		return modbusJMESPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModbusJMESPathType_Value() {
        return (EAttribute)getModbusJMESPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkConnectionStateType() {
		if (networkConnectionStateTypeEClass == null) {
			networkConnectionStateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(29);
		}
		return networkConnectionStateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkConnectionStateType_IsConnected() {
        return (EAttribute)getNetworkConnectionStateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkConnectionStateType_NextAttempt() {
        return (EAttribute)getNetworkConnectionStateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestAPIJMESPathType1() {
		if (restAPIJMESPathType1EClass == null) {
			restAPIJMESPathType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(37);
		}
		return restAPIJMESPathType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestAPIJMESPathType1_Value() {
        return (EAttribute)getRestAPIJMESPathType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRTUDevInstanceType() {
		if (rtuDevInstanceTypeEClass == null) {
			rtuDevInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(40);
		}
		return rtuDevInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRTUDevInstanceType_DeviceInstName() {
        return (EAttribute)getRTUDevInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRTUDevInstanceType_SlaveAddr() {
        return (EAttribute)getRTUDevInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRTUtrspSrvInstanceType() {
		if (rtUtrspSrvInstanceTypeEClass == null) {
			rtUtrspSrvInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(41);
		}
		return rtUtrspSrvInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRTUtrspSrvInstanceType_BaudRate() {
        return (EAttribute)getRTUtrspSrvInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRTUtrspSrvInstanceType_ByteLen() {
        return (EAttribute)getRTUtrspSrvInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRTUtrspSrvInstanceType_Parity() {
        return (EAttribute)getRTUtrspSrvInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRTUtrspSrvInstanceType_StopBitLen() {
        return (EAttribute)getRTUtrspSrvInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRTUType() {
		if (rtuTypeEClass == null) {
			rtuTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(42);
		}
		return rtuTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRTUType_RtuTrspSrvInstance() {
        return (EReference)getRTUType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRTUType_RtuDevInstance() {
        return (EReference)getRTUType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrAccessProtectionEnabledType() {
		if (sGrAccessProtectionEnabledTypeEClass == null) {
			sGrAccessProtectionEnabledTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(43);
		}
		return sGrAccessProtectionEnabledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAccessProtectionEnabledType_ModbusException() {
        return (EAttribute)getSGrAccessProtectionEnabledType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAccessProtectionEnabledType_IsEnabled() {
        return (EAttribute)getSGrAccessProtectionEnabledType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrAttr4GenericType() {
		if (sGrAttr4GenericTypeEClass == null) {
			sGrAttr4GenericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(44);
		}
		return sGrAttr4GenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MaxVal() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MinVal() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_SpecQualityRequirement() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_Precision() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4GenericType_StabilityFallback() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4GenericType_SmoothTransition() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MinSendDelta() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MaxSendTime() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MaxReceiveTime() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MinSendTime() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MaxLatencyTime() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_TimeStampLog() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4GenericType_TimeRange() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_ValueState() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_ValueTendency() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_ValueSource() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_SampleRate() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_Curtailment() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MinLoad() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MaxLockTimeMinutes() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_MinRunTimeMinutes() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4GenericType_ValueByTimeTableMinutes() {
        return (EAttribute)getSGrAttr4GenericType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4GenericType_FlexAssistance() {
        return (EReference)getSGrAttr4GenericType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrAttr4ModbusType() {
		if (sGrAttr4ModbusTypeEClass == null) {
			sGrAttr4ModbusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(45);
		}
		return sGrAttr4ModbusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4ModbusType_ScalingByMulPwr() {
        return (EReference)getSGrAttr4ModbusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4ModbusType_StepByIncrement() {
        return (EAttribute)getSGrAttr4ModbusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4ModbusType_Sunssf() {
        return (EAttribute)getSGrAttr4ModbusType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4ModbusType_PollLatencyMS() {
        return (EAttribute)getSGrAttr4ModbusType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4ModbusType_TimeSyncBlockNotification() {
        return (EReference)getSGrAttr4ModbusType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrAttr4ModbusType_AccessProtection() {
        return (EReference)getSGrAttr4ModbusType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4ModbusType_Layer6Deviation() {
        return (EAttribute)getSGrAttr4ModbusType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrAttr4RestAPIType() {
		if (sGrAttr4RestAPITypeEClass == null) {
			sGrAttr4RestAPITypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(46);
		}
		return sGrAttr4RestAPITypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrAttr4RestAPIType_PlaceHolder4futureExtensions() {
        return (EAttribute)getSGrAttr4RestAPIType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrBasicGenArrayDPTypeType() {
		if (sGrBasicGenArrayDPTypeTypeEClass == null) {
			sGrBasicGenArrayDPTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(47);
		}
		return sGrBasicGenArrayDPTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Boolean() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int8() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int16() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int32() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int64() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int8U() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int16U() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int32U() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Int64U() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Float32() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_Float64() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_DateTime() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenArrayDPTypeType_String() {
        return (EAttribute)getSGrBasicGenArrayDPTypeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrBasicGenDataPointTypeType() {
		if (sGrBasicGenDataPointTypeTypeEClass == null) {
			sGrBasicGenDataPointTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(48);
		}
		return sGrBasicGenDataPointTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Boolean() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int8() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int16() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int32() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int64() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int8U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int16U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int32U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Int64U() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Float32() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_Float64() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrBasicGenDataPointTypeType_Enum() {
        return (EReference)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_DateTime() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrBasicGenDataPointTypeType_String() {
        return (EAttribute)getSGrBasicGenDataPointTypeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrContactAPIDeviceDescriptionType() {
		if (sGrContactAPIDeviceDescriptionTypeEClass == null) {
			sGrContactAPIDeviceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(49);
		}
		return sGrContactAPIDeviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrContactAPIDeviceDescriptionType_DeviceProfile() {
        return (EReference)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrContactAPIDeviceDescriptionType_DevAttr4Generic() {
        return (EReference)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrContactAPIDeviceDescriptionType_ContactApiInterfaceDesc() {
        return (EReference)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrContactAPIDeviceDescriptionType_FpListElement() {
        return (EReference)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrContactAPIDeviceDescriptionType_DeviceName() {
        return (EAttribute)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrContactAPIDeviceDescriptionType_IsLocalControl() {
        return (EAttribute)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrContactAPIDeviceDescriptionType_ManufacturerID() {
        return (EAttribute)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrContactAPIDeviceDescriptionType_ManufacturerName() {
        return (EAttribute)getSGrContactAPIDeviceDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrDataPointDescriptionType() {
		if (sGrDataPointDescriptionTypeEClass == null) {
			sGrDataPointDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(50);
		}
		return sGrDataPointDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointDescriptionType_BasicDataType() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointDescriptionType_BasicArrayDataType() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointDescriptionType_DpNameList() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointDescriptionType_DpLegibDesc() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointDescriptionType_DpPrgDesc() {
        return (EReference)getSGrDataPointDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDataPointDescriptionType_DatapointName() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDataPointDescriptionType_MroVisibilityIndicator() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDataPointDescriptionType_RwpDatadirection() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDataPointDescriptionType_Unit() {
        return (EAttribute)getSGrDataPointDescriptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrDataPointsFrameType() {
		if (sGrDataPointsFrameTypeEClass == null) {
			sGrDataPointsFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(51);
		}
		return sGrDataPointsFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointsFrameType_DataPoint() {
        return (EReference)getSGrDataPointsFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDataPointsFrameType_DpAttr4Generic() {
        return (EReference)getSGrDataPointsFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrDeviceDescriptionType() {
		if (sGrDeviceDescriptionTypeEClass == null) {
			sGrDeviceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(52);
		}
		return sGrDeviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceDescriptionType_DeviceProfile() {
        return (EReference)getSGrDeviceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceDescriptionType_DevAttr4Generic() {
        return (EReference)getSGrDeviceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceDescriptionType_FpListElement() {
        return (EReference)getSGrDeviceDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceDescriptionType_DeviceName() {
        return (EAttribute)getSGrDeviceDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceDescriptionType_IsLocalControl() {
        return (EAttribute)getSGrDeviceDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceDescriptionType_ManufacturerID() {
        return (EAttribute)getSGrDeviceDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceDescriptionType_ManufacturerName() {
        return (EAttribute)getSGrDeviceDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrDeviceProfileType() {
		if (sGrDeviceProfileTypeEClass == null) {
			sGrDeviceProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(55);
		}
		return sGrDeviceProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceProfileType_DevNameList() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceProfileType_DevLegibDesc() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_TransportService() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_DeviceKind() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_SerialNumber() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceProfileType_SoftwareRevision() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceProfileType_HardwareRevision() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_BrandName() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_PowerSource() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_NominalPower() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_ManufSpecIdent() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_ManufacturerLabel() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_RemAuthorID() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrDeviceProfileType_DevLevelofOperation() {
        return (EAttribute)getSGrDeviceProfileType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrDeviceProfileType_DevPrgDesc() {
        return (EReference)getSGrDeviceProfileType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrEnumListType() {
		if (sGrEnumListTypeEClass == null) {
			sGrEnumListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(60);
		}
		return sGrEnumListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrMeasValueState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrMeasValueTendency() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrMeasValueSource() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrPowerSource() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgreadyStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgreadyStateLv1() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrSunspStateCodes() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrEVSEStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrEVSEStateLv1() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrSGCPLoadStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrSGCPFeedInStateLv2() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrEVState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrSGCPService() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrObligLvl() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrOCPPState() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrEnumListType_SgrHPOpMode() {
        return (EAttribute)getSGrEnumListType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrFlexAssistanceType() {
		if (sGrFlexAssistanceTypeEClass == null) {
			sGrFlexAssistanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(67);
		}
		return sGrFlexAssistanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrFlexAssistanceType_Assists() {
        return (EAttribute)getSGrFlexAssistanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrFlexAssistanceType_ObligedTo() {
        return (EAttribute)getSGrFlexAssistanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrInterfaceDescriptionType() {
		if (sGrInterfaceDescriptionTypeEClass == null) {
			sGrInterfaceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(70);
		}
		return sGrInterfaceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrInterfaceDescriptionType_TechnologyUsed() {
        return (EAttribute)getSGrInterfaceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrInterfaceDescriptionType_IsLocalControl() {
        return (EAttribute)getSGrInterfaceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrLegibDocumentationType() {
		if (sGrLegibDocumentationTypeEClass == null) {
			sGrLegibDocumentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(73);
		}
		return sGrLegibDocumentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrLegibDocumentationType_TextElement() {
        return (EAttribute)getSGrLegibDocumentationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrLegibDocumentationType_Language() {
        return (EAttribute)getSGrLegibDocumentationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrLegibDocumentationType_Uri() {
        return (EAttribute)getSGrLegibDocumentationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrModbusAttrFrameType() {
		if (sGrModbusAttrFrameTypeEClass == null) {
			sGrModbusAttrFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(82);
		}
		return sGrModbusAttrFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusAttrFrameType_GenAttribute() {
        return (EReference)getSGrModbusAttrFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusAttrFrameType_ModbusAttr() {
        return (EReference)getSGrModbusAttrFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrModbusDataPointDescriptionType() {
		if (sGrModbusDataPointDescriptionTypeEClass == null) {
			sGrModbusDataPointDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(83);
		}
		return sGrModbusDataPointDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointDescriptionType_ModbusDataType() {
        return (EReference)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointDescriptionType_ModbusArrayDataType() {
        return (EReference)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointDescriptionType_ModbusFirstRegisterReference() {
        return (EReference)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDataPointDescriptionType_DpSizeNrRegisters() {
        return (EAttribute)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDataPointDescriptionType_Bitmask() {
        return (EAttribute)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDataPointDescriptionType_MasterFunctionsSupported() {
        return (EAttribute)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointDescriptionType_ModbusJMESPath() {
        return (EReference)getSGrModbusDataPointDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrModbusDataPointsFrameType() {
		if (sGrModbusDataPointsFrameTypeEClass == null) {
			sGrModbusDataPointsFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(84);
		}
		return sGrModbusDataPointsFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointsFrameType_DataPoint() {
        return (EReference)getSGrModbusDataPointsFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointsFrameType_ModbusDataPoint() {
        return (EReference)getSGrModbusDataPointsFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDataPointsFrameType_DpMbAttrReference() {
        return (EReference)getSGrModbusDataPointsFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrModbusDeviceDescriptionType() {
		if (sGrModbusDeviceDescriptionTypeEClass == null) {
			sGrModbusDeviceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(85);
		}
		return sGrModbusDeviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDeviceDescriptionType_DeviceProfile() {
        return (EReference)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDeviceDescriptionType_DevMbAttrReference() {
        return (EReference)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDeviceDescriptionType_ModbusInterfaceDesc() {
        return (EReference)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDeviceDescriptionType_FpListElement() {
        return (EReference)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusDeviceDescriptionType_NetworkConnectionState() {
        return (EReference)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDeviceDescriptionType_DeviceName() {
        return (EAttribute)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDeviceDescriptionType_IsLocalControl() {
        return (EAttribute)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDeviceDescriptionType_ManufacturerID() {
        return (EAttribute)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusDeviceDescriptionType_ManufacturerName() {
        return (EAttribute)getSGrModbusDeviceDescriptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrModbusInterfaceDescriptionType() {
		if (sGrModbusInterfaceDescriptionTypeEClass == null) {
			sGrModbusInterfaceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(86);
		}
		return sGrModbusInterfaceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusInterfaceDescriptionType_ModbusInterfaceSelection() {
        return (EAttribute)getSGrModbusInterfaceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusInterfaceDescriptionType_TrspSrvModbusTCPoutOfBox() {
        return (EReference)getSGrModbusInterfaceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusInterfaceDescriptionType_TrspSrvModbusRTUoutOfBox() {
        return (EReference)getSGrModbusInterfaceDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusInterfaceDescriptionType_FirstRegisterAddressIsOne() {
        return (EAttribute)getSGrModbusInterfaceDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrModbusInterfaceDescriptionType_ConversionScheme() {
        return (EAttribute)getSGrModbusInterfaceDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrModbusProfilesFrameType() {
		if (sGrModbusProfilesFrameTypeEClass == null) {
			sGrModbusProfilesFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(89);
		}
		return sGrModbusProfilesFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusProfilesFrameType_FunctionalProfile() {
        return (EReference)getSGrModbusProfilesFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusProfilesFrameType_FpMbAttrReference() {
        return (EReference)getSGrModbusProfilesFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrModbusProfilesFrameType_DpListElement() {
        return (EReference)getSGrModbusProfilesFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrNamelistType() {
		if (sGrNamelistTypeEClass == null) {
			sGrNamelistTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(96);
		}
		return sGrNamelistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_NameType() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SLV1Name() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SWorkName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SManufName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SIEC61850Name() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SSAREFName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SEEBUSName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrNamelistType_SHPbwpName() {
        return (EAttribute)getSGrNamelistType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrProfileDescriptionType() {
		if (sGrProfileDescriptionTypeEClass == null) {
			sGrProfileDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(105);
		}
		return sGrProfileDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfileDescriptionType_ProfileNumber() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfileDescriptionType_FpNameList() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfileDescriptionType_FpLegibDesc() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfileDescriptionType_FpPrgDesc() {
        return (EReference)getSGrProfileDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrProfileDescriptionType_MroVisibilityIndicator() {
        return (EAttribute)getSGrProfileDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrProfileDescriptionType_ProfileName() {
        return (EAttribute)getSGrProfileDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrProfilenumberType() {
		if (sGrProfilenumberTypeEClass == null) {
			sGrProfilenumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(106);
		}
		return sGrProfilenumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrProfilenumberType_SpecsOwnerId() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrProfilenumberType_ProfileIdentification() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrProfilenumberType_SubProfileIdent() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrProfilenumberType_SgrLevelOfOperation() {
        return (EAttribute)getSGrProfilenumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfilenumberType_VersionNumber() {
        return (EReference)getSGrProfilenumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrProfilesFrameType() {
		if (sGrProfilesFrameTypeEClass == null) {
			sGrProfilesFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(107);
		}
		return sGrProfilesFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfilesFrameType_FunctionalProfile() {
        return (EReference)getSGrProfilesFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfilesFrameType_FpAttr4Generic() {
        return (EReference)getSGrProfilesFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrProfilesFrameType_DpListElement() {
        return (EReference)getSGrProfilesFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestAPIAttrFrameType() {
		if (sGrRestAPIAttrFrameTypeEClass == null) {
			sGrRestAPIAttrFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(108);
		}
		return sGrRestAPIAttrFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIAttrFrameType_GenAttribute() {
        return (EReference)getSGrRestAPIAttrFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIAttrFrameType_RestAPIAttr() {
        return (EReference)getSGrRestAPIAttrFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGRrestAPIBearerType() {
		if (sgRrestAPIBearerTypeEClass == null) {
			sgRrestAPIBearerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(111);
		}
		return sgRrestAPIBearerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGRrestAPIBearerType_RestAPIEndPoint() {
        return (EAttribute)getSGRrestAPIBearerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGRrestAPIBearerType_RestAPIJMESPath() {
        return (EReference)getSGRrestAPIBearerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestAPIDataPointDescriptionType() {
		if (sGrRestAPIDataPointDescriptionTypeEClass == null) {
			sGrRestAPIDataPointDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(112);
		}
		return sGrRestAPIDataPointDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestAPIDataPointDescriptionType_RestAPIEndPoint() {
        return (EAttribute)getSGrRestAPIDataPointDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestAPIDataPointDescriptionType_RestAPIJMESPath() {
        return (EAttribute)getSGrRestAPIDataPointDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestAPIDataPointDescriptionType_DataType() {
        return (EAttribute)getSGrRestAPIDataPointDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestAPIDataPointsFrameType() {
		if (sGrRestAPIDataPointsFrameTypeEClass == null) {
			sGrRestAPIDataPointsFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(113);
		}
		return sGrRestAPIDataPointsFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIDataPointsFrameType_DataPoint() {
        return (EReference)getSGrRestAPIDataPointsFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIDataPointsFrameType_RestAPIDataPoint() {
        return (EReference)getSGrRestAPIDataPointsFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIDataPointsFrameType_DpRestAPIAttrReference() {
        return (EReference)getSGrRestAPIDataPointsFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRESTAPIDeviceDescriptionType() {
		if (sGrRESTAPIDeviceDescriptionTypeEClass == null) {
			sGrRESTAPIDeviceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(116);
		}
		return sGrRESTAPIDeviceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRESTAPIDeviceDescriptionType_DeviceProfile() {
        return (EReference)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRESTAPIDeviceDescriptionType_DevRestAPIAttrReference() {
        return (EReference)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRESTAPIDeviceDescriptionType_RestAPIInterfaceDesc() {
        return (EReference)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRESTAPIDeviceDescriptionType_FpListElement() {
        return (EReference)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRESTAPIDeviceDescriptionType_DeviceName() {
        return (EAttribute)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRESTAPIDeviceDescriptionType_IsLocalControl() {
        return (EAttribute)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRESTAPIDeviceDescriptionType_ManufacturerID() {
        return (EAttribute)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRESTAPIDeviceDescriptionType_ManufacturerName() {
        return (EAttribute)getSGrRESTAPIDeviceDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestAPIInterfaceDescriptionType() {
		if (sGrRestAPIInterfaceDescriptionTypeEClass == null) {
			sGrRestAPIInterfaceDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(117);
		}
		return sGrRestAPIInterfaceDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestAPIInterfaceDescriptionType_RestAPIInterfaceSelection() {
        return (EAttribute)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIInterfaceDescriptionType_TrspSrvRestTCPV4outOfBox() {
        return (EReference)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIInterfaceDescriptionType_TrspSrvRestTCPV6outOfBox() {
        return (EReference)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestAPIInterfaceDescriptionType_TrspSrvRestURIoutOfBox() {
        return (EAttribute)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestAPIInterfaceDescriptionType_RestAPIAuthenticationMethod() {
        return (EAttribute)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIInterfaceDescriptionType_RestAPIBearer() {
        return (EReference)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIInterfaceDescriptionType_RestAPIBasic() {
        return (EReference)getSGrRestAPIInterfaceDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestAPIProfilesFrameType() {
		if (sGrRestAPIProfilesFrameTypeEClass == null) {
			sGrRestAPIProfilesFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(120);
		}
		return sGrRestAPIProfilesFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIProfilesFrameType_FunctionalProfile() {
        return (EReference)getSGrRestAPIProfilesFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIProfilesFrameType_FpRestAPIAttrReference() {
        return (EReference)getSGrRestAPIProfilesFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestAPIProfilesFrameType_DpListElement() {
        return (EReference)getSGrRestAPIProfilesFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestBasicType() {
		if (sGrRestBasicTypeEClass == null) {
			sGrRestBasicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(121);
		}
		return sGrRestBasicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestBasicType_RestBasicUsername() {
        return (EAttribute)getSGrRestBasicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrRestBasicType_RestBasicPassword() {
        return (EAttribute)getSGrRestBasicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestDataPointsFrameType() {
		if (sGrRestDataPointsFrameTypeEClass == null) {
			sGrRestDataPointsFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(122);
		}
		return sGrRestDataPointsFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestDataPointsFrameType_DataPoint() {
        return (EReference)getSGrRestDataPointsFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestDataPointsFrameType_RestDataPoint() {
        return (EReference)getSGrRestDataPointsFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestDataPointsFrameType_DpRestAPIAttrReference() {
        return (EReference)getSGrRestDataPointsFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrRestProfilesFrameType() {
		if (sGrRestProfilesFrameTypeEClass == null) {
			sGrRestProfilesFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(123);
		}
		return sGrRestProfilesFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestProfilesFrameType_FunctionalProfile() {
        return (EReference)getSGrRestProfilesFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestProfilesFrameType_FpRestAPIAttrReference() {
        return (EReference)getSGrRestProfilesFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrRestProfilesFrameType_DpListElement() {
        return (EReference)getSGrRestProfilesFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrScalingType() {
		if (sGrScalingTypeEClass == null) {
			sGrScalingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(126);
		}
		return sGrScalingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrScalingType_Multiplicator() {
        return (EAttribute)getSGrScalingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrScalingType_Powerof10() {
        return (EAttribute)getSGrScalingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrSerialInterfaceCapabilityType() {
		if (sGrSerialInterfaceCapabilityTypeEClass == null) {
			sGrSerialInterfaceCapabilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(127);
		}
		return sGrSerialInterfaceCapabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSerialInterfaceCapabilityType_BaudRatesSupported() {
        return (EAttribute)getSGrSerialInterfaceCapabilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSerialInterfaceCapabilityType_ByteLenSupported() {
        return (EAttribute)getSGrSerialInterfaceCapabilityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSerialInterfaceCapabilityType_ParitySupported() {
        return (EAttribute)getSGrSerialInterfaceCapabilityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSerialInterfaceCapabilityType_StopBitLenSupported() {
        return (EAttribute)getSGrSerialInterfaceCapabilityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrSmoothTransitionType() {
		if (sGrSmoothTransitionTypeEClass == null) {
			sGrSmoothTransitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(134);
		}
		return sGrSmoothTransitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSmoothTransitionType_WinTms() {
        return (EAttribute)getSGrSmoothTransitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSmoothTransitionType_RvrtTms() {
        return (EAttribute)getSGrSmoothTransitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrSmoothTransitionType_RmpTms() {
        return (EAttribute)getSGrSmoothTransitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrStabilityFallbackType() {
		if (sGrStabilityFallbackTypeEClass == null) {
			sGrStabilityFallbackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(136);
		}
		return sGrStabilityFallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrStabilityFallbackType_MaxReceiveTime() {
        return (EAttribute)getSGrStabilityFallbackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrStabilityFallbackType_InitValue() {
        return (EAttribute)getSGrStabilityFallbackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrStabilityFallbackType_FallbackValue() {
        return (EAttribute)getSGrStabilityFallbackType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrTimeRangeType() {
		if (sGrTimeRangeTypeEClass == null) {
			sGrTimeRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(139);
		}
		return sGrTimeRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrTimeRangeType_StartTime() {
        return (EAttribute)getSGrTimeRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrTimeRangeType_EndTime() {
        return (EAttribute)getSGrTimeRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrVersionNumberType() {
		if (sGrVersionNumberTypeEClass == null) {
			sGrVersionNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(144);
		}
		return sGrVersionNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrVersionNumberType_PrimaryVersionNumber() {
        return (EAttribute)getSGrVersionNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrVersionNumberType_SecondaryVersionNumber() {
        return (EAttribute)getSGrVersionNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSGrVersionNumberType_SubReleaseVersionNumber() {
        return (EAttribute)getSGrVersionNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCPDevInstanceType() {
		if (tcpDevInstanceTypeEClass == null) {
			tcpDevInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(149);
		}
		return tcpDevInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCPDevInstanceType_DevInstName() {
        return (EAttribute)getTCPDevInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCPDevInstanceType_DevAddr() {
        return (EReference)getTCPDevInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCPtrspSrvInstanceType() {
		if (tcPtrspSrvInstanceTypeEClass == null) {
			tcPtrspSrvInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(150);
		}
		return tcPtrspSrvInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCPType() {
		if (tcpTypeEClass == null) {
			tcpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(151);
		}
		return tcpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCPType_TcpTrspSrvInstance() {
        return (EReference)getTCPType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCPType_TcpDevInstance() {
        return (EReference)getTCPType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSyncBlockNotificationType() {
		if (timeSyncBlockNotificationTypeEClass == null) {
			timeSyncBlockNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(159);
		}
		return timeSyncBlockNotificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSyncBlockNotificationType_BlockNumber() {
        return (EAttribute)getTimeSyncBlockNotificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSyncBlockNotificationType_TimeoutMs() {
        return (EAttribute)getTimeSyncBlockNotificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPIPModbus() {
		if (tpipModbusEClass == null) {
			tpipModbusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(162);
		}
		return tpipModbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPIPModbus_Port() {
        return (EAttribute)getTPIPModbus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPIPModbus_Address() {
        return (EReference)getTPIPModbus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPIPModbus_SlaveID() {
        return (EAttribute)getTPIPModbus().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPipV4genAddrType() {
		if (tPipV4genAddrTypeEClass == null) {
			tPipV4genAddrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(163);
		}
		return tPipV4genAddrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPipV4genAddrType_IpV4portNr() {
        return (EAttribute)getTPipV4genAddrType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPipV4genAddrType_IpV4n1() {
        return (EAttribute)getTPipV4genAddrType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPipV4genAddrType_IpV4n2() {
        return (EAttribute)getTPipV4genAddrType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPipV4genAddrType_IpV4n3() {
        return (EAttribute)getTPipV4genAddrType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPipV4genAddrType_IpV4n4() {
        return (EAttribute)getTPipV4genAddrType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPipV6genAddrType() {
		if (tPipV6genAddrTypeEClass == null) {
			tPipV6genAddrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(164);
		}
		return tPipV6genAddrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPipV6genAddrType_PrelimStringDef() {
        return (EAttribute)getTPipV6genAddrType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPRTUModbus() {
		if (tprtuModbusEClass == null) {
			tprtuModbusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(165);
		}
		return tprtuModbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPRTUModbus_SlaveAddr() {
        return (EAttribute)getTPRTUModbus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPRTUModbus_BaudRateSelected() {
        return (EAttribute)getTPRTUModbus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPRTUModbus_ByteLenSelected() {
        return (EAttribute)getTPRTUModbus().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPRTUModbus_ParitySelected() {
        return (EAttribute)getTPRTUModbus().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPRTUModbus_StopBitLenSelected() {
        return (EAttribute)getTPRTUModbus().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPRTUModbus_SerialInterfaceCapability() {
        return (EReference)getTPRTUModbus().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrspServiceModbusType() {
		if (trspServiceModbusTypeEClass == null) {
			trspServiceModbusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(166);
		}
		return trspServiceModbusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrspServiceModbusType_Rtu() {
        return (EReference)getTrspServiceModbusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrspServiceModbusType_Tcp() {
        return (EReference)getTrspServiceModbusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSGrModbusRegisterRef() {
		if (tsGrModbusRegisterRefEClass == null) {
			tsGrModbusRegisterRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(167);
		}
		return tsGrModbusRegisterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSGrModbusRegisterRef_Addr() {
        return (EAttribute)getTSGrModbusRegisterRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSGrModbusRegisterRef_BitRank() {
        return (EAttribute)getTSGrModbusRegisterRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSGrModbusRegisterRef_RegisterType() {
        return (EAttribute)getTSGrModbusRegisterRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEBaudRateType() {
		if (eBaudRateTypeEEnum == null) {
			eBaudRateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(5);
		}
		return eBaudRateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEByteLenType() {
		if (eByteLenTypeEEnum == null) {
			eByteLenTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(7);
		}
		return eByteLenTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEParityType() {
		if (eParityTypeEEnum == null) {
			eParityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(9);
		}
		return eParityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEStopBitLenType() {
		if (eStopBitLenTypeEEnum == null) {
			eStopBitLenTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(11);
		}
		return eStopBitLenTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMasterFunctionsSupportedType() {
		if (masterFunctionsSupportedTypeEEnum == null) {
			masterFunctionsSupportedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(24);
		}
		return masterFunctionsSupportedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModbusInterfaceSelectionType() {
		if (modbusInterfaceSelectionTypeEEnum == null) {
			modbusInterfaceSelectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(26);
		}
		return modbusInterfaceSelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProfileTypeEnumType() {
		if (profileTypeEnumTypeEEnum == null) {
			profileTypeEnumTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(32);
		}
		return profileTypeEnumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrDeviceKindType() {
		if (sGrDeviceKindTypeEEnum == null) {
			sGrDeviceKindTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(53);
		}
		return sGrDeviceKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGReadyStateLv1Type() {
		if (sgReadyStateLv1TypeEEnum == null) {
			sgReadyStateLv1TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(56);
		}
		return sgReadyStateLv1TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGReadyStateLv2Type() {
		if (sgReadyStateLv2TypeEEnum == null) {
			sgReadyStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(58);
		}
		return sgReadyStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrEVSEStateLv1Type() {
		if (sGrEVSEStateLv1TypeEEnum == null) {
			sGrEVSEStateLv1TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(61);
		}
		return sGrEVSEStateLv1TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrEVSEStateLv2Type() {
		if (sGrEVSEStateLv2TypeEEnum == null) {
			sGrEVSEStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(63);
		}
		return sGrEVSEStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrEVStateType() {
		if (sGrEVStateTypeEEnum == null) {
			sGrEVStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(65);
		}
		return sGrEVStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrHPOpModeType() {
		if (sGrHPOpModeTypeEEnum == null) {
			sGrHPOpModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(68);
		}
		return sGrHPOpModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrLanguageType() {
		if (sGrLanguageTypeEEnum == null) {
			sGrLanguageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(71);
		}
		return sGrLanguageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrManufacturerIDType() {
		if (sGrManufacturerIDTypeEEnum == null) {
			sGrManufacturerIDTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(74);
		}
		return sGrManufacturerIDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrMeasValueSourceType() {
		if (sGrMeasValueSourceTypeEEnum == null) {
			sGrMeasValueSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(76);
		}
		return sGrMeasValueSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrMeasValueStateType() {
		if (sGrMeasValueStateTypeEEnum == null) {
			sGrMeasValueStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(78);
		}
		return sGrMeasValueStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrMeasValueTendencyType() {
		if (sGrMeasValueTendencyTypeEEnum == null) {
			sGrMeasValueTendencyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(80);
		}
		return sGrMeasValueTendencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrModbusLayer6DeviationType() {
		if (sGrModbusLayer6DeviationTypeEEnum == null) {
			sGrModbusLayer6DeviationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(87);
		}
		return sGrModbusLayer6DeviationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrModbusReg2BoolArrayType() {
		if (sGrModbusReg2BoolArrayTypeEEnum == null) {
			sGrModbusReg2BoolArrayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(90);
		}
		return sGrModbusReg2BoolArrayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrMROPresenceLevelIndicationType() {
		if (sGrMROPresenceLevelIndicationTypeEEnum == null) {
			sGrMROPresenceLevelIndicationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(92);
		}
		return sGrMROPresenceLevelIndicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrNamelistKindOfType() {
		if (sGrNamelistKindOfTypeEEnum == null) {
			sGrNamelistKindOfTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(94);
		}
		return sGrNamelistKindOfTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrObligLvlType() {
		if (sGrObligLvlTypeEEnum == null) {
			sGrObligLvlTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(97);
		}
		return sGrObligLvlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrOCPPStateType() {
		if (sGrOCPPStateTypeEEnum == null) {
			sGrOCPPStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(99);
		}
		return sGrOCPPStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrPowerSourceType() {
		if (sGrPowerSourceTypeEEnum == null) {
			sGrPowerSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(101);
		}
		return sGrPowerSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrRestAPIAuthenticationEnumMethodType() {
		if (sGrRestAPIAuthenticationEnumMethodTypeEEnum == null) {
			sGrRestAPIAuthenticationEnumMethodTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(109);
		}
		return sGrRestAPIAuthenticationEnumMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrRestAPIdataTypeType() {
		if (sGrRestAPIdataTypeTypeEEnum == null) {
			sGrRestAPIdataTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(114);
		}
		return sGrRestAPIdataTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrRestAPIInterfaceSelectiontype() {
		if (sGrRestAPIInterfaceSelectiontypeEEnum == null) {
			sGrRestAPIInterfaceSelectiontypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(118);
		}
		return sGrRestAPIInterfaceSelectiontypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrRWPType() {
		if (sGrRWPTypeEEnum == null) {
			sGrRWPTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(124);
		}
		return sGrRWPTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrSGCPFeedInStateLv2Type() {
		if (sGrSGCPFeedInStateLv2TypeEEnum == null) {
			sGrSGCPFeedInStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(128);
		}
		return sGrSGCPFeedInStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrSGCPLoadStateLv2Type() {
		if (sGrSGCPLoadStateLv2TypeEEnum == null) {
			sGrSGCPLoadStateLv2TypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(130);
		}
		return sGrSGCPLoadStateLv2TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrSGCPServiceType() {
		if (sGrSGCPServiceTypeEEnum == null) {
			sGrSGCPServiceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(132);
		}
		return sGrSGCPServiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrSunspStateCodesType() {
		if (sGrSunspStateCodesTypeEEnum == null) {
			sGrSunspStateCodesTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(137);
		}
		return sGrSunspStateCodesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrTransportServicesUsedListType() {
		if (sGrTransportServicesUsedListTypeEEnum == null) {
			sGrTransportServicesUsedListTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(140);
		}
		return sGrTransportServicesUsedListTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSGrUnits() {
		if (sGrUnitsEEnum == null) {
			sGrUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(142);
		}
		return sGrUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubProfileTypeEnumType() {
		if (subProfileTypeEnumTypeEEnum == null) {
			subProfileTypeEnumTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(145);
		}
		return subProfileTypeEnumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTEnumConversionFct() {
		if (tEnumConversionFctEEnum == null) {
			tEnumConversionFctEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(152);
		}
		return tEnumConversionFctEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTEnumExceptionCodeType() {
		if (tEnumExceptionCodeTypeEEnum == null) {
			tEnumExceptionCodeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(154);
		}
		return tEnumExceptionCodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTEnumObjectType() {
		if (tEnumObjectTypeEEnum == null) {
			tEnumObjectTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(156);
		}
		return tEnumObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBitmaskType() {
		if (bitmaskTypeEDataType == null) {
			bitmaskTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(0);
		}
		return bitmaskTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDpSizeNrRegistersType() {
		if (dpSizeNrRegistersTypeEDataType == null) {
			dpSizeNrRegistersTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(3);
		}
		return dpSizeNrRegistersTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDpSizeNrRegistersTypeObject() {
		if (dpSizeNrRegistersTypeObjectEDataType == null) {
			dpSizeNrRegistersTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(4);
		}
		return dpSizeNrRegistersTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEBaudRateTypeObject() {
		if (eBaudRateTypeObjectEDataType == null) {
			eBaudRateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(6);
		}
		return eBaudRateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEByteLenTypeObject() {
		if (eByteLenTypeObjectEDataType == null) {
			eByteLenTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(8);
		}
		return eByteLenTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEParityTypeObject() {
		if (eParityTypeObjectEDataType == null) {
			eParityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(10);
		}
		return eParityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEStopBitLenTypeObject() {
		if (eStopBitLenTypeObjectEDataType == null) {
			eStopBitLenTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(12);
		}
		return eStopBitLenTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n1Type() {
		if (ipV4n1TypeEDataType == null) {
			ipV4n1TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(14);
		}
		return ipV4n1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n1Type1() {
		if (ipV4n1Type1EDataType == null) {
			ipV4n1Type1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(15);
		}
		return ipV4n1Type1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n2Type() {
		if (ipV4n2TypeEDataType == null) {
			ipV4n2TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(16);
		}
		return ipV4n2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n2Type1() {
		if (ipV4n2Type1EDataType == null) {
			ipV4n2Type1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(17);
		}
		return ipV4n2Type1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n3Type() {
		if (ipV4n3TypeEDataType == null) {
			ipV4n3TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(18);
		}
		return ipV4n3TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n3Type1() {
		if (ipV4n3Type1EDataType == null) {
			ipV4n3Type1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(19);
		}
		return ipV4n3Type1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n4Type() {
		if (ipV4n4TypeEDataType == null) {
			ipV4n4TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(20);
		}
		return ipV4n4TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4n4Type1() {
		if (ipV4n4Type1EDataType == null) {
			ipV4n4Type1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(21);
		}
		return ipV4n4Type1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4portNrType() {
		if (ipV4portNrTypeEDataType == null) {
			ipV4portNrTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(22);
		}
		return ipV4portNrTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4portNrTypeObject() {
		if (ipV4portNrTypeObjectEDataType == null) {
			ipV4portNrTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(23);
		}
		return ipV4portNrTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMasterFunctionsSupportedTypeObject() {
		if (masterFunctionsSupportedTypeObjectEDataType == null) {
			masterFunctionsSupportedTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(25);
		}
		return masterFunctionsSupportedTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModbusInterfaceSelectionTypeObject() {
		if (modbusInterfaceSelectionTypeObjectEDataType == null) {
			modbusInterfaceSelectionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(27);
		}
		return modbusInterfaceSelectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlaceHolder4futureExtensionsType() {
		if (placeHolder4futureExtensionsTypeEDataType == null) {
			placeHolder4futureExtensionsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(30);
		}
		return placeHolder4futureExtensionsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrelimStringDefType() {
		if (prelimStringDefTypeEDataType == null) {
			prelimStringDefTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(31);
		}
		return prelimStringDefTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProfileTypeEnumTypeObject() {
		if (profileTypeEnumTypeObjectEDataType == null) {
			profileTypeEnumTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(33);
		}
		return profileTypeEnumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRestAPIEndPointType() {
		if (restAPIEndPointTypeEDataType == null) {
			restAPIEndPointTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(34);
		}
		return restAPIEndPointTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRestAPIEndPointType1() {
		if (restAPIEndPointType1EDataType == null) {
			restAPIEndPointType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(35);
		}
		return restAPIEndPointType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRestAPIJMESPathType() {
		if (restAPIJMESPathTypeEDataType == null) {
			restAPIJMESPathTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(36);
		}
		return restAPIJMESPathTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRestBasicPasswordType() {
		if (restBasicPasswordTypeEDataType == null) {
			restBasicPasswordTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(38);
		}
		return restBasicPasswordTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRestBasicUsernameType() {
		if (restBasicUsernameTypeEDataType == null) {
			restBasicUsernameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(39);
		}
		return restBasicUsernameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrDeviceKindTypeObject() {
		if (sGrDeviceKindTypeObjectEDataType == null) {
			sGrDeviceKindTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(54);
		}
		return sGrDeviceKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGReadyStateLv1TypeObject() {
		if (sgReadyStateLv1TypeObjectEDataType == null) {
			sgReadyStateLv1TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(57);
		}
		return sgReadyStateLv1TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGReadyStateLv2TypeObject() {
		if (sgReadyStateLv2TypeObjectEDataType == null) {
			sgReadyStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(59);
		}
		return sgReadyStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrEVSEStateLv1TypeObject() {
		if (sGrEVSEStateLv1TypeObjectEDataType == null) {
			sGrEVSEStateLv1TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(62);
		}
		return sGrEVSEStateLv1TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrEVSEStateLv2TypeObject() {
		if (sGrEVSEStateLv2TypeObjectEDataType == null) {
			sGrEVSEStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(64);
		}
		return sGrEVSEStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrEVStateTypeObject() {
		if (sGrEVStateTypeObjectEDataType == null) {
			sGrEVStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(66);
		}
		return sGrEVStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrHPOpModeTypeObject() {
		if (sGrHPOpModeTypeObjectEDataType == null) {
			sGrHPOpModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(69);
		}
		return sGrHPOpModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrLanguageTypeObject() {
		if (sGrLanguageTypeObjectEDataType == null) {
			sGrLanguageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(72);
		}
		return sGrLanguageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrManufacturerIDTypeObject() {
		if (sGrManufacturerIDTypeObjectEDataType == null) {
			sGrManufacturerIDTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(75);
		}
		return sGrManufacturerIDTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrMeasValueSourceTypeObject() {
		if (sGrMeasValueSourceTypeObjectEDataType == null) {
			sGrMeasValueSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(77);
		}
		return sGrMeasValueSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrMeasValueStateTypeObject() {
		if (sGrMeasValueStateTypeObjectEDataType == null) {
			sGrMeasValueStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(79);
		}
		return sGrMeasValueStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrMeasValueTendencyTypeObject() {
		if (sGrMeasValueTendencyTypeObjectEDataType == null) {
			sGrMeasValueTendencyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(81);
		}
		return sGrMeasValueTendencyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrModbusLayer6DeviationTypeObject() {
		if (sGrModbusLayer6DeviationTypeObjectEDataType == null) {
			sGrModbusLayer6DeviationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(88);
		}
		return sGrModbusLayer6DeviationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrModbusReg2BoolArrayTypeObject() {
		if (sGrModbusReg2BoolArrayTypeObjectEDataType == null) {
			sGrModbusReg2BoolArrayTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(91);
		}
		return sGrModbusReg2BoolArrayTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrMROPresenceLevelIndicationTypeObject() {
		if (sGrMROPresenceLevelIndicationTypeObjectEDataType == null) {
			sGrMROPresenceLevelIndicationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(93);
		}
		return sGrMROPresenceLevelIndicationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrNamelistKindOfTypeObject() {
		if (sGrNamelistKindOfTypeObjectEDataType == null) {
			sGrNamelistKindOfTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(95);
		}
		return sGrNamelistKindOfTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrObligLvlTypeObject() {
		if (sGrObligLvlTypeObjectEDataType == null) {
			sGrObligLvlTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(98);
		}
		return sGrObligLvlTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrOCPPStateTypeObject() {
		if (sGrOCPPStateTypeObjectEDataType == null) {
			sGrOCPPStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(100);
		}
		return sGrOCPPStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrPowerSourceTypeObject() {
		if (sGrPowerSourceTypeObjectEDataType == null) {
			sGrPowerSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(102);
		}
		return sGrPowerSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrPrecisionType() {
		if (sGrPrecisionTypeEDataType == null) {
			sGrPrecisionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(103);
		}
		return sGrPrecisionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrPrecisionTypeObject() {
		if (sGrPrecisionTypeObjectEDataType == null) {
			sGrPrecisionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(104);
		}
		return sGrPrecisionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrRestAPIAuthenticationEnumMethodTypeObject() {
		if (sGrRestAPIAuthenticationEnumMethodTypeObjectEDataType == null) {
			sGrRestAPIAuthenticationEnumMethodTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(110);
		}
		return sGrRestAPIAuthenticationEnumMethodTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrRestAPIdataTypeTypeObject() {
		if (sGrRestAPIdataTypeTypeObjectEDataType == null) {
			sGrRestAPIdataTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(115);
		}
		return sGrRestAPIdataTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrRestAPIInterfaceSelectiontypeObject() {
		if (sGrRestAPIInterfaceSelectiontypeObjectEDataType == null) {
			sGrRestAPIInterfaceSelectiontypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(119);
		}
		return sGrRestAPIInterfaceSelectiontypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrRWPTypeObject() {
		if (sGrRWPTypeObjectEDataType == null) {
			sGrRWPTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(125);
		}
		return sGrRWPTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrSGCPFeedInStateLv2TypeObject() {
		if (sGrSGCPFeedInStateLv2TypeObjectEDataType == null) {
			sGrSGCPFeedInStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(129);
		}
		return sGrSGCPFeedInStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrSGCPLoadStateLv2TypeObject() {
		if (sGrSGCPLoadStateLv2TypeObjectEDataType == null) {
			sGrSGCPLoadStateLv2TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(131);
		}
		return sGrSGCPLoadStateLv2TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrSGCPServiceTypeObject() {
		if (sGrSGCPServiceTypeObjectEDataType == null) {
			sGrSGCPServiceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(133);
		}
		return sGrSGCPServiceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrSpecialQualityReqType() {
		if (sGrSpecialQualityReqTypeEDataType == null) {
			sGrSpecialQualityReqTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(135);
		}
		return sGrSpecialQualityReqTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrSunspStateCodesTypeObject() {
		if (sGrSunspStateCodesTypeObjectEDataType == null) {
			sGrSunspStateCodesTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(138);
		}
		return sGrSunspStateCodesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrTransportServicesUsedListTypeObject() {
		if (sGrTransportServicesUsedListTypeObjectEDataType == null) {
			sGrTransportServicesUsedListTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(141);
		}
		return sGrTransportServicesUsedListTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSGrUnitsObject() {
		if (sGrUnitsObjectEDataType == null) {
			sGrUnitsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(143);
		}
		return sGrUnitsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSubProfileTypeEnumTypeObject() {
		if (subProfileTypeEnumTypeObjectEDataType == null) {
			subProfileTypeEnumTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(146);
		}
		return subProfileTypeEnumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTBitRank() {
		if (tBitRankEDataType == null) {
			tBitRankEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(147);
		}
		return tBitRankEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTBitRankObject() {
		if (tBitRankObjectEDataType == null) {
			tBitRankObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(148);
		}
		return tBitRankObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTEnumConversionFctObject() {
		if (tEnumConversionFctObjectEDataType == null) {
			tEnumConversionFctObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(153);
		}
		return tEnumConversionFctObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTEnumExceptionCodeTypeObject() {
		if (tEnumExceptionCodeTypeObjectEDataType == null) {
			tEnumExceptionCodeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(155);
		}
		return tEnumExceptionCodeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTEnumObjectTypeObject() {
		if (tEnumObjectTypeObjectEDataType == null) {
			tEnumObjectTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(157);
		}
		return tEnumObjectTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTextElementType() {
		if (textElementTypeEDataType == null) {
			textElementTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(158);
		}
		return textElementTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTIPportNrType() {
		if (tiPportNrTypeEDataType == null) {
			tiPportNrTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(160);
		}
		return tiPportNrTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTIPportNrTypeObject() {
		if (tiPportNrTypeObjectEDataType == null) {
			tiPportNrTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(161);
		}
		return tiPportNrTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTSlaveIDType() {
		if (tSlaveIDTypeEDataType == null) {
			tSlaveIDTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(168);
		}
		return tSlaveIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTSlaveIDTypeObject() {
		if (tSlaveIDTypeObjectEDataType == null) {
			tSlaveIDTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(V0Package.eNS_URI).getEClassifiers().get(169);
		}
		return tSlaveIDTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V0Factory getV0Factory() {
		return (V0Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("com.smartgridready.ns.v0." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //V0PackageImpl
