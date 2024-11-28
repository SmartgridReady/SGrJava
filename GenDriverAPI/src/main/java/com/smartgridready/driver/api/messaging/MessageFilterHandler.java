package com.smartgridready.driver.api.messaging;

import javax.naming.OperationNotSupportedException;

/**
 * A handler for message filters. Optionally sent by communicator.
 */
public interface MessageFilterHandler {
    
    /**
     * Matches the filter against the message payload.
     * @param payload the message payload
     * @return true if match, false otherwise
     */
    public boolean isFilterMatch(String payload);

    /**
     * Checks if the filter is valid.
     */
    public void validate() throws OperationNotSupportedException;
}
