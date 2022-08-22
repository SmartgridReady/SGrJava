/**
 */
package com.smartgridready.ns.v0;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Basic Gen Array DP Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  These are the basic generic
 * 				data array  types must remain high level definitions for to be supported.
 * 				The definition focuses on the programming languages used at the
 * 				level of the communicators. So far Java and Python.
 * 			
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt8 <em>Int8</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt16 <em>Int16</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt32 <em>Int32</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt64 <em>Int64</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt8U <em>Int8 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt16U <em>Int16 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt32U <em>Int32 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getInt64U <em>Int64 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getFloat32 <em>Float32</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getFloat64 <em>Float64</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenArrayDPTypeType#getString <em>String</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType()
 * @model extendedMetaData="name='SGrBasicGenArrayDPTypeType' kind='elementOnly'"
 * @generated
 */
public interface SGrBasicGenArrayDPTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Boolean()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Boolean> getBoolean();

	/**
	 * Returns the value of the '<em><b>Int8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int8</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int8()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='element' name='int8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Byte> getInt8();

	/**
	 * Returns the value of the '<em><b>Int16</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int16()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='element' name='int16' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Short> getInt16();

	/**
	 * Returns the value of the '<em><b>Int32</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int32</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int32()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='int32' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getInt32();

	/**
	 * Returns the value of the '<em><b>Int64</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int64()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='int64' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getInt64();

	/**
	 * Returns the value of the '<em><b>Int8 U</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int8 U</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int8U()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='int8U' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Short> getInt8U();

	/**
	 * Returns the value of the '<em><b>Int16 U</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16 U</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int16U()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='int16U' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Integer> getInt16U();

	/**
	 * Returns the value of the '<em><b>Int32 U</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int32 U</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int32U()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='int32U' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Long> getInt32U();

	/**
	 * Returns the value of the '<em><b>Int64 U</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64 U</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Int64U()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='int64U' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getInt64U();

	/**
	 * Returns the value of the '<em><b>Float32</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float32</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Float32()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='float32' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Float> getFloat32();

	/**
	 * Returns the value of the '<em><b>Float64</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float64</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_Float64()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='float64' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Double> getFloat64();

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_DateTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getDateTime();

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute list.
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenArrayDPTypeType_String()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getString();

} // SGrBasicGenArrayDPTypeType
