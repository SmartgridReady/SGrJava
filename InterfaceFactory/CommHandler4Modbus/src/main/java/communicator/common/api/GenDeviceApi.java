package communicator.common.api;

import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.rest.exception.RestApiResponseParseException;
import communicator.rest.exception.RestApiServiceCallException;

import java.io.IOException;
import java.util.List;

public interface GenDeviceApi {

    List<GenericAttribute> getGenAttributes(String profileName, String dataPointName) throws GenDriverException;
    Value getVal(String profileName, String dataPointName) throws
            GenDriverException, GenDriverSocketException, GenDriverModbusException,
            RestApiServiceCallException, RestApiResponseParseException, IOException;

    void setVal(String profileName, String dataPointName, Value value) throws
            GenDriverException, GenDriverSocketException, GenDriverModbusException,
            RestApiServiceCallException, RestApiResponseParseException, IOException;
}
