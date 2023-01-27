/**
 */
package com.smartgridready.ns.v0;

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
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getBaudRatesSupported <em>Baud Rates Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getByteLenSupported <em>Byte Len Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getNetConnectionState <em>Net Connection State</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getParitySupported <em>Parity Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrContactAPIDeviceFrame <em>SGr Contact API Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrFunctionalProfileFrame <em>SGr Functional Profile Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrGenDeviceFrame <em>SGr Gen Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getSGrSerialInterfaceCapability <em>SGr Serial Interface Capability</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getStopBitLenSupported <em>Stop Bit Len Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.DocumentRoot#getTrspServiceModbus <em>Trsp Service Modbus</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot()
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
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_Mixed()
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
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Baud Rates Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EBaudRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rates Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @see #setBaudRatesSupported(EBaudRateType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_BaudRatesSupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baudRatesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EBaudRateType getBaudRatesSupported();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getBaudRatesSupported <em>Baud Rates Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rates Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EBaudRateType
	 * @see #getBaudRatesSupported()
	 * @generated
	 */
	void setBaudRatesSupported(EBaudRateType value);

	/**
	 * Returns the value of the '<em><b>Byte Len Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EByteLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @see #setByteLenSupported(EByteLenType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_ByteLenSupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='byteLenSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EByteLenType getByteLenSupported();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getByteLenSupported <em>Byte Len Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Len Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EByteLenType
	 * @see #getByteLenSupported()
	 * @generated
	 */
	void setByteLenSupported(EByteLenType value);

	/**
	 * Returns the value of the '<em><b>Modbus Function Codes Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Function Codes Supported</em>' attribute.
	 * @see #setModbusFunctionCodesSupported(String)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_ModbusFunctionCodesSupported()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModbusFunctionCodesSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModbusFunctionCodesSupported();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getModbusFunctionCodesSupported <em>Modbus Function Codes Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Function Codes Supported</em>' attribute.
	 * @see #getModbusFunctionCodesSupported()
	 * @generated
	 */
	void setModbusFunctionCodesSupported(String value);

	/**
	 * Returns the value of the '<em><b>Net Connection State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Connection State</em>' containment reference.
	 * @see #setNetConnectionState(NetworkConnectionStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_NetConnectionState()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='netConnectionState' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkConnectionStateType getNetConnectionState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getNetConnectionState <em>Net Connection State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Connection State</em>' containment reference.
	 * @see #getNetConnectionState()
	 * @generated
	 */
	void setNetConnectionState(NetworkConnectionStateType value);

	/**
	 * Returns the value of the '<em><b>Parity Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EParityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EParityType
	 * @see #setParitySupported(EParityType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_ParitySupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paritySupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EParityType getParitySupported();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getParitySupported <em>Parity Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EParityType
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
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrModbusDataPointDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGr_ModbusDataPointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusDataPointDescriptionType getSGrModbusDataPointDescription();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDataPointDescription <em>SGr Modbus Data Point Description</em>}' containment reference.
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
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrModbusInterfaceDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGr_ModbusInterfaceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusInterfaceDescriptionType getSGrModbusInterfaceDescription();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusInterfaceDescription <em>SGr Modbus Interface Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Modbus Interface Description</em>' containment reference.
	 * @see #getSGrModbusInterfaceDescription()
	 * @generated
	 */
	void setSGrModbusInterfaceDescription(SGrModbusInterfaceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>SGr Contact API Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for Contact API Device External Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Contact API Device Frame</em>' containment reference.
	 * @see #setSGrContactAPIDeviceFrame(SGrContactAPIDeviceFrame)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrContactAPIDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrContactAPIDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrContactAPIDeviceFrame getSGrContactAPIDeviceFrame();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrContactAPIDeviceFrame <em>SGr Contact API Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Contact API Device Frame</em>' containment reference.
	 * @see #getSGrContactAPIDeviceFrame()
	 * @generated
	 */
	void setSGrContactAPIDeviceFrame(SGrContactAPIDeviceFrame value);

	/**
	 * Returns the value of the '<em><b>SGr Functional Profile Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for stand alone generic Functional
	 * 				Profile description
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Functional Profile Frame</em>' containment reference.
	 * @see #setSGrFunctionalProfileFrame(SGrFunctionalProfileFrameType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrFunctionalProfileFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrFunctionalProfileFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrFunctionalProfileFrameType getSGrFunctionalProfileFrame();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrFunctionalProfileFrame <em>SGr Functional Profile Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Functional Profile Frame</em>' containment reference.
	 * @see #getSGrFunctionalProfileFrame()
	 * @generated
	 */
	void setSGrFunctionalProfileFrame(SGrFunctionalProfileFrameType value);

	/**
	 * Returns the value of the '<em><b>SGr Gen Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for Generic Device External Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Gen Device Frame</em>' containment reference.
	 * @see #setSGrGenDeviceFrame(SGrGenDeviceFrame)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrGenDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrGenDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrGenDeviceFrame getSGrGenDeviceFrame();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrGenDeviceFrame <em>SGr Gen Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Gen Device Frame</em>' containment reference.
	 * @see #getSGrGenDeviceFrame()
	 * @generated
	 */
	void setSGrGenDeviceFrame(SGrGenDeviceFrame value);

	/**
	 * Returns the value of the '<em><b>SGr Modbus Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for Modbus Device External Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Modbus Device Frame</em>' containment reference.
	 * @see #setSGrModbusDeviceFrame(SGrModbusDeviceFrame)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrModbusDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrModbusDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusDeviceFrame getSGrModbusDeviceFrame();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrModbusDeviceFrame <em>SGr Modbus Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Modbus Device Frame</em>' containment reference.
	 * @see #getSGrModbusDeviceFrame()
	 * @generated
	 */
	void setSGrModbusDeviceFrame(SGrModbusDeviceFrame value);

	/**
	 * Returns the value of the '<em><b>SGr Rest API Device Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  RPT Root Point for Rest API Device External Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGr Rest API Device Frame</em>' containment reference.
	 * @see #setSGrRestAPIDeviceFrame(SGrRestAPIDeviceFrame)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrRestAPIDeviceFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrRestAPIDeviceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrRestAPIDeviceFrame getSGrRestAPIDeviceFrame();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrRestAPIDeviceFrame <em>SGr Rest API Device Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Rest API Device Frame</em>' containment reference.
	 * @see #getSGrRestAPIDeviceFrame()
	 * @generated
	 */
	void setSGrRestAPIDeviceFrame(SGrRestAPIDeviceFrame value);

	/**
	 * Returns the value of the '<em><b>SGr Serial Interface Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGr Serial Interface Capability</em>' containment reference.
	 * @see #setSGrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_SGrSerialInterfaceCapability()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SGrSerialInterfaceCapability' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrSerialInterfaceCapabilityType getSGrSerialInterfaceCapability();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getSGrSerialInterfaceCapability <em>SGr Serial Interface Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGr Serial Interface Capability</em>' containment reference.
	 * @see #getSGrSerialInterfaceCapability()
	 * @generated
	 */
	void setSGrSerialInterfaceCapability(SGrSerialInterfaceCapabilityType value);

	/**
	 * Returns the value of the '<em><b>Stop Bit Len Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.EStopBitLenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Bit Len Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EStopBitLenType
	 * @see #setStopBitLenSupported(EStopBitLenType)
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_StopBitLenSupported()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stopBitLenSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EStopBitLenType getStopBitLenSupported();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getStopBitLenSupported <em>Stop Bit Len Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Bit Len Supported</em>' attribute.
	 * @see com.smartgridready.ns.v0.EStopBitLenType
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
	 * @see com.smartgridready.ns.v0.V0Package#getDocumentRoot_TrspServiceModbus()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrspServiceModbus' namespace='##targetNamespace'"
	 * @generated
	 */
	TrspServiceModbusType getTrspServiceModbus();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.DocumentRoot#getTrspServiceModbus <em>Trsp Service Modbus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trsp Service Modbus</em>' containment reference.
	 * @see #getTrspServiceModbus()
	 * @generated
	 */
	void setTrspServiceModbus(TrspServiceModbusType value);

} // DocumentRoot
