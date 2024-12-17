package com.smartgridready.driver.api.messaging;

import java.util.Set;

import com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription;
import com.smartgridready.driver.api.messaging.model.MessagingPlatformType;

/**
 * Interface to be used to create smartgridready messaging clients.
 */
@SuppressWarnings("unused")
public interface GenMessagingClientFactory {

    /**
     * Factory method to create a new instance of the smartgridready messaging client.
     *
     * @param interfaceDescription Describes the messaging interface and it's parameters.
     * @return A new messaging client instance.
     */
    GenMessagingClient create(MessagingInterfaceDescription interfaceDescription);

    /**
     * Gets the messaging platforms supported by the implementation.
     * @return a set of platform types
     */
    Set<MessagingPlatformType> getSupportedPlatforms();
}
