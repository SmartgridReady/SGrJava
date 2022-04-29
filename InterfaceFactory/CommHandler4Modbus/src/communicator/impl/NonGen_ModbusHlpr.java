package communicator.impl;

import java.nio.ByteBuffer;

import easymodbus.de.re.easymodbus.datatypes.RegisterOrder;

public class NonGen_ModbusHlpr {

	/**
	 * Convert two 16 Bit Registers to 32 Bit real value
	 * 
	 * @param registers 16 Bit Registers
	 * @return 32 bit real value
	 */
	public static float ConvRegistersToFloat(int[] registers) throws IllegalArgumentException {
		if (registers.length != 2)
			throw new IllegalArgumentException("Input Array length invalid");
		int highRegister = registers[1];
		int lowRegister = registers[0];
		byte[] highRegisterBytes = toByteArray(highRegister);
		byte[] lowRegisterBytes = toByteArray(lowRegister);
		/*
		 * byte[] floatBytes = { highRegisterBytes[1], highRegisterBytes[0],
		 * lowRegisterBytes[1], lowRegisterBytes[0] };
		 */
		byte[] floatBytes = { lowRegisterBytes[1], lowRegisterBytes[0], highRegisterBytes[1], highRegisterBytes[0] };
		return ByteBuffer.wrap(floatBytes).getFloat();
	}

	/**
	 * Convert two 16 Bit Registers to 64 Bit double value Reg0: Low Word.....Reg3:
	 * High Word
	 * 
	 * @param registers 16 Bit Registers
	 * @return 64 bit double value
	 */
	public static double ConvRegistersToDouble(int[] registers) throws IllegalArgumentException {
		if (registers.length != 4)
			throw new IllegalArgumentException("Input Array length invalid");
		byte[] highRegisterBytes = toByteArray(registers[3]);
		byte[] highLowRegisterBytes = toByteArray(registers[2]);
		byte[] lowHighRegisterBytes = toByteArray(registers[1]);
		byte[] lowRegisterBytes = toByteArray(registers[0]);
		/*
		 * byte[] doubleBytes = { highRegisterBytes[1], highRegisterBytes[0],
		 * highLowRegisterBytes[1], highLowRegisterBytes[0], lowHighRegisterBytes[1],
		 * lowHighRegisterBytes[0], lowRegisterBytes[1], lowRegisterBytes[0] };
		 */
		byte[] doubleBytes = { lowRegisterBytes[1], lowRegisterBytes[0], lowHighRegisterBytes[1],
				lowHighRegisterBytes[0], highLowRegisterBytes[1], highLowRegisterBytes[0], highRegisterBytes[1],
				highRegisterBytes[0], };
		return ByteBuffer.wrap(doubleBytes).getDouble();
	}

	/**
	 * Convert two 16 Bit Registers to 64 Bit double value Order "LowHigh": Reg0:
	 * Low Word.....Reg3: High Word, "HighLow": Reg0: High Word.....Reg3: Low Word
	 * 
	 * @param registers     16 Bit Registers
	 * @param registerOrder High Register first or low Register first
	 * @return 64 bit double value NOT USED SO FAR AS REGISTER ALIGNEMT IS DONE WITH
	 *         INCMING BUFFER DATA IBT/cb 22.01.22 public static double
	 *         ConvRegistersToDouble(int[] registers, RegisterOrder registerOrder)
	 *         throws IllegalArgumentException { if (registers.length != 4) throw
	 *         new IllegalArgumentException("Input Array length invalid"); int[]
	 *         swappedRegisters = { registers[0], registers[1], registers[2],
	 *         registers[3] }; if (registerOrder == RegisterOrder.HighLow)
	 *         swappedRegisters = new int[] { registers[3], registers[2],
	 *         registers[1], registers[0] }; return
	 *         ConvRegistersToDouble(swappedRegisters); }
	 * 
	 */
	/**
	 * Convert two 16 Bit Registers to 32 Bit real value
	 * 
	 * @param registers     16 Bit Registers
	 * @param registerOrder High Register first or low Register first
	 * @return 32 bit real value NOT USED SO FAR AS REGISTER ALIGNEMT IS DONE WITH
	 *         INCMING BUFFER DATA IBT/cb 22.01.22 public static float
	 *         ConvRegistersToFloat(int[] registers, RegisterOrder registerOrder)
	 *         throws IllegalArgumentException { int [] swappedRegisters =
	 *         {registers[0],registers[1]}; if (registerOrder ==
	 *         RegisterOrder.HighLow) swappedRegisters = new int[]
	 *         {registers[1],registers[0]}; return
	 *         ConvRegistersToFloat(swappedRegisters); }
	 */

	/**
	 * Convert four 16 Bit Registers to 64 Bit long value Reg0: Low Word.....Reg3:
	 * High Word
	 * 
	 * @param registers 16 Bit Registers
	 * @return 64 bit value
	 */
	public static long ConvRegistersToLong(int[] registers) throws IllegalArgumentException {
		if (registers.length != 4)
			throw new IllegalArgumentException("Input Array length invalid");
		byte[] highRegisterBytes = toByteArray(registers[3]);
		byte[] highLowRegisterBytes = toByteArray(registers[2]);
		byte[] lowHighRegisterBytes = toByteArray(registers[1]);
		byte[] lowRegisterBytes = toByteArray(registers[0]);
		byte[] longBytes = { highRegisterBytes[1], highRegisterBytes[0], highLowRegisterBytes[1],
				highLowRegisterBytes[0], lowHighRegisterBytes[1], lowHighRegisterBytes[0], lowRegisterBytes[1],
				lowRegisterBytes[0] };
		return ByteBuffer.wrap(longBytes).getLong();
	}

	/**
	 * Convert four 16 Bit Registers to 64 Bit long value Register Order "LowHigh":
	 * Reg0: Low Word.....Reg3: High Word, "HighLow": Reg0: High Word.....Reg3: Low
	 * Word
	 * 
	 * @param registers 16 Bit Registers
	 * @return 64 bit value
	 */
	public static long ConvRegistersToLong(int[] registers, RegisterOrder registerOrder)
			throws IllegalArgumentException {
		if (registers.length != 4)
			throw new IllegalArgumentException("Input Array length invalid");
		int[] swappedRegisters = { registers[0], registers[1], registers[2], registers[3] };
		if (registerOrder == RegisterOrder.HighLow)
			swappedRegisters = new int[] { registers[3], registers[2], registers[1], registers[0] };
		return ConvRegistersToLong(swappedRegisters);
	}

	/**
	 * Convert two 16 Bit Registers to 32 Bit long value
	 * 
	 * @param registers 16 Bit Registers
	 * @return 32 bit value
	 */
	public static int ConvRegistersToInt(int[] registers) throws IllegalArgumentException {
		if (registers.length != 2)
			throw new IllegalArgumentException("Input Array length invalid");
		int highRegister = registers[1];
		int lowRegister = registers[0];
		byte[] highRegisterBytes = toByteArray(highRegister);
		byte[] lowRegisterBytes = toByteArray(lowRegister);
		byte[] doubleBytes = { highRegisterBytes[1], highRegisterBytes[0], lowRegisterBytes[1], lowRegisterBytes[0] };
		return ByteBuffer.wrap(doubleBytes).getInt();
	}

	/**
	 * Convert two 16 Bit Registers to 32 Bit long value
	 * 
	 * @param registers     16 Bit Registers
	 * @param registerOrder High Register first or low Register first
	 * @return 32 bit value
	 */
	public static int ConvRegistersToInt(int[] registers, RegisterOrder registerOrder) throws IllegalArgumentException {
		int[] swappedRegisters = { registers[0], registers[1] };
		if (registerOrder == RegisterOrder.HighLow)
			swappedRegisters = new int[] { registers[1], registers[0] };
		return ConvRegistersToInt(swappedRegisters);
	}

	/**
	 * Convert 32 Bit real Value to two 16 Bit Value to send as Modbus Registers
	 * 
	 * @param floatValue real to be converted
	 * @return 16 Bit Register values
	 */
	public static int[] ConvFloatToRegisters(float floatValue) {
		byte[] floatBytes = toByteArray(floatValue);
		byte[] highRegisterBytes = { 0, 0, floatBytes[0], floatBytes[1],

		};
		byte[] lowRegisterBytes = { 0, 0, floatBytes[2], floatBytes[3],

		};
		int[] returnValue = { ByteBuffer.wrap(lowRegisterBytes).getInt(), ByteBuffer.wrap(highRegisterBytes).getInt() };
		return returnValue;
	}

	/**
	 * Convert 32 Bit real Value to two 16 Bit Value to send as Modbus Registers
	 * 
	 * @param floatValue    real to be converted
	 * @param registerOrder High Register first or low Register first
	 * @return 16 Bit Register values
	 */
	public static int[] ConvFloatToRegisters(float floatValue, RegisterOrder registerOrder) {
		int[] registerValues = ConvFloatToRegisters(floatValue);
		int[] returnValue = registerValues;
		if (registerOrder == RegisterOrder.HighLow)
			returnValue = new int[] { registerValues[1], registerValues[0] };
		return returnValue;
	}

	/**
	 * Convert 32 Bit Value to two 16 Bit Value to send as Modbus Registers
	 * 
	 * @param intValue Value to be converted
	 * @return 16 Bit Register values
	 */
	public static int[] ConvIntToRegisters(int intValue) {
		byte[] doubleBytes = toByteArrayInt(intValue);
		byte[] highRegisterBytes = { 0, 0, doubleBytes[0], doubleBytes[1],

		};
		byte[] lowRegisterBytes = { 0, 0, doubleBytes[2], doubleBytes[3],

		};
		int[] returnValue = { ByteBuffer.wrap(lowRegisterBytes).getInt(), ByteBuffer.wrap(highRegisterBytes).getInt() };
		return returnValue;
	}

	/**
	 * Convert 32 Bit Value to two 16 Bit Value to send as Modbus Registers
	 * 
	 * @param intValue      Value to be converted
	 * @param registerOrder High Register first or low Register first
	 * @return 16 Bit Register values
	 */
	public static int[] ConvIntToRegisters(int intValue, RegisterOrder registerOrder) {
		int[] registerValues = ConvIntToRegisters(intValue);
		int[] returnValue = registerValues;
		if (registerOrder == RegisterOrder.HighLow)
			returnValue = new int[] { registerValues[1], registerValues[0] };
		return returnValue;
	}

	/**
	 * Convert 64 Bit Value to four 16 Bit Value to send as Modbus Registers
	 * 
	 * @param longValue Value to be converted
	 * @return 16 Bit Register values
	 */
	public static int[] ConvLongToRegisters(long longValue) {
		byte[] doubleBytes = toByteArrayLong(longValue);
		byte[] highhighRegisterBytes = { 0, 0, doubleBytes[0], doubleBytes[1],

		};
		byte[] highlowRegisterBytes = { 0, 0, doubleBytes[2], doubleBytes[3],

		};
		byte[] lowHighRegisterBytes = { 0, 0, doubleBytes[4], doubleBytes[5], };
		byte[] lowlowRegisterBytes = { 0, 0, doubleBytes[6], doubleBytes[7],

		};
		int[] returnValue = { ByteBuffer.wrap(lowlowRegisterBytes).getInt(),
				ByteBuffer.wrap(lowHighRegisterBytes).getInt(), ByteBuffer.wrap(highlowRegisterBytes).getInt(),
				ByteBuffer.wrap(highhighRegisterBytes).getInt(), };
		return returnValue;
	}

	/**
	 * Convert 64 Bit Value to two 16 Bit Value to send as Modbus Registers
	 * 
	 * @param longValue     Value to be converted
	 * @param registerOrder High Register first or low Register first
	 * @return 16 Bit Register values
	 */
	public static int[] ConvLongToRegisters(int longValue, RegisterOrder registerOrder) {
		int[] registerValues = ConvLongToRegisters(longValue);
		int[] returnValue = registerValues;
		if (registerOrder == RegisterOrder.HighLow)
			returnValue = new int[] { registerValues[3], registerValues[2], registerValues[1], registerValues[0] };
		return returnValue;
	}

	/**
	 * Convert 64 Bit Value to four 16 Bit Value to send as Modbus Registers
	 * 
	 * @param doubleValue Value to be Conved
	 * @return 16 Bit Register values
	 */
	public static int[] ConvDoubleToRegisters(double doubleValue) {
		byte[] doubleBytes = toByteArrayDouble(doubleValue);
		byte[] highhighRegisterBytes = { 0, 0, doubleBytes[0], doubleBytes[1],

		};
		byte[] highlowRegisterBytes = { 0, 0, doubleBytes[2], doubleBytes[3],

		};
		byte[] lowHighRegisterBytes = { 0, 0, doubleBytes[4], doubleBytes[5], };
		byte[] lowlowRegisterBytes = { 0, 0, doubleBytes[6], doubleBytes[7],

		};
		int[] returnValue = { ByteBuffer.wrap(lowlowRegisterBytes).getInt(),
				ByteBuffer.wrap(lowHighRegisterBytes).getInt(), ByteBuffer.wrap(highlowRegisterBytes).getInt(),
				ByteBuffer.wrap(highhighRegisterBytes).getInt(), };
		return returnValue;
	}

	/**
	 * Convert 64 Bit Value to two 16 Bit Value to send as Modbus Registers
	 * 
	 * @param doubleValue   Value to be converted
	 * @param registerOrder High Register first or low Register first
	 * @return 16 Bit Register values
	 */
	public static int[] ConvDoubleToRegisters(double doubleValue, RegisterOrder registerOrder) {
		int[] registerValues = ConvDoubleToRegisters(doubleValue);
		int[] returnValue = registerValues;
		if (registerOrder == RegisterOrder.HighLow)
			returnValue = new int[] { registerValues[3], registerValues[2], registerValues[1], registerValues[0] };
		return returnValue;
	}

	/**
	 * Converts 16 - Bit Register values to String
	 * 
	 * @param registers    Register array received via Modbus
	 * @param offset       First Register containing the String to convert
	 * @param stringLength number of characters in String (must be even)
	 * @return Converted String
	 */
	public static String ConvRegistersToString(int[] registers, int offset, int stringLength) {
		byte[] result = new byte[stringLength];
		byte[] registerResult = new byte[2];

		for (int i = 0; i < stringLength / 2; i++) {
			registerResult = toByteArray(registers[offset + i]);
			result[i * 2] = registerResult[0];
			result[i * 2 + 1] = registerResult[1];
		}
		return new String(result);
	}

	/**
	 * Converts a String to 16 - Bit Registers
	 * 
	 * @param stringToConvert String to Convert<
	 * @return Converted String
	 */
	public static int[] ConvStringToRegisters(String stringToConvert) {
		byte[] array = stringToConvert.getBytes();
		int[] returnarray = new int[stringToConvert.length() / 2 + stringToConvert.length() % 2];
		for (int i = 0; i < returnarray.length; i++) {
			returnarray[i] = array[i * 2];
			if (i * 2 + 1 < array.length) {
				returnarray[i] = returnarray[i] | ((int) array[i * 2 + 1] << 8);
			}
		}
		return returnarray;
	}

	public static byte[] toByteArray(int value) {
		byte[] result = new byte[2];
		result[1] = (byte) (value >> 8);
		result[0] = (byte) (value);
		return result;
	}

	public static byte[] toByteArrayInt(int value) {
		return ByteBuffer.allocate(4).putInt(value).array();
	}

	public static byte[] toByteArrayLong(long value) {
		return ByteBuffer.allocate(8).putLong(value).array();
	}

	public static byte[] toByteArrayDouble(double value) {
		return ByteBuffer.allocate(8).putDouble(value).array();
	}

	public static byte[] toByteArray(float value) {
		return ByteBuffer.allocate(4).putFloat(value).array();
	}

}
