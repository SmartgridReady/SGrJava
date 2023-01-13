package communicator.helper;

import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;

public class ModbusReader {

    public static ModbusReaderResponse read(GenDriverAPI4Modbus drv4Modbus,
    										TEnumObjectType regType,
    										int regAddr,
                                            boolean isFirstRegAddrOne,
                                            int length)
            throws GenDriverException, GenDriverModbusException, GenDriverSocketException {

        ModbusReaderResponse response= new ModbusReaderResponse();
     
        if (isFirstRegAddrOne) {
            regAddr = regAddr - 1;
        }

        if (TEnumObjectType.HOLD_REGISTER == regType) {
            response.setMbregresp(drv4Modbus.ReadHoldingRegisters(regAddr, length));
        } else if (TEnumObjectType.INPUT_REGISTER == regType) {
            response.setMbregresp(drv4Modbus.ReadInputRegisters(regAddr, length));
        } else if (TEnumObjectType.DISCRETE_INPUT == regType) {
            response.setMbbitresp(drv4Modbus.ReadDiscreteInputs(regAddr, length));
        } else if (TEnumObjectType.COIL == regType) {
            response.setMbbitresp(drv4Modbus.ReadCoils(regAddr, length));
        } else {
            throw new GenDriverException("ModbusReader, unhandled register type requested.");
        }
        return response;
    }

}
