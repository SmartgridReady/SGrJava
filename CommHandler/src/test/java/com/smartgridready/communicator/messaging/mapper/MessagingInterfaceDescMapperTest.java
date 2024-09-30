package com.smartgridready.communicator.messaging.mapper;

import com.smartgridready.ns.v0.MessageFilter;
import com.smartgridready.ns.v0.MessagingInterfaceDescription;
import com.smartgridready.ns.v0.MessagingPlatformType;
import com.smartgridready.ns.v0.V0Factory;
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

    private static final String JMES_REGEX_EXPR = "regexexpr";
    private static final String JMES_QUERY = "jmesquery";
    private static final String PLAINTEXT_REGEX = "plainregex";
    private static final String XPATH_REGEX = "xpathregex";
    private static final String XPATH_QUERY = "xpathquery";

    @Test
    void messageFilterMapper() {

        var messageFilter = createMessageFilter();

        var result = MessageFilterMapper.INSTANCE.mapToDriverApi(messageFilter);

        assertEquals(JMES_QUERY, result.getJmespathFilter().getQuery());
        assertEquals(JMES_REGEX_EXPR, result.getJmespathFilter().getMatchesRegex());
        assertEquals(PLAINTEXT_REGEX, result.getPlaintextFilter().getMatchesRegex());
        assertEquals(XPATH_REGEX, result.getXpapathFilter().getMatchesRegex());
        assertEquals(XPATH_QUERY, result.getXpapathFilter().getQuery());
    }

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

    private MessageFilter createMessageFilter() {

        var messageFilter = V0Factory.eINSTANCE.createMessageFilter();

        var jmesPathFilter = V0Factory.eINSTANCE.createJMESPathFilterType();
        jmesPathFilter.setMatchesRegex(JMES_REGEX_EXPR);
        jmesPathFilter.setQuery(JMES_QUERY);
        messageFilter.setJmespathFilter(jmesPathFilter);

        var plaintextFilter = V0Factory.eINSTANCE.createPlaintextFilterType();
        plaintextFilter.setMatchesRegex(PLAINTEXT_REGEX);
        messageFilter.setPlaintextFilter(plaintextFilter);

        var xpathFilter = V0Factory.eINSTANCE.createXPathFilterType();
        xpathFilter.setMatchesRegex(XPATH_REGEX);
        xpathFilter.setQuery(XPATH_QUERY);
        messageFilter.setXpapathFilter(xpathFilter);

        return messageFilter;
    }

    private MessagingInterfaceDescription createMessagingInterfaceDescription() {

        var messagingInterfaceDescription = V0Factory.eINSTANCE.createMessagingInterfaceDescription();

        var messageBrokerListElement = V0Factory.eINSTANCE.createMessageBrokerListElement();
        messageBrokerListElement.setTls(true);
        messageBrokerListElement.setTlsVerifyCertificate(true);
        messageBrokerListElement.setPort("8080");
        messageBrokerListElement.setHost("localhost");

        var messageBrokerList = V0Factory.eINSTANCE.createMessageBrokerList();
        messageBrokerList.getMessageBrokerListElement().add(messageBrokerListElement);
        messagingInterfaceDescription.setMessageBrokerList(messageBrokerList);

        var messageBrokerAuthenticationBasic = V0Factory.eINSTANCE.createMessageBrokerAuthenticationBasic();
        messageBrokerAuthenticationBasic.setUsername("joe");
        messageBrokerAuthenticationBasic.setPassword("1234");

        var messageBrokerAuthenticationClientCert = V0Factory.eINSTANCE.createMessageBrokerAuthenticationClientCertificate();
        messageBrokerAuthenticationClientCert.setKeystorePath(KEY_STORE_PATH);
        messageBrokerAuthenticationClientCert.setKeystorePassword(KEY_STORE_PW);
        messageBrokerAuthenticationClientCert.setTruststorePath(TRUST_STORE_PATH);
        messageBrokerAuthenticationClientCert.setTruststorePassword(TRUST_STORE_PW);

        var messageBrokerAuthentication = V0Factory.eINSTANCE.createMessageBrokerAuthentication();
        messageBrokerAuthentication.setBasicAuthentication(messageBrokerAuthenticationBasic);
        messageBrokerAuthentication.setClientCertificateAuthentication(messageBrokerAuthenticationClientCert);
        messagingInterfaceDescription.setMessageBrokerAuthentication(messageBrokerAuthentication);

        messagingInterfaceDescription.setPlatform(MessagingPlatformType.MQTT_5);
        messagingInterfaceDescription.setClientId("9999");

        return messagingInterfaceDescription;
    }

}
