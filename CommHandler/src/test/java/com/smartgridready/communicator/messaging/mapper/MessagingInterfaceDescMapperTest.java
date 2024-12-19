package com.smartgridready.communicator.messaging.mapper;

import com.smartgridready.ns.v0.MessagingInterfaceDescription;
import com.smartgridready.ns.v0.MessagingPlatformType;
import com.smartgridready.ns.v0.ObjectFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessagingInterfaceDescMapperTest {

    private static final boolean IS_TLS = true;
    private static final boolean IS_VERIFY_CERT = true;
    private static final String  PORT = "8080";
    private static final String  HOST = "localhost";
    private static final String  USERNAME = "joe";
    private static final String  PASSWORD = "1234";
    private static final String  CLIENT_ID = "9999";
    private static final String KEY_STORE_PATH = "keystorepath";
    private static final String KEY_STORE_PW = "keystorepw";
    private static final String  TRUST_STORE_PATH = "trustpath";
    private static final String  TRUST_STORE_PW = "truststorepw";

    private static final ObjectFactory objectFactory = new ObjectFactory();

    @Test
    void messagInterfaceDescMapper() {

        var interfaceDescription = createMessagingInterfaceDescription();

        var result = MessagingInterfaceDescMapper.INSTANCE.mapToDriverApi(interfaceDescription);

        assertEquals(CLIENT_ID, result.getClientId());
        assertEquals(HOST, result.getMessageBrokerList().get(0).getHost());
        assertEquals(PORT, result.getMessageBrokerList().get(0).getPort());
        assertEquals(IS_TLS, result.getMessageBrokerList().get(0).isTls());
        assertEquals(IS_VERIFY_CERT, result.getMessageBrokerList().get(0).isTlsVerifyCertificate());

        var messageBrokerAuth = result.getMessageBrokerAuthentication();
        assertEquals(USERNAME, messageBrokerAuth.getBasicAuthentication().getUsername());
        assertEquals(PASSWORD,messageBrokerAuth.getBasicAuthentication().getPassword());
        assertEquals(KEY_STORE_PATH, messageBrokerAuth.getClientCertificateAuthentication().getKeystorePath());
        assertEquals(KEY_STORE_PW, messageBrokerAuth.getClientCertificateAuthentication().getKeystorePassword());
        assertEquals(TRUST_STORE_PATH, messageBrokerAuth.getClientCertificateAuthentication().getTruststorePath());
        assertEquals(TRUST_STORE_PW, messageBrokerAuth.getClientCertificateAuthentication().getTruststorePassword());
    }

    private MessagingInterfaceDescription createMessagingInterfaceDescription() {

        var messagingInterfaceDescription = objectFactory.createMessagingInterfaceDescription();

        var messageBrokerListElement = objectFactory.createMessageBrokerListElement();
        messageBrokerListElement.setTls("true");
        messageBrokerListElement.setTlsVerifyCertificate("true");
        messageBrokerListElement.setPort("8080");
        messageBrokerListElement.setHost("localhost");

        var messageBrokerList = objectFactory.createMessageBrokerList();
        messageBrokerList.getMessageBrokerListElement().add(messageBrokerListElement);
        messagingInterfaceDescription.setMessageBrokerList(messageBrokerList);

        var messageBrokerAuthenticationBasic = objectFactory.createMessageBrokerAuthenticationBasic();
        messageBrokerAuthenticationBasic.setUsername("joe");
        messageBrokerAuthenticationBasic.setPassword("1234");

        var messageBrokerAuthenticationClientCert = objectFactory.createMessageBrokerAuthenticationClientCertificate();
        messageBrokerAuthenticationClientCert.setKeystorePath(KEY_STORE_PATH);
        messageBrokerAuthenticationClientCert.setKeystorePassword(KEY_STORE_PW);
        messageBrokerAuthenticationClientCert.setTruststorePath(TRUST_STORE_PATH);
        messageBrokerAuthenticationClientCert.setTruststorePassword(TRUST_STORE_PW);

        var messageBrokerAuthentication = objectFactory.createMessageBrokerAuthentication();
        messageBrokerAuthentication.setBasicAuthentication(messageBrokerAuthenticationBasic);
        messageBrokerAuthentication.setClientCertificateAuthentication(messageBrokerAuthenticationClientCert);
        messagingInterfaceDescription.setMessageBrokerAuthentication(messageBrokerAuthentication);

        messagingInterfaceDescription.setPlatform(MessagingPlatformType.MQTT_5);
        messagingInterfaceDescription.setClientId("9999");

        return messagingInterfaceDescription;
    }

}
