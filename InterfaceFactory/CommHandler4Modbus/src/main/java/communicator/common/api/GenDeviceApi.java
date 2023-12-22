package communicator.common.api;

import communicator.common.runtime.GenDriverException;

import java.util.List;

public interface GenDeviceApi {

    List<GenericAttribute> getGenAttributes(String profileName, String dataPointName) throws GenDriverException;
}
