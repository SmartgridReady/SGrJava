/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov HP Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ehov:
 *      map for Hoval H 
 *      // #0=Wärmeerzeuger aus
 * 	 // #1=Automatikbetrieb
 * 	 // #4=Manueller Heizbetrieb
 * 	 // #5=Manueller Kühlbetrieb 
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovHPOpModeType()
 * @model extendedMetaData="name='hovHPOpModeType'"
 * @generated
 */
public enum HovHPOpModeType implements Enumerator {
	/**
	 * The '<em><b>HPOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPOFF(0, "HPOFF", "HP_OFF"),

	/**
	 * The '<em><b>HPAUTOMATIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPAUTOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	HPAUTOMATIC(1, "HPAUTOMATIC", "HP_AUTOMATIC"),

	/**
	 * The '<em><b>HPMANHEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANHEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HPMANHEAT(2, "HPMANHEAT", "HP_MAN_HEAT"),

	/**
	 * The '<em><b>HPMANCOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANCOOL_VALUE
	 * @generated
	 * @ordered
	 */
	HPMANCOOL(3, "HPMANCOOL", "HP_MAN_COOL");

	/**
	 * The '<em><b>HPOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOFF
	 * @model literal="HP_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPOFF_VALUE = 0;

	/**
	 * The '<em><b>HPAUTOMATIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPAUTOMATIC
	 * @model literal="HP_AUTOMATIC"
	 * @generated
	 * @ordered
	 */
	public static final int HPAUTOMATIC_VALUE = 1;

	/**
	 * The '<em><b>HPMANHEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANHEAT
	 * @model literal="HP_MAN_HEAT"
	 * @generated
	 * @ordered
	 */
	public static final int HPMANHEAT_VALUE = 2;

	/**
	 * The '<em><b>HPMANCOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANCOOL
	 * @model literal="HP_MAN_COOL"
	 * @generated
	 * @ordered
	 */
	public static final int HPMANCOOL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hov HP Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovHPOpModeType[] VALUES_ARRAY =
		new HovHPOpModeType[] {
			HPOFF,
			HPAUTOMATIC,
			HPMANHEAT,
			HPMANCOOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov HP Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovHPOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov HP Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHPOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHPOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HP Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHPOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHPOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HP Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHPOpModeType get(int value) {
		switch (value) {
			case HPOFF_VALUE: return HPOFF;
			case HPAUTOMATIC_VALUE: return HPAUTOMATIC;
			case HPMANHEAT_VALUE: return HPMANHEAT;
			case HPMANCOOL_VALUE: return HPMANCOOL;
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
	private HovHPOpModeType(int value, String name, String literal) {
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
	
} //HovHPOpModeType
