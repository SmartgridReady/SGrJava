/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov HC Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ehov:
 *      map for Hoval H 
 *      // #0=Standbybetrieb
 * 	 // #1=Woche 1
 * 	 // #2=Woche 2
 * 	 // #4=Konstant
 * 	 // #5=Sparbetrieb
 * 	 // #7=Handbetrieb Heizen
 * 	 // #8=Handbetrieb Kühlen
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovHCOpModeType()
 * @model extendedMetaData="name='hovHCOpModeType'"
 * @generated
 */
public enum HovHCOpModeType implements Enumerator {
	/**
	 * The '<em><b>HCSTANDBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCSTANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	HCSTANDBY(0, "HCSTANDBY", "HC_STANDBY"),

	/**
	 * The '<em><b>HCPLANW1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPLANW1_VALUE
	 * @generated
	 * @ordered
	 */
	HCPLANW1(1, "HCPLANW1", "HC_PLAN_W1"),

	/**
	 * The '<em><b>HCPLANW2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPLANW2_VALUE
	 * @generated
	 * @ordered
	 */
	HCPLANW2(2, "HCPLANW2", "HC_PLAN_W2"),

	/**
	 * The '<em><b>HCCONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	HCCONSTANT(3, "HCCONSTANT", "HC_CONSTANT"),

	/**
	 * The '<em><b>HCECO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECO_VALUE
	 * @generated
	 * @ordered
	 */
	HCECO(4, "HCECO", "HC_ECO"),

	/**
	 * The '<em><b>HCMANHEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANHEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HCMANHEAT(5, "HCMANHEAT", "HC_MAN_HEAT"),

	/**
	 * The '<em><b>HCMANCOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANCOOL_VALUE
	 * @generated
	 * @ordered
	 */
	HCMANCOOL(6, "HCMANCOOL", "HC_MAN_COOL");

	/**
	 * The '<em><b>HCSTANDBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCSTANDBY
	 * @model literal="HC_STANDBY"
	 * @generated
	 * @ordered
	 */
	public static final int HCSTANDBY_VALUE = 0;

	/**
	 * The '<em><b>HCPLANW1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPLANW1
	 * @model literal="HC_PLAN_W1"
	 * @generated
	 * @ordered
	 */
	public static final int HCPLANW1_VALUE = 1;

	/**
	 * The '<em><b>HCPLANW2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPLANW2
	 * @model literal="HC_PLAN_W2"
	 * @generated
	 * @ordered
	 */
	public static final int HCPLANW2_VALUE = 2;

	/**
	 * The '<em><b>HCCONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCONSTANT
	 * @model literal="HC_CONSTANT"
	 * @generated
	 * @ordered
	 */
	public static final int HCCONSTANT_VALUE = 3;

	/**
	 * The '<em><b>HCECO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECO
	 * @model literal="HC_ECO"
	 * @generated
	 * @ordered
	 */
	public static final int HCECO_VALUE = 4;

	/**
	 * The '<em><b>HCMANHEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANHEAT
	 * @model literal="HC_MAN_HEAT"
	 * @generated
	 * @ordered
	 */
	public static final int HCMANHEAT_VALUE = 5;

	/**
	 * The '<em><b>HCMANCOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANCOOL
	 * @model literal="HC_MAN_COOL"
	 * @generated
	 * @ordered
	 */
	public static final int HCMANCOOL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Hov HC Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovHCOpModeType[] VALUES_ARRAY =
		new HovHCOpModeType[] {
			HCSTANDBY,
			HCPLANW1,
			HCPLANW2,
			HCCONSTANT,
			HCECO,
			HCMANHEAT,
			HCMANCOOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov HC Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovHCOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov HC Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHCOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHCOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HC Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHCOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHCOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HC Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHCOpModeType get(int value) {
		switch (value) {
			case HCSTANDBY_VALUE: return HCSTANDBY;
			case HCPLANW1_VALUE: return HCPLANW1;
			case HCPLANW2_VALUE: return HCPLANW2;
			case HCCONSTANT_VALUE: return HCCONSTANT;
			case HCECO_VALUE: return HCECO;
			case HCMANHEAT_VALUE: return HCMANHEAT;
			case HCMANCOOL_VALUE: return HCMANCOOL;
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
	private HovHCOpModeType(int value, String name, String literal) {
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
	
} //HovHCOpModeType
