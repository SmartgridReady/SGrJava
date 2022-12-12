/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Master Functions Supported Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * the selection of the supported Master access functions
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getMasterFunctionsSupportedType()
 * @model extendedMetaData="name='masterFunctionsSupportedType'"
 * @generated
 */
public enum MasterFunctionsSupportedType implements Enumerator {
	/**
	 * The '<em><b>Primitives</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "Primitives" support ReadDiscreteInputs (code: 2)
	 * 						ReadCoils (code: 1) WriteSingleCoil (code: 5) ReadInputRegisters
	 * 						(code:4) WriteSingleHoldingRegister (code:6) for single Register
	 * 						access if dpSizeNrRegisters > 1 "Primitives" supports
	 * 						ReadMultipleHoldingRegisters (code:3) WriteMultipleCoils (code:15)
	 * 						WriteMultipleHoldingRegisters (code:16) for the register Type
	 * 						being adressed 
	 * 					
	 * <!-- end-model-doc -->
	 * @see #PRIMITIVES_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVES(0, "Primitives", "Primitives"),

	/**
	 * The '<em><b>Read Discrete Inputs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code= 2
	 * <!-- end-model-doc -->
	 * @see #READ_DISCRETE_INPUTS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_DISCRETE_INPUTS(1, "ReadDiscreteInputs", "ReadDiscreteInputs"),

	/**
	 * The '<em><b>Read Coils</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code: 1
	 * <!-- end-model-doc -->
	 * @see #READ_COILS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_COILS(2, "ReadCoils", "ReadCoils"),

	/**
	 * The '<em><b>Write Single Coil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code: 5
	 * <!-- end-model-doc -->
	 * @see #WRITE_SINGLE_COIL_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_SINGLE_COIL(3, "WriteSingleCoil", "WriteSingleCoil"),

	/**
	 * The '<em><b>Write Multiple Coils</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:15
	 * <!-- end-model-doc -->
	 * @see #WRITE_MULTIPLE_COILS_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_MULTIPLE_COILS(4, "WriteMultipleCoils", "WriteMultipleCoils"),

	/**
	 * The '<em><b>Read Input Registers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:4
	 * <!-- end-model-doc -->
	 * @see #READ_INPUT_REGISTERS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_INPUT_REGISTERS(5, "ReadInputRegisters", "ReadInputRegisters"),

	/**
	 * The '<em><b>Read Multiple Holding Registers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:3
	 * <!-- end-model-doc -->
	 * @see #READ_MULTIPLE_HOLDING_REGISTERS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_MULTIPLE_HOLDING_REGISTERS(6, "ReadMultipleHoldingRegisters", "ReadMultipleHoldingRegisters"),

	/**
	 * The '<em><b>Write Single Holding Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:6
	 * <!-- end-model-doc -->
	 * @see #WRITE_SINGLE_HOLDING_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_SINGLE_HOLDING_REGISTER(7, "WriteSingleHoldingRegister", "WriteSingleHoldingRegister"),

	/**
	 * The '<em><b>Write Multiple Holding Registers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:16
	 * <!-- end-model-doc -->
	 * @see #WRITE_MULTIPLE_HOLDING_REGISTERS_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_MULTIPLE_HOLDING_REGISTERS(8, "WriteMultipleHoldingRegisters", "WriteMultipleHoldingRegisters"),

	/**
	 * The '<em><b>Read Write Multiple Registers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:23
	 * <!-- end-model-doc -->
	 * @see #READ_WRITE_MULTIPLE_REGISTERS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE_MULTIPLE_REGISTERS(9, "ReadWriteMultipleRegisters", "Read/WriteMultipleRegisters"),

	/**
	 * The '<em><b>Mask Write Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:22
	 * <!-- end-model-doc -->
	 * @see #MASK_WRITE_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASK_WRITE_REGISTER(10, "MaskWriteRegister", "MaskWriteRegister"),

	/**
	 * The '<em><b>Read FIFO Queue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:24
	 * <!-- end-model-doc -->
	 * @see #READ_FIFO_QUEUE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_FIFO_QUEUE(11, "ReadFIFOQueue", "ReadFIFOQueue"),

	/**
	 * The '<em><b>Read File Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:20
	 * <!-- end-model-doc -->
	 * @see #READ_FILE_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	READ_FILE_RECORD(12, "ReadFileRecord", "ReadFileRecord"),

	/**
	 * The '<em><b>Write File Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:21
	 * <!-- end-model-doc -->
	 * @see #WRITE_FILE_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_FILE_RECORD(13, "WriteFileRecord", "WriteFileRecord"),

	/**
	 * The '<em><b>Read Exception Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:7
	 * <!-- end-model-doc -->
	 * @see #READ_EXCEPTION_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_EXCEPTION_STATUS(14, "ReadExceptionStatus", "ReadExceptionStatus"),

	/**
	 * The '<em><b>Diagnostic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:8
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC(15, "Diagnostic", "Diagnostic"),

	/**
	 * The '<em><b>Get Com Event Counter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:11
	 * <!-- end-model-doc -->
	 * @see #GET_COM_EVENT_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	GET_COM_EVENT_COUNTER(16, "GetComEventCounter", "GetComEventCounter"),

	/**
	 * The '<em><b>Get Com Event Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:12
	 * <!-- end-model-doc -->
	 * @see #GET_COM_EVENT_LOG_VALUE
	 * @generated
	 * @ordered
	 */
	GET_COM_EVENT_LOG(17, "GetComEventLog", "GetComEventLog"),

	/**
	 * The '<em><b>Report Slave ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:17
	 * <!-- end-model-doc -->
	 * @see #REPORT_SLAVE_ID_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_SLAVE_ID(18, "ReportSlaveID", "ReportSlaveID"),

	/**
	 * The '<em><b>Read Device Identification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:43
	 * <!-- end-model-doc -->
	 * @see #READ_DEVICE_IDENTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	READ_DEVICE_IDENTIFICATION(19, "ReadDeviceIdentification", "ReadDeviceIdentification");

	/**
	 * The '<em><b>Primitives</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "Primitives" support ReadDiscreteInputs (code: 2)
	 * 						ReadCoils (code: 1) WriteSingleCoil (code: 5) ReadInputRegisters
	 * 						(code:4) WriteSingleHoldingRegister (code:6) for single Register
	 * 						access if dpSizeNrRegisters > 1 "Primitives" supports
	 * 						ReadMultipleHoldingRegisters (code:3) WriteMultipleCoils (code:15)
	 * 						WriteMultipleHoldingRegisters (code:16) for the register Type
	 * 						being adressed 
	 * 					
	 * <!-- end-model-doc -->
	 * @see #PRIMITIVES
	 * @model name="Primitives"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVES_VALUE = 0;

	/**
	 * The '<em><b>Read Discrete Inputs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code= 2
	 * <!-- end-model-doc -->
	 * @see #READ_DISCRETE_INPUTS
	 * @model name="ReadDiscreteInputs"
	 * @generated
	 * @ordered
	 */
	public static final int READ_DISCRETE_INPUTS_VALUE = 1;

	/**
	 * The '<em><b>Read Coils</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code: 1
	 * <!-- end-model-doc -->
	 * @see #READ_COILS
	 * @model name="ReadCoils"
	 * @generated
	 * @ordered
	 */
	public static final int READ_COILS_VALUE = 2;

	/**
	 * The '<em><b>Write Single Coil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code: 5
	 * <!-- end-model-doc -->
	 * @see #WRITE_SINGLE_COIL
	 * @model name="WriteSingleCoil"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_SINGLE_COIL_VALUE = 3;

	/**
	 * The '<em><b>Write Multiple Coils</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:15
	 * <!-- end-model-doc -->
	 * @see #WRITE_MULTIPLE_COILS
	 * @model name="WriteMultipleCoils"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_MULTIPLE_COILS_VALUE = 4;

	/**
	 * The '<em><b>Read Input Registers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:4
	 * <!-- end-model-doc -->
	 * @see #READ_INPUT_REGISTERS
	 * @model name="ReadInputRegisters"
	 * @generated
	 * @ordered
	 */
	public static final int READ_INPUT_REGISTERS_VALUE = 5;

	/**
	 * The '<em><b>Read Multiple Holding Registers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:3
	 * <!-- end-model-doc -->
	 * @see #READ_MULTIPLE_HOLDING_REGISTERS
	 * @model name="ReadMultipleHoldingRegisters"
	 * @generated
	 * @ordered
	 */
	public static final int READ_MULTIPLE_HOLDING_REGISTERS_VALUE = 6;

	/**
	 * The '<em><b>Write Single Holding Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:6
	 * <!-- end-model-doc -->
	 * @see #WRITE_SINGLE_HOLDING_REGISTER
	 * @model name="WriteSingleHoldingRegister"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_SINGLE_HOLDING_REGISTER_VALUE = 7;

	/**
	 * The '<em><b>Write Multiple Holding Registers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:16
	 * <!-- end-model-doc -->
	 * @see #WRITE_MULTIPLE_HOLDING_REGISTERS
	 * @model name="WriteMultipleHoldingRegisters"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_MULTIPLE_HOLDING_REGISTERS_VALUE = 8;

	/**
	 * The '<em><b>Read Write Multiple Registers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:23
	 * <!-- end-model-doc -->
	 * @see #READ_WRITE_MULTIPLE_REGISTERS
	 * @model name="ReadWriteMultipleRegisters" literal="Read/WriteMultipleRegisters"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_MULTIPLE_REGISTERS_VALUE = 9;

	/**
	 * The '<em><b>Mask Write Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:22
	 * <!-- end-model-doc -->
	 * @see #MASK_WRITE_REGISTER
	 * @model name="MaskWriteRegister"
	 * @generated
	 * @ordered
	 */
	public static final int MASK_WRITE_REGISTER_VALUE = 10;

	/**
	 * The '<em><b>Read FIFO Queue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:24
	 * <!-- end-model-doc -->
	 * @see #READ_FIFO_QUEUE
	 * @model name="ReadFIFOQueue"
	 * @generated
	 * @ordered
	 */
	public static final int READ_FIFO_QUEUE_VALUE = 11;

	/**
	 * The '<em><b>Read File Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:20
	 * <!-- end-model-doc -->
	 * @see #READ_FILE_RECORD
	 * @model name="ReadFileRecord"
	 * @generated
	 * @ordered
	 */
	public static final int READ_FILE_RECORD_VALUE = 12;

	/**
	 * The '<em><b>Write File Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:21
	 * <!-- end-model-doc -->
	 * @see #WRITE_FILE_RECORD
	 * @model name="WriteFileRecord"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_FILE_RECORD_VALUE = 13;

	/**
	 * The '<em><b>Read Exception Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:7
	 * <!-- end-model-doc -->
	 * @see #READ_EXCEPTION_STATUS
	 * @model name="ReadExceptionStatus"
	 * @generated
	 * @ordered
	 */
	public static final int READ_EXCEPTION_STATUS_VALUE = 14;

	/**
	 * The '<em><b>Diagnostic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:8
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC
	 * @model name="Diagnostic"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_VALUE = 15;

	/**
	 * The '<em><b>Get Com Event Counter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:11
	 * <!-- end-model-doc -->
	 * @see #GET_COM_EVENT_COUNTER
	 * @model name="GetComEventCounter"
	 * @generated
	 * @ordered
	 */
	public static final int GET_COM_EVENT_COUNTER_VALUE = 16;

	/**
	 * The '<em><b>Get Com Event Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:12
	 * <!-- end-model-doc -->
	 * @see #GET_COM_EVENT_LOG
	 * @model name="GetComEventLog"
	 * @generated
	 * @ordered
	 */
	public static final int GET_COM_EVENT_LOG_VALUE = 17;

	/**
	 * The '<em><b>Report Slave ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:17
	 * <!-- end-model-doc -->
	 * @see #REPORT_SLAVE_ID
	 * @model name="ReportSlaveID"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_SLAVE_ID_VALUE = 18;

	/**
	 * The '<em><b>Read Device Identification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master function code:43
	 * <!-- end-model-doc -->
	 * @see #READ_DEVICE_IDENTIFICATION
	 * @model name="ReadDeviceIdentification"
	 * @generated
	 * @ordered
	 */
	public static final int READ_DEVICE_IDENTIFICATION_VALUE = 19;

	/**
	 * An array of all the '<em><b>Master Functions Supported Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MasterFunctionsSupportedType[] VALUES_ARRAY =
		new MasterFunctionsSupportedType[] {
			PRIMITIVES,
			READ_DISCRETE_INPUTS,
			READ_COILS,
			WRITE_SINGLE_COIL,
			WRITE_MULTIPLE_COILS,
			READ_INPUT_REGISTERS,
			READ_MULTIPLE_HOLDING_REGISTERS,
			WRITE_SINGLE_HOLDING_REGISTER,
			WRITE_MULTIPLE_HOLDING_REGISTERS,
			READ_WRITE_MULTIPLE_REGISTERS,
			MASK_WRITE_REGISTER,
			READ_FIFO_QUEUE,
			READ_FILE_RECORD,
			WRITE_FILE_RECORD,
			READ_EXCEPTION_STATUS,
			DIAGNOSTIC,
			GET_COM_EVENT_COUNTER,
			GET_COM_EVENT_LOG,
			REPORT_SLAVE_ID,
			READ_DEVICE_IDENTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Master Functions Supported Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MasterFunctionsSupportedType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Master Functions Supported Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MasterFunctionsSupportedType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MasterFunctionsSupportedType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Master Functions Supported Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MasterFunctionsSupportedType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MasterFunctionsSupportedType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Master Functions Supported Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MasterFunctionsSupportedType get(int value) {
		switch (value) {
			case PRIMITIVES_VALUE: return PRIMITIVES;
			case READ_DISCRETE_INPUTS_VALUE: return READ_DISCRETE_INPUTS;
			case READ_COILS_VALUE: return READ_COILS;
			case WRITE_SINGLE_COIL_VALUE: return WRITE_SINGLE_COIL;
			case WRITE_MULTIPLE_COILS_VALUE: return WRITE_MULTIPLE_COILS;
			case READ_INPUT_REGISTERS_VALUE: return READ_INPUT_REGISTERS;
			case READ_MULTIPLE_HOLDING_REGISTERS_VALUE: return READ_MULTIPLE_HOLDING_REGISTERS;
			case WRITE_SINGLE_HOLDING_REGISTER_VALUE: return WRITE_SINGLE_HOLDING_REGISTER;
			case WRITE_MULTIPLE_HOLDING_REGISTERS_VALUE: return WRITE_MULTIPLE_HOLDING_REGISTERS;
			case READ_WRITE_MULTIPLE_REGISTERS_VALUE: return READ_WRITE_MULTIPLE_REGISTERS;
			case MASK_WRITE_REGISTER_VALUE: return MASK_WRITE_REGISTER;
			case READ_FIFO_QUEUE_VALUE: return READ_FIFO_QUEUE;
			case READ_FILE_RECORD_VALUE: return READ_FILE_RECORD;
			case WRITE_FILE_RECORD_VALUE: return WRITE_FILE_RECORD;
			case READ_EXCEPTION_STATUS_VALUE: return READ_EXCEPTION_STATUS;
			case DIAGNOSTIC_VALUE: return DIAGNOSTIC;
			case GET_COM_EVENT_COUNTER_VALUE: return GET_COM_EVENT_COUNTER;
			case GET_COM_EVENT_LOG_VALUE: return GET_COM_EVENT_LOG;
			case REPORT_SLAVE_ID_VALUE: return REPORT_SLAVE_ID;
			case READ_DEVICE_IDENTIFICATION_VALUE: return READ_DEVICE_IDENTIFICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MasterFunctionsSupportedType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MasterFunctionsSupportedType
