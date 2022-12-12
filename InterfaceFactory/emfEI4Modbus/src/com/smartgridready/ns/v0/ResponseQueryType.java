/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Response Query Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getResponseQueryType()
 * @model extendedMetaData="name='ResponseQueryType'"
 * @generated
 */
public enum ResponseQueryType implements Enumerator {
	/**
	 * The '<em><b>JMES Path Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMES_PATH_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	JMES_PATH_EXPRESSION(0, "JMESPathExpression", "JMESPathExpression"),

	/**
	 * The '<em><b>XPath Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH_EXPRESSION(1, "XPathExpression", "XPathExpression"),

	/**
	 * The '<em><b>Regular Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR_EXPRESSION(2, "RegularExpression", "RegularExpression");

	/**
	 * The '<em><b>JMES Path Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMES_PATH_EXPRESSION
	 * @model name="JMESPathExpression"
	 * @generated
	 * @ordered
	 */
	public static final int JMES_PATH_EXPRESSION_VALUE = 0;

	/**
	 * The '<em><b>XPath Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_EXPRESSION
	 * @model name="XPathExpression"
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_EXPRESSION_VALUE = 1;

	/**
	 * The '<em><b>Regular Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_EXPRESSION
	 * @model name="RegularExpression"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_EXPRESSION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Response Query Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResponseQueryType[] VALUES_ARRAY =
		new ResponseQueryType[] {
			JMES_PATH_EXPRESSION,
			XPATH_EXPRESSION,
			REGULAR_EXPRESSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Response Query Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResponseQueryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Response Query Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseQueryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseQueryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Query Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseQueryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseQueryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Query Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseQueryType get(int value) {
		switch (value) {
			case JMES_PATH_EXPRESSION_VALUE: return JMES_PATH_EXPRESSION;
			case XPATH_EXPRESSION_VALUE: return XPATH_EXPRESSION;
			case REGULAR_EXPRESSION_VALUE: return REGULAR_EXPRESSION;
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
	private ResponseQueryType(int value, String name, String literal) {
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
	
} //ResponseQueryType
