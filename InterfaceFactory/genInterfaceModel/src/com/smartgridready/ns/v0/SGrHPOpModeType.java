/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr HP Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0016:
 *      Basic operation type of a heat pump
 *      Bereitschaft, Programm, Komfort, Eco, Warmwasser, Notbetrieb     
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrHPOpModeType()
 * @model extendedMetaData="name='SGrHPOpModeType'"
 * @generated
 */
public enum SGrHPOpModeType implements Enumerator {
	/**
	 * The '<em><b>WPEMERGOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPEMERGOP_VALUE
	 * @generated
	 * @ordered
	 */
	WPEMERGOP(0, "WPEMERGOP", "WP_EMERG_OP"),

	/**
	 * The '<em><b>WPREADY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPREADY_VALUE
	 * @generated
	 * @ordered
	 */
	WPREADY(1, "WPREADY", "WP_READY"),

	/**
	 * The '<em><b>WPPROGOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPPROGOP_VALUE
	 * @generated
	 * @ordered
	 */
	WPPROGOP(2, "WPPROGOP", "WP_PROG_OP"),

	/**
	 * The '<em><b>WPCOMFORTOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPCOMFORTOP_VALUE
	 * @generated
	 * @ordered
	 */
	WPCOMFORTOP(3, "WPCOMFORTOP", "WP_COMFORT_OP"),

	/**
	 * The '<em><b>WPECOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPECOOP_VALUE
	 * @generated
	 * @ordered
	 */
	WPECOOP(4, "WPECOOP", "WP_ECO_OP"),

	/**
	 * The '<em><b>WPDOMWATEROP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPDOMWATEROP_VALUE
	 * @generated
	 * @ordered
	 */
	WPDOMWATEROP(5, "WPDOMWATEROP", "WP_DOM_WATER_OP"),

	/**
	 * The '<em><b>WPCOOLACTIVEOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPCOOLACTIVEOP_VALUE
	 * @generated
	 * @ordered
	 */
	WPCOOLACTIVEOP(6, "WPCOOLACTIVEOP", "WP_COOL_ACTIVE_OP"),

	/**
	 * The '<em><b>WPCOOLPASSIVEOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPCOOLPASSIVEOP_VALUE
	 * @generated
	 * @ordered
	 */
	WPCOOLPASSIVEOP(7, "WPCOOLPASSIVEOP", "WP_COOL_PASSIVE_OP");

	/**
	 * The '<em><b>WPEMERGOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPEMERGOP
	 * @model literal="WP_EMERG_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPEMERGOP_VALUE = 0;

	/**
	 * The '<em><b>WPREADY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPREADY
	 * @model literal="WP_READY"
	 * @generated
	 * @ordered
	 */
	public static final int WPREADY_VALUE = 1;

	/**
	 * The '<em><b>WPPROGOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPPROGOP
	 * @model literal="WP_PROG_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPPROGOP_VALUE = 2;

	/**
	 * The '<em><b>WPCOMFORTOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPCOMFORTOP
	 * @model literal="WP_COMFORT_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPCOMFORTOP_VALUE = 3;

	/**
	 * The '<em><b>WPECOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPECOOP
	 * @model literal="WP_ECO_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPECOOP_VALUE = 4;

	/**
	 * The '<em><b>WPDOMWATEROP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPDOMWATEROP
	 * @model literal="WP_DOM_WATER_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPDOMWATEROP_VALUE = 5;

	/**
	 * The '<em><b>WPCOOLACTIVEOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPCOOLACTIVEOP
	 * @model literal="WP_COOL_ACTIVE_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPCOOLACTIVEOP_VALUE = 6;

	/**
	 * The '<em><b>WPCOOLPASSIVEOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPCOOLPASSIVEOP
	 * @model literal="WP_COOL_PASSIVE_OP"
	 * @generated
	 * @ordered
	 */
	public static final int WPCOOLPASSIVEOP_VALUE = 7;

	/**
	 * An array of all the '<em><b>SGr HP Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrHPOpModeType[] VALUES_ARRAY =
		new SGrHPOpModeType[] {
			WPEMERGOP,
			WPREADY,
			WPPROGOP,
			WPCOMFORTOP,
			WPECOOP,
			WPDOMWATEROP,
			WPCOOLACTIVEOP,
			WPCOOLPASSIVEOP,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr HP Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrHPOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr HP Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHPOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrHPOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr HP Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHPOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrHPOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr HP Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHPOpModeType get(int value) {
		switch (value) {
			case WPEMERGOP_VALUE: return WPEMERGOP;
			case WPREADY_VALUE: return WPREADY;
			case WPPROGOP_VALUE: return WPPROGOP;
			case WPCOMFORTOP_VALUE: return WPCOMFORTOP;
			case WPECOOP_VALUE: return WPECOOP;
			case WPDOMWATEROP_VALUE: return WPDOMWATEROP;
			case WPCOOLACTIVEOP_VALUE: return WPCOOLACTIVEOP;
			case WPCOOLPASSIVEOP_VALUE: return WPCOOLPASSIVEOP;
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
	private SGrHPOpModeType(int value, String name, String literal) {
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
	
} //SGrHPOpModeType
