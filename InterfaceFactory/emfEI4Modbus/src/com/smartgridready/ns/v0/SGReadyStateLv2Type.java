/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SG Ready State Lv2 Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * E0005 SG-Ready states according the German heatpump
 * 				association bwp normal, intensified, EVU_LOCK, forced
 * 				https://www.waermepumpe.de/normen-technik/sg-ready/
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGReadyStateLv2Type()
 * @model extendedMetaData="name='SGReadyStateLv2Type'"
 * @generated
 */
public enum SGReadyStateLv2Type implements Enumerator {
	/**
	 * The '<em><b>HPNORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Normal operation, optimized according to customer
	 * 						requirements
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPNORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	HPNORMAL(0, "HPNORMAL", "HP_NORMAL"),

	/**
	 * The '<em><b>HPINTENSIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increased operation
	 * <!-- end-model-doc -->
	 * @see #HPINTENSIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	HPINTENSIFIED(1, "HPINTENSIFIED", "HP_INTENSIFIED"),

	/**
	 * The '<em><b>HPLOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Locked operation for a maximum of 2 hours
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	HPLOCKED(2, "HPLOCKED", "HP_LOCKED"),

	/**
	 * The '<em><b>HPFORCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start command
	 * <!-- end-model-doc -->
	 * @see #HPFORCED_VALUE
	 * @generated
	 * @ordered
	 */
	HPFORCED(3, "HPFORCED", "HP_FORCED");

	/**
	 * The '<em><b>HPNORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Normal operation, optimized according to customer
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
	 * The '<em><b>HPINTENSIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increased operation
	 * <!-- end-model-doc -->
	 * @see #HPINTENSIFIED
	 * @model literal="HP_INTENSIFIED"
	 * @generated
	 * @ordered
	 */
	public static final int HPINTENSIFIED_VALUE = 1;

	/**
	 * The '<em><b>HPLOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Locked operation for a maximum of 2 hours
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HPLOCKED
	 * @model literal="HP_LOCKED"
	 * @generated
	 * @ordered
	 */
	public static final int HPLOCKED_VALUE = 2;

	/**
	 * The '<em><b>HPFORCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start command
	 * <!-- end-model-doc -->
	 * @see #HPFORCED
	 * @model literal="HP_FORCED"
	 * @generated
	 * @ordered
	 */
	public static final int HPFORCED_VALUE = 3;

	/**
	 * An array of all the '<em><b>SG Ready State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGReadyStateLv2Type[] VALUES_ARRAY =
		new SGReadyStateLv2Type[] {
			HPNORMAL,
			HPINTENSIFIED,
			HPLOCKED,
			HPFORCED,
		};

	/**
	 * A public read-only list of all the '<em><b>SG Ready State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGReadyStateLv2Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SG Ready State Lv2 Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGReadyStateLv2Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGReadyStateLv2Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SG Ready State Lv2 Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGReadyStateLv2Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGReadyStateLv2Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SG Ready State Lv2 Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGReadyStateLv2Type get(int value) {
		switch (value) {
			case HPNORMAL_VALUE: return HPNORMAL;
			case HPINTENSIFIED_VALUE: return HPINTENSIFIED;
			case HPLOCKED_VALUE: return HPLOCKED;
			case HPFORCED_VALUE: return HPFORCED;
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
	private SGReadyStateLv2Type(int value, String name, String literal) {
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
	
} //SGReadyStateLv2Type
