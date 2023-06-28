/**
Copyright(c) 2022 Verein SmartGridready Switzerland

This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from
this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package communicator.modbus.api;

import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import communicator.common.api.GenDeviceApi;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;

/**
 * The API defines read and write operations for SmartGridReady devices.
 * The values can be provided as {@link String} or {@link SGrBasicGenDataPointTypeType}
 * The implementing device will convert the data to their modbus format.
 *
 */
public interface GenDeviceApi4Modbus extends GenDeviceApi {

    /**
     * Read a numeric or string value read a from a modbus device register.
     * Numeric values read from the device are converted to their String representations.
     * 
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @return The value converted to {@link java.lang.String}
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     */
    String getVal(String profileName, String dataPointName)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Write a numeric or string value to a modbus register.
     * Numeric values are converted from their String representation to the numeric format as defined in the
     * external interface XML for the given datapoint.
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @param value The value in string representation.
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     */
    String  setVal(String profileName, String dataPointName, String value)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Read a value from the modbus device in its generic datapoint representation (see {@link SGrBasicGenDataPointTypeType}).
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @return The value converted to {@link java.lang.String}
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     *
     * @see SGrBasicGenDataPointTypeType
     */
    SGrBasicGenDataPointTypeType getValByGDPType(String profileName, String dataPointName)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Write a value to the modbus device using the generic datapoint representation (see {@link SGrBasicGenDataPointTypeType}).
     * The value is converted from the format given within the {@code value} parameter to the value required
     * by the modbus device (as defined within the external interface XML of the device).
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @param value The value as {@link SGrBasicGenDataPointTypeType}
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     *
     * @see SGrBasicGenDataPointTypeType
     */
    void setValByGDPType(String profileName, String dataPointName, SGrBasicGenDataPointTypeType value)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Read an array of numeric or string values from the modbus device. The values are converted to their string
     * representation.
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @return The values read from the device in their string representation.
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     */
    String[] getValArr(String profileName, String dataPointName)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Read an array of numeric or string values from the modbus device. The values are converted to their
     * generic datapoint representation as defined within the external interface XML (see {@link SGrBasicGenDataPointTypeType}).
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @return The values in their {@link SGrBasicGenDataPointTypeType} representation.
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     */
    SGrBasicGenDataPointTypeType[] getValArrByGDPType(String profileName, String dataPointName)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Write an array of values to the modbus device. The values are converted from their string
     * representation to the modbus format as defined within the external interface XML for the given
     * datapoint.
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @param values The values in their string representation.
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     */
    void setValArr(String profileName, String dataPointName, String[] values)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;

    /**
     * Write an array of value to the modbus device. The values are converted from generic datatype
     * representation to the modbus format as defined within the external interface XML for the given
     * datapoint.
     *
     * @param profileName The name of the functional profile.
     * @param dataPointName The name of the datapoint.
     * @param values The values in their {@link SGrBasicGenDataPointTypeType} representation.
     * @throws GenDriverException If a general exception occurred.
     * @throws GenDriverSocketException In case of communication errors with the modbus device.
     * @throws GenDriverModbusException If the modbus command could not be interpreted/executed on the device.
     */
    void setValArrByGDPType(String profileName, String dataPointName, SGrBasicGenDataPointTypeType[] values)
            throws GenDriverException, GenDriverSocketException, GenDriverModbusException;
}
