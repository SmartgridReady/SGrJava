/**
 */
package com.smartgridready.ns.v0;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Basic Gen Data Point Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  These are the basic generic
 * 				data types must remain high level definitions for to be supported.
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
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8 <em>Int8</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16 <em>Int16</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32 <em>Int32</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64 <em>Int64</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8U <em>Int8 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16U <em>Int16 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32U <em>Int32 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64U <em>Int64 U</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat32 <em>Float32</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat64 <em>Float64</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getEnum <em>Enum</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getString <em>String</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType()
 * @model extendedMetaData="name='SGrBasicGenDataPointTypeType' kind='elementOnly'"
 * @generated
 */
public interface SGrBasicGenDataPointTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #isSetBoolean()
	 * @see #unsetBoolean()
	 * @see #setBoolean(boolean)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Boolean()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBoolean();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #isSetBoolean()
	 * @see #unsetBoolean()
	 * @see #isBoolean()
	 * @generated
	 */
	void setBoolean(boolean value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoolean()
	 * @see #isBoolean()
	 * @see #setBoolean(boolean)
	 * @generated
	 */
	void unsetBoolean();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#isBoolean <em>Boolean</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boolean</em>' attribute is set.
	 * @see #unsetBoolean()
	 * @see #isBoolean()
	 * @see #setBoolean(boolean)
	 * @generated
	 */
	boolean isSetBoolean();

	/**
	 * Returns the value of the '<em><b>Int8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int8</em>' attribute.
	 * @see #isSetInt8()
	 * @see #unsetInt8()
	 * @see #setInt8(byte)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int8()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='element' name='int8' namespace='##targetNamespace'"
	 * @generated
	 */
	byte getInt8();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8 <em>Int8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int8</em>' attribute.
	 * @see #isSetInt8()
	 * @see #unsetInt8()
	 * @see #getInt8()
	 * @generated
	 */
	void setInt8(byte value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8 <em>Int8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInt8()
	 * @see #getInt8()
	 * @see #setInt8(byte)
	 * @generated
	 */
	void unsetInt8();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8 <em>Int8</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int8</em>' attribute is set.
	 * @see #unsetInt8()
	 * @see #getInt8()
	 * @see #setInt8(byte)
	 * @generated
	 */
	boolean isSetInt8();

	/**
	 * Returns the value of the '<em><b>Int16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16</em>' attribute.
	 * @see #isSetInt16()
	 * @see #unsetInt16()
	 * @see #setInt16(short)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int16()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='element' name='int16' namespace='##targetNamespace'"
	 * @generated
	 */
	short getInt16();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16 <em>Int16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int16</em>' attribute.
	 * @see #isSetInt16()
	 * @see #unsetInt16()
	 * @see #getInt16()
	 * @generated
	 */
	void setInt16(short value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16 <em>Int16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInt16()
	 * @see #getInt16()
	 * @see #setInt16(short)
	 * @generated
	 */
	void unsetInt16();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16 <em>Int16</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int16</em>' attribute is set.
	 * @see #unsetInt16()
	 * @see #getInt16()
	 * @see #setInt16(short)
	 * @generated
	 */
	boolean isSetInt16();

	/**
	 * Returns the value of the '<em><b>Int32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int32</em>' attribute.
	 * @see #setInt32(BigInteger)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int32()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='int32' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getInt32();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32 <em>Int32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int32</em>' attribute.
	 * @see #getInt32()
	 * @generated
	 */
	void setInt32(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Int64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64</em>' attribute.
	 * @see #isSetInt64()
	 * @see #unsetInt64()
	 * @see #setInt64(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int64()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='int64' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInt64();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64 <em>Int64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int64</em>' attribute.
	 * @see #isSetInt64()
	 * @see #unsetInt64()
	 * @see #getInt64()
	 * @generated
	 */
	void setInt64(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64 <em>Int64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInt64()
	 * @see #getInt64()
	 * @see #setInt64(long)
	 * @generated
	 */
	void unsetInt64();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64 <em>Int64</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int64</em>' attribute is set.
	 * @see #unsetInt64()
	 * @see #getInt64()
	 * @see #setInt64(long)
	 * @generated
	 */
	boolean isSetInt64();

	/**
	 * Returns the value of the '<em><b>Int8 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int8 U</em>' attribute.
	 * @see #isSetInt8U()
	 * @see #unsetInt8U()
	 * @see #setInt8U(short)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int8U()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='element' name='int8U' namespace='##targetNamespace'"
	 * @generated
	 */
	short getInt8U();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8U <em>Int8 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int8 U</em>' attribute.
	 * @see #isSetInt8U()
	 * @see #unsetInt8U()
	 * @see #getInt8U()
	 * @generated
	 */
	void setInt8U(short value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8U <em>Int8 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInt8U()
	 * @see #getInt8U()
	 * @see #setInt8U(short)
	 * @generated
	 */
	void unsetInt8U();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt8U <em>Int8 U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int8 U</em>' attribute is set.
	 * @see #unsetInt8U()
	 * @see #getInt8U()
	 * @see #setInt8U(short)
	 * @generated
	 */
	boolean isSetInt8U();

	/**
	 * Returns the value of the '<em><b>Int16 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16 U</em>' attribute.
	 * @see #isSetInt16U()
	 * @see #unsetInt16U()
	 * @see #setInt16U(int)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int16U()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='int16U' namespace='##targetNamespace'"
	 * @generated
	 */
	int getInt16U();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16U <em>Int16 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int16 U</em>' attribute.
	 * @see #isSetInt16U()
	 * @see #unsetInt16U()
	 * @see #getInt16U()
	 * @generated
	 */
	void setInt16U(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16U <em>Int16 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInt16U()
	 * @see #getInt16U()
	 * @see #setInt16U(int)
	 * @generated
	 */
	void unsetInt16U();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt16U <em>Int16 U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int16 U</em>' attribute is set.
	 * @see #unsetInt16U()
	 * @see #getInt16U()
	 * @see #setInt16U(int)
	 * @generated
	 */
	boolean isSetInt16U();

	/**
	 * Returns the value of the '<em><b>Int32 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int32 U</em>' attribute.
	 * @see #isSetInt32U()
	 * @see #unsetInt32U()
	 * @see #setInt32U(long)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int32U()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='int32U' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInt32U();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32U <em>Int32 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int32 U</em>' attribute.
	 * @see #isSetInt32U()
	 * @see #unsetInt32U()
	 * @see #getInt32U()
	 * @generated
	 */
	void setInt32U(long value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32U <em>Int32 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInt32U()
	 * @see #getInt32U()
	 * @see #setInt32U(long)
	 * @generated
	 */
	void unsetInt32U();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt32U <em>Int32 U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int32 U</em>' attribute is set.
	 * @see #unsetInt32U()
	 * @see #getInt32U()
	 * @see #setInt32U(long)
	 * @generated
	 */
	boolean isSetInt32U();

	/**
	 * Returns the value of the '<em><b>Int64 U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64 U</em>' attribute.
	 * @see #setInt64U(BigInteger)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Int64U()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='int64U' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getInt64U();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getInt64U <em>Int64 U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int64 U</em>' attribute.
	 * @see #getInt64U()
	 * @generated
	 */
	void setInt64U(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Float32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float32</em>' attribute.
	 * @see #isSetFloat32()
	 * @see #unsetFloat32()
	 * @see #setFloat32(float)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Float32()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='float32' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFloat32();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat32 <em>Float32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float32</em>' attribute.
	 * @see #isSetFloat32()
	 * @see #unsetFloat32()
	 * @see #getFloat32()
	 * @generated
	 */
	void setFloat32(float value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat32 <em>Float32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloat32()
	 * @see #getFloat32()
	 * @see #setFloat32(float)
	 * @generated
	 */
	void unsetFloat32();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat32 <em>Float32</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float32</em>' attribute is set.
	 * @see #unsetFloat32()
	 * @see #getFloat32()
	 * @see #setFloat32(float)
	 * @generated
	 */
	boolean isSetFloat32();

	/**
	 * Returns the value of the '<em><b>Float64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float64</em>' attribute.
	 * @see #isSetFloat64()
	 * @see #unsetFloat64()
	 * @see #setFloat64(double)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Float64()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='float64' namespace='##targetNamespace'"
	 * @generated
	 */
	double getFloat64();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat64 <em>Float64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float64</em>' attribute.
	 * @see #isSetFloat64()
	 * @see #unsetFloat64()
	 * @see #getFloat64()
	 * @generated
	 */
	void setFloat64(double value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat64 <em>Float64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloat64()
	 * @see #getFloat64()
	 * @see #setFloat64(double)
	 * @generated
	 */
	void unsetFloat64();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getFloat64 <em>Float64</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float64</em>' attribute is set.
	 * @see #unsetFloat64()
	 * @see #getFloat64()
	 * @see #setFloat64(double)
	 * @generated
	 */
	boolean isSetFloat64();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference.
	 * @see #setEnum(SGrEnumListType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_Enum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrEnumListType getEnum();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getEnum <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' containment reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(SGrEnumListType value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(XMLGregorianCalendar)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_DateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateTime();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrBasicGenDataPointTypeType_String()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // SGrBasicGenDataPointTypeType
