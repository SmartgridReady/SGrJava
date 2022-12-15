/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Rest AP Idata Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrRestAPIdataTypeType()
 * @model extendedMetaData="name='SGrRestAPIdataTypeType'"
 * @generated
 */
public enum SGrRestAPIdataTypeType implements Enumerator {
	/**
	 * The '<em><b>Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "null", "null"),

	/**
	 * The '<em><b>JSON Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_NUMBER(1, "JSONNumber", "JSON_number"),

	/**
	 * The '<em><b>JSON String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_STRING(2, "JSONString", "JSON_string"),

	/**
	 * The '<em><b>JSON Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_BOOLEAN(3, "JSONBoolean", "JSON_boolean"),

	/**
	 * The '<em><b>JSON Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_OBJECT(4, "JSONObject", "JSON_object"),

	/**
	 * The '<em><b>JSON Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_ARRAY(5, "JSONArray", "JSON_array");

	/**
	 * The '<em><b>Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model name="null"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>JSON Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_NUMBER
	 * @model name="JSONNumber" literal="JSON_number"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_NUMBER_VALUE = 1;

	/**
	 * The '<em><b>JSON String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_STRING
	 * @model name="JSONString" literal="JSON_string"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_STRING_VALUE = 2;

	/**
	 * The '<em><b>JSON Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_BOOLEAN
	 * @model name="JSONBoolean" literal="JSON_boolean"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_BOOLEAN_VALUE = 3;

	/**
	 * The '<em><b>JSON Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_OBJECT
	 * @model name="JSONObject" literal="JSON_object"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_OBJECT_VALUE = 4;

	/**
	 * The '<em><b>JSON Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_ARRAY
	 * @model name="JSONArray" literal="JSON_array"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_ARRAY_VALUE = 5;

	/**
	 * An array of all the '<em><b>SGr Rest AP Idata Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrRestAPIdataTypeType[] VALUES_ARRAY =
		new SGrRestAPIdataTypeType[] {
			NULL,
			JSON_NUMBER,
			JSON_STRING,
			JSON_BOOLEAN,
			JSON_OBJECT,
			JSON_ARRAY,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Rest AP Idata Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrRestAPIdataTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Rest AP Idata Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIdataTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrRestAPIdataTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Rest AP Idata Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIdataTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrRestAPIdataTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Rest AP Idata Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIdataTypeType get(int value) {
		switch (value) {
			case NULL_VALUE: return NULL;
			case JSON_NUMBER_VALUE: return JSON_NUMBER;
			case JSON_STRING_VALUE: return JSON_STRING;
			case JSON_BOOLEAN_VALUE: return JSON_BOOLEAN;
			case JSON_OBJECT_VALUE: return JSON_OBJECT;
			case JSON_ARRAY_VALUE: return JSON_ARRAY;
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
	private SGrRestAPIdataTypeType(int value, String name, String literal) {
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
	
} //SGrRestAPIdataTypeType
