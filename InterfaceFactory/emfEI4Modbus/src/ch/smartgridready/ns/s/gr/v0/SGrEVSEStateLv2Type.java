/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr EVSE State Lv2 Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  E0008 : 0:0 = EV_NORMAL, 0:1 = EV_REDUCED , 1:0 =
 * 				EV_MINIMAL , 1:1 = EV_NONE_OR_FEEDIN
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrEVSEStateLv2Type()
 * @model extendedMetaData="name='SGrEVSEStateLv2Type'"
 * @generated
 */
public enum SGrEVSEStateLv2Type implements Enumerator {
	/**
	 * The '<em><b>EVNORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVNORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	EVNORMAL(0, "EVNORMAL", "EV_NORMAL"),

	/**
	 * The '<em><b>EVREDUCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVREDUCED_VALUE
	 * @generated
	 * @ordered
	 */
	EVREDUCED(1, "EVREDUCED", "EV_REDUCED"),

	/**
	 * The '<em><b>EVMINIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVMINIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	EVMINIMAL(2, "EVMINIMAL", "EV_MINIMAL"),

	/**
	 * The '<em><b>EVNONEORFEEDIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVNONEORFEEDIN_VALUE
	 * @generated
	 * @ordered
	 */
	EVNONEORFEEDIN(3, "EVNONEORFEEDIN", "EV_NONE_OR_FEEDIN");

	/**
	 * The '<em><b>EVNORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVNORMAL
	 * @model literal="EV_NORMAL"
	 * @generated
	 * @ordered
	 */
	public static final int EVNORMAL_VALUE = 0;

	/**
	 * The '<em><b>EVREDUCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVREDUCED
	 * @model literal="EV_REDUCED"
	 * @generated
	 * @ordered
	 */
	public static final int EVREDUCED_VALUE = 1;

	/**
	 * The '<em><b>EVMINIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVMINIMAL
	 * @model literal="EV_MINIMAL"
	 * @generated
	 * @ordered
	 */
	public static final int EVMINIMAL_VALUE = 2;

	/**
	 * The '<em><b>EVNONEORFEEDIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVNONEORFEEDIN
	 * @model literal="EV_NONE_OR_FEEDIN"
	 * @generated
	 * @ordered
	 */
	public static final int EVNONEORFEEDIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>SGr EVSE State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrEVSEStateLv2Type[] VALUES_ARRAY =
		new SGrEVSEStateLv2Type[] {
			EVNORMAL,
			EVREDUCED,
			EVMINIMAL,
			EVNONEORFEEDIN,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr EVSE State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrEVSEStateLv2Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr EVSE State Lv2 Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrEVSEStateLv2Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrEVSEStateLv2Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr EVSE State Lv2 Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrEVSEStateLv2Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrEVSEStateLv2Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr EVSE State Lv2 Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrEVSEStateLv2Type get(int value) {
		switch (value) {
			case EVNORMAL_VALUE: return EVNORMAL;
			case EVREDUCED_VALUE: return EVREDUCED;
			case EVMINIMAL_VALUE: return EVMINIMAL;
			case EVNONEORFEEDIN_VALUE: return EVNONEORFEEDIN;
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
	private SGrEVSEStateLv2Type(int value, String name, String literal) {
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
	
} //SGrEVSEStateLv2Type
