/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cta HC Op Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ecta004:
 *      map for CTA Heatpump HeatCool modes Automatik
 * #1 Komfort
 * #2 Reduziert
 * #3 Frostschutz/Aus
 * #4 Notbetrieb
 * 
 * <!-- end-model-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getCtaHCOpModeType()
 * @model extendedMetaData="name='ctaHCOpModeType'"
 * @generated
 */
public enum CtaHCOpModeType implements Enumerator {
	/**
	 * The '<em><b>HPNULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPNULL_VALUE
	 * @generated
	 * @ordered
	 */
	HPNULL(0, "HPNULL", "HP_NULL"),

	/**
	 * The '<em><b>HPCOMFORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOMFORT_VALUE
	 * @generated
	 * @ordered
	 */
	HPCOMFORT(1, "HPCOMFORT", "HP_COMFORT"),

	/**
	 * The '<em><b>HPECO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPECO_VALUE
	 * @generated
	 * @ordered
	 */
	HPECO(2, "HPECO", "HP_ECO"),

	/**
	 * The '<em><b>HPDEFROST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROST_VALUE
	 * @generated
	 * @ordered
	 */
	HPDEFROST(3, "HPDEFROST", "HP_DEFROST"),

	/**
	 * The '<em><b>HPEMERGENCYOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEMERGENCYOP_VALUE
	 * @generated
	 * @ordered
	 */
	HPEMERGENCYOP(4, "HPEMERGENCYOP", "HP_EMERGENCY_OP");

	/**
	 * The '<em><b>HPNULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPNULL
	 * @model literal="HP_NULL"
	 * @generated
	 * @ordered
	 */
	public static final int HPNULL_VALUE = 0;

	/**
	 * The '<em><b>HPCOMFORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCOMFORT
	 * @model literal="HP_COMFORT"
	 * @generated
	 * @ordered
	 */
	public static final int HPCOMFORT_VALUE = 1;

	/**
	 * The '<em><b>HPECO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPECO
	 * @model literal="HP_ECO"
	 * @generated
	 * @ordered
	 */
	public static final int HPECO_VALUE = 2;

	/**
	 * The '<em><b>HPDEFROST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPDEFROST
	 * @model literal="HP_DEFROST"
	 * @generated
	 * @ordered
	 */
	public static final int HPDEFROST_VALUE = 3;

	/**
	 * The '<em><b>HPEMERGENCYOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPEMERGENCYOP
	 * @model literal="HP_EMERGENCY_OP"
	 * @generated
	 * @ordered
	 */
	public static final int HPEMERGENCYOP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cta HC Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CtaHCOpModeType[] VALUES_ARRAY =
		new CtaHCOpModeType[] {
			HPNULL,
			HPCOMFORT,
			HPECO,
			HPDEFROST,
			HPEMERGENCYOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Cta HC Op Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CtaHCOpModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cta HC Op Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHCOpModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaHCOpModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta HC Op Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHCOpModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtaHCOpModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cta HC Op Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtaHCOpModeType get(int value) {
		switch (value) {
			case HPNULL_VALUE: return HPNULL;
			case HPCOMFORT_VALUE: return HPCOMFORT;
			case HPECO_VALUE: return HPECO;
			case HPDEFROST_VALUE: return HPDEFROST;
			case HPEMERGENCYOP_VALUE: return HPEMERGENCYOP;
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
	private CtaHCOpModeType(int value, String name, String literal) {
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
	
} //CtaHCOpModeType
