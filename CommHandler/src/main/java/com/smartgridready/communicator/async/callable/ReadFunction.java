package com.smartgridready.communicator.async.callable;

import com.smartgridready.driver.modbus.api.GenDriverException;
import com.smartgridready.driver.modbus.api.GenDriverModbusException;
import com.smartgridready.driver.modbus.api.GenDriverSocketException;
import com.smartgridready.communicator.rest.exception.RestApiAuthenticationException;
import com.smartgridready.communicator.rest.exception.RestApiResponseParseException;
import com.smartgridready.communicator.rest.exception.RestApiServiceCallException;

import java.io.IOException;

public interface ReadFunction<R> {
    R apply(String functionalProfile, String dataPoint) throws
            GenDriverException, GenDriverModbusException, GenDriverSocketException, IOException,
            RestApiServiceCallException, RestApiAuthenticationException, RestApiResponseParseException;
}
