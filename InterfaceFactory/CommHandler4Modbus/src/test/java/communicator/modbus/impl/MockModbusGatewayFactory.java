package communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverException;
import communicator.modbus.api.ModbusGatewayFactory;
import communicator.modbus.api.ModbusGateway;
import communicator.modbus.helper.GenDriverAPI4ModbusRTUMock;
import communicator.modbus.helper.ModbusUtil;

public class MockModbusGatewayFactory implements ModbusGatewayFactory {

    @Override
    public ModbusGateway create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        String identifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);
        return new ModbusGateway(identifier, interfaceDescription, new GenDriverAPI4ModbusLegacyWrapper(new GenDriverAPI4ModbusRTUMock()));
    }
}
