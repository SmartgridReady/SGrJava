/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov SG Ready Src Sel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ehov:
 *      map for Hoval H 
 *      #0=AUS
 *      #1=Eingangskontakte
 *      #2=Systembus
 *      #3=Verfügbare Leistung gedämpft
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovSGReadySrcSelType()
 * @model extendedMetaData="name='hovSGReadySrcSelType'"
 * @generated
 */
public enum HovSGReadySrcSelType implements Enumerator {
	/**
	 * The '<em><b>SGR Src OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGR_SRC_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	SGR_SRC_OFF(0, "SGRSrcOFF", "SGR_src_OFF"),

	/**
	 * The '<em><b>SRC Src CONTACTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRC_SRC_CONTACTS_VALUE
	 * @generated
	 * @ordered
	 */
	SRC_SRC_CONTACTS(1, "SRCSrcCONTACTS", "SRC_src_CONTACTS"),

	/**
	 * The '<em><b>SRC Src Sys BUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRC_SRC_SYS_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	SRC_SRC_SYS_BUS(2, "SRCSrcSysBUS", "SRC_src_SysBUS"),

	/**
	 * The '<em><b>SRC Src DAMPED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRC_SRC_DAMPED_VALUE
	 * @generated
	 * @ordered
	 */
	SRC_SRC_DAMPED(3, "SRCSrcDAMPED", "SRC_src_DAMPED");

	/**
	 * The '<em><b>SGR Src OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGR_SRC_OFF
	 * @model name="SGRSrcOFF" literal="SGR_src_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int SGR_SRC_OFF_VALUE = 0;

	/**
	 * The '<em><b>SRC Src CONTACTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRC_SRC_CONTACTS
	 * @model name="SRCSrcCONTACTS" literal="SRC_src_CONTACTS"
	 * @generated
	 * @ordered
	 */
	public static final int SRC_SRC_CONTACTS_VALUE = 1;

	/**
	 * The '<em><b>SRC Src Sys BUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRC_SRC_SYS_BUS
	 * @model name="SRCSrcSysBUS" literal="SRC_src_SysBUS"
	 * @generated
	 * @ordered
	 */
	public static final int SRC_SRC_SYS_BUS_VALUE = 2;

	/**
	 * The '<em><b>SRC Src DAMPED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRC_SRC_DAMPED
	 * @model name="SRCSrcDAMPED" literal="SRC_src_DAMPED"
	 * @generated
	 * @ordered
	 */
	public static final int SRC_SRC_DAMPED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hov SG Ready Src Sel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovSGReadySrcSelType[] VALUES_ARRAY =
		new HovSGReadySrcSelType[] {
			SGR_SRC_OFF,
			SRC_SRC_CONTACTS,
			SRC_SRC_SYS_BUS,
			SRC_SRC_DAMPED,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov SG Ready Src Sel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovSGReadySrcSelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov SG Ready Src Sel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovSGReadySrcSelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovSGReadySrcSelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov SG Ready Src Sel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovSGReadySrcSelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovSGReadySrcSelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov SG Ready Src Sel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovSGReadySrcSelType get(int value) {
		switch (value) {
			case SGR_SRC_OFF_VALUE: return SGR_SRC_OFF;
			case SRC_SRC_CONTACTS_VALUE: return SRC_SRC_CONTACTS;
			case SRC_SRC_SYS_BUS_VALUE: return SRC_SRC_SYS_BUS;
			case SRC_SRC_DAMPED_VALUE: return SRC_SRC_DAMPED;
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
	private HovSGReadySrcSelType(int value, String name, String literal) {
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
	
} //HovSGReadySrcSelType
