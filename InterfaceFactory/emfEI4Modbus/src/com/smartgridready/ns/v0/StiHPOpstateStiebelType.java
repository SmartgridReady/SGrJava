/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sti HP Opstate Stiebel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BM0003:
 *      BitRank map for Heat Pump Stiebel-Eltron
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getStiHPOpstateStiebelType()
 * @model extendedMetaData="name='stiHPOpstateStiebelType'"
 * @generated
 */
public enum StiHPOpstateStiebelType implements Enumerator {
	/**
	 * The '<em><b>HP1PUMPON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP1PUMPON_VALUE
	 * @generated
	 * @ordered
	 */
	HP1PUMPON(0, "HP1PUMPON", "HP_1_PUMP_ON"),

	/**
	 * The '<em><b>HP2PUMPON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP2PUMPON_VALUE
	 * @generated
	 * @ordered
	 */
	HP2PUMPON(1, "HP2PUMPON", "HP_2_PUMP_ON"),

	/**
	 * The '<em><b>HEATUPPROGRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATUPPROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	HEATUPPROGRAM(2, "HEATUPPROGRAM", "HEATUP_PROGRAM"),

	/**
	 * The '<em><b>NHZSTAGESRUNNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NHZSTAGESRUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	NHZSTAGESRUNNING(3, "NHZSTAGESRUNNING", "NHZ_STAGES_RUNNING"),

	/**
	 * The '<em><b>HPINHEATINGMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINHEATINGMODE_VALUE
	 * @generated
	 * @ordered
	 */
	HPINHEATINGMODE(4, "HPINHEATINGMODE", "HP_IN_HEATING_MODE"),

	/**
	 * The '<em><b>HPINDHWMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINDHWMODE_VALUE
	 * @generated
	 * @ordered
	 */
	HPINDHWMODE(5, "HPINDHWMODE", "HP_IN_DHW_MODE"),

	/**
	 * The '<em><b>COMPRESSORRUNNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSORRUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSORRUNNING(6, "COMPRESSORRUNNING", "COMPRESSOR_RUNNING"),

	/**
	 * The '<em><b>SUMMERMODEACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMMERMODEACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SUMMERMODEACTIVE(7, "SUMMERMODEACTIVE", "SUMMER_MODE_ACTIVE"),

	/**
	 * The '<em><b>COOLINGMODEACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOLINGMODEACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COOLINGMODEACTIVE(8, "COOLINGMODEACTIVE", "COOLING_MODE_ACTIVE"),

	/**
	 * The '<em><b>MINONEIWSINDEFROSTMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINONEIWSINDEFROSTMODE_VALUE
	 * @generated
	 * @ordered
	 */
	MINONEIWSINDEFROSTMODE(9, "MINONEIWSINDEFROSTMODE", "MIN_ONE_IWS_IN_DEFROST_MODE"),

	/**
	 * The '<em><b>SILENTMODE1ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENTMODE1ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SILENTMODE1ACTIVE(10, "SILENTMODE1ACTIVE", "SILENT_MODE_1_ACTIVE"),

	/**
	 * The '<em><b>SILENTMODE2ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENTMODE2ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SILENTMODE2ACTIVE(11, "SILENTMODE2ACTIVE", "SILENT_MODE_2_ACTIVE");

	/**
	 * The '<em><b>HP1PUMPON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP1PUMPON
	 * @model literal="HP_1_PUMP_ON"
	 * @generated
	 * @ordered
	 */
	public static final int HP1PUMPON_VALUE = 0;

	/**
	 * The '<em><b>HP2PUMPON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP2PUMPON
	 * @model literal="HP_2_PUMP_ON"
	 * @generated
	 * @ordered
	 */
	public static final int HP2PUMPON_VALUE = 1;

	/**
	 * The '<em><b>HEATUPPROGRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATUPPROGRAM
	 * @model literal="HEATUP_PROGRAM"
	 * @generated
	 * @ordered
	 */
	public static final int HEATUPPROGRAM_VALUE = 2;

	/**
	 * The '<em><b>NHZSTAGESRUNNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NHZSTAGESRUNNING
	 * @model literal="NHZ_STAGES_RUNNING"
	 * @generated
	 * @ordered
	 */
	public static final int NHZSTAGESRUNNING_VALUE = 3;

	/**
	 * The '<em><b>HPINHEATINGMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINHEATINGMODE
	 * @model literal="HP_IN_HEATING_MODE"
	 * @generated
	 * @ordered
	 */
	public static final int HPINHEATINGMODE_VALUE = 4;

	/**
	 * The '<em><b>HPINDHWMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPINDHWMODE
	 * @model literal="HP_IN_DHW_MODE"
	 * @generated
	 * @ordered
	 */
	public static final int HPINDHWMODE_VALUE = 5;

	/**
	 * The '<em><b>COMPRESSORRUNNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSORRUNNING
	 * @model literal="COMPRESSOR_RUNNING"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSORRUNNING_VALUE = 6;

	/**
	 * The '<em><b>SUMMERMODEACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMMERMODEACTIVE
	 * @model literal="SUMMER_MODE_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int SUMMERMODEACTIVE_VALUE = 7;

	/**
	 * The '<em><b>COOLINGMODEACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOLINGMODEACTIVE
	 * @model literal="COOLING_MODE_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int COOLINGMODEACTIVE_VALUE = 8;

	/**
	 * The '<em><b>MINONEIWSINDEFROSTMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINONEIWSINDEFROSTMODE
	 * @model literal="MIN_ONE_IWS_IN_DEFROST_MODE"
	 * @generated
	 * @ordered
	 */
	public static final int MINONEIWSINDEFROSTMODE_VALUE = 9;

	/**
	 * The '<em><b>SILENTMODE1ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENTMODE1ACTIVE
	 * @model literal="SILENT_MODE_1_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int SILENTMODE1ACTIVE_VALUE = 10;

	/**
	 * The '<em><b>SILENTMODE2ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENTMODE2ACTIVE
	 * @model literal="SILENT_MODE_2_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int SILENTMODE2ACTIVE_VALUE = 11;

	/**
	 * An array of all the '<em><b>Sti HP Opstate Stiebel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StiHPOpstateStiebelType[] VALUES_ARRAY =
		new StiHPOpstateStiebelType[] {
			HP1PUMPON,
			HP2PUMPON,
			HEATUPPROGRAM,
			NHZSTAGESRUNNING,
			HPINHEATINGMODE,
			HPINDHWMODE,
			COMPRESSORRUNNING,
			SUMMERMODEACTIVE,
			COOLINGMODEACTIVE,
			MINONEIWSINDEFROSTMODE,
			SILENTMODE1ACTIVE,
			SILENTMODE2ACTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Sti HP Opstate Stiebel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StiHPOpstateStiebelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sti HP Opstate Stiebel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StiHPOpstateStiebelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StiHPOpstateStiebelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sti HP Opstate Stiebel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StiHPOpstateStiebelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StiHPOpstateStiebelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sti HP Opstate Stiebel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StiHPOpstateStiebelType get(int value) {
		switch (value) {
			case HP1PUMPON_VALUE: return HP1PUMPON;
			case HP2PUMPON_VALUE: return HP2PUMPON;
			case HEATUPPROGRAM_VALUE: return HEATUPPROGRAM;
			case NHZSTAGESRUNNING_VALUE: return NHZSTAGESRUNNING;
			case HPINHEATINGMODE_VALUE: return HPINHEATINGMODE;
			case HPINDHWMODE_VALUE: return HPINDHWMODE;
			case COMPRESSORRUNNING_VALUE: return COMPRESSORRUNNING;
			case SUMMERMODEACTIVE_VALUE: return SUMMERMODEACTIVE;
			case COOLINGMODEACTIVE_VALUE: return COOLINGMODEACTIVE;
			case MINONEIWSINDEFROSTMODE_VALUE: return MINONEIWSINDEFROSTMODE;
			case SILENTMODE1ACTIVE_VALUE: return SILENTMODE1ACTIVE;
			case SILENTMODE2ACTIVE_VALUE: return SILENTMODE2ACTIVE;
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
	private StiHPOpstateStiebelType(int value, String name, String literal) {
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
	
} //StiHPOpstateStiebelType
