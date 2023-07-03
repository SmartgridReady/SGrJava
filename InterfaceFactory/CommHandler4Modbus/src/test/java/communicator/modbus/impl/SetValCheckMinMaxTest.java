package communicator.modbus.impl;

import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class SetValCheckMinMaxTest {
    @Mock
    private GenDriverAPI4Modbus modbusDriver;

    @Test
    void testOutOfRangeModbus() {

        SGrModbusDevice modbusDevice = createModbusDevice();

        assertDoesNotThrow(() -> modbusDevice.setVal("VoltageAC", "VoltageL1", "380"));
        assertThrows(GenDriverException.class, () -> modbusDevice.setVal("VoltageAC", "VoltageL1", "380.001"));
        assertThrows(GenDriverException.class, () -> modbusDevice.setVal("VoltageAC", "VoltageL1", "0.004"));
    }

    private SGrModbusDevice createModbusDevice() {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL deviceDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        SGrModbusDeviceFrame  deviceDesc = new DeviceDescriptionLoader<SGrModbusDeviceFrame>().load("", deviceDescUrl.getPath());

        return new SGrModbusDevice(deviceDesc, modbusDriver);
    }

}
