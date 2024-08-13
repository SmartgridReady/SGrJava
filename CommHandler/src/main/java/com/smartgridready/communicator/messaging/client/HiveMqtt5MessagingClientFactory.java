package com.smartgridready.communicator.messaging.client;

import com.smartgridready.driver.api.messaging.GenMessagingClientFactory;
import com.smartgridready.ns.v0.MessagingInterfaceDescription;
import com.smartgridready.ns.v0.MessagingPlatformType;

public class HiveMqtt5MessagingClientFactory implements GenMessagingClientFactory {

    public HiveMqtt5MessagingClient create(MessagingInterfaceDescription interfaceDescription) {

        if (interfaceDescription.getPlatform() == null) {
            throw new IllegalArgumentException("No messaging platform defined in EI-XML");
        }

        if (interfaceDescription.getMessageBrokerList().getMessageBrokerListElement().isEmpty()) {
            throw new IllegalArgumentException("No message broker defined in EI-XML");
        }

        if (interfaceDescription.getPlatform() != MessagingPlatformType.MQTT5) {
            throw new IllegalArgumentException(
                    "Wrong client factory provided (supporting MQTT5). " +
                            "Please use a messaging client factory that supports " +
                            interfaceDescription.getPlatform().getName());
        }
        return new HiveMqtt5MessagingClient(interfaceDescription);
    }
}
