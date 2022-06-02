/**
 */
package ch.smartgridready.sgr.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Oblig Lvl Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0014:  Obligation level of a reaction / function.
 *       SHALL:  action is required
 *       SHOULD: action is strongly recommended
 *       MAY: action is permitted
 *     
 * <!-- end-model-doc -->
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrObligLvlType()
 * @model extendedMetaData="name='SGrObligLvlType'"
 * @generated
 */
public enum SGrObligLvlType implements Enumerator {
	/**
	 * The '<em><b>OLSHALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLSHALL_VALUE
	 * @generated
	 * @ordered
	 */
	OLSHALL(0, "OLSHALL", "OL_SHALL"),

	/**
	 * The '<em><b>OLSHOULD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLSHOULD_VALUE
	 * @generated
	 * @ordered
	 */
	OLSHOULD(1, "OLSHOULD", "OL_SHOULD"),

	/**
	 * The '<em><b>OLMAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLMAY_VALUE
	 * @generated
	 * @ordered
	 */
	OLMAY(2, "OLMAY", "OL_MAY");

	/**
	 * The '<em><b>OLSHALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLSHALL
	 * @model literal="OL_SHALL"
	 * @generated
	 * @ordered
	 */
	public static final int OLSHALL_VALUE = 0;

	/**
	 * The '<em><b>OLSHOULD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLSHOULD
	 * @model literal="OL_SHOULD"
	 * @generated
	 * @ordered
	 */
	public static final int OLSHOULD_VALUE = 1;

	/**
	 * The '<em><b>OLMAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLMAY
	 * @model literal="OL_MAY"
	 * @generated
	 * @ordered
	 */
	public static final int OLMAY_VALUE = 2;

	/**
	 * An array of all the '<em><b>SGr Oblig Lvl Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrObligLvlType[] VALUES_ARRAY =
		new SGrObligLvlType[] {
			OLSHALL,
			OLSHOULD,
			OLMAY,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Oblig Lvl Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrObligLvlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Oblig Lvl Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrObligLvlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrObligLvlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Oblig Lvl Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrObligLvlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrObligLvlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Oblig Lvl Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrObligLvlType get(int value) {
		switch (value) {
			case OLSHALL_VALUE: return OLSHALL;
			case OLSHOULD_VALUE: return OLSHOULD;
			case OLMAY_VALUE: return OLMAY;
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
	private SGrObligLvlType(int value, String name, String literal) {
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
	
} //SGrObligLvlType
