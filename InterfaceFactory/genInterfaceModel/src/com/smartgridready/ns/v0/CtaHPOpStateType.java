/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cta HP Op State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BMcta001:
 *      BitRank (or enum?) map for CTA Heatpump status information
 *      Register address 2202 Size 2 (int32U, Input Register)
 * #1 =   Stand by
 * #2 =   Alarm Aus
 * #3 =   Ext. aus
 * #4 =   Aus Zeitlimite
 * #5 =   Aus Gesperrt (EW-Sperre)
 * #6 =   Manuell Aus
 * #7 =   Manueller Betrieb
 * #8 =   Startphase
 * #9 =   Stopp Phase
 * #10 = Sicherh. Abschaltung
 * #11 = Start Abtauphase
 * #12 = Abtauphase
 * #13 = Ende Abtauphase
 * #14 = Gesperrt Druckd. Bei Start
 * #15 = Kühlbetrieb aktiv
 * #16 = Heizbetrieb aktiv
 * #17 = Start nach VD Startfehler
 * #18 = Aus Begrenzung aktiv
 * #19 = Ol Rückführung aktiv     
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getCtaHPOpStateType()
 * @model extendedMetaData="name='ctaHPOpStateType'"
 * @generated
 */
public enum CtaHPOpStateType implements Enumerator {
	/**
	 * The '<em><b>HPNUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPNUL_VALUE
	 * @generated
	 * @ordered
	 */
	HPNUL(0, "HPNUL", "HP_NUL"),

	/**
	 * The '<em><b>HPSTANDBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	HPSTANDBY(1, "HPSTANDBY", "HP_STANDBY"),

	/**
	 * The '<em><b>HPALARMOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPALARMOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPALARMOFF(2, "HPALARMOFF", "HP_ALARM_OFF"),

	/**
	 * The '<em><b>HPEXTERNALOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEXTERNALOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPEXTERNALOFF(3, "HPEXTERNALOFF", "HP_EXTERNAL_OFF"),

	/**
	 * The '<em><b>HPTIMEOUTOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPTIMEOUTOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPTIMEOUTOFF(4, "HPTIMEOUTOFF", "HP_TIMEOUT_OFF"),

	/**
	 * The '<em><b>HPDSOOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDSOOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPDSOOFF(5, "HPDSOOFF", "HP_DSO_OFF"),

	/**
	 * The '<em><b>HPMANUALOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANUALOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPMANUALOFF(6, "HPMANUALOFF", "HP_MANUAL_OFF"),

	/**
	 * The '<em><b>HPMANUALOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANUALOP_VALUE
	 * @generated
	 * @ordered
	 */
	HPMANUALOP(7, "HPMANUALOP", "HP_MANUAL_OP"),

	/**
	 * The '<em><b>HPSTARTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTARTING_VALUE
	 * @generated
	 * @ordered
	 */
	HPSTARTING(8, "HPSTARTING", "HP_STARTING"),

	/**
	 * The '<em><b>HPSTOPPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTOPPING_VALUE
	 * @generated
	 * @ordered
	 */
	HPSTOPPING(9, "HPSTOPPING", "HP_STOPPING"),

	/**
	 * The '<em><b>HPSECUREOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSECUREOFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPSECUREOFF(10, "HPSECUREOFF", "HP_SECURE_OFF"),

	/**
	 * The '<em><b>HPSTARTDEFROST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTARTDEFROST_VALUE
	 * @generated
	 * @ordered
	 */
	HPSTARTDEFROST(11, "HPSTARTDEFROST", "HP_START_DEFROST"),

	/**
	 * The '<em><b>HPDEFROSTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROSTING_VALUE
	 * @generated
	 * @ordered
	 */
	HPDEFROSTING(12, "HPDEFROSTING", "HP_DEFROSTING"),

	/**
	 * The '<em><b>HPDEFROSTEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROSTEND_VALUE
	 * @generated
	 * @ordered
	 */
	HPDEFROSTEND(13, "HPDEFROSTEND", "HP_DEFROST_END"),

	/**
	 * The '<em><b>HPPRESSUREDIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPPRESSUREDIFF_VALUE
	 * @generated
	 * @ordered
	 */
	HPPRESSUREDIFF(14, "HPPRESSUREDIFF", "HP_PRESSURE_DIFF"),

	/**
	 * The '<em><b>HPCOOLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOOLING_VALUE
	 * @generated
	 * @ordered
	 */
	HPCOOLING(15, "HPCOOLING", "HP_COOLING"),

	/**
	 * The '<em><b>HPHEATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPHEATING_VALUE
	 * @generated
	 * @ordered
	 */
	HPHEATING(16, "HPHEATING", "HP_HEATING"),

	/**
	 * The '<em><b>HPCOMPSTARTERR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOMPSTARTERR_VALUE
	 * @generated
	 * @ordered
	 */
	HPCOMPSTARTERR(17, "HPCOMPSTARTERR", "HP_COMP_START_ERR"),

	/**
	 * The '<em><b>HPOFFOUTOFLIMITS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOFFOUTOFLIMITS_VALUE
	 * @generated
	 * @ordered
	 */
	HPOFFOUTOFLIMITS(18, "HPOFFOUTOFLIMITS", "HP_OFF_OUT_OF_LIMITS"),

	/**
	 * The '<em><b>HPOILRECIRCULACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOILRECIRCULACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPOILRECIRCULACTIVE(19, "HPOILRECIRCULACTIVE", "HP_OIL_RECIRCUL_ACTIVE");

	/**
	 * The '<em><b>HPNUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPNUL
	 * @model literal="HP_NUL"
	 * @generated
	 * @ordered
	 */
	public static final int HPNUL_VALUE = 0;

	/**
	 * The '<em><b>HPSTANDBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTANDBY
	 * @model literal="HP_STANDBY"
	 * @generated
	 * @ordered
	 */
	public static final int HPSTANDBY_VALUE = 1;

	/**
	 * The '<em><b>HPALARMOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPALARMOFF
	 * @model literal="HP_ALARM_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPALARMOFF_VALUE = 2;

	/**
	 * The '<em><b>HPEXTERNALOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEXTERNALOFF
	 * @model literal="HP_EXTERNAL_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPEXTERNALOFF_VALUE = 3;

	/**
	 * The '<em><b>HPTIMEOUTOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPTIMEOUTOFF
	 * @model literal="HP_TIMEOUT_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPTIMEOUTOFF_VALUE = 4;

	/**
	 * The '<em><b>HPDSOOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDSOOFF
	 * @model literal="HP_DSO_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPDSOOFF_VALUE = 5;

	/**
	 * The '<em><b>HPMANUALOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANUALOFF
	 * @model literal="HP_MANUAL_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPMANUALOFF_VALUE = 6;

	/**
	 * The '<em><b>HPMANUALOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMANUALOP
	 * @model literal="HP_MANUAL_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HPMANUALOP_VALUE = 7;

	/**
	 * The '<em><b>HPSTARTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTARTING
	 * @model literal="HP_STARTING"
	 * @generated
	 * @ordered
	 */
	public static final int HPSTARTING_VALUE = 8;

	/**
	 * The '<em><b>HPSTOPPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTOPPING
	 * @model literal="HP_STOPPING"
	 * @generated
	 * @ordered
	 */
	public static final int HPSTOPPING_VALUE = 9;

	/**
	 * The '<em><b>HPSECUREOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSECUREOFF
	 * @model literal="HP_SECURE_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPSECUREOFF_VALUE = 10;

	/**
	 * The '<em><b>HPSTARTDEFROST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPSTARTDEFROST
	 * @model literal="HP_START_DEFROST"
	 * @generated
	 * @ordered
	 */
	public static final int HPSTARTDEFROST_VALUE = 11;

	/**
	 * The '<em><b>HPDEFROSTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROSTING
	 * @model literal="HP_DEFROSTING"
	 * @generated
	 * @ordered
	 */
	public static final int HPDEFROSTING_VALUE = 12;

	/**
	 * The '<em><b>HPDEFROSTEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROSTEND
	 * @model literal="HP_DEFROST_END"
	 * @generated
	 * @ordered
	 */
	public static final int HPDEFROSTEND_VALUE = 13;

	/**
	 * The '<em><b>HPPRESSUREDIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPPRESSUREDIFF
	 * @model literal="HP_PRESSURE_DIFF"
	 * @generated
	 * @ordered
	 */
	public static final int HPPRESSUREDIFF_VALUE = 14;

	/**
	 * The '<em><b>HPCOOLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOOLING
	 * @model literal="HP_COOLING"
	 * @generated
	 * @ordered
	 */
	public static final int HPCOOLING_VALUE = 15;

	/**
	 * The '<em><b>HPHEATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPHEATING
	 * @model literal="HP_HEATING"
	 * @generated
	 * @ordered
	 */
	public static final int HPHEATING_VALUE = 16;

	/**
	 * The '<em><b>HPCOMPSTARTERR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOMPSTARTERR
	 * @model literal="HP_COMP_START_ERR"
	 * @generated
	 * @ordered
	 */
	public static final int HPCOMPSTARTERR_VALUE = 17;

	/**
	 * The '<em><b>HPOFFOUTOFLIMITS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOFFOUTOFLIMITS
	 * @model literal="HP_OFF_OUT_OF_LIMITS"
	 * @generated
	 * @ordered
	 */
	public static final int HPOFFOUTOFLIMITS_VALUE = 18;

	/**
	 * The '<em><b>HPOILRECIRCULACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOILRECIRCULACTIVE
	 * @model literal="HP_OIL_RECIRCUL_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPOILRECIRCULACTIVE_VALUE = 19;

	/**
	 * An array of all the '<em><b>Cta HP Op State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CtaHPOpStateType[] VALUES_ARRAY =
		new CtaHPOpStateType[] {
			HPNUL,
			HPSTANDBY,
			HPALARMOFF,
			HPEXTERNALOFF,
			HPTIMEOUTOFF,
			HPDSOOFF,
			HPMANUALOFF,
			HPMANUALOP,
			HPSTARTING,
			HPSTOPPING,
			HPSECUREOFF,
			HPSTARTDEFROST,
			HPDEFROSTING,
			HPDEFROSTEND,
			HPPRESSUREDIFF,
			HPCOOLING,
			HPHEATING,
			HPCOMPSTARTERR,
			HPOFFOUTOFLIMITS,
			HPOILRECIRCULACTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Cta HP Op State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CtaHPOpStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cta HP Op State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHPOpStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaHPOpStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta HP Op State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHPOpStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaHPOpStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta HP Op State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHPOpStateType get(int value) {
		switch (value) {
			case HPNUL_VALUE: return HPNUL;
			case HPSTANDBY_VALUE: return HPSTANDBY;
			case HPALARMOFF_VALUE: return HPALARMOFF;
			case HPEXTERNALOFF_VALUE: return HPEXTERNALOFF;
			case HPTIMEOUTOFF_VALUE: return HPTIMEOUTOFF;
			case HPDSOOFF_VALUE: return HPDSOOFF;
			case HPMANUALOFF_VALUE: return HPMANUALOFF;
			case HPMANUALOP_VALUE: return HPMANUALOP;
			case HPSTARTING_VALUE: return HPSTARTING;
			case HPSTOPPING_VALUE: return HPSTOPPING;
			case HPSECUREOFF_VALUE: return HPSECUREOFF;
			case HPSTARTDEFROST_VALUE: return HPSTARTDEFROST;
			case HPDEFROSTING_VALUE: return HPDEFROSTING;
			case HPDEFROSTEND_VALUE: return HPDEFROSTEND;
			case HPPRESSUREDIFF_VALUE: return HPPRESSUREDIFF;
			case HPCOOLING_VALUE: return HPCOOLING;
			case HPHEATING_VALUE: return HPHEATING;
			case HPCOMPSTARTERR_VALUE: return HPCOMPSTARTERR;
			case HPOFFOUTOFLIMITS_VALUE: return HPOFFOUTOFLIMITS;
			case HPOILRECIRCULACTIVE_VALUE: return HPOILRECIRCULACTIVE;
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
	private CtaHPOpStateType(int value, String name, String literal) {
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
	
} //CtaHPOpStateType
