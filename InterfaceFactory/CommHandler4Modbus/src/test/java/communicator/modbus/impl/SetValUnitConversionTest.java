package communicator.modbus.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.runtime.GenDriverAPI4Modbus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SetValUnitConversionTest
{
    private final Logger LOG = LoggerFactory.getLogger(SetValUnitConversionTest.class);
    @Mock
    private GenDriverAPI4Modbus modbusDriver;

    @Test
    void getValWithConversion() throws Exception {

        int[] modbusRegisters = new int[]{0x0000435f, 0x000028f6}; // float 223.16
        float expectedValue = 223.16f * 1.36f;

        when(modbusDriver.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusRegisters);

        float resVal = createModbusDevice().getVal("VoltageAC", "VoltageL1").getFloat32();
        LOG.info("getValWithConversion: expectedVal={}, resVal={}", expectedValue, resVal);
        assertEquals(expectedValue, resVal);
    }

    private  SGrModbusDevice createModbusDevice() {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL deviceDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        DeviceFrame deviceDesc = new DeviceDescriptionLoader<DeviceFrame>()
                .load("", Optional.ofNullable(deviceDescUrl != null ? deviceDescUrl.getPath() : null).orElse(""));

        return new SGrModbusDevice(deviceDesc, modbusDriver);
    }

}
