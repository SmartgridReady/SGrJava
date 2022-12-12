/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr SGCP Feed In State Lv2 Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  E0011 : 0:0 = FI_NORMAL, 0:1 = FI_REDUCED , 1:0 =
 * 				FI_LOCKED , 1:1 = FI_MAX
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrSGCPFeedInStateLv2Type()
 * @model extendedMetaData="name='SGrSGCPFeedInStateLv2Type'"
 * @generated
 */
public enum SGrSGCPFeedInStateLv2Type implements Enumerator {
	/**
	 * The '<em><b>FINORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINORMAL(0, "FINORMAL", "FI_NORMAL"),

	/**
	 * The '<em><b>FIREDUCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREDUCED_VALUE
	 * @generated
	 * @ordered
	 */
	FIREDUCED(1, "FIREDUCED", "FI_REDUCED"),

	/**
	 * The '<em><b>FILOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	FILOCKED(2, "FILOCKED", "FI_LOCKED"),

	/**
	 * The '<em><b>FIMAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIMAX_VALUE
	 * @generated
	 * @ordered
	 */
	FIMAX(3, "FIMAX", "FI_MAX");

	/**
	 * The '<em><b>FINORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINORMAL
	 * @model literal="FI_NORMAL"
	 * @generated
	 * @ordered
	 */
	public static final int FINORMAL_VALUE = 0;

	/**
	 * The '<em><b>FIREDUCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREDUCED
	 * @model literal="FI_REDUCED"
	 * @generated
	 * @ordered
	 */
	public static final int FIREDUCED_VALUE = 1;

	/**
	 * The '<em><b>FILOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILOCKED
	 * @model literal="FI_LOCKED"
	 * @generated
	 * @ordered
	 */
	public static final int FILOCKED_VALUE = 2;

	/**
	 * The '<em><b>FIMAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIMAX
	 * @model literal="FI_MAX"
	 * @generated
	 * @ordered
	 */
	public static final int FIMAX_VALUE = 3;

	/**
	 * An array of all the '<em><b>SGr SGCP Feed In State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrSGCPFeedInStateLv2Type[] VALUES_ARRAY =
		new SGrSGCPFeedInStateLv2Type[] {
			FINORMAL,
			FIREDUCED,
			FILOCKED,
			FIMAX,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr SGCP Feed In State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrSGCPFeedInStateLv2Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr SGCP Feed In State Lv2 Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPFeedInStateLv2Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSGCPFeedInStateLv2Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr SGCP Feed In State Lv2 Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPFeedInStateLv2Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrSGCPFeedInStateLv2Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr SGCP Feed In State Lv2 Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrSGCPFeedInStateLv2Type get(int value) {
		switch (value) {
			case FINORMAL_VALUE: return FINORMAL;
			case FIREDUCED_VALUE: return FIREDUCED;
			case FILOCKED_VALUE: return FILOCKED;
			case FIMAX_VALUE: return FIMAX;
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
	private SGrSGCPFeedInStateLv2Type(int value, String name, String literal) {
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
	
} //SGrSGCPFeedInStateLv2Type
