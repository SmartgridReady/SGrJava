/**
 */
package com.smartgridready.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Manufacturer ID Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.smartgridready.ns.v0.V0Package#getSGrManufacturerIDType()
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
	 * The '<em><b>Smart Eneryg Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1:manuf 1
	 * <!-- end-model-doc -->
	 * @see #SMART_ENERYG_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	SMART_ENERYG_LINK(1, "SmartEnerygLink", "SmartEnerygLink"),

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
	 * The '<em><b>ECar Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3:manuf 3
	 * <!-- end-model-doc -->
	 * @see #ECAR_UP_VALUE
	 * @generated
	 * @ordered
	 */
	ECAR_UP(3, "eCarUp", "eCarUp"),

	/**
	 * The '<em><b>Alfen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4:manuf 4
	 * <!-- end-model-doc -->
	 * @see #ALFEN_VALUE
	 * @generated
	 * @ordered
	 */
	ALFEN(4, "Alfen", "Alfen"),

	/**
	 * The '<em><b>Garo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5:manuf 5
	 * <!-- end-model-doc -->
	 * @see #GARO_VALUE
	 * @generated
	 * @ordered
	 */
	GARO(5, "Garo", "Garo"),

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
	 * The '<em><b>Webasco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 :manuf 8
	 * <!-- end-model-doc -->
	 * @see #WEBASCO_VALUE
	 * @generated
	 * @ordered
	 */
	WEBASCO(8, "Webasco", "Webasco"),

	/**
	 * The '<em><b>BESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 9: manuf 9
	 * <!-- end-model-doc -->
	 * @see #BESS_VALUE
	 * @generated
	 * @ordered
	 */
	BESS(9, "BESS", "BESS"),

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
	 * The '<em><b>Hoval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 13 :manuf 13
	 * <!-- end-model-doc -->
	 * @see #HOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	HOVAL(13, "Hoval", "Hoval"),

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
	 * The '<em><b>Stiebel Eltron</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * m15 :manuf 15
	 * <!-- end-model-doc -->
	 * @see #STIEBEL_ELTRON_VALUE
	 * @generated
	 * @ordered
	 */
	STIEBEL_ELTRON(15, "StiebelEltron", "Stiebel-Eltron"),

	/**
	 * The '<em><b>ABB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 :manuf 16
	 * <!-- end-model-doc -->
	 * @see #ABB_VALUE
	 * @generated
	 * @ordered
	 */
	ABB(16, "ABB", "ABB"),

	/**
	 * The '<em><b>Clemap AG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 18 :manuf 18
	 * <!-- end-model-doc -->
	 * @see #CLEMAP_AG_VALUE
	 * @generated
	 * @ordered
	 */
	CLEMAP_AG(18, "ClemapAG", "ClemapAG"),

	/**
	 * The '<em><b>Virtual Global Trading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 19 :manuf 19
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL_GLOBAL_TRADING_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_GLOBAL_TRADING(19, "VirtualGlobalTrading", "VirtualGlobalTrading"),

	/**
	 * The '<em><b>Heliotherm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20 :manuf 20
	 * <!-- end-model-doc -->
	 * @see #HELIOTHERM_VALUE
	 * @generated
	 * @ordered
	 */
	HELIOTHERM(20, "Heliotherm", "Heliotherm"),

	/**
	 * The '<em><b>Fronius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 21 :manuf 21
	 * <!-- end-model-doc -->
	 * @see #FRONIUS_VALUE
	 * @generated
	 * @ordered
	 */
	FRONIUS(21, "Fronius", "Fronius"),

	/**
	 * The '<em><b>Easy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 22 :manuf 22
	 * <!-- end-model-doc -->
	 * @see #EASY_VALUE
	 * @generated
	 * @ordered
	 */
	EASY(22, "easy", "easy"),

	/**
	 * The '<em><b>EV Tec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 23 :manuf 23
	 * <!-- end-model-doc -->
	 * @see #EV_TEC_VALUE
	 * @generated
	 * @ordered
	 */
	EV_TEC(23, "EVTec", "EVTec"),

	/**
	 * The '<em><b>OPTIMATIK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 24 :manuf 24
	 * <!-- end-model-doc -->
	 * @see #OPTIMATIK_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMATIK(24, "OPTIMATIK", "OPTIMATIK"),

	/**
	 * The '<em><b>Bender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 25 :manuf 25
	 * <!-- end-model-doc -->
	 * @see #BENDER_VALUE
	 * @generated
	 * @ordered
	 */
	BENDER(25, "Bender", "Bender"),

	/**
	 * The '<em><b>Manuf26</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 26 :manuf 26
	 * <!-- end-model-doc -->
	 * @see #MANUF26_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF26(26, "manuf26", "manuf_26"),

	/**
	 * The '<em><b>Manuf27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 27 :manuf 27
	 * <!-- end-model-doc -->
	 * @see #MANUF27_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF27(27, "manuf27", "manuf_27"),

	/**
	 * The '<em><b>Manuf28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 28 :manuf 28
	 * <!-- end-model-doc -->
	 * @see #MANUF28_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF28(28, "manuf28", "manuf_28"),

	/**
	 * The '<em><b>Manuf29</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 29 :manuf 29
	 * <!-- end-model-doc -->
	 * @see #MANUF29_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF29(29, "manuf29", "manuf_29"),

	/**
	 * The '<em><b>Manuf30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 30 :manuf 30
	 * <!-- end-model-doc -->
	 * @see #MANUF30_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF30(30, "manuf30", "manuf_30"),

	/**
	 * The '<em><b>Manuf31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 31 :manuf 31
	 * <!-- end-model-doc -->
	 * @see #MANUF31_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF31(31, "manuf31", "manuf_31"),

	/**
	 * The '<em><b>Manuf32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32 :manuf 32
	 * <!-- end-model-doc -->
	 * @see #MANUF32_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF32(32, "manuf32", "manuf_32"),

	/**
	 * The '<em><b>CTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 33 :manuf 33
	 * <!-- end-model-doc -->
	 * @see #CTA_VALUE
	 * @generated
	 * @ordered
	 */
	CTA(33, "CTA", "CTA"),

	/**
	 * The '<em><b>Lehmann AG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 34 :manuf 34
	 * <!-- end-model-doc -->
	 * @see #LEHMANN_AG_VALUE
	 * @generated
	 * @ordered
	 */
	LEHMANN_AG(34, "LehmannAG", "LehmannAG"),

	/**
	 * The '<em><b>Electrojoule Plutinsus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 35 :manuf 35
	 * <!-- end-model-doc -->
	 * @see #ELECTROJOULE_PLUTINSUS_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTROJOULE_PLUTINSUS(35, "ElectrojoulePlutinsus", "Electrojoule_Plutinsus"),

	/**
	 * The '<em><b>Manuf36</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 36 :manuf 36
	 * <!-- end-model-doc -->
	 * @see #MANUF36_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF36(36, "manuf36", "manuf_36"),

	/**
	 * The '<em><b>Manuf37</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 37 :manuf 37
	 * <!-- end-model-doc -->
	 * @see #MANUF37_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF37(37, "manuf37", "manuf_37"),

	/**
	 * The '<em><b>Swistec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 38 :manuf 38
	 * <!-- end-model-doc -->
	 * @see #SWISTEC_VALUE
	 * @generated
	 * @ordered
	 */
	SWISTEC(38, "Swistec", "Swistec"),

	/**
	 * The '<em><b>Manuf39</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 39 :manuf 39
	 * <!-- end-model-doc -->
	 * @see #MANUF39_VALUE
	 * @generated
	 * @ordered
	 */
	MANUF39(39, "manuf39", "manuf_39");

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
	 * The '<em><b>Smart Eneryg Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1:manuf 1
	 * <!-- end-model-doc -->
	 * @see #SMART_ENERYG_LINK
	 * @model name="SmartEnerygLink"
	 * @generated
	 * @ordered
	 */
	public static final int SMART_ENERYG_LINK_VALUE = 1;

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
	 * The '<em><b>ECar Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3:manuf 3
	 * <!-- end-model-doc -->
	 * @see #ECAR_UP
	 * @model name="eCarUp"
	 * @generated
	 * @ordered
	 */
	public static final int ECAR_UP_VALUE = 3;

	/**
	 * The '<em><b>Alfen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4:manuf 4
	 * <!-- end-model-doc -->
	 * @see #ALFEN
	 * @model name="Alfen"
	 * @generated
	 * @ordered
	 */
	public static final int ALFEN_VALUE = 4;

	/**
	 * The '<em><b>Garo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5:manuf 5
	 * <!-- end-model-doc -->
	 * @see #GARO
	 * @model name="Garo"
	 * @generated
	 * @ordered
	 */
	public static final int GARO_VALUE = 5;

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
	 * The '<em><b>Webasco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8 :manuf 8
	 * <!-- end-model-doc -->
	 * @see #WEBASCO
	 * @model name="Webasco"
	 * @generated
	 * @ordered
	 */
	public static final int WEBASCO_VALUE = 8;

	/**
	 * The '<em><b>BESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 9: manuf 9
	 * <!-- end-model-doc -->
	 * @see #BESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BESS_VALUE = 9;

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
	 * The '<em><b>Hoval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 13 :manuf 13
	 * <!-- end-model-doc -->
	 * @see #HOVAL
	 * @model name="Hoval"
	 * @generated
	 * @ordered
	 */
	public static final int HOVAL_VALUE = 13;

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
	 * The '<em><b>Stiebel Eltron</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * m15 :manuf 15
	 * <!-- end-model-doc -->
	 * @see #STIEBEL_ELTRON
	 * @model name="StiebelEltron" literal="Stiebel-Eltron"
	 * @generated
	 * @ordered
	 */
	public static final int STIEBEL_ELTRON_VALUE = 15;

	/**
	 * The '<em><b>ABB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16 :manuf 16
	 * <!-- end-model-doc -->
	 * @see #ABB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABB_VALUE = 16;

	/**
	 * The '<em><b>Clemap AG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 18 :manuf 18
	 * <!-- end-model-doc -->
	 * @see #CLEMAP_AG
	 * @model name="ClemapAG"
	 * @generated
	 * @ordered
	 */
	public static final int CLEMAP_AG_VALUE = 18;

	/**
	 * The '<em><b>Virtual Global Trading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 19 :manuf 19
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL_GLOBAL_TRADING
	 * @model name="VirtualGlobalTrading"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_GLOBAL_TRADING_VALUE = 19;

	/**
	 * The '<em><b>Heliotherm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20 :manuf 20
	 * <!-- end-model-doc -->
	 * @see #HELIOTHERM
	 * @model name="Heliotherm"
	 * @generated
	 * @ordered
	 */
	public static final int HELIOTHERM_VALUE = 20;

	/**
	 * The '<em><b>Fronius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 21 :manuf 21
	 * <!-- end-model-doc -->
	 * @see #FRONIUS
	 * @model name="Fronius"
	 * @generated
	 * @ordered
	 */
	public static final int FRONIUS_VALUE = 21;

	/**
	 * The '<em><b>Easy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 22 :manuf 22
	 * <!-- end-model-doc -->
	 * @see #EASY
	 * @model name="easy"
	 * @generated
	 * @ordered
	 */
	public static final int EASY_VALUE = 22;

	/**
	 * The '<em><b>EV Tec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 23 :manuf 23
	 * <!-- end-model-doc -->
	 * @see #EV_TEC
	 * @model name="EVTec"
	 * @generated
	 * @ordered
	 */
	public static final int EV_TEC_VALUE = 23;

	/**
	 * The '<em><b>OPTIMATIK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 24 :manuf 24
	 * <!-- end-model-doc -->
	 * @see #OPTIMATIK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMATIK_VALUE = 24;

	/**
	 * The '<em><b>Bender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 25 :manuf 25
	 * <!-- end-model-doc -->
	 * @see #BENDER
	 * @model name="Bender"
	 * @generated
	 * @ordered
	 */
	public static final int BENDER_VALUE = 25;

	/**
	 * The '<em><b>Manuf26</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 26 :manuf 26
	 * <!-- end-model-doc -->
	 * @see #MANUF26
	 * @model name="manuf26" literal="manuf_26"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF26_VALUE = 26;

	/**
	 * The '<em><b>Manuf27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 27 :manuf 27
	 * <!-- end-model-doc -->
	 * @see #MANUF27
	 * @model name="manuf27" literal="manuf_27"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF27_VALUE = 27;

	/**
	 * The '<em><b>Manuf28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 28 :manuf 28
	 * <!-- end-model-doc -->
	 * @see #MANUF28
	 * @model name="manuf28" literal="manuf_28"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF28_VALUE = 28;

	/**
	 * The '<em><b>Manuf29</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 29 :manuf 29
	 * <!-- end-model-doc -->
	 * @see #MANUF29
	 * @model name="manuf29" literal="manuf_29"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF29_VALUE = 29;

	/**
	 * The '<em><b>Manuf30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 30 :manuf 30
	 * <!-- end-model-doc -->
	 * @see #MANUF30
	 * @model name="manuf30" literal="manuf_30"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF30_VALUE = 30;

	/**
	 * The '<em><b>Manuf31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 31 :manuf 31
	 * <!-- end-model-doc -->
	 * @see #MANUF31
	 * @model name="manuf31" literal="manuf_31"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF31_VALUE = 31;

	/**
	 * The '<em><b>Manuf32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32 :manuf 32
	 * <!-- end-model-doc -->
	 * @see #MANUF32
	 * @model name="manuf32" literal="manuf_32"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF32_VALUE = 32;

	/**
	 * The '<em><b>CTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 33 :manuf 33
	 * <!-- end-model-doc -->
	 * @see #CTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTA_VALUE = 33;

	/**
	 * The '<em><b>Lehmann AG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 34 :manuf 34
	 * <!-- end-model-doc -->
	 * @see #LEHMANN_AG
	 * @model name="LehmannAG"
	 * @generated
	 * @ordered
	 */
	public static final int LEHMANN_AG_VALUE = 34;

	/**
	 * The '<em><b>Electrojoule Plutinsus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 35 :manuf 35
	 * <!-- end-model-doc -->
	 * @see #ELECTROJOULE_PLUTINSUS
	 * @model name="ElectrojoulePlutinsus" literal="Electrojoule_Plutinsus"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTROJOULE_PLUTINSUS_VALUE = 35;

	/**
	 * The '<em><b>Manuf36</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 36 :manuf 36
	 * <!-- end-model-doc -->
	 * @see #MANUF36
	 * @model name="manuf36" literal="manuf_36"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF36_VALUE = 36;

	/**
	 * The '<em><b>Manuf37</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 37 :manuf 37
	 * <!-- end-model-doc -->
	 * @see #MANUF37
	 * @model name="manuf37" literal="manuf_37"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF37_VALUE = 37;

	/**
	 * The '<em><b>Swistec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 38 :manuf 38
	 * <!-- end-model-doc -->
	 * @see #SWISTEC
	 * @model name="Swistec"
	 * @generated
	 * @ordered
	 */
	public static final int SWISTEC_VALUE = 38;

	/**
	 * The '<em><b>Manuf39</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 39 :manuf 39
	 * <!-- end-model-doc -->
	 * @see #MANUF39
	 * @model name="manuf39" literal="manuf_39"
	 * @generated
	 * @ordered
	 */
	public static final int MANUF39_VALUE = 39;

	/**
	 * An array of all the '<em><b>SGr Manufacturer ID Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrManufacturerIDType[] VALUES_ARRAY =
		new SGrManufacturerIDType[] {
			THIRD_PARTY_SRC_INFO,
			SMART_ENERYG_LINK,
			IBT,
			ECAR_UP,
			ALFEN,
			GARO,
			SOLAR_MANAGER,
			BELEVO,
			WEBASCO,
			BESS,
			EXNATON,
			MEO_ENERGY,
			ROBOTRON,
			HOVAL,
			WAGO,
			STIEBEL_ELTRON,
			ABB,
			CLEMAP_AG,
			VIRTUAL_GLOBAL_TRADING,
			HELIOTHERM,
			FRONIUS,
			EASY,
			EV_TEC,
			OPTIMATIK,
			BENDER,
			MANUF26,
			MANUF27,
			MANUF28,
			MANUF29,
			MANUF30,
			MANUF31,
			MANUF32,
			CTA,
			LEHMANN_AG,
			ELECTROJOULE_PLUTINSUS,
			MANUF36,
			MANUF37,
			SWISTEC,
			MANUF39,
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
			case SMART_ENERYG_LINK_VALUE: return SMART_ENERYG_LINK;
			case IBT_VALUE: return IBT;
			case ECAR_UP_VALUE: return ECAR_UP;
			case ALFEN_VALUE: return ALFEN;
			case GARO_VALUE: return GARO;
			case SOLAR_MANAGER_VALUE: return SOLAR_MANAGER;
			case BELEVO_VALUE: return BELEVO;
			case WEBASCO_VALUE: return WEBASCO;
			case BESS_VALUE: return BESS;
			case EXNATON_VALUE: return EXNATON;
			case MEO_ENERGY_VALUE: return MEO_ENERGY;
			case ROBOTRON_VALUE: return ROBOTRON;
			case HOVAL_VALUE: return HOVAL;
			case WAGO_VALUE: return WAGO;
			case STIEBEL_ELTRON_VALUE: return STIEBEL_ELTRON;
			case ABB_VALUE: return ABB;
			case CLEMAP_AG_VALUE: return CLEMAP_AG;
			case VIRTUAL_GLOBAL_TRADING_VALUE: return VIRTUAL_GLOBAL_TRADING;
			case HELIOTHERM_VALUE: return HELIOTHERM;
			case FRONIUS_VALUE: return FRONIUS;
			case EASY_VALUE: return EASY;
			case EV_TEC_VALUE: return EV_TEC;
			case OPTIMATIK_VALUE: return OPTIMATIK;
			case BENDER_VALUE: return BENDER;
			case MANUF26_VALUE: return MANUF26;
			case MANUF27_VALUE: return MANUF27;
			case MANUF28_VALUE: return MANUF28;
			case MANUF29_VALUE: return MANUF29;
			case MANUF30_VALUE: return MANUF30;
			case MANUF31_VALUE: return MANUF31;
			case MANUF32_VALUE: return MANUF32;
			case CTA_VALUE: return CTA;
			case LEHMANN_AG_VALUE: return LEHMANN_AG;
			case ELECTROJOULE_PLUTINSUS_VALUE: return ELECTROJOULE_PLUTINSUS;
			case MANUF36_VALUE: return MANUF36;
			case MANUF37_VALUE: return MANUF37;
			case SWISTEC_VALUE: return SWISTEC;
			case MANUF39_VALUE: return MANUF39;
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
	
} //SGrManufacturerIDType
