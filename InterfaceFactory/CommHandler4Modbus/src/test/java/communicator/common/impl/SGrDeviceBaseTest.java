package communicator.common.impl;

import com.smartgridready.ns.v0.DataDirectionProduct;
import com.smartgridready.ns.v0.DeviceCategory;
import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.FunctionalProfileCategory;
import com.smartgridready.ns.v0.Language;
import com.smartgridready.ns.v0.Units;
import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;
import communicator.common.api.dto.ConfigurationValue;
import communicator.common.api.dto.DataPoint;
import communicator.common.api.dto.FunctionalProfile;
import communicator.common.api.dto.GenericAttribute;
import communicator.common.api.dto.InterfaceType;
import communicator.common.api.dto.OperationEnvironment;
import communicator.common.api.values.Float64Value;
import communicator.common.api.values.Int64Value;
import communicator.common.api.values.StringValue;
import communicator.common.api.values.Value;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.impl.SGrDeviceBase.Comparator;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.impl.SGrModbusDevice;
import communicator.rest.http.client.ApacheRestServiceClientFactory;
import communicator.rest.impl.SGrRestApiDevice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class SGrDeviceBaseTest {

    private static final Value INTEGER_VALUE_20482048 = Int64Value.of(20482048L);
    private static final Value DOUBLE_VALUE_4096_00009999 = Float64Value.of(4096.00009999d);

    private static final Value STRING_VALUE_1000 = StringValue.of("1000");

    enum Expect {
        OK,
        ERROR
    }

    private static Stream<Arguments> checkRangeArguments() {
        return Stream.of(
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MIN, 20482048d, Expect.OK),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MIN, 20482049d, Expect.ERROR),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MAX, 20482048d, Expect.OK),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MAX, 20482047d, Expect.ERROR),

                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, 4096.00009999d, Expect.OK),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, 4096.00010000d, Expect.ERROR),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, 4096.00009999d, Expect.OK),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, 4096.00009998d, Expect.ERROR),

                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MIN, 1000d, Expect.OK),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MIN, 1001d, Expect.ERROR),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MAX, 1000d, Expect.OK),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MAX, 999d,  Expect.ERROR)
        );
    }

    @ParameterizedTest
    @MethodSource("checkRangeArguments")
    void checkRange(Value[] values, Comparator comparator, double limit, Expect expect) {

        SGrModbusDevice device = createSGrModbusDevice("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");

        if (expect.equals(Expect.ERROR)) {
            assertThrows(GenDriverException.class, () -> device.checkOutOfRange(values, limit, comparator));
        } else {
            assertDoesNotThrow(() -> device.checkOutOfRange(values, limit, comparator));
        }
    }

    @Test
    void getDeviceInfo() throws GenDriverException {

        var device = createSGrModbusDevice("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        var deviceInfo = device.getDeviceInfo();

        assertEquals("WAGOMeterV0.2.1", deviceInfo.getName());
        assertEquals(DeviceCategory.SUB_METER_ELECTRICITY, deviceInfo.getDeviceCategory());
        assertEquals(InterfaceType.MODBUS, deviceInfo.getInterfaceType());
        assertEquals("1.0.0", deviceInfo.getHardwareVersion());
        assertEquals("1.0.0", deviceInfo.getSoftwareVersion());
        assertEquals(OperationEnvironment.LOCAL, deviceInfo.getOperationEnvironment());
        assertEquals("WAGO", deviceInfo.getManufacturer());

        List<GenericAttribute> expectedAttributes = new ArrayList<>();
        expectedAttributes.add(createGenericAttributeProduct(
                "SpecialQualityRequirement",
                "METAS",
                V0Package.DATA_TYPE_PRODUCT__STRING,
                Units.NONE,
                new ArrayList<>()));

        expectedAttributes.add(createGenericAttributeProduct(
                "Curtailment",
                "40.5f",
                V0Package.DATA_TYPE_PRODUCT__FLOAT32,
                Units.PERCENT,
                new ArrayList<>()));

        var assistsAttr = createGenericAttributeProduct("assists", "TNO", V0Package.DATA_TYPE_PRODUCT__STRING, Units.NONE, null);
        var obligedToAttr = createGenericAttributeProduct("obligedTo", "SHALL", V0Package.DATA_TYPE_PRODUCT__STRING, Units.NONE, null);
        List<GenericAttribute> children = new ArrayList<>();
        children.add(assistsAttr);
        children.add(obligedToAttr);

        expectedAttributes.add(createGenericAttributeProduct(
                "FlexDirManagement",
                null,
                -1,
                null,
                children));

        List<GenericAttribute> deviceGenericAttributes = deviceInfo.getGenericAttributes();
        assertArrayEquals(expectedAttributes.toArray(), deviceGenericAttributes.toArray());

        checkFunctionalProfiles(deviceInfo.getFunctionalProfiles());

    }


    @Test
    void getDeviceInfoDeviceData() throws GenDriverException {

        var device = createSGrModbusDevice("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        var deviceInfo = device.getDeviceInfo();

        assertEquals( "WAGOMeterV0.2.1", deviceInfo.getName());
        assertEquals("WAGO", deviceInfo.getManufacturer());
        assertEquals(DeviceCategory.SUB_METER_ELECTRICITY, deviceInfo.getDeviceCategory());
        assertEquals( "0.2.3", deviceInfo.getVersionNumber());
        assertEquals( "1.0.0", deviceInfo.getHardwareVersion());
        assertEquals( "1.0.0", deviceInfo.getSoftwareVersion());
        assertEquals( InterfaceType.MODBUS, deviceInfo.getInterfaceType());
        assertEquals( OperationEnvironment.LOCAL, deviceInfo.getOperationEnvironment());
    }

    @Test
    void getFunctionalProfiles() throws Exception {

        var device = createSGrModbusDevice("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        var functionalProfiles = device.getFunctionalProfiles();

        checkFunctionalProfiles(functionalProfiles);
    }

    @Test
    void getFunctionalProfile() throws Exception {
        var device = createSGrModbusDevice("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        var functionalProfile = device.getFunctionalProfile("VoltageAC");
        checkFunctionalProfileDetailsVoltageAC(functionalProfile);
    }

    @Test
    void getDataPoint() throws Exception {
        var device = createSGrModbusDevice("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        var dataPoint = device.getDataPoint("VoltageAC", "VoltageL1");
        checkVoltageL1DataPoint(dataPoint);
    }

    @Test
    void getConfiguration() throws Exception {
        var device = createSGrRestApiDevice("SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");
        var configuration = device.getDeviceConfigurationInfo();
        checkBaseUriConfigList(configuration);
    }

    @Test
    void getDeviceInfoWithConfiguration() throws Exception {
        var device = createSGrRestApiDevice("SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");
        var deviceInfo = device.getDeviceInfo();
        var configurationInfo = deviceInfo.getConfigurationInfo();
        checkBaseUriConfigList(configurationInfo);
    }

    private void checkVoltageACProfile(FunctionalProfile profile) {
        // check data points
        Set<String> expectedDataPointNames = new HashSet<>();
        expectedDataPointNames.add("VoltageL1");
        expectedDataPointNames.add("VoltageL2");
        expectedDataPointNames.add("VoltageL3");
        expectedDataPointNames.add("VoltageACL1-L2");
        expectedDataPointNames.add("VoltageACL1-L3");
        expectedDataPointNames.add("VoltageACL2-L3");
        profile.getDataPoints().forEach(dataPoint -> {
            if (dataPoint.getName().equals("VoltageL1")) {
                checkFunctionalProfileDetailsVoltageAC(profile);
                checkVoltageL1DataPoint(dataPoint);
            }
            expectedDataPointNames.remove(dataPoint.getName());
        });
        assertTrue(expectedDataPointNames.isEmpty());

        checkVoltageACProfileGenericAttributes(profile);
    }

    private void checkVoltageACProfileGenericAttributes(FunctionalProfile profile) {

       var genericAttributes = profile.getGenericAttributes();

       assertEquals(1, genericAttributes.size());

       var genAttr = genericAttributes.stream().findFirst().orElseGet(() -> fail("Functional Profile's GenericAttribute is missing"));
       assertEquals("LoadReduction", genAttr.getName());
       assertEquals("FLOAT32", genAttr.getDataType());
       assertEquals(Units.PERCENT, genAttr.getUnit());
       assertEquals(20.5, genAttr.getValue().getFloat32());
    }

    private void checkFunctionalProfiles(List<FunctionalProfile> functionalProfiles) {
        Set<String> expectedProfileNames = new HashSet<>();
        expectedProfileNames.add("VoltageAC");
        expectedProfileNames.add("Frequency");
        expectedProfileNames.add("CurrentAC");
        expectedProfileNames.add("ActivePowerAC");
        expectedProfileNames.add("ReactivePowerAC");
        expectedProfileNames.add("ApparentPowerAC");
        expectedProfileNames.add("PowerFactor");
        expectedProfileNames.add("ActiveEnergyAC");
        expectedProfileNames.add("ReactiveEnergyAC");
        expectedProfileNames.add("ActiveEnerBalanceAC");
        expectedProfileNames.add("ReactiveEnerBalanceAC");
        expectedProfileNames.add("PowerQuadrant");
        expectedProfileNames.add("CurrentDirection");
        functionalProfiles.forEach(functionalProfile -> {
            if (functionalProfile.getName().equals("VoltageAC")) {
                checkVoltageACProfile(functionalProfile);
            }
            expectedProfileNames.remove(functionalProfile.getName());
        });
        // all profiles are reported
        assertTrue(expectedProfileNames.isEmpty());
    }

    private void checkFunctionalProfileDetailsVoltageAC(FunctionalProfile functionalProfile) {
        assertEquals("VoltageAC", functionalProfile.getProfileType());
        assertEquals("VoltageAC", functionalProfile.getName());
        assertEquals(FunctionalProfileCategory.SUB_METER_ELECTRICITY, functionalProfile.getCategory());
    }

    private void checkVoltageL1DataPoint(DataPoint dataPoint) {
        assertEquals("VoltageL1", dataPoint.getName());
        assertEquals("FLOAT64", dataPoint.getDataType());
        assertEquals(0.005, dataPoint.getMinimumValue());
        assertEquals(380.0, dataPoint.getMaximumValue());
        assertEquals(DataDirectionProduct.RW, dataPoint.getPermissions());
        assertEquals(1, dataPoint.getArrayLen());

        var expectedGenAttr =  createGenericAttributeProduct("PrecisionPercent", "2.2", V0Package.DATA_TYPE_PRODUCT__FLOAT32, Units.PERCENT, new ArrayList<>());
        var resultGenAttr = dataPoint.getGenericAttributes();
        assertTrue(resultGenAttr.stream().findFirst().isPresent());
        assertEquals(expectedGenAttr, resultGenAttr.stream().findFirst().get());
    }

    private void checkBaseUriConfigList(List<ConfigurationValue> configurationValues) {

        var configRecord = configurationValues.stream().findFirst();
        assertTrue(configRecord.isPresent());
        assertEquals("baseUri", configRecord.get().getName());
        assertEquals("STRING", configRecord.get().getDataType());

        assertEquals("The base URI to connect to the service", configRecord.get().getDescriptions().get(Language.EN));
        assertEquals("Die Basis-URI des service", configRecord.get().getDescriptions().get(Language.DE));
    }

    @SuppressWarnings("SameParameterValue")
    private static SGrModbusDevice createSGrModbusDevice(String deviceDescriptionXml) {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL devDescUrl = classloader.getResource(deviceDescriptionXml);

        DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
        DeviceFrame devDesc = loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""));

        return new SGrModbusDevice(devDesc, (GenDriverAPI4Modbus) null);
    }

    @SuppressWarnings("SameParameterValue")
    private static SGrRestApiDevice createSGrRestApiDevice(String deviceDescriptionXml) throws Exception {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL devDescUrl = classloader.getResource(deviceDescriptionXml);

        DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
        DeviceFrame devDesc = loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""));
        return new SGrRestApiDevice(devDesc, new ApacheRestServiceClientFactory());

    }

    private GenericAttribute createGenericAttributeProduct(
            String name, String value, int dataTypeConst, Units unit, List<GenericAttribute> children) {

        var dataType = V0Factory.eINSTANCE.createDataTypeProduct();
        if (dataTypeConst >= 0) {
            dataType.eSet(dataType.eClass().getEStructuralFeature(dataTypeConst), V0Factory.eINSTANCE.createEmptyType());
        } else {
            dataType = null;
        }

        return new GenericAttribute(
                name,
                value,
                dataType,
                unit,
                children);
    }

}
