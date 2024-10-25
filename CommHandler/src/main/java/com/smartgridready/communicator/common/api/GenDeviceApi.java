package com.smartgridready.communicator.common.api;

import com.smartgridready.communicator.common.api.dto.ConfigurationValue;
import com.smartgridready.communicator.common.api.dto.DataPoint;
import com.smartgridready.communicator.common.api.dto.DataPointValue;
import com.smartgridready.communicator.common.api.dto.DeviceInfo;
import com.smartgridready.communicator.common.api.dto.FunctionalProfile;
import com.smartgridready.communicator.common.api.values.Value;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.modbus.GenDriverModbusException;
import com.smartgridready.driver.api.modbus.GenDriverSocketException;

import io.vavr.control.Either;

import com.smartgridready.communicator.rest.exception.RestApiResponseParseException;
import com.smartgridready.communicator.rest.exception.RestApiServiceCallException;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public interface GenDeviceApi {

    /**
     * Get a value for a given data point
     * @param profileName The functional profile name
     * @param dataPointName The data point name
     * @return The value read from the device
     * @throws GenDriverException Generic error while reading from the device
     * @throws GenDriverSocketException A connection error occurred
     * @throws GenDriverModbusException The modbus command returned an error code
     * @throws RestApiServiceCallException The REST API service call failed
     * @throws RestApiResponseParseException The REST API response could not be parsed
     * @throws IOException Generic communication exception occurred
     */
    Value getVal(String profileName, String dataPointName) throws
            GenDriverException, GenDriverSocketException, GenDriverModbusException,
            RestApiServiceCallException, RestApiResponseParseException, IOException;

    /**
     * Set a value for a given data point
     * @param profileName The functional profile name
     * @param dataPointName The data point name
     * @param value The value to be set
     * @throws GenDriverException Generic error while reading from the device
     * @throws GenDriverSocketException A connection error occurred
     * @throws GenDriverModbusException The modbus command returned an error code
     * @throws RestApiServiceCallException The REST API service call failed
     * @throws RestApiResponseParseException The REST API response could not be parsed
     * @throws IOException Generic communication exception occurred
     */
    void setVal(String profileName, String dataPointName, Value value) throws
            GenDriverException, GenDriverSocketException, GenDriverModbusException,
            RestApiServiceCallException, RestApiResponseParseException, IOException;

    List<DataPointValue> getValues() throws GenDriverException;

    DeviceInfo getDeviceInfo() throws GenDriverException;

    List<ConfigurationValue> getDeviceConfigurationInfo();

    List<FunctionalProfile> getFunctionalProfiles() throws GenDriverException;

    FunctionalProfile getFunctionalProfile(String functionalProfileName) throws GenDriverException;

    List<DataPoint> getDataPoints(String functionalProfileName) throws GenDriverException;

    DataPoint getDataPoint(String functionalProfileName, String dataPointName) throws GenDriverException;

    void connect() throws GenDriverException;

    void disconnect() throws GenDriverException;

    /**
     * Subscribes to messages that are related to the given datapoint
     *
     * @param profileName The functional profile name
     * @param dataPointName The data point name
     * @param callbackFunction A callback function that provides the received value
     * @throws GenDriverException if an error occurs
     */
    void subscribe(String profileName, String dataPointName, Consumer<Either<Throwable, Value>> callbackFunction) throws GenDriverException;

    /**
     * Unsubscribes from messages that are related to a given datapoint
     *
     * @param profileName The functional profile name
     * @param dataPointName The datapoint name
     * @throws GenDriverException if an error occurs
     */
    void unsubscribe(String profileName, String dataPointName) throws GenDriverException;

    boolean canSubscribe();
}
