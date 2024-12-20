/**
 *Copyright(c) 2022 Verein SmartGridready Switzerland
 * @generated NOT
 *
This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in 
the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from 
this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR 
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
OF THE POSSIBILITY OF SUCH DAMAGE.

author: IBT/cb
The purpose of this class is to offer a test environment with all existing devices at the IBT lab in order to allow communication tests under long term
and significant traffic load conditions    

 */

package com.smartgridready.communicator.modbus.impl;

import com.smartgridready.communicator.common.api.GenDeviceApi;
import com.smartgridready.communicator.common.api.SGrDeviceBuilder;
import com.smartgridready.communicator.common.api.values.BooleanValue;
import com.smartgridready.communicator.common.api.values.EnumRecord;
import com.smartgridready.communicator.common.api.values.Float64Value;
import com.smartgridready.communicator.common.api.values.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class IBTlabLoopTester {

	//private static final String XML_BASE_DIR = "C://SGr/QuellCode/SGrSpecifications/XMLInstances/ExtInterfaces/";
	private static final String XML_BASE_DIR = "../SGrSpecifications/XMLInstances/ExtInterfaces/";
	private static final Logger LOG = LoggerFactory.getLogger(IBTlabLoopTester.class);

	// we need static definitions for performance reason
	//------------------------------------------------------

	// Modbus RTU devices
	private static GenDeviceApi devWagoMeter = null;
	private static GenDeviceApi devABBMeter = null;
	private static GenDeviceApi devTB_ABBMeter = null;
	// we need a single driver instance for RTU and separate these by device address
	//private static GenDeviceApi mbRTU = null;

	// Modbus TCP devices
	private static GenDeviceApi devVGT_SGCP = null;
	private static GenDeviceApi devGaroWallbox = null;
	private static GenDeviceApi devOMCCIWallbox = null;
	private static GenDeviceApi devFroniusSymo = null;

	// test loop parameters
	private static int runtimeCnt = 0;
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	// Exception Counters
	private static int devABBMeterExceptions = 0;
	private static int devVGT_SGCPExceptions = 0;
	private static int devGaroWallboxExceptions = 0;
	private static int devFroniusSymoExceptions = 0;
	// TestBox
	private static int devTB_ABBMeterExcpetions = 0;
	private static int devWagoMeterExceptions = 0;
	private static int devOMCCIWallboxExceptions = 0;

	// device selection
	private static boolean  devABBMeterTestIsOn = true;
	private static boolean  devVGT_SGCPTestIsOn = true;
	private static boolean  devFroniusSymoTestIsOn = false;
	private static boolean  devGaroWallboxTestIsOn = true;
	// TestBox
	private static boolean  devWagoMeterTestIsOn = true;
	private static boolean  devOMCCIWallboxTestIsOn = true;

	// !! Schalter in Box umlegen fuer Test !!
	private static boolean  devTB_ABBMeterTestIsOn = true;

	private static SGrModbusGatewayRegistry  modbusPort1Registery = new SGrModbusGatewayRegistry();
	// Set the mockModbusDriver to new GenDriverAPI4ModbusRTUMock() to mock the real devices.
	// private static GenDriverAPI4Modbus  mockModbusDriver = new GenDriverAPI4ModbusRTUMock();
	//private static GenDriverAPI mockModbusDriver = null;

	@SuppressWarnings("java:S2925")
	public static void main( String argv[] ) {



		try {

			LOG.info(String.format("\n\n\n"));
			LOG.info("*************************  TEST INITIALISATION ***************************************");
			LOG.info("*  Time=" + dtf.format(LocalDateTime.now()) + "                                      *");
			LOG.info("**************************************************************************************");

			if (devABBMeterTestIsOn)  {
				LOG.info(" -init devABBMeterTest @:" + dtf.format(LocalDateTime.now())+ " ");initABBMeter(XML_BASE_DIR, "SGr_00_0016_dddd_ABB_B23_ModbusRTU_V0.3.xml");
			}
			if (devVGT_SGCPTestIsOn)   {
				LOG.info(" -init devVGT_SGCPTest @:" + dtf.format(LocalDateTime.now())+ " ");initVGT_SGCP (XML_BASE_DIR,"SGr_04_0019_0059_VGT_SPSDeviceforHomeAutomation_v0.2.1.xml");
			}
			if (devGaroWallboxTestIsOn) {
				LOG.info(" -init devGaroWallboxTest @:" + dtf.format(LocalDateTime.now())+ " "); initGaroWallbox(XML_BASE_DIR, "SGr_04_0005_xxxx_GARO_WallboxV0.2.1.xml");
			}
			if (devFroniusSymoTestIsOn) {
				LOG.info(" -init FroniusSymoTest @:" + dtf.format(LocalDateTime.now()) + " "); initFroniusSymo(XML_BASE_DIR,"SGr_04_0021_xxxx_FroniusSymoV0.2.1.xml");
			}

			// TestBox
			if (devTB_ABBMeterTestIsOn)  {
				LOG.info(" -init TestBox: devTB_ABBMeterTest @:" + dtf.format(LocalDateTime.now())+ " ");initTB_ABBMeter(XML_BASE_DIR, "SGr_00_0016_dddd_ABB_B23_ModbusRTU_V0.3.xml");
			}
			if (devWagoMeterTestIsOn) {
				LOG.info(" -init TestBox: devWagoMeterTest @: " + dtf.format(LocalDateTime.now())+ " ");
				initWagoMeter(XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.3.xml");
			}
			if (devOMCCIWallboxTestIsOn) {
				//TODO: complete and use OMCCI EI.xml
				LOG.info(" -init devOMCCIWallboxest @:" + dtf.format(LocalDateTime.now())+ " "); initOMCCIWallbox(XML_BASE_DIR, "SGr_04_0005_xxxx_GARO_WallboxV0.2.1.xml");
			}




			LOG.info("############################   Start device Testing   ####################################");

			try {

				for (runtimeCnt = 0;runtimeCnt<30000;runtimeCnt++)
				{

					// loop data & test reporting
					LOG.info("\n\n>>>Time=" + dtf.format(LocalDateTime.now())+" ------> LOOP=" +	runtimeCnt + "  Exceptions:");
					if (devABBMeterTestIsOn)    LOG.info("     ABBMeter=" +  devABBMeterExceptions+ ",");
					if (devVGT_SGCPTestIsOn)    LOG.info("     VGT_SCP=" +  devVGT_SGCPExceptions+ ",");
					if (devGaroWallboxTestIsOn) LOG.info("     GaroWallbox=" + devGaroWallboxExceptions+ ",");
					if (devFroniusSymoTestIsOn) LOG.info("     FroniusSymo=" + devFroniusSymoExceptions + ",");
					// TestBox
					if (devTB_ABBMeterTestIsOn)    LOG.info("     TestBox ABBMeter=" +  devTB_ABBMeterExcpetions+ ",");
					if (devOMCCIWallboxTestIsOn) LOG.info("     TestBox OMCCIWallbox=" + devOMCCIWallboxExceptions+ ",");
					if (devWagoMeterTestIsOn)   LOG.info("     TestBox WagoMeter=" + devWagoMeterExceptions + ",");

					//_____Next loop
					if (devABBMeterTestIsOn)    tstABBMeter();
					if (devVGT_SGCPTestIsOn)    tstVGT_SGCP();
					if (devGaroWallboxTestIsOn) tstGaroWallbox();
					if (devFroniusSymoTestIsOn) tstFroniusSymo();
					// TestBox
					if (devTB_ABBMeterTestIsOn)  tstTB_ABBMeter();
					if (devOMCCIWallboxTestIsOn) tstOMCCIWallbox();
					if (devWagoMeterTestIsOn)    tstWagoMeter();

					Thread.sleep(500);  // show last block for ccc  milliseconds
				}
			}

			catch ( Exception e)
			{
				LOG.info( "Error reading value from device " + e);
				e.printStackTrace();
			}
		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}

	}
	// -----------------------------------------------------------------------------------------------------------------------------
	// WAGO Meter testing
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initWagoMeter(String aBaseDir, String aDescriptionFile ) {

		try {
			var properties = new Properties();
			properties.put("slave_id", "7");
			properties.put("serial_port", "COM3");
			properties.put("serial_baudrate", "9600");
			properties.put("serial_databits", "8");
			properties.put("serial_parity", "NONE");
			properties.put("serial_stopbits","1");

			devWagoMeter = (GenDeviceApi) new SGrDeviceBuilder()
					.useSharedModbusGatewayRegistry(modbusPort1Registery)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.properties(properties)
					.build();

			devWagoMeter.connect();
		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description devWagoMeter:" + e);
		}
	}

	static void tstWagoMeter()
	{
		double fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";

		try {
		//	mbRTU.setUnitIdentifier((byte) 7);
			LOG.info("\n@:Testing TestBox: WAGO Meter");
			Thread.sleep(25);
			fVal1 = devWagoMeter.getVal("VoltageAC", "VoltageACL1_N").getFloat64();
			Thread.sleep(10);
			fVal2 = devWagoMeter.getVal("VoltageAC", "VoltageACL2_N").getFloat64();
			Thread.sleep(10);
			fVal3 = devWagoMeter.getVal("VoltageAC", "VoltageACL3_N").getFloat64();
			Thread.sleep(10);
			fVal4 = devWagoMeter.getVal("Frequency", "Frequency").getFloat64();
			LOG.info("  VoltageAC L1,2,3/Frequency [V,Hz]: " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + ",  " + fVal4 + "  ");
			Thread.sleep(10);
			fVal1 = devWagoMeter.getVal("VoltageAC", "VoltageACL1_L2").getFloat64();
			Thread.sleep(10);
			fVal2 = devWagoMeter.getVal("VoltageAC", "VoltageACL1_L3").getFloat64();
			Thread.sleep(10);
			fVal3 = devWagoMeter.getVal("VoltageAC", "VoltageACL2_L3").getFloat64();
			LOG.info(String.format("  VoltageAC L12/13/23 [V]:           %.2f,  %.2f, %.2f", fVal1,  fVal2 , fVal3 ));
			Thread.sleep(10);
			fVal1 = devWagoMeter.getVal("CurrentAC", "CurrentACL1").getFloat64();
			Thread.sleep(10);
			fVal2 = devWagoMeter.getVal("CurrentAC", "CurrentACL2").getFloat64();
			Thread.sleep(10);
			fVal3 = devWagoMeter.getVal("CurrentAC", "CurrentACL3").getFloat64();
			LOG.info("  CurrentAC L1/2/3 [A]:              " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + "  ");
			Thread.sleep(10);
			fVal1 = devWagoMeter.getVal("PowerFactor", "PowerFactor").getFloat64();
			Thread.sleep(10);
			fVal2 = devWagoMeter.getVal("PowerFactor", "PowerFactorL1").getFloat64();
			Thread.sleep(10);
			fVal3 = devWagoMeter.getVal("PowerFactor", "PowerFactorL2").getFloat64();
			Thread.sleep(10);
			fVal4 = devWagoMeter.getVal("PowerFactor", "PowerFactorL3").getFloat64();
			LOG.info("  Powerfactor tot/L1/L2/L3:          " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + ",  " + fVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACtot").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL1").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL2").getString();
			Thread.sleep(10);
			sVal4 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL3").getString();
			LOG.info("  ActiveEnergyAC [kWh]:         " + sVal1 + ",  " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACL3").getString();
			LOG.info("  ActivePowerAC [kW]:           " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACL3").getString();
			LOG.info("  ReactivePowerAC [kvar]:       " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACL3").getString();
			LOG.info("  ApparentPowerAC [kva]:        " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("ActiveEnergyBalanceAC", "ActiveImportAC").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("ActiveEnergyBalanceAC", "ActiveExportAC").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("ActiveEnergyBalanceAC", "ActiveNetAC").getString();
			LOG.info("  ActiveEnergyBalanceAC [KWh]:    " + sVal1 + ", " + sVal2 + ",  " + sVal3 + "  ");

			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveImportAC").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveExportAC").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveNetAC").getString();
			LOG.info("  ReactiveEnergyBalanceAC [kvarh]:" + sVal1 + ", " + sVal2 + ",  " + sVal3  + "  ");

			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("PowerQuadrant", "PowerQuadrantACtot").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("PowerQuadrant", "PowerQuadrantACL1").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("PowerQuadrant", "PowerQuadrantACL2").getString();
			Thread.sleep(10);
			sVal4 = devWagoMeter.getVal("PowerQuadrant", "PowerQuadrantACL3").getString();
			LOG.info("  PowerQuadrant  tot/L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ", " + sVal3
					+ ",  " + sVal4 + "  ");

			Thread.sleep(10);
			sVal1 = devWagoMeter.getVal("CurrentDirection", "CurrentDirL1").getString();
			Thread.sleep(10);
			sVal2 = devWagoMeter.getVal("CurrentDirection", "CurrentDirL2").getString();
			Thread.sleep(10);
			sVal3 = devWagoMeter.getVal("CurrentDirection", "CurrentDirL3").getString();
			LOG.info("  CurrentDirection  L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+  "  ");

		}
		catch ( Exception e)
		{
			devWagoMeterExceptions++;
			LOG.info( "Error reading value from device devWagoMeter:" + e);
			e.printStackTrace();
		}
	}




	// -----------------------------------------------------------------------------------------------------------------------------
	// Device ABBMeter Testing
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initABBMeter(String aBaseDir, String aDescriptionFile ) {

		try {
			var properties = new Properties();
			properties.put("slave_id", "11");
			properties.put("serial_port", "COM3");
			properties.put("serial_baudrate", "9600");
			properties.put("serial_databits", "8");
			properties.put("serial_parity", "NONE");
			properties.put("serial_stopbits","1");

			devABBMeter = (GenDeviceApi) new SGrDeviceBuilder()
					.useSharedModbusGatewayRegistry(modbusPort1Registery)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.properties(properties)
					.build();

			devABBMeter.connect();

		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}
	}

	static void tstABBMeter()
	{
		double fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";

		try {
			LOG.info("\n@:Testing ABBMeter: ");
			Thread.sleep(25);
			fVal1 = devABBMeter.getVal("VoltageAC", "VoltageACL1_N").getFloat64();
			Thread.sleep(10);
			fVal2 = devABBMeter.getVal("VoltageAC", "VoltageACL2_N").getFloat64();
			Thread.sleep(10);
			fVal3 = devABBMeter.getVal("VoltageAC", "VoltageACL3_N").getFloat64();
			Thread.sleep(10);
			fVal4 = devABBMeter.getVal("Frequency", "Frequency").getFloat64();
			LOG.info("  VoltageAC L1,2,3/Frequency [V,Hz]: " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + ",  " + fVal4 + "  ");
			Thread.sleep(10);
			fVal1 = devABBMeter.getVal("VoltageAC", "VoltageACL1_L2").getFloat64();
			Thread.sleep(10);
			fVal2 = devABBMeter.getVal("VoltageAC", "VoltageACL1_L3").getFloat64();
			Thread.sleep(10);
			fVal3 = devABBMeter.getVal("VoltageAC", "VoltageACL2_L3").getFloat64();
			LOG.info("  VoltageAC L12/13/23 [V]:           " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + "  ");
			Thread.sleep(10);
			fVal1 = devABBMeter.getVal("CurrentAC", "CurrentACL1").getFloat64();
			Thread.sleep(10);
			fVal2 = devABBMeter.getVal("CurrentAC", "CurrentACL2").getFloat64();
			Thread.sleep(10);
			fVal3 = devABBMeter.getVal("CurrentAC", "CurrentACL3").getFloat64();
			LOG.info("  CurrentAC L1/2/3 [A]:              " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + "  ");
			Thread.sleep(10);
			// TODO PowerFactor not defined in current ABB-meter EI-XML
					/*
	  				fVal1 = devABBMeter.getVal("PowerFactor", "PowerFactor").getFloat64();
	  				Thread.sleep(10);
	  				fVal2 = devABBMeter.getVal("PowerFactor", "PowerFactorL1").getFloat64();
	  				Thread.sleep(10);
	  				fVal3 = devABBMeter.getVal("PowerFactor", "PowerFactorL2").getFloat64();
	  				Thread.sleep(10);
	  				fVal4 = devABBMeter.getVal("PowerFactor", "PowerFactorL3").getFloat64();
	  				LOG.info("  Powerfactor tot/L1/L2/L3:          " + fVal1 + ",  " + fVal2 + ",  "
	  						+ fVal3 + ",  " + fVal4 + "  ");
					 */
			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACtot").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL1").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL2").getString();
			Thread.sleep(10);
			sVal4 = devABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL3").getString();
			LOG.info("  ActiveEnergyAC [kWh]:         " + sVal1 + ",  " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACL3").getString();
			LOG.info("  ActivePowerAC [W]:           " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("ReactivePowerAC", "ReactivePowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("ReactivePowerAC", "ReactivePowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("ReactivePowerAC", "ReactivePowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devABBMeter.getVal("ReactivePowerAC", "ReactivePowerACL3").getString();
			LOG.info("  ReactivePowerAC [var]:       " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("ApparentPowerAC", "ApparentPowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("ApparentPowerAC", "ApparentPowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("ApparentPowerAC", "ApparentPowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devABBMeter.getVal("ApparentPowerAC", "ApparentPowerACL3").getString();
			LOG.info("  ApparentPowerAC [va]:        " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("ActiveEnergyBalanceAC", "ActiveImportAC").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("ActiveEnergyBalanceAC", "ActiveExportAC").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("ActiveEnergyBalanceAC", "ActiveNetAC").getString();
			LOG.info("  ActiveEnergyBalanceAC [KWh]:    " + sVal1 + ", " + sVal2 + ",  " + sVal3 + "  ");

			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveImportAC").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveExportAC").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveNetAC").getString();
			LOG.info("  ReactiveEnergyBalanceAC [kvarh]:" + sVal1 + ", " + sVal2 + ",  " + sVal3  + "  ");

			Thread.sleep(10);
			sVal1 = devABBMeter.getVal("PowerQuadrant", "PowerQuadrantACtot").getString();
			Thread.sleep(10);
			sVal2 = devABBMeter.getVal("PowerQuadrant", "PowerQuadrantACL1").getString();
			Thread.sleep(10);
			sVal3 = devABBMeter.getVal("PowerQuadrant", "PowerQuadrantACL2").getString();
			Thread.sleep(10);
			sVal4 = devABBMeter.getVal("PowerQuadrant", "PowerQuadrantACL3").getString();
			LOG.info("  PowerQuadrant  tot/L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ", " + sVal3
					+ ",  " + sVal4 + "  ");

		}
		catch ( Exception e)
		{
			devABBMeterExceptions++;
			LOG.info( "Error reading value from device devABBMeter:" +  e);
			e.printStackTrace();
		}
	}


	// -----------------------------------------------------------------------------------------------------------------------------
	// Device ABBMeter Testing, location Testbox Bender controller
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initTB_ABBMeter(String aBaseDir, String aDescriptionFile ) {

		try {

			var properties = new Properties();
			properties.put("slave_id", "1");
			properties.put("serial_port", "COM3");
			properties.put("serial_baudrate", "9600");
			properties.put("serial_databits", "8");
			properties.put("serial_parity", "NONE");
			properties.put("serial_stopbits","1");

			devTB_ABBMeter = (GenDeviceApi) new SGrDeviceBuilder()
					.useSharedModbusGatewayRegistry(modbusPort1Registery)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.properties(properties)
					.build();

			devTB_ABBMeter.connect();

		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}
	}

	static void tstTB_ABBMeter()
	{
		double fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";

		try {

			LOG.info("\n@:Testing TestBox: ABBMeter: ");
			Thread.sleep(50);
			fVal1 = devTB_ABBMeter.getVal("VoltageAC", "VoltageACL1_N").getFloat64();
			Thread.sleep(10);
			fVal2 = devTB_ABBMeter.getVal("VoltageAC", "VoltageACL2_N").getFloat64();
			Thread.sleep(10);
			fVal3 = devTB_ABBMeter.getVal("VoltageAC", "VoltageACL3_N").getFloat64();
			Thread.sleep(10);
			fVal4 = devTB_ABBMeter.getVal("Frequency", "Frequency").getFloat64();
			LOG.info("  VoltageAC L1,2,3/Frequency [V,Hz]: " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + ",  " + fVal4 + "  ");
			Thread.sleep(10);
			fVal1 = devTB_ABBMeter.getVal("VoltageAC", "VoltageACL1_L2").getFloat64();
			Thread.sleep(10);
			fVal2 = devTB_ABBMeter.getVal("VoltageAC", "VoltageACL1_L3").getFloat64();
			Thread.sleep(10);
			fVal3 = devTB_ABBMeter.getVal("VoltageAC", "VoltageACL2_L3").getFloat64();
			LOG.info("  VoltageAC L12/13/23 [V]:           " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + "  ");
			Thread.sleep(10);
			fVal1 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACL1").getFloat64();
			Thread.sleep(10);
			fVal2 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACL2").getFloat64();
			Thread.sleep(10);
			fVal3 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACL3").getFloat64();
			LOG.info("  CurrentAC L1/2/3 [A]:              " + fVal1 + ",  " + fVal2 + ",  "
					+ fVal3 + "  ");
			Thread.sleep(10);
			// TODO PowerFactor not defined in ABB meter EI-XML
					    /*
		  				fVal1 = devTB_ABBMeter.getVal("PowerFactor", "PowerFactor").getFloat64();
		  				Thread.sleep(10);
		  				fVal2 = devTB_ABBMeter.getVal("PowerFactor", "PowerFactorL1").getFloat64();
		  				Thread.sleep(10);
		  				fVal3 = devTB_ABBMeter.getVal("PowerFactor", "PowerFactorL2").getFloat64();
		  				Thread.sleep(10);
		  				fVal4 = devTB_ABBMeter.getVal("PowerFactor", "PowerFactorL3").getFloat64();
		  				LOG.info("  Powerfactor tot/L1/L2/L3:          " + fVal1 + ",  " + fVal2 + ",  "
		  						+ fVal3 + ",  " + fVal4 + "  ");
					     */
			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACtot").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL1").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL2").getString();
			Thread.sleep(10);
			sVal4 = devTB_ABBMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL3").getString();
			LOG.info("  ActiveEnergyAC [kWh]:         " + sVal1 + ",  " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACL3").getString();
			LOG.info("  ActivePowerAC [W]:           " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("ReactivePowerAC", "ReactivePowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("ReactivePowerAC", "ReactivePowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("ReactivePowerAC", "ReactivePowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devTB_ABBMeter.getVal("ReactivePowerAC", "ReactivePowerACL3").getString();
			LOG.info("  ReactivePowerAC [var]:       " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("ApparentPowerAC", "ApparentPowerACtot").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("ApparentPowerAC", "ApparentPowerACL1").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("ApparentPowerAC", "ApparentPowerACL2").getString();
			Thread.sleep(10);
			sVal4 = devTB_ABBMeter.getVal("ApparentPowerAC", "ApparentPowerACL3").getString();
			LOG.info("  ApparentPowerAC [va]:        " + sVal1 + ", " + sVal2 + ",  " + sVal3
					+ ",  " + sVal4 + "  ");
			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("ActiveEnergyBalanceAC", "ActiveImportAC").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("ActiveEnergyBalanceAC", "ActiveExportAC").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("ActiveEnergyBalanceAC", "ActiveNetAC").getString();
			LOG.info("  ActiveEnergyBalanceAC [KWh]:    " + sVal1 + ", " + sVal2 + ",  " + sVal3 + "  ");

			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveImportAC").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveExportAC").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("ReactiveEnergyBalanceAC", "ReactiveNetAC").getString();
			LOG.info("  ReactiveEnergyBalanceAC [kvarh]:" + sVal1 + ", " + sVal2 + ",  " + sVal3  + "  ");

			Thread.sleep(10);
			sVal1 = devTB_ABBMeter.getVal("PowerQuadrant", "PowerQuadrantACtot").getString();
			Thread.sleep(10);
			sVal2 = devTB_ABBMeter.getVal("PowerQuadrant", "PowerQuadrantACL1").getString();
			Thread.sleep(10);
			sVal3 = devTB_ABBMeter.getVal("PowerQuadrant", "PowerQuadrantACL2").getString();
			Thread.sleep(10);
			sVal4 = devTB_ABBMeter.getVal("PowerQuadrant", "PowerQuadrantACL3").getString();
			LOG.info("  PowerQuadrant  tot/L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ", " + sVal3
					+ ",  " + sVal4 + "  ");


		}
		catch ( Exception e)
		{
			devTB_ABBMeterExcpetions++;
			LOG.info( "Error reading value from device devABBMeter:" +  e);
			e.printStackTrace();
		}
	}




	// -----------------------------------------------------------------------------------------------------------------------------
	// Device  VGT SGCP Testing
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initVGT_SGCP(String aBaseDir, String aDescriptionFile ) {

		try {

			Properties prop = new Properties();
			prop.put("tcp_address", "192.168.1.50");
			prop.put("tcp_port", "502");
			prop.put("SlaveID","0");

			devVGT_SGCP = new SGrDeviceBuilder()
					.useModbusGatewayFactory(new EasyModbusGatewayFactory())
					.properties(prop)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.build();

			devVGT_SGCP.connect();

		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description devVGT_SGCP: " + e);
		}
	}

	static void tstVGT_SGCP()
	{
		float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";

		try {
			LOG.info("\n@:Testing devVGT_SGCP");
			Thread.sleep(25);

			sVal1 = devVGT_SGCP.getVal("BiDirFlexMgmt", "ReadinessState").getString();
			sVal2 = devVGT_SGCP.getVal("BiDirFlexMgmt", "RunState").getString();
			sVal3 = devVGT_SGCP.getVal("BiDirFlexMgmt", "ActualActivePower").getString();
			if ((runtimeCnt & 1) == 0)
				devVGT_SGCP.setVal("BiDirFlexMgmt", "ActivePowerActivation", BooleanValue.of(false));
			else
				devVGT_SGCP.setVal("BiDirFlexMgmt", "ActivePowerActivation", BooleanValue.of(true));

			LOG.info(" ReadinessState / RunState / ActualActivePower: " + sVal1 + ", "
					+ sVal2 + sVal3 + "  ");

		}
		catch ( Exception e)
		{
			devVGT_SGCPExceptions++;
			LOG.info( "Error reading value from device devVGT_SGCP :" + e);
			e.printStackTrace();
		}
	}




	// -----------------------------------------------------------------------------------------------------------------------------
	// GARO Wallbox Test
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initGaroWallbox(String aBaseDir, String aDescriptionFile ) {

		try {

			Properties prop = new Properties();
			prop.put("tcp_address", "192.168.1.182");
			prop.put("tcp_port", "502");


			 devGaroWallbox = new SGrDeviceBuilder()
				.useModbusGatewayFactory(new EasyModbusGatewayFactory())
                .properties(prop)
				.eid(Path.of(aBaseDir, aDescriptionFile))
                .build();

			devGaroWallbox.connect();
		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}
	}


	static void tstGaroWallbox()
	{
		double fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0";
		int     iVal1  = 0;
		float CurtailCurrent;


		try {
			LOG.info("\n@:Testing GaroWallbox: ");
			if ((runtimeCnt%60)== 0)
			{
				CurtailCurrent = (float) 7.0 + (float)((runtimeCnt/60)%4) ;
				devGaroWallbox.setVal("Curtailment", "HemsCurrentLimit", Float64Value.of(CurtailCurrent));
				LOG.info("  Setting HemsCurrentLimit to :     " + CurtailCurrent + "  ");
			}
			fVal1 = devGaroWallbox.getVal("CurrentAC", "CurrentACL1").getFloat64();
			Thread.sleep(200);
			fVal2 = devGaroWallbox.getVal("CurrentAC", "CurrentACL2").getFloat64();
			Thread.sleep(200);
			fVal3 = devGaroWallbox.getVal("CurrentAC", "CurrentACL3").getFloat64();
			Thread.sleep(200);

			//programmer unknown setMockIntegerType(true);
			EnumRecord oEnumList = devGaroWallbox.getVal("EVSEState", "EV-StatusCode").getEnum();
			Thread.sleep(200);
			LOG.info("  EV-StatusCode:                    " + oEnumList.getLiteral() + "  ");
			//programmer unknown setMockIntegerType(false);

			oEnumList = devGaroWallbox.getVal("EVSEState", "ocppState").getEnum();
			Thread.sleep(200);
			LOG.info("  OCPP-StatusCode:                  " + oEnumList.getLiteral() + "  ");
			LOG.info("  CurrentAC[A]                      I[L1]= " + fVal1 + ",  I[L2] = "  + fVal2 + ",  I[L3] = "  + fVal3 + "  ");

			fVal1 = devGaroWallbox.getVal("ActivePowerAC", "ActivePowerACL1").getFloat64();
			Thread.sleep(200);
			fVal2 = devGaroWallbox.getVal("ActivePowerAC", "ActivePowerACL2").getFloat64();
			Thread.sleep(200);
			fVal3 = devGaroWallbox.getVal("ActivePowerAC", "ActivePowerACL3").getFloat64();
			Thread.sleep(200);
			LOG.info("  PowerAC[kW]:                      P[1L]= " + fVal1 + ",  P[L2] = "  + fVal2 + ",  P[L3] = "  + fVal3 + "  ");

			fVal1 = devGaroWallbox.getVal("ActiveEnergyAC", "ActiveEnergyACL1").getFloat64();
			Thread.sleep(200);
			fVal2 = devGaroWallbox.getVal("ActiveEnergyAC", "ActiveEnergyACL2").getFloat64();
			Thread.sleep(200);
			fVal3 = devGaroWallbox.getVal("ActiveEnergyAC", "ActiveEnergyACL3").getFloat64();
			Thread.sleep(200);
			LOG.info("  EnergyAC[kWh] L1/L2/L3:           W[1] = " + fVal1 + "  W[2] = "  + fVal2 + "  W[3] = "  + fVal3 + "  ");

			// TODO was is isSmartEV15118, however in EI-XML isSmartEV15188 is defined only.
			Boolean evState = devGaroWallbox.getVal("EVState", "isSmartEV15188").getBoolean();
			Thread.sleep(200);
			//programmer unknown setMockIntegerType(true);
			String evccid = devGaroWallbox.getVal("EVState", "EVCCID").getString();
			Thread.sleep(200);
			LOG.info("  EVState  support (ISO/IEC 15118): " + evState + ",    EVCCID = " + evccid + "  ");
			//programmer unknown setMockIntegerType(false);

			fVal1 = devGaroWallbox.getVal("Curtailment", "SafeCurrent").getFloat64();
			Thread.sleep(200);
			fVal2 = devGaroWallbox.getVal("Curtailment", "HemsCurrentLimit").getFloat64();
			Thread.sleep(200);
			fVal3 = devGaroWallbox.getVal("Curtailment", "HWCurrentLimit").getFloat64();
			Thread.sleep(200);
			iVal1 = (int)devGaroWallbox.getVal("Curtailment", "maxReceiveTimeSec").getInt16U();
			Thread.sleep(200);
			LOG.info("  Curtailment:                      SafeCurrent = " + fVal1 + "  HemsCurrentLimit = "  + fVal2 + "  HWCurrentLimit = "  + fVal3 +  "  maxReceiveTimeSec = "  + iVal1 +"  ");


		}
		catch ( Exception e)
		{
			devGaroWallboxExceptions++;
			LOG.info( "Error reading value from device devGaroWallbox:" + e);
			e.printStackTrace();
		}
	}




	// -----------------------------------------------------------------------------------------------------------------------------
	// OMCCI Wallbox Test
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initOMCCIWallbox(String aBaseDir, String aDescriptionFile ) {
		//TODO IBT/cb: complete and use full OMCCI EI.xml
		try {
			Properties prop = new Properties();
			prop.put("tcp_address", "192.168.1.183");
			prop.put("tcp_port", "502");

			 devOMCCIWallbox = new SGrDeviceBuilder()
					.useModbusGatewayFactory(new EasyModbusGatewayFactory())
					.properties(prop)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.build();

			devOMCCIWallbox.connect();

		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}
	}


	static void tstOMCCIWallbox()
	{
		double fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0";
		int     iVal1  = 0;
		float CurtailCurrent;


		try {
			LOG.info("\n@:Testing TestBox: OMCCIWallbox: ");
			if ((runtimeCnt%60)== 0)
			{
				CurtailCurrent = (float) 7.0 + (float)((runtimeCnt/60)%4) ;
				devOMCCIWallbox.setVal("Curtailment", "HemsCurrentLimit", Float64Value.of(CurtailCurrent));
				LOG.info("  Setting HemsCurrentLimit to :     " + CurtailCurrent + "  ");
			}
			fVal1 = devOMCCIWallbox.getVal("CurrentAC", "CurrentACL1").getFloat32();
			Thread.sleep(200);
			fVal2 = devOMCCIWallbox.getVal("CurrentAC", "CurrentACL2").getFloat32();
			Thread.sleep(200);
			fVal3 = devOMCCIWallbox.getVal("CurrentAC", "CurrentACL3").getFloat32();
			Thread.sleep(200);

			//programmer unknown setMockIntegerType(true);
			EnumRecord evseState = devOMCCIWallbox.getVal("EVSEState", "EV-StatusCode").getEnum();
			Thread.sleep(200);
			LOG.info("  EV-StatusCode:                    " + evseState.getLiteral() + "  ");
			EnumRecord sgrOCPPState = devOMCCIWallbox.getVal("EVSEState", "ocppState").getEnum();
			Thread.sleep(200);
			LOG.info("  OCPP-StatusCode:                  " + sgrOCPPState.getLiteral() + "  ");
			//programmer unknown (false);
			LOG.info("  CurrentAC[A]                      I[L1]= " + fVal1 + ",  I[L2] = "  + fVal2 + ",  I[L3] = "  + fVal3 + "  ");

			fVal1 = devOMCCIWallbox.getVal("ActivePowerAC", "ActivePowerACL1").getFloat32();
			Thread.sleep(200);
			fVal2 = devOMCCIWallbox.getVal("ActivePowerAC", "ActivePowerACL2").getFloat32();
			Thread.sleep(200);
			fVal3 = devOMCCIWallbox.getVal("ActivePowerAC", "ActivePowerACL3").getFloat32();
			Thread.sleep(200);
			LOG.info("  PowerAC[kW]:                      P[1L]= " + fVal1 + ",  P[L2] = "  + fVal2 + ",  P[L3] = "  + fVal3 + "  ");

			fVal1 = devOMCCIWallbox.getVal("ActiveEnergyAC", "ActiveEnergyACL1").getFloat32();
			Thread.sleep(200);
			fVal2 = devOMCCIWallbox.getVal("ActiveEnergyAC", "ActiveEnergyACL2").getFloat32();
			Thread.sleep(200);
			fVal3 = devOMCCIWallbox.getVal("ActiveEnergyAC", "ActiveEnergyACL3").getFloat32();
			Thread.sleep(200);
			LOG.info("  EnergyAC[kWh] L1/L2/L3:           W[1] = " + fVal1 + "  W[2] = "  + fVal2 + "  W[3] = "  + fVal3 + "  ");

			//sVal1 = devOMCCIWallbox.getVal("EVState", "isSmartEV15118");
			//Thread.sleep(200);
			//??? sVal2 = devOMCCIWallbox.getVal("EVState", "EVCCID");
			Thread.sleep(200);
			LOG.info("  EVState  support (ISO/IEC 15188): " + sVal1 + ",    EVCCID = " + sVal2 + "  ");

			fVal1 = devOMCCIWallbox.getVal("Curtailment", "SafeCurrent").getFloat32();
			Thread.sleep(200);
			fVal2 = devOMCCIWallbox.getVal("Curtailment", "HemsCurrentLimit").getFloat32();
			Thread.sleep(200);
			fVal3 = devOMCCIWallbox.getVal("Curtailment", "HWCurrentLimit").getFloat32();
			Thread.sleep(200);
			iVal1 = devOMCCIWallbox.getVal("Curtailment", "maxReceiveTimeSec").getInt16U();
			Thread.sleep(200);
			LOG.info("  Curtailment:                      SafeCurrent = " + fVal1 + "  HemsCurrentLimit = "  + fVal2 + "  HWCurrentLimit = "  + fVal3 +  "  maxReceiveTimeSec = "  + iVal1 +"  ");

		}
		catch ( Exception e)
		{
			devOMCCIWallboxExceptions++;
			LOG.info( "Error reading value from device devOMCCIWallbox:" + e);
			e.printStackTrace();
		}
	}



	// -----------------------------------------------------------------------------------------------------------------------------
	// Fronius Symo test
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initFroniusSymo(String aBaseDir, String aDescriptionFile ) {

		try {
			Properties prop = new Properties();
			prop.put("tcp_address", "192.168.1.181");
			prop.put("tcp_port", "502");

			 devFroniusSymo = new SGrDeviceBuilder()
					.useModbusGatewayFactory(new EasyModbusGatewayFactory())
					.properties(prop)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.build();

			devFroniusSymo.connect();
		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}
	}

	static void tstFroniusSymo()
	{
		float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
		boolean b;
		Value bitMapValue;
		long l;

		try {
			LOG.info("\n@:Testing FroniusSymo: ");

			// check Sunsoec Common Model Information
			l = devFroniusSymo.getVal("SunspCommonModel", "SunspecID").getInt32U();
			sVal1 = String.format("0x%x", l);
			Thread.sleep(25);
			sVal2 = devFroniusSymo.getVal("SunspCommonModel", "SunspCommonModelID").getString();
			Thread.sleep(25);
			sVal3 = devFroniusSymo.getVal("SunspCommonModel", "CommonModelBlockLen").getString();
			Thread.sleep(25);
			LOG.info("  SunspCommonModel: SspID , CommonModeID ,CommonModeBlockLen " + sVal1  + ",     " + sVal2 + ",  "	+ sVal3 );

			Thread.sleep(25);
			sVal1 = devFroniusSymo.getVal("SunspCommonModel", "ManufName").getString();
			Thread.sleep(25);
			sVal2 = devFroniusSymo.getVal("SunspCommonModel", "DeviceName").getString();;
			LOG.info("  SunspCommonModel:  "  + sVal1 + ",  "	+ sVal2 + "  ");

			Thread.sleep(25);
			sVal1 = devFroniusSymo.getVal("SunspCommonModel", "Options").getString();
			Thread.sleep(25);
			sVal2 = devFroniusSymo.getVal("SunspCommonModel", "SWVersion").getString();
			Thread.sleep(25);
			sVal3 = devFroniusSymo.getVal("SunspCommonModel", "SerialNumber").getString();
			LOG.info("  SunspCommonModel:  "  + sVal1 + ",  "	+ sVal2 + ",  "	+ sVal3 +  "  ");

			// check Sunsoec Inverter Model
			sVal1 = devFroniusSymo.getVal("SunspInvModel", "SunspInvModelID").getString();
			Thread.sleep(25);
			sVal2 = devFroniusSymo.getVal("SunspInvModel", "InvModelBlockLen").getString();
			Thread.sleep(25);
			sVal3 = devFroniusSymo.getVal("SunspInvModel", "CurrentACtot").getString();
			Thread.sleep(25);
			LOG.info("  SunspInvModel: SunspInvModelID, BlockLen,  CurrACtot[A]:  " + sVal1 + ",  " + sVal2 + ",  "	+ sVal3 + "  ");
			Thread.sleep(25);
			sVal1 = devFroniusSymo.getVal("SunspInvModel", "CurrentACL1").getString();
			Thread.sleep(25);
			sVal2 = devFroniusSymo.getVal("SunspInvModel", "CurrentACL2").getString();
			Thread.sleep(25);
			sVal3 = devFroniusSymo.getVal("SunspInvModel", "CurrentACL3").getString();
			Thread.sleep(25);
			LOG.info("  SunspInvModel: CurrentAC [A]:          " + sVal1 + ", " + sVal2 + ",  " + sVal3 + "  ");
			Thread.sleep(25);


			LOG.info("  Status  EvenList1  ");
			bitMapValue =  devFroniusSymo.getVal("SunspInvModel","EventList1");
			LOG.info("   StatusRegister :         {}", bitMapValue.getInt32());
			Thread.sleep(25);
			LOG.info("    EventList 1: isTrue =  ");
			bitMapValue.getBitmap().forEach( (literal, value) -> LOG.info("        {} = {}", literal, value));


			LOG.info("  Status EvenList2  ");
			bitMapValue =  devFroniusSymo.getVal("SunspInvModel","EventList2");
			LOG.info("   StatusRegister :         {}   ", bitMapValue.getInt32());
			LOG.info("   EventList 2: isTrue =  ");
			bitMapValue.getBitmap().forEach((literal, value) -> LOG.info("        {} = {}", literal, value));
		}
		catch ( Exception e)
		{
			devFroniusSymoExceptions++;
			LOG.info( "Error reading value from device: "+ devFroniusSymo.getClass().getName() + e);
			e.printStackTrace();
		}
	}



	// USED TO COPY / PASTE ADDITIONAL TEST DEVICES
	// -----------------------------------------------------------------------------------------------------------------------------
	// Device testing frame
	// -----------------------------------------------------------------------------------------------------------------------------
	static void initEmptyDevFrame(String aBaseDir, String aDescriptionFile ) {

		try {

			Properties prop = new Properties();
			prop.put("tcp_address", "192.168.1.123");
			prop.put("tcp_port", "502");

			/*
			 devXXXX = new SGrDeviceBuilder()
					.useModbusGatewayFactory(new EasyModbusGatewayFactory())
					.properties(prop)
					.eid(Path.of(aBaseDir, aDescriptionFile))
					.build();

			devXXXX.connect();
			*/
		}

		catch ( Exception e )
		{
			LOG.info( "Error loading device description. " + e);
		}
	}

	static void tstEmptyDevFrame()
	{
		float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";

		try {
			// if RTU is used, set address here
			// mbRTU.setUnitIdentifier((byte) 7);

			LOG.info("@:Testing   xxxxx");
			Thread.sleep(25);

			// Add test getters and setters for binary interface
			//fVal1 = devXXXX.getValByGDPType("FpName", "DpName").getFloat64();
			//Thread.sleep(10);


			// Add test getters and setters for String interfaces
			//sVal1 = devXXXX.getVal("ActiveEnergyBalanceAC", "ActiveImportAC");
			//Thread.sleep(10);

		}
		catch ( Exception e)
		{
			// LOG.info( "Error reading value from device: "+ devFdevXXXXSymo.getClass().getName() + e);
			// e.printStackTrace();
			// add Exception counter here
		}
	}

	/*  used by unknown programmer
	private static void setMockIntegerType(boolean isInteger) {
		if (mockModbusDriver instanceof GenDriverAPI4ModbusRTUMock) {
			((GenDriverAPI4ModbusRTUMock)mockModbusDriver).setIsIntegerType(isInteger);
		}
	}
	*/
}
