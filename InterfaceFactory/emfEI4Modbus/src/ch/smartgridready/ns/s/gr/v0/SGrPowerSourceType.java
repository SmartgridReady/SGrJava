/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Power Source Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  E0004: Power Source of a Device (inherited from
 * 				EEBUS) unknown, mains1Phase, mains3Phase, battery, dc
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrPowerSourceType()
 * @model extendedMetaData="name='SGrPowerSourceType'"
 * @generated
 */
public enum SGrPowerSourceType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Mains1 Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINS1_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINS1_PHASE(1, "mains1Phase", "mains1Phase"),

	/**
	 * The '<em><b>Mains3 Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINS3_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINS3_PHASE(2, "mains3Phase", "mains3Phase"),

	/**
	 * The '<em><b>Battery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY(3, "battery", "battery"),

	/**
	 * The '<em><b>Forced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCED_VALUE
	 * @generated
	 * @ordered
	 */
	FORCED(4, "forced", "forced");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Mains1 Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINS1_PHASE
	 * @model name="mains1Phase"
	 * @generated
	 * @ordered
	 */
	public static final int MAINS1_PHASE_VALUE = 1;

	/**
	 * The '<em><b>Mains3 Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINS3_PHASE
	 * @model name="mains3Phase"
	 * @generated
	 * @ordered
	 */
	public static final int MAINS3_PHASE_VALUE = 2;

	/**
	 * The '<em><b>Battery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY
	 * @model name="battery"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_VALUE = 3;

	/**
	 * The '<em><b>Forced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCED
	 * @model name="forced"
	 * @generated
	 * @ordered
	 */
	public static final int FORCED_VALUE = 4;

	/**
	 * An array of all the '<em><b>SGr Power Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrPowerSourceType[] VALUES_ARRAY =
		new SGrPowerSourceType[] {
			UNKNOWN,
			MAINS1_PHASE,
			MAINS3_PHASE,
			BATTERY,
			FORCED,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Power Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrPowerSourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Power Source Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrPowerSourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrPowerSourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Power Source Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrPowerSourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrPowerSourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Power Source Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrPowerSourceType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case MAINS1_PHASE_VALUE: return MAINS1_PHASE;
			case MAINS3_PHASE_VALUE: return MAINS3_PHASE;
			case BATTERY_VALUE: return BATTERY;
			case FORCED_VALUE: return FORCED;
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
	private SGrPowerSourceType(int value, String name, String literal) {
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
	
} //SGrPowerSourceType
