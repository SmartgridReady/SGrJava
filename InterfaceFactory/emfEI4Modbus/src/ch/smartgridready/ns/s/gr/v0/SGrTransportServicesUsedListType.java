/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Transport Services Used List Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrTransportServicesUsedListType()
 * @model extendedMetaData="name='SGrTransportServicesUsedListType'"
 * @generated
 */
public enum SGrTransportServicesUsedListType implements Enumerator {
	/**
	 * The '<em><b>EEBUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EEBUS_VALUE
	 * @generated
	 * @ordered
	 */
	EEBUS(0, "EEBUS", "EEBUS"),

	/**
	 * The '<em><b>Modbus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODBUS_VALUE
	 * @generated
	 * @ordered
	 */
	MODBUS(1, "Modbus", "Modbus"),

	/**
	 * The '<em><b>OCPP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCPP_VALUE
	 * @generated
	 * @ordered
	 */
	OCPP(2, "OCPP", "OCPP"),

	/**
	 * The '<em><b>RES Tful JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_TFUL_JSON_VALUE
	 * @generated
	 * @ordered
	 */
	RES_TFUL_JSON(3, "RESTfulJSON", "RESTfulJSON"),

	/**
	 * The '<em><b>Contacts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACTS(4, "Contacts", "Contacts"),

	/**
	 * The '<em><b>Wo T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WO_T_VALUE
	 * @generated
	 * @ordered
	 */
	WO_T(5, "WoT", "WoT"),

	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(6, "generic", "generic");

	/**
	 * The '<em><b>EEBUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EEBUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EEBUS_VALUE = 0;

	/**
	 * The '<em><b>Modbus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODBUS
	 * @model name="Modbus"
	 * @generated
	 * @ordered
	 */
	public static final int MODBUS_VALUE = 1;

	/**
	 * The '<em><b>OCPP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCPP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCPP_VALUE = 2;

	/**
	 * The '<em><b>RES Tful JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_TFUL_JSON
	 * @model name="RESTfulJSON"
	 * @generated
	 * @ordered
	 */
	public static final int RES_TFUL_JSON_VALUE = 3;

	/**
	 * The '<em><b>Contacts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACTS
	 * @model name="Contacts"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACTS_VALUE = 4;

	/**
	 * The '<em><b>Wo T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WO_T
	 * @model name="WoT"
	 * @generated
	 * @ordered
	 */
	public static final int WO_T_VALUE = 5;

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 6;

	/**
	 * An array of all the '<em><b>SGr Transport Services Used List Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrTransportServicesUsedListType[] VALUES_ARRAY =
		new SGrTransportServicesUsedListType[] {
			EEBUS,
			MODBUS,
			OCPP,
			RES_TFUL_JSON,
			CONTACTS,
			WO_T,
			GENERIC,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Transport Services Used List Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrTransportServicesUsedListType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Transport Services Used List Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrTransportServicesUsedListType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrTransportServicesUsedListType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Transport Services Used List Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrTransportServicesUsedListType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrTransportServicesUsedListType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Transport Services Used List Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrTransportServicesUsedListType get(int value) {
		switch (value) {
			case EEBUS_VALUE: return EEBUS;
			case MODBUS_VALUE: return MODBUS;
			case OCPP_VALUE: return OCPP;
			case RES_TFUL_JSON_VALUE: return RES_TFUL_JSON;
			case CONTACTS_VALUE: return CONTACTS;
			case WO_T_VALUE: return WO_T;
			case GENERIC_VALUE: return GENERIC;
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
	private SGrTransportServicesUsedListType(int value, String name, String literal) {
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
	
} //SGrTransportServicesUsedListType
