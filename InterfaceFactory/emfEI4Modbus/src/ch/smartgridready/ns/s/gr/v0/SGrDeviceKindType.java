/**
 */
package ch.smartgridready.ns.s.gr.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Device Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Device Kind is inherited from EEBUS, a growing list of
 * 				supported Devices
 * 			
 * <!-- end-model-doc -->
 * @see ch.smartgridready.ns.s.gr.v0.V0Package#getSGrDeviceKindType()
 * @model extendedMetaData="name='SGrDeviceKindType'"
 * @generated
 */
public enum SGrDeviceKindType implements Enumerator {
	/**
	 * The '<em><b>Battery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY(0, "Battery", "Battery"),

	/**
	 * The '<em><b>Compressor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSOR(1, "Compressor", "Compressor"),

	/**
	 * The '<em><b>Device Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_INFORMATION(2, "DeviceInformation", "DeviceInformation"),

	/**
	 * The '<em><b>DHW Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHW_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	DHW_CIRCUIT(3, "DHWCircuit", "DHWCircuit"),

	/**
	 * The '<em><b>DHW Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHW_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DHW_STORAGE(4, "DHWStorage", "DHWStorage"),

	/**
	 * The '<em><b>Dishwasher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISHWASHER_VALUE
	 * @generated
	 * @ordered
	 */
	DISHWASHER(5, "Dishwasher", "Dishwasher"),

	/**
	 * The '<em><b>Dryer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRYER_VALUE
	 * @generated
	 * @ordered
	 */
	DRYER(6, "Dryer", "Dryer"),

	/**
	 * The '<em><b>Electrical Immersion Heater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_IMMERSION_HEATER_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL_IMMERSION_HEATER(7, "ElectricalImmersionHeater", "ElectricalImmersionHeater"),

	/**
	 * The '<em><b>Fan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAN_VALUE
	 * @generated
	 * @ordered
	 */
	FAN(8, "Fan", "Fan"),

	/**
	 * The '<em><b>Gas Heating Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_HEATING_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	GAS_HEATING_APPLIANCE(9, "GasHeatingAppliance", "GasHeatingAppliance"),

	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(10, "Generic", "Generic"),

	/**
	 * The '<em><b>Heating Buffer Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATING_BUFFER_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_BUFFER_STORAGE(11, "HeatingBufferStorage", "HeatingBufferStorage"),

	/**
	 * The '<em><b>Heating Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATING_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_CIRCUIT(12, "HeatingCircuit", "HeatingCircuit"),

	/**
	 * The '<em><b>Heating Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATING_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_OBJECT(13, "HeatingObject", "HeatingObject"),

	/**
	 * The '<em><b>Heating Zone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATING_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	HEATING_ZONE(14, "HeatingZone", "HeatingZone"),

	/**
	 * The '<em><b>Heat Pump Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_PUMP_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_PUMP_APPLIANCE(15, "HeatPumpAppliance", "HeatPumpAppliance"),

	/**
	 * The '<em><b>Heat Sink Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_SINK_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_SINK_CIRCUIT(16, "HeatSinkCircuit", "HeatSinkCircuit"),

	/**
	 * The '<em><b>Heat Source Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_SOURCE_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_SOURCE_CIRCUIT(17, "HeatSourceCircuit", "HeatSourceCircuit"),

	/**
	 * The '<em><b>Heat Source Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_SOURCE_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT_SOURCE_UNIT(18, "HeatSourceUnit", "HeatSourceUnit"),

	/**
	 * The '<em><b>HVAC Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVAC_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	HVAC_CONTROLLER(19, "HVACController", "HVACController"),

	/**
	 * The '<em><b>HVAC Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVAC_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	HVAC_ROOM(20, "HVACRoom", "HVACRoom"),

	/**
	 * The '<em><b>Instant DHW Heater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT_DHW_HEATER_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT_DHW_HEATER(21, "InstantDHWHeater", "InstantDHWHeater"),

	/**
	 * The '<em><b>Inverter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERTER_VALUE
	 * @generated
	 * @ordered
	 */
	INVERTER(22, "Inverter", "Inverter"),

	/**
	 * The '<em><b>Oil Heating Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_HEATING_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	OIL_HEATING_APPLIANCE(23, "OilHeatingAppliance", "OilHeatingAppliance"),

	/**
	 * The '<em><b>Pump</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUMP_VALUE
	 * @generated
	 * @ordered
	 */
	PUMP(24, "Pump", "Pump"),

	/**
	 * The '<em><b>Refrigerant Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRIGERANT_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	REFRIGERANT_CIRCUIT(25, "RefrigerantCircuit", "RefrigerantCircuit"),

	/**
	 * The '<em><b>Smart Energy Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMART_ENERGY_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SMART_ENERGY_APPLIANCE(26, "SmartEnergyAppliance", "SmartEnergyAppliance"),

	/**
	 * The '<em><b>Solar DHW Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLAR_DHW_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLAR_DHW_STORAGE(27, "SolarDHWStorage", "SolarDHWStorage"),

	/**
	 * The '<em><b>Solar Thermal Circuit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLAR_THERMAL_CIRCUIT_VALUE
	 * @generated
	 * @ordered
	 */
	SOLAR_THERMAL_CIRCUIT(28, "SolarThermalCircuit", "SolarThermalCircuit"),

	/**
	 * The '<em><b>Sub Meter Electricity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_METER_ELECTRICITY_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_METER_ELECTRICITY(29, "SubMeterElectricity", "SubMeterElectricity"),

	/**
	 * The '<em><b>Temperature Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE_SENSOR(30, "TemperatureSensor", "TemperatureSensor"),

	/**
	 * The '<em><b>Washer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASHER_VALUE
	 * @generated
	 * @ordered
	 */
	WASHER(31, "Washer", "Washer"),

	/**
	 * The '<em><b>Battery System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY_SYSTEM(32, "BatterySystem", "BatterySystem"),

	/**
	 * The '<em><b>Electricity Generation System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICITY_GENERATION_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICITY_GENERATION_SYSTEM(33, "ElectricityGenerationSystem", "ElectricityGenerationSystem"),

	/**
	 * The '<em><b>Electricity Storage System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * EEBUS: GridConnectionPointOfPremises
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
	 * @see #HOUSEHOLD_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSEHOLD(36, "Household", "Household"),

	/**
	 * The '<em><b>PV System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	PV_SYSTEM(37, "PVSystem", "PVSystem"),

	/**
	 * The '<em><b>EV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EV_VALUE
	 * @generated
	 * @ordered
	 */
	EV(38, "EV", "EV"),

	/**
	 * The '<em><b>EVSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVSE_VALUE
	 * @generated
	 * @ordered
	 */
	EVSE(39, "EVSE", "EVSE"),

	/**
	 * The '<em><b>Charging Station</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EEBUS: ChargingOutlet
	 * <!-- end-model-doc -->
	 * @see #CHARGING_STATION_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING_STATION(40, "ChargingStation", "ChargingStation"),

	/**
	 * The '<em><b>CEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEM_VALUE
	 * @generated
	 * @ordered
	 */
	CEM(41, "CEM", "CEM");

	/**
	 * The '<em><b>Battery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @see #GAS_HEATING_APPLIANCE
	 * @model name="GasHeatingAppliance"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_HEATING_APPLIANCE_VALUE = 9;

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="Generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 10;

	/**
	 * The '<em><b>Heating Buffer Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @see #HEATING_ZONE
	 * @model name="HeatingZone"
	 * @generated
	 * @ordered
	 */
	public static final int HEATING_ZONE_VALUE = 14;

	/**
	 * The '<em><b>Heat Pump Appliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_PUMP_APPLIANCE
	 * @model name="HeatPumpAppliance"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_PUMP_APPLIANCE_VALUE = 15;

	/**
	 * The '<em><b>Heat Sink Circuit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * EEBUS: GridConnectionPointOfPremises
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
	 * @see #EVSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVSE_VALUE = 39;

	/**
	 * The '<em><b>Charging Station</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EEBUS: ChargingOutlet
	 * <!-- end-model-doc -->
	 * @see #CHARGING_STATION
	 * @model name="ChargingStation"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_STATION_VALUE = 40;

	/**
	 * The '<em><b>CEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEM_VALUE = 41;

	/**
	 * An array of all the '<em><b>SGr Device Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrDeviceKindType[] VALUES_ARRAY =
		new SGrDeviceKindType[] {
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
			GENERIC,
			HEATING_BUFFER_STORAGE,
			HEATING_CIRCUIT,
			HEATING_OBJECT,
			HEATING_ZONE,
			HEAT_PUMP_APPLIANCE,
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
			CHARGING_STATION,
			CEM,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Device Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrDeviceKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Device Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrDeviceKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrDeviceKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Device Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrDeviceKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrDeviceKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Device Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrDeviceKindType get(int value) {
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
			case GENERIC_VALUE: return GENERIC;
			case HEATING_BUFFER_STORAGE_VALUE: return HEATING_BUFFER_STORAGE;
			case HEATING_CIRCUIT_VALUE: return HEATING_CIRCUIT;
			case HEATING_OBJECT_VALUE: return HEATING_OBJECT;
			case HEATING_ZONE_VALUE: return HEATING_ZONE;
			case HEAT_PUMP_APPLIANCE_VALUE: return HEAT_PUMP_APPLIANCE;
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
			case CHARGING_STATION_VALUE: return CHARGING_STATION;
			case CEM_VALUE: return CEM;
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
	private SGrDeviceKindType(int value, String name, String literal) {
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
	
} //SGrDeviceKindType
