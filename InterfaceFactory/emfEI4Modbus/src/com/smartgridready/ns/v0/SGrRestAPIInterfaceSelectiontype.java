/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Rest API Interface Selectiontype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIInterfaceSelectiontype()
 * @model extendedMetaData="name='SGrRestAPIInterfaceSelectiontype'"
 * @generated
 */
public enum SGrRestAPIInterfaceSelectiontype implements Enumerator {
	/**
	 * The '<em><b>Trsp Srv Rest TCPV4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRSP_SRV_REST_TCPV4_VALUE
	 * @generated
	 * @ordered
	 */
	TRSP_SRV_REST_TCPV4(0, "trspSrvRestTCPV4", "trspSrvRestTCPV4"),

	/**
	 * The '<em><b>Trsp Srv Rest TCPV6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRSP_SRV_REST_TCPV6_VALUE
	 * @generated
	 * @ordered
	 */
	TRSP_SRV_REST_TCPV6(1, "trspSrvRestTCPV6", "trspSrvRestTCPV6"),

	/**
	 * The '<em><b>Trsp Srv Rest URI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRSP_SRV_REST_URI_VALUE
	 * @generated
	 * @ordered
	 */
	TRSP_SRV_REST_URI(2, "trspSrvRestURI", "trspSrvRestURI");

	/**
	 * The '<em><b>Trsp Srv Rest TCPV4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRSP_SRV_REST_TCPV4
	 * @model name="trspSrvRestTCPV4"
	 * @generated
	 * @ordered
	 */
	public static final int TRSP_SRV_REST_TCPV4_VALUE = 0;

	/**
	 * The '<em><b>Trsp Srv Rest TCPV6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRSP_SRV_REST_TCPV6
	 * @model name="trspSrvRestTCPV6"
	 * @generated
	 * @ordered
	 */
	public static final int TRSP_SRV_REST_TCPV6_VALUE = 1;

	/**
	 * The '<em><b>Trsp Srv Rest URI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRSP_SRV_REST_URI
	 * @model name="trspSrvRestURI"
	 * @generated
	 * @ordered
	 */
	public static final int TRSP_SRV_REST_URI_VALUE = 2;

	/**
	 * An array of all the '<em><b>SGr Rest API Interface Selectiontype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrRestAPIInterfaceSelectiontype[] VALUES_ARRAY =
		new SGrRestAPIInterfaceSelectiontype[] {
			TRSP_SRV_REST_TCPV4,
			TRSP_SRV_REST_TCPV6,
			TRSP_SRV_REST_URI,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Rest API Interface Selectiontype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrRestAPIInterfaceSelectiontype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Rest API Interface Selectiontype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIInterfaceSelectiontype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrRestAPIInterfaceSelectiontype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Rest API Interface Selectiontype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIInterfaceSelectiontype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrRestAPIInterfaceSelectiontype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Rest API Interface Selectiontype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIInterfaceSelectiontype get(int value) {
		switch (value) {
			case TRSP_SRV_REST_TCPV4_VALUE: return TRSP_SRV_REST_TCPV4;
			case TRSP_SRV_REST_TCPV6_VALUE: return TRSP_SRV_REST_TCPV6;
			case TRSP_SRV_REST_URI_VALUE: return TRSP_SRV_REST_URI;
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
	private SGrRestAPIInterfaceSelectiontype(int value, String name, String literal) {
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
	
} //SGrRestAPIInterfaceSelectiontype
