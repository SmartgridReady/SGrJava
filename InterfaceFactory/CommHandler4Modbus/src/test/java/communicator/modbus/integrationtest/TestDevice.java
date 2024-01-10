package communicator.modbus.integrationtest;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.RegisterType;
import communicator.common.helper.DataTypeHelper;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.modbus.impl.SGrModbusDevice;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;
import io.vavr.Tuple2;
import io.vavr.Tuple3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;

public class TestDevice {

    private SGrModbusDevice testSystem;

    private DeviceFrame deviceDescriptor;

    public static class DataPointDescriptor {

        public String functionalProfile;
        public String dataPoint;
        public boolean isReadable;
        public boolean isWritable;
        public RegisterType registerType;
        public DataTypeProduct genericType;
        public ModbusDataType modbusType;

        @Override
        public String toString() {
            return "FP=" + functionalProfile +
                    " DP=" + dataPoint + " "
                    + (isReadable ? "R" : "") + " "
                    + (isWritable ? "W" : "") + " "
                    + registerType.name()
                    + " GenType=" + DataTypeHelper.getGenDataTypeName(genericType)
                    + " ModbusType=" + DataTypeHelper.getModbusDataTypeName(modbusType);
        }
    }

    protected void init() throws Exception {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL propertyUrl = classloader.getResource("wago-testsystem.properties");
        if (propertyUrl==null) {
            throw new IOException("Resource file 'wago-testsystem.properties' not found.");
        }

        Properties properties = new Properties();
        properties.load(new FileInputStream(propertyUrl.getPath()));
        String testsystemIp = properties.getProperty("wagosystem.ip");
        String testsystemPort = properties.getProperty("wagosystem.port");
        String deviceDescriptionFile = properties.getProperty("ei-xml.filename");

        URL deviceDescriptionUrl = classloader.getResource(deviceDescriptionFile);
        if (deviceDescriptionUrl==null) {
            throw new IOException(String.format("Resource file %s not found.", deviceDescriptionFile));
        }

        DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
        deviceDescriptor = loader.load("", deviceDescriptionUrl.getPath());

        GenDriverAPI4Modbus driver = new GenDriverAPI4ModbusTCP();
        driver.initDevice(testsystemIp, Integer.parseInt(testsystemPort));
        driver.setUnitIdentifier((short) 1);

        testSystem = new SGrModbusDevice(deviceDescriptor, driver);
    }

    public void loadDeviceDescriptionFile(
            File file,
            Function<String, Tuple2<String, Integer>> getIpConnParams,
            Function<String, Tuple3<String, Integer, Integer>> getComPortConnParams ) throws Exception {

        String filePath = file.getPath().replace("\\", "/");
        deviceDescriptor = new DeviceDescriptionLoader<DeviceFrame>().load("", filePath);

        if (deviceDescriptor.getInterfaceList().getModbusInterface().getModbusInterfaceDescription().getModbusTcp() != null) {
            GenDriverAPI4Modbus driver = new GenDriverAPI4ModbusTCP();
            Tuple2<String, Integer> connParams = getIpConnParams.apply("Enter IP Address and Port");
            driver.initDevice(connParams._1, connParams._2 );
            testSystem = new SGrModbusDevice(deviceDescriptor,driver );
        }
        if (deviceDescriptor.getInterfaceList().getModbusInterface().getModbusInterfaceDescription().getModbusRtu() != null) {
            GenDriverAPI4Modbus driver = new GenDriverAPI4ModbusRTU();
            Tuple3<String, Integer, Integer> connParams = getComPortConnParams.apply("Enter COMx port, baud rate and modbus identifier.");
            driver.initTrspService(connParams._1, connParams._2);
            driver.setUnitIdentifier(connParams._3.shortValue());
            testSystem = new SGrModbusDevice(deviceDescriptor, driver);
        }
    }

    public SGrModbusDevice getTestSystem() {
        return testSystem;
    }

    public List<DataPointDescriptor> getDataPoints() {

        List<DataPointDescriptor> dataPoints = new ArrayList<>();

        deviceDescriptor.getInterfaceList().getModbusInterface().getFunctionalProfileList()
                .getFunctionalProfileListElement().forEach(fp -> {
                    String fpName = fp.getFunctionalProfile().getFunctionalProfileName();
                    fp.getDataPointList().getDataPointListElement().forEach(dp -> {
                            DataPointDescriptor dpDesc = new DataPointDescriptor();
                            dpDesc.functionalProfile = fpName;
                            dpDesc.dataPoint = dp.getDataPoint().getDataPointName();
                            dpDesc.isReadable = dp.getDataPoint().getDataDirection().getLiteral().contains("R");
                            dpDesc.isWritable = dp.getDataPoint().getDataDirection().getLiteral().contains("W");
                            dpDesc.registerType = dp.getModbusDataPointConfiguration().getRegisterType();
                            dpDesc.genericType = dp.getDataPoint().getDataType();
                            dpDesc.modbusType = dp.getModbusDataPointConfiguration().getModbusDataType();
                            dataPoints.add(dpDesc);
                    });
                });

        return dataPoints;
    }
}
