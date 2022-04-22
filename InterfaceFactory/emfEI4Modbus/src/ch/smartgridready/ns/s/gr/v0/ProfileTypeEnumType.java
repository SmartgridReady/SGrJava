/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Profile Type Enum Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getProfileTypeEnumType()
 * @model extendedMetaData="name='ProfileTypeEnumType'"
 * @generated
 */
public enum ProfileTypeEnumType implements Enumerator {
	/**
	 * The '<em><b>Battery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1: Batterie
	 * <!-- end-model-doc -->
	 * @see #BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY(0, "Battery", "Battery"),

	/**
	 * The '<em><b>Compressor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2: Kompressor
	 * <!-- end-model-doc -->
	 * @see #COMPRESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSOR(1, "Compressor", "Compressor"),

	/**
	 * The '<em><b>Device Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3: Geräteinformation
	 * <!-- end-model-doc -->
	 * @see #DEVICE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_INFORMATION(2, "DeviceInformation", "DeviceInformation"),

	/**
	 * The '<em><b>DHW Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4: WarmWasserHeizung
	 * <!-- end-model-doc -->
	 * @see #DHW_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	DHW_CIRCUIT(3, "DHWCircuit", "DHWCircuit"),

	/**
	 * The '<em><b>DHW Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5: WarmWasserSpeicher
	 * <!-- end-model-doc -->
	 * @see #DHW_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DHW_STORAGE(4, "DHWStorage", "DHWStorage"),

	/**
	 * The '<em><b>Dishwasher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  6: Geschirrspülmaschine
	 * 					
	 * <!-- end-model-doc -->
	 * @see #DISHWASHER_VALUE
	 * @generated
	 * @ordered
	 */
	DISHWASHER(5, "Dishwasher", "Dishwasher"),

	/**
	 * The '<em><b>Dryer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7: Trockner
	 * <!-- end-model-doc -->
	 * @see #DRYER_VALUE
	 * @generated
	 * @ordered
	 */
	DRYER(6, "Dryer", "Dryer"),

	/**
	 * The '<em><b>Electrical Immersion Heater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8: elTauchSieder
	 * <!-- end-model-doc -->
	 * @see #ELECTRICAL_IMMERSION_HEATER_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL_IMMERSION_HEATER(7, "ElectricalImmersionHeater", "ElectricalImmersionHeater"),

	/**
	 * The '<em><b>Fan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 9: Ventilator
	 * <!-- end-model-doc -->
	 * @see #FAN_VALUE
	 * @generated
	 * @ordered
	 */
	FAN(8, "Fan", "Fan"),

	/**
	 * The '<em><b>Gas Heating Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10: GasWärmeAnwendung
	 * <!-- end-model-doc -->
	 * @see #GAS_HEATING_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	GAS_HEATING_APPLIANCE(9, "GasHeatingAppliance", "GasHeatingAppliance"),

	/**
	 * The '<em><b>Non Specific</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 11: allgemein verwendbar
	 * <!-- end-model-doc -->
	 * @see #NON_SPECIFIC_VALUE
	 * @generated
	 * @ordered
	 */
	NON_SPECIFIC(10, "NonSpecific", "NonSpecific"),

	/**
	 * The '<em><b>Heating Buffer Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  12: WaermeBufferSpeicher
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEATING_BUFFER_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_BUFFER_STORAGE(11, "HeatingBufferStorage", "HeatingBufferStorage"),

	/**
	 * The '<em><b>Heating Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 13: Heizkreis
	 * <!-- end-model-doc -->
	 * @see #HEATING_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_CIRCUIT(12, "HeatingCircuit", "HeatingCircuit"),

	/**
	 * The '<em><b>Heating Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 14: Heizungsobjekt
	 * <!-- end-model-doc -->
	 * @see #HEATING_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_OBJECT(13, "HeatingObject", "HeatingObject"),

	/**
	 * The '<em><b>Heating Zone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 15: Heizzone
	 * <!-- end-model-doc -->
	 * @see #HEATING_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_ZONE(14, "HeatingZone", "HeatingZone"),

	/**
	 * The '<em><b>Heat Pump Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  16: WärmePumpenAnwendung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEAT_PUMP_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_PUMP_CONTROL(15, "HeatPumpControl", "HeatPumpControl"),

	/**
	 * The '<em><b>Heat Sink Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  17: KuehlKoerperSchaltung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEAT_SINK_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_SINK_CIRCUIT(16, "HeatSinkCircuit", "HeatSinkCircuit"),

	/**
	 * The '<em><b>Heat Source Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  18: WärmekörperSchaltung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEAT_SOURCE_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_SOURCE_CIRCUIT(17, "HeatSourceCircuit", "HeatSourceCircuit"),

	/**
	 * The '<em><b>Heat Source Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 19: Wärmequelle
	 * <!-- end-model-doc -->
	 * @see #HEAT_SOURCE_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_SOURCE_UNIT(18, "HeatSourceUnit", "HeatSourceUnit"),

	/**
	 * The '<em><b>HVAC Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20: HLKController
	 * <!-- end-model-doc -->
	 * @see #HVAC_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	HVAC_CONTROLLER(19, "HVACController", "HVACController"),

	/**
	 * The '<em><b>HVAC Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 21: HLKRaum
	 * <!-- end-model-doc -->
	 * @see #HVAC_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	HVAC_ROOM(20, "HVACRoom", "HVACRoom"),

	/**
	 * The '<em><b>Instant DHW Heater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  22: DurchflussWarmwasserHeizung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #INSTANT_DHW_HEATER_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT_DHW_HEATER(21, "InstantDHWHeater", "InstantDHWHeater"),

	/**
	 * The '<em><b>Inverter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  23: Wechselrichter / Wandler
	 * 					
	 * <!-- end-model-doc -->
	 * @see #INVERTER_VALUE
	 * @generated
	 * @ordered
	 */
	INVERTER(22, "Inverter", "Inverter"),

	/**
	 * The '<em><b>Oil Heating Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  24: OelWaermeAnwendung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #OIL_HEATING_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	OIL_HEATING_APPLIANCE(23, "OilHeatingAppliance", "OilHeatingAppliance"),

	/**
	 * The '<em><b>Pump</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 25: Pumpe
	 * <!-- end-model-doc -->
	 * @see #PUMP_VALUE
	 * @generated
	 * @ordered
	 */
	PUMP(24, "Pump", "Pump"),

	/**
	 * The '<em><b>Refrigerant Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  26: Kältemittelkreislauf
	 * 					
	 * <!-- end-model-doc -->
	 * @see #REFRIGERANT_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	REFRIGERANT_CIRCUIT(25, "RefrigerantCircuit", "RefrigerantCircuit"),

	/**
	 * The '<em><b>Smart Energy Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  27: SmartEnergyAppliance
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SMART_ENERGY_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SMART_ENERGY_APPLIANCE(26, "SmartEnergyAppliance", "SmartEnergyAppliance"),

	/**
	 * The '<em><b>Solar DHW Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  28: SolarWarmwasserSpeicher
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SOLAR_DHW_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLAR_DHW_STORAGE(27, "SolarDHWStorage", "SolarDHWStorage"),

	/**
	 * The '<em><b>Solar Thermal Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  SolarWarmwasserKreislauf
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SOLAR_THERMAL_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	SOLAR_THERMAL_CIRCUIT(28, "SolarThermalCircuit", "SolarThermalCircuit"),

	/**
	 * The '<em><b>Sub Meter Electricity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  30: SubMeter Elektrisch
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SUB_METER_ELECTRICITY_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_METER_ELECTRICITY(29, "SubMeterElectricity", "SubMeterElectricity"),

	/**
	 * The '<em><b>Temperature Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 31: Temperatursensor
	 * <!-- end-model-doc -->
	 * @see #TEMPERATURE_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE_SENSOR(30, "TemperatureSensor", "TemperatureSensor"),

	/**
	 * The '<em><b>Washer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32: Waschmaschine
	 * <!-- end-model-doc -->
	 * @see #WASHER_VALUE
	 * @generated
	 * @ordered
	 */
	WASHER(31, "Washer", "Washer"),

	/**
	 * The '<em><b>Battery System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 33: Batteriesystem
	 * <!-- end-model-doc -->
	 * @see #BATTERY_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY_SYSTEM(32, "BatterySystem", "BatterySystem"),

	/**
	 * The '<em><b>Electricity Generation System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  34: Generator Elektrisch
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ELECTRICITY_GENERATION_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICITY_GENERATION_SYSTEM(33, "ElectricityGenerationSystem", "ElectricityGenerationSystem"),

	/**
	 * The '<em><b>Electricity Storage System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  35: ElektroSpeicher System
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ELECTRICITY_STORAGE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICITY_STORAGE_SYSTEM(34, "ElectricityStorageSystem", "ElectricityStorageSystem"),

	/**
	 * The '<em><b>SGCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  31: GridConnectionPoint Nachbarschaft
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SGCP_VALUE
	 * @generated
	 * @ordered
	 */
	SGCP(35, "SGCP", "SGCP"),

	/**
	 * The '<em><b>Household</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 327: Haushalt
	 * <!-- end-model-doc -->
	 * @see #HOUSEHOLD_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSEHOLD(36, "Household", "Household"),

	/**
	 * The '<em><b>PV System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 38: PV System
	 * <!-- end-model-doc -->
	 * @see #PV_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	PV_SYSTEM(37, "PVSystem", "PVSystem"),

	/**
	 * The '<em><b>EV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 39: Elektromobil
	 * <!-- end-model-doc -->
	 * @see #EV_VALUE
	 * @generated
	 * @ordered
	 */
	EV(38, "EV", "EV"),

	/**
	 * The '<em><b>EVSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  40: Ladestationscontroller für Elektrofahrzeug
	 * 					
	 * <!-- end-model-doc -->
	 * @see #EVSE_VALUE
	 * @generated
	 * @ordered
	 */
	EVSE(39, "EVSE", "EVSE"),

	/**
	 * The '<em><b>Charging Outlet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 41: Ladestation
	 * <!-- end-model-doc -->
	 * @see #CHARGING_OUTLET_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING_OUTLET(40, "ChargingOutlet", "ChargingOutlet"),

	/**
	 * The '<em><b>CEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  42: Energiemanager für Endverbraucher
	 * 					
	 * <!-- end-model-doc -->
	 * @see #CEM_VALUE
	 * @generated
	 * @ordered
	 */
	CEM(41, "CEM", "CEM"),

	/**
	 * The '<em><b>Actuator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 43:allgemein fuer Aktor
	 * <!-- end-model-doc -->
	 * @see #ACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUATOR(42, "Actuator", "Actuator"),

	/**
	 * The '<em><b>Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 44: allgemein fuer Messdatenaufnahme
	 * <!-- end-model-doc -->
	 * @see #SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR(43, "Sensor", "Sensor"),

	/**
	 * The '<em><b>Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 45:Steuergeraet
	 * <!-- end-model-doc -->
	 * @see #CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER(44, "Controller", "Controller"),

	/**
	 * The '<em><b>Env Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 46:Umweltbedingungen
	 * <!-- end-model-doc -->
	 * @see #ENV_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ENV_CONDITION(45, "EnvCondition", "EnvCondition"),

	/**
	 * The '<em><b>Flex Building Campus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 47: Gebäude und Campus.elektrische Flexibilität
	 * 					
	 * <!-- end-model-doc -->
	 * @see #FLEX_BUILDING_CAMPUS_VALUE
	 * @generated
	 * @ordered
	 */
	FLEX_BUILDING_CAMPUS(46, "FlexBuildingCampus", "FlexBuildingCampus"),

	/**
	 * The '<em><b>R48</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 48: Reserve
	 * <!-- end-model-doc -->
	 * @see #R48_VALUE
	 * @generated
	 * @ordered
	 */
	R48(47, "R48", "R48"),

	/**
	 * The '<em><b>R49</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 49: Reserve
	 * <!-- end-model-doc -->
	 * @see #R49_VALUE
	 * @generated
	 * @ordered
	 */
	R49(48, "R49", "R49"),

	/**
	 * The '<em><b>R50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 50: Reserve
	 * <!-- end-model-doc -->
	 * @see #R50_VALUE
	 * @generated
	 * @ordered
	 */
	R50(49, "R50", "R50");

	/**
	 * The '<em><b>Battery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1: Batterie
	 * <!-- end-model-doc -->
	 * @see #BATTERY
	 * @model name="Battery"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_VALUE = 0;

	/**
	 * The '<em><b>Compressor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2: Kompressor
	 * <!-- end-model-doc -->
	 * @see #COMPRESSOR
	 * @model name="Compressor"
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSOR_VALUE = 1;

	/**
	 * The '<em><b>Device Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3: Geräteinformation
	 * <!-- end-model-doc -->
	 * @see #DEVICE_INFORMATION
	 * @model name="DeviceInformation"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_INFORMATION_VALUE = 2;

	/**
	 * The '<em><b>DHW Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4: WarmWasserHeizung
	 * <!-- end-model-doc -->
	 * @see #DHW_CIRCUIT
	 * @model name="DHWCircuit"
	 * @generated
	 * @ordered
	 */
	public static final int DHW_CIRCUIT_VALUE = 3;

	/**
	 * The '<em><b>DHW Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5: WarmWasserSpeicher
	 * <!-- end-model-doc -->
	 * @see #DHW_STORAGE
	 * @model name="DHWStorage"
	 * @generated
	 * @ordered
	 */
	public static final int DHW_STORAGE_VALUE = 4;

	/**
	 * The '<em><b>Dishwasher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  6: Geschirrspülmaschine
	 * 					
	 * <!-- end-model-doc -->
	 * @see #DISHWASHER
	 * @model name="Dishwasher"
	 * @generated
	 * @ordered
	 */
	public static final int DISHWASHER_VALUE = 5;

	/**
	 * The '<em><b>Dryer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7: Trockner
	 * <!-- end-model-doc -->
	 * @see #DRYER
	 * @model name="Dryer"
	 * @generated
	 * @ordered
	 */
	public static final int DRYER_VALUE = 6;

	/**
	 * The '<em><b>Electrical Immersion Heater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8: elTauchSieder
	 * <!-- end-model-doc -->
	 * @see #ELECTRICAL_IMMERSION_HEATER
	 * @model name="ElectricalImmersionHeater"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_IMMERSION_HEATER_VALUE = 7;

	/**
	 * The '<em><b>Fan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 9: Ventilator
	 * <!-- end-model-doc -->
	 * @see #FAN
	 * @model name="Fan"
	 * @generated
	 * @ordered
	 */
	public static final int FAN_VALUE = 8;

	/**
	 * The '<em><b>Gas Heating Appliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10: GasWärmeAnwendung
	 * <!-- end-model-doc -->
	 * @see #GAS_HEATING_APPLIANCE
	 * @model name="GasHeatingAppliance"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_HEATING_APPLIANCE_VALUE = 9;

	/**
	 * The '<em><b>Non Specific</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 11: allgemein verwendbar
	 * <!-- end-model-doc -->
	 * @see #NON_SPECIFIC
	 * @model name="NonSpecific"
	 * @generated
	 * @ordered
	 */
	public static final int NON_SPECIFIC_VALUE = 10;

	/**
	 * The '<em><b>Heating Buffer Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  12: WaermeBufferSpeicher
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEATING_BUFFER_STORAGE
	 * @model name="HeatingBufferStorage"
	 * @generated
	 * @ordered
	 */
	public static final int HEATING_BUFFER_STORAGE_VALUE = 11;

	/**
	 * The '<em><b>Heating Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 13: Heizkreis
	 * <!-- end-model-doc -->
	 * @see #HEATING_CIRCUIT
	 * @model name="HeatingCircuit"
	 * @generated
	 * @ordered
	 */
	public static final int HEATING_CIRCUIT_VALUE = 12;

	/**
	 * The '<em><b>Heating Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 14: Heizungsobjekt
	 * <!-- end-model-doc -->
	 * @see #HEATING_OBJECT
	 * @model name="HeatingObject"
	 * @generated
	 * @ordered
	 */
	public static final int HEATING_OBJECT_VALUE = 13;

	/**
	 * The '<em><b>Heating Zone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 15: Heizzone
	 * <!-- end-model-doc -->
	 * @see #HEATING_ZONE
	 * @model name="HeatingZone"
	 * @generated
	 * @ordered
	 */
	public static final int HEATING_ZONE_VALUE = 14;

	/**
	 * The '<em><b>Heat Pump Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  16: WärmePumpenAnwendung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEAT_PUMP_CONTROL
	 * @model name="HeatPumpControl"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_PUMP_CONTROL_VALUE = 15;

	/**
	 * The '<em><b>Heat Sink Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  17: KuehlKoerperSchaltung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEAT_SINK_CIRCUIT
	 * @model name="HeatSinkCircuit"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_SINK_CIRCUIT_VALUE = 16;

	/**
	 * The '<em><b>Heat Source Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  18: WärmekörperSchaltung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #HEAT_SOURCE_CIRCUIT
	 * @model name="HeatSourceCircuit"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_SOURCE_CIRCUIT_VALUE = 17;

	/**
	 * The '<em><b>Heat Source Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 19: Wärmequelle
	 * <!-- end-model-doc -->
	 * @see #HEAT_SOURCE_UNIT
	 * @model name="HeatSourceUnit"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_SOURCE_UNIT_VALUE = 18;

	/**
	 * The '<em><b>HVAC Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20: HLKController
	 * <!-- end-model-doc -->
	 * @see #HVAC_CONTROLLER
	 * @model name="HVACController"
	 * @generated
	 * @ordered
	 */
	public static final int HVAC_CONTROLLER_VALUE = 19;

	/**
	 * The '<em><b>HVAC Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 21: HLKRaum
	 * <!-- end-model-doc -->
	 * @see #HVAC_ROOM
	 * @model name="HVACRoom"
	 * @generated
	 * @ordered
	 */
	public static final int HVAC_ROOM_VALUE = 20;

	/**
	 * The '<em><b>Instant DHW Heater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  22: DurchflussWarmwasserHeizung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #INSTANT_DHW_HEATER
	 * @model name="InstantDHWHeater"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT_DHW_HEATER_VALUE = 21;

	/**
	 * The '<em><b>Inverter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  23: Wechselrichter / Wandler
	 * 					
	 * <!-- end-model-doc -->
	 * @see #INVERTER
	 * @model name="Inverter"
	 * @generated
	 * @ordered
	 */
	public static final int INVERTER_VALUE = 22;

	/**
	 * The '<em><b>Oil Heating Appliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  24: OelWaermeAnwendung
	 * 					
	 * <!-- end-model-doc -->
	 * @see #OIL_HEATING_APPLIANCE
	 * @model name="OilHeatingAppliance"
	 * @generated
	 * @ordered
	 */
	public static final int OIL_HEATING_APPLIANCE_VALUE = 23;

	/**
	 * The '<em><b>Pump</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 25: Pumpe
	 * <!-- end-model-doc -->
	 * @see #PUMP
	 * @model name="Pump"
	 * @generated
	 * @ordered
	 */
	public static final int PUMP_VALUE = 24;

	/**
	 * The '<em><b>Refrigerant Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  26: Kältemittelkreislauf
	 * 					
	 * <!-- end-model-doc -->
	 * @see #REFRIGERANT_CIRCUIT
	 * @model name="RefrigerantCircuit"
	 * @generated
	 * @ordered
	 */
	public static final int REFRIGERANT_CIRCUIT_VALUE = 25;

	/**
	 * The '<em><b>Smart Energy Appliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  27: SmartEnergyAppliance
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SMART_ENERGY_APPLIANCE
	 * @model name="SmartEnergyAppliance"
	 * @generated
	 * @ordered
	 */
	public static final int SMART_ENERGY_APPLIANCE_VALUE = 26;

	/**
	 * The '<em><b>Solar DHW Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  28: SolarWarmwasserSpeicher
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SOLAR_DHW_STORAGE
	 * @model name="SolarDHWStorage"
	 * @generated
	 * @ordered
	 */
	public static final int SOLAR_DHW_STORAGE_VALUE = 27;

	/**
	 * The '<em><b>Solar Thermal Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  SolarWarmwasserKreislauf
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SOLAR_THERMAL_CIRCUIT
	 * @model name="SolarThermalCircuit"
	 * @generated
	 * @ordered
	 */
	public static final int SOLAR_THERMAL_CIRCUIT_VALUE = 28;

	/**
	 * The '<em><b>Sub Meter Electricity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  30: SubMeter Elektrisch
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SUB_METER_ELECTRICITY
	 * @model name="SubMeterElectricity"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_METER_ELECTRICITY_VALUE = 29;

	/**
	 * The '<em><b>Temperature Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 31: Temperatursensor
	 * <!-- end-model-doc -->
	 * @see #TEMPERATURE_SENSOR
	 * @model name="TemperatureSensor"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_SENSOR_VALUE = 30;

	/**
	 * The '<em><b>Washer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32: Waschmaschine
	 * <!-- end-model-doc -->
	 * @see #WASHER
	 * @model name="Washer"
	 * @generated
	 * @ordered
	 */
	public static final int WASHER_VALUE = 31;

	/**
	 * The '<em><b>Battery System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 33: Batteriesystem
	 * <!-- end-model-doc -->
	 * @see #BATTERY_SYSTEM
	 * @model name="BatterySystem"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_SYSTEM_VALUE = 32;

	/**
	 * The '<em><b>Electricity Generation System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  34: Generator Elektrisch
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ELECTRICITY_GENERATION_SYSTEM
	 * @model name="ElectricityGenerationSystem"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICITY_GENERATION_SYSTEM_VALUE = 33;

	/**
	 * The '<em><b>Electricity Storage System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  35: ElektroSpeicher System
	 * 					
	 * <!-- end-model-doc -->
	 * @see #ELECTRICITY_STORAGE_SYSTEM
	 * @model name="ElectricityStorageSystem"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICITY_STORAGE_SYSTEM_VALUE = 34;

	/**
	 * The '<em><b>SGCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  31: GridConnectionPoint Nachbarschaft
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SGCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SGCP_VALUE = 35;

	/**
	 * The '<em><b>Household</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 327: Haushalt
	 * <!-- end-model-doc -->
	 * @see #HOUSEHOLD
	 * @model name="Household"
	 * @generated
	 * @ordered
	 */
	public static final int HOUSEHOLD_VALUE = 36;

	/**
	 * The '<em><b>PV System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 38: PV System
	 * <!-- end-model-doc -->
	 * @see #PV_SYSTEM
	 * @model name="PVSystem"
	 * @generated
	 * @ordered
	 */
	public static final int PV_SYSTEM_VALUE = 37;

	/**
	 * The '<em><b>EV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 39: Elektromobil
	 * <!-- end-model-doc -->
	 * @see #EV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EV_VALUE = 38;

	/**
	 * The '<em><b>EVSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  40: Ladestationscontroller für Elektrofahrzeug
	 * 					
	 * <!-- end-model-doc -->
	 * @see #EVSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVSE_VALUE = 39;

	/**
	 * The '<em><b>Charging Outlet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 41: Ladestation
	 * <!-- end-model-doc -->
	 * @see #CHARGING_OUTLET
	 * @model name="ChargingOutlet"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_OUTLET_VALUE = 40;

	/**
	 * The '<em><b>CEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  42: Energiemanager für Endverbraucher
	 * 					
	 * <!-- end-model-doc -->
	 * @see #CEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEM_VALUE = 41;

	/**
	 * The '<em><b>Actuator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 43:allgemein fuer Aktor
	 * <!-- end-model-doc -->
	 * @see #ACTUATOR
	 * @model name="Actuator"
	 * @generated
	 * @ordered
	 */
	public static final int ACTUATOR_VALUE = 42;

	/**
	 * The '<em><b>Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 44: allgemein fuer Messdatenaufnahme
	 * <!-- end-model-doc -->
	 * @see #SENSOR
	 * @model name="Sensor"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_VALUE = 43;

	/**
	 * The '<em><b>Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 45:Steuergeraet
	 * <!-- end-model-doc -->
	 * @see #CONTROLLER
	 * @model name="Controller"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_VALUE = 44;

	/**
	 * The '<em><b>Env Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 46:Umweltbedingungen
	 * <!-- end-model-doc -->
	 * @see #ENV_CONDITION
	 * @model name="EnvCondition"
	 * @generated
	 * @ordered
	 */
	public static final int ENV_CONDITION_VALUE = 45;

	/**
	 * The '<em><b>Flex Building Campus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 47: Gebäude und Campus.elektrische Flexibilität
	 * 					
	 * <!-- end-model-doc -->
	 * @see #FLEX_BUILDING_CAMPUS
	 * @model name="FlexBuildingCampus"
	 * @generated
	 * @ordered
	 */
	public static final int FLEX_BUILDING_CAMPUS_VALUE = 46;

	/**
	 * The '<em><b>R48</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 48: Reserve
	 * <!-- end-model-doc -->
	 * @see #R48
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R48_VALUE = 47;

	/**
	 * The '<em><b>R49</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 49: Reserve
	 * <!-- end-model-doc -->
	 * @see #R49
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R49_VALUE = 48;

	/**
	 * The '<em><b>R50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 50: Reserve
	 * <!-- end-model-doc -->
	 * @see #R50
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R50_VALUE = 49;

	/**
	 * An array of all the '<em><b>Profile Type Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProfileTypeEnumType[] VALUES_ARRAY =
		new ProfileTypeEnumType[] {
			BATTERY,
			COMPRESSOR,
			DEVICE_INFORMATION,
			DHW_CIRCUIT,
			DHW_STORAGE,
			DISHWASHER,
			DRYER,
			ELECTRICAL_IMMERSION_HEATER,
			FAN,
			GAS_HEATING_APPLIANCE,
			NON_SPECIFIC,
			HEATING_BUFFER_STORAGE,
			HEATING_CIRCUIT,
			HEATING_OBJECT,
			HEATING_ZONE,
			HEAT_PUMP_CONTROL,
			HEAT_SINK_CIRCUIT,
			HEAT_SOURCE_CIRCUIT,
			HEAT_SOURCE_UNIT,
			HVAC_CONTROLLER,
			HVAC_ROOM,
			INSTANT_DHW_HEATER,
			INVERTER,
			OIL_HEATING_APPLIANCE,
			PUMP,
			REFRIGERANT_CIRCUIT,
			SMART_ENERGY_APPLIANCE,
			SOLAR_DHW_STORAGE,
			SOLAR_THERMAL_CIRCUIT,
			SUB_METER_ELECTRICITY,
			TEMPERATURE_SENSOR,
			WASHER,
			BATTERY_SYSTEM,
			ELECTRICITY_GENERATION_SYSTEM,
			ELECTRICITY_STORAGE_SYSTEM,
			SGCP,
			HOUSEHOLD,
			PV_SYSTEM,
			EV,
			EVSE,
			CHARGING_OUTLET,
			CEM,
			ACTUATOR,
			SENSOR,
			CONTROLLER,
			ENV_CONDITION,
			FLEX_BUILDING_CAMPUS,
			R48,
			R49,
			R50,
		};

	/**
	 * A public read-only list of all the '<em><b>Profile Type Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProfileTypeEnumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Profile Type Enum Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileTypeEnumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileTypeEnumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Type Enum Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileTypeEnumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileTypeEnumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Type Enum Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileTypeEnumType get(int value) {
		switch (value) {
			case BATTERY_VALUE: return BATTERY;
			case COMPRESSOR_VALUE: return COMPRESSOR;
			case DEVICE_INFORMATION_VALUE: return DEVICE_INFORMATION;
			case DHW_CIRCUIT_VALUE: return DHW_CIRCUIT;
			case DHW_STORAGE_VALUE: return DHW_STORAGE;
			case DISHWASHER_VALUE: return DISHWASHER;
			case DRYER_VALUE: return DRYER;
			case ELECTRICAL_IMMERSION_HEATER_VALUE: return ELECTRICAL_IMMERSION_HEATER;
			case FAN_VALUE: return FAN;
			case GAS_HEATING_APPLIANCE_VALUE: return GAS_HEATING_APPLIANCE;
			case NON_SPECIFIC_VALUE: return NON_SPECIFIC;
			case HEATING_BUFFER_STORAGE_VALUE: return HEATING_BUFFER_STORAGE;
			case HEATING_CIRCUIT_VALUE: return HEATING_CIRCUIT;
			case HEATING_OBJECT_VALUE: return HEATING_OBJECT;
			case HEATING_ZONE_VALUE: return HEATING_ZONE;
			case HEAT_PUMP_CONTROL_VALUE: return HEAT_PUMP_CONTROL;
			case HEAT_SINK_CIRCUIT_VALUE: return HEAT_SINK_CIRCUIT;
			case HEAT_SOURCE_CIRCUIT_VALUE: return HEAT_SOURCE_CIRCUIT;
			case HEAT_SOURCE_UNIT_VALUE: return HEAT_SOURCE_UNIT;
			case HVAC_CONTROLLER_VALUE: return HVAC_CONTROLLER;
			case HVAC_ROOM_VALUE: return HVAC_ROOM;
			case INSTANT_DHW_HEATER_VALUE: return INSTANT_DHW_HEATER;
			case INVERTER_VALUE: return INVERTER;
			case OIL_HEATING_APPLIANCE_VALUE: return OIL_HEATING_APPLIANCE;
			case PUMP_VALUE: return PUMP;
			case REFRIGERANT_CIRCUIT_VALUE: return REFRIGERANT_CIRCUIT;
			case SMART_ENERGY_APPLIANCE_VALUE: return SMART_ENERGY_APPLIANCE;
			case SOLAR_DHW_STORAGE_VALUE: return SOLAR_DHW_STORAGE;
			case SOLAR_THERMAL_CIRCUIT_VALUE: return SOLAR_THERMAL_CIRCUIT;
			case SUB_METER_ELECTRICITY_VALUE: return SUB_METER_ELECTRICITY;
			case TEMPERATURE_SENSOR_VALUE: return TEMPERATURE_SENSOR;
			case WASHER_VALUE: return WASHER;
			case BATTERY_SYSTEM_VALUE: return BATTERY_SYSTEM;
			case ELECTRICITY_GENERATION_SYSTEM_VALUE: return ELECTRICITY_GENERATION_SYSTEM;
			case ELECTRICITY_STORAGE_SYSTEM_VALUE: return ELECTRICITY_STORAGE_SYSTEM;
			case SGCP_VALUE: return SGCP;
			case HOUSEHOLD_VALUE: return HOUSEHOLD;
			case PV_SYSTEM_VALUE: return PV_SYSTEM;
			case EV_VALUE: return EV;
			case EVSE_VALUE: return EVSE;
			case CHARGING_OUTLET_VALUE: return CHARGING_OUTLET;
			case CEM_VALUE: return CEM;
			case ACTUATOR_VALUE: return ACTUATOR;
			case SENSOR_VALUE: return SENSOR;
			case CONTROLLER_VALUE: return CONTROLLER;
			case ENV_CONDITION_VALUE: return ENV_CONDITION;
			case FLEX_BUILDING_CAMPUS_VALUE: return FLEX_BUILDING_CAMPUS;
			case R48_VALUE: return R48;
			case R49_VALUE: return R49;
			case R50_VALUE: return R50;
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
	private ProfileTypeEnumType(int value, String name, String literal) {
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
	
} //ProfileTypeEnumType
