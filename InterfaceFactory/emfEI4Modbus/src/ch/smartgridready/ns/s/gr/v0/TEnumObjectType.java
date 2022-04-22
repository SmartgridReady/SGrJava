/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TEnum Object Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of the Modbus Data. For slave-role, definition of
 * 				the Object Type of the data: Discretes Input: Single bit, Read-Only;
 * 				Coils: Single bit, Read-Write; Input Registers: 16-bit word,
 * 				Read-Only; Holding Registers: 16-bit word, Read-Write.
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getTEnumObjectType()
 * @model extendedMetaData="name='tEnumObjectType'"
 * @generated
 */
public enum TEnumObjectType implements Enumerator {
	/**
	 * The '<em><b>Coil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIL_VALUE
	 * @generated
	 * @ordered
	 */
	COIL(0, "Coil", "Coil"),

	/**
	 * The '<em><b>Discrete Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETE_INPUT(1, "DiscreteInput", "DiscreteInput"),

	/**
	 * The '<em><b>Input Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_REGISTER(2, "InputRegister", "InputRegister"),

	/**
	 * The '<em><b>Hold Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLD_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	HOLD_REGISTER(3, "HoldRegister", "HoldRegister");

	/**
	 * The '<em><b>Coil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIL
	 * @model name="Coil"
	 * @generated
	 * @ordered
	 */
	public static final int COIL_VALUE = 0;

	/**
	 * The '<em><b>Discrete Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_INPUT
	 * @model name="DiscreteInput"
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_INPUT_VALUE = 1;

	/**
	 * The '<em><b>Input Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_REGISTER
	 * @model name="InputRegister"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_REGISTER_VALUE = 2;

	/**
	 * The '<em><b>Hold Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLD_REGISTER
	 * @model name="HoldRegister"
	 * @generated
	 * @ordered
	 */
	public static final int HOLD_REGISTER_VALUE = 3;

	/**
	 * An array of all the '<em><b>TEnum Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TEnumObjectType[] VALUES_ARRAY =
		new TEnumObjectType[] {
			COIL,
			DISCRETE_INPUT,
			INPUT_REGISTER,
			HOLD_REGISTER,
		};

	/**
	 * A public read-only list of all the '<em><b>TEnum Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TEnumObjectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TEnum Object Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumObjectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TEnumObjectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TEnum Object Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumObjectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TEnumObjectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TEnum Object Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumObjectType get(int value) {
		switch (value) {
			case COIL_VALUE: return COIL;
			case DISCRETE_INPUT_VALUE: return DISCRETE_INPUT;
			case INPUT_REGISTER_VALUE: return INPUT_REGISTER;
			case HOLD_REGISTER_VALUE: return HOLD_REGISTER;
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
	private TEnumObjectType(int value, String name, String literal) {
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
	
} //TEnumObjectType
