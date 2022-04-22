package communicator.impl;

import java.math.BigInteger;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import ch.smartgridready.ns.s.gr.v0.ModbusInterfaceSelectionType;
import ch.smartgridready.ns.s.gr.v0.SGrBasicGenDataPointTypeType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDataPointsFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusProfilesFrameType;
import ch.smartgridready.ns.s.gr.v0.SGrRWPType;
import ch.smartgridready.ns.s.gr.v0.SGrScalingType;
import ch.smartgridready.ns.s.gr.v0.TEnumConversionFct;
import ch.smartgridready.ns.s.gr.v0.TEnumObjectType;
import ch.smartgridready.ns.s.gr.v0.TSGrModbusRegisterRef;
import commHandler4Modbus.DriverAPI4Modbus;

public class SGrModbusDevice {
	
	private final DriverAPI4Modbus mbDrvRTU;
	
	private final DriverAPI4Modbus mbDrvTCP;
	
	
	private final SGrModbusDeviceDescriptionType myDeviceDescription;
	
	public SGrModbusDevice( 
			SGrModbusDeviceDescriptionType aDeviceDescription, 
			DriverAPI4Modbus aRtuDriver,
			DriverAPI4Modbus aTcpDriver) {
		myDeviceDescription = aDeviceDescription;
		mbDrvRTU = aRtuDriver;
		mbDrvTCP = aTcpDriver;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * this function reads registers from a Modbus device and converts it into the SmartGridready generic layer format
	 * sample code edited by Chris Broennnimann
	 * <!-- end-user-doc -->
	 * @throws Exception 
	 * @generated NOT
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
		return "invalid data";
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
	
	private String readValue( SGrModbusProfilesFrameType aProfile, SGrModbusDataPointsFrameType aDataPoint ) throws Exception {
		
		int[] mbregresp = new int[30];
		int mul = 1;
		int pwof10 = 0;
		
		SGrBasicGenDataPointTypeType dGenType = aProfile.getDpListElement().get(0).getDataPoint().get(0).getBasicDataType();
		
		SGrBasicGenDataPointTypeType dMBType = aProfile.getDpListElement().get(0).getModbusDataPoint().get(0).getModbusDataType();
		
		SGrRWPType dRWPType = aDataPoint.getDataPoint().get(0).getRwpDatadirection();
		
		if ( aDataPoint.getDpMbAttrReference().get(0).getModbusAttr().get(0).isSetSunssf()) 
		{ // use sunpsec 
		} else 
		{
			SGrScalingType attrScaling = aDataPoint.getDpMbAttrReference().get(0).getModbusAttr().get(0).getScalingByMulPwr();
			mul = attrScaling.getMultiplicator();
			pwof10 = attrScaling.getPowerof10();
		}
		
		TSGrModbusRegisterRef MBRegRef = aDataPoint.getModbusDataPoint().get(0).getModbusFirstRegisterReference();
		BigInteger regad = MBRegRef.getAddr();
		
		boolean bMBfirstRegOne = myDeviceDescription.getModbusInterfaceDesc().isFirstRegisterAddressIsOne();
		if (bMBfirstRegOne) {
			regad = regad.subtract(BigInteger.ONE);
		}
		
		int bitRank = MBRegRef.getBitRank();
		TEnumObjectType MBregType = MBRegRef.getRegisterType();
		int size = aDataPoint.getModbusDataPoint().get(0).getDpSizeNrRegisters();
		
		EList<TEnumConversionFct> MBconvScheme = myDeviceDescription.getModbusInterfaceDesc().getConversionScheme();
		
		if (myDeviceDescription.getModbusInterfaceDesc().getModbusInterfaceSelection() == ModbusInterfaceSelectionType.RTU)
		{
			return sendViaRTU( mbregresp, pwof10, MBRegRef, regad, size, MBconvScheme );
		}
		else if ( myDeviceDescription.getModbusInterfaceDesc().getModbusInterfaceSelection() == ModbusInterfaceSelectionType.TCPIP )
		{
			return sendViaTCP( mbregresp, pwof10, MBRegRef, regad, size, MBconvScheme );
		}
				
		return "invalid data";
	}
	
	
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
