package communicator.helper;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ConversionHelper {

    private ConversionHelper() {
        // helper class
    }

    public static int[] bytesToRegisters(byte[] bytes) {
        ByteBuffer bbuf = ByteBuffer.wrap(bytes);
        IntBuffer ibuf =  IntBuffer.allocate(bytes.length/2);
        for( int i=0; i<ibuf.capacity(); i++) {
            ibuf.put(bbuf.getShort());
        }
        return ibuf.array();
    }

    public static ByteBuffer byteBufFromRegisters(int[] intArr) {
        ByteBuffer bbuf = ByteBuffer.allocate(intArr.length*2);
        for (int i= 0; i<intArr.length; i++) {
            bbuf.putShort((short)intArr[i]);
        }
        bbuf.rewind(); // to get values from...
        return bbuf;
    }

    public static int[] floatToRegisters(float fVal) {
        int[] res = new int[2];
        ByteBuffer bbuf = ByteBuffer.allocate(4);
        bbuf.putFloat(fVal);
        bbuf.rewind();
        res[0] = bbuf.getShort();
        res[1] = bbuf.getShort();
        return res;
    }

    public static int[] doubleToRegisters(double dVal) {
        int[] res = new int[4];
        ByteBuffer bbuf = ByteBuffer.allocate(8);
        bbuf.putDouble(dVal);
        bbuf.rewind();
        for(int i=0; i < res.length; i++) {
            res[i] = bbuf.getShort();
        }
        return res;
    }

    /**
     * Converts 16 - Bit Register values to String
     *
     * @param registers    Register array received via Modbus
     * @param offset       First Register containing the String to convert
     * @param stringLength number of characters in String (must be even)
     * @return Converted String
     */
    public static String convRegistersToString(int[] registers, int offset, int stringLength) {
        byte[] result = new byte[stringLength];
        byte[] registerResult = new byte[2];

        for (int i = 0; i < stringLength / 2 + stringLength % 2; i++) {
            registerResult = toByteArray(registers[offset + i]);
            result[i * 2] = registerResult[0];
            if (i*2 + 1 < stringLength) {
                result[i * 2 + 1] = registerResult[1];
            }
        }
        return new String(result);
    }

    /**
     * Converts a String to 16 - Bit Registers
     *
     * @param stringToConvert String to Convert<
     * @return Converted String
     */
    public static int[] convStringToRegisters(String stringToConvert) {
        byte[] array = stringToConvert.getBytes(Charset.forName("ASCII"));
        int[] returnarray = new int[stringToConvert.length() / 2 + stringToConvert.length() % 2];
        for (int i = 0; i < returnarray.length; i++) {
            returnarray[i] = array[i * 2]; // 'Hello' -> 'H' 'l' 'o'
            System.out.println(String.format("1. %04x", returnarray[i]));
            if (i * 2 + 1 < array.length) {
                returnarray[i] = returnarray[i] | ( (array[i * 2 + 1] << 8)); // 'e', 'l', 0x00
                System.out.println(String.format("2. %04x", returnarray[i]));
            }
        }

        StringBuffer sb = new StringBuffer();
        Arrays.stream(returnarray).forEach(iVal ->
                sb.append(String.format(" %08x", iVal))
        );

        System.out.println("REGs: " + sb);
        return returnarray;
    }

    public static byte[] toByteArray(int value) {
        byte[] result = new byte[2];
        result[1] = (byte) (value >> 8);
        result[0] = (byte) (value);
        return result;
    }
}
