/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov Dom Hot Water State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ehov: 
 *      Zustand Warmwasserregelung:
 *      #0 = Abgeschaltet
 *      #1 = Normal Ladebetrieb
 *      #2 = Komfort Ladebetrieb
 *      #3 = Zwangsdrosselung (bei E-Zwang kleiner -50p)#4 = Zwangsladung  (bei E-Zwang groesser +50p)
 *      #5 = Stoerung
 *      #6 = WW-Entnahme (Entnahme von Trinkwarmwasser aktiv)
 *      #7 = Warnung
 *      #8 = Reduzierter Ladebetrieb
 *      #12 = Vorzugsbetrieb SmartGrid
 *      #13 = Abnahmezwang SmartGrid
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovDomHotWaterStateType()
 * @model extendedMetaData="name='hovDomHotWaterStateType'"
 * @generated
 */
public enum HovDomHotWaterStateType implements Enumerator {
	/**
	 * The '<em><b>DHWOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWOFF_VALUE
	 * @generated
	 * @ordered
	 */
	DHWOFF(0, "DHWOFF", "DHW_OFF"),

	/**
	 * The '<em><b>DHWCHARGING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWCHARGING_VALUE
	 * @generated
	 * @ordered
	 */
	DHWCHARGING(1, "DHWCHARGING", "DHW_CHARGING"),

	/**
	 * The '<em><b>DHWCHARGECOMF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWCHARGECOMF_VALUE
	 * @generated
	 * @ordered
	 */
	DHWCHARGECOMF(2, "DHWCHARGECOMF", "DHW_CHARGE_COMF"),

	/**
	 * The '<em><b>DHWFORCEDCURTAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWFORCEDCURTAIL_VALUE
	 * @generated
	 * @ordered
	 */
	DHWFORCEDCURTAIL(3, "DHWFORCEDCURTAIL", "DHW_FORCED_CURTAIL"),

	/**
	 * The '<em><b>DHWERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWERROR_VALUE
	 * @generated
	 * @ordered
	 */
	DHWERROR(4, "DHWERROR", "DHW_ERROR"),

	/**
	 * The '<em><b>DHWWITHDRAWING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWWITHDRAWING_VALUE
	 * @generated
	 * @ordered
	 */
	DHWWITHDRAWING(5, "DHWWITHDRAWING", "DHW_WITHDRAWING"),

	/**
	 * The '<em><b>DHWWARNINGACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWWARNINGACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DHWWARNINGACTIVE(6, "DHWWARNINGACTIVE", "DHW_WARNING_ACTIVE"),

	/**
	 * The '<em><b>DHWREDUCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWREDUCED_VALUE
	 * @generated
	 * @ordered
	 */
	DHWREDUCED(7, "DHWREDUCED", "DHW_REDUCED"),

	/**
	 * The '<em><b>DHWRES1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWRES1_VALUE
	 * @generated
	 * @ordered
	 */
	DHWRES1(8, "DHWRES1", "DHW_RES1"),

	/**
	 * The '<em><b>DHWRES2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWRES2_VALUE
	 * @generated
	 * @ordered
	 */
	DHWRES2(9, "DHWRES2", "DHW_RES2"),

	/**
	 * The '<em><b>DHWRES4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWRES4_VALUE
	 * @generated
	 * @ordered
	 */
	DHWRES4(11, "DHWRES4", "DHW_RES4"),

	/**
	 * The '<em><b>DHWINTENSIFIEDEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWINTENSIFIEDEXT_VALUE
	 * @generated
	 * @ordered
	 */
	DHWINTENSIFIEDEXT(12, "DHWINTENSIFIEDEXT", "DHW_INTENSIFIED_EXT"),

	/**
	 * The '<em><b>DHWFORCEDEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWFORCEDEXT_VALUE
	 * @generated
	 * @ordered
	 */
	DHWFORCEDEXT(13, "DHWFORCEDEXT", "DHW_FORCED_EXT");

	/**
	 * The '<em><b>DHWOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWOFF
	 * @model literal="DHW_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int DHWOFF_VALUE = 0;

	/**
	 * The '<em><b>DHWCHARGING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWCHARGING
	 * @model literal="DHW_CHARGING"
	 * @generated
	 * @ordered
	 */
	public static final int DHWCHARGING_VALUE = 1;

	/**
	 * The '<em><b>DHWCHARGECOMF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWCHARGECOMF
	 * @model literal="DHW_CHARGE_COMF"
	 * @generated
	 * @ordered
	 */
	public static final int DHWCHARGECOMF_VALUE = 2;

	/**
	 * The '<em><b>DHWFORCEDCURTAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWFORCEDCURTAIL
	 * @model literal="DHW_FORCED_CURTAIL"
	 * @generated
	 * @ordered
	 */
	public static final int DHWFORCEDCURTAIL_VALUE = 3;

	/**
	 * The '<em><b>DHWERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWERROR
	 * @model literal="DHW_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int DHWERROR_VALUE = 4;

	/**
	 * The '<em><b>DHWWITHDRAWING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWWITHDRAWING
	 * @model literal="DHW_WITHDRAWING"
	 * @generated
	 * @ordered
	 */
	public static final int DHWWITHDRAWING_VALUE = 5;

	/**
	 * The '<em><b>DHWWARNINGACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWWARNINGACTIVE
	 * @model literal="DHW_WARNING_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int DHWWARNINGACTIVE_VALUE = 6;

	/**
	 * The '<em><b>DHWREDUCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWREDUCED
	 * @model literal="DHW_REDUCED"
	 * @generated
	 * @ordered
	 */
	public static final int DHWREDUCED_VALUE = 7;

	/**
	 * The '<em><b>DHWRES1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWRES1
	 * @model literal="DHW_RES1"
	 * @generated
	 * @ordered
	 */
	public static final int DHWRES1_VALUE = 8;

	/**
	 * The '<em><b>DHWRES2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWRES2
	 * @model literal="DHW_RES2"
	 * @generated
	 * @ordered
	 */
	public static final int DHWRES2_VALUE = 9;

	/**
	 * The '<em><b>DHWRES4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWRES4
	 * @model literal="DHW_RES4"
	 * @generated
	 * @ordered
	 */
	public static final int DHWRES4_VALUE = 11;

	/**
	 * The '<em><b>DHWINTENSIFIEDEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWINTENSIFIEDEXT
	 * @model literal="DHW_INTENSIFIED_EXT"
	 * @generated
	 * @ordered
	 */
	public static final int DHWINTENSIFIEDEXT_VALUE = 12;

	/**
	 * The '<em><b>DHWFORCEDEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHWFORCEDEXT
	 * @model literal="DHW_FORCED_EXT"
	 * @generated
	 * @ordered
	 */
	public static final int DHWFORCEDEXT_VALUE = 13;

	/**
	 * An array of all the '<em><b>Hov Dom Hot Water State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovDomHotWaterStateType[] VALUES_ARRAY =
		new HovDomHotWaterStateType[] {
			DHWOFF,
			DHWCHARGING,
			DHWCHARGECOMF,
			DHWFORCEDCURTAIL,
			DHWERROR,
			DHWWITHDRAWING,
			DHWWARNINGACTIVE,
			DHWREDUCED,
			DHWRES1,
			DHWRES2,
			DHWRES4,
			DHWINTENSIFIEDEXT,
			DHWFORCEDEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov Dom Hot Water State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovDomHotWaterStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov Dom Hot Water State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovDomHotWaterStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovDomHotWaterStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov Dom Hot Water State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovDomHotWaterStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovDomHotWaterStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov Dom Hot Water State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovDomHotWaterStateType get(int value) {
		switch (value) {
			case DHWOFF_VALUE: return DHWOFF;
			case DHWCHARGING_VALUE: return DHWCHARGING;
			case DHWCHARGECOMF_VALUE: return DHWCHARGECOMF;
			case DHWFORCEDCURTAIL_VALUE: return DHWFORCEDCURTAIL;
			case DHWERROR_VALUE: return DHWERROR;
			case DHWWITHDRAWING_VALUE: return DHWWITHDRAWING;
			case DHWWARNINGACTIVE_VALUE: return DHWWARNINGACTIVE;
			case DHWREDUCED_VALUE: return DHWREDUCED;
			case DHWRES1_VALUE: return DHWRES1;
			case DHWRES2_VALUE: return DHWRES2;
			case DHWRES4_VALUE: return DHWRES4;
			case DHWINTENSIFIEDEXT_VALUE: return DHWINTENSIFIEDEXT;
			case DHWFORCEDEXT_VALUE: return DHWFORCEDEXT;
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
	private HovDomHotWaterStateType(int value, String name, String literal) {
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
	
} //HovDomHotWaterStateType
