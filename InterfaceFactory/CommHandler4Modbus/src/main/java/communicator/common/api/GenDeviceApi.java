package communicator.common.api;

import com.smartgridready.ns.v0.GenericAttributes;
import communicator.common.runtime.GenDriverException;

import java.util.Map;

public interface GenDeviceApi {

    Map<String, String> getGenAttributes(String profileName, String dataPointName) throws GenDriverException;
    GenericAttributes getGenAttributesByGDPType(String profileName, String dataPointName) throws GenDriverException;
}
