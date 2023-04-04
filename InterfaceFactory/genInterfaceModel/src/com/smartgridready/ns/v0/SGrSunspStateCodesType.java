/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Sunsp State Codes Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  E0007 : SunspecInvStates I_STATUS_OFF,
 * 				I_STATUS_SLEEPING , I_STATUS_STARTING ,I_STATUS_MPPT ,
 * 				I_STATUS_THROTTLED, I_STATUS_SHUTING_DOWN ,I_STATUS_FAULT ,
 * 				I_STATUS_STANDBY
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrSunspStateCodesType()
 * @model extendedMetaData="name='SGrSunspStateCodesType'"
 * @generated
 */
public enum SGrSunspStateCodesType implements Enumerator {
	/**
	 * The '<em><b>ISTATUSOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSOFF_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSOFF(0, "ISTATUSOFF", "I_STATUS_OFF"),

	/**
	 * The '<em><b>ISTATUSSLEEPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSLEEPING_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSSLEEPING(1, "ISTATUSSLEEPING", "I_STATUS_SLEEPING"),

	/**
	 * The '<em><b>ISTATUSSTARTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSTARTING_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSSTARTING(2, "ISTATUSSTARTING", "I_STATUS_STARTING"),

	/**
	 * The '<em><b>ISTATUSMPPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSMPPT_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSMPPT(3, "ISTATUSMPPT", "I_STATUS_MPPT"),

	/**
	 * The '<em><b>ISTATUSTHROTTLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSTHROTTLED_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSTHROTTLED(4, "ISTATUSTHROTTLED", "I_STATUS_THROTTLED"),

	/**
	 * The '<em><b>ISTATUSSHUTINGDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSHUTINGDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSSHUTINGDOWN(5, "ISTATUSSHUTINGDOWN", "I_STATUS_SHUTING_DOWN"),

	/**
	 * The '<em><b>ISTATUSFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSFAULT(6, "ISTATUSFAULT", "I_STATUS_FAULT"),

	/**
	 * The '<em><b>ISTATUSSTANDBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSTANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	ISTATUSSTANDBY(7, "ISTATUSSTANDBY", "I_STATUS_STANDBY");

	/**
	 * The '<em><b>ISTATUSOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSOFF
	 * @model literal="I_STATUS_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSOFF_VALUE = 0;

	/**
	 * The '<em><b>ISTATUSSLEEPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSLEEPING
	 * @model literal="I_STATUS_SLEEPING"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSSLEEPING_VALUE = 1;

	/**
	 * The '<em><b>ISTATUSSTARTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSTARTING
	 * @model literal="I_STATUS_STARTING"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSSTARTING_VALUE = 2;

	/**
	 * The '<em><b>ISTATUSMPPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSMPPT
	 * @model literal="I_STATUS_MPPT"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSMPPT_VALUE = 3;

	/**
	 * The '<em><b>ISTATUSTHROTTLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSTHROTTLED
	 * @model literal="I_STATUS_THROTTLED"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSTHROTTLED_VALUE = 4;

	/**
	 * The '<em><b>ISTATUSSHUTINGDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSHUTINGDOWN
	 * @model literal="I_STATUS_SHUTING_DOWN"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSSHUTINGDOWN_VALUE = 5;

	/**
	 * The '<em><b>ISTATUSFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSFAULT
	 * @model literal="I_STATUS_FAULT"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSFAULT_VALUE = 6;

	/**
	 * The '<em><b>ISTATUSSTANDBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTATUSSTANDBY
	 * @model literal="I_STATUS_STANDBY"
	 * @generated
	 * @ordered
	 */
	public static final int ISTATUSSTANDBY_VALUE = 7;

	/**
	 * An array of all the '<em><b>SGr Sunsp State Codes Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrSunspStateCodesType[] VALUES_ARRAY =
		new SGrSunspStateCodesType[] {
			ISTATUSOFF,
			ISTATUSSLEEPING,
			ISTATUSSTARTING,
			ISTATUSMPPT,
			ISTATUSTHROTTLED,
			ISTATUSSHUTINGDOWN,
			ISTATUSFAULT,
			ISTATUSSTANDBY,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Sunsp State Codes Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrSunspStateCodesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Sunsp State Codes Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSunspStateCodesType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSunspStateCodesType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Sunsp State Codes Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSunspStateCodesType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSunspStateCodesType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Sunsp State Codes Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSunspStateCodesType get(int value) {
		switch (value) {
			case ISTATUSOFF_VALUE: return ISTATUSOFF;
			case ISTATUSSLEEPING_VALUE: return ISTATUSSLEEPING;
			case ISTATUSSTARTING_VALUE: return ISTATUSSTARTING;
			case ISTATUSMPPT_VALUE: return ISTATUSMPPT;
			case ISTATUSTHROTTLED_VALUE: return ISTATUSTHROTTLED;
			case ISTATUSSHUTINGDOWN_VALUE: return ISTATUSSHUTINGDOWN;
			case ISTATUSFAULT_VALUE: return ISTATUSFAULT;
			case ISTATUSSTANDBY_VALUE: return ISTATUSSTANDBY;
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
	private SGrSunspStateCodesType(int value, String name, String literal) {
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
	
} //SGrSunspStateCodesType
