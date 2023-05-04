/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov HP Act Buffer State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BMhov001:
 *      BitRank map for Heat Pump Buffer state 
 *      source: Hoval  (ER) means "Entladeregelung"
 *      Bit0 = keine Anforderung, AUS
 *      Bit0 = (ER) keine Anforderung (WEZ-Freigabe)
 *      Bit1 = Anforderung, Temp. tief, PLP aus (Entladeschutz)
 *      Bit2 = Anforderung, Ladung läuft
 *      Bit2 = (ER) Anforderung, Sollwert nicht erfüllt, UPE steht Richtung WEZ bzw. YPEL regelt stetig auf PEF
 *      Bit3 = Anforderung, Sollwert erfüllt, Nachlauf aktiv
 *      Bit3 = (ER) Anforderung UPE-Umschaltverzögerung, UPE/YPEL steht Richtung WEZ
 *      Bit4 = Anforderung, Sollwert erfüllt
 *      Bit4 = (ER) Anforderung, Sollwert erfüllt, UPE/YPEL steht Richtung Puffer
 *      Bit6 = Energiezwang
 *      Bit7=  Abschöpffunktion
 *      Bit8 = (ER)Vorzugsbetrieb SmartGrid
 *      Bit9 = (ER)Abnahmezwang Smart Grid
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovHPActBufferStateType()
 * @model extendedMetaData="name='hovHPActBufferStateType'"
 * @generated
 */
public enum HovHPActBufferStateType implements Enumerator {
	/**
	 * The '<em><b>HPBOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPBOFF(0, "HPBOFF", "HPB_OFF"),

	/**
	 * The '<em><b>HPBTEMPLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBTEMPLOW_VALUE
	 * @generated
	 * @ordered
	 */
	HPBTEMPLOW(1, "HPBTEMPLOW", "HPB_TEMP_LOW"),

	/**
	 * The '<em><b>HPBRUNNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBRUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	HPBRUNNING(2, "HPBRUNNING", "HPB_RUNNING"),

	/**
	 * The '<em><b>HPBRUNHOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBRUNHOLD_VALUE
	 * @generated
	 * @ordered
	 */
	HPBRUNHOLD(3, "HPBRUNHOLD", "HPB_RUN_HOLD"),

	/**
	 * The '<em><b>HPBONTARGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBONTARGET_VALUE
	 * @generated
	 * @ordered
	 */
	HPBONTARGET(4, "HPBONTARGET", "HPB_ON_TARGET"),

	/**
	 * The '<em><b>HPBRESERVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBRESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPBRESERVE(5, "HPBRESERVE", "HPB_RESERVE"),

	/**
	 * The '<em><b>HPBENERCOMPULSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBENERCOMPULSION_VALUE
	 * @generated
	 * @ordered
	 */
	HPBENERCOMPULSION(6, "HPBENERCOMPULSION", "HPB_ENER_COMPULSION"),

	/**
	 * The '<em><b>HPBSKIMMING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBSKIMMING_VALUE
	 * @generated
	 * @ordered
	 */
	HPBSKIMMING(7, "HPBSKIMMING", "HPB_SKIMMING"),

	/**
	 * The '<em><b>HPBSGRINTENSIVIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBSGRINTENSIVIED_VALUE
	 * @generated
	 * @ordered
	 */
	HPBSGRINTENSIVIED(8, "HPBSGRINTENSIVIED", "HPB_SGR_INTENSIVIED"),

	/**
	 * The '<em><b>HPBSGRFORCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBSGRFORCED_VALUE
	 * @generated
	 * @ordered
	 */
	HPBSGRFORCED(9, "HPBSGRFORCED", "HPB_SGR_FORCED_");

	/**
	 * The '<em><b>HPBOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBOFF
	 * @model literal="HPB_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPBOFF_VALUE = 0;

	/**
	 * The '<em><b>HPBTEMPLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBTEMPLOW
	 * @model literal="HPB_TEMP_LOW"
	 * @generated
	 * @ordered
	 */
	public static final int HPBTEMPLOW_VALUE = 1;

	/**
	 * The '<em><b>HPBRUNNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBRUNNING
	 * @model literal="HPB_RUNNING"
	 * @generated
	 * @ordered
	 */
	public static final int HPBRUNNING_VALUE = 2;

	/**
	 * The '<em><b>HPBRUNHOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBRUNHOLD
	 * @model literal="HPB_RUN_HOLD"
	 * @generated
	 * @ordered
	 */
	public static final int HPBRUNHOLD_VALUE = 3;

	/**
	 * The '<em><b>HPBONTARGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBONTARGET
	 * @model literal="HPB_ON_TARGET"
	 * @generated
	 * @ordered
	 */
	public static final int HPBONTARGET_VALUE = 4;

	/**
	 * The '<em><b>HPBRESERVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBRESERVE
	 * @model literal="HPB_RESERVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPBRESERVE_VALUE = 5;

	/**
	 * The '<em><b>HPBENERCOMPULSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBENERCOMPULSION
	 * @model literal="HPB_ENER_COMPULSION"
	 * @generated
	 * @ordered
	 */
	public static final int HPBENERCOMPULSION_VALUE = 6;

	/**
	 * The '<em><b>HPBSKIMMING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBSKIMMING
	 * @model literal="HPB_SKIMMING"
	 * @generated
	 * @ordered
	 */
	public static final int HPBSKIMMING_VALUE = 7;

	/**
	 * The '<em><b>HPBSGRINTENSIVIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBSGRINTENSIVIED
	 * @model literal="HPB_SGR_INTENSIVIED"
	 * @generated
	 * @ordered
	 */
	public static final int HPBSGRINTENSIVIED_VALUE = 8;

	/**
	 * The '<em><b>HPBSGRFORCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBSGRFORCED
	 * @model literal="HPB_SGR_FORCED_"
	 * @generated
	 * @ordered
	 */
	public static final int HPBSGRFORCED_VALUE = 9;

	/**
	 * An array of all the '<em><b>Hov HP Act Buffer State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovHPActBufferStateType[] VALUES_ARRAY =
		new HovHPActBufferStateType[] {
			HPBOFF,
			HPBTEMPLOW,
			HPBRUNNING,
			HPBRUNHOLD,
			HPBONTARGET,
			HPBRESERVE,
			HPBENERCOMPULSION,
			HPBSKIMMING,
			HPBSGRINTENSIVIED,
			HPBSGRFORCED,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov HP Act Buffer State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovHPActBufferStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov HP Act Buffer State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHPActBufferStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHPActBufferStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HP Act Buffer State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHPActBufferStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHPActBufferStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HP Act Buffer State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHPActBufferStateType get(int value) {
		switch (value) {
			case HPBOFF_VALUE: return HPBOFF;
			case HPBTEMPLOW_VALUE: return HPBTEMPLOW;
			case HPBRUNNING_VALUE: return HPBRUNNING;
			case HPBRUNHOLD_VALUE: return HPBRUNHOLD;
			case HPBONTARGET_VALUE: return HPBONTARGET;
			case HPBRESERVE_VALUE: return HPBRESERVE;
			case HPBENERCOMPULSION_VALUE: return HPBENERCOMPULSION;
			case HPBSKIMMING_VALUE: return HPBSKIMMING;
			case HPBSGRINTENSIVIED_VALUE: return HPBSGRINTENSIVIED;
			case HPBSGRFORCED_VALUE: return HPBSGRFORCED;
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
	private HovHPActBufferStateType(int value, String name, String literal) {
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
	
} //HovHPActBufferStateType
