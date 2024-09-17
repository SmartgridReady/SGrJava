package com.smartgridready.communicator.common.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.FunctionalProfileBase;
import com.smartgridready.communicator.common.api.dto.InterfaceType;
import com.smartgridready.ns.v0.ModbusFunctionalProfileList;

import java.util.List;

class DeviceWithInterface {

    private final InterfaceType interfaceType;

    private final List<? extends FunctionalProfileBase> functionalProfiles;

    private DeviceWithInterface(DeviceFrame device) {

        if (device.getInterfaceList().getModbusInterface() != null) {
            interfaceType = InterfaceType.MODBUS;
            functionalProfiles = device.getInterfaceList().getModbusInterface().getFunctionalProfileList().getFunctionalProfileListElement();
        }
        else if (device.getInterfaceList().getRestApiInterface() != null) {
            interfaceType = InterfaceType.RESTAPI;
            functionalProfiles = device.getInterfaceList().getRestApiInterface().getFunctionalProfileList().getFunctionalProfileListElement();
        }
        else if (device.getInterfaceList().getMessagingInterface() != null) {
            interfaceType = InterfaceType.MESSAGING;
            functionalProfiles = device.getInterfaceList().getMessagingInterface().getFunctionalProfileList().getFunctionalProfileListElement();
        }
        else if (device.getInterfaceList().getContactInterface() != null) {
            interfaceType = InterfaceType.CONTACT;
            functionalProfiles = device.getInterfaceList().getContactInterface().getFunctionalProfileList().getFunctionalProfileListElement();
        }
        else if (device.getInterfaceList().getGenericInterface() != null) {
            interfaceType = InterfaceType.GENERIC;
            functionalProfiles = device.getInterfaceList().getGenericInterface().getFunctionalProfileList().getFunctionalProfileListElement();
        }
        else {
            interfaceType = InterfaceType.UNKNOWN;
            functionalProfiles = new ModbusFunctionalProfileList().getFunctionalProfileListElement();
        }
    }

    @SuppressWarnings("unchecked")
    public List<FunctionalProfileBase> getFunctionalProfiles() {
        return (List<FunctionalProfileBase>)functionalProfiles;
    }

    public InterfaceType getInterfaceType() {
        return interfaceType;
    }

    public static DeviceWithInterface of(DeviceFrame device) {
        return new DeviceWithInterface(device);
    }


}
