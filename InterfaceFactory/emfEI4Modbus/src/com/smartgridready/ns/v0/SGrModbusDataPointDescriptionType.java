/**
 */
package com.smartgridready.ns.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGr Modbus Data Point Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusDataType <em>Modbus Data Type</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusFirstRegisterReference <em>Modbus First Register Reference</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getDpSizeNrRegisters <em>Dp Size Nr Registers</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getBitmask <em>Bitmask</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getMasterFunctionsSupported <em>Master Functions Supported</em>}</li>
 *   <li>{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusJMESPath <em>Modbus JMES Path</em>}</li>
 * </ul>
 *
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType()
 * @model extendedMetaData="name='SGrModbusDataPointDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface SGrModbusDataPointDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modbus Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus Data Type</em>' containment reference.
	 * @see #setModbusDataType(SGrBasicGenDataPointTypeType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType_ModbusDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SGrBasicGenDataPointTypeType getModbusDataType();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusDataType <em>Modbus Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus Data Type</em>' containment reference.
	 * @see #getModbusDataType()
	 * @generated
	 */
	void setModbusDataType(SGrBasicGenDataPointTypeType value);

	/**
	 * Returns the value of the '<em><b>Modbus First Register Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modbus First Register Reference</em>' containment reference.
	 * @see #setModbusFirstRegisterReference(TSGrModbusRegisterRef)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType_ModbusFirstRegisterReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modbusFirstRegisterReference' namespace='##targetNamespace'"
	 * @generated
	 */
	TSGrModbusRegisterRef getModbusFirstRegisterReference();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusFirstRegisterReference <em>Modbus First Register Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus First Register Reference</em>' containment reference.
	 * @see #getModbusFirstRegisterReference()
	 * @generated
	 */
	void setModbusFirstRegisterReference(TSGrModbusRegisterRef value);

	/**
	 * Returns the value of the '<em><b>Dp Size Nr Registers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp Size Nr Registers</em>' attribute.
	 * @see #isSetDpSizeNrRegisters()
	 * @see #unsetDpSizeNrRegisters()
	 * @see #setDpSizeNrRegisters(int)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType_DpSizeNrRegisters()
	 * @model unsettable="true" dataType="com.smartgridready.ns.v0.DpSizeNrRegistersType" required="true"
	 *        extendedMetaData="kind='element' name='dpSizeNrRegisters' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDpSizeNrRegisters();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getDpSizeNrRegisters <em>Dp Size Nr Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dp Size Nr Registers</em>' attribute.
	 * @see #isSetDpSizeNrRegisters()
	 * @see #unsetDpSizeNrRegisters()
	 * @see #getDpSizeNrRegisters()
	 * @generated
	 */
	void setDpSizeNrRegisters(int value);

	/**
	 * Unsets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getDpSizeNrRegisters <em>Dp Size Nr Registers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDpSizeNrRegisters()
	 * @see #getDpSizeNrRegisters()
	 * @see #setDpSizeNrRegisters(int)
	 * @generated
	 */
	void unsetDpSizeNrRegisters();

	/**
	 * Returns whether the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getDpSizeNrRegisters <em>Dp Size Nr Registers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dp Size Nr Registers</em>' attribute is set.
	 * @see #unsetDpSizeNrRegisters()
	 * @see #getDpSizeNrRegisters()
	 * @see #setDpSizeNrRegisters(int)
	 * @generated
	 */
	boolean isSetDpSizeNrRegisters();

	/**
	 * Returns the value of the '<em><b>Bitmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     				Hexadecimal bitmask for mask to elmininate non used
	 *     				bit frames
	 *     			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bitmask</em>' attribute.
	 * @see #setBitmask(byte[])
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType_Bitmask()
	 * @model dataType="com.smartgridready.ns.v0.BitmaskType"
	 *        extendedMetaData="kind='element' name='bitmask' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBitmask();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getBitmask <em>Bitmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bitmask</em>' attribute.
	 * @see #getBitmask()
	 * @generated
	 */
	void setBitmask(byte[] value);

	/**
	 * Returns the value of the '<em><b>Master Functions Supported</b></em>' attribute list.
	 * The list contents are of type {@link com.smartgridready.ns.v0.MasterFunctionsSupportedType}.
	 * The literals are from the enumeration {@link com.smartgridready.ns.v0.MasterFunctionsSupportedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     				Available function/command codes for Master /
	 *     				Clients The various reading, writing and other
	 *     				operations are categorized as follows. The most
	 *     				"primitive" reads and writes are A number of sources
	 *     				use alternative terminology, for example Force
	 *     				Single Coil where the standard uses Write Single
	 *     				Coil.[11] Prominent entities within a Modbus slave
	 *     				are: ReadDiscreteInputs (code: 2) ReadCoils (code:
	 *     				1) WriteSingleCoil (code: 5) WriteMultipleCoils
	 *     				(code:15) ReadInputRegisters (code:4)
	 *     				ReadMultipleHoldingRegisters (code:3)
	 *     				WriteSingleHoldingRegister (code:6)
	 *     				WriteMultipleHoldingRegisters (code:16) the enum
	 *     				"Primitives" means, that the current register Type
	 *     				supports Single Trasnactions If dpSizeNrRegistarts
	 *     				is >1, also the multiple access functions must be
	 *     				supported
	 *     			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master Functions Supported</em>' attribute list.
	 * @see com.smartgridready.ns.v0.MasterFunctionsSupportedType
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType_MasterFunctionsSupported()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='masterFunctionsSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterFunctionsSupportedType> getMasterFunctionsSupported();

	/**
	 * Returns the value of the '<em><b>Modbus JMES Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modbus JMES Path</em>' containment reference.
	 * @see #setModbusJMESPath(ModbusJMESPathType)
	 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusDataPointDescriptionType_ModbusJMESPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modbusJMESPath' namespace='##targetNamespace'"
	 * @generated
	 */
	ModbusJMESPathType getModbusJMESPath();

	/**
	 * Sets the value of the '{@link com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType#getModbusJMESPath <em>Modbus JMES Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modbus JMES Path</em>' containment reference.
	 * @see #getModbusJMESPath()
	 * @generated
	 */
	void setModbusJMESPath(ModbusJMESPathType value);

} // SGrModbusDataPointDescriptionType
