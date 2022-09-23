/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Data Points Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RPT Root Point for stand alone Modbus Functional
 * 				Profile description. It includes the embedded generic Porfile
 * 				decription
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointsFrameType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointsFrameType#getModbusDataPoint <em>Modbus Data Point</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointsFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointsFrameType#getModbusAttr <em>Modbus Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointsFrameType()
 * @model extendedMetaData="name='SGrModbusDataPointsFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDataPointsFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointsFrameType_DataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrDataPointDescriptionType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Modbus Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Data Point</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointsFrameType_ModbusDataPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusDataPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrModbusDataPointDescriptionType> getModbusDataPoint();

	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointsFrameType_GenAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4GenericType> getGenAttribute();

	/**
	 * Returns the value of the '<em><b>Modbus Attr</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4ModbusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Attr</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointsFrameType_ModbusAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4ModbusType> getModbusAttr();

} // SGrModbusDataPointsFrameType
