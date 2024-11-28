package com.smartgridready.driver.api.contacts;

public interface GenDriverAPI4ContactsFactory {

    public GenDriverAPI4Contacts create(int nrOfContacts);
    
    public GenDriverAPI4Contacts create(int nrOfContacts, long stabilizationTimeMs);
}
