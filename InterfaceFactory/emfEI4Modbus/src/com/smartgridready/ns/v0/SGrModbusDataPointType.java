/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Data Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extends the base data point type with Modbus attributes and data points
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointType#getModbusAttr <em>Modbus Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType()
 * @model extendedMetaData="name='SGrModbusDataPointType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDataPointType extends SGrDataPointBaseType {
	/**
	 * Returns the value of the '<em><b>Modbus Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_ModbusDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusDataPointDescriptionType> getModbusDataPoint();

	/**
	 * Returns the value of the '<em><b>Modbus Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4ModbusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointType_ModbusAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4ModbusType> getModbusAttr();

} // SGrModbusDataPointType
