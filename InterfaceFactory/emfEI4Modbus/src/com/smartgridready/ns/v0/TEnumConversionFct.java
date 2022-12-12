/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TEnum Conversion Fct</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  Modbus conversion functions are used to apply
 * 				different transformations to data between Modbus device and IEC61850
 * 				devices. There are different kind of conversions, depending on
 * 				operation to apply: - Bit conversion: ChangeDWordOrder,
 * 				ChangeWordOrder, ChangeByteOrder, ChangeBitOrder
 * 			
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getTEnumConversionFct()
 * @model extendedMetaData="name='tEnumConversionFct'"
 * @generated
 */
public enum TEnumConversionFct implements Enumerator {
	/**
	 * The '<em><b>Big Endian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_ENDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_ENDIAN(0, "BigEndian", "BigEndian"),

	/**
	 * The '<em><b>Change DWord Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_DWORD_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_DWORD_ORDER(1, "ChangeDWordOrder", "ChangeDWordOrder"),

	/**
	 * The '<em><b>Change Word Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_WORD_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_WORD_ORDER(2, "ChangeWordOrder", "ChangeWordOrder"),

	/**
	 * The '<em><b>Change Byte Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_BYTE_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_BYTE_ORDER(3, "ChangeByteOrder", "ChangeByteOrder"),

	/**
	 * The '<em><b>Change Bit Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_BIT_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_BIT_ORDER(4, "ChangeBitOrder", "ChangeBitOrder");

	/**
	 * The '<em><b>Big Endian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_ENDIAN
	 * @model name="BigEndian"
	 * @generated
	 * @ordered
	 */
	public static final int BIG_ENDIAN_VALUE = 0;

	/**
	 * The '<em><b>Change DWord Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_DWORD_ORDER
	 * @model name="ChangeDWordOrder"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_DWORD_ORDER_VALUE = 1;

	/**
	 * The '<em><b>Change Word Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_WORD_ORDER
	 * @model name="ChangeWordOrder"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_WORD_ORDER_VALUE = 2;

	/**
	 * The '<em><b>Change Byte Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_BYTE_ORDER
	 * @model name="ChangeByteOrder"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_BYTE_ORDER_VALUE = 3;

	/**
	 * The '<em><b>Change Bit Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_BIT_ORDER
	 * @model name="ChangeBitOrder"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_BIT_ORDER_VALUE = 4;

	/**
	 * An array of all the '<em><b>TEnum Conversion Fct</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TEnumConversionFct[] VALUES_ARRAY =
		new TEnumConversionFct[] {
			BIG_ENDIAN,
			CHANGE_DWORD_ORDER,
			CHANGE_WORD_ORDER,
			CHANGE_BYTE_ORDER,
			CHANGE_BIT_ORDER,
		};

	/**
	 * A public read-only list of all the '<em><b>TEnum Conversion Fct</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TEnumConversionFct> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TEnum Conversion Fct</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumConversionFct get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TEnumConversionFct result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TEnum Conversion Fct</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumConversionFct getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TEnumConversionFct result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TEnum Conversion Fct</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TEnumConversionFct get(int value) {
		switch (value) {
			case BIG_ENDIAN_VALUE: return BIG_ENDIAN;
			case CHANGE_DWORD_ORDER_VALUE: return CHANGE_DWORD_ORDER;
			case CHANGE_WORD_ORDER_VALUE: return CHANGE_WORD_ORDER;
			case CHANGE_BYTE_ORDER_VALUE: return CHANGE_BYTE_ORDER;
			case CHANGE_BIT_ORDER_VALUE: return CHANGE_BIT_ORDER;
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
	private TEnumConversionFct(int value, String name, String literal) {
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
	
} //TEnumConversionFct
