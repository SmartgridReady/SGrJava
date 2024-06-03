package communicator.modbus.helper;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.transport.ModbusGatewayRegistry;

public class ModbusGatewayRegistryMock implements ModbusGatewayRegistry {

    private final GenDriverAPI4ModbusRTUMock mock;

    public ModbusGatewayRegistryMock() {
        mock = new GenDriverAPI4ModbusRTUMock();
    }

    public void setIsIntegerType(boolean returnInteger) {
        mock.setIsIntegerType(returnInteger);
    }

    @Override
    public GenDriverAPI4Modbus attachGateway(ModbusInterfaceDescription interfaceDescription)
            throws GenDriverException {
        return mock;
    }

    @Override
    public void detachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        // nothing
    }

    @Override
    public void detachAllGateways() {
        // nothing
    }
}
