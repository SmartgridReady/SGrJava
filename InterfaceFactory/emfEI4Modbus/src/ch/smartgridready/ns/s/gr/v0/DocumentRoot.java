/**
 */
package ch.smartgridready.ns.s.gr.v0;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getApiTree <em>Api Tree</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getBaudRatesSupported <em>Baud Rates Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getByteLenSupported <em>Byte Len Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getDeviceProfile <em>Device Profile</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getFunctionalProfiles <em>Functional Profiles</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getGenDeviceFrame <em>Gen Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getParitySupported <em>Parity Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSgrContactAPIDeviceFrame <em>Sgr Contact API Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrContactAPIDeviceDescriptionType <em>SGr Contact API Device Description Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusDeviceDescriptionType <em>SGr Modbus Device Description Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrRESTAPIDeviceDescriptionType <em>SGr RESTAPI Device Description Type</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSgrSerialInterfaceCapability <em>Sgr Serial Interface Capability</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getStopBitLenSupported <em>Stop Bit Len Supported</em>}</li>
 *   <li>{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getTrspServiceModbus <em>Trsp Service Modbus</em>}</li>
 * </ul>
 *
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Api Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Tree</em>' containment reference.
	 * @see #setApiTree(ApiTreeType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_ApiTree()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='apiTree' namespace='##targetNamespace'"
	 * @generated
	 */
	ApiTreeType getApiTree();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getApiTree <em>Api Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Tree</em>' containment reference.
	 * @see #getApiTree()
	 * @generated
	 */
	void setApiTree(ApiTreeType value);

	/**
	 * Returns the value of the '<em><b>Baud Rates Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.EBaudRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rates Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EBaudRateType
	 * @see #setBaudRatesSupported(EBaudRateType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_BaudRatesSupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baudRatesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EBaudRateType getBaudRatesSupported();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getBaudRatesSupported <em>Baud Rates Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rates Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EBaudRateType
	 * @see #getBaudRatesSupported()
	 * @generated
	 */
	void setBaudRatesSupported(EBaudRateType value);

	/**
	 * Returns the value of the '<em><b>Byte Len Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.EByteLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EByteLenType
	 * @see #setByteLenSupported(EByteLenType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_ByteLenSupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='byteLenSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EByteLenType getByteLenSupported();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getByteLenSupported <em>Byte Len Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Len Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EByteLenType
	 * @see #getByteLenSupported()
	 * @generated
	 */
	void setByteLenSupported(EByteLenType value);

	/**
	 * Returns the value of the '<em><b>Device Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Profile</em>' containment reference.
	 * @see #setDeviceProfile(SGrDeviceProfileType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_DeviceProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceProfileType getDeviceProfile();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getDeviceProfile <em>Device Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Profile</em>' containment reference.
	 * @see #getDeviceProfile()
	 * @generated
	 */
	void setDeviceProfile(SGrDeviceProfileType value);

	/**
	 * Returns the value of the '<em><b>Functional Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for stand alone generic Functional
	 * 				Profile description
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Profiles</em>' containment reference.
	 * @see #setFunctionalProfiles(SGrProfilesFrameType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_FunctionalProfiles()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='functionalProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrProfilesFrameType getFunctionalProfiles();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getFunctionalProfiles <em>Functional Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Profiles</em>' containment reference.
	 * @see #getFunctionalProfiles()
	 * @generated
	 */
	void setFunctionalProfiles(SGrProfilesFrameType value);

	/**
	 * Returns the value of the '<em><b>Gen Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for stand alone generic Device
	 * 				description
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gen Device Frame</em>' containment reference.
	 * @see #setGenDeviceFrame(SGrDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_GenDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrDeviceDescriptionType getGenDeviceFrame();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getGenDeviceFrame <em>Gen Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Device Frame</em>' containment reference.
	 * @see #getGenDeviceFrame()
	 * @generated
	 */
	void setGenDeviceFrame(SGrDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Modbus Function Codes Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Function Codes Supported</em>' attribute.
	 * @see #setModbusFunctionCodesSupported(String)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_ModbusFunctionCodesSupported()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModbusFunctionCodesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModbusFunctionCodesSupported();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Function Codes Supported</em>' attribute.
	 * @see #getModbusFunctionCodesSupported()
	 * @generated
	 */
	void setModbusFunctionCodesSupported(String value);

	/**
	 * Returns the value of the '<em><b>Parity Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.EParityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EParityType
	 * @see #setParitySupported(EParityType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_ParitySupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paritySupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EParityType getParitySupported();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getParitySupported <em>Parity Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EParityType
	 * @see #getParitySupported()
	 * @generated
	 */
	void setParitySupported(EParityType value);

	/**
	 * Returns the value of the '<em><b>SGr Modbus Data Point Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGr Modbus Data Point Description</em>' containment reference.
	 * @see #setSGrModbusDataPointDescription(SGrModbusDataPointDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrModbusDataPointDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGr_ModbusDataPointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusDataPointDescriptionType getSGrModbusDataPointDescription();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Modbus Data Point Description</em>' containment reference.
	 * @see #getSGrModbusDataPointDescription()
	 * @generated
	 */
	void setSGrModbusDataPointDescription(SGrModbusDataPointDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr Modbus Interface Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGr Modbus Interface Description</em>' containment reference.
	 * @see #setSGrModbusInterfaceDescription(SGrModbusInterfaceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrModbusInterfaceDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGr_ModbusInterfaceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusInterfaceDescriptionType getSGrModbusInterfaceDescription();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Modbus Interface Description</em>' containment reference.
	 * @see #getSGrModbusInterfaceDescription()
	 * @generated
	 */
	void setSGrModbusInterfaceDescription(SGrModbusInterfaceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Sgr Contact API Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for stand alone ContactAPI_ Device
	 * 				description. It includes the embedded generic Device decription
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sgr Contact API Device Frame</em>' containment reference.
	 * @see #setSgrContactAPIDeviceFrame(SGrContactAPIDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SgrContactAPIDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sgrContactAPI_DeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrContactAPIDeviceDescriptionType getSgrContactAPIDeviceFrame();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSgrContactAPIDeviceFrame <em>Sgr Contact API Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Contact API Device Frame</em>' containment reference.
	 * @see #getSgrContactAPIDeviceFrame()
	 * @generated
	 */
	void setSgrContactAPIDeviceFrame(SGrContactAPIDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr Contact API Device Description Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGr Contact API Device Description Type</em>' containment reference.
	 * @see #setSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrContactAPIDeviceDescriptionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrContactAPIDeviceDescriptionType' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrContactAPIDeviceDescriptionType getSGrContactAPIDeviceDescriptionType();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrContactAPIDeviceDescriptionType <em>SGr Contact API Device Description Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Contact API Device Description Type</em>' containment reference.
	 * @see #getSGrContactAPIDeviceDescriptionType()
	 * @generated
	 */
	void setSGrContactAPIDeviceDescriptionType(SGrContactAPIDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr Modbus Device Description Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGr Modbus Device Description Type</em>' containment reference.
	 * @see #setSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrModbusDeviceDescriptionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrModbusDeviceDescriptionType' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusDeviceDescriptionType getSGrModbusDeviceDescriptionType();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusDeviceDescriptionType <em>SGr Modbus Device Description Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Modbus Device Description Type</em>' containment reference.
	 * @see #getSGrModbusDeviceDescriptionType()
	 * @generated
	 */
	void setSGrModbusDeviceDescriptionType(SGrModbusDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr Modbus Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RPT Root Point for stand alone Modbus Device
	 * 				description. It includes the embedded generic Device decription
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Modbus Device Frame</em>' containment reference.
	 * @see #setSGrModbusDeviceFrame(SGrModbusDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrModbusDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrModbusDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusDeviceDescriptionType getSGrModbusDeviceFrame();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Modbus Device Frame</em>' containment reference.
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	void setSGrModbusDeviceFrame(SGrModbusDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr RESTAPI Device Description Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGr RESTAPI Device Description Type</em>' containment reference.
	 * @see #setSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrRESTAPIDeviceDescriptionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrRESTAPIDeviceDescriptionType' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRESTAPIDeviceDescriptionType getSGrRESTAPIDeviceDescriptionType();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrRESTAPIDeviceDescriptionType <em>SGr RESTAPI Device Description Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr RESTAPI Device Description Type</em>' containment reference.
	 * @see #getSGrRESTAPIDeviceDescriptionType()
	 * @generated
	 */
	void setSGrRESTAPIDeviceDescriptionType(SGrRESTAPIDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr Rest API Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for stand alone Rest Device
	 * 				description. It includes the embedded generic Device decription
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Rest API Device Frame</em>' containment reference.
	 * @see #setSGrRestAPIDeviceFrame(SGrRESTAPIDeviceDescriptionType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SGrRestAPIDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrRestAPIDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRESTAPIDeviceDescriptionType getSGrRestAPIDeviceFrame();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Rest API Device Frame</em>' containment reference.
	 * @see #getSGrRestAPIDeviceFrame()
	 * @generated
	 */
	void setSGrRestAPIDeviceFrame(SGrRESTAPIDeviceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Sgr Serial Interface Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgr Serial Interface Capability</em>' containment reference.
	 * @see #setSgrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_SgrSerialInterfaceCapability()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sgrSerialInterfaceCapability' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSerialInterfaceCapabilityType getSgrSerialInterfaceCapability();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getSgrSerialInterfaceCapability <em>Sgr Serial Interface Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgr Serial Interface Capability</em>' containment reference.
	 * @see #getSgrSerialInterfaceCapability()
	 * @generated
	 */
	void setSgrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType value);

	/**
	 * Returns the value of the '<em><b>Stop Bit Len Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.smartgridready.ns.s.gr.v0.EStopBitLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Bit Len Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EStopBitLenType
	 * @see #setStopBitLenSupported(EStopBitLenType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_StopBitLenSupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stopBitLenSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EStopBitLenType getStopBitLenSupported();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getStopBitLenSupported <em>Stop Bit Len Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Bit Len Supported</em>' attribute.
	 * @see ch.smartgridready.ns.s.gr.v0.EStopBitLenType
	 * @see #getStopBitLenSupported()
	 * @generated
	 */
	void setStopBitLenSupported(EStopBitLenType value);

	/**
	 * Returns the value of the '<em><b>Trsp Service Modbus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trsp Service Modbus</em>' containment reference.
	 * @see #setTrspServiceModbus(TrspServiceModbusType)
	 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getDocumentRoot_TrspServiceModbus()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrspServiceModbus' namespace='##targetNamespace'"
	 * @generated
	 */
	TrspServiceModbusType getTrspServiceModbus();

	/**
	 * Sets the value of the '{@link ch.smartgridready.ns.s.gr.v0.DocumentRoot#getTrspServiceModbus <em>Trsp Service Modbus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Service Modbus</em>' containment reference.
	 * @see #getTrspServiceModbus()
	 * @generated
	 */
	void setTrspServiceModbus(TrspServiceModbusType value);

} // DocumentRoot
