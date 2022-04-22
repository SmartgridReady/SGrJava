/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modbus Interface Selection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getModbusInterfaceSelectionType()
 * @model extendedMetaData="name='ModbusInterfaceSelectionType'"
 * @generated
 */
public enum ModbusInterfaceSelectionType implements Enumerator {
	/**
	 * The '<em><b>RTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTU_VALUE
	 * @generated
	 * @ordered
	 */
	RTU(0, "RTU", "RTU"),

	/**
	 * The '<em><b>TCPIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCPIP_VALUE
	 * @generated
	 * @ordered
	 */
	TCPIP(1, "TCPIP", "TCP/IP"),

	/**
	 * The '<em><b>UDPIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDPIP_VALUE
	 * @generated
	 * @ordered
	 */
	UDPIP(2, "UDPIP", "UDP/IP"),

	/**
	 * The '<em><b>RTUASCII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTUASCII_VALUE
	 * @generated
	 * @ordered
	 */
	RTUASCII(3, "RTUASCII", "RTU-ASCII"),

	/**
	 * The '<em><b>TCPIPASCII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCPIPASCII_VALUE
	 * @generated
	 * @ordered
	 */
	TCPIPASCII(4, "TCPIPASCII", "TCP/IP-ASCII"),

	/**
	 * The '<em><b>UDPIPASCII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDPIPASCII_VALUE
	 * @generated
	 * @ordered
	 */
	UDPIPASCII(5, "UDPIPASCII", "UDP/IP-ASCII");

	/**
	 * The '<em><b>RTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTU_VALUE = 0;

	/**
	 * The '<em><b>TCPIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCPIP
	 * @model literal="TCP/IP"
	 * @generated
	 * @ordered
	 */
	public static final int TCPIP_VALUE = 1;

	/**
	 * The '<em><b>UDPIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDPIP
	 * @model literal="UDP/IP"
	 * @generated
	 * @ordered
	 */
	public static final int UDPIP_VALUE = 2;

	/**
	 * The '<em><b>RTUASCII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTUASCII
	 * @model literal="RTU-ASCII"
	 * @generated
	 * @ordered
	 */
	public static final int RTUASCII_VALUE = 3;

	/**
	 * The '<em><b>TCPIPASCII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCPIPASCII
	 * @model literal="TCP/IP-ASCII"
	 * @generated
	 * @ordered
	 */
	public static final int TCPIPASCII_VALUE = 4;

	/**
	 * The '<em><b>UDPIPASCII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDPIPASCII
	 * @model literal="UDP/IP-ASCII"
	 * @generated
	 * @ordered
	 */
	public static final int UDPIPASCII_VALUE = 5;

	/**
	 * An array of all the '<em><b>Modbus Interface Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModbusInterfaceSelectionType[] VALUES_ARRAY =
		new ModbusInterfaceSelectionType[] {
			RTU,
			TCPIP,
			UDPIP,
			RTUASCII,
			TCPIPASCII,
			UDPIPASCII,
		};

	/**
	 * A public read-only list of all the '<em><b>Modbus Interface Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModbusInterfaceSelectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modbus Interface Selection Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModbusInterfaceSelectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModbusInterfaceSelectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modbus Interface Selection Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModbusInterfaceSelectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModbusInterfaceSelectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modbus Interface Selection Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModbusInterfaceSelectionType get(int value) {
		switch (value) {
			case RTU_VALUE: return RTU;
			case TCPIP_VALUE: return TCPIP;
			case UDPIP_VALUE: return UDPIP;
			case RTUASCII_VALUE: return RTUASCII;
			case TCPIPASCII_VALUE: return TCPIPASCII;
			case UDPIPASCII_VALUE: return UDPIPASCII;
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
	private ModbusInterfaceSelectionType(int value, String name, String literal) {
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
	
} //ModbusInterfaceSelectionType
