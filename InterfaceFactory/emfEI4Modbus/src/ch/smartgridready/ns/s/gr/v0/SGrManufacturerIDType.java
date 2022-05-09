/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Manufacturer ID Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrManufacturerIDType()
 * @model extendedMetaData="name='SGrManufacturerIDType'"
 * @generated
 */
public enum SGrManufacturerIDType implements Enumerator {
	/**
	 * The '<em><b>Third Party Src Info</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0:manuf 0
	 * <!-- end-model-doc -->
	 * @see #THIRD_PARTY_SRC_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_PARTY_SRC_INFO(0, "thirdPartySrcInfo", "thirdPartySrcInfo"),

	/**
	 * The '<em><b>Clemap AG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1:manuf 1
	 * <!-- end-model-doc -->
	 * @see #CLEMAP_AG_VALUE
	 * @generated
	 * @ordered
	 */
	CLEMAP_AG(1, "ClemapAG", "ClemapAG"),

	/**
	 * The '<em><b>IBT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2:manuf 2
	 * <!-- end-model-doc -->
	 * @see #IBT_VALUE
	 * @generated
	 * @ordered
	 */
	IBT(2, "IBT", "IBT"),

	/**
	 * The '<em><b>Virtual Global Trading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3:manuf 3
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL_GLOBAL_TRADING_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_GLOBAL_TRADING(3, "VirtualGlobalTrading", "VirtualGlobalTrading"),

	/**
	 * The '<em><b>Smart Energy Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4:manuf 4
	 * <!-- end-model-doc -->
	 * @see #SMART_ENERGY_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	SMART_ENERGY_LINK(4, "SmartEnergyLink", "SmartEnergyLink"),

	/**
	 * The '<em><b>Invisia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5:manuf 5
	 * <!-- end-model-doc -->
	 * @see #INVISIA_VALUE
	 * @generated
	 * @ordered
	 */
	INVISIA(5, "Invisia", "Invisia"),

	/**
	 * The '<em><b>Solar Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6:manuf 6
	 * <!-- end-model-doc -->
	 * @see #SOLAR_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	SOLAR_MANAGER(6, "SolarManager", "SolarManager"),

	/**
	 * The '<em><b>BELEVO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7:manuf 7
	 * <!-- end-model-doc -->
	 * @see #BELEVO_VALUE
	 * @generated
	 * @ordered
	 */
	BELEVO(7, "BELEVO", "BELEVO"),

	/**
	 * The '<em><b>ECar Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 :manuf 8
	 * <!-- end-model-doc -->
	 * @see #ECAR_UP_VALUE
	 * @generated
	 * @ordered
	 */
	ECAR_UP(8, "eCarUp", "eCarUp"),

	/**
	 * The '<em><b>Electrojoule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 9: manuf 9
	 * <!-- end-model-doc -->
	 * @see #ELECTROJOULE_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTROJOULE(9, "Electrojoule", "Electrojoule"),

	/**
	 * The '<em><b>Exnaton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10 :manuf 10
	 * <!-- end-model-doc -->
	 * @see #EXNATON_VALUE
	 * @generated
	 * @ordered
	 */
	EXNATON(10, "Exnaton", "Exnaton"),

	/**
	 * The '<em><b>Meo ENERGY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 11 :manuf 11
	 * <!-- end-model-doc -->
	 * @see #MEO_ENERGY_VALUE
	 * @generated
	 * @ordered
	 */
	MEO_ENERGY(11, "meoENERGY", "meoENERGY"),

	/**
	 * The '<em><b>Robotron</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12: manuf 12
	 * <!-- end-model-doc -->
	 * @see #ROBOTRON_VALUE
	 * @generated
	 * @ordered
	 */
	ROBOTRON(12, "Robotron", "Robotron"),

	/**
	 * The '<em><b>Top Solarisone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 13 :manuf 13
	 * <!-- end-model-doc -->
	 * @see #TOP_SOLARISONE_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_SOLARISONE(13, "topSolarisone", "topSolarisone"),

	/**
	 * The '<em><b>WAGO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 14 :manuf 14
	 * <!-- end-model-doc -->
	 * @see #WAGO_VALUE
	 * @generated
	 * @ordered
	 */
	WAGO(14, "WAGO", "WAGO"),

	/**
	 * The '<em><b>Swistec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * m15 :manuf 15
	 * <!-- end-model-doc -->
	 * @see #SWISTEC_VALUE
	 * @generated
	 * @ordered
	 */
	SWISTEC(15, "Swistec", "Swistec"),

	/**
	 * The '<em><b>Go Zmart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 :manuf 16
	 * <!-- end-model-doc -->
	 * @see #GO_ZMART_VALUE
	 * @generated
	 * @ordered
	 */
	GO_ZMART(16, "goZmart", "goZmart"),

	/**
	 * The '<em><b>Hoval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 17 :manuf 17
	 * <!-- end-model-doc -->
	 * @see #HOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	HOVAL(17, "Hoval", "Hoval"), /**
	 * The '<em><b>CTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 18 :manuf 18
	 * <!-- end-model-doc -->
	 * @see #CTA_VALUE
	 * @generated
	 * @ordered
	 */
	CTA(18, "CTA", "CTA"), /**
	 * The '<em><b>Heliotherm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 19 :manuf 19
	 * <!-- end-model-doc -->
	 * @see #HELIOTHERM_VALUE
	 * @generated
	 * @ordered
	 */
	HELIOTHERM(19, "Heliotherm", "Heliotherm"), /**
	 * The '<em><b>M20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20 :manuf 20
	 * <!-- end-model-doc -->
	 * @see #M20_VALUE
	 * @generated
	 * @ordered
	 */
	M20(20, "m20", "m20");

	/**
	 * The '<em><b>Third Party Src Info</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0:manuf 0
	 * <!-- end-model-doc -->
	 * @see #THIRD_PARTY_SRC_INFO
	 * @model name="thirdPartySrcInfo"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_PARTY_SRC_INFO_VALUE = 0;

	/**
	 * The '<em><b>Clemap AG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1:manuf 1
	 * <!-- end-model-doc -->
	 * @see #CLEMAP_AG
	 * @model name="ClemapAG"
	 * @generated
	 * @ordered
	 */
	public static final int CLEMAP_AG_VALUE = 1;

	/**
	 * The '<em><b>IBT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2:manuf 2
	 * <!-- end-model-doc -->
	 * @see #IBT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IBT_VALUE = 2;

	/**
	 * The '<em><b>Virtual Global Trading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3:manuf 3
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL_GLOBAL_TRADING
	 * @model name="VirtualGlobalTrading"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_GLOBAL_TRADING_VALUE = 3;

	/**
	 * The '<em><b>Smart Energy Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4:manuf 4
	 * <!-- end-model-doc -->
	 * @see #SMART_ENERGY_LINK
	 * @model name="SmartEnergyLink"
	 * @generated
	 * @ordered
	 */
	public static final int SMART_ENERGY_LINK_VALUE = 4;

	/**
	 * The '<em><b>Invisia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5:manuf 5
	 * <!-- end-model-doc -->
	 * @see #INVISIA
	 * @model name="Invisia"
	 * @generated
	 * @ordered
	 */
	public static final int INVISIA_VALUE = 5;

	/**
	 * The '<em><b>Solar Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 6:manuf 6
	 * <!-- end-model-doc -->
	 * @see #SOLAR_MANAGER
	 * @model name="SolarManager"
	 * @generated
	 * @ordered
	 */
	public static final int SOLAR_MANAGER_VALUE = 6;

	/**
	 * The '<em><b>BELEVO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7:manuf 7
	 * <!-- end-model-doc -->
	 * @see #BELEVO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BELEVO_VALUE = 7;

	/**
	 * The '<em><b>ECar Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 :manuf 8
	 * <!-- end-model-doc -->
	 * @see #ECAR_UP
	 * @model name="eCarUp"
	 * @generated
	 * @ordered
	 */
	public static final int ECAR_UP_VALUE = 8;

	/**
	 * The '<em><b>Electrojoule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 9: manuf 9
	 * <!-- end-model-doc -->
	 * @see #ELECTROJOULE
	 * @model name="Electrojoule"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTROJOULE_VALUE = 9;

	/**
	 * The '<em><b>Exnaton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10 :manuf 10
	 * <!-- end-model-doc -->
	 * @see #EXNATON
	 * @model name="Exnaton"
	 * @generated
	 * @ordered
	 */
	public static final int EXNATON_VALUE = 10;

	/**
	 * The '<em><b>Meo ENERGY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 11 :manuf 11
	 * <!-- end-model-doc -->
	 * @see #MEO_ENERGY
	 * @model name="meoENERGY"
	 * @generated
	 * @ordered
	 */
	public static final int MEO_ENERGY_VALUE = 11;

	/**
	 * The '<em><b>Robotron</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12: manuf 12
	 * <!-- end-model-doc -->
	 * @see #ROBOTRON
	 * @model name="Robotron"
	 * @generated
	 * @ordered
	 */
	public static final int ROBOTRON_VALUE = 12;

	/**
	 * The '<em><b>Top Solarisone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 13 :manuf 13
	 * <!-- end-model-doc -->
	 * @see #TOP_SOLARISONE
	 * @model name="topSolarisone"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_SOLARISONE_VALUE = 13;

	/**
	 * The '<em><b>WAGO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 14 :manuf 14
	 * <!-- end-model-doc -->
	 * @see #WAGO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAGO_VALUE = 14;

	/**
	 * The '<em><b>Swistec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * m15 :manuf 15
	 * <!-- end-model-doc -->
	 * @see #SWISTEC
	 * @model name="Swistec"
	 * @generated
	 * @ordered
	 */
	public static final int SWISTEC_VALUE = 15;

	/**
	 * The '<em><b>Go Zmart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 :manuf 16
	 * <!-- end-model-doc -->
	 * @see #GO_ZMART
	 * @model name="goZmart"
	 * @generated
	 * @ordered
	 */
	public static final int GO_ZMART_VALUE = 16;

	/**
	 * The '<em><b>Hoval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 17 :manuf 17
	 * <!-- end-model-doc -->
	 * @see #HOVAL
	 * @model name="Hoval"
	 * @generated
	 * @ordered
	 */
	public static final int HOVAL_VALUE = 17;

	/**
	 * The '<em><b>CTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 18 :manuf 18
	 * <!-- end-model-doc -->
	 * @see #CTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTA_VALUE = 18;

	/**
	 * The '<em><b>Heliotherm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 19 :manuf 19
	 * <!-- end-model-doc -->
	 * @see #HELIOTHERM
	 * @model name="Heliotherm"
	 * @generated
	 * @ordered
	 */
	public static final int HELIOTHERM_VALUE = 19;

	/**
	 * The '<em><b>M20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20 :manuf 20
	 * <!-- end-model-doc -->
	 * @see #M20
	 * @model name="m20"
	 * @generated
	 * @ordered
	 */
	public static final int M20_VALUE = 20;

	/**
	 * An array of all the '<em><b>SGr Manufacturer ID Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrManufacturerIDType[] VALUES_ARRAY =
		new SGrManufacturerIDType[] {
			THIRD_PARTY_SRC_INFO,
			CLEMAP_AG,
			IBT,
			VIRTUAL_GLOBAL_TRADING,
			SMART_ENERGY_LINK,
			INVISIA,
			SOLAR_MANAGER,
			BELEVO,
			ECAR_UP,
			ELECTROJOULE,
			EXNATON,
			MEO_ENERGY,
			ROBOTRON,
			TOP_SOLARISONE,
			WAGO,
			SWISTEC,
			GO_ZMART,
			HOVAL,
			CTA,
			HELIOTHERM,
			M20,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Manufacturer ID Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrManufacturerIDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Manufacturer ID Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrManufacturerIDType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrManufacturerIDType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Manufacturer ID Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrManufacturerIDType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrManufacturerIDType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Manufacturer ID Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrManufacturerIDType get(int value) {
		switch (value) {
			case THIRD_PARTY_SRC_INFO_VALUE: return THIRD_PARTY_SRC_INFO;
			case CLEMAP_AG_VALUE: return CLEMAP_AG;
			case IBT_VALUE: return IBT;
			case VIRTUAL_GLOBAL_TRADING_VALUE: return VIRTUAL_GLOBAL_TRADING;
			case SMART_ENERGY_LINK_VALUE: return SMART_ENERGY_LINK;
			case INVISIA_VALUE: return INVISIA;
			case SOLAR_MANAGER_VALUE: return SOLAR_MANAGER;
			case BELEVO_VALUE: return BELEVO;
			case ECAR_UP_VALUE: return ECAR_UP;
			case ELECTROJOULE_VALUE: return ELECTROJOULE;
			case EXNATON_VALUE: return EXNATON;
			case MEO_ENERGY_VALUE: return MEO_ENERGY;
			case ROBOTRON_VALUE: return ROBOTRON;
			case TOP_SOLARISONE_VALUE: return TOP_SOLARISONE;
			case WAGO_VALUE: return WAGO;
			case SWISTEC_VALUE: return SWISTEC;
			case GO_ZMART_VALUE: return GO_ZMART;
			case HOVAL_VALUE: return HOVAL;
			case CTA_VALUE: return CTA;
			case HELIOTHERM_VALUE: return HELIOTHERM;
			case M20_VALUE: return M20;
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
	private SGrManufacturerIDType(int value, String name, String literal) {
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
	
} //SGrManufacturerIDType
