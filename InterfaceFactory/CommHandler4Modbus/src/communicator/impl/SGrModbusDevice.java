/**
Copyright(c) 2021 Verein SmartGridready Switzerland
 
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

import com.smartgridready.ns.v0.CtaDHWOpModeType;
import com.smartgridready.ns.v0.CtaHPOpModeType;
import com.smartgridready.ns.v0.CtaHPOpStateType;
import com.smartgridready.ns.v0.SGReadyStateLv1Type;
import com.smartgridready.ns.v0.SGReadyStateLv2Type;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrDHWOpModeType;
import com.smartgridready.ns.v0.SGrEVSEStateLv1Type;
import com.smartgridready.ns.v0.SGrEVSEStateLv2Type;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.SGrHCOpModeType;
import com.smartgridready.ns.v0.SGrHPOpModeType;
import com.smartgridready.ns.v0.SGrMeasValueSourceType;
import com.smartgridready.ns.v0.SGrModbusDataPointType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusFunctionalProfileType;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.SGrModbusLayer6DeviationType;
import com.smartgridready.ns.v0.SGrOCPPStateType;
import com.smartgridready.ns.v0.SGrObligLvlType;
import com.smartgridready.ns.v0.SGrPowerSourceType;
import com.smartgridready.ns.v0.SGrRWPType;
import com.smartgridready.ns.v0.SGrSGCPFeedInStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPLoadStateLv2Type;
import com.smartgridready.ns.v0.SGrSGCPServiceType;
import com.smartgridready.ns.v0.SGrScalingType;
import com.smartgridready.ns.v0.SGrSunspStateCodesType;
import com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType;
import com.smartgridready.ns.v0.TEnumConversionFct;
import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import com.smartgridready.ns.v0.V0Factory;
import communicator.api.GenDeviceApi4Modbus;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.helper.CacheRecord;
import communicator.helper.ConversionHelper;
import communicator.helper.GenType2StringConversion;
import communicator.helper.ModbusReader;
import communicator.helper.ModbusReaderResponse;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 
 * @author furrer / IBT,cb
 *
 */
public class SGrModbusDevice implements GenDeviceApi4Modbus {
	
	private static final Logger LOG = LoggerFactory.getLogger(SGrModbusDevice.class);

	private final GenDriverAPI4Modbus drv4Modbus;

	private final SGrModbusDeviceFrame myDeviceDescription;
	
	private final Map<SGrModbusDataPointType, CacheRecord<List<SGrBasicGenDataPointTypeType>>> myReadCache = new HashMap<>();
	
	private final Map<SGrTimeSyncBlockNotificationType, CacheRecord<ModbusReaderResponse>> myTimeSyncBlockReadCache = new HashMap<>();	

	public SGrModbusDevice(SGrModbusDeviceFrame aDeviceDescription, GenDriverAPI4Modbus aRtuDriver) {
		myDeviceDescription = aDeviceDescription;
		drv4Modbus = aRtuDriver;
	}

	@Override
	public String getVal(String sProfileName, String sDataPointName) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		Optional<SGrModbusFunctionalProfileType> profile = findProfile(sProfileName);
		if (profile.isPresent()) {

			Optional<SGrModbusDataPointType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				return readValue(profile.get(), dataPoint.get());
			}
		}
		return "Profile/access-point " + sProfileName + "/" + sDataPointName + " not found!";
	}

	private Optional<SGrModbusFunctionalProfileType> findProfile(String aProfileName) {
		return myDeviceDescription.getFpListElement().stream().filter(
				modbusProfileFrame -> modbusProfileFrame.getFunctionalProfile().getProfileName().equals(aProfileName))
				.findFirst();
	}

	private Optional<SGrModbusDataPointType> findDataPointForProfile(SGrModbusFunctionalProfileType aProfile,
			String aDataPointName) {
		return aProfile.getDpListElement().stream()
				.filter(datapoint -> datapoint.getDataPoint().getDatapointName().equals(aDataPointName))
				.findFirst();
	}

	private String readValue(SGrModbusFunctionalProfileType aProfile, SGrModbusDataPointType aDataPoint)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		
		SGrBasicGenDataPointTypeType dGenType = prv_getValByGDPType(aProfile, aDataPoint);
		return GenType2StringConversion.format(dGenType);
	}

	@Override
	public SGrBasicGenDataPointTypeType getValByGDPType(String sProfileName, String sDataPointName)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		Optional<SGrModbusFunctionalProfileType> profile = findProfile(sProfileName);

		SGrBasicGenDataPointTypeType retval = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();

		if (profile.isPresent()) {
			Optional<SGrModbusDataPointType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				retval = prv_getValByGDPType(profile.get(), dataPoint.get());
			}
		}

		return retval;
	}

	// Read a single value
	private SGrBasicGenDataPointTypeType prv_getValByGDPType(
			SGrModbusFunctionalProfileType aProfile,
			SGrModbusDataPointType aDataPoint) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		
		if (aDataPoint.getBlockCashName() != null) {
			return prv_getBlockVal(aDataPoint);
		}

		// Use array length and use first element.
		return prv_getValArrByGDPType(aProfile, aDataPoint, 1)[0];		
	}

	@Override
	public String[] getValArr(String sProfileName, String sDataPointName) 
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {		
		return GenType2StringConversion.format(getValArrByGDPType(sProfileName, sDataPointName));
	}
	
	@Override
	public SGrBasicGenDataPointTypeType[] getValArrByGDPType(String sProfileName, String sDataPointName) 
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		Optional<SGrModbusFunctionalProfileType> profile = findProfile(sProfileName);	
		
		if (profile.isPresent()) {
			Optional<SGrModbusDataPointType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				
				if (!dataPoint.get().getDataPoint().isSetArrLen()) {
					throw new GenDriverException(String.format("getValArrByGDPType(): Datapoint %s-%s is not an array.", sProfileName, sDataPointName ));
				}
									
				int arrLen = dataPoint.get().getDataPoint().getArrLen();								
				return prv_getValArrByGDPType(profile.get(), dataPoint.get(), arrLen);
			}
		}
		return new SGrBasicGenDataPointTypeType[] {};
	}			
	
	
	private SGrBasicGenDataPointTypeType prv_getBlockVal( SGrModbusDataPointType aDataPoint)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

			Optional<SGrTimeSyncBlockNotificationType> blockNotificationTypeOpt = findTimeSyncBlockNotificationType(aDataPoint.getBlockCashName());
			if (!blockNotificationTypeOpt.isPresent()) {
				throw new GenDriverException("Could not find timeSyncBlockNotification entry with name=" + aDataPoint.getBlockCashName());
			}
			
			SGrTimeSyncBlockNotificationType blockNotificationType = blockNotificationTypeOpt.get();											
			BigInteger blockAddress = blockNotificationType.getFirstAddr();														
		
			TSGrModbusRegisterRef mbRegRef = aDataPoint.getModbusDataPoint().get(0).getModbusFirstRegisterReference();
			BigInteger addrDiff = mbRegRef.getAddr().subtract(blockAddress);
			if (addrDiff.signum() < 0) {
				throw new GenDriverException("Error in EI-XML, datapoint address must be >= timeSyncBlock address");
			}
			
			SGrModbusInterfaceDescriptionType modbusInterfaceDesc = myDeviceDescription.getModbusInterfaceDesc();
					
			CacheRecord<ModbusReaderResponse> mbCacheRecord = myTimeSyncBlockReadCache.get(blockNotificationType);
			ModbusReaderResponse mbResponse;
			if (mbCacheRecord == null || mbCacheRecord.isExpired(blockNotificationType.getTimeToLive())) {

				LOG.debug("Reading time sync block from modbus device");
				mbResponse = ModbusReader.read(
						drv4Modbus,
						blockNotificationType.getRegisterType(),
						blockAddress.intValue(),
						modbusInterfaceDesc.isFirstRegisterAddressIsOne(),
						blockNotificationType.getSize());
				
				if (blockNotificationType.isSetTimeToLive()) {
					myTimeSyncBlockReadCache.put(blockNotificationType, new CacheRecord<>(mbResponse, Instant.now()));
				}
			} else {
				LOG.debug("Reading time sync block from cache.");
				mbResponse = mbCacheRecord.getValue();
			}			
		
			// pick the correct value from the received block			
			int size = aDataPoint.getModbusDataPoint().get(0).getDpSizeNrRegisters();
			int[] mbRegResp = mbResponse.getMbregresp(addrDiff.intValue(), size);
			boolean[] mbBitResp = mbResponse.getMbbitresp(addrDiff.intValue(), size);
			
			// do conversion of the read data
			return doReadConversion(
					aDataPoint,
					modbusInterfaceDesc, 
					mbRegResp, // response register int[]
					mbBitResp, // response bits[]
					mbResponse.isbGotRegisters(),
					mbResponse.isbGotDiscrete(),
					mbRegRef,	// register address SGrV0
					size,		// number of bytes read
					0,			// arrIdx: only one value
					1);			// number of values									
	}


	// Read an array of values
	private SGrBasicGenDataPointTypeType[] prv_getValArrByGDPType(
		SGrModbusFunctionalProfileType aProfile,
		SGrModbusDataPointType aDataPoint, int arrayLen)
		throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		SGrModbusInterfaceDescriptionType modbusInterfaceDesc = myDeviceDescription.getModbusInterfaceDesc();
		TSGrModbusRegisterRef mbRegRef = aDataPoint.getModbusDataPoint().get(0).getModbusFirstRegisterReference();

		boolean bMBfirstRegOne = modbusInterfaceDesc.isFirstRegisterAddressIsOne();

		CacheRecord<List<SGrBasicGenDataPointTypeType>> resultRecord = myReadCache.get(aDataPoint);
		int mbArrayLen = arrayLen;

		if (resultRecord == null || resultRecord.isExpired(aDataPoint.getTimeToLive())) {
			
			LOG.debug("Reading value from modbus device.");
			
			int size = aDataPoint.getModbusDataPoint().get(0).getDpSizeNrRegisters();

			ModbusReaderResponse mbResponse = ModbusReader.read(
					drv4Modbus,
					mbRegRef.getRegisterType(),
					mbRegRef.getAddr().intValue(),
					bMBfirstRegOne,
					size * mbArrayLen);

		    // modbus OSI Layer 6 to generic OSI layer 6 conversion
			List<SGrBasicGenDataPointTypeType> resultList = new ArrayList<>();		
			for (int arrIdx = 0; arrIdx < arrayLen; arrIdx++) {						
				resultList.add(
					doReadConversion(
						aDataPoint,
						modbusInterfaceDesc, 
						mbResponse.getMbregresp(), // response register int[]
						mbResponse.getMbbitresp(), // response bits[]
						mbResponse.isbGotRegisters(),
						mbResponse.isbGotDiscrete(),
						mbRegRef,	// register address SGrV0
						size,
						arrIdx,
						arrayLen));
			}
			
			resultRecord = new CacheRecord<>(resultList, Instant.now());			
			if (aDataPoint.isSetTimeToLive()) {				
				myReadCache.put(aDataPoint, resultRecord);
			}
		} else {
			LOG.debug("Was reading value from chache.");
		}
		return resultRecord.getValue().toArray(new SGrBasicGenDataPointTypeType[0]);				
	}

	private SGrBasicGenDataPointTypeType doReadConversion(SGrModbusDataPointType aDataPoint,
														  SGrModbusInterfaceDescriptionType modbusInterfaceDesc, int[] mbregresp, boolean[] mbbitresp,
														  boolean bGotRegisters, boolean bGotDiscrete, TSGrModbusRegisterRef MBRegRef, int size, int arrOffset, int arrayLen) {

		int mul = 1, l6dev = -1;
		int pwof10 = 0;
		// Register return value calculation
		long RegRes = 0;
		double dVal = 0.0;
		float fVal = (float) 0.0;

		SGrBasicGenDataPointTypeType dGenType = aDataPoint.getDataPoint().getBasicDataType();  	
		SGrBasicGenDataPointTypeType dMBType = aDataPoint.getModbusDataPoint().get(0).getModbusDataType() ;
		
		// Data format adaption		
		dGenType = aDataPoint.getDataPoint()
				.getBasicDataType();
		// Data Direction ctrl
		SGrRWPType dRWPType = aDataPoint.getDataPoint().getRwpDatadirection();
		
		EList<TEnumConversionFct> MBconvScheme = modbusInterfaceDesc.getConversionScheme();

		int[] singleResp = new int[2];
		int[] doubleResp = new int[4];
		if (bGotRegisters) {
			if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN)) {
				mbregresp = ConvertEndians(MBconvScheme, mbregresp, size);
			}

			// Attributes
			if (aDataPoint.getModbusAttr().size() > 0) 
			{ // there are Modbus attributes available
				
				if (aDataPoint.getModbusAttr().get(0).isSetSunssf()) { // use sunpsec
				} else 
				{  if (aDataPoint.getModbusAttr().get(0).getScalingByMulPwr()!=null)
				  {
					SGrScalingType attrScaling = aDataPoint.getModbusAttr().get(0).getScalingByMulPwr();
					mul = attrScaling.getMultiplicator();
					pwof10 = attrScaling.getPowerof10();
				  }
				}
				if (aDataPoint.getModbusAttr().get(0).isSetLayer6Deviation() )
				{   // do we have Layer 6 deviations ?
			       	l6dev = aDataPoint.getModbusAttr().get(0).getLayer6Deviation().getValue();
			       	mbregresp = manageLayer6deviation(l6dev, mbregresp, size);
				}
				if (aDataPoint.getModbusAttr().get(0).getIopBitmapMapper()!=null )
				{   // modbus value to generic value conversion
					
					int[] zwi= {0,0,0,0,0,0,0,0}; 
					int lp,gen;
					for (lp=0;lp<aDataPoint.getModbusAttr().get(0).getIopBitmapMapper().getGenBitMapper().size();lp++)
					{
						gen = aDataPoint.getModbusAttr().get(0).getIopBitmapMapper().getGenBitMapper().get(lp).intValue();	
						if (((1<<(lp%16)) & mbregresp[lp/16]) !=0) zwi[lp/16] =  zwi[lp/16] | 1<<gen;
					}
					mbregresp = zwi;
				}
				if (aDataPoint.getModbusAttr().get(0).getIopEnumMapper()!=null )
				{   // modbus value to generic value conversion
					mbregresp[0] = aDataPoint.getModbusAttr().get(0).getIopEnumMapper().getGenEnumMapper().get(mbregresp[0]).intValue();
				}
			}
			

			// Most significant int as returned from modbus can have the wrong sign:
			// - after change byte order
			// - if the modbus value is an unsigned number and MSB is set
			mbregresp[0] = adjustSign(dMBType, mbregresp[0]);
		
            for (int u = 0; u < size; u++) {
            	if (u == 0) {
					RegRes = mbregresp[u + arrOffset * size];
				} else {
					RegRes = RegRes << 16;
					RegRes = RegRes | (mbregresp[u + arrOffset*size] & 0x0000ffff);
				}
				// TODO: finalize this. Is it really needed?
				
				if (size == 2)
			    {
			    	singleResp[0] = mbregresp[0 + arrOffset*size];
			    	singleResp[1] = mbregresp[1 + arrOffset*size];
			    } 
			    else if (size == 4)
			    {
			    	doubleResp[0] = mbregresp[0 + arrOffset*size];
			    	doubleResp[1] = mbregresp[1 + arrOffset*size];
			    	doubleResp[2] = mbregresp[2 + arrOffset*size];
			    	doubleResp[3] = mbregresp[3 + arrOffset*size];
			    }
			    else if (size > 2)
			    {
			    	// 3, 5-unbounded?
			    }
	        }
	    }

		if (bGotDiscrete) { // TODO: manage discrete block conversion

		}		
	    
	    // generic type expected as API return type
		// TODO: Check why the data type "long" does not create a 64 bit signed integer
		// for all Java virtual machines

		SGrBasicGenDataPointTypeType retVal = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
		
		if (dGenType.getEnum2bitmapIndex()!=null)
		{
			RegRes = ((long) Math.abs(mbregresp[0] &0xff));
			short shVal = (byte) Math.abs(RegRes);
			retVal.setInt8U(shVal);

			int iVal = (int) Math.abs(RegRes);
			retVal.setInt16U(iVal);
			if (size > 1) 
			{
			   RegRes =  (((long) mbregresp[0])<<16) & ((long) 0xffff0000);
			   RegRes = (long) Math.abs(RegRes + (long) mbregresp[1]);
			   retVal.setInt32U(RegRes);
			}
			else
				retVal.setInt32U((long) iVal);
				
		}
		else if (dGenType.isSetBoolean()) {
			// TODO: add bus data
			boolean bVal = false;
			if (bGotRegisters) {
				if (RegRes != 0)
					bVal = true;
			} else if (bGotDiscrete) {
				bVal = mbbitresp[0 + arrOffset*size];
			}
			retVal.setBoolean(bVal);
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
					fVal = ConversionHelper.byteBufFromRegisters(singleResp).getFloat();
				} 
			    else if (dMBType.isSetFloat64()) {
					dVal = ConversionHelper.byteBufFromRegisters(doubleResp).getDouble();
			    	fVal = (float) dVal;
				}
			}
			retVal.setFloat32(fVal);
		}
		else if (dGenType.isSetFloat64()) {
			if (bGotRegisters) {
				if ((dMBType.isSetInt16())
						|| (dMBType.getInt32()!=null)
						|| (dMBType.isSetInt64())) {
					dVal = (double) RegRes;
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					retVal.setFloat64(dVal);
				} else if ((dMBType.isSetInt16U())
						|| (dMBType.isSetInt32U())
						|| (dMBType.getInt64U()!=null)) {
					dVal = (double) Math.abs(RegRes);
					dVal = (dVal * Math.pow(10.0, pwof10));
					dVal = dVal * mul;
					retVal.setFloat64(dVal);
				} else if (dMBType.isSetFloat32()) {
					dVal = ConversionHelper.byteBufFromRegisters(singleResp).getFloat();
					retVal.setFloat64(dVal);
				} else if (dMBType.isSetFloat64()) {
					dVal = ConversionHelper.byteBufFromRegisters(doubleResp).getDouble();
					retVal.setFloat64(dVal);
				}
			}
		}
		else if (dGenType.isSetInt16()) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt16((short)ConversionHelper.byteBufFromRegisters(singleResp).getFloat());
			} else if (dMBType.isSetFloat64()) {
				retVal.setInt16((short)ConversionHelper.byteBufFromRegisters(doubleResp).getDouble());
			} else {
				short shVal = (short) RegRes;
				retVal.setInt16(shVal);
			}
		}
		else if (dGenType.getInt32() != null) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt32(BigInteger.valueOf((int)ConversionHelper.byteBufFromRegisters(singleResp).getFloat()));
			} else if (dMBType.isSetFloat64()) {
				retVal.setInt32(BigInteger.valueOf((int)ConversionHelper.byteBufFromRegisters(doubleResp).getDouble()));
			} else {
				retVal.setInt32(BigInteger.valueOf((int)RegRes));
			}
		}
		else if (dGenType.isSetInt16U()) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt16U((int) ConversionHelper.byteBufFromRegisters(singleResp).getFloat());
			} else if (dMBType.isSetFloat64()){
				retVal.setInt16U((int) ConversionHelper.byteBufFromRegisters(doubleResp).getDouble());
			} else {
				int iVal = (int) Math.abs(RegRes);
				retVal.setInt16U(iVal);
			}
		}
		else if (dGenType.isSetInt32U()) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt32U((long) ConversionHelper.byteBufFromRegisters(singleResp).getFloat());
			} else if (dMBType.isSetFloat64()){
				retVal.setInt32U((long) ConversionHelper.byteBufFromRegisters(doubleResp).getDouble());
			} else {
				long lVal = (long) Math.abs(RegRes);
				retVal.setInt32U(lVal);
			}
		}
		else if (dGenType.isSetInt64()) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt64((long) ConversionHelper.byteBufFromRegisters(singleResp).getFloat());
			} else if (dMBType.isSetFloat64()){
				retVal.setInt64((long) ConversionHelper.byteBufFromRegisters(doubleResp).getDouble());
			} else {
				retVal.setInt64(RegRes);
			}
		}
		else if (dGenType.getInt64U() != null) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt64U(BigInteger.valueOf((long)ConversionHelper.byteBufFromRegisters(singleResp).getFloat()));
			} else if (dMBType.isSetFloat64()){
				retVal.setInt64U(BigInteger.valueOf((long)ConversionHelper.byteBufFromRegisters(doubleResp).getDouble()));
			} else {
				long lVal = (long) RegRes;
				retVal.setInt64U(BigInteger.valueOf(lVal));
			}
		}
		else if (dGenType.isSetInt8()) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt8((byte) ConversionHelper.byteBufFromRegisters(singleResp).getFloat());
			} else if (dMBType.isSetFloat64()){
				retVal.setInt8((byte) ConversionHelper.byteBufFromRegisters(doubleResp).getDouble());
			} else {
				byte btVal = (byte) RegRes;
				retVal.setInt8(btVal);
			}
		}
		else if (dGenType.isSetInt8U()) {
			if (dMBType.isSetFloat32()) {
				retVal.setInt8U((byte) ConversionHelper.byteBufFromRegisters(singleResp).getFloat());
			} else if (dMBType.isSetFloat64()){
				retVal.setInt8U((byte) ConversionHelper.byteBufFromRegisters(doubleResp).getDouble());
			} else {
				short shVal = (byte) Math.abs(RegRes);
				retVal.setInt8U(shVal);
			}
		}
		else if (dGenType.getEnum()!=null) {
			SGrEnumListType tt = RegRes2EnumConversion(RegRes, dGenType.getEnum());
			retVal.setEnum(tt);    
		}
		else if (dGenType.getInt32()!=null) {
			BigInteger bgVal = BigInteger.valueOf(RegRes);
			retVal.setInt32(bgVal);
		}
		else if (dGenType.getInt64U()!=null) {
			BigInteger bgVal = BigInteger.valueOf((long) Math.abs(RegRes));
			retVal.setInt64U(bgVal);
		}
		else if(dGenType.getDateTime()!=null) {
		 // TODO: apply gregorian calendar library
		// =>inDpTT.setDateTime(2017-08-04T08:48:37.124Z);
		// TODO: apply dGenType
		}
		else if( dGenType.getString()!=null) {
			    retVal.setString(ConversionHelper.convRegistersToString(mbregresp, 0, size*2));
		}
		else
		{ // error handling for missing instance
		}		

		// TODO: other Modbus functions
		// conversion schemes
		// attribute management
		// int res = mbregresp[size - 2] * 65536 + mbregresp[size- 1]
		// RetVal.*
		// Not yet supported types
		// unit scaling
		return retVal;				
	}

	private BigInteger twosComplement(BigInteger val) {
		byte[] contents = val.toByteArray();

		// prepend byte of opposite sign
		byte[] result = new byte[contents.length + 1];
		System.arraycopy(contents, 0, result, 1, contents.length);
		result[0] = (contents[0] < 0) ? 0 : (byte)-1;

		// this will be two's complement
		return new BigInteger(result);
	}
	
	
	//private int[] manageLayer6deviation( EList<SGrModbusLayer6DeviationType> mBlayer6Scheme, int[] mbregresp, int size) {
	private int[] manageLayer6deviation(int mBlayer6Scheme, int[] mbregresp, int size) {
		
		int[] mbregconv = new int[10];
		long lv;
		
		mbregconv[0] = 0;
		
		//switch(aDataPoint.getDpMbAttrReference().get(0).getModbusAttr().get(0).getLayer6Deviation().getLiteral()  )
 
		  switch (mBlayer6Scheme)
          {
  		    case SGrModbusLayer6DeviationType._2REG_BASE1000_H2L_VALUE:
			  if (size == 2)
			  {
				lv =  ((long) mbregresp[0]) *1000;
				lv = lv + (long) mbregresp[1];
				mbregconv[1] =  (int) (lv & 0xffff);	
				mbregconv[0] =  (int) ((lv>>16) & 0xffff);	
				mbregresp = mbregconv;
			  }
			break;
		    case SGrModbusLayer6DeviationType._2REG_BASE1000_L2H_VALUE:
			  if (size == 2)
			  {
				lv =  ((long) mbregresp[1]) *1000;
				lv = lv + (long) mbregresp[0];
				mbregconv[1] =  (int) (lv & 0xffff);	
				mbregconv[0] =  (int) ((lv>>16) & 0xffff);	
				mbregresp = mbregconv;
			  }
			break;
	    	case SGrModbusLayer6DeviationType.SG_READY_ENUM2_IOH2L_VALUE:
				switch (mbregresp[0])
				{
					case 1:
						mbregresp[0] = 1 ;
						mbregresp[1] = 0;
					break;
					case 2:
						mbregresp[0] = 0 ;
						mbregresp[1] = 0;
					break;
					case 3:
						mbregresp[0] = 1 ;
						mbregresp[1] = 1;
					break;
					case 4:
						mbregresp[0] = 0 ;
						mbregresp[1] = 1;
					break;
				}
			break;
    		case SGrModbusLayer6DeviationType.SG_READY_ENUM2_IOL2H_VALUE:
				switch (mbregresp[0])
				{
					case 1:
						mbregresp[0] = 0;
						mbregresp[1] = 1 ;
					break;
					case 2:
						mbregresp[0] = 0;
						mbregresp[1] = 0 ;
					break;
					case 3:
						mbregresp[0] = 1;
						mbregresp[1] = 1 ;
					break;
					case 4:
						mbregresp[0] = 1;
						mbregresp[1] = 0 ;
					break;
				}
			break;
		}  
		return mbregresp;
	}

	private int[] ConvertEndians(EList<TEnumConversionFct> mBconvScheme, int[] mbregresp, int size) {

		/*
		LOG.debug("ConvertEndians mbregesp:");
		for (int i=0; i<mbregresp.length;i++) {
			LOG.debug(String.format("int16: %d - %04x", mbregresp[i], mbregresp[i] ));
		}
		*/

		int n, c;
		int[] mbregconv = new int[30];

		try {

			n = mBconvScheme.size();
			for (n = 0; n < mBconvScheme.size(); n++) {
				if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_BIT_ORDER)) {
					// TODO implement
				} else if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_BYTE_ORDER)) {
					for (c = 0; c < size; c++) {
						LOG.debug("mbregresp: {} ", mbregresp);
						LOG.debug("mbregresp[0]: {} ", String.format("%08x",mbregresp[0]));
						byte[] result = new byte[2];
						result[1] = (byte) (mbregresp[c] >> 8 );
						result[0] = (byte)  mbregresp[c];

						mbregconv[c] = Byte.toUnsignedInt(result[1])
								    + (Byte.toUnsignedInt(result[0]) << 8);

						LOG.debug(String.format("CHANGE_BYTE_ORDER converted %d: %02x, %02x, %08x", c, result[1], result[0], mbregconv[c]));
						LOG.debug("mbregconv: {}", mbregconv);
						LOG.debug("mbregconv[0]: {} ", String.format("%08x",mbregconv[0]));
					}
				} else if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_WORD_ORDER)) {
					if ((size % 2) == 0)
					{

						for (c = 0; c < size-1; c = c + 2) {
							mbregconv[c] = mbregresp[c + 1];
							mbregconv[c + 1] = mbregresp[c];
						}
					}
					else
					{   
						for (c = 0; c < size; c++) 
							mbregconv[c] = mbregresp[c];
					}
					for (int i=0; i<size-1;i++) 
						LOG.debug(String.format("CHANGE_WORD_ORDER converted %d: %08x, %08x", i, mbregresp[i], mbregconv[i]));
				} else if (mBconvScheme.get(n).equals(TEnumConversionFct.CHANGE_DWORD_ORDER)) {
					if ((size % 4) > 0)
					{
						//throw new IllegalArgumentException("CHANGE_DWORD_ORDER: Input Array length invalid");
						LOG.info("CHANGE_DWORD_ORDER: Input Array length does not match");
					    //rem/cb: check is DWORD change needed in case of (size % 4) > 0
				        mbregconv = mbregresp; 
					}
					else
					{   //rem/cb:  check array of WORDS: is DWORD change needed in case of size > 4
					for (c = 0; c < size; c = c + 4) {
						mbregconv[c + 1] = mbregresp[c + 3];
						mbregconv[c + 0] = mbregresp[c + 2];
						mbregconv[c + 3] = mbregresp[c + 1];
						mbregconv[c + 2] = mbregresp[c];
						for (int i=0; i<4;i++) {
							LOG.debug(String.format("CHANGE_DWORD_ORDER converted %d: %08x, %08x", i, mbregresp[i], mbregconv[i]));
						}
					}
					}
				}
			}
			// prepare for next adjustment (if any)
		}

		catch (IllegalArgumentException e1) {
			System.out.println("***IllegalArgumentException: " + e1.toString());
			return mbregresp;
		} finally {
		}
		return mbregconv;
	}

	@Override
	public String setVal(String sProfileName, String sDataPointName, String sValue) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		Optional<SGrModbusFunctionalProfileType> profile = findProfile(sProfileName);
		if (profile.isPresent()) {

			Optional<SGrModbusDataPointType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				writeValue(profile.get(), dataPoint.get(), sValue);
				return "OK";
			}
		}
		return "Profile/access-point " + sProfileName + "/" + sDataPointName + " not found!";
	}

	@Override
	public void setValArr(String profileName, String dataPointName, String[] values)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		throw new UnsupportedOperationException("Operation not yet supported.");
	}

	@Override
	public void setValArrByGDPType(String profileName, String dataPointName, String[] values)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		throw new UnsupportedOperationException("Operation not yet supported.");
	}


	private void writeValue(SGrModbusFunctionalProfileType aProfile, SGrModbusDataPointType aDataPoint, String sValue)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		SGrBasicGenDataPointTypeType dGenType = aDataPoint.getDataPoint().getBasicDataType();

		// TODO dGenType = GenType2StringConversion.format(sValue, dGenType);

		if (dGenType.isSetBoolean()) {
			boolean bVal = false;
			if (sValue.equals("true") || sValue.equals("TRUE")) {
				bVal = true;
			}
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
			dGenType.setString(sValue);
		} else { // error handling
		}
		prv_setValByGDPType(aProfile, aDataPoint, dGenType);
	}

	@Override
	public void setValByGDPType(String sProfileName, String sDataPointName, SGrBasicGenDataPointTypeType value)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		Optional<SGrModbusFunctionalProfileType> profile = findProfile(sProfileName);

		if (profile.isPresent()) {
			Optional<SGrModbusDataPointType> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				prv_setValByGDPType(profile.get(), dataPoint.get(), value);
			}
		}
	}

	private void prv_setValByGDPType(SGrModbusFunctionalProfileType aProfile, SGrModbusDataPointType aDataPoint,
			SGrBasicGenDataPointTypeType sgrValue) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {


		int[] mbregsnd = new int[120];
		int res = 0, size = 0;
		boolean[] mbbitsnd = new boolean[64];
		boolean bRegisterCMDs = false, bDiscreteCMDs = false;
		boolean isSetIopEnum = false, isSetIopBitmap = false, isSetAccessProt = false;
		int mul = 1, l6dev = -1;
		int powof10 = 0;
		float fVal = (float) 0.0;
		double dVal = 0.0;
		BigInteger bgVal = BigInteger.ZERO;

		SGrModbusInterfaceDescriptionType modbusInterfaceDesc = myDeviceDescription.getModbusInterfaceDesc();

		// Data format adaption
		SGrBasicGenDataPointTypeType dMBType = aDataPoint.getModbusDataPoint().get(0).getModbusDataType();

		// Data Direction ctrl
		SGrRWPType dRWPType = aDataPoint.getDataPoint().getRwpDatadirection();
		// Attributes

		// TODO: fehlende Instanz von attributen
		// Attributes for pre-register load conversion

		if (aDataPoint.getModbusAttr().size() > 0) { // there are Modbus attributes available
			if (aDataPoint.getModbusAttr().get(0).isSetSunssf()) { // use sunpsec
			} else
			{  if (aDataPoint.getModbusAttr().get(0).getScalingByMulPwr()!=null)
			  {
				SGrScalingType attrScaling = aDataPoint.getModbusAttr().get(0).getScalingByMulPwr();
				mul = attrScaling.getMultiplicator();
				powof10 = attrScaling.getPowerof10();
			  }
			}
			if (aDataPoint.getModbusAttr().get(0).isSetLayer6Deviation()   )
		       	l6dev = aDataPoint.getModbusAttr().get(0).getLayer6Deviation().getValue();	
			if (aDataPoint.getModbusAttr().get(0).getIopEnumMapper() != null)
				 isSetIopEnum = true;	
			if (aDataPoint.getModbusAttr().get(0).getIopBitmapMapper() != null)
				isSetIopBitmap = true;
			if (aDataPoint.getModbusAttr().get(0).getAccessProtection() != null)
				isSetAccessProt = true;
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
			mbregsnd[0] = Enum2RegResConversion(sgrValue.getEnum());
			if (l6dev >=0)
			{
				mbregsnd = manageLayer6deviation(l6dev, mbregsnd, size);
			}
			else
			{ 				
			  size = 1;
			  if (isSetIopEnum)  
			    mbregsnd[0] = aDataPoint.getModbusAttr().get(0).getIopEnumMapper().getModbusEnumMapper().get(mbregsnd[0]).intValue();
			}
		} else if (dMBType.isSetFloat32()) {
			if (bRegisterCMDs) {
				size = 2;
				if (sgrValue.isSetInt8())
					fVal = (float) sgrValue.getInt8();
				if (sgrValue.isSetInt16())
					fVal = (float) sgrValue.getInt16();
				if (sgrValue.getInt32() != null)
					fVal = (float) sgrValue.getInt32().floatValue();
				if (sgrValue.isSetInt32U())
					fVal = (float) sgrValue.getInt32U();
				if (sgrValue.isSetInt64())
					fVal = (float) sgrValue.getInt64();
				if (sgrValue.isSetInt8U())
					fVal = (float) sgrValue.getInt8U();
				if (sgrValue.isSetInt16U())
					fVal = (float) sgrValue.getInt16U();
				if (sgrValue.isSetFloat32())
					fVal = (float) sgrValue.getInt32U();
				if (sgrValue.getInt64U() != null)
					fVal = (float) sgrValue.getInt64U().floatValue();
				if (sgrValue.isSetFloat32())
					fVal = sgrValue.getFloat32();
				if (sgrValue.isSetFloat64())
					fVal = (float) sgrValue.getFloat64();
				// mbregsnd = ModbusHlpr.ConvFloatToRegisters(fVal, RegisterOrder.HighLow);
				mbregsnd = ConversionHelper.floatToRegisters(fVal);
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
				if (sgrValue.isSetInt16U())
					dVal = (double) sgrValue.getInt16U();
				if (sgrValue.isSetInt32U())
					dVal = (double) sgrValue.getInt32U();
				if (sgrValue.getInt64U() != null)
					dVal = (double) sgrValue.getInt64U().doubleValue();

				// mbregsnd = ModbusHlpr.ConvDoubleToRegisters(dVal, RegisterOrder.HighLow);
				mbregsnd = ConversionHelper.doubleToRegisters(dVal);
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
					mbregsnd[0] = (short) ((i >> 16) & 0xffff);
					mbregsnd[1] = (short) (i & 0xffff);
				} else {
					throw new IllegalArgumentException(
							"INT32U_VALUE out of range. Must be in 0..4294967295 inclusive:" + dVal);
				}
			}
		} else if (dMBType.isSetInt64()) {
			if (bRegisterCMDs) {

				// TODO converting (large) integers to double can cause floating point errors/deviations
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
				if ((dVal <= 2147483647.0) && (dVal >= -2147483648.0)) {
					long l = (long) dVal;
					mbregsnd[1] = (short) l & 0xffff;
					mbregsnd[0] = (short) ((l >> 16) & 0xffff);
				} else {
					throw new IllegalArgumentException(
							"INT32_VALUE out of range. Must be in 214748364..-2147483648 inclusive:" + dVal);
				}
			}
		} else if (dMBType.isSetInt32U()) {
			if (bRegisterCMDs) {
				size = 2;
				dVal = getConvertedDouble(sgrValue, powof10, mul);
				if ((dVal <= 4294967295.0) && (dVal >= 0)) {
					long l = (long) dVal;
					mbregsnd[1] = (short) l & 0xffff;
					mbregsnd[0] = (short) ((l >> 16) & 0xffff);
				} else {
					throw new IllegalArgumentException(
							"INT32U_VALUE out of range. Must be in 0..4294967295.0 inclusive:" + dVal);
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
				mbregsnd = ConversionHelper.convStringToRegisters(sgrValue.getString());
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
		
		// Attributes for post-register load conversion
		if (aDataPoint.getModbusAttr().size() > 0)
		{
		  if (aDataPoint.getModbusAttr().get(0).getIopBitmapMapper()!=null )
		  {   // modbus value to generic value conversion
			  mbregsnd[0] = aDataPoint.getModbusAttr().get(0).getIopBitmapMapper().getModbusBitMapper().get(mbregsnd[0]).intValue();
		  }
		  if (aDataPoint.getModbusAttr().get(0).getIopEnumMapper()!=null )
		  {   // modbus value to generic value conversion
			 mbregsnd[0] = aDataPoint.getModbusAttr().get(0).getIopEnumMapper().getGenEnumMapper().get(mbregsnd[0]).intValue();
		  }
		}
		
		if (!MBconvScheme.get(0).equals(TEnumConversionFct.BIG_ENDIAN)) {
			if (bRegisterCMDs) {
				mbregsnd = ConvertEndians(MBconvScheme, mbregsnd, mbsize);
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

	// ===================================== code to be maintained frequently ==============================================
	// Manually adopted enumeration handling: needs 3 entries for each enumerated
	// type
	// convert from enumeration into Modbus RegRes number
	int Enum2RegResConversion(SGrEnumListType oGenVal) { // TODO(ongoing): extend this list manually for EACH
														 // enumeration being added to the system
		int retval = 0;

		if (oGenVal.isSetSgrMeasValueSource()) { // E0001
			retval = oGenVal.getSgrMeasValueSource().getValue();
		} else if (oGenVal.isSetSgrPowerSource()) { // E0002
			retval = oGenVal.getSgrPowerSource().getValue();
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0003
			retval = oGenVal.getSgreadyStateLv2().getValue();
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0004
			retval = oGenVal.getSgreadyStateLv1().getValue();
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0005
			retval = oGenVal.getSgrSunspStateCodes().getValue();
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0006
			retval = oGenVal.getSgrEVSEStateLv2().getValue();
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0010
			retval = oGenVal.getSgrEVSEStateLv1().getValue();
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E0011
			retval = oGenVal.getSgrSGCPLoadStateLv2().getValue();
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0012
			retval = oGenVal.getSgrSGCPFeedInStateLv2().getValue();
		} else if (oGenVal.isSetSgrEVState()) { // E0013
			retval = oGenVal.getSgrEVState().getValue();
		} else if (oGenVal.isSetSgrSGCPService()) { // E0014
			retval = oGenVal.getSgrSGCPService().getValue();
		} else if (oGenVal.isSetSgrObligLvl()) { // E0015
			retval = oGenVal.getSgrObligLvl().getValue();
		} else if (oGenVal.isSetSgrOCPPState()) { // E0015			
			retval = oGenVal.getSgrOCPPState().getValue();
		} else if (oGenVal.isSetSgrHPOpMode()) { // E0016			
			retval = oGenVal.getSgrHPOpMode().getValue();
		} else if (oGenVal.isSetSgrHCOpMode() ) {// E0017
			retval = oGenVal.getSgrHCOpMode().getValue();
		} else if (oGenVal.isSetSgrDHWOpMode()) {// cta00
			retval = oGenVal.getCtaDHWOpMode().getValue();
		} else if (oGenVal.isSetCtaDHWOpMode()) {// cta00
			retval = oGenVal.getCtaDHWOpMode().getValue();
		} else if (oGenVal.isSetCtaHPOpMode()) {// cta00
			retval = oGenVal.getCtaHPOpMode().getValue();
		} else if (oGenVal.isSetCtaHPOpState()) {// cta00
			retval = oGenVal.getCtaHPOpState().getValue();
		} else if (oGenVal.isSetHovHPOpMode()) {// hov001
			retval = oGenVal.getHovHPOpMode().getValue();
		} else if (oGenVal.isSetHovHCOpMode()) {// hov002
			retval = oGenVal.getHovHCOpMode().getValue();
		} else if (oGenVal.isSetHovSGReadySrcSel()) {// hov003
			retval = oGenVal.getHovSGReadySrcSel().getValue();
		} else if (oGenVal.isSetHovBufferState()) {// hov004
			retval = oGenVal.getHovBufferState().getValue();
		} else if (oGenVal.isSetHovHCOpState()) {// hov005
			retval = oGenVal.getHovHCOpState().getValue();
		} else if (oGenVal.isSetHovDomHotWaterState()) {// hov006
			retval = oGenVal.getHovDomHotWaterState().getValue();
		} 
		
		return retval;
	}

	// convert RegRes from Modbus into enumeration
	private SGrEnumListType RegRes2EnumConversion(long RegRes, SGrEnumListType oGenVal) {
		SGrEnumListType rval = V0Factory.eINSTANCE.createSGrEnumListType();

		// TODO(ongoing): extend this list manually for EACH enumeration being added to
		// the system
		if (oGenVal.isSetSgrMeasValueSource()) { // E0001
			rval.setSgrMeasValueSource(SGrMeasValueSourceType.get((int) RegRes));
		} else if (oGenVal.isSetSgrPowerSource()) { // E0002
			rval.setSgrPowerSource(SGrPowerSourceType.get((int) RegRes));
		} else if (oGenVal.isSetSgreadyStateLv2()) { // E0003
			rval.setSgreadyStateLv2(SGReadyStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgreadyStateLv1()) { // E0004
			rval.setSgreadyStateLv1(SGReadyStateLv1Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrSunspStateCodes()) {// E0005
			rval.setSgrSunspStateCodes(SGrSunspStateCodesType.get((int) RegRes));
		} else if (oGenVal.isSetSgrEVSEStateLv2()) { // E0006
			rval.setSgrEVSEStateLv2(SGrEVSEStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrEVSEStateLv1()) { // E0007
			rval.setSgrEVSEStateLv1(SGrEVSEStateLv1Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrSGCPLoadStateLv2()) { // E008
			rval.setSgrSGCPLoadStateLv2(SGrSGCPLoadStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrSGCPFeedInStateLv2()) { // E0009
			rval.setSgrSGCPFeedInStateLv2(SGrSGCPFeedInStateLv2Type.get((int) RegRes));
		} else if (oGenVal.isSetSgrEVState()) { // E0010
			rval.setSgrEVState(SGrEVStateType.get((int) RegRes));
		} else if (oGenVal.isSetSgrSGCPService()) { // E0011
			rval.setSgrSGCPService(SGrSGCPServiceType.get((int) RegRes));
		} else if (oGenVal.isSetSgrObligLvl()) { // E0012
			rval.setSgrObligLvl(SGrObligLvlType.get((int) RegRes));
		} else if (oGenVal.isSetSgrOCPPState()) { // E0013
			rval.setSgrOCPPState(SGrOCPPStateType.get((int) RegRes));
		} else if (oGenVal.isSetSgrHPOpMode()) {// E0014
			rval.setSgrHPOpMode(SGrHPOpModeType.get((int) RegRes));
		} else if (oGenVal.isSetSgrOCPPState()) {// E0015
			rval.setSgrOCPPState(SGrOCPPStateType.get((int)RegRes));
		} else if (oGenVal.isSetSgrHPOpMode() ) {// E0016
			rval.setSgrHPOpMode(SGrHPOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetSgrHCOpMode() ) {// E0017
			rval.setSgrHCOpMode(SGrHCOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetSgrDHWOpMode()) {// E0018
			rval.setSgrDHWOpMode(SGrDHWOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetCtaDHWOpMode()) {// Ecta001
			rval.setCtaDHWOpMode(CtaDHWOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetCtaHPOpMode()) {// Ecta003
			rval.setCtaHPOpMode(CtaHPOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetCtaHPOpState()) {// Ecta002
			rval.setCtaHPOpState(CtaHPOpStateType.get((int)RegRes));
		} else if (oGenVal.isSetHovHPOpMode()) {// hov001
			rval.setHovHPOpMode(HovHPOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetHovHCOpMode()) {// hov002
			rval.setHovHCOpMode(HovHCOpModeType.get((int)RegRes));
		} else if (oGenVal.isSetHovSGReadySrcSel()) {// hov003
			rval.setHovSGReadySrcSel(HovSGReadySrcSelType.get((int)RegRes));
		} else if (oGenVal.isSetHovBufferState()) {// hov004
			rval.setHovBufferState(HovBufferStateType.get((int)RegRes));
		} else if (oGenVal.isSetHovHCOpState()) {// hov005
			rval.setHovHCOpState(HovHCOpStateType.get((int)RegRes));
		} else if (oGenVal.isSetHovDomHotWaterState()) {// hov006
			rval.setHovDomHotWaterState(HovDomHotWaterStateType.get((int)RegRes));
		}
		return rval;
	}

	private Optional<SGrTimeSyncBlockNotificationType> findTimeSyncBlockNotificationType(String aName) {
		return myDeviceDescription.getTimeSyncBlockNotification().stream()
				.filter(tSyncBlock -> tSyncBlock.getBlockCashName().equals(aName)).findFirst();
	}

	private static int adjustSign(SGrBasicGenDataPointTypeType type, int register) {
		if ( (register & 0x8000) != 0) {
			if (isUnsignedType(type)) {
				return register & 0x0000FFFF;
			} else {
				return register | 0xFFFF0000;
			}
		}
		return register;
	}

	private static boolean isUnsignedType(SGrBasicGenDataPointTypeType dataPointType) {
		return (dataPointType.getInt64U() != null) ||
				dataPointType.isSetInt32U() ||
				dataPointType.isSetInt16U() ||
				dataPointType.isSetInt8U();
	}
}
