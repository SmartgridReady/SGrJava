/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr SGCP Service Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0013: Assistance type of a reaction / function. This Attribute indicates the type of Flexibility Entity of the operation 
 *       NET  servicable: Operation for the benefit of a distribution network operator (DSO) 
 *       SYS  servicable: Operation of the total system operators (TSO) 
 *       ENER servicable: Operation for energy optimization
 *     
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrSGCPServiceType()
 * @model extendedMetaData="name='SGrSGCPServiceType'"
 * @generated
 */
public enum SGrSGCPServiceType implements Enumerator {
	/**
	 * The '<em><b>AT Net Servicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_NET_SERVICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_NET_SERVICABLE(0, "ATNetServicable", "AT_NetServicable"),

	/**
	 * The '<em><b>AT Sys Servicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_SYS_SERVICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_SYS_SERVICABLE(1, "ATSysServicable", "AT_SysServicable"),

	/**
	 * The '<em><b>AT Ener Servicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_ENER_SERVICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_ENER_SERVICABLE(2, "ATEnerServicable", "AT_EnerServicable");

	/**
	 * The '<em><b>AT Net Servicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_NET_SERVICABLE
	 * @model name="ATNetServicable" literal="AT_NetServicable"
	 * @generated
	 * @ordered
	 */
	public static final int AT_NET_SERVICABLE_VALUE = 0;

	/**
	 * The '<em><b>AT Sys Servicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_SYS_SERVICABLE
	 * @model name="ATSysServicable" literal="AT_SysServicable"
	 * @generated
	 * @ordered
	 */
	public static final int AT_SYS_SERVICABLE_VALUE = 1;

	/**
	 * The '<em><b>AT Ener Servicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_ENER_SERVICABLE
	 * @model name="ATEnerServicable" literal="AT_EnerServicable"
	 * @generated
	 * @ordered
	 */
	public static final int AT_ENER_SERVICABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>SGr SGCP Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrSGCPServiceType[] VALUES_ARRAY =
		new SGrSGCPServiceType[] {
			AT_NET_SERVICABLE,
			AT_SYS_SERVICABLE,
			AT_ENER_SERVICABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr SGCP Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrSGCPServiceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr SGCP Service Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPServiceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSGCPServiceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr SGCP Service Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPServiceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSGCPServiceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr SGCP Service Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPServiceType get(int value) {
		switch (value) {
			case AT_NET_SERVICABLE_VALUE: return AT_NET_SERVICABLE;
			case AT_SYS_SERVICABLE_VALUE: return AT_SYS_SERVICABLE;
			case AT_ENER_SERVICABLE_VALUE: return AT_ENER_SERVICABLE;
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
	private SGrSGCPServiceType(int value, String name, String literal) {
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
	
} //SGrSGCPServiceType
