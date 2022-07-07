/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TEnum Exception Code Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of the Modbus Exceptions sent by Slave (Server)
 * 				responses.
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getTEnumExceptionCodeType()
 * @model extendedMetaData="name='tEnumExceptionCodeType'"
 * @generated
 */
public enum TEnumExceptionCodeType implements Enumerator {
	/**
	 * The '<em><b>Illegal Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "1: Illegal Function Function code received in the
	 * 						query is not recognized or allowed by slave"
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ILLEGAL_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	ILLEGAL_FUNCTION(0, "IllegalFunction", "IllegalFunction"),

	/**
	 * The '<em><b>Illegal Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2: Illegal Data Address Data address of some or all
	 * 						the required entities are not allowed or do not exist in slave
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ILLEGAL_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ILLEGAL_ADDRESS(1, "IllegalAddress", "IllegalAddress"),

	/**
	 * The '<em><b>Illegal Data Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3: Illegal Data Value Value is not accepted by slave
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ILLEGAL_DATA_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	ILLEGAL_DATA_VALUE(2, "IllegalDataValue", "IllegalDataValue"),

	/**
	 * The '<em><b>Slave Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4: Slave (Server) Device Failure Unrecoverable error
	 * 						occurred while slave was attempting to perform requested action
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SLAVE_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	SLAVE_FAILURE(3, "SlaveFailure", "SlaveFailure"),

	/**
	 * The '<em><b>ACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5: Acknowledge Slave has accepted request and is
	 * 						processing it, but a long duration of time is required. This
	 * 						response is returned to prevent a timeout error from occurring in
	 * 						the master. Master can next issue a Poll Program Complete message
	 * 						to determine whether processing is completed
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ACK_VALUE
	 * @generated
	 * @ordered
	 */
	ACK(4, "ACK", "ACK"),

	/**
	 * The '<em><b>Slave Busy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6: Slave (Server) Device Busy Slave is engaged in
	 * 						processing a long-duration command. Master should retry later
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SLAVE_BUSY_VALUE
	 * @generated
	 * @ordered
	 */
	SLAVE_BUSY(5, "SlaveBusy", "SlaveBusy"),

	/**
	 * The '<em><b>NACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7: Negative Acknowledge Slave (Server) cannot
	 * 						perform the programming functions. Master should request
	 * 						diagnostic or error information from slave
	 * 					
	 * <!-- end-model-doc -->
	 * @see #NACK_VALUE
	 * @generated
	 * @ordered
	 */
	NACK(6, "NACK", "NACK"),

	/**
	 * The '<em><b>Memory Parity Err</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8: Memory Parity Error Slave (Server) detected a
	 * 						parity error in memory. Master can retry the request, but service
	 * 						may be required on the slave device
	 * 					
	 * <!-- end-model-doc -->
	 * @see #MEMORY_PARITY_ERR_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_PARITY_ERR(7, "MemoryParityErr", "MemoryParityErr"),

	/**
	 * The '<em><b>Gtwy Path Err</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10: Gateway Path Unavailable Specialized for Modbus
	 * 						gateways. Indicates a misconfigured gateway
	 * 					
	 * <!-- end-model-doc -->
	 * @see #GTWY_PATH_ERR_VALUE
	 * @generated
	 * @ordered
	 */
	GTWY_PATH_ERR(8, "GtwyPathErr", "GtwyPathErr"),

	/**
	 * The '<em><b>Gtwy Target Err</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 11: Gateway Target Device Failed to Respond
	 * 						Specialized for Modbus gateways. Sent when slave fails to respond
	 * 					
	 * <!-- end-model-doc -->
	 * @see #GTWY_TARGET_ERR_VALUE
	 * @generated
	 * @ordered
	 */
	GTWY_TARGET_ERR(9, "GtwyTargetErr", "GtwyTargetErr");

	/**
	 * The '<em><b>Illegal Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "1: Illegal Function Function code received in the
	 * 						query is not recognized or allowed by slave"
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ILLEGAL_FUNCTION
	 * @model name="IllegalFunction"
	 * @generated
	 * @ordered
	 */
	public static final int ILLEGAL_FUNCTION_VALUE = 0;

	/**
	 * The '<em><b>Illegal Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2: Illegal Data Address Data address of some or all
	 * 						the required entities are not allowed or do not exist in slave
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ILLEGAL_ADDRESS
	 * @model name="IllegalAddress"
	 * @generated
	 * @ordered
	 */
	public static final int ILLEGAL_ADDRESS_VALUE = 1;

	/**
	 * The '<em><b>Illegal Data Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3: Illegal Data Value Value is not accepted by slave
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ILLEGAL_DATA_VALUE
	 * @model name="IllegalDataValue"
	 * @generated
	 * @ordered
	 */
	public static final int ILLEGAL_DATA_VALUE_VALUE = 2;

	/**
	 * The '<em><b>Slave Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4: Slave (Server) Device Failure Unrecoverable error
	 * 						occurred while slave was attempting to perform requested action
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SLAVE_FAILURE
	 * @model name="SlaveFailure"
	 * @generated
	 * @ordered
	 */
	public static final int SLAVE_FAILURE_VALUE = 3;

	/**
	 * The '<em><b>ACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5: Acknowledge Slave has accepted request and is
	 * 						processing it, but a long duration of time is required. This
	 * 						response is returned to prevent a timeout error from occurring in
	 * 						the master. Master can next issue a Poll Program Complete message
	 * 						to determine whether processing is completed
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACK_VALUE = 4;

	/**
	 * The '<em><b>Slave Busy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6: Slave (Server) Device Busy Slave is engaged in
	 * 						processing a long-duration command. Master should retry later
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SLAVE_BUSY
	 * @model name="SlaveBusy"
	 * @generated
	 * @ordered
	 */
	public static final int SLAVE_BUSY_VALUE = 5;

	/**
	 * The '<em><b>NACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7: Negative Acknowledge Slave (Server) cannot
	 * 						perform the programming functions. Master should request
	 * 						diagnostic or error information from slave
	 * 					
	 * <!-- end-model-doc -->
	 * @see #NACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NACK_VALUE = 6;

	/**
	 * The '<em><b>Memory Parity Err</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8: Memory Parity Error Slave (Server) detected a
	 * 						parity error in memory. Master can retry the request, but service
	 * 						may be required on the slave device
	 * 					
	 * <!-- end-model-doc -->
	 * @see #MEMORY_PARITY_ERR
	 * @model name="MemoryParityErr"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_PARITY_ERR_VALUE = 7;

	/**
	 * The '<em><b>Gtwy Path Err</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10: Gateway Path Unavailable Specialized for Modbus
	 * 						gateways. Indicates a misconfigured gateway
	 * 					
	 * <!-- end-model-doc -->
	 * @see #GTWY_PATH_ERR
	 * @model name="GtwyPathErr"
	 * @generated
	 * @ordered
	 */
	public static final int GTWY_PATH_ERR_VALUE = 8;

	/**
	 * The '<em><b>Gtwy Target Err</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 11: Gateway Target Device Failed to Respond
	 * 						Specialized for Modbus gateways. Sent when slave fails to respond
	 * 					
	 * <!-- end-model-doc -->
	 * @see #GTWY_TARGET_ERR
	 * @model name="GtwyTargetErr"
	 * @generated
	 * @ordered
	 */
	public static final int GTWY_TARGET_ERR_VALUE = 9;

	/**
	 * An array of all the '<em><b>TEnum Exception Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TEnumExceptionCodeType[] VALUES_ARRAY =
		new TEnumExceptionCodeType[] {
			ILLEGAL_FUNCTION,
			ILLEGAL_ADDRESS,
			ILLEGAL_DATA_VALUE,
			SLAVE_FAILURE,
			ACK,
			SLAVE_BUSY,
			NACK,
			MEMORY_PARITY_ERR,
			GTWY_PATH_ERR,
			GTWY_TARGET_ERR,
		};

	/**
	 * A public read-only list of all the '<em><b>TEnum Exception Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TEnumExceptionCodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TEnum Exception Code Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumExceptionCodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TEnumExceptionCodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TEnum Exception Code Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumExceptionCodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TEnumExceptionCodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TEnum Exception Code Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumExceptionCodeType get(int value) {
		switch (value) {
			case ILLEGAL_FUNCTION_VALUE: return ILLEGAL_FUNCTION;
			case ILLEGAL_ADDRESS_VALUE: return ILLEGAL_ADDRESS;
			case ILLEGAL_DATA_VALUE_VALUE: return ILLEGAL_DATA_VALUE;
			case SLAVE_FAILURE_VALUE: return SLAVE_FAILURE;
			case ACK_VALUE: return ACK;
			case SLAVE_BUSY_VALUE: return SLAVE_BUSY;
			case NACK_VALUE: return NACK;
			case MEMORY_PARITY_ERR_VALUE: return MEMORY_PARITY_ERR;
			case GTWY_PATH_ERR_VALUE: return GTWY_PATH_ERR;
			case GTWY_TARGET_ERR_VALUE: return GTWY_TARGET_ERR;
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
	private TEnumExceptionCodeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //TEnumExceptionCodeType
