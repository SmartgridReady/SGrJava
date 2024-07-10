package communicator.common.api.dto;

import com.smartgridready.ns.v0.DeviceCategory;

import java.util.List;

public class DeviceInfo {

    private final String name;
    private final String versionNumber;
    private final String manufacturer;
    private final String softwareVersion;
    private final String hardwareVersion;
    private final DeviceCategory deviceCategory;

    private final InterfaceType interfaceType;

    private final OperationEnvironment operationEnvironment;

    private final List<GenericAttribute> genericAttributes;

    private final List<ConfigurationValue> configurationInfo;

    private final List<FunctionalProfile> functionalProfiles;

    @SuppressWarnings("java:S107")
    public DeviceInfo(String name,
                      String manufacturer,
                      String versionNumber,
                      String softwareVersion,
                      String hardwareVersion,
                      DeviceCategory deviceCategory,
                      InterfaceType interfaceType,
                      OperationEnvironment operationEnvironment,
                      List<GenericAttribute> genericAttributes,
                      List<ConfigurationValue> configurationInfo,
                      List<FunctionalProfile> functionalProfiles) {

        this.name = name;
        this.manufacturer = manufacturer;
        this.versionNumber = versionNumber;
        this.softwareVersion = softwareVersion;
        this.hardwareVersion = hardwareVersion;
        this.deviceCategory = deviceCategory;
        this.interfaceType = interfaceType;
        this.operationEnvironment = operationEnvironment;
        this.genericAttributes = genericAttributes;
        this.configurationInfo = configurationInfo;
        this.functionalProfiles = functionalProfiles;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getVersionNumber() { return versionNumber; }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public DeviceCategory getDeviceCategory() {
        return deviceCategory;
    }

    public InterfaceType getInterfaceType() {
        return interfaceType;
    }

    public OperationEnvironment getOperationEnvironment() {
        return operationEnvironment;
    }

    public List<GenericAttribute> getGenericAttributes() {
        return genericAttributes;
    }

    public List<ConfigurationValue> getConfigurationInfo() {
        return configurationInfo;
    }

    public List<FunctionalProfile> getFunctionalProfiles() {
        return functionalProfiles;
    }
}
