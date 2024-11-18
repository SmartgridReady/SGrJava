package com.smartgridready.driver.api.contacts;

import com.smartgridready.driver.api.common.GenDriverException;

public interface GenDriverAPI4Contacts {

    boolean connect() throws GenDriverException;

    void disconnect() throws GenDriverException;

    boolean isConnected();

    boolean[] readContacts(String functionalProfileName, String dataPointName) throws GenDriverException;

    void writeContacts(String functionalProfileName, String dataPointName, boolean[] values) throws GenDriverException;
}
