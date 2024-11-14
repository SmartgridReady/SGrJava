package com.smartgridready.driver.api.contacts;

import com.smartgridready.driver.api.common.GenDriverException;

public interface GenDriverAPI4Contacts {

    boolean connect() throws GenDriverException;

    void disconnect() throws GenDriverException;

    boolean isConnected();

    // TODO add actual read and write methods
}
