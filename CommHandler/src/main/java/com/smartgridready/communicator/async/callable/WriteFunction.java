package com.smartgridready.communicator.async.callable;

import com.smartgridready.driver.modbus.api.GenDriverException;
import com.smartgridready.driver.modbus.api.GenDriverModbusException;
import com.smartgridready.driver.modbus.api.GenDriverSocketException;
import com.smartgridready.communicator.rest.exception.RestApiAuthenticationException;
import com.smartgridready.communicator.rest.exception.RestApiResponseParseException;
import com.smartgridready.communicator.rest.exception.RestApiServiceCallException;

import java.io.IOException;

@FunctionalInterface
public interface WriteFunction<V> {
    void apply(String functionalProfile, String dataPoint, V value) throws
            GenDriverException, GenDriverModbusException, GenDriverSocketException, IOException,
            RestApiServiceCallException, RestApiAuthenticationException, RestApiResponseParseException;
}
