/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Meas Value Source Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0003
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrMeasValueSourceType()
 * @model extendedMetaData="name='SGrMeasValueSourceType'"
 * @generated
 */
public enum SGrMeasValueSourceType implements Enumerator {
	/**
	 * The '<em><b>Measured Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURED_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURED_VALUE(0, "measuredValue", "measuredValue"),

	/**
	 * The '<em><b>Calculated Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATED_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CALCULATED_VALUE(1, "calculatedValue", "calculatedValue"),

	/**
	 * The '<em><b>Empirical Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPIRICAL_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	EMPIRICAL_VALUE(2, "empiricalValue", "empiricalValue");

	/**
	 * The '<em><b>Measured Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURED_VALUE
	 * @model name="measuredValue"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURED_VALUE_VALUE = 0;

	/**
	 * The '<em><b>Calculated Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATED_VALUE
	 * @model name="calculatedValue"
	 * @generated
	 * @ordered
	 */
	public static final int CALCULATED_VALUE_VALUE = 1;

	/**
	 * The '<em><b>Empirical Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPIRICAL_VALUE
	 * @model name="empiricalValue"
	 * @generated
	 * @ordered
	 */
	public static final int EMPIRICAL_VALUE_VALUE = 2;

	/**
	 * An array of all the '<em><b>SGr Meas Value Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrMeasValueSourceType[] VALUES_ARRAY =
		new SGrMeasValueSourceType[] {
			MEASURED_VALUE,
			CALCULATED_VALUE,
			EMPIRICAL_VALUE,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Meas Value Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrMeasValueSourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Meas Value Source Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrMeasValueSourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrMeasValueSourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Meas Value Source Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrMeasValueSourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrMeasValueSourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Meas Value Source Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrMeasValueSourceType get(int value) {
		switch (value) {
			case MEASURED_VALUE_VALUE: return MEASURED_VALUE;
			case CALCULATED_VALUE_VALUE: return CALCULATED_VALUE;
			case EMPIRICAL_VALUE_VALUE: return EMPIRICAL_VALUE;
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
	private SGrMeasValueSourceType(int value, String name, String literal) {
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
	
} //SGrMeasValueSourceType
