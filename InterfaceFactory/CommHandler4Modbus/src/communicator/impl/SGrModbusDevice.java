package communicator.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import ch.smartgridready.ns.s.gr.v0.DptSelectedType;
import ch.smartgridready.ns.s.gr.v0.ModbusInterfaceSelectionType;
import ch.smartgridready.ns.s.gr.v0.SGrBasicGenDataPointTypeType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDataPointsFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusInterfaceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusProfilesFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrRWPType;
import ch.smartgridready.ns.s.gr.v0.SGrScalingType;
import ch.smartgridready.ns.s.gr.v0.TEnumConversionFct;
import ch.smartgridready.ns.s.gr.v0.TEnumObjectType;
import ch.smartgridready.ns.s.gr.v0.TSGrModbusRegisterRef;
import ch.smartgridready.ns.s.gr.v0.V0Factory;
import communicator.helper.GenDriverAPI4Modbus;
import de.re.easymodbus.exceptions.ModbusException;
import easymodbus.de.re.easymodbus.exceptions.SerialPortException;
import jssc.SerialPortTimeoutException;

public class SGrModbusDevice {
	
	private final GenDriverAPI4Modbus mbDrvRTU;
	
	// private final GenDriverAPI4Modbus mbDrvTCP;
	
	
	private final SGrModbusDeviceDescriptionType myDeviceDescription;
	
	public SGrModbusDevice( 
			SGrModbusDeviceDescriptionType aDeviceDescription, 
			GenDriverAPI4Modbus aRtuDriver) {
		myDeviceDescription = aDeviceDescription;
		mbDrvRTU = aRtuDriver;
		// mbDrvTCP = aTcpDriver;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * this function reads registers from a Modbus device and converts it into the SmartGridready generic layer format
	 * sample code edited by Chris Broennnimann
	 * <!-- end-user-doc -->
	 * 
	 **/ 			
	public String getVal(String sProfileName, String sDataPointName) throws Exception {

		Optional<SGrModbusProfilesFrameType> profile = findProfile(sProfileName);
		if (profile.isPresent()) {
			
			Optional<SGrModbusDataPointsFrameType> dataPoint = findDataPointForProfile( profile.get(), sDataPointName );
			if ( dataPoint.isPresent() )
			{			
				return readValue( profile.get(), dataPoint.get() );
			}						
		}	
		return "Profile/access-point " + sProfileName + "/" + sDataPointName + " not found!";
	}
		

	private Optional<SGrModbusProfilesFrameType> findProfile( String aProfileName )
	{
		return myDeviceDescription.getFpListElement().stream()
				.filter( modbusProfileFrame -> modbusProfileFrame.getFunctionalProfile().getProfileName().equals(aProfileName) )
				.findFirst();
	}
	
	private Optional<SGrModbusDataPointsFrameType> findDataPointForProfile( SGrModbusProfilesFrameType aProfile, String aDataPointName )
	{
		return aProfile.getDpListElement().stream()
				.filter( datapoint -> datapoint.getDataPoint().get(0).getDatapointName().equals( aDataPointName) )
				.findFirst();
	}
	
	private String readValue( 
			SGrModbusProfilesFrameType aProfile, 
			SGrModbusDataPointsFrameType aDataPoint ) throws Exception {
		
		String retval = "-";
		
		SGrBasicGenDataPointTypeType dGenType = aDataPoint.getDataPoint().get(0).getBasicDataType();

		switch (dGenType.getDpTypeSelected().getValue()) {
		case DptSelectedType.BOOLEAN_VALUE:
			boolean bVal = getValByGDPType(aProfile, aDataPoint).isSetBoolean();
			retval = String.format("%b", bVal);
			break;
		case DptSelectedType.ENUM_VALUE:
			// TODO: apply SGrEnumListType family of enumerationss inDpTT.setEnum(0);
			break;
		case DptSelectedType.FLOAT32_VALUE:
			float fVal = getValByGDPType(aProfile, aDataPoint).getFloat32();
			retval = String.format("%10.3f", fVal);
			break;
		case DptSelectedType.FLOAT64_VALUE:
			double dVal = getValByGDPType(aProfile, aDataPoint).getFloat64();
			retval = String.format("%10.3f", dVal);
			break;
		case DptSelectedType.INT16_VALUE:
			short shVal = getValByGDPType(aProfile, aDataPoint).getInt16();
			retval = String.format("%d", shVal);
			break;
		case DptSelectedType.INT16U_VALUE:
			int iVal = getValByGDPType(aProfile, aDataPoint).getInt16U();
			retval = String.format("%d", iVal);
			break;
		case DptSelectedType.INT32_VALUE:
			BigInteger bgVal = getValByGDPType(aProfile, aDataPoint).getInt32();
			retval = String.format(bgVal.toString());
			break;
		case DptSelectedType.INT32U_VALUE:
			long lVal = getValByGDPType(aProfile, aDataPoint).getInt32U();
			retval = String.format("%d", lVal);
			break;
		case DptSelectedType.INT64_VALUE:
			lVal = getValByGDPType(aProfile, aDataPoint).getInt64();
			break;
		case DptSelectedType.INT64U_VALUE:
			bgVal = getValByGDPType(aProfile, aDataPoint).getInt64U();
			break;
		case DptSelectedType.INT8_VALUE:
			byte btVal = getValByGDPType(aProfile, aDataPoint).getInt8();
			retval = String.format("%d", btVal);
			break;
		case DptSelectedType.INT8U_VALUE:
			shVal = getValByGDPType(aProfile, aDataPoint).getInt8U();
			retval = String.format("%d", shVal);
			break;
		case DptSelectedType.TIMESTAMP_VALUE:
			// TODO: apply gregorian calendar library =>
			// inDpTT.setTimestamp(TIMESTAMP_EDEFAULT);
			retval = String.format("not yet supported%n");
			break;
		case DptSelectedType.DATE_TIME_VALUE:
			// TODO: apply gregorian calendar library
			// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
			retval = String.format("not yet supported%n");
			break;
		case DptSelectedType.STRING_VALUE:
			retval = getValByGDPType(aProfile, aDataPoint).getString();
			break;
		default:
			break;
		}

		return retval;
	}
	
	
	public SGrBasicGenDataPointTypeType getValByGDPType(
			SGrModbusProfilesFrameType aProfile, 
			SGrModbusDataPointsFrameType aDataPoint)
			throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException,
			SerialPortTimeoutException, jssc.SerialPortException {
		
		
		SGrModbusInterfaceDescriptionType modbusInterfaceDesc = myDeviceDescription.getModbusInterfaceDesc();
		
		boolean bGotRegisters = false, bGotDiscrete = false;
		int[] mbregresp = new int[120];
		boolean[] mbbitresp = new boolean[64];
		int mul = 1;
		int pwof10 = 0;
		long tst = 1;
		// Register return value calculation
		long RegRes = 0;
		double dVal = 0.0;
		float fVal = (float) 0.0;

		SGrBasicGenDataPointTypeType RetVal = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
		SGrBasicGenDataPointTypeType dGenType = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
		SGrBasicGenDataPointTypeType dMBType = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
		
		// Data format adaption
		dGenType = aDataPoint.getDataPoint().get(0)
				.getBasicDataType();
		dMBType = aDataPoint.getModbusDataPoint()
				.get(0).getModbusDataType();
		// Data Direction ctrl
		SGrRWPType dRWPType = aDataPoint.getDataPoint().get(0).getRwpDatadirection();
		// Attributes
		// TODO: Workout instance of attributes, differentiate in between local XML
		// datapoints & Modbus based datapoints
		if (aDataPoint.getDpMbAttrReference()
				.size() > 0) { // there are Modbus attributes available
			if (aDataPoint.getDpMbAttrReference()
					.get(0).getModbusAttr().get(0).isSetSunssf()) { // use sunpsec
			} else {
				SGrScalingType attrScaling = aDataPoint.getDpMbAttrReference().get(0).getModbusAttr().get(0)
						.getScalingByMulPwr();
				mul = attrScaling.getMultiplicator();
				pwof10 = attrScaling.getPowerof10();
			}
		}
		
			
		TSGrModbusRegisterRef MBRegRef = aDataPoint.getModbusDataPoint().get(0).getModbusFirstRegisterReference();
		BigInteger regad = MBRegRef.getAddr();
		
		// boolean bMBfirstRegOne = this.modbusInterfaceDesc.isFirstRegisterAddressIsOne();
		boolean bMBfirstRegOne =modbusInterfaceDesc.isFirstRegisterAddressIsOne();
		
		if (bMBfirstRegOne)
			regad = regad.subtract(BigInteger.ONE);
		int bitRank = MBRegRef.getBitRank();
		TEnumObjectType MBregType = MBRegRef.getRegisterType();
		
		int size = aDataPoint.getModbusDataPoint().get(0).getDpSizeNrRegisters();
		EList<TEnumConversionFct> MBconvScheme = modbusInterfaceDesc.getConversionScheme();

		// TODO: catch SerialPortTimeoutException
		// accessing physical interface
		if (modbusInterfaceDesc.getModbusInterfaceSelection() == ModbusInterfaceSelectionType.RTU) {
			if (MBRegRef.getRegisterType() == TEnumObjectType.HOLD_REGISTER) {
				mbregresp = mbDrvRTU.ReadHoldingRegisters(regad.intValue(), size);
				bGotRegisters = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.INPUT_REGISTER) {
				mbregresp = mbDrvRTU.ReadInputRegisters(regad.intValue(), size);
				bGotRegisters = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.DISCRETE_INPUT) {
				mbbitresp = mbDrvRTU.ReadDiscreteInputs(regad.intValue(), size);
				bGotDiscrete = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.COIL) {
				mbbitresp = mbDrvRTU.ReadCoils(regad.intValue(), size);
				bGotDiscrete = true;
			}
		}
		/*
		} else if (modbusInterfaceDesc.getModbusInterfaceSelection() == ModbusInterfaceSelectionType.TCPIP) {
			if (MBRegRef.getRegisterType() == TEnumObjectType.HOLD_REGISTER) {
				mbregresp = mbDrvTCP.ReadHoldingRegisters(regad.intValue(), size);
				bGotRegisters = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.INPUT_REGISTER) {
				mbregresp = mbDrvTCP.ReadInputRegisters(regad.intValue(), size);
				bGotRegisters = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.DISCRETE_INPUT) {
				mbbitresp = mbDrvTCP.ReadDiscreteInputs(regad.intValue(), size);
				bGotDiscrete = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.COIL) {
				mbbitresp = mbDrvTCP.ReadCoils(regad.intValue(), size);
				bGotDiscrete = true;
			}
		}
		*/

		int[] singleResp = new int[2];
		int[] doubleResp = new int[4];
		if (bGotRegisters) {
			if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN))
				mbregresp = ConvertStream(MBconvScheme, mbregresp, size);
			for (int l = 0; l < size; l++) {
				if (l == 0)
					RegRes = mbregresp[l];
				else {
					// RegRes = (RegRes * 65536) & 0xffff0000;
					// RegRes = RegRes * 65536;
					RegRes = RegRes << 16;
					RegRes = RegRes | (mbregresp[l] & 0x0000ffff);
				}
			    if (size > 2)
			    {
			    	// manage block transfers
			    }
			    else if (size == 2)
			    {
			    	singleResp[0] = mbregresp[0];
			    	singleResp[1] = mbregresp[1];
			    }
			    else if (size == 4)
			    {
			    	doubleResp[0] = mbregresp[0];
			    	doubleResp[1] = mbregresp[1];
			    	doubleResp[2] = mbregresp[2];
			    	doubleResp[3] = mbregresp[3];
			    }
			}
		}
		
		if (bGotDiscrete) { // TODO: manage discrete block conversion

		}		
	    
	    // generic type expected as API return type
		// TODO: Check why the data type "long" does not create a 64 bit signed integer
		// for all Java virtual machines
		switch (dGenType.getDpTypeSelected().getValue()) {
		case DptSelectedType.BOOLEAN_VALUE:
			// TODO: add bus data
			boolean bVal = false;
			if (bGotRegisters) {
				if (RegRes != 0)
					bVal = true;
			} else if (bGotDiscrete) {
				bVal = mbbitresp[0];
			}
			RetVal.setBoolean(bVal);
			break;
		case DptSelectedType.ENUM_VALUE:
			// TODO: apply SGrEnumListType family of enumerations inDpTT.setEnum(0);
			RetVal.setEnum(null);
			break;
		case DptSelectedType.FLOAT32_VALUE:
			if (bGotRegisters) {

				if ((dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT16_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT32_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT64_VALUE)) {
					dVal = (double) RegRes;
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					fVal = (float) dVal;
				} else if ((dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT16U_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT32U_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT64U_VALUE)) {
					dVal = (double) Math.abs(RegRes);
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					fVal = (float) dVal;
				} else if (dMBType.getDpTypeSelected().getValue() == DptSelectedType.FLOAT32_VALUE) {
					fVal = NonGen_ModbusHlpr.ConvRegistersToFloat(singleResp);
				}
			} else if (dMBType.getDpTypeSelected().getValue() == DptSelectedType.FLOAT64_VALUE) {
				dVal = NonGen_ModbusHlpr.ConvRegistersToDouble(singleResp);
				fVal = (float) dVal;
				;
			}
			RetVal.setFloat32(fVal);
			break;
		case DptSelectedType.FLOAT64_VALUE:
			if (bGotRegisters) {
				if ((dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT16_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT32_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT64_VALUE)) {
					dVal = (double) RegRes;
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					RetVal.setFloat64(dVal);
				} else if ((dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT16U_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT32U_VALUE)
						|| (dMBType.getDpTypeSelected().getValue() == DptSelectedType.INT64U_VALUE)) {
					dVal = (double) Math.abs(RegRes);
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					RetVal.setFloat64(dVal);
				} else if (dMBType.getDpTypeSelected().getValue() == DptSelectedType.FLOAT32_VALUE) {
					fVal = (float) RegRes;
					RetVal.setFloat64((double) fVal);
				}
			}
			break;
		case DptSelectedType.INT16_VALUE:
			short shVal = (short) RegRes;
			RetVal.setInt16(shVal);
			break;
		case DptSelectedType.INT16U_VALUE:
			int iVal = (int) Math.abs(RegRes);
			RetVal.setInt16U(iVal);
			break;
		case DptSelectedType.INT32_VALUE:
			BigInteger bgVal = BigInteger.valueOf(RegRes);
			RetVal.setInt32(bgVal);
			break;
		case DptSelectedType.INT32U_VALUE:
			long lVal = (long) Math.abs(RegRes);
			RetVal.setInt32U(lVal);
			break;
		case DptSelectedType.INT64_VALUE:
			lVal = (long) RegRes;
			RetVal.setInt64(lVal);
			break;
		case DptSelectedType.INT64U_VALUE:
			// TODO: add bus data
			bgVal = BigInteger.valueOf((long) Math.abs(RegRes));
			RetVal.setInt64U(bgVal);
			break;
		case DptSelectedType.INT8_VALUE:
			byte btVal = (byte) RegRes;
			RetVal.setInt8(btVal);
			break;
		case DptSelectedType.INT8U_VALUE:
			shVal = (byte) Math.abs(RegRes);
			RetVal.setInt8U(shVal);
			break;
		case DptSelectedType.TIMESTAMP_VALUE:
			// TODO: apply gregorian calendar library =>
			// inDpTT.setTimestamp(TIMESTAMP_EDEFAULT);
			RetVal.setTimestamp(null);
			break;
		case DptSelectedType.DATE_TIME_VALUE:
			// TODO: apply gregorian calendar library
			// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
			RetVal.setTimestamp(null);
			break;
		case DptSelectedType.STRING_VALUE:		
			// TODO: extend this to be able to read whole strings in Modbus block transfers
			String str = new String();
			char chr = (char) (RegRes & 0xff) ;
			RetVal.setString(chr + "\0");
			break;
		default:
			break;
		}

		// TODO: other Modbus functions, Block transfers, multiple coordinated transfers
		// conversion schemes
		// attribute management
		// int res = mbregresp[size - 2] * 65536 + mbregresp[size- 1]
		// RetVal.*
		// Not yet supported types
		// unit scaling
		return RetVal;
		
		
	}
	
	/*
	private String sendViaTCP(int[] mbregresp, int pwof10, TSGrModbusRegisterRef MBRegRef, BigInteger regad, int size,
			EList<TEnumConversionFct> MBconvScheme) throws Exception {
		//mbregresp = mbDrvTCP.ReadHoldingRegisters(regad.intValue(), size);
		if (MBRegRef.getRegisterType() == TEnumObjectType.HOLD_REGISTER)
			mbregresp = mbDrvTCP.ReadHoldingRegisters(regad.intValue(), size);
		else if (MBRegRef.getRegisterType() == TEnumObjectType.INPUT_REGISTER)
			// TODO: add driver API declaration mbregresp = mbDrvTCP.ReadInputRegisters(regad.intValue(), size);
			if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN)) {
				mbregresp = ConvertStream(MBconvScheme, mbregresp, size);
			}
		int res = 0;
		for (int l = 0; l < size; l++) {
			res = (res * 65536) + mbregresp[l];
		}
		double fres = res;
		fres = fres * Math.pow(10.0, pwof10);
		String sres = String.format("%10.2f", fres);
		return sres;
	}
	*/

	private String sendViaRTU(int[] mbregresp, int pwof10, TSGrModbusRegisterRef MBRegRef, BigInteger regad, int size,
			EList<TEnumConversionFct> MBconvScheme) throws Exception {
		if (MBRegRef.getRegisterType() == TEnumObjectType.HOLD_REGISTER)
			mbregresp = mbDrvRTU.ReadHoldingRegisters(regad.intValue(), size);
		else if (MBRegRef.getRegisterType() == TEnumObjectType.INPUT_REGISTER)
			mbregresp = mbDrvRTU.ReadInputRegisters(regad.intValue(), size);
		if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN)) {
			mbregresp = ConvertStream(MBconvScheme, mbregresp, size);
		}
		int res = 0;
		for (int l = 0; l < size; l++) {
			res = (res * 65536) + mbregresp[l];
		}
		// TODO: other Modbus functions, Block transfers, multiple coordinated transfers
		// conversion schemes
		// attribute management
		//int res = mbregresp[size - 2] * 65536 + mbregresp[size- 1];
		double fres = res;
		fres = fres * Math.pow(10.0, pwof10);
		String sres = String.format("%10.2f", fres);
		return sres;
	}	
	
	
	
	private int[] ConvertStream(EList<TEnumConversionFct> mBconvScheme, int[] mbregresp, int size) {

		int n, c;
		int[] mbregconv = new int[30];

		try {

			n = mBconvScheme.size();
			for (n = 0; n < mBconvScheme.size(); n++) {
				if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_BIT_ORDER)) {

				} else if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_BYTE_ORDER)) {
					for (c = 0; c < size; c++) {
						byte[] result = new byte[2];
						result[1] = (byte) (mbregconv[c] >> 8);
						result[0] = (byte) (mbregconv[c]);
						mbregresp[c] = (int) result[1] + ((int) result[0]) << 8;
					}
				} else if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_WORD_ORDER)) {
					if ((size % 2) > 0)
						throw new IllegalArgumentException("CHANGE_WORD_ORDER: Input Array length invalid");
					for (c = 0; c < size; c = c + 2) {
						mbregconv[c] = mbregresp[c + 1];
						mbregconv[c + 1] = mbregresp[c];
					}
				} else if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_DWORD_ORDER)) {
					if ((size % 4) > 0)
						throw new IllegalArgumentException("CHANGE_DWORD_ORDER: Input Array length invalid");
					for (c = 0; c < size; c = c + 4) {
						mbregconv[c] = mbregresp[c + 3];
						mbregconv[c + 1] = mbregresp[c + 2];
						mbregconv[c + 2] = mbregresp[c + 1];
						mbregconv[c + 3] = mbregresp[c];
					}
				}
			}
			// prepare fpr next adjustment (if any)
			mbregresp = mbregconv;
		}

		catch (IllegalArgumentException e1) {
			System.out.println("***IllegalArgumentException: " + e1.toString());
			return mbregresp;
		} finally {
		}
		return mbregconv;
	}
	
	
	
	

	

}
