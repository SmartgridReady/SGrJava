/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Bitmap Mapper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *           Bitmaps typically define operation modes or parallel active states. Devices use different control schemes, SmartGridrady defines a commmon information model for interoperable behaviour.
 *           At interface class level, Bitmaps may use different binary values. 
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusBitmapMapperType#getModbusBitMapper <em>Modbus Bit Mapper</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusBitmapMapperType#getGenBitMapper <em>Gen Bit Mapper</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBitmapMapperType()
 * @model extendedMetaData="name='SGrModbusBitmapMapperType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusBitmapMapperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modbus Bit Mapper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Bit Mapper</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBitmapMapperType_ModbusBitMapper()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='modbusBitMapper' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getModbusBitMapper();

	/**
	 * Returns the value of the '<em><b>Gen Bit Mapper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Bit Mapper</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusBitmapMapperType_GenBitMapper()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='genBitMapper' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getGenBitMapper();

} // SGrModbusBitmapMapperType
