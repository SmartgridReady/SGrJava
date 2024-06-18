package communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.api.ModbusGatewayFactory;
import communicator.modbus.helper.ModbusType;
import communicator.modbus.helper.ModbusUtil;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;


public class DefaultModbusGatewayFactory implements ModbusGatewayFactory {

    @Override
    public GenDriverAPI4Modbus create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        // distinguish RTU or TCP protocol
        ModbusType modbusType = ModbusUtil.getModbusType(interfaceDescription);
        if (modbusType == ModbusType.RTU) {
            return new GenDriverAPI4ModbusRTU();  
        } else if (modbusType == ModbusType.TCP) {
            return new GenDriverAPI4ModbusTCP();
        }

        throw new GenDriverException(String.format("Unsupported Modbus type %s", modbusType));
    }
}
