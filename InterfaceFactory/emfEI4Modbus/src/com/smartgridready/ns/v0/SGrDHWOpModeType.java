/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr DHW Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0018:
 *      Basic operation type of a Domestic Hot Water Heat Pump operation mode
 *      Standby	week 1 	week 2		Constant		Eco mode    
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrDHWOpModeType()
 * @model extendedMetaData="name='SGrDHWOpModeType'"
 * @generated
 */
public enum SGrDHWOpModeType implements Enumerator {
	/**
	 * The '<em><b>DHWSTANDBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWSTANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	DHWSTANDBY(0, "DHWSTANDBY", "DHW_STANDBY"),

	/**
	 * The '<em><b>DHWSCHEDULE1OP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWSCHEDULE1OP_VALUE
	 * @generated
	 * @ordered
	 */
	DHWSCHEDULE1OP(1, "DHWSCHEDULE1OP", "DHW_SCHEDULE_1_OP"),

	/**
	 * The '<em><b>DHWSCHEDULE2OP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWSCHEDULE2OP_VALUE
	 * @generated
	 * @ordered
	 */
	DHWSCHEDULE2OP(2, "DHWSCHEDULE2OP", "DHW_SCHEDULE_2_OP"),

	/**
	 * The '<em><b>DHWCONSTOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWCONSTOP_VALUE
	 * @generated
	 * @ordered
	 */
	DHWCONSTOP(3, "DHWCONSTOP", "DHW_CONST_OP"),

	/**
	 * The '<em><b>DHWECOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWECOOP_VALUE
	 * @generated
	 * @ordered
	 */
	DHWECOOP(4, "DHWECOOP", "DHW_ECO_OP");

	/**
	 * The '<em><b>DHWSTANDBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWSTANDBY
	 * @model literal="DHW_STANDBY"
	 * @generated
	 * @ordered
	 */
	public static final int DHWSTANDBY_VALUE = 0;

	/**
	 * The '<em><b>DHWSCHEDULE1OP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWSCHEDULE1OP
	 * @model literal="DHW_SCHEDULE_1_OP"
	 * @generated
	 * @ordered
	 */
	public static final int DHWSCHEDULE1OP_VALUE = 1;

	/**
	 * The '<em><b>DHWSCHEDULE2OP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWSCHEDULE2OP
	 * @model literal="DHW_SCHEDULE_2_OP"
	 * @generated
	 * @ordered
	 */
	public static final int DHWSCHEDULE2OP_VALUE = 2;

	/**
	 * The '<em><b>DHWCONSTOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWCONSTOP
	 * @model literal="DHW_CONST_OP"
	 * @generated
	 * @ordered
	 */
	public static final int DHWCONSTOP_VALUE = 3;

	/**
	 * The '<em><b>DHWECOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWECOOP
	 * @model literal="DHW_ECO_OP"
	 * @generated
	 * @ordered
	 */
	public static final int DHWECOOP_VALUE = 4;

	/**
	 * An array of all the '<em><b>SGr DHW Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrDHWOpModeType[] VALUES_ARRAY =
		new SGrDHWOpModeType[] {
			DHWSTANDBY,
			DHWSCHEDULE1OP,
			DHWSCHEDULE2OP,
			DHWCONSTOP,
			DHWECOOP,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr DHW Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrDHWOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr DHW Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrDHWOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrDHWOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr DHW Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrDHWOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrDHWOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr DHW Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrDHWOpModeType get(int value) {
		switch (value) {
			case DHWSTANDBY_VALUE: return DHWSTANDBY;
			case DHWSCHEDULE1OP_VALUE: return DHWSCHEDULE1OP;
			case DHWSCHEDULE2OP_VALUE: return DHWSCHEDULE2OP;
			case DHWCONSTOP_VALUE: return DHWCONSTOP;
			case DHWECOOP_VALUE: return DHWECOOP;
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
	private SGrDHWOpModeType(int value, String name, String literal) {
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
	
} //SGrDHWOpModeType
