/**
 */
package ch.smartgridready.ns.s.gr.v0;

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
 * 				association bwp normal, intensivied, EVU_LOCK, forced
 * 				https://www.waermepumpe.de/normen-technik/sg-ready/
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGReadyStateLv2Type()
 * @model extendedMetaData="name='SGReadyStateLv2Type'"
 * @generated
 */
public enum SGReadyStateLv2Type implements Enumerator {
	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Normal operation, optimized according to customer
	 * 						requirements
	 * 					
	 * <!-- end-model-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "normal", "normal"),

	/**
	 * The '<em><b>Intensivied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increased operation
	 * <!-- end-model-doc -->
	 * @see #INTENSIVIED_VALUE
	 * @generated
	 * @ordered
	 */
	INTENSIVIED(1, "intensivied", "intensivied"),

	/**
	 * The '<em><b>EVULOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Locked operation for a maximum of 2 hours
	 * 					
	 * <!-- end-model-doc -->
	 * @see #EVULOCK_VALUE
	 * @generated
	 * @ordered
	 */
	EVULOCK(2, "EVULOCK", "EVU_LOCK"),

	/**
	 * The '<em><b>Forced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start command
	 * <!-- end-model-doc -->
	 * @see #FORCED_VALUE
	 * @generated
	 * @ordered
	 */
	FORCED(3, "forced", "forced");

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Normal operation, optimized according to customer
	 * 						requirements
	 * 					
	 * <!-- end-model-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>Intensivied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increased operation
	 * <!-- end-model-doc -->
	 * @see #INTENSIVIED
	 * @model name="intensivied"
	 * @generated
	 * @ordered
	 */
	public static final int INTENSIVIED_VALUE = 1;

	/**
	 * The '<em><b>EVULOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Locked operation for a maximum of 2 hours
	 * 					
	 * <!-- end-model-doc -->
	 * @see #EVULOCK
	 * @model literal="EVU_LOCK"
	 * @generated
	 * @ordered
	 */
	public static final int EVULOCK_VALUE = 2;

	/**
	 * The '<em><b>Forced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start command
	 * <!-- end-model-doc -->
	 * @see #FORCED
	 * @model name="forced"
	 * @generated
	 * @ordered
	 */
	public static final int FORCED_VALUE = 3;

	/**
	 * An array of all the '<em><b>SG Ready State Lv2 Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGReadyStateLv2Type[] VALUES_ARRAY =
		new SGReadyStateLv2Type[] {
			NORMAL,
			INTENSIVIED,
			EVULOCK,
			FORCED,
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
			case NORMAL_VALUE: return NORMAL;
			case INTENSIVIED_VALUE: return INTENSIVIED;
			case EVULOCK_VALUE: return EVULOCK;
			case FORCED_VALUE: return FORCED;
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
