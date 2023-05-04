/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov HC Op State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ehov: 
 *      Zustand Heizkreisregelung
 * #0 = Abgeschaltet
 * #1 = Normal Heizbetrieb
 * #2 = Komfort Heizbetrieb
 * #3 = Spar Heizbetrieb
 * #4 = Frostbetrieb
 * #5 = Zwangsabnahme (bei Zwang groesser +50p)
 * #6 = Zwangsdrosselung  (bei Zwang kleiner -50p)
 * #7 = Ferienbetrieb
 * #8 = Partybetrieb
 * #9 = Normal Kuehlbetrieb
 * #10 = Komfort K?hlbetrieb
 * #11 = Spar Kuehlbetrieb
 * #12 = Stoerung
 * #13 = Handbetrieb
 * #14 = Schutz Kuehlbetrieb
 * #15 = Partybetrieb Kuehlen
 * #16 = Austrocknung Aufheizphase
 * #17 = Austrocknung Stationaerphase
 * #18 = Austrocknung Abkuehlphase
 * #19 = Austrocknung Endphase
 * #22 = Kuehlbetrieb Extern/Konstantanforderung
 * #23 = Heizbetrieb Extern/Konstantanforderung
 * #26 = Vorzugsbetrieb SmartGrid
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovHCOpStateType()
 * @model extendedMetaData="name='hovHCOpStateType'"
 * @generated
 */
public enum HovHCOpStateType implements Enumerator {
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
	 * The '<em><b>HCNORMALHEATOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCNORMALHEATOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCNORMALHEATOP(1, "HCNORMALHEATOP", "HC_NORMAL_HEAT_OP"),

	/**
	 * The '<em><b>HCCOMFORTHEATOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOMFORTHEATOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOMFORTHEATOP(2, "HCCOMFORTHEATOP", "HC_COMFORT_HEAT_OP"),

	/**
	 * The '<em><b>HCECOHEATOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECOHEATOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCECOHEATOP(3, "HCECOHEATOP", "HC_ECO_HEAT_OP"),

	/**
	 * The '<em><b>HCDEFROST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDEFROST_VALUE
	 * @generated
	 * @ordered
	 */
	HCDEFROST(4, "HCDEFROST", "HC_DEFROST"),

	/**
	 * The '<em><b>HCFORCEDOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCFORCEDOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCFORCEDOP(5, "HCFORCEDOP", "HC_FORCED_OP"),

	/**
	 * The '<em><b>HCFORCECURTAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCFORCECURTAIL_VALUE
	 * @generated
	 * @ordered
	 */
	HCFORCECURTAIL(6, "HCFORCECURTAIL", "HC_FORCE_CURTAIL"),

	/**
	 * The '<em><b>HCVACATIONOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCVACATIONOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCVACATIONOP(7, "HCVACATIONOP", "HC_VACATION_OP"),

	/**
	 * The '<em><b>HCPARTYOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCPARTYOP(8, "HCPARTYOP", "HC_PARTY_OP"),

	/**
	 * The '<em><b>HCNORMALCOOLOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCNORMALCOOLOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCNORMALCOOLOP(9, "HCNORMALCOOLOP", "HC_NORMAL_COOL_OP"),

	/**
	 * The '<em><b>HCCOMFORTCOOLOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOMFORTCOOLOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOMFORTCOOLOP(10, "HCCOMFORTCOOLOP", "HC_COMFORT_COOL_OP"),

	/**
	 * The '<em><b>HCECOCOOLOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECOCOOLOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCECOCOOLOP(11, "HCECOCOOLOP", "HC_ECO_COOL_OP"),

	/**
	 * The '<em><b>HCERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCERROR_VALUE
	 * @generated
	 * @ordered
	 */
	HCERROR(12, "HCERROR", "HC_ERROR"),

	/**
	 * The '<em><b>HCMANUALOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANUALOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCMANUALOP(13, "HCMANUALOP", "HC_MANUAL_OP"),

	/**
	 * The '<em><b>HCCOOLPROT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLPROT_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOOLPROT(14, "HCCOOLPROT", "HC_COOL_PROT"),

	/**
	 * The '<em><b>HCPARTYCOOLOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYCOOLOP_VALUE
	 * @generated
	 * @ordered
	 */
	HCPARTYCOOLOP(15, "HCPARTYCOOLOP", "HC_PARTY_COOL_OP"),

	/**
	 * The '<em><b>HCDRYHEATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYHEATING_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYHEATING(16, "HCDRYHEATING", "HC_DRY_HEATING"),

	/**
	 * The '<em><b>HCDRYSTATIONARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYSTATIONARY_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYSTATIONARY(17, "HCDRYSTATIONARY", "HC_DRY_STATIONARY"),

	/**
	 * The '<em><b>HCDRYCOOLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYCOOLING_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYCOOLING(18, "HCDRYCOOLING", "HC_DRY_COOLING"),

	/**
	 * The '<em><b>HCDRYFINALIZING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYFINALIZING_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYFINALIZING(19, "HCDRYFINALIZING", "HC_DRY_FINALIZING"),

	/**
	 * The '<em><b>HCRES1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCRES1_VALUE
	 * @generated
	 * @ordered
	 */
	HCRES1(20, "HCRES1", "HC_RES1"),

	/**
	 * The '<em><b>HCRES2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCRES2_VALUE
	 * @generated
	 * @ordered
	 */
	HCRES2(21, "HCRES2", "HC_RES2"),

	/**
	 * The '<em><b>HCCOOLINGEXTCMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLINGEXTCMD_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOOLINGEXTCMD(22, "HCCOOLINGEXTCMD", "HC_COOLING_EXT_CMD"),

	/**
	 * The '<em><b>HCHEATINGEXTCMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATINGEXTCMD_VALUE
	 * @generated
	 * @ordered
	 */
	HCHEATINGEXTCMD(23, "HCHEATINGEXTCMD", "HC_HEATING_EXT_CMD"),

	/**
	 * The '<em><b>HCINTENSIFIEDEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCINTENSIFIEDEXT_VALUE
	 * @generated
	 * @ordered
	 */
	HCINTENSIFIEDEXT(24, "HCINTENSIFIEDEXT", "HC_INTENSIFIED_EXT");

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
	 * The '<em><b>HCNORMALHEATOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCNORMALHEATOP
	 * @model literal="HC_NORMAL_HEAT_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCNORMALHEATOP_VALUE = 1;

	/**
	 * The '<em><b>HCCOMFORTHEATOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOMFORTHEATOP
	 * @model literal="HC_COMFORT_HEAT_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOMFORTHEATOP_VALUE = 2;

	/**
	 * The '<em><b>HCECOHEATOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECOHEATOP
	 * @model literal="HC_ECO_HEAT_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCECOHEATOP_VALUE = 3;

	/**
	 * The '<em><b>HCDEFROST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDEFROST
	 * @model literal="HC_DEFROST"
	 * @generated
	 * @ordered
	 */
	public static final int HCDEFROST_VALUE = 4;

	/**
	 * The '<em><b>HCFORCEDOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCFORCEDOP
	 * @model literal="HC_FORCED_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCFORCEDOP_VALUE = 5;

	/**
	 * The '<em><b>HCFORCECURTAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCFORCECURTAIL
	 * @model literal="HC_FORCE_CURTAIL"
	 * @generated
	 * @ordered
	 */
	public static final int HCFORCECURTAIL_VALUE = 6;

	/**
	 * The '<em><b>HCVACATIONOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCVACATIONOP
	 * @model literal="HC_VACATION_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCVACATIONOP_VALUE = 7;

	/**
	 * The '<em><b>HCPARTYOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYOP
	 * @model literal="HC_PARTY_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCPARTYOP_VALUE = 8;

	/**
	 * The '<em><b>HCNORMALCOOLOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCNORMALCOOLOP
	 * @model literal="HC_NORMAL_COOL_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCNORMALCOOLOP_VALUE = 9;

	/**
	 * The '<em><b>HCCOMFORTCOOLOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOMFORTCOOLOP
	 * @model literal="HC_COMFORT_COOL_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOMFORTCOOLOP_VALUE = 10;

	/**
	 * The '<em><b>HCECOCOOLOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCECOCOOLOP
	 * @model literal="HC_ECO_COOL_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCECOCOOLOP_VALUE = 11;

	/**
	 * The '<em><b>HCERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCERROR
	 * @model literal="HC_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int HCERROR_VALUE = 12;

	/**
	 * The '<em><b>HCMANUALOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANUALOP
	 * @model literal="HC_MANUAL_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCMANUALOP_VALUE = 13;

	/**
	 * The '<em><b>HCCOOLPROT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLPROT
	 * @model literal="HC_COOL_PROT"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOOLPROT_VALUE = 14;

	/**
	 * The '<em><b>HCPARTYCOOLOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYCOOLOP
	 * @model literal="HC_PARTY_COOL_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HCPARTYCOOLOP_VALUE = 15;

	/**
	 * The '<em><b>HCDRYHEATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYHEATING
	 * @model literal="HC_DRY_HEATING"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYHEATING_VALUE = 16;

	/**
	 * The '<em><b>HCDRYSTATIONARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYSTATIONARY
	 * @model literal="HC_DRY_STATIONARY"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYSTATIONARY_VALUE = 17;

	/**
	 * The '<em><b>HCDRYCOOLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYCOOLING
	 * @model literal="HC_DRY_COOLING"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYCOOLING_VALUE = 18;

	/**
	 * The '<em><b>HCDRYFINALIZING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYFINALIZING
	 * @model literal="HC_DRY_FINALIZING"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYFINALIZING_VALUE = 19;

	/**
	 * The '<em><b>HCRES1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCRES1
	 * @model literal="HC_RES1"
	 * @generated
	 * @ordered
	 */
	public static final int HCRES1_VALUE = 20;

	/**
	 * The '<em><b>HCRES2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCRES2
	 * @model literal="HC_RES2"
	 * @generated
	 * @ordered
	 */
	public static final int HCRES2_VALUE = 21;

	/**
	 * The '<em><b>HCCOOLINGEXTCMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLINGEXTCMD
	 * @model literal="HC_COOLING_EXT_CMD"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOOLINGEXTCMD_VALUE = 22;

	/**
	 * The '<em><b>HCHEATINGEXTCMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATINGEXTCMD
	 * @model literal="HC_HEATING_EXT_CMD"
	 * @generated
	 * @ordered
	 */
	public static final int HCHEATINGEXTCMD_VALUE = 23;

	/**
	 * The '<em><b>HCINTENSIFIEDEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCINTENSIFIEDEXT
	 * @model literal="HC_INTENSIFIED_EXT"
	 * @generated
	 * @ordered
	 */
	public static final int HCINTENSIFIEDEXT_VALUE = 24;

	/**
	 * An array of all the '<em><b>Hov HC Op State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovHCOpStateType[] VALUES_ARRAY =
		new HovHCOpStateType[] {
			HCOFF,
			HCNORMALHEATOP,
			HCCOMFORTHEATOP,
			HCECOHEATOP,
			HCDEFROST,
			HCFORCEDOP,
			HCFORCECURTAIL,
			HCVACATIONOP,
			HCPARTYOP,
			HCNORMALCOOLOP,
			HCCOMFORTCOOLOP,
			HCECOCOOLOP,
			HCERROR,
			HCMANUALOP,
			HCCOOLPROT,
			HCPARTYCOOLOP,
			HCDRYHEATING,
			HCDRYSTATIONARY,
			HCDRYCOOLING,
			HCDRYFINALIZING,
			HCRES1,
			HCRES2,
			HCCOOLINGEXTCMD,
			HCHEATINGEXTCMD,
			HCINTENSIFIEDEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov HC Op State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovHCOpStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov HC Op State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHCOpStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHCOpStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HC Op State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHCOpStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovHCOpStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov HC Op State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovHCOpStateType get(int value) {
		switch (value) {
			case HCOFF_VALUE: return HCOFF;
			case HCNORMALHEATOP_VALUE: return HCNORMALHEATOP;
			case HCCOMFORTHEATOP_VALUE: return HCCOMFORTHEATOP;
			case HCECOHEATOP_VALUE: return HCECOHEATOP;
			case HCDEFROST_VALUE: return HCDEFROST;
			case HCFORCEDOP_VALUE: return HCFORCEDOP;
			case HCFORCECURTAIL_VALUE: return HCFORCECURTAIL;
			case HCVACATIONOP_VALUE: return HCVACATIONOP;
			case HCPARTYOP_VALUE: return HCPARTYOP;
			case HCNORMALCOOLOP_VALUE: return HCNORMALCOOLOP;
			case HCCOMFORTCOOLOP_VALUE: return HCCOMFORTCOOLOP;
			case HCECOCOOLOP_VALUE: return HCECOCOOLOP;
			case HCERROR_VALUE: return HCERROR;
			case HCMANUALOP_VALUE: return HCMANUALOP;
			case HCCOOLPROT_VALUE: return HCCOOLPROT;
			case HCPARTYCOOLOP_VALUE: return HCPARTYCOOLOP;
			case HCDRYHEATING_VALUE: return HCDRYHEATING;
			case HCDRYSTATIONARY_VALUE: return HCDRYSTATIONARY;
			case HCDRYCOOLING_VALUE: return HCDRYCOOLING;
			case HCDRYFINALIZING_VALUE: return HCDRYFINALIZING;
			case HCRES1_VALUE: return HCRES1;
			case HCRES2_VALUE: return HCRES2;
			case HCCOOLINGEXTCMD_VALUE: return HCCOOLINGEXTCMD;
			case HCHEATINGEXTCMD_VALUE: return HCHEATINGEXTCMD;
			case HCINTENSIFIEDEXT_VALUE: return HCINTENSIFIEDEXT;
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
	private HovHCOpStateType(int value, String name, String literal) {
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
	
} //HovHCOpStateType
