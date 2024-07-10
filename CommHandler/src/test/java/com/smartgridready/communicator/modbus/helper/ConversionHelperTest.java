package com.smartgridready.communicator.modbus.helper;

import com.smartgridready.communicator.modbus.helper.ConversionHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionHelperTest {

    @Test
    void register2StringConversion() throws Exception {

        String expected = "Hello@SGr";
        int[] expectedReg = new int[]{0x4865, 0x6C6C, 0x6F40,0x5347, 0x7200};

        int[] registers = ConversionHelper.convStringToRegisters(expected);
        assertArrayEquals(expectedReg, registers);

        String result = ConversionHelper.convRegistersToString(registers, 0, expected.length());

        assertEquals(expected, result);
    }
}
