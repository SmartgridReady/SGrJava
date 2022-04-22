/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Meas Value Tendency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0002: value trend based on timely changes, potential
 * 				values are rising, stable, falling
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrMeasValueTendencyType()
 * @model extendedMetaData="name='SGrMeasValueTendencyType'"
 * @generated
 */
public enum SGrMeasValueTendencyType implements Enumerator {
	/**
	 * The '<em><b>Rising</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISING_VALUE
	 * @generated
	 * @ordered
	 */
	RISING(0, "rising", "rising"),

	/**
	 * The '<em><b>Stable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STABLE_VALUE
	 * @generated
	 * @ordered
	 */
	STABLE(1, "stable", "stable"),

	/**
	 * The '<em><b>Falling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALLING_VALUE
	 * @generated
	 * @ordered
	 */
	FALLING(2, "falling", "falling");

	/**
	 * The '<em><b>Rising</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISING
	 * @model name="rising"
	 * @generated
	 * @ordered
	 */
	public static final int RISING_VALUE = 0;

	/**
	 * The '<em><b>Stable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STABLE
	 * @model name="stable"
	 * @generated
	 * @ordered
	 */
	public static final int STABLE_VALUE = 1;

	/**
	 * The '<em><b>Falling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALLING
	 * @model name="falling"
	 * @generated
	 * @ordered
	 */
	public static final int FALLING_VALUE = 2;

	/**
	 * An array of all the '<em><b>SGr Meas Value Tendency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrMeasValueTendencyType[] VALUES_ARRAY =
		new SGrMeasValueTendencyType[] {
			RISING,
			STABLE,
			FALLING,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Meas Value Tendency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrMeasValueTendencyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Meas Value Tendency Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrMeasValueTendencyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrMeasValueTendencyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Meas Value Tendency Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrMeasValueTendencyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrMeasValueTendencyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Meas Value Tendency Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrMeasValueTendencyType get(int value) {
		switch (value) {
			case RISING_VALUE: return RISING;
			case STABLE_VALUE: return STABLE;
			case FALLING_VALUE: return FALLING;
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
	private SGrMeasValueTendencyType(int value, String name, String literal) {
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
	
} //SGrMeasValueTendencyType
