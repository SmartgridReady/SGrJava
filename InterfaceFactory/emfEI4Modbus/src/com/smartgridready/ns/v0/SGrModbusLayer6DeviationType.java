/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Modbus Layer6 Deviation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * this type is used to manage non standard data type definitions at ISO/OSI Layer 6
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrModbusLayer6DeviationType()
 * @model extendedMetaData="name='SGrModbusLayer6DeviationType'"
 * @generated
 */
public enum SGrModbusLayer6DeviationType implements Enumerator {
	/**
	 * The '<em><b>2Reg Base1000 L2H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2 Registers show a combined value, as example in kWh and MWh beginning  with lower range @ lower address
	 * <!-- end-model-doc -->
	 * @see #_2REG_BASE1000_L2H_VALUE
	 * @generated
	 * @ordered
	 */
	_2REG_BASE1000_L2H(0, "_2RegBase1000L2H", "2RegBase1000_L2H"),

	/**
	 * The '<em><b>2Reg Base1000 H2L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>2 Registers show a combined value, as example in kWh and MWh beginning with lower range @ higher address</documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #_2REG_BASE1000_H2L_VALUE
	 * @generated
	 * @ordered
	 */
	_2REG_BASE1000_H2L(1, "_2RegBase1000H2L", "2RegBase1000_H2L"),

	/**
	 * The '<em><b>Bitmap8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>bitmap for uint8 </documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #BITMAP8_VALUE
	 * @generated
	 * @ordered
	 */
	BITMAP8(2, "bitmap8", "bitmap8"),

	/**
	 * The '<em><b>Bitmap16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>bitmap for uint16 </documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #BITMAP16_VALUE
	 * @generated
	 * @ordered
	 */
	BITMAP16(3, "bitmap16", "bitmap16"),

	/**
	 * The '<em><b>Bitmap32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>bitmap for uint32 </documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #BITMAP32_VALUE
	 * @generated
	 * @ordered
	 */
	BITMAP32(4, "bitmap32", "bitmap32");

	/**
	 * The '<em><b>2Reg Base1000 L2H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2 Registers show a combined value, as example in kWh and MWh beginning  with lower range @ lower address
	 * <!-- end-model-doc -->
	 * @see #_2REG_BASE1000_L2H
	 * @model name="_2RegBase1000L2H" literal="2RegBase1000_L2H"
	 * @generated
	 * @ordered
	 */
	public static final int _2REG_BASE1000_L2H_VALUE = 0;

	/**
	 * The '<em><b>2Reg Base1000 H2L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>2 Registers show a combined value, as example in kWh and MWh beginning with lower range @ higher address</documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #_2REG_BASE1000_H2L
	 * @model name="_2RegBase1000H2L" literal="2RegBase1000_H2L"
	 * @generated
	 * @ordered
	 */
	public static final int _2REG_BASE1000_H2L_VALUE = 1;

	/**
	 * The '<em><b>Bitmap8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>bitmap for uint8 </documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #BITMAP8
	 * @model name="bitmap8"
	 * @generated
	 * @ordered
	 */
	public static final int BITMAP8_VALUE = 2;

	/**
	 * The '<em><b>Bitmap16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>bitmap for uint16 </documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #BITMAP16
	 * @model name="bitmap16"
	 * @generated
	 * @ordered
	 */
	public static final int BITMAP16_VALUE = 3;

	/**
	 * The '<em><b>Bitmap32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             
	 *   <documentation>bitmap for uint32 </documentation>
	 * 
	 * <!-- end-model-doc -->
	 * @see #BITMAP32
	 * @model name="bitmap32"
	 * @generated
	 * @ordered
	 */
	public static final int BITMAP32_VALUE = 4;

	/**
	 * An array of all the '<em><b>SGr Modbus Layer6 Deviation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrModbusLayer6DeviationType[] VALUES_ARRAY =
		new SGrModbusLayer6DeviationType[] {
			_2REG_BASE1000_L2H,
			_2REG_BASE1000_H2L,
			BITMAP8,
			BITMAP16,
			BITMAP32,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Modbus Layer6 Deviation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrModbusLayer6DeviationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Modbus Layer6 Deviation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrModbusLayer6DeviationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrModbusLayer6DeviationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Modbus Layer6 Deviation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrModbusLayer6DeviationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrModbusLayer6DeviationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Modbus Layer6 Deviation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrModbusLayer6DeviationType get(int value) {
		switch (value) {
			case _2REG_BASE1000_L2H_VALUE: return _2REG_BASE1000_L2H;
			case _2REG_BASE1000_H2L_VALUE: return _2REG_BASE1000_H2L;
			case BITMAP8_VALUE: return BITMAP8;
			case BITMAP16_VALUE: return BITMAP16;
			case BITMAP32_VALUE: return BITMAP32;
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
	private SGrModbusLayer6DeviationType(int value, String name, String literal) {
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
	
} //SGrModbusLayer6DeviationType
