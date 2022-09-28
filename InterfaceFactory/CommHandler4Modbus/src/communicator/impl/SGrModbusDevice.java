/**
*Copyright(c) 2021 Verein SmartGridready Switzerland
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

This Module includes automatically generated code, generated from SmartGridready Modus XML Schema definitions
check for "EI-Modbus" and "Generic" directories in our Namespace http://www.smartgridready.ch/ns/SGr/V0/

*/
package communicator.impl;

import java.math.BigInteger;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import com.smartgridready.ns.v0.SGReadyStateLv1Type;
import com.smartgridready.ns.v0.SGReadyStateLv2Type;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrEVSEStateLv1Type;
import com.smartgridready.ns.v0.SGrEVSEStateLv2Type;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.SGrHPOpModeType;
import com.smartgridready.ns.v0.SGrMeasValueSourceType;
import com.smartgridready.ns.v0.SGrMeasValueStateType;
import com.smartgridready.ns.v0.SGrMeasValueTendencyType;
import com.smartgridready.ns.v0.SGrModbusDataPointsFrameType;
import com.smartgridready.ns.v0.SGrModbusDeviceDescriptionType;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.SGrModbusLayer6DeviationType;
import com.smartgridready.ns.v0.SGrModbusProfilesFrameType;
import com.smartgridready.ns.v0.SGrOCPPStateType;
import com.smartgridready.ns.v0.SGrObligLvlType;
import com.smartgridready.ns.v0.SGrPowerSourceType;
import com.smartgridready.ns.v0.SGrRWPType;
import com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPServiceType;
import com.smartgridready.ns.v0.SGrScalingType;
import com.smartgridready.ns.v0.SGrSunspStateCodesType;
import com.smartgridready.ns.v0.TEnumConversionFct;
import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import com.smartgridready.ns.v0.V0Factory;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.helper.ModbusHlpr;

public class SGrModbusDevice {

	private final GenDriverAPI4Modbus drv4Modbus;

	private final SGrModbusDeviceDescriptionType myDeviceDescription;

	public SGrModbusDevice(SGrModbusDeviceDescriptionType aDeviceDescription, GenDriverAPI4Modbus aRtuDriver) {
		myDeviceDescription = aDeviceDescription;
		drv4Modbus = aRtuDriver;

	}


	/**
	 * 
	 * @param sProfileName
	 * @param sDataPointName
	 * @return
	 * @throws GenDriverException
	 * @throws GenDriverSocketException
	 * @throws GenDriverModbusException
	 */
	public String getVal(String sProfileName, String sDataPointName) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		Optional<SGrModbusProfilesFrameType> profile = findProfile(sProfileName);
		if (profile.isPresent()) {

			Optional<SGrModbusDataPointsFrameType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				return readValue(profile.get(), dataPoint.get());
			}
		}
		return "Profile/access-point " + sProfileName + "/" + sDataPointName + " not found!";
	}

	private Optional<SGrModbusProfilesFrameType> findProfile(String aProfileName) {
		return myDeviceDescription.getFpListElement().stream().filter(
				modbusProfileFrame -> modbusProfileFrame.getFunctionalProfile().getProfileName().equals(aProfileName))
				.findFirst();
	}

	private Optional<SGrModbusDataPointsFrameType> findDataPointForProfile(SGrModbusProfilesFrameType aProfile,
			String aDataPointName) {
		return aProfile.getDpListElement().stream()
				.filter(datapoint -> datapoint.getDataPoint().get(0).getDatapointName().equals(aDataPointName))
				.findFirst();
	}

	private String readValue(SGrModbusProfilesFrameType aProfile, SGrModbusDataPointsFrameType aDataPoint)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		String retval = "-";

		SGrBasicGenDataPointTypeType dGenType = aDataPoint.getDataPoint().get(0).getBasicDataType();

		if (dGenType.isSetBoolean()) {
			boolean bVal = getValByGDPType(aProfile, aDataPoint).isBoolean();
			retval = String.format("%b", bVal);
		} else if (dGenType.getEnum() != null) {
			SGrEnumListType oVal = dGenType.getEnum();
			if (oVal.isSetSgrEVState()) {
				SGrEnumListType en = getValByGDPType(aProfile, aDataPoint).getEnum();
				retval = Enum2StringConversion(en);
			}
		} else if (dGenType.isSetFloat32()) {
			float fVal = getValByGDPType(aProfile, aDataPoint).getFloat32();
			retval = String.format("%10.3f", fVal);
		} else if (dGenType.isSetFloat64()) {
			double dVal = getValByGDPType(aProfile, aDataPoint).getFloat64();
			retval = String.format("%10.3f", dVal);
		} else if (dGenType.isSetInt16()) {
			short shVal = getValByGDPType(aProfile, aDataPoint).getInt16();
			retval = String.format("%d", shVal);
		} else if (dGenType.isSetInt16U()) {
			int iVal = getValByGDPType(aProfile, aDataPoint).getInt16U();
			retval = String.format("%d", iVal);
		} else if (dGenType.getInt32() != null) {
			BigInteger bgVal = getValByGDPType(aProfile, aDataPoint).getInt32();
			retval = String.format(bgVal.toString());
		} else if (dGenType.isSetInt32U()) {
			long lVal = getValByGDPType(aProfile, aDataPoint).getInt32U();
			retval = String.format("%d", lVal);
		} else if (dGenType.isSetInt64()) {
			long lVal = getValByGDPType(aProfile, aDataPoint).getInt64();
			retval = String.format("%d", lVal);
		} else if (dGenType.getInt64U() != null) {
			BigInteger bgVal = getValByGDPType(aProfile, aDataPoint).getInt64U();
			retval = String.format("%d", bgVal);
		} else if (dGenType.isSetInt8()) {
			byte btVal = getValByGDPType(aProfile, aDataPoint).getInt8();
			retval = String.format("%d", btVal);
		} else if (dGenType.isSetInt8U()) {
			short shVal = getValByGDPType(aProfile, aDataPoint).getInt8U();
			retval = String.format("%d", shVal);
		} else if (dGenType.getString() != null) {
			retval = getValByGDPType(aProfile, aDataPoint).getString();
		} else if (dGenType.getDateTime() != null) {
			//
			// TODO: apply gregorian calendar library
			// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
			retval = String.format("readValue DateTime: not yet supported%n");
		} else
			retval = String.format("readValue else: data type not yet supported%n");
		return retval;
	}

	public SGrBasicGenDataPointTypeType getValByGDPType(SGrModbusProfilesFrameType aProfile,
			SGrModbusDataPointsFrameType aDataPoint) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		return prv_getValByGDPType(aProfile, aDataPoint);

	}

	public SGrBasicGenDataPointTypeType getValByGDPType(String sProfileName, String sDataPointName)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		Optional<SGrModbusProfilesFrameType> profile = findProfile(sProfileName);

		SGrBasicGenDataPointTypeType retval = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();

		if (profile.isPresent()) {
			Optional<SGrModbusDataPointsFrameType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				retval = prv_getValByGDPType(profile.get(), dataPoint.get());
			}
		}

		return retval;
	}

	private SGrBasicGenDataPointTypeType prv_getValByGDPType(
		SGrModbusProfilesFrameType aProfile, 
		SGrModbusDataPointsFrameType aDataPoint)
		throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
			
		
		SGrModbusInterfaceDescriptionType modbusInterfaceDesc = myDeviceDescription.getModbusInterfaceDesc();
		
		boolean bGotRegisters = false, bGotDiscrete = false;
		int[] mbregresp = new int[120];
		boolean[] mbbitresp = new boolean[64];
		int mul = 1, l6dev = -1;
		int pwof10 = 0;
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
		if (aDataPoint.getModbusAttr().size() > 0) 
		{ // there are Modbus attributes available
			
			if (aDataPoint.getModbusAttr().get(0).isSetSunssf()) { // use sunpsec
			} else {
				SGrScalingType attrScaling = aDataPoint.getModbusAttr().get(0).getScalingByMulPwr();
				mul = attrScaling.getMultiplicator();
				pwof10 = attrScaling.getPowerof10();
			}
			if (aDataPoint.getModbusAttr().get(0).isSetLayer6Deviation()   )
		       	l6dev = aDataPoint.getModbusAttr().get(0).getLayer6Deviation().getValue();
		}
		
			
		TSGrModbusRegisterRef MBRegRef = aDataPoint.getModbusDataPoint().get(0).getModbusFirstRegisterReference();
		BigInteger regad = MBRegRef.getAddr();
		
		// boolean bMBfirstRegOne = this.modbusInterfaceDesc.isFirstRegisterAddressIsOne();
		boolean bMBfirstRegOne = modbusInterfaceDesc.isFirstRegisterAddressIsOne();
		
		if (bMBfirstRegOne)
			regad = regad.subtract(BigInteger.ONE);
		int bitRank = MBRegRef.getBitRank();
		TEnumObjectType MBregType = MBRegRef.getRegisterType();
		
		int size = aDataPoint.getModbusDataPoint().get(0).getDpSizeNrRegisters();
		EList<TEnumConversionFct> MBconvScheme = modbusInterfaceDesc.getConversionScheme();

		// TODO: catch SerialPortTimeoutException
		// accessing physical interface
		//if (modbusInterfaceDesc.getModbusInterfaceSelection() == ModbusInterfaceSelectionType.RTU) {
			if (MBRegRef.getRegisterType() == TEnumObjectType.HOLD_REGISTER) {
				mbregresp = drv4Modbus.ReadHoldingRegisters(regad.intValue(), size);
				bGotRegisters = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.INPUT_REGISTER) {
				mbregresp = drv4Modbus.ReadInputRegisters(regad.intValue(), size);
				bGotRegisters = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.DISCRETE_INPUT) {
				mbbitresp = drv4Modbus.ReadDiscreteInputs(regad.intValue(), size);
				bGotDiscrete = true;
			} else if (MBRegRef.getRegisterType() == TEnumObjectType.COIL) {
				mbbitresp = drv4Modbus.ReadCoils(regad.intValue(), size);
				bGotDiscrete = true;
			}

		int[] singleResp = new int[2];
		int[] doubleResp = new int[4];
		if (bGotRegisters) {
			if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN))
				// TODO: rethink Blocktransfer here
				mbregresp = ConvertStream(MBconvScheme, mbregresp, size);
			// do we have Layer 6 deviations ?
	        if (l6dev >= 0  )   mbregresp = manageLayer6deviation(l6dev, mbregresp, size);

	        for (int u = 0; u < size; u++) {
	        	
	        	
				if (u == 0)
					RegRes = mbregresp[u];
				else {
					RegRes = RegRes << 16;
					RegRes = RegRes | (mbregresp[u] & 0x0000ffff);
				}
				// TODO: finalize this. Is it really needed?
				
				if (size == 2)
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
			    else if (size > 2)
			    {
			    	
			    }
			    
				//TODO: manage block transfers if timeSyncBlockNotification is set
			}
		}
		
		if (bGotDiscrete) { // TODO: manage discrete block conversion

		}		
	    
	    // generic type expected as API return type
		// TODO: Check why the data type "long" does not create a 64 bit signed integer
		// for all Java virtual machines
		
        	
		if (dGenType.isSetBoolean()) {
			// TODO: add bus data
			boolean bVal = false;
			if (bGotRegisters) {
				if (RegRes != 0)
					bVal = true;
			} else if (bGotDiscrete) {
				bVal = mbbitresp[0];
			}
			RetVal.setBoolean(bVal);
		}
		else if (dGenType.isSetFloat32()) {
			if (bGotRegisters) {

				if ((dMBType.isSetInt16())
						|| (dMBType.getInt32()!=null)
						|| (dMBType.isSetInt64() )) {
					dVal = (double) RegRes;
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					fVal = (float) dVal;
				} else if ((dMBType.isSetInt16U())
						|| (dMBType.isSetInt32U())
						|| (dMBType.getInt64U()!=null)) {
					dVal = (double) Math.abs(RegRes);
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					fVal = (float) dVal;
				} else if (dMBType.isSetFloat32()) {
					fVal = ModbusHlpr.ConvRegistersToFloat(singleResp);
				} 
			    else if (dMBType.isSetFloat64()) {
			    	dVal = ModbusHlpr.ConvRegistersToDouble(singleResp);
			    	fVal = (float) dVal;
				}
			}
			RetVal.setFloat32(fVal);
		}
		else if (dGenType.isSetFloat64()) {
			if (bGotRegisters) {
				if ((dMBType.isSetInt16())
						|| (dMBType.getInt32()!=null)
						|| (dMBType.isSetInt64())) {
					dVal = (double) RegRes;
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					RetVal.setFloat64(dVal);
				} else if ((dMBType.isSetInt16U())
						|| (dMBType.isSetInt32U())
						|| (dMBType.getInt64U()!=null)) {
					dVal = (double) Math.abs(RegRes);
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					RetVal.setFloat64(dVal);
				} else if (dMBType.isSetFloat32()) {
					fVal = (float) RegRes;
					RetVal.setFloat64((double) fVal);
				}
			}
		}
		else if (dGenType.isSetInt16()) {
			short shVal = (short) RegRes;
			RetVal.setInt16(shVal);
		}
		else if (dGenType.isSetInt16U()) {
			int iVal = (int) Math.abs(RegRes);
			RetVal.setInt16U(iVal);
		}
		else if (dGenType.isSetInt32U()) {
			long lVal = (long) Math.abs(RegRes);
			RetVal.setInt32U(lVal);
		}
		else if (dGenType.isSetInt64()) {
			long lVal = (long) RegRes;
			RetVal.setInt64(lVal);
		}
		else if (dGenType.isSetInt8()) {
			byte btVal = (byte) RegRes;
			RetVal.setInt8(btVal);
		}
		else if (dGenType.isSetInt8U()) {
			short shVal = (byte) Math.abs(RegRes);
			RetVal.setInt8U(shVal);
		}
		else if (dGenType.getEnum()!=null) {
			SGrEnumListType tt = RegRes2EnumConversion(RegRes, dGenType.getEnum());  
			RetVal.setEnum(tt);    
		}
		else if (dGenType.getInt32()!=null) {
			BigInteger bgVal = BigInteger.valueOf(RegRes);  
			RetVal.setInt32(bgVal);
		}
		else if (dGenType.getInt64U()!=null) {
			BigInteger bgVal = BigInteger.valueOf((long) Math.abs(RegRes));
			RetVal.setInt64U(bgVal);
		}
		 else if(dGenType.getDateTime()!=null) {
		 // TODO: apply gregorian calendar library
		// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
		// TODO: apply dGenType
		 }
		 else if( dGenType.getString()!=null) {
			    String sValue= ModbusHlpr.ConvRegistersToString(mbregresp, 0, size*2);
			    RetVal.setString(sValue);
		 }
		else
		{ // error handling for missing instance
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
	
	
	//private int[] manageLayer6deviation( EList<SGrModbusLayer6DeviationType> mBlayer6Scheme, int[] mbregresp, int size) {
	private int[] manageLayer6deviation(int mBlayer6Scheme, int[] mbregresp, int size) {
		
		int[] mbregconv = new int[10];
		
		//switch(aDataPoint.getDpMbAttrReference().get(0).getModbusAttr().get(0).getLayer6Deviation().getLiteral()  )
		switch (mBlayer6Scheme)
    	{
    		case SGrModbusLayer6DeviationType._2REG_BASE1000_H2L_VALUE:
    			if (size == 2)
    			{
    				long lv =  ((long) mbregresp[0]) *1000;
    				lv = lv + (long) mbregresp[1];
    				mbregconv[1] =  (int) (lv & 0xffff);	
    				mbregconv[0] =  (int) ((lv>>16) & 0xffff);				
    			}
    			break;
    		case SGrModbusLayer6DeviationType._2REG_BASE1000_L2H_VALUE:
    			if (size == 2)
    			{
    				long lv =  ((long) mbregresp[1]) *1000;
    				lv = lv + (long) mbregresp[0];
    				mbregconv[1] =  (int) (lv & 0xffff);	
    				mbregconv[0] =  (int) ((lv>>16) & 0xffff);				
    			}
    			break;
    	}
	  
		return mbregconv;
	}

	private int[] ConvertStream(EList<TEnumConversionFct> mBconvScheme, int[] mbregresp, int size) {
		// TODO: rethink Blocktransfer here

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

	public String setVal(String sProfileName, String sDataPointName, String sValue) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		Optional<SGrModbusProfilesFrameType> profile = findProfile(sProfileName);
		if (profile.isPresent()) {

			Optional<SGrModbusDataPointsFrameType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				writeValue(profile.get(), dataPoint.get(), sValue);
			}
		}
		return "Profile/access-point " + sProfileName + "/" + sDataPointName + " not found!";
	}

	private void writeValue(SGrModbusProfilesFrameType aProfile, SGrModbusDataPointsFrameType aDataPoint, String sValue)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		SGrBasicGenDataPointTypeType dGenType = aDataPoint.getDataPoint().get(0).getBasicDataType();

		if (dGenType.isSetBoolean()) {
			boolean bVal = false;
			if ((sValue == "true") || (sValue == "TRUE"))
				bVal = true;
			dGenType.setBoolean(bVal);
		}
		/*
		 * else if (dGenType.eIsSet(enum) { // TODO: SGrBasicGenDataPointTypeType, apply
		 * SGrEnumListType family of enumerationss inDpTT.setEnum(0); }
		 */
		else if (dGenType.isSetFloat32()) {
			float fVal;
			fVal = Float.parseFloat(sValue);
			dGenType.setFloat32(fVal);
			dGenType.setFloat32(fVal);
		} else if (dGenType.isSetFloat64()) {
			double dVal;
			dVal = Double.parseDouble(sValue);
			dGenType.setFloat64(dVal);
		} else if (dGenType.isSetInt16()) {
			short shVal;
			shVal = Short.parseShort(sValue);
			dGenType.setInt16(shVal);
		} else if (dGenType.isSetInt16U()) {
			int iVal;
			iVal = Integer.parseInt(sValue);
			dGenType.setInt16U(iVal);
		} else if (dGenType.getInt32() != null) {
			BigInteger bgVal = new BigInteger(sValue);
			dGenType.setInt32(bgVal);
		} else if (dGenType.isSetInt32U()) {
			long lVal = Long.parseLong(sValue);
			dGenType.setInt32U(lVal);
		} else if (dGenType.isSetInt64()) {
			long lVal = Long.parseLong(sValue);
			dGenType.setInt64(lVal);
		} else if (dGenType.getInt64U() != null) {
			// TODO: SGrBasicGenDataPointTypeType, isSetInt64U Funktion wurde vom Modeler
			// nicht generiert
			BigInteger bgVal1 = new BigInteger(sValue);
			dGenType.setInt64U(bgVal1);
		} else if (dGenType.isSetInt8()) {
			byte btVal;
			btVal = Byte.parseByte(sValue);
			dGenType.setInt8(btVal);
		} else if (dGenType.isSetInt8U()) {
			Short shVal = Short.parseShort(sValue);
			dGenType.setInt8U(shVal);
		} else if (dGenType.getDateTime() != null) {
			// TODO: apply gregorian calendar library
			// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
			// TODO: apply dGenType
		} else if (dGenType.getString() != null) {
			// TODO:parameter conversion
			sValue = String.format("TODO:parameter conversion");
			dGenType.setString(sValue);
		} else { // error handling
		}
		setValByGDPType(aProfile, aDataPoint, dGenType);
	}

// generic class API using SGrBasicGenDataPointTypeType
	public void setValByGDPType(SGrModbusProfilesFrameType aProfile, SGrModbusDataPointsFrameType aDataPoint,
			SGrBasicGenDataPointTypeType sgrValue) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		prv_setValByGDPType(aProfile, aDataPoint, sgrValue);

	}

	public void setValByGDPType(String sProfileName, String sDataPointName, SGrBasicGenDataPointTypeType sgrValue)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		Optional<SGrModbusProfilesFrameType> profile = findProfile(sProfileName);

		if (profile.isPresent()) {
			Optional<SGrModbusDataPointsFrameType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				prv_setValByGDPType(profile.get(), dataPoint.get(), sgrValue);
			}
		}

	}

	private void prv_setValByGDPType(SGrModbusProfilesFrameType aProfile, SGrModbusDataPointsFrameType aDataPoint,
			SGrBasicGenDataPointTypeType sgrValue) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		int[] mbregsnd = new int[120];
		int res = 0, size = 0;
		boolean[] mbbitsnd = new boolean[64];
		boolean bRegisterCMDs = false, bDiscreteCMDs = false;
		int mul = 1;
		int powof10 = 0;
		float fVal = (float) 0.0;
		double dVal = 0.0;
		BigInteger bgVal = BigInteger.ZERO;

		SGrModbusInterfaceDescriptionType modbusInterfaceDesc = myDeviceDescription.getModbusInterfaceDesc();

		SGrBasicGenDataPointTypeType dGenType = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
		SGrBasicGenDataPointTypeType dMBType = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();

		// Data format adaption
		dGenType = aDataPoint.getDataPoint().get(0).getBasicDataType();
		dMBType = aDataPoint.getModbusDataPoint().get(0).getModbusDataType();

		// Data Direction ctrl
		SGrRWPType dRWPType = aDataPoint.getDataPoint().get(0).getRwpDatadirection();
		// Attributes

		// TODO: fehlende Instanz von attributen
		// Attributes
		// TODO: Workout instance of attributes, differentiate in between local XML
		// datapoints & Modbus based datapoints
		if (aDataPoint.getModbusAttr().size() > 0) { // there are Modbus attributes available
			if (aDataPoint.getModbusAttr().get(0).isSetSunssf()) { // use sunpsec
			} else {
				SGrScalingType attrScaling = aDataPoint.getModbusAttr().get(0)
						.getScalingByMulPwr();
				mul = attrScaling.getMultiplicator();
				powof10 = attrScaling.getPowerof10();
			}
		}

		TSGrModbusRegisterRef MBRegRef = aDataPoint.getModbusDataPoint().get(0).getModbusFirstRegisterReference();
		BigInteger regad = MBRegRef.getAddr();

		boolean bMBfirstRegOne = modbusInterfaceDesc.isFirstRegisterAddressIsOne();
		if (bMBfirstRegOne) {
			regad = regad.subtract(BigInteger.ONE);
		}
		int bitRank = MBRegRef.getBitRank();

		TEnumObjectType MBregType = MBRegRef.getRegisterType();
		int mbsize = aDataPoint.getModbusDataPoint().get(0).getDpSizeNrRegisters();
		EList<TEnumConversionFct> MBconvScheme = modbusInterfaceDesc.getConversionScheme();

		// fill values & booleans, apply conversion scheme
		if (MBRegRef.getRegisterType() == TEnumObjectType.HOLD_REGISTER)
			bRegisterCMDs = true;
		if (MBRegRef.getRegisterType() == TEnumObjectType.COIL)
			bDiscreteCMDs = true;

		// generic type expected as API return type
		// TODO: Check why the data type "long" does not create a 64 bit signed integer
		// for all Java virtual machines
		// TODO: Block-Transfer handling

		if (dMBType.isSetBoolean()) {
			// TODO: add management for multiple booleans
			// TODO: check for potential I/O signal inversion mechanism
			boolean bVal = false;
			if (sgrValue.isBoolean())
				bVal = true;
			if (bRegisterCMDs) {
				if (bVal)
					mbregsnd[0] = 1;
				else
					mbregsnd[0] = 0;
			} else if (bDiscreteCMDs)
				mbbitsnd[0] = bVal;
		} else if (dMBType.getEnum() != null) {
			size = 1;
			mbregsnd[0] = Enum2RegResConversion(sgrValue.getEnum());
		} else if (dMBType.isSetFloat32()) {
			if (bRegisterCMDs) {
				size = 2;
				if (sgrValue.isSetInt8())
					fVal = (float) sgrValue.getInt8();
				if (sgrValue.isSetInt16())
					fVal = (float) sgrValue.getInt16();
				if (sgrValue.getInt32() != null)
					fVal = (float) sgrValue.getInt32().floatValue();
				if (sgrValue.isSetInt64())
					fVal = (float) sgrValue.getInt64();
				if (sgrValue.isSetInt8U())
					fVal = (float) sgrValue.getInt8U();
				if (sgrValue.isSetInt16U())
					fVal = (float) sgrValue.getInt16U();
				if (sgrValue.getInt64U() != null)
					fVal = (float) sgrValue.getInt64U().floatValue();
				if (sgrValue.isSetFloat32())
					fVal = sgrValue.getFloat32();
				if (sgrValue.isSetFloat64())
					fVal = (float) sgrValue.getFloat64();
				mbregsnd = ModbusHlpr.ConvFloatToRegisters(fVal);
			}

		} else if (dMBType.isSetFloat64()) {
			if (bRegisterCMDs) {
				size = 4;
				if (sgrValue.isSetInt8())
					dVal = (double) sgrValue.getInt8();
				if (sgrValue.isSetInt16())
					dVal = (double) sgrValue.getInt16();
				if (sgrValue.getInt32() != null)
					dVal = (double) sgrValue.getInt32().doubleValue();
				if (sgrValue.isSetInt64())
					dVal = (double) sgrValue.getInt64();
				if (sgrValue.isSetFloat32())
					dVal = (double) sgrValue.getFloat32();
				if (sgrValue.isSetFloat64())
					dVal = sgrValue.getFloat64();
				if (sgrValue.isSetInt8U())
					dVal = (double) sgrValue.getInt8U();
				if (sgrValue.isSetInt16())
					dVal = (double) sgrValue.getInt16U();
				if (sgrValue.isSetInt32U())
					dVal = (double) sgrValue.getInt32U();

				if (sgrValue.getInt64U() != null)
					dVal = (double) sgrValue.getInt64U().doubleValue();

				mbregsnd = ModbusHlpr.ConvDoubleToRegisters(dVal);
			}

		} else if (dMBType.isSetInt16()) {
			if (bRegisterCMDs) {
				size = 1;
				dVal = getConvertedDouble(sgrValue, powof10, mul);
				if ((dVal <= 32767.0) && (dVal >= -32678.0)) {
					mbregsnd[0] = (short) dVal;
				} else {
					throw new IllegalArgumentException(
							"INT16_VALUE out of range. Must be in -32678..32676 inclusive:" + dVal);
				}

			}

		} else if (dMBType.isSetInt16U()) {
			if (bRegisterCMDs) {
				size = 1;
				dVal = getConvertedDouble(sgrValue, powof10, mul);
				if ((dVal <= 65535.0) && (dVal >= 0.0)) {
					mbregsnd[0] = (int) dVal;
				} else {
					throw new IllegalArgumentException(
							"INT16U_VALUE out of range. Must be in 0..65565 inclusive:" + dVal);
				}
			}

		} else if (dMBType.isSetInt32U()) {
			if (bRegisterCMDs) {
				size = 1;
				dVal = getConvertedDouble(sgrValue, powof10, mul);
				if ((dVal <= 4294967295.0) && (dVal >= 0.0)) {
					int i = (int) dVal;
					mbregsnd[0] = (short) ((i >> 8) & 0xffff);
					mbregsnd[1] = (short) (i & 0xffff);
				} else {
					throw new IllegalArgumentException(
							"INT32U_VALUE out of range. Must be in 0..65565 inclusive:" + dVal);
				}

			} else if (dMBType.isSetInt64()) {
				if (bRegisterCMDs) {
					size = 4;
					dVal = getConvertedDouble(sgrValue, powof10, mul);

					if ((dVal <= 9223372036854775807.0) && (dVal >= -9223372036854775808.0)) {
						long l = (long) dVal;
						mbregsnd[0] = (short) ((l >> 48) & 0xffff);
						mbregsnd[1] = (short) ((l >> 32) & 0xffff);
						mbregsnd[2] = (short) ((l >> 16) & 0xffff);
						mbregsnd[3] = (short) (l & 0xffff);
					} else {
						throw new IllegalArgumentException(
								"INT64_VALUE out of range. Must be in -9223372036854775808..9223372036854775807 inclusive:"
										+ dVal);
					}
				}

			} else if (dMBType.isSetInt8()) {
				if (bRegisterCMDs) {
					size = 1;
					dVal = getConvertedDouble(sgrValue, powof10, mul);
					if ((dVal <= 127.0) && (dVal >= -128.0)) {
						mbregsnd[0] = (short) dVal;
					} else {
						throw new IllegalArgumentException(
								"INT8_VALUE out of range. Must be in -127..128 inclusive:" + dVal);
					}
				}

			} else if (dMBType.isSetInt8U()) {
				if (bRegisterCMDs) {
					size = 1;
					dVal = getConvertedDouble(sgrValue, powof10, mul);
					if ((dVal <= 255.0) && (dVal > 0.0)) {
						mbregsnd[0] = (short) dVal;
					} else {
						throw new IllegalArgumentException(
								"INT8U_VALUE out of range. Must be in 255..0 inclusive:" + dVal);
					}
				}

			}

			else if (dMBType.getInt32() != null) {
				if (bRegisterCMDs) {
					size = 2;
					dVal = getConvertedDouble(sgrValue, powof10, mul);
					if ((dVal <= 2147483647.0) && (dVal >= 12147483648.0)) {
						long l = (long) dVal;
						mbregsnd[1] = (int) l & 0xffff;
						mbregsnd[0] = (int) ((l >> 16) & 0xffff);
					} else {
						throw new IllegalArgumentException(
								"INT32_VALUE out of range. Must be in 214748364..- 12147483648 inclusive:" + dVal);
					}
				}

			} else if (dMBType.getInt64U() != null) {
				if (bRegisterCMDs) {
					size = 4;
					// WARNING: Java does only support unsigned 64bit Values
					// -9223372036854775808..9223372036854775807 inclusive
					// NOTE: as this is a sample code, we keep 2`65-1 as the refrenece value
					dVal = getConvertedDouble(sgrValue, powof10, mul);

					if ((dVal <= 18446744073709551615.0) && (dVal >= 0.0)) {
						long l = (long) dVal;
						mbregsnd[0] = (short) ((l >> 48) & 0xffff);
						mbregsnd[1] = (short) ((l >> 32) & 0xffff);
						mbregsnd[2] = (short) ((l >> 16) & 0xffff);
						mbregsnd[3] = (short) (l & 0xffff);
					} else {
						throw new IllegalArgumentException(
								"INT64U_VALUE out of range. Must be in -0...9223372036854775807 inclusive:" + dVal);
					}

				}
			} else if (dMBType.getString() != null) {
				if (bRegisterCMDs) {
					String strVal = sgrValue.getString();
					size = strVal.length();
					for (int i = 1; i < size; i++)
						mbregsnd[i] = (int) strVal.charAt(i);
				}

			} else if (dMBType.getDateTime() != null) {
				/*
				 * TODO: apply gregorian calendar library =>
				 * inDpTT.setTimestamp(TIMESTAMP_EDEFAULT); or better add simple Current Epoch
				 * Unix Timestamp The current epoch translates to 01/10/2022 @ 7:31am (UTC)
				 * 2022-01-10T07:31:09+00:00 (ISO 8601) Mon, 10 Jan 2022 07:31:09 (+0000 RFC
				 * 822, 1036, 1123, 2822) Monday, 10-Jan-22 07:31:09 (UTC RFC 2822)
				 * 2022-01-10T07:31:09+00:00 (RFC 3339) // TODO: mbregsnd setting
				 */
			}

			else { // TODO: Default behaviour
			}
		}

		if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN)) {
			if (bRegisterCMDs) {
				for (int l = 0; l < mbsize; l++) {
					res = (res * 65536) + mbregsnd[l];
					// TODO: rethink Blocktransfer here
					mbregsnd = ConvertStream(MBconvScheme, mbregsnd, mbsize);
				}
			}
			if (bDiscreteCMDs) {
				// TODO: add management for multiple booleans
			}
		}

		// accessing physical interface
		// TODO: move physical interface selection to proper layer selection AFTER doing
		// all the adjustment stuff
		try {
			if (bRegisterCMDs) {
				if (mbsize > 1)
					drv4Modbus.WriteMultipleRegisters(regad.intValue(), mbregsnd);
				else
					drv4Modbus.WriteSingleRegister(regad.intValue(), mbregsnd[0]);
			} else if (bDiscreteCMDs) {
				if (mbsize > 1)
					drv4Modbus.WriteMultipleCoils(regad.intValue(), mbbitsnd);
				else
					drv4Modbus.WriteSingleCoil(regad.intValue(), mbbitsnd[0]);
			}

		} catch (GenDriverException | GenDriverSocketException | GenDriverModbusException e) {
			String causeMessage = e.getCause() != null ? " cause: " + e.getCause().getMessage() : "";
			System.out.println("Write to modbus failed. " + e.getMessage() + causeMessage);
		}
	}

	double getConvertedDouble(SGrBasicGenDataPointTypeType dGenType, int powof10, int mul) {
		double dVal = 0.0;

		if (dGenType.isSetInt8())
			dVal = (double) dGenType.getInt8();
		if (dGenType.isSetInt16())
			dVal = (double) dGenType.getInt16();
		if (dGenType.getInt32() != null)
			dVal = (double) dGenType.getInt32().doubleValue();
		if (dGenType.isSetInt64())
			dVal = (double) dGenType.getInt64();
		if (dGenType.isSetFloat32())
			dVal = (double) dGenType.getFloat32();
		if (dGenType.isSetFloat64())
			dVal = dGenType.getFloat64();
		if (dGenType.isSetInt8U())
			dVal = (double) dGenType.getInt8U();
		if (dGenType.isSetInt16U())
			dVal = (double) dGenType.getInt16U();
		if (dGenType.isSetInt32U())
			dVal = (double) dGenType.getInt32U();
		if (dGenType.getInt64U() != null)
			dVal = (double) dGenType.getInt64U().doubleValue();
		dVal = dVal / ((double) mul);
		dVal = (dVal * Math.pow(10.0, -powof10));

		return dVal;
	}

	// ================================================== code to be maintained
	// frequently ==============================================
	// Manually adopted enumeration handling: needs 3 enrties for each enumerated
	// type
	// convert from enumeration into Modbus RegRes number
	int Enum2RegResConversion(SGrEnumListType oGenVal) { // TODO(ongoing): extend this list manually for EACH
															// enumeration being added to the system
		int retval = 0;

		if (oGenVal.isSetSgrMeasValueState()) { // E0001
			retval = oGenVal.getSgrMeasValueState().getValue();
		} else if (oGenVal.isSetSgrMeasValueTendency()) { // E0002
			retval = oGenVal.getSgrMeasValueTendency().getValue();
		} else if (oGenVal.isSetSgrMeasValueSource()) { // E0003
			retval = oGenVal.getSgrMeasValueSource().getValue();
		} else if (oGenVal.isSetSgrPowerSource()) { // E0004
			retval = oGenVal.getSgrPowerSource().getValue();
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0005
			retval = oGenVal.getSgreadyStateLv2().getValue();
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0006
			retval = oGenVal.getSgreadyStateLv1().getValue();
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0007
			retval = oGenVal.getSgrSunspStateCodes().getValue();
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0008
			retval = oGenVal.getSgrEVSEStateLv2().getValue();
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0009
			retval = oGenVal.getSgrEVSEStateLv1().getValue();
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E0010
			retval = oGenVal.getSgrSGCPLoadStateLv2().getValue();
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0011
			retval = oGenVal.getSgrSGCPFeedInStateLv2().getValue();
		} else if (oGenVal.isSetSgrEVState()) { // E0012
			retval = oGenVal.getSgrEVState().getValue();
		} else if (oGenVal.isSetSgrSGCPService()) { // E0013
			retval = oGenVal.getSgrSGCPService().getValue();
		} else if (oGenVal.isSetSgrObligLvl()) { // E0014
			retval = oGenVal.getSgrObligLvl().getValue();
		} else if (oGenVal.isSetSgrOCPPState()) {
			// E0015
			retval = oGenVal.getSgrOCPPState().getValue();
		} else if (oGenVal.isSetSgrHPOpMode()) {
			// E0016
			retval = oGenVal.getSgrHPOpMode().getValue();
		}

		return retval;
	}

	// convert enumeration into string
	String Enum2StringConversion(SGrEnumListType oGenVal) {
		String rval = "-";

		// TODO(ongoing): extend this list manually for EACH enumeration being added to
		// the system
		if (oGenVal.isSetSgrMeasValueState()) { // E0001
			rval = oGenVal.getSgrMeasValueState().toString();
		} else if (oGenVal.isSetSgrMeasValueTendency()) { // E0002
			rval = oGenVal.getSgrMeasValueTendency().toString();
		} else if (oGenVal.isSetSgrMeasValueSource()) { // E0003
			rval = oGenVal.getSgrMeasValueSource().toString();
		} else if (oGenVal.isSetSgrPowerSource()) { // E0004
			rval = oGenVal.getSgrPowerSource().toString();
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0005
			rval = oGenVal.getSgreadyStateLv2().toString();
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0006
			rval = oGenVal.getSgreadyStateLv1().toString();
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0007
			rval = oGenVal.getSgrSunspStateCodes().toString();
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0008
			rval = oGenVal.getSgrEVSEStateLv2().toString();
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0009
			rval = oGenVal.getSgrEVSEStateLv1().toString();
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E0010
			rval = oGenVal.getSgrSGCPLoadStateLv2().toString();
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0011
			rval = oGenVal.getSgrSGCPFeedInStateLv2().toString();
		} else if (oGenVal.isSetSgrEVState()) { // E0012
			rval = oGenVal.getSgrEVState().toString();
		} else if (oGenVal.isSetSgrSGCPService()) { // E0013
			rval = oGenVal.getSgrSGCPService().toString();
		} else if (oGenVal.isSetSgrObligLvl()) { // E0014
			rval = oGenVal.getSgrObligLvl().toString();
		} else if (oGenVal.isSetSgrOCPPState()) {
			// E0015
			rval = oGenVal.getSgrOCPPState().toString();
		} else if (oGenVal.isSetSgrHPOpMode()) {
			// E0016
			rval = oGenVal.getSgrHPOpMode().toString();
		}

		return rval;
	}

	// convert RegRes from Modbus into enumeration
	SGrEnumListType RegRes2EnumConversion(long RegRes, SGrEnumListType oGenVal) {
		SGrEnumListType rval = V0Factory.eINSTANCE.createSGrEnumListType();

		// TODO(ongoing): extend this list manually for EACH enumeration being added to
		// the system
		if (oGenVal.isSetSgrMeasValueState()) { // E0001
			rval.setSgrMeasValueState(SGrMeasValueStateType.get((int) RegRes));
		} else if (oGenVal.isSetSgrMeasValueTendency()) { // E0002
			rval.setSgrMeasValueTendency(SGrMeasValueTendencyType.get((int) RegRes));
		} else if (oGenVal.isSetSgrMeasValueSource()) { // E0003
			rval.setSgrMeasValueSource(SGrMeasValueSourceType.get((int) RegRes));
		} else if (oGenVal.isSetSgrPowerSource()) { // E0004
			rval.setSgrPowerSource(SGrPowerSourceType.get((int) RegRes));
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0005
			rval.setSgreadyStateLv2(SGReadyStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0006
			rval.setSgreadyStateLv1(SGReadyStateLv1Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0007
			rval.setSgrSunspStateCodes(SGrSunspStateCodesType.get((int) RegRes));
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0008
			rval.setSgrEVSEStateLv2(SGrEVSEStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0009
			rval.setSgrEVSEStateLv1(SGrEVSEStateLv1Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E0010
			rval.setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0011
			rval.setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrEVState()) { // E0012
			rval.setSgrEVState(SGrEVStateType.get((int) RegRes));
		} else if (oGenVal.isSetSgrSGCPService()) { // E0013
			rval.setSgrSGCPService(SGrSGCPServiceType.get((int) RegRes));
		} else if (oGenVal.isSetSgrObligLvl()) { // E0014
			rval.setSgrObligLvl(SGrObligLvlType.get((int) RegRes));
		} else if (oGenVal.isSetSgrOCPPState()) {
			// E0015
			rval.setSgrOCPPState(SGrOCPPStateType.get((int) RegRes));
		} else if (oGenVal.isSetSgrHPOpMode()) {
			// E0016
			rval.setSgrHPOpMode(SGrHPOpModeType.get((int) RegRes));
		}

		return rval;
	}

}
