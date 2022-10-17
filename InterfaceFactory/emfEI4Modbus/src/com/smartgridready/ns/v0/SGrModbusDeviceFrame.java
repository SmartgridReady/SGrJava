/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Device Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data type definition for a Modbus Device Description as an EI (External Interface)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusAttr <em>Modbus Attr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getFpListElement <em>Fp List Element</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getNetworkConnectionState <em>Network Connection State</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDeviceFrame()
 * @model extendedMetaData="name='SGrModbusDeviceFrame' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDeviceFrame extends SGrDeviceBaseType {
	/**
	 * Returns the value of the '<em><b>Modbus Attr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Attr</em>' containment reference.
	 * @see #setModbusAttr(SGrAttr4ModbusType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDeviceFrame_ModbusAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrAttr4ModbusType getModbusAttr();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusAttr <em>Modbus Attr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Attr</em>' containment reference.
	 * @see #getModbusAttr()
	 * @generated
	 */
	void setModbusAttr(SGrAttr4ModbusType value);

	/**
	 * Returns the value of the '<em><b>Modbus Interface Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Interface Desc</em>' containment reference.
	 * @see #setModbusInterfaceDesc(SGrModbusInterfaceDescriptionType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDeviceFrame_ModbusInterfaceDesc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusInterfaceDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrModbusInterfaceDescriptionType getModbusInterfaceDesc();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getModbusInterfaceDesc <em>Modbus Interface Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Interface Desc</em>' containment reference.
	 * @see #getModbusInterfaceDesc()
	 * @generated
	 */
	void setModbusInterfaceDesc(SGrModbusInterfaceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Fp List Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusFunctionalProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp List Element</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDeviceFrame_FpListElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fpListElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusFunctionalProfileType> getFpListElement();

	/**
	 * Returns the value of the '<em><b>Network Connection State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Connection State</em>' containment reference.
	 * @see #setNetworkConnectionState(NetworkConnectionStateType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDeviceFrame_NetworkConnectionState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='networkConnectionState' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkConnectionStateType getNetworkConnectionState();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDeviceFrame#getNetworkConnectionState <em>Network Connection State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Connection State</em>' containment reference.
	 * @see #getNetworkConnectionState()
	 * @generated
	 */
	void setNetworkConnectionState(NetworkConnectionStateType value);

} // SGrModbusDeviceFrame
