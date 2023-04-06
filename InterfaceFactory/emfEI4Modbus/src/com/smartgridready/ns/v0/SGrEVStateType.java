/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr EV State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0012 IEC EVSE_61851_State  for Wallbox
 *       A: standby, 
 *       B: vehicle detected, 
 *       C: ready (charging), 
 *       D: with ventilation, 
 *       E: no power (shut off), 
 *       F: error
 * 	 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrEVStateType()
 * @model extendedMetaData="name='SGrEVStateType'"
 * @generated
 */
public enum SGrEVStateType implements Enumerator {
	/**
	 * The '<em><b>EVSTATENULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSTATENULL_VALUE
	 * @generated
	 * @ordered
	 */
	EVSTATENULL(0, "EVSTATENULL", "EV_STATE_NULL"),

	/**
	 * The '<em><b>EVSTANDBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSTANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	EVSTANDBY(1, "EVSTANDBY", "EV_STANDBY"),

	/**
	 * The '<em><b>EVDETECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVDETECTED_VALUE
	 * @generated
	 * @ordered
	 */
	EVDETECTED(2, "EVDETECTED", "EV_DETECTED"),

	/**
	 * The '<em><b>EVREADY4CHARGING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVREADY4CHARGING_VALUE
	 * @generated
	 * @ordered
	 */
	EVREADY4CHARGING(3, "EVREADY4CHARGING", "EV_READY4CHARGING"),

	/**
	 * The '<em><b>EVWITHFAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVWITHFAN_VALUE
	 * @generated
	 * @ordered
	 */
	EVWITHFAN(4, "EVWITHFAN", "EV_WITHFAN"),

	/**
	 * The '<em><b>EVSHUTOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSHUTOFF_VALUE
	 * @generated
	 * @ordered
	 */
	EVSHUTOFF(5, "EVSHUTOFF", "EV_SHUTOFF"),

	/**
	 * The '<em><b>EVERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERROR_VALUE
	 * @generated
	 * @ordered
	 */
	EVERROR(6, "EVERROR", "EV_ERROR");

	/**
	 * The '<em><b>EVSTATENULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSTATENULL
	 * @model literal="EV_STATE_NULL"
	 * @generated
	 * @ordered
	 */
	public static final int EVSTATENULL_VALUE = 0;

	/**
	 * The '<em><b>EVSTANDBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSTANDBY
	 * @model literal="EV_STANDBY"
	 * @generated
	 * @ordered
	 */
	public static final int EVSTANDBY_VALUE = 1;

	/**
	 * The '<em><b>EVDETECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVDETECTED
	 * @model literal="EV_DETECTED"
	 * @generated
	 * @ordered
	 */
	public static final int EVDETECTED_VALUE = 2;

	/**
	 * The '<em><b>EVREADY4CHARGING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVREADY4CHARGING
	 * @model literal="EV_READY4CHARGING"
	 * @generated
	 * @ordered
	 */
	public static final int EVREADY4CHARGING_VALUE = 3;

	/**
	 * The '<em><b>EVWITHFAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVWITHFAN
	 * @model literal="EV_WITHFAN"
	 * @generated
	 * @ordered
	 */
	public static final int EVWITHFAN_VALUE = 4;

	/**
	 * The '<em><b>EVSHUTOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSHUTOFF
	 * @model literal="EV_SHUTOFF"
	 * @generated
	 * @ordered
	 */
	public static final int EVSHUTOFF_VALUE = 5;

	/**
	 * The '<em><b>EVERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERROR
	 * @model literal="EV_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int EVERROR_VALUE = 6;

	/**
	 * An array of all the '<em><b>SGr EV State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrEVStateType[] VALUES_ARRAY =
		new SGrEVStateType[] {
			EVSTATENULL,
			EVSTANDBY,
			EVDETECTED,
			EVREADY4CHARGING,
			EVWITHFAN,
			EVSHUTOFF,
			EVERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr EV State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrEVStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr EV State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrEVStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrEVStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr EV State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrEVStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrEVStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr EV State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrEVStateType get(int value) {
		switch (value) {
			case EVSTATENULL_VALUE: return EVSTATENULL;
			case EVSTANDBY_VALUE: return EVSTANDBY;
			case EVDETECTED_VALUE: return EVDETECTED;
			case EVREADY4CHARGING_VALUE: return EVREADY4CHARGING;
			case EVWITHFAN_VALUE: return EVWITHFAN;
			case EVSHUTOFF_VALUE: return EVSHUTOFF;
			case EVERROR_VALUE: return EVERROR;
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
	private SGrEVStateType(int value, String name, String literal) {
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
	
} //SGrEVStateType
