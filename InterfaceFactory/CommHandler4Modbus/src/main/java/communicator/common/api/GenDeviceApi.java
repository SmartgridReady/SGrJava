package communicator.common.api;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import communicator.common.runtime.GenDriverException;

import java.util.Map;

public interface GenDeviceApi {

    Map<String, String> getGenAttributes(String profileName, String dataPointName) throws GenDriverException;
    SGrAttr4GenericType getGenAttributesByGDPType(String profileName, String dataPointName) throws GenDriverException;
}
