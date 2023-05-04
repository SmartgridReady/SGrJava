/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hov Buffer State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ehov: 
 * 	#0 = keine Anforderung, AUS
 * 	#1 = Anforderung, Temp. tief, PLP aus (Entladeschutz)
 * 	#2 = Anforderung, Ladung läuft
 * 	#3 = Anforderung, Sollwert erfüllt, Nachlauf aktiv
 * 	#4 = Anforderung, Sollwert erfüllt
 * 	#6 = Energiezwang
 * 	#7= Abschöpffunktion
 * 	
 * 	#Entladeregelung :
 * 	#0 = keine Anforderung (WEZ-Freigabe)
 * 	#2 = Anforderung, Sollwert nicht erfüllt, UPE steht Richtung WEZ bzw. YPEL regelt stetig auf PEF
 * 	#3 = Anforderung UPE-Umschaltverzögerung, UPE/YPEL steht Richtung WEZ
 * 	#4 = Anforderung, Sollwert erfüllt, UPE/YPEL steht Richtung Puffer
 * 	#6 = Energiezwang
 * 	#8 = Vorzugsbetrieb SmartGrid
 * 	#9 = Abnahmezwang Smart Grid
 * 	
 * 	für Modi manuell heizen / kühlen
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getHovBufferStateType()
 * @model extendedMetaData="name='hovBufferStateType'"
 * @generated
 */
public enum HovBufferStateType implements Enumerator {
	/**
	 * The '<em><b>BUFOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFOFF_VALUE
	 * @generated
	 * @ordered
	 */
	BUFOFF(0, "BUFOFF", "BUF_OFF"),

	/**
	 * The '<em><b>BUFREQPROTECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQPROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	BUFREQPROTECTED(1, "BUFREQPROTECTED", "BUF_REQ_PROTECTED"),

	/**
	 * The '<em><b>BUFREQACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BUFREQACTIVE(2, "BUFREQACTIVE", "BUF_REQ_ACTIVE"),

	/**
	 * The '<em><b>BUFREQFINALIZING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQFINALIZING_VALUE
	 * @generated
	 * @ordered
	 */
	BUFREQFINALIZING(3, "BUFREQFINALIZING", "BUF_REQ_FINALIZING"),

	/**
	 * The '<em><b>BUFREQDONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQDONE_VALUE
	 * @generated
	 * @ordered
	 */
	BUFREQDONE(4, "BUFREQDONE", "BUF_REQ_DONE"),

	/**
	 * The '<em><b>BUFRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFRES_VALUE
	 * @generated
	 * @ordered
	 */
	BUFRES(5, "BUFRES", "BUF_RES"),

	/**
	 * The '<em><b>BUFFORCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFFORCED_VALUE
	 * @generated
	 * @ordered
	 */
	BUFFORCED(6, "BUFFORCED", "BUF_FORCED"),

	/**
	 * The '<em><b>BUFSKIMMING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFSKIMMING_VALUE
	 * @generated
	 * @ordered
	 */
	BUFSKIMMING(7, "BUFSKIMMING", "BUF_SKIMMING"),

	/**
	 * The '<em><b>BUFINTENSIFIEDEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFINTENSIFIEDEXT_VALUE
	 * @generated
	 * @ordered
	 */
	BUFINTENSIFIEDEXT(8, "BUFINTENSIFIEDEXT", "BUF_INTENSIFIED_EXT"),

	/**
	 * The '<em><b>BUFFORCEDEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFFORCEDEXT_VALUE
	 * @generated
	 * @ordered
	 */
	BUFFORCEDEXT(9, "BUFFORCEDEXT", "BUF_FORCED_EXT");

	/**
	 * The '<em><b>BUFOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFOFF
	 * @model literal="BUF_OFF"
	 * @generated
	 * @ordered
	 */
	public static final int BUFOFF_VALUE = 0;

	/**
	 * The '<em><b>BUFREQPROTECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQPROTECTED
	 * @model literal="BUF_REQ_PROTECTED"
	 * @generated
	 * @ordered
	 */
	public static final int BUFREQPROTECTED_VALUE = 1;

	/**
	 * The '<em><b>BUFREQACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQACTIVE
	 * @model literal="BUF_REQ_ACTIVE"
	 * @generated
	 * @ordered
	 */
	public static final int BUFREQACTIVE_VALUE = 2;

	/**
	 * The '<em><b>BUFREQFINALIZING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQFINALIZING
	 * @model literal="BUF_REQ_FINALIZING"
	 * @generated
	 * @ordered
	 */
	public static final int BUFREQFINALIZING_VALUE = 3;

	/**
	 * The '<em><b>BUFREQDONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFREQDONE
	 * @model literal="BUF_REQ_DONE"
	 * @generated
	 * @ordered
	 */
	public static final int BUFREQDONE_VALUE = 4;

	/**
	 * The '<em><b>BUFRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFRES
	 * @model literal="BUF_RES"
	 * @generated
	 * @ordered
	 */
	public static final int BUFRES_VALUE = 5;

	/**
	 * The '<em><b>BUFFORCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFFORCED
	 * @model literal="BUF_FORCED"
	 * @generated
	 * @ordered
	 */
	public static final int BUFFORCED_VALUE = 6;

	/**
	 * The '<em><b>BUFSKIMMING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFSKIMMING
	 * @model literal="BUF_SKIMMING"
	 * @generated
	 * @ordered
	 */
	public static final int BUFSKIMMING_VALUE = 7;

	/**
	 * The '<em><b>BUFINTENSIFIEDEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFINTENSIFIEDEXT
	 * @model literal="BUF_INTENSIFIED_EXT"
	 * @generated
	 * @ordered
	 */
	public static final int BUFINTENSIFIEDEXT_VALUE = 8;

	/**
	 * The '<em><b>BUFFORCEDEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFFORCEDEXT
	 * @model literal="BUF_FORCED_EXT"
	 * @generated
	 * @ordered
	 */
	public static final int BUFFORCEDEXT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Hov Buffer State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HovBufferStateType[] VALUES_ARRAY =
		new HovBufferStateType[] {
			BUFOFF,
			BUFREQPROTECTED,
			BUFREQACTIVE,
			BUFREQFINALIZING,
			BUFREQDONE,
			BUFRES,
			BUFFORCED,
			BUFSKIMMING,
			BUFINTENSIFIEDEXT,
			BUFFORCEDEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Hov Buffer State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HovBufferStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hov Buffer State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovBufferStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovBufferStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov Buffer State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovBufferStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HovBufferStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hov Buffer State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HovBufferStateType get(int value) {
		switch (value) {
			case BUFOFF_VALUE: return BUFOFF;
			case BUFREQPROTECTED_VALUE: return BUFREQPROTECTED;
			case BUFREQACTIVE_VALUE: return BUFREQACTIVE;
			case BUFREQFINALIZING_VALUE: return BUFREQFINALIZING;
			case BUFREQDONE_VALUE: return BUFREQDONE;
			case BUFRES_VALUE: return BUFRES;
			case BUFFORCED_VALUE: return BUFFORCED;
			case BUFSKIMMING_VALUE: return BUFSKIMMING;
			case BUFINTENSIFIEDEXT_VALUE: return BUFINTENSIFIEDEXT;
			case BUFFORCEDEXT_VALUE: return BUFFORCEDEXT;
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
	private HovBufferStateType(int value, String name, String literal) {
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
	
} //HovBufferStateType
