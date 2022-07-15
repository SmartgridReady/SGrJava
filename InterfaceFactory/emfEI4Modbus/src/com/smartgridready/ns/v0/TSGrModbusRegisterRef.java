/**
 */
package com.smartgridready.ns.v0;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TS Gr Modbus Register Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 2-bytes-word address: could be a register address (to
 * 				address a modbus register - inputRegister or holdRegister) or a part
 * 				of a bit address, see bitRank definition
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getAddr <em>Addr</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getBitRank <em>Bit Rank</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getRegisterType <em>Register Type</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getTSGrModbusRegisterRef()
 * @model extendedMetaData="name='tSGrModbus_RegisterRef' kind='empty'"
 * @generated
 */
public interface TSGrModbusRegisterRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2-bytes-word address: could be a register address (to
	 * 					address a modbus register - inputRegister or holdRegister) or a
	 * 					part of a bit address, see bitRank definition
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(BigInteger)
	 * @see com.smartgridready.ns.v0.V0Package#getTSGrModbusRegisterRef_Addr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='addr'"
	 * @generated
	 */
	BigInteger getAddr();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bit Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bit rank used to define a bit address (bitAddress
	 * 					= addr x 16 + bitRank)
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bit Rank</em>' attribute.
	 * @see #isSetBitRank()
	 * @see #unsetBitRank()
	 * @see #setBitRank(short)
	 * @see com.smartgridready.ns.v0.V0Package#getTSGrModbusRegisterRef_BitRank()
	 * @model unsettable="true" dataType="com.smartgridready.ns.v0.TBitRank"
	 *        extendedMetaData="kind='attribute' name='bitRank'"
	 * @generated
	 */
	short getBitRank();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getBitRank <em>Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Rank</em>' attribute.
	 * @see #isSetBitRank()
	 * @see #unsetBitRank()
	 * @see #getBitRank()
	 * @generated
	 */
	void setBitRank(short value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getBitRank <em>Bit Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitRank()
	 * @see #getBitRank()
	 * @see #setBitRank(short)
	 * @generated
	 */
	void unsetBitRank();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getBitRank <em>Bit Rank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Rank</em>' attribute is set.
	 * @see #unsetBitRank()
	 * @see #getBitRank()
	 * @see #setBitRank(short)
	 * @generated
	 */
	boolean isSetBitRank();

	/**
	 * Returns the value of the '<em><b>Register Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.TEnumObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For slave-role, definition of the Object Type of the
	 * 					data: Discretes Input: Single bit, Read-Only; Coils: Single bit,
	 * 					Read-Write; Input Registers: 16-bit word, Read-Only; Holding
	 * 					Registers: 16-bit word, Read-Write.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @see #isSetRegisterType()
	 * @see #unsetRegisterType()
	 * @see #setRegisterType(TEnumObjectType)
	 * @see com.smartgridready.ns.v0.V0Package#getTSGrModbusRegisterRef_RegisterType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='registerType'"
	 * @generated
	 */
	TEnumObjectType getRegisterType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getRegisterType <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Type</em>' attribute.
	 * @see com.smartgridready.ns.v0.TEnumObjectType
	 * @see #isSetRegisterType()
	 * @see #unsetRegisterType()
	 * @see #getRegisterType()
	 * @generated
	 */
	void setRegisterType(TEnumObjectType value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getRegisterType <em>Register Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegisterType()
	 * @see #getRegisterType()
	 * @see #setRegisterType(TEnumObjectType)
	 * @generated
	 */
	void unsetRegisterType();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.TSGrModbusRegisterRef#getRegisterType <em>Register Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Register Type</em>' attribute is set.
	 * @see #unsetRegisterType()
	 * @see #getRegisterType()
	 * @see #setRegisterType(TEnumObjectType)
	 * @generated
	 */
	boolean isSetRegisterType();

} // TSGrModbusRegisterRef
