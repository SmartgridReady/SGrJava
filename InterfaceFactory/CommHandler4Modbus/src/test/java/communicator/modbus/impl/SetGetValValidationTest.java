package communicator.modbus.impl;

import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SetGetValValidationTest {

    private final Logger LOG = LoggerFactory.getLogger(SetGetValValidationTest.class);

    @Mock
    private GenDriverAPI4Modbus modbusDriver;

    @Test
    void outOfRangeCheckModbus() {

        SGrModbusDevice modbusDevice = createModbusDevice();

        assertDoesNotThrow(() -> modbusDevice.setVal("VoltageAC", "VoltageL1", "380"));
        assertThrows(GenDriverException.class, () -> modbusDevice.setVal("VoltageAC", "VoltageL1", "380.001"));
        assertThrows(GenDriverException.class, () -> modbusDevice.setVal("VoltageAC", "VoltageL1", "0.004"));
    }

    private static Stream<Arguments> rwPermissionChecks() {

        // VoltageL1 = R, VoltageL2 = W, VoltageL3 = RW
        return Stream.of(
                Arguments.of("write on RW DP", "VoltageL1", true,  null),
                Arguments.of("write on R  DP", "VoltageL2", true,  "Operation WRITE not allowed on datapoint VoltageL2"),
                Arguments.of("write on W  DP", "VoltageL3", true,  null),
                Arguments.of("read  on RW DP", "VoltageL1", false, null),
                Arguments.of("read  on R  DP", "VoltageL2", false, null),
                Arguments.of("read  on W  DP", "VoltageL3", false, "Operation READ not allowed on datapoint VoltageL3")
        );
    }

    @ParameterizedTest
    @MethodSource("rwPermissionChecks")
    void writePermissionCheckModbus(String testName, String dataPointName, boolean isWrite, String expectedErrorMsg) throws Exception {

        LOG.info("Testing writePermissionCheckModbus: {}", testName);

        SGrModbusDevice modbusDevice = createModbusDevice();

        if (expectedErrorMsg == null) {
            if(isWrite) {
                assertDoesNotThrow(() -> modbusDevice.setVal("VoltageAC", dataPointName, "380"));
            } else {
                when(modbusDriver.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{0,0});
                assertDoesNotThrow(() -> modbusDevice.getVal("VoltageAC", dataPointName));
            }
        } else {
            GenDriverException e = isWrite ?
                  assertThrows(GenDriverException.class, () -> modbusDevice.setVal("VoltageAC", dataPointName, "380"))
                : assertThrows(GenDriverException.class, () -> modbusDevice.getVal("VoltageAC", dataPointName));
            assertEquals(expectedErrorMsg, e.getMessage());
        }
    }

    private  SGrModbusDevice createModbusDevice() {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL deviceDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        SGrModbusDeviceFrame  deviceDesc = new DeviceDescriptionLoader<SGrModbusDeviceFrame>()
                .load("", Optional.ofNullable(deviceDescUrl.getPath()).orElse(""));

        return new SGrModbusDevice(deviceDesc, modbusDriver);
    }

}
