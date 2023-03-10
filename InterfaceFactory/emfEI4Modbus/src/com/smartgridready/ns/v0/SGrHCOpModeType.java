/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr HC Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0017:
 *      Basic operation type of a heat cool valve operation mode
 *      Bereitschaft, Programm, Komfort, Eco, Warmwasser, Kühlen     
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrHCOpModeType()
 * @model extendedMetaData="name='SGrHCOpModeType'"
 * @generated
 */
public enum SGrHCOpModeType implements Enumerator {
	/**
	 * The '<em><b>HCOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HCOFF(0, "HCOFF", "HC_OFF"),

	/**
	 * The '<em><b>HCREADY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCREADY_VALUE
	 * @generated
	 * @ordered
	 */
	HCREADY(1, "HCREADY", "HC_READY"),

	/**
	 * The '<em><b>HCPROGOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPROGOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCPROGOP(2, "HCPROGOP", "HC_PROG_OP"),

	/**
	 * The '<em><b>HCCOMFORTOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOMFORTOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOMFORTOP(3, "HCCOMFORTOP", "HC_COMFORT_OP"),

	/**
	 * The '<em><b>HCECOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECOOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCECOOP(4, "HCECOOP", "HC_ECO_OP");

	/**
	 * The '<em><b>HCOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCOFF
	 * @model literal="HC_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HCOFF_VALUE = 0;

	/**
	 * The '<em><b>HCREADY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCREADY
	 * @model literal="HC_READY"
	 * @generated
	 * @ordered
	 */
	public static final int HCREADY_VALUE = 1;

	/**
	 * The '<em><b>HCPROGOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPROGOP
	 * @model literal="HC_PROG_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCPROGOP_VALUE = 2;

	/**
	 * The '<em><b>HCCOMFORTOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOMFORTOP
	 * @model literal="HC_COMFORT_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOMFORTOP_VALUE = 3;

	/**
	 * The '<em><b>HCECOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECOOP
	 * @model literal="HC_ECO_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCECOOP_VALUE = 4;

	/**
	 * An array of all the '<em><b>SGr HC Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrHCOpModeType[] VALUES_ARRAY =
		new SGrHCOpModeType[] {
			HCOFF,
			HCREADY,
			HCPROGOP,
			HCCOMFORTOP,
			HCECOOP,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr HC Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrHCOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr HC Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHCOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrHCOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr HC Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHCOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrHCOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr HC Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrHCOpModeType get(int value) {
		switch (value) {
			case HCOFF_VALUE: return HCOFF;
			case HCREADY_VALUE: return HCREADY;
			case HCPROGOP_VALUE: return HCPROGOP;
			case HCCOMFORTOP_VALUE: return HCCOMFORTOP;
			case HCECOOP_VALUE: return HCECOOP;
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
	private SGrHCOpModeType(int value, String name, String literal) {
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
	
} //SGrHCOpModeType
