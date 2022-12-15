/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SG Ready State Lv1 Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0006 simple heat pump blocking
 * 				association bwp normal,EVU_LOCK
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGReadyStateLv1Type()
 * @model extendedMetaData="name='SGReadyStateLv1Type'"
 * @generated
 */
public enum SGReadyStateLv1Type implements Enumerator {
	/**
	 * The '<em><b>HPNORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Normal operation, optimized according to customer
	 * 						requirements
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPNORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	HPNORMAL(0, "HPNORMAL", "HP_NORMAL"),

	/**
	 * The '<em><b>HPLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Locked operation for a maximum of 2 hours
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	HPLOCK(1, "HPLOCK", "HP_LOCK");

	/**
	 * The '<em><b>HPNORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Normal operation, optimized according to customer
	 * 						requirements
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPNORMAL
	 * @model literal="HP_NORMAL"
	 * @generated
	 * @ordered
	 */
	public static final int HPNORMAL_VALUE = 0;

	/**
	 * The '<em><b>HPLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Locked operation for a maximum of 2 hours
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPLOCK
	 * @model literal="HP_LOCK"
	 * @generated
	 * @ordered
	 */
	public static final int HPLOCK_VALUE = 1;

	/**
	 * An array of all the '<em><b>SG Ready State Lv1 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGReadyStateLv1Type[] VALUES_ARRAY =
		new SGReadyStateLv1Type[] {
			HPNORMAL,
			HPLOCK,
		};

	/**
	 * A public read-only list of all the '<em><b>SG Ready State Lv1 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGReadyStateLv1Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SG Ready State Lv1 Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGReadyStateLv1Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGReadyStateLv1Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SG Ready State Lv1 Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGReadyStateLv1Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGReadyStateLv1Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SG Ready State Lv1 Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGReadyStateLv1Type get(int value) {
		switch (value) {
			case HPNORMAL_VALUE: return HPNORMAL;
			case HPLOCK_VALUE: return HPLOCK;
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
	private SGReadyStateLv1Type(int value, String name, String literal) {
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
	
} //SGReadyStateLv1Type
