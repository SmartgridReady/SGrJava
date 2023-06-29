package communicator.common.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.modbus.impl.SGrModbusDevice;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SGrDeviceBaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SGrDeviceBaseTest.class);

    /**
     * External interface description file SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml
     * has the generic attributes structure as follows:
     * <p>
     * On device level:
     * - specQualityRequirement = METAS
     * - curtailment = 40                  ---> overwritten by functional profile
     * - maxLockTimeMinutes = 10
     * - minLoad = 20
     * - precision = 2.5                   ---> overwritten by data point
     * <p>
     * On functional profile "VoltageAC" level:
     * - curtailment = 30
     * <p>
     * On datapoint "VoltageL1" level:
     * - precision = 2.2
     * - minVal = 0.005
     * <p>
     * This will result in:
     * --------------------
     * On device level:
     * - specQualityRequirement = METAS
     * - curtailment = 30
     * - maxLockTimeMinutes = 10
     * - precision = 2.2
     * - minVal = 0.005
     */
    @Test
    void getGenAttributesByGDPType_device_and_profile_and_datapoint() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        SGrAttr4GenericType attributes = device.getGenAttributesByGDPType("VoltageAC", "VoltageL1");
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecQualityRequirement());
        assertEquals(20, attributes.getMinLoad());
        assertEquals(30, attributes.getCurtailment());
        assertEquals(10, attributes.getMaxLockTimeMinutes());
        assertEquals(2.2, attributes.getPrecision());
        assertEquals("0.005", String.format("%.3f", attributes.getMinVal()));
    }

    @Test
    void getGenAttributesByGDPType_device_and_profile() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        SGrAttr4GenericType attributes = device.getGenAttributesByGDPType("VoltageAC", null);
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecQualityRequirement());
        assertEquals(30, attributes.getCurtailment());
        assertEquals(10, attributes.getMaxLockTimeMinutes());
        assertEquals(2.5, attributes.getPrecision());
    }

    @Test
    void getGenAttributesByGDPType_device_only() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        SGrAttr4GenericType attributes = device.getGenAttributesByGDPType(null, null);
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecQualityRequirement());
        assertEquals(40, attributes.getCurtailment());
        assertEquals(10, attributes.getMaxLockTimeMinutes());
        assertEquals(2.5, attributes.getPrecision());
    }

    @Test
    void getGenAttributes() throws Exception {

        Map<String, String> expected = new HashMap<>();
        expected.put("specQualityRequirement", "METAS");
        expected.put("curtailment", "30.0");
        expected.put("maxLockTimeMinutes", "10.0");
        expected.put("minLoad", "20.0");
        expected.put("minVal", "0.005");
        expected.put("precision", "2.2");
        expected.put("flexAssistance.assists", "AT_NetServiceable");
        expected.put("flexAssistance.obligedTo", "OL_SHALL");

        SGrModbusDevice device = createSGrModbusDevice();

        Map<String, String> attributes = device.getGenAttributes("VoltageAC", "VoltageL1");
        LOG.info("Received attributes {}", attributes);

        assertEquals(expected.size(), attributes.size());
        expected.keySet().forEach(key ->
                assertEquals(expected.get(key), attributes.get(key)));
    }

    private static SGrModbusDevice createSGrModbusDevice() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL devDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");

        DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
        SGrModbusDeviceFrame devDesc = loader.load("", devDescUrl.getPath());

        return new SGrModbusDevice(devDesc, null);
    }
}
