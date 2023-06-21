/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Level Of Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getLevelOfOperationType()
 * @model extendedMetaData="name='LevelOfOperationType'"
 * @generated
 */
public enum LevelOfOperationType implements Enumerator {
	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * m: monitoring only
	 * <!-- end-model-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(0, "m", "m"),

	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1: binary writable data points
	 * <!-- end-model-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(1, "_1", "1"),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2: discrete writable data points
	 * <!-- end-model-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(2, "_2", "2"),

	/**
	 * The '<em><b>3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3: fixed set of characteristic curves
	 * <!-- end-model-doc -->
	 * @see #_3_VALUE
	 * @generated
	 * @ordered
	 */
	_3(3, "_3", "3"),

	/**
	 * The '<em><b>4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4: dynamic set values
	 * <!-- end-model-doc -->
	 * @see #_4_VALUE
	 * @generated
	 * @ordered
	 */
	_4(4, "_4", "4"),

	/**
	 * The '<em><b>5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5: dynamic characteristic curves
	 * <!-- end-model-doc -->
	 * @see #_5_VALUE
	 * @generated
	 * @ordered
	 */
	_5(5, "_5", "5"),

	/**
	 * The '<em><b>6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6: predictive
	 * <!-- end-model-doc -->
	 * @see #_6_VALUE
	 * @generated
	 * @ordered
	 */
	_6(6, "_6", "6"),

	/**
	 * The '<em><b>1m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1m: binary writable data points plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_1M_VALUE
	 * @generated
	 * @ordered
	 */
	_1M(7, "_1m", "1m"),

	/**
	 * The '<em><b>2m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2m: discrete writable data points plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_2M_VALUE
	 * @generated
	 * @ordered
	 */
	_2M(8, "_2m", "2m"),

	/**
	 * The '<em><b>3m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3m: fixed set of characteristic curves plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_3M_VALUE
	 * @generated
	 * @ordered
	 */
	_3M(9, "_3m", "3m"),

	/**
	 * The '<em><b>4m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4m: dynamic set values plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_4M_VALUE
	 * @generated
	 * @ordered
	 */
	_4M(10, "_4m", "4m"),

	/**
	 * The '<em><b>5m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5m: dynamic characteristic curves plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_5M_VALUE
	 * @generated
	 * @ordered
	 */
	_5M(11, "_5m", "5m"),

	/**
	 * The '<em><b>6m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6m: predictive plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_6M_VALUE
	 * @generated
	 * @ordered
	 */
	_6M(12, "_6m", "6m");

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * m: monitoring only
	 * <!-- end-model-doc -->
	 * @see #M
	 * @model name="m"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 0;

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1: binary writable data points
	 * <!-- end-model-doc -->
	 * @see #_1
	 * @model literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 1;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2: discrete writable data points
	 * <!-- end-model-doc -->
	 * @see #_2
	 * @model literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 2;

	/**
	 * The '<em><b>3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3: fixed set of characteristic curves
	 * <!-- end-model-doc -->
	 * @see #_3
	 * @model literal="3"
	 * @generated
	 * @ordered
	 */
	public static final int _3_VALUE = 3;

	/**
	 * The '<em><b>4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4: dynamic set values
	 * <!-- end-model-doc -->
	 * @see #_4
	 * @model literal="4"
	 * @generated
	 * @ordered
	 */
	public static final int _4_VALUE = 4;

	/**
	 * The '<em><b>5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5: dynamic characteristic curves
	 * <!-- end-model-doc -->
	 * @see #_5
	 * @model literal="5"
	 * @generated
	 * @ordered
	 */
	public static final int _5_VALUE = 5;

	/**
	 * The '<em><b>6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6: predictive
	 * <!-- end-model-doc -->
	 * @see #_6
	 * @model literal="6"
	 * @generated
	 * @ordered
	 */
	public static final int _6_VALUE = 6;

	/**
	 * The '<em><b>1m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1m: binary writable data points plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_1M
	 * @model name="_1m" literal="1m"
	 * @generated
	 * @ordered
	 */
	public static final int _1M_VALUE = 7;

	/**
	 * The '<em><b>2m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2m: discrete writable data points plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_2M
	 * @model name="_2m" literal="2m"
	 * @generated
	 * @ordered
	 */
	public static final int _2M_VALUE = 8;

	/**
	 * The '<em><b>3m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3m: fixed set of characteristic curves plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_3M
	 * @model name="_3m" literal="3m"
	 * @generated
	 * @ordered
	 */
	public static final int _3M_VALUE = 9;

	/**
	 * The '<em><b>4m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4m: dynamic set values plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_4M
	 * @model name="_4m" literal="4m"
	 * @generated
	 * @ordered
	 */
	public static final int _4M_VALUE = 10;

	/**
	 * The '<em><b>5m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5m: dynamic characteristic curves plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_5M
	 * @model name="_5m" literal="5m"
	 * @generated
	 * @ordered
	 */
	public static final int _5M_VALUE = 11;

	/**
	 * The '<em><b>6m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6m: predictive plus monitoring
	 * <!-- end-model-doc -->
	 * @see #_6M
	 * @model name="_6m" literal="6m"
	 * @generated
	 * @ordered
	 */
	public static final int _6M_VALUE = 12;

	/**
	 * An array of all the '<em><b>Level Of Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LevelOfOperationType[] VALUES_ARRAY =
		new LevelOfOperationType[] {
			M,
			_1,
			_2,
			_3,
			_4,
			_5,
			_6,
			_1M,
			_2M,
			_3M,
			_4M,
			_5M,
			_6M,
		};

	/**
	 * A public read-only list of all the '<em><b>Level Of Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LevelOfOperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Level Of Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LevelOfOperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LevelOfOperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level Of Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LevelOfOperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LevelOfOperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level Of Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LevelOfOperationType get(int value) {
		switch (value) {
			case M_VALUE: return M;
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _3_VALUE: return _3;
			case _4_VALUE: return _4;
			case _5_VALUE: return _5;
			case _6_VALUE: return _6;
			case _1M_VALUE: return _1M;
			case _2M_VALUE: return _2M;
			case _3M_VALUE: return _3M;
			case _4M_VALUE: return _4M;
			case _5M_VALUE: return _5M;
			case _6M_VALUE: return _6M;
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
	private LevelOfOperationType(int value, String name, String literal) {
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
	
} //LevelOfOperationType
