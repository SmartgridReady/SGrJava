package com.smartgridready.communicator.contacts.impl;

import java.util.Optional;
import java.util.Properties;

import com.smartgridready.ns.v0.ContactFunctionalProfile;
import com.smartgridready.ns.v0.ContactInterface;
import com.smartgridready.ns.v0.DataPointBase;
import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.communicator.common.api.values.Value;
import com.smartgridready.communicator.common.impl.SGrDeviceBase;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.contacts.GenDriverAPI4Contacts;
import com.smartgridready.driver.api.contacts.GenDriverAPI4ContactsFactory;

public class SGrContactsDevice extends SGrDeviceBase<
        DeviceFrame,
        ContactFunctionalProfile,
        DataPointBase> {

    private GenDriverAPI4Contacts aDriver;

    public SGrContactsDevice(DeviceFrame deviceDescription, GenDriverAPI4ContactsFactory aDriverFactory) {
        super(deviceDescription);

        this.aDriver = aDriverFactory.create(
            getContactInterface().getContactInterfaceDescription().getNumberOfContacts(),
            getContactInterface().getContactInterfaceDescription().getContactStabilisationTimeMs()
        );
    }

    @Override
    public Value getVal(String profileName, String dataPointName) throws GenDriverException {
        DataPointBase dataPoint = findDatapoint(profileName, dataPointName);
        checkReadWritePermission(dataPoint, RwpDirections.READ);

        // TODO implement solution that reads value depending on DP name (since entirely device-specific)
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public Value getVal(String profileName, String dataPointName, Properties parameters)
            throws GenDriverException {
        return getVal(profileName, dataPointName);
    }

    @Override
    public void setVal(String profileName, String dataPointName, Value value)
            throws GenDriverException {
        DataPointBase dataPoint = findDatapoint(profileName, dataPointName);
        checkReadWritePermission(dataPoint, RwpDirections.WRITE);

        // TODO implement solution that writes value depending on DP name (since entirely device-specific)
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public void connect() throws GenDriverException {
        aDriver.connect();
    }

    @Override
    public void disconnect() throws GenDriverException {
        aDriver.disconnect();
    }

    @Override
    public boolean isConnected() {
        return aDriver.isConnected();
    }

    @Override
    protected Optional<ContactFunctionalProfile> findProfile(String profileName) {
        return getContactInterface().getFunctionalProfileList().getFunctionalProfileListElement().stream()
                .filter(functionalProfile -> functionalProfile.getFunctionalProfile().getFunctionalProfileName().equals(profileName))
                .findFirst();
    }

    @Override
    protected Optional<DataPointBase> findDataPointForProfile(ContactFunctionalProfile functionalProfile,
            String datapointName) {
        return functionalProfile.getDataPointList().getDataPointListElement().stream()
            .filter(dataPoint -> dataPoint.getDataPoint().getDataPointName().equals(datapointName))
            .findFirst();
    }

    private ContactInterface getContactInterface() {
        return Optional.ofNullable(device.getInterfaceList().getContactInterface()).orElseThrow(() -> new IllegalArgumentException("No contact interface defined in EI-XML"));
    }
}
