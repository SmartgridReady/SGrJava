/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cta HP Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ecta003:
 *      map for CTA Heatpump HeatCool modes information
 * #1 =	WP in Stand by Modus
 * #2 =	Heizbetrieb aktiv
 * #3 =	Notbetrieb Heizen aktiv
 * #4 =	TWW Ladung aktiv
 * #5 =	Notbetrieb TWW aktiv
 * #6 =	Aktivkühlbetrieb aktiv
 * #7 =	Manueller Betrieb
 * #8 =	Heizungsspeicher Ladebetrieb ein
 * #9 =	Externer Betrieb ein
 * #10 =	Verteilkreis-ohne Puffer Betrieb
 * #11 =	Abtaubetrieb aktiv
 * #12 =	Kältegeführter Betrieb (Prozesskühlen)	
 * #13 =	Reserve
 * #14 =	TWW Legio mit El. Einsatz K6 und parallel Heizungsbetrieb (Pufferladung)
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getCtaHPOpModeType()
 * @model extendedMetaData="name='ctaHPOpModeType'"
 * @generated
 */
public enum CtaHPOpModeType implements Enumerator {
	/**
	 * The '<em><b>HPNULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPNULL_VALUE
	 * @generated
	 * @ordered
	 */
	HPNULL(0, "HPNULL", "HP_NULL"),

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
	 * The '<em><b>HPHEATINGOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPHEATINGOP_VALUE
	 * @generated
	 * @ordered
	 */
	HPHEATINGOP(2, "HPHEATINGOP", "HP_HEATING_OP"),

	/**
	 * The '<em><b>HPEMERGHEATINGACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEMERGHEATINGACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPEMERGHEATINGACTIVE(3, "HPEMERGHEATINGACTIVE", "HP_EMERG_HEATING_ACTIVE"),

	/**
	 * The '<em><b>HPDOMHWACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDOMHWACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPDOMHWACTIVE(4, "HPDOMHWACTIVE", "HP_DOMHW_ACTIVE"),

	/**
	 * The '<em><b>HPOMHWEMERGACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOMHWEMERGACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPOMHWEMERGACTIVE(5, "HPOMHWEMERGACTIVE", "HP_OMHW_EMERG_ACTIVE"),

	/**
	 * The '<em><b>HPACTIVECOOLINGOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPACTIVECOOLINGOP_VALUE
	 * @generated
	 * @ordered
	 */
	HPACTIVECOOLINGOP(6, "HPACTIVECOOLINGOP", "HP_ACTIVE_COOLING_OP"),

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
	 * The '<em><b>HPBUFFERLOADACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBUFFERLOADACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPBUFFERLOADACTIVE(8, "HPBUFFERLOADACTIVE", "HP_BUFFER_LOAD_ACTIVE"),

	/**
	 * The '<em><b>HPEXTERNALCTRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEXTERNALCTRL_VALUE
	 * @generated
	 * @ordered
	 */
	HPEXTERNALCTRL(9, "HPEXTERNALCTRL", "HP_EXTERNAL_CTRL"),

	/**
	 * The '<em><b>HPDIRECTDISTRIBUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDIRECTDISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	HPDIRECTDISTRIBUTION(10, "HPDIRECTDISTRIBUTION", "HP_DIRECT_DISTRIBUTION"),

	/**
	 * The '<em><b>HPDEFROSTACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROSTACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPDEFROSTACTIVE(11, "HPDEFROSTACTIVE", "HP_DEFROST_ACTIVE"),

	/**
	 * The '<em><b>HPPASSIVECOOLINGOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPPASSIVECOOLINGOP_VALUE
	 * @generated
	 * @ordered
	 */
	HPPASSIVECOOLINGOP(12, "HPPASSIVECOOLINGOP", "HP_PASSIVE_COOLING_OP"),

	/**
	 * The '<em><b>HPRESERVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPRESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	HPRESERVE(13, "HPRESERVE", "HP_RESERVE"),

	/**
	 * The '<em><b>HPCOMBINDEDBUFFERLOADING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOMBINDEDBUFFERLOADING_VALUE
	 * @generated
	 * @ordered
	 */
	HPCOMBINDEDBUFFERLOADING(14, "HPCOMBINDEDBUFFERLOADING", "HP_COMBINDED_BUFFER_LOADING");

	/**
	 * The '<em><b>HPNULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPNULL
	 * @model literal="HP_NULL"
	 * @generated
	 * @ordered
	 */
	public static final int HPNULL_VALUE = 0;

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
	 * The '<em><b>HPHEATINGOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPHEATINGOP
	 * @model literal="HP_HEATING_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HPHEATINGOP_VALUE = 2;

	/**
	 * The '<em><b>HPEMERGHEATINGACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEMERGHEATINGACTIVE
	 * @model literal="HP_EMERG_HEATING_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPEMERGHEATINGACTIVE_VALUE = 3;

	/**
	 * The '<em><b>HPDOMHWACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDOMHWACTIVE
	 * @model literal="HP_DOMHW_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPDOMHWACTIVE_VALUE = 4;

	/**
	 * The '<em><b>HPOMHWEMERGACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOMHWEMERGACTIVE
	 * @model literal="HP_OMHW_EMERG_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPOMHWEMERGACTIVE_VALUE = 5;

	/**
	 * The '<em><b>HPACTIVECOOLINGOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPACTIVECOOLINGOP
	 * @model literal="HP_ACTIVE_COOLING_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HPACTIVECOOLINGOP_VALUE = 6;

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
	 * The '<em><b>HPBUFFERLOADACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPBUFFERLOADACTIVE
	 * @model literal="HP_BUFFER_LOAD_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPBUFFERLOADACTIVE_VALUE = 8;

	/**
	 * The '<em><b>HPEXTERNALCTRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEXTERNALCTRL
	 * @model literal="HP_EXTERNAL_CTRL"
	 * @generated
	 * @ordered
	 */
	public static final int HPEXTERNALCTRL_VALUE = 9;

	/**
	 * The '<em><b>HPDIRECTDISTRIBUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDIRECTDISTRIBUTION
	 * @model literal="HP_DIRECT_DISTRIBUTION"
	 * @generated
	 * @ordered
	 */
	public static final int HPDIRECTDISTRIBUTION_VALUE = 10;

	/**
	 * The '<em><b>HPDEFROSTACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROSTACTIVE
	 * @model literal="HP_DEFROST_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPDEFROSTACTIVE_VALUE = 11;

	/**
	 * The '<em><b>HPPASSIVECOOLINGOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPPASSIVECOOLINGOP
	 * @model literal="HP_PASSIVE_COOLING_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HPPASSIVECOOLINGOP_VALUE = 12;

	/**
	 * The '<em><b>HPRESERVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPRESERVE
	 * @model literal="HP_RESERVE"
	 * @generated
	 * @ordered
	 */
	public static final int HPRESERVE_VALUE = 13;

	/**
	 * The '<em><b>HPCOMBINDEDBUFFERLOADING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOMBINDEDBUFFERLOADING
	 * @model literal="HP_COMBINDED_BUFFER_LOADING"
	 * @generated
	 * @ordered
	 */
	public static final int HPCOMBINDEDBUFFERLOADING_VALUE = 14;

	/**
	 * An array of all the '<em><b>Cta HP Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CtaHPOpModeType[] VALUES_ARRAY =
		new CtaHPOpModeType[] {
			HPNULL,
			HPSTANDBY,
			HPHEATINGOP,
			HPEMERGHEATINGACTIVE,
			HPDOMHWACTIVE,
			HPOMHWEMERGACTIVE,
			HPACTIVECOOLINGOP,
			HPMANUALOP,
			HPBUFFERLOADACTIVE,
			HPEXTERNALCTRL,
			HPDIRECTDISTRIBUTION,
			HPDEFROSTACTIVE,
			HPPASSIVECOOLINGOP,
			HPRESERVE,
			HPCOMBINDEDBUFFERLOADING,
		};

	/**
	 * A public read-only list of all the '<em><b>Cta HP Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CtaHPOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cta HP Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHPOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaHPOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta HP Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHPOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaHPOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta HP Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHPOpModeType get(int value) {
		switch (value) {
			case HPNULL_VALUE: return HPNULL;
			case HPSTANDBY_VALUE: return HPSTANDBY;
			case HPHEATINGOP_VALUE: return HPHEATINGOP;
			case HPEMERGHEATINGACTIVE_VALUE: return HPEMERGHEATINGACTIVE;
			case HPDOMHWACTIVE_VALUE: return HPDOMHWACTIVE;
			case HPOMHWEMERGACTIVE_VALUE: return HPOMHWEMERGACTIVE;
			case HPACTIVECOOLINGOP_VALUE: return HPACTIVECOOLINGOP;
			case HPMANUALOP_VALUE: return HPMANUALOP;
			case HPBUFFERLOADACTIVE_VALUE: return HPBUFFERLOADACTIVE;
			case HPEXTERNALCTRL_VALUE: return HPEXTERNALCTRL;
			case HPDIRECTDISTRIBUTION_VALUE: return HPDIRECTDISTRIBUTION;
			case HPDEFROSTACTIVE_VALUE: return HPDEFROSTACTIVE;
			case HPPASSIVECOOLINGOP_VALUE: return HPPASSIVECOOLINGOP;
			case HPRESERVE_VALUE: return HPRESERVE;
			case HPCOMBINDEDBUFFERLOADING_VALUE: return HPCOMBINDEDBUFFERLOADING;
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
	private CtaHPOpModeType(int value, String name, String literal) {
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
	
} //CtaHPOpModeType
