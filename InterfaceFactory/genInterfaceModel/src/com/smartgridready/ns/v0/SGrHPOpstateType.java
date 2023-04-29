/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr HP Opstate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BM0002:
 *      BitRank map for interoperable Heat Pump 
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrHPOpstateType()
 * @model extendedMetaData="name='SGrHPOpstateType'"
 * @generated
 */
public enum SGrHPOpstateType implements Enumerator {
	/**
	 * The '<em><b>HPPUMPON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPPUMPON_VALUE
	 * @generated
	 * @ordered
	 */
	HPPUMPON(0, "HPPUMPON", "HP_PUMP_ON"),

	/**
	 * The '<em><b>HPINHEATINGMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINHEATINGMODE_VALUE
	 * @generated
	 * @ordered
	 */
	HPINHEATINGMODE(1, "HPINHEATINGMODE", "HP_IN_HEATING_MODE"),

	/**
	 * The '<em><b>HPINDHWMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINDHWMODE_VALUE
	 * @generated
	 * @ordered
	 */
	HPINDHWMODE(2, "HPINDHWMODE", "HP_IN_DHW_MODE"),

	/**
	 * The '<em><b>COMPRESSORRUNNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSORRUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSORRUNNING(3, "COMPRESSORRUNNING", "COMPRESSOR_RUNNING"),

	/**
	 * The '<em><b>COOLINGMODEACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOLINGMODEACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COOLINGMODEACTIVE(4, "COOLINGMODEACTIVE", "COOLING_MODE_ACTIVE"),

	/**
	 * The '<em><b>INDEFROSTMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEFROSTMODE_VALUE
	 * @generated
	 * @ordered
	 */
	INDEFROSTMODE(5, "INDEFROSTMODE", "IN_DEFROST_MODE");

	/**
	 * The '<em><b>HPPUMPON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPPUMPON
	 * @model literal="HP_PUMP_ON"
	 * @generated
	 * @ordered
	 */
	public static final int HPPUMPON_VALUE = 0;

	/**
	 * The '<em><b>HPINHEATINGMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINHEATINGMODE
	 * @model literal="HP_IN_HEATING_MODE"
	 * @generated
	 * @ordered
	 */
	public static final int HPINHEATINGMODE_VALUE = 1;

	/**
	 * The '<em><b>HPINDHWMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINDHWMODE
	 * @model literal="HP_IN_DHW_MODE"
	 * @generated
	 * @ordered
	 */
	public static final int HPINDHWMODE_VALUE = 2;

	/**
	 * The '<em><b>COMPRESSORRUNNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSORRUNNING
	 * @model literal="COMPRESSOR_RUNNING"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSORRUNNING_VALUE = 3;

	/**
	 * The '<em><b>COOLINGMODEACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOLINGMODEACTIVE
	 * @model literal="COOLING_MODE_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int COOLINGMODEACTIVE_VALUE = 4;

	/**
	 * The '<em><b>INDEFROSTMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEFROSTMODE
	 * @model literal="IN_DEFROST_MODE"
	 * @generated
	 * @ordered
	 */
	public static final int INDEFROSTMODE_VALUE = 5;

	/**
	 * An array of all the '<em><b>SGr HP Opstate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrHPOpstateType[] VALUES_ARRAY =
		new SGrHPOpstateType[] {
			HPPUMPON,
			HPINHEATINGMODE,
			HPINDHWMODE,
			COMPRESSORRUNNING,
			COOLINGMODEACTIVE,
			INDEFROSTMODE,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr HP Opstate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrHPOpstateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr HP Opstate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHPOpstateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrHPOpstateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr HP Opstate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHPOpstateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrHPOpstateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr HP Opstate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHPOpstateType get(int value) {
		switch (value) {
			case HPPUMPON_VALUE: return HPPUMPON;
			case HPINHEATINGMODE_VALUE: return HPINHEATINGMODE;
			case HPINDHWMODE_VALUE: return HPINDHWMODE;
			case COMPRESSORRUNNING_VALUE: return COMPRESSORRUNNING;
			case COOLINGMODEACTIVE_VALUE: return COOLINGMODEACTIVE;
			case INDEFROSTMODE_VALUE: return INDEFROSTMODE;
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
	private SGrHPOpstateType(int value, String name, String literal) {
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
	
} //SGrHPOpstateType
