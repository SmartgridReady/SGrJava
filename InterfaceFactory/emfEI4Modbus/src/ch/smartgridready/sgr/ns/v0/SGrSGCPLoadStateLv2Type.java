/**
 */
package ch.smartgridready.sgr.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr SGCP Load State Lv2 Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  E0010 : 0:0 = LD_NORMAL, 0:1 = LD_REDUCED , 1:0 =
 * 				LD_LOCKED , 1:1 = LD_MAX
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrSGCPLoadStateLv2Type()
 * @model extendedMetaData="name='SGrSGCPLoadStateLv2Type'"
 * @generated
 */
public enum SGrSGCPLoadStateLv2Type implements Enumerator {
	/**
	 * The '<em><b>LDNORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDNORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	LDNORMAL(0, "LDNORMAL", "LD_NORMAL"),

	/**
	 * The '<em><b>LDREDUCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDREDUCED_VALUE
	 * @generated
	 * @ordered
	 */
	LDREDUCED(1, "LDREDUCED", "LD_REDUCED"),

	/**
	 * The '<em><b>LDLOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	LDLOCKED(2, "LDLOCKED", "LD_LOCKED"),

	/**
	 * The '<em><b>LDMAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDMAX_VALUE
	 * @generated
	 * @ordered
	 */
	LDMAX(3, "LDMAX", "LD_MAX");

	/**
	 * The '<em><b>LDNORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDNORMAL
	 * @model literal="LD_NORMAL"
	 * @generated
	 * @ordered
	 */
	public static final int LDNORMAL_VALUE = 0;

	/**
	 * The '<em><b>LDREDUCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDREDUCED
	 * @model literal="LD_REDUCED"
	 * @generated
	 * @ordered
	 */
	public static final int LDREDUCED_VALUE = 1;

	/**
	 * The '<em><b>LDLOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDLOCKED
	 * @model literal="LD_LOCKED"
	 * @generated
	 * @ordered
	 */
	public static final int LDLOCKED_VALUE = 2;

	/**
	 * The '<em><b>LDMAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDMAX
	 * @model literal="LD_MAX"
	 * @generated
	 * @ordered
	 */
	public static final int LDMAX_VALUE = 3;

	/**
	 * An array of all the '<em><b>SGr SGCP Load State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrSGCPLoadStateLv2Type[] VALUES_ARRAY =
		new SGrSGCPLoadStateLv2Type[] {
			LDNORMAL,
			LDREDUCED,
			LDLOCKED,
			LDMAX,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr SGCP Load State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrSGCPLoadStateLv2Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr SGCP Load State Lv2 Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPLoadStateLv2Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSGCPLoadStateLv2Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr SGCP Load State Lv2 Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPLoadStateLv2Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSGCPLoadStateLv2Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr SGCP Load State Lv2 Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPLoadStateLv2Type get(int value) {
		switch (value) {
			case LDNORMAL_VALUE: return LDNORMAL;
			case LDREDUCED_VALUE: return LDREDUCED;
			case LDLOCKED_VALUE: return LDLOCKED;
			case LDMAX_VALUE: return LDMAX;
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
	private SGrSGCPLoadStateLv2Type(int value, String name, String literal) {
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
	
} //SGrSGCPLoadStateLv2Type
