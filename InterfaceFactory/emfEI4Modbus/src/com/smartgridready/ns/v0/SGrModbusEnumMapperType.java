/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Enum Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *           Enumerations typically define operation modes or singlular states. Devices use different control schemes, SmartGridrady defines a commmon information model for interoperable behaviour.
 *           At interface class level, enums may use different binary values. 
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusEnumMapperType#getModbusEnumMapper <em>Modbus Enum Mapper</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusEnumMapperType#getGenEnumMapper <em>Gen Enum Mapper</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusEnumMapperType()
 * @model extendedMetaData="name='SGrModbusEnumMapperType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusEnumMapperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modbus Enum Mapper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Enum Mapper</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusEnumMapperType_ModbusEnumMapper()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='modbusEnumMapper' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getModbusEnumMapper();

	/**
	 * Returns the value of the '<em><b>Gen Enum Mapper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Enum Mapper</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusEnumMapperType_GenEnumMapper()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='genEnumMapper' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getGenEnumMapper();

} // SGrModbusEnumMapperType
