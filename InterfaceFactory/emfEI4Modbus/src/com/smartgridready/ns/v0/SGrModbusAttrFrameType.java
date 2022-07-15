/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Attr Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusAttrFrameType#getGenAttribute <em>Gen Attribute</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusAttrFrameType#getModbusAttr <em>Modbus Attr</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusAttrFrameType()
 * @model extendedMetaData="name='SGrModbusAttrFrameType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusAttrFrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.SGrAttr4GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Attribute</em>' containment reference list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusAttrFrameType_GenAttribute()
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
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusAttrFrameType_ModbusAttr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusAttr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SGrAttr4ModbusType> getModbusAttr();

} // SGrModbusAttrFrameType
