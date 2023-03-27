/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sgr HC Op State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BM0004:
 *      BitRank map for HeatPump HeatCoolState
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSgrHCOpStateType()
 * @model extendedMetaData="name='sgrHCOpStateType'"
 * @generated
 */
public enum SgrHCOpStateType implements Enumerator {
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
	 * The '<em><b>HCHEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HCHEAT(1, "HCHEAT", "HC_HEAT"),

	/**
	 * The '<em><b>HCHEATCOMFORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATCOMFORT_VALUE
	 * @generated
	 * @ordered
	 */
	HCHEATCOMFORT(2, "HCHEATCOMFORT", "HC_HEAT_COMFORT"),

	/**
	 * The '<em><b>HCHEATECO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATECO_VALUE
	 * @generated
	 * @ordered
	 */
	HCHEATECO(3, "HCHEATECO", "HC_HEAT_ECO"),

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
	 * The '<em><b>HCINTESIVIED5 0p</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCINTESIVIED5_0P_VALUE
	 * @generated
	 * @ordered
	 */
	HCINTESIVIED5_0P(5, "HCINTESIVIED50p", "HC_INTESIVIED_50p"),

	/**
	 * The '<em><b>HCREDUCED5 0p</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCREDUCED5_0P_VALUE
	 * @generated
	 * @ordered
	 */
	HCREDUCED5_0P(6, "HCREDUCED50p", "HC_REDUCED_50p"),

	/**
	 * The '<em><b>HCHOLIDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHOLIDAY_VALUE
	 * @generated
	 * @ordered
	 */
	HCHOLIDAY(7, "HCHOLIDAY", "HC_HOLIDAY"),

	/**
	 * The '<em><b>HCPARTYHEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYHEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HCPARTYHEAT(8, "HCPARTYHEAT", "HC_PARTY_HEAT"),

	/**
	 * The '<em><b>HCCOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOL_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOOL(9, "HCCOOL", "HC_COOL"),

	/**
	 * The '<em><b>HCCOOLCOMFORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLCOMFORT_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOOLCOMFORT(10, "HCCOOLCOMFORT", "HC_COOL_COMFORT"),

	/**
	 * The '<em><b>HCCOOLECO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLECO_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOOLECO(11, "HCCOOLECO", "HC_COOL_ECO"),

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
	 * The '<em><b>HCMANUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	HCMANUAL(13, "HCMANUAL", "HC_MANUAL"),

	/**
	 * The '<em><b>HCPROTCOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPROTCOOL_VALUE
	 * @generated
	 * @ordered
	 */
	HCPROTCOOL(14, "HCPROTCOOL", "HC_PROT_COOL"),

	/**
	 * The '<em><b>HCPARTYCOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYCOOL_VALUE
	 * @generated
	 * @ordered
	 */
	HCPARTYCOOL(15, "HCPARTYCOOL", "HC_PARTY_COOL"),

	/**
	 * The '<em><b>HCDRYINGHEATUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGHEATUP_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYINGHEATUP(16, "HCDRYINGHEATUP", "HC_DRYING_HEAT_UP"),

	/**
	 * The '<em><b>HCDRYINGSTATIONARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGSTATIONARY_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYINGSTATIONARY(17, "HCDRYINGSTATIONARY", "HC_DRYING_STATIONARY"),

	/**
	 * The '<em><b>HCDRYINGCOOLDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGCOOLDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYINGCOOLDOWN(18, "HCDRYINGCOOLDOWN", "HC_DRYING_COOL_DOWN"),

	/**
	 * The '<em><b>HCDRYINGFINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGFINAL_VALUE
	 * @generated
	 * @ordered
	 */
	HCDRYINGFINAL(19, "HCDRYINGFINAL", "HC_DRYING_FINAL"),

	/**
	 * The '<em><b>HCCOOLEXTERNALCMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLEXTERNALCMD_VALUE
	 * @generated
	 * @ordered
	 */
	HCCOOLEXTERNALCMD(20, "HCCOOLEXTERNALCMD", "HC_COOL_EXTERNAL_CMD"),

	/**
	 * The '<em><b>HCHEATEXTERNALCMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATEXTERNALCMD_VALUE
	 * @generated
	 * @ordered
	 */
	HCHEATEXTERNALCMD(21, "HCHEATEXTERNALCMD", "HC_HEAT_EXTERNAL_CMD"),

	/**
	 * The '<em><b>HCSGRIDINTENSIVIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCSGRIDINTENSIVIED_VALUE
	 * @generated
	 * @ordered
	 */
	HCSGRIDINTENSIVIED(22, "HCSGRIDINTENSIVIED", "HC_SGRID_INTENSIVIED");

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
	 * The '<em><b>HCHEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEAT
	 * @model literal="HC_HEAT"
	 * @generated
	 * @ordered
	 */
	public static final int HCHEAT_VALUE = 1;

	/**
	 * The '<em><b>HCHEATCOMFORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATCOMFORT
	 * @model literal="HC_HEAT_COMFORT"
	 * @generated
	 * @ordered
	 */
	public static final int HCHEATCOMFORT_VALUE = 2;

	/**
	 * The '<em><b>HCHEATECO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATECO
	 * @model literal="HC_HEAT_ECO"
	 * @generated
	 * @ordered
	 */
	public static final int HCHEATECO_VALUE = 3;

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
	 * The '<em><b>HCINTESIVIED5 0p</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCINTESIVIED5_0P
	 * @model name="HCINTESIVIED50p" literal="HC_INTESIVIED_50p"
	 * @generated
	 * @ordered
	 */
	public static final int HCINTESIVIED5_0P_VALUE = 5;

	/**
	 * The '<em><b>HCREDUCED5 0p</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCREDUCED5_0P
	 * @model name="HCREDUCED50p" literal="HC_REDUCED_50p"
	 * @generated
	 * @ordered
	 */
	public static final int HCREDUCED5_0P_VALUE = 6;

	/**
	 * The '<em><b>HCHOLIDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHOLIDAY
	 * @model literal="HC_HOLIDAY"
	 * @generated
	 * @ordered
	 */
	public static final int HCHOLIDAY_VALUE = 7;

	/**
	 * The '<em><b>HCPARTYHEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYHEAT
	 * @model literal="HC_PARTY_HEAT"
	 * @generated
	 * @ordered
	 */
	public static final int HCPARTYHEAT_VALUE = 8;

	/**
	 * The '<em><b>HCCOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOL
	 * @model literal="HC_COOL"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOOL_VALUE = 9;

	/**
	 * The '<em><b>HCCOOLCOMFORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLCOMFORT
	 * @model literal="HC_COOL_COMFORT"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOOLCOMFORT_VALUE = 10;

	/**
	 * The '<em><b>HCCOOLECO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLECO
	 * @model literal="HC_COOL_ECO"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOOLECO_VALUE = 11;

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
	 * The '<em><b>HCMANUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCMANUAL
	 * @model literal="HC_MANUAL"
	 * @generated
	 * @ordered
	 */
	public static final int HCMANUAL_VALUE = 13;

	/**
	 * The '<em><b>HCPROTCOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPROTCOOL
	 * @model literal="HC_PROT_COOL"
	 * @generated
	 * @ordered
	 */
	public static final int HCPROTCOOL_VALUE = 14;

	/**
	 * The '<em><b>HCPARTYCOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCPARTYCOOL
	 * @model literal="HC_PARTY_COOL"
	 * @generated
	 * @ordered
	 */
	public static final int HCPARTYCOOL_VALUE = 15;

	/**
	 * The '<em><b>HCDRYINGHEATUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGHEATUP
	 * @model literal="HC_DRYING_HEAT_UP"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYINGHEATUP_VALUE = 16;

	/**
	 * The '<em><b>HCDRYINGSTATIONARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGSTATIONARY
	 * @model literal="HC_DRYING_STATIONARY"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYINGSTATIONARY_VALUE = 17;

	/**
	 * The '<em><b>HCDRYINGCOOLDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGCOOLDOWN
	 * @model literal="HC_DRYING_COOL_DOWN"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYINGCOOLDOWN_VALUE = 18;

	/**
	 * The '<em><b>HCDRYINGFINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCDRYINGFINAL
	 * @model literal="HC_DRYING_FINAL"
	 * @generated
	 * @ordered
	 */
	public static final int HCDRYINGFINAL_VALUE = 19;

	/**
	 * The '<em><b>HCCOOLEXTERNALCMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCCOOLEXTERNALCMD
	 * @model literal="HC_COOL_EXTERNAL_CMD"
	 * @generated
	 * @ordered
	 */
	public static final int HCCOOLEXTERNALCMD_VALUE = 20;

	/**
	 * The '<em><b>HCHEATEXTERNALCMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCHEATEXTERNALCMD
	 * @model literal="HC_HEAT_EXTERNAL_CMD"
	 * @generated
	 * @ordered
	 */
	public static final int HCHEATEXTERNALCMD_VALUE = 21;

	/**
	 * The '<em><b>HCSGRIDINTENSIVIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCSGRIDINTENSIVIED
	 * @model literal="HC_SGRID_INTENSIVIED"
	 * @generated
	 * @ordered
	 */
	public static final int HCSGRIDINTENSIVIED_VALUE = 22;

	/**
	 * An array of all the '<em><b>Sgr HC Op State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SgrHCOpStateType[] VALUES_ARRAY =
		new SgrHCOpStateType[] {
			HCOFF,
			HCHEAT,
			HCHEATCOMFORT,
			HCHEATECO,
			HCDEFROST,
			HCINTESIVIED5_0P,
			HCREDUCED5_0P,
			HCHOLIDAY,
			HCPARTYHEAT,
			HCCOOL,
			HCCOOLCOMFORT,
			HCCOOLECO,
			HCERROR,
			HCMANUAL,
			HCPROTCOOL,
			HCPARTYCOOL,
			HCDRYINGHEATUP,
			HCDRYINGSTATIONARY,
			HCDRYINGCOOLDOWN,
			HCDRYINGFINAL,
			HCCOOLEXTERNALCMD,
			HCHEATEXTERNALCMD,
			HCSGRIDINTENSIVIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Sgr HC Op State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SgrHCOpStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sgr HC Op State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SgrHCOpStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SgrHCOpStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sgr HC Op State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SgrHCOpStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SgrHCOpStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sgr HC Op State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SgrHCOpStateType get(int value) {
		switch (value) {
			case HCOFF_VALUE: return HCOFF;
			case HCHEAT_VALUE: return HCHEAT;
			case HCHEATCOMFORT_VALUE: return HCHEATCOMFORT;
			case HCHEATECO_VALUE: return HCHEATECO;
			case HCDEFROST_VALUE: return HCDEFROST;
			case HCINTESIVIED5_0P_VALUE: return HCINTESIVIED5_0P;
			case HCREDUCED5_0P_VALUE: return HCREDUCED5_0P;
			case HCHOLIDAY_VALUE: return HCHOLIDAY;
			case HCPARTYHEAT_VALUE: return HCPARTYHEAT;
			case HCCOOL_VALUE: return HCCOOL;
			case HCCOOLCOMFORT_VALUE: return HCCOOLCOMFORT;
			case HCCOOLECO_VALUE: return HCCOOLECO;
			case HCERROR_VALUE: return HCERROR;
			case HCMANUAL_VALUE: return HCMANUAL;
			case HCPROTCOOL_VALUE: return HCPROTCOOL;
			case HCPARTYCOOL_VALUE: return HCPARTYCOOL;
			case HCDRYINGHEATUP_VALUE: return HCDRYINGHEATUP;
			case HCDRYINGSTATIONARY_VALUE: return HCDRYINGSTATIONARY;
			case HCDRYINGCOOLDOWN_VALUE: return HCDRYINGCOOLDOWN;
			case HCDRYINGFINAL_VALUE: return HCDRYINGFINAL;
			case HCCOOLEXTERNALCMD_VALUE: return HCCOOLEXTERNALCMD;
			case HCHEATEXTERNALCMD_VALUE: return HCHEATEXTERNALCMD;
			case HCSGRIDINTENSIVIED_VALUE: return HCSGRIDINTENSIVIED;
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
	private SgrHCOpStateType(int value, String name, String literal) {
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
	
} //SgrHCOpStateType
