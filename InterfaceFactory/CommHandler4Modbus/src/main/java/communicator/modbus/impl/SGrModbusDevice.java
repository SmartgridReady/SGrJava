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
package communicator.modbus.impl;

import com.smartgridready.ns.v0.BitOrder;
import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.ModbusDataPoint;
import com.smartgridready.ns.v0.ModbusDataPointConfiguration;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.ModbusFunctionalProfile;
import com.smartgridready.ns.v0.ModbusInterface;
import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.ns.v0.ModbusLayer6Deviation;
import com.smartgridready.ns.v0.RegisterType;
import com.smartgridready.ns.v0.ScalingFactor;
import com.smartgridready.ns.v0.TimeSyncBlockNotification;
import communicator.common.api.BitmapValue;
import communicator.common.api.EnumValue;
import communicator.common.api.Int64UValue;
import communicator.common.api.NumberValue;
import communicator.common.api.StringValue;
import communicator.common.api.Value;
import communicator.common.impl.SGrDeviceBase;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.modbus.api.GenDeviceApi4Modbus;
import communicator.modbus.helper.CacheRecord;
import communicator.modbus.helper.ConversionHelper;
import communicator.modbus.helper.ModbusReader;
import communicator.modbus.helper.ModbusReaderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static communicator.common.impl.SGrDeviceBase.RwpDirections.READ;

/**
 * 
 * @author furrer / IBT,cb
 *
 */
public class SGrModbusDevice extends SGrDeviceBase<DeviceFrame, ModbusFunctionalProfile, ModbusDataPoint>
		implements GenDeviceApi4Modbus {
	
	private static final Logger LOG = LoggerFactory.getLogger(SGrModbusDevice.class);

	private final GenDriverAPI4Modbus drv4Modbus;

	private final DeviceFrame myDeviceDescription;

	private final Map<TimeSyncBlockNotification, CacheRecord<ModbusReaderResponse>> myTimeSyncBlockReadCache = new HashMap<>();

	public SGrModbusDevice(DeviceFrame aDeviceDescription, GenDriverAPI4Modbus aRtuDriver) {
		super(aDeviceDescription);
		myDeviceDescription = aDeviceDescription;
		drv4Modbus = aRtuDriver;
	}

	@Override
	public Value getVal(String sProfileName, String sDataPointName)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		Optional<ModbusFunctionalProfile> profile = findProfile(sProfileName);

		if (profile.isPresent()) {
			Optional<ModbusDataPoint> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				return getVal(dataPoint.get());
			}
		}
		throw new GenDriverException(String.format("Functional profile '%s' / datapoint '%s' not found.", sProfileName, sDataPointName));
	}

	// Read a single value
	private Value getVal(
			ModbusDataPoint aDataPoint) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		
		if (aDataPoint.getBlockCacheIdentification() != null) {
			return getBlockVal(aDataPoint);
		}

		// Use array length and use first element.
		return getValArr(aDataPoint, 1)[0];
	}

	@Override
	public Value[] getValArr(String sProfileName, String sDataPointName)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		Optional<ModbusFunctionalProfile> profile = findProfile(sProfileName);
		
		if (profile.isPresent()) {
			Optional<ModbusDataPoint> dataPoint = findDataPointForProfile(profile.get(), sDataPointName);
			if (dataPoint.isPresent()) {
				
				if (!dataPoint.get().getDataPoint().isSetArrayLength()) {
					throw new GenDriverException(String.format("getValArrByGDPType(): Datapoint %s-%s is not an array.", sProfileName, sDataPointName ));
				}
									
				int arrLen = dataPoint.get().getDataPoint().getArrayLength();
				return getValArr(dataPoint.get(), arrLen);
			}
		}
		return new Value[] {};
	}			
	
	
	private Value getBlockVal(ModbusDataPoint aDataPoint)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

			// Check read/write permission
			checkReadWritePermission(aDataPoint, READ);

			Optional<TimeSyncBlockNotification> blockNotificationTypeOpt = findTimeSyncBlockNotificationType(aDataPoint.getBlockCacheIdentification());
			if (!blockNotificationTypeOpt.isPresent()) {
				throw new GenDriverException("Could not find timeSyncBlockNotification entry with name=" + aDataPoint.getBlockCacheIdentification());
			}
			
			TimeSyncBlockNotification blockNotificationType = blockNotificationTypeOpt.get();
			BigInteger blockAddress = blockNotificationType.getFirstAddress();
		
			BigInteger mbRegRef = aDataPoint.getModbusDataPointConfiguration().getAddress();
			BigInteger addrDiff = mbRegRef.subtract(blockAddress);
			if (addrDiff.signum() < 0) {
				throw new GenDriverException("Error in EI-XML, datapoint address must be >= timeSyncBlock address");
			}
			
			ModbusInterfaceDescription modbusInterfaceDesc = myDeviceDescription.getInterfaceList().getModbusInterface().getModbusInterfaceDescription();
					
			CacheRecord<ModbusReaderResponse> mbCacheRecord = myTimeSyncBlockReadCache.get(blockNotificationType);
			ModbusReaderResponse mbResponse;
			if (mbCacheRecord == null || mbCacheRecord.isExpired(blockNotificationType.getTimeToLiveMs())) {

				LOG.debug("Reading time sync block from modbus device");
				mbResponse = ModbusReader.read(
						drv4Modbus,
						blockNotificationType.getRegisterType(),
						blockAddress.intValue(),
						modbusInterfaceDesc.isFirstRegisterAddressIsOne(),
						blockNotificationType.getSize());
				
				if (blockNotificationType.isSetTimeToLiveMs()) {
					myTimeSyncBlockReadCache.put(blockNotificationType, new CacheRecord<>(mbResponse, Instant.now()));
				}
			} else {
				LOG.debug("Reading time sync block from cache.");
				mbResponse = mbCacheRecord.getValue();
			}			

			// pick the correct value from the received block			
			int size = aDataPoint.getModbusDataPointConfiguration().getNumberOfRegisters();
			int[] mbRegResp = mbResponse.getMbregresp(addrDiff.intValue(), size);
			boolean[] mbBitResp = mbResponse.getMbbitresp(addrDiff.intValue(), size);


			// do conversion of the read data
			return doReadConversion(
					aDataPoint,
					modbusInterfaceDesc, 
					mbRegResp, // response register int[]
					mbBitResp, // response bits[]
					mbResponse.isbGotRegisters(),
					size,		// number of bytes read
					0);			// array index/offset
	}

	// Read an array of values
	private Value[] getValArr(
		ModbusDataPoint aDataPoint, int arrayLen)
		throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		// Check if read is allowed
		checkReadWritePermission(aDataPoint, READ);

		ModbusInterfaceDescription modbusInterfaceDesc = getModbusInterfaceDescription();
		ModbusDataPointConfiguration mbRegRef = aDataPoint.getModbusDataPointConfiguration();

		boolean bMBfirstRegOne = modbusInterfaceDesc.isFirstRegisterAddressIsOne();

		LOG.debug("Reading value from modbus device.");

		int size = aDataPoint.getModbusDataPointConfiguration().getNumberOfRegisters();

		ModbusReaderResponse mbResponse = ModbusReader.read(
				drv4Modbus,
				mbRegRef.getRegisterType(),
				mbRegRef.getAddress().intValue(),
				bMBfirstRegOne,
				size * arrayLen);

		// modbus OSI Layer 6 to generic OSI layer 6 conversion
		List<Value> resultList = new ArrayList<>();
		for (int arrIdx = 0; arrIdx < arrayLen; arrIdx++) {
			resultList.add(
				doReadConversion(
					aDataPoint,
					modbusInterfaceDesc,
					mbResponse.getMbregresp(), // response register int[]
					mbResponse.getMbbitresp(), // response bits[]
					mbResponse.isbGotRegisters(),
					size,
					arrIdx));
		}

		return resultList.toArray(new Value[0]);
	}

	private Value doReadConversion(ModbusDataPoint aDataPoint,
								   ModbusInterfaceDescription modbusInterfaceDesc,
								   final int[] mbregrespSrc,
								   final boolean[] mbbitrespSrc,
								   boolean bGotRegisters,
								   int size, int arrOffset) throws GenDriverException {

		int mul = 1;
		int l6dev;
		int pwof10 = 0;
		// Register return value calculation

		int[] mbregresp = Arrays.copyOfRange(mbregrespSrc, arrOffset*size, (arrOffset+1)*size);
		boolean[] mbbitresp = Arrays.copyOfRange(mbbitrespSrc, arrOffset*size, (arrOffset+1)*size);

		ModbusDataType mbType  = aDataPoint.getModbusDataPointConfiguration().getModbusDataType();
		DataTypeProduct genType = aDataPoint.getDataPoint().getDataType();

		BitOrder bitOrder = modbusInterfaceDesc.getBitOrder();
		if (bGotRegisters) {
			if (bitOrder != BitOrder.BIG_ENDIAN) {
				mbregresp = convertEndians(bitOrder, mbregresp, size);
			}

			// Attributes
			if (aDataPoint.getModbusAttributes() != null)
			{   // there are Modbus attributes available

				// TODO unit-test this code
				if (   !aDataPoint.getModbusAttributes().isSetSunssf()
				    && (aDataPoint.getModbusAttributes().getScalingFactor() !=null))
				{
					ScalingFactor attrScaling = aDataPoint.getModbusAttributes().getScalingFactor();
					mul = attrScaling.getMultiplicator();
					pwof10 = attrScaling.getPowerof10();
				}

				if (aDataPoint.getModbusAttributes().isSetLayer6Deviation() )
				{   // do we have Layer 6 deviations ?
			       	l6dev = aDataPoint.getModbusAttributes().getLayer6Deviation().getValue();
			       	mbregresp = manageLayer6deviation(l6dev, mbregresp, size);
				}
			}


			// Most significant int as returned from modbus can have the wrong sign:
			// - after change byte order
			// - if the modbus value is an unsigned number and MSB is set
			mbregresp[0] = adjustSign(mbType, mbregresp[0]);
	    }

		Value retVal;
		if (bGotRegisters) {
			retVal = Value.fromModbusRegister(mbType, mbregresp);
			if (genType.getEnum() != null) {
				retVal = EnumValue.of(retVal.getInt64(), genType.getEnum());
			} else if (genType.getBitmap() != null) {
				retVal = BitmapValue.of(mbregresp, genType.getBitmap());
			} else if (retVal instanceof NumberValue) {
				retVal = ((NumberValue)retVal).scaleUp( mul, pwof10);
			} else if (retVal instanceof Int64UValue) {
				retVal = ((Int64UValue)retVal).scaleUp(mul, pwof10);
			} else if (retVal instanceof StringValue) {
				((StringValue) retVal).scaleUp(mul, pwof10);
			}
		} else {
			retVal = Value.fromDiscreteInput(mbType, mbbitresp);
		}
		return retVal;				
	}

	private int[] manageLayer6deviation(int mBlayer6Scheme, int[] mbregresp, int size) throws GenDriverException {
		
		int[] mbregconv = new int[10];
		long lv;

		mbregconv[0] = 0;

		switch (mBlayer6Scheme) {
			case ModbusLayer6Deviation._2REG_BASE1000_H2L_VALUE:
				if (size==2) {
					lv = ((long) mbregresp[0]) * 1000;
					lv = lv + mbregresp[1];
					mbregconv[1] = (int) (lv & 0xffff);
					mbregconv[0] = (int) ((lv >> 16) & 0xffff);
					mbregresp = mbregconv;
				}
				break;
			case ModbusLayer6Deviation._2REG_BASE1000_L2H_VALUE:
				if (size==2) {
					lv = ((long) mbregresp[1]) * 1000;
					lv = lv + mbregresp[0];
					mbregconv[1] = (int) (lv & 0xffff);
					mbregconv[0] = (int) ((lv >> 16) & 0xffff);
					mbregresp = mbregconv;
				}
				break;
			default:
				throw new GenDriverException(String.format("Unhandled layer6deviation: conversionScheme=%d", mBlayer6Scheme));
		}
		return mbregresp;
	}

	private int[] convertEndians(BitOrder mBconvScheme, int[] mbregresp, int size) throws GenDriverException{

		if (LOG.isTraceEnabled()) {
			LOG.trace("convertEndians mbregesp:");
			for (int j : mbregresp) {
				LOG.trace(String.format("int16: %d - %04x", j, j));
			}
		}

		int c;
		int[] mbregconv = new int[256];

		try {
			if (mBconvScheme.equals(BitOrder.CHANGE_BIT_ORDER)) {
				throw new GenDriverException("CHANGE_BIT_ORDER is not supported yet. Check EID-XML.");
			} else if (mBconvScheme.equals(BitOrder.CHANGE_BYTE_ORDER)) {
				for (c = 0; c < size; c++) {
					if (LOG.isDebugEnabled()) {
						LOG.debug("mbregresp: {} ", mbregresp);
						LOG.debug("mbregresp[0]: {} ", String.format("%08x", mbregresp[0]));
					}
					byte[] result = new byte[2];
					result[1] = (byte) (mbregresp[c] >> 8);
					result[0] = (byte) mbregresp[c];

					mbregconv[c] = Byte.toUnsignedInt(result[1])
							+ (Byte.toUnsignedInt(result[0]) << 8);

					if (LOG.isDebugEnabled()) {
						LOG.debug(String.format("CHANGE_BYTE_ORDER converted %d: %02x, %02x, %08x", c, result[1], result[0], mbregconv[c]));
						LOG.debug("mbregconv: {}", mbregconv);
						LOG.debug("mbregconv[0]: {} ", String.format("%08x", mbregconv[0]));
					}
				}
			} else if (mBconvScheme.equals(BitOrder.CHANGE_WORD_ORDER)) {
				if (size==1) {
					return mbregresp; // just one word, no conversion
				}
				if ((size % 2)==0) {
					for (c = 0; c < size; c = c + 2) {
						mbregconv[c] = mbregresp[c + 1];
						mbregconv[c + 1] = mbregresp[c];
					}
				} else  // Q&A:CB NO swap here: is this really intended?
				{
					mbregconv = mbregresp;
				}
				for (int i = 0; i < size - 1; i++)
					if (LOG.isDebugEnabled()) {
						LOG.debug(String.format("CHANGE_WORD_ORDER converted %d: %08x, %08x", i, mbregresp[i], mbregconv[i]));
					}

			} else if (mBconvScheme.equals(BitOrder.CHANGE_DWORD_ORDER)) {
				if ((size % 4) > 0) {
					LOG.info("CHANGE_DWORD_ORDER: Input Array length does not match");
					//rem/cb: check is DWORD change needed in case of (size % 4) > 0
					mbregconv = mbregresp;
				} else {   //rem/cb:  check array of WORDS: is DWORD change needed in case of size > 4
					for (c = 0; c < size; c = c + 4) {
						mbregconv[c + 1] = mbregresp[c + 3];
						mbregconv[c    ] = mbregresp[c + 2];
						mbregconv[c + 3] = mbregresp[c + 1];
						mbregconv[c + 2] = mbregresp[c];
						for (int i = 0; i < 4; i++) {
							if (LOG.isDebugEnabled()) {
								LOG.debug(String.format("CHANGE_DWORD_ORDER converted %d: %08x, %08x", i, mbregresp[i], mbregconv[i]));
							}
						}
					}
				}
			}
		} catch (IllegalArgumentException e1) {
			LOG.error("***IllegalArgumentException: {}", e1.toString());
			return mbregresp;
		}

		return mbregconv;
	}

	@Override
	public void setVal(String sProfileName, String sDataPointName, Value value)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {

		ModbusDataPoint dataPoint = findDatapoint(sProfileName, sDataPointName);
		setValArr(dataPoint, new Value[]{value});
	}

	@Override
	public void setValArr(String profileName, String dataPointName, Value[] values)
			throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
		ModbusDataPoint dataPoint = findDatapoint(profileName, dataPointName);
		setValArr(dataPoint, values);
	}

	private void setValArr(
			ModbusDataPoint aDataPoint,
			Value[] sgrValues) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {


		int[] mbregsnd;
		boolean[] mbbitsnd;
		boolean bRegisterCMDs = false;
		boolean bDiscreteCMDs = false;
		boolean isSetAccessProt = false;
		int mul = 1;
		int l6dev = -1;
		int powof10 = 0;

		ModbusInterfaceDescription modbusInterfaceDesc = getModbusInterfaceDescription();

		// Handle generic attributes:
		// Data Direction ctrl
		checkReadWritePermission(aDataPoint, RwpDirections.WRITE);

		// Value range check
		checkOutOfRange(sgrValues, aDataPoint);

		if (aDataPoint.getModbusAttributes()!=null) { // there are Modbus attributes available
			if (!aDataPoint.getModbusAttributes().isSetSunssf()
					&& (aDataPoint.getModbusAttributes().getScalingFactor()!=null)) {
				ScalingFactor attrScaling = aDataPoint.getModbusAttributes().getScalingFactor();
				mul = attrScaling.getMultiplicator();
				powof10 = attrScaling.getPowerof10();
			}
			if (aDataPoint.getModbusAttributes().isSetLayer6Deviation()) {
				// for future implementations
				l6dev = aDataPoint.getModbusAttributes().getLayer6Deviation().getValue();
			}
			if (aDataPoint.getModbusAttributes().getAccessProtection()!=null) {
				isSetAccessProt = true; // for future use
			}
		}
		ModbusDataPointConfiguration modbusDataPointConfiguration = aDataPoint.getModbusDataPointConfiguration();
		BigInteger regad = modbusDataPointConfiguration.getAddress();

		boolean bMBfirstRegOne = modbusInterfaceDesc.isFirstRegisterAddressIsOne();
		if (bMBfirstRegOne) {
			regad = regad.subtract(BigInteger.ONE);
		}

		int mbsize = aDataPoint.getModbusDataPointConfiguration().getNumberOfRegisters();
		BitOrder bitOrder = modbusInterfaceDesc.getBitOrder();

		// fill values & booleans, apply conversion scheme
		if (modbusDataPointConfiguration.getRegisterType()==RegisterType.HOLD_REGISTER)
			bRegisterCMDs = true;
		if (modbusDataPointConfiguration.getRegisterType()==RegisterType.COIL)
			bDiscreteCMDs = true;

		IntBuffer mbRegBuf = IntBuffer.allocate(1024);
		ByteBuffer mbByteBuf = ByteBuffer.allocate(1024);

		for (Value sgrValue : sgrValues) {
			doWriteConversion(
					mbRegBuf,
					mbByteBuf,
					sgrValue,
					bRegisterCMDs,
					mul,
					powof10,
					aDataPoint);
		}

		int nrRegisters = aDataPoint.getModbusDataPointConfiguration().getNumberOfRegisters();
		mbregsnd = Arrays.copyOfRange(mbRegBuf.array(), 0, nrRegisters * sgrValues.length);
		mbbitsnd = Arrays.copyOfRange(ConversionHelper.byteArrToBooleanArr(mbByteBuf.array()), 0, nrRegisters * sgrValues.length);

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
	}

	private void doWriteConversion(
			IntBuffer   mbRegBufRes,
			ByteBuffer 	mbByteBuf,
			Value sgrValue,
			boolean bRegisterCMDs,
			int mul,
			int powof10,
			ModbusDataPoint dataPoint) throws GenDriverException {

		// Data format adaption
		ModbusDataType dMBType  = dataPoint.getModbusDataPointConfiguration().getModbusDataType();
		DataTypeProduct genType = dataPoint.getDataPoint().getDataType();
		int mbsize = dataPoint.getModbusDataPointConfiguration().getNumberOfRegisters();
		BitOrder bitOrder = getModbusInterfaceDescription().getBitOrder();

		IntBuffer mbRegBuf = IntBuffer.allocate(32);
		if (bRegisterCMDs) {
			if (sgrValue instanceof EnumValue) {
				sgrValue = sgrValue.enumToOrdinalValue(genType.getEnum());
				mbRegBuf.put(sgrValue.toModbusRegister(dMBType));
			} else if (sgrValue instanceof BitmapValue) {
				mbRegBuf.put(((BitmapValue) sgrValue).toModbusRegisters(mbsize, genType.getBitmap()));
			} else if(sgrValue instanceof NumberValue) {
				sgrValue = ((NumberValue<?>) sgrValue).scaleDown(mul, powof10);
				mbRegBuf.put(sgrValue.toModbusRegister(dMBType));
			} else if (sgrValue instanceof Int64UValue) {
				sgrValue = ((Int64UValue) sgrValue).scaleDown(mul, powof10);
				mbRegBuf.put(sgrValue.toModbusRegister(dMBType));
			} else if (sgrValue instanceof StringValue) {
				((StringValue) sgrValue).scaleDown(mul, powof10);
				mbRegBuf.put(sgrValue.toModbusRegister(dMBType));
			} else {
				mbRegBuf.put(sgrValue.toModbusRegister(dMBType));
			}
		} else {
			mbByteBuf.put(sgrValue.toModbusDiscreteVal(dMBType)[0]);
		}

		if (bitOrder != BitOrder.BIG_ENDIAN) {
			if (bRegisterCMDs) {
				int[] convStream = convertEndians(bitOrder, mbRegBuf.array(), mbsize);
				mbRegBufRes.put(Arrays.copyOfRange(convStream, 0, mbsize));
			}
			else {
				// TODO: add discrete data type management
			}
		} else {
			mbRegBufRes.put(mbRegBuf.array());
		}
	}

	private Optional<TimeSyncBlockNotification> findTimeSyncBlockNotificationType(String aName) {
		return myDeviceDescription.getInterfaceList().getModbusInterface().getTimeSyncBlockNotification().stream()
				.filter(tSyncBlock -> tSyncBlock.getBlockCacheIdentification().equals(aName)).findFirst();
	}

	private static int adjustSign(ModbusDataType type, int register) {
		if ( (register & 0x8000) != 0) {
			if (isUnsignedType(type)) {
				return register & 0x0000FFFF;
			} else {
				return register | 0xFFFF0000;
			}
		}
		return register;
	}

	private static boolean isUnsignedType(ModbusDataType dataPointType) {
		return  (dataPointType.getInt64U() != null) ||
				(dataPointType.getInt32U() != null) ||
				(dataPointType.getInt16U() != null) ||
				(dataPointType.getInt8U()  != null);
	}

	@Override
	protected Optional<ModbusFunctionalProfile> findProfile(String aProfileName) {
		return myDeviceDescription.getInterfaceList().getModbusInterface().getFunctionalProfileList().getFunctionalProfileListElement().stream()
				.filter(modbusProfileFrame -> modbusProfileFrame.getFunctionalProfile().getFunctionalProfileName().equals(aProfileName))
				.findFirst();
	}

	protected Optional<ModbusDataPoint> findDataPointForProfile(ModbusFunctionalProfile aProfile,
																	 String aDataPointName) {
		return aProfile.getDataPointList().getDataPointListElement().stream()
				.filter(datapoint -> datapoint.getDataPoint().getDataPointName().equals(aDataPointName))
				.findFirst();
	}

	private ModbusInterface getModbusInterface() {
		return myDeviceDescription.getInterfaceList().getModbusInterface();
	}

	private ModbusInterfaceDescription getModbusInterfaceDescription() {
		return getModbusInterface().getModbusInterfaceDescription();
	}

}
