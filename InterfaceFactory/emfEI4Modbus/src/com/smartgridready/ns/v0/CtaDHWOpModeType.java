/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cta DHW Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0019:
 *      Basic operation type of CTA Domestic Hot Water Heat Pump operation mode
 *       	ON OFF Push  temporary-off emergency-op      
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getCtaDHWOpModeType()
 * @model extendedMetaData="name='ctaDHWOpModeType'"
 * @generated
 */
public enum CtaDHWOpModeType implements Enumerator {
	/**
	 * The '<em><b>DHWUNDEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWUNDEF_VALUE
	 * @generated
	 * @ordered
	 */
	DHWUNDEF(0, "DHWUNDEF", "DHW_UNDEF"),

	/**
	 * The '<em><b>DHWON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWON_VALUE
	 * @generated
	 * @ordered
	 */
	DHWON(1, "DHWON", "DHW_ON"),

	/**
	 * The '<em><b>DHWOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWOFF_VALUE
	 * @generated
	 * @ordered
	 */
	DHWOFF(2, "DHWOFF", "DHW_OFF"),

	/**
	 * The '<em><b>DHWPUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWPUSH_VALUE
	 * @generated
	 * @ordered
	 */
	DHWPUSH(3, "DHWPUSH", "DHW_PUSH"),

	/**
	 * The '<em><b>DHWTMPOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWTMPOFF_VALUE
	 * @generated
	 * @ordered
	 */
	DHWTMPOFF(4, "DHWTMPOFF", "DHW_TMP_OFF"),

	/**
	 * The '<em><b>DHWEMERGENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWEMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	DHWEMERGENCY(5, "DHWEMERGENCY", "DHW_EMERGENCY");

	/**
	 * The '<em><b>DHWUNDEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWUNDEF
	 * @model literal="DHW_UNDEF"
	 * @generated
	 * @ordered
	 */
	public static final int DHWUNDEF_VALUE = 0;

	/**
	 * The '<em><b>DHWON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWON
	 * @model literal="DHW_ON"
	 * @generated
	 * @ordered
	 */
	public static final int DHWON_VALUE = 1;

	/**
	 * The '<em><b>DHWOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWOFF
	 * @model literal="DHW_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int DHWOFF_VALUE = 2;

	/**
	 * The '<em><b>DHWPUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWPUSH
	 * @model literal="DHW_PUSH"
	 * @generated
	 * @ordered
	 */
	public static final int DHWPUSH_VALUE = 3;

	/**
	 * The '<em><b>DHWTMPOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWTMPOFF
	 * @model literal="DHW_TMP_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int DHWTMPOFF_VALUE = 4;

	/**
	 * The '<em><b>DHWEMERGENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWEMERGENCY
	 * @model literal="DHW_EMERGENCY"
	 * @generated
	 * @ordered
	 */
	public static final int DHWEMERGENCY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Cta DHW Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CtaDHWOpModeType[] VALUES_ARRAY =
		new CtaDHWOpModeType[] {
			DHWUNDEF,
			DHWON,
			DHWOFF,
			DHWPUSH,
			DHWTMPOFF,
			DHWEMERGENCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cta DHW Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CtaDHWOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cta DHW Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaDHWOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaDHWOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta DHW Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaDHWOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaDHWOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta DHW Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaDHWOpModeType get(int value) {
		switch (value) {
			case DHWUNDEF_VALUE: return DHWUNDEF;
			case DHWON_VALUE: return DHWON;
			case DHWOFF_VALUE: return DHWOFF;
			case DHWPUSH_VALUE: return DHWPUSH;
			case DHWTMPOFF_VALUE: return DHWTMPOFF;
			case DHWEMERGENCY_VALUE: return DHWEMERGENCY;
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
	private CtaDHWOpModeType(int value, String name, String literal) {
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
	
} //CtaDHWOpModeType
