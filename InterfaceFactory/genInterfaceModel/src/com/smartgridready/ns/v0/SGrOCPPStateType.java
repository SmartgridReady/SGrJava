/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr OCPP State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0015:
 * 	Available (0): 
 * 	  When a Connector becomes available for a new
 * 	  user (Operative)
 * 	  
 * 	Charging (1): 
 * 	  When the contactor of a Connector closes,
 * 	  allowing the vehicle to charge
 * 	(Operative)
 * 
 * 	Preparing(not yet observed ?): 
 * 	  When a Connector becomes no longer available
 * 	  for a new user but no charging session is active.
 * 	  Typically a Connector is occupied when a user
 * 	  presents a tag, inserts a cable or a vehicle
 * 	  occupies the parking bay
 * 	  (Operative)
 * 
 * 	Finishing(not yet observed ?): 
 * 	  When a charging session has stopped at a
 * 	  Connector, but the Connector is not yet available
 * 	  for a new user, e.g. the cable has not been
 * 	  removed or the vehicle has not left the parking
 * 	  bay
 * 	  (Operative)
 * 
 * 	Reserved(not yet observed ?): 
 * 	  When a Connector becomes reserved as a result of
 * 	  a Reserve Now command
 * 	  (Operative)
 * 	
 * 	Unavailable(not yet observed ?): 
 * 	  When a Connector becomes unavailable as the
 * 	  result of a Change Availability command or an
 * 	  event upon which the Charge Point transitions to
 * 	  unavailable at its discretion. Upon receipt of a
 * 	  Change Availability command, the status MAY
 * 	  change immediately or the change MAY be
 * 	  scheduled. When scheduled, the Status
 * 	  Notification shall be send when the availability
 * 	  change becomes effective
 * 	  (Inoperative)
 * 
 * 	Faulted(not yet observed ?): 
 * 	  When a Charge Point or connector has reported
 * 	  an error and is not available for energy delivery .
 * 	  (Inoperative).
 * 	
 * 	SuspendedEVSE (7): 
 * 	  When the contactor of a Connector opens upon
 * 	  request of the EVSE, e.g. due to a smart charging
 * 	  restriction or as the result of
 * 	  StartTransaction.conf indicating that charging is
 * 	  not allowed
 * 	  (Operative)
 * 
 * 	SuspendedEV(8): 
 * 	  When the EVSE is ready to deliver energy but
 * 	  contactor is open, e.g. the EV is not ready.
 * 	  (Operative)
 * 	
 * 	
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrOCPPStateType()
 * @model extendedMetaData="name='SGrOCPPStateType'"
 * @generated
 */
public enum SGrOCPPStateType implements Enumerator {
	/**
	 * The '<em><b>Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABLE(0, "Available", "Available"),

	/**
	 * The '<em><b>Charging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING(1, "Charging", "Charging"),

	/**
	 * The '<em><b>Preparing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARING_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARING(2, "Preparing", "Preparing"),

	/**
	 * The '<em><b>Finishing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHING_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHING(3, "Finishing", "Finishing"),

	/**
	 * The '<em><b>Reserved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVED(4, "Reserved", "Reserved"),

	/**
	 * The '<em><b>Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(5, "Unavailable", "Unavailable"),

	/**
	 * The '<em><b>Faulted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAULTED_VALUE
	 * @generated
	 * @ordered
	 */
	FAULTED(6, "Faulted", "Faulted"),

	/**
	 * The '<em><b>Suspended EVSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EVSE_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED_EVSE(7, "SuspendedEVSE", "SuspendedEVSE"),

	/**
	 * The '<em><b>Suspended EV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EV_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED_EV(8, "SuspendedEV", "SuspendedEV");

	/**
	 * The '<em><b>Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE
	 * @model name="Available"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABLE_VALUE = 0;

	/**
	 * The '<em><b>Charging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING
	 * @model name="Charging"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_VALUE = 1;

	/**
	 * The '<em><b>Preparing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARING
	 * @model name="Preparing"
	 * @generated
	 * @ordered
	 */
	public static final int PREPARING_VALUE = 2;

	/**
	 * The '<em><b>Finishing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHING
	 * @model name="Finishing"
	 * @generated
	 * @ordered
	 */
	public static final int FINISHING_VALUE = 3;

	/**
	 * The '<em><b>Reserved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED
	 * @model name="Reserved"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVED_VALUE = 4;

	/**
	 * The '<em><b>Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE
	 * @model name="Unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 5;

	/**
	 * The '<em><b>Faulted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAULTED
	 * @model name="Faulted"
	 * @generated
	 * @ordered
	 */
	public static final int FAULTED_VALUE = 6;

	/**
	 * The '<em><b>Suspended EVSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EVSE
	 * @model name="SuspendedEVSE"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_EVSE_VALUE = 7;

	/**
	 * The '<em><b>Suspended EV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EV
	 * @model name="SuspendedEV"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_EV_VALUE = 8;

	/**
	 * An array of all the '<em><b>SGr OCPP State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrOCPPStateType[] VALUES_ARRAY =
		new SGrOCPPStateType[] {
			AVAILABLE,
			CHARGING,
			PREPARING,
			FINISHING,
			RESERVED,
			UNAVAILABLE,
			FAULTED,
			SUSPENDED_EVSE,
			SUSPENDED_EV,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr OCPP State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrOCPPStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr OCPP State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrOCPPStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrOCPPStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr OCPP State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrOCPPStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrOCPPStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr OCPP State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrOCPPStateType get(int value) {
		switch (value) {
			case AVAILABLE_VALUE: return AVAILABLE;
			case CHARGING_VALUE: return CHARGING;
			case PREPARING_VALUE: return PREPARING;
			case FINISHING_VALUE: return FINISHING;
			case RESERVED_VALUE: return RESERVED;
			case UNAVAILABLE_VALUE: return UNAVAILABLE;
			case FAULTED_VALUE: return FAULTED;
			case SUSPENDED_EVSE_VALUE: return SUSPENDED_EVSE;
			case SUSPENDED_EV_VALUE: return SUSPENDED_EV;
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
	private SGrOCPPStateType(int value, String name, String literal) {
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
	
} //SGrOCPPStateType
