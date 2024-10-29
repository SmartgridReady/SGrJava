package com.smartgridready.communicator.messaging.client;

import com.smartgridready.communicator.common.helper.DriverFactoryLoader;
import com.smartgridready.communicator.messaging.mapper.MessageFilterMapper;
import com.smartgridready.communicator.messaging.mapper.MessagingInterfaceDescMapper;
import com.smartgridready.driver.api.messaging.model.Message;
import com.smartgridready.driver.api.messaging.GenMessagingClient;
import com.smartgridready.driver.api.messaging.GenMessagingClientFactory;
import com.smartgridready.ns.v0.JMESPathFilterType;
import com.smartgridready.ns.v0.MessageBrokerAuthentication;
import com.smartgridready.ns.v0.MessageBrokerAuthenticationBasic;
import com.smartgridready.ns.v0.MessageBrokerList;
import com.smartgridready.ns.v0.MessageBrokerListElement;
import com.smartgridready.ns.v0.MessageFilter;
import com.smartgridready.ns.v0.MessagingInterfaceDescription;
import com.smartgridready.ns.v0.MessagingPlatformType;
import com.smartgridready.ns.v0.XPathFilterType;
import io.vavr.control.Either;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Mqtt5GenMessagingClientTest {

    private static final Logger LOG = LoggerFactory.getLogger(Mqtt5GenMessagingClientTest.class);

    private static final String TEST_TOPIC = "sensors/temperature";

    private static final String TEST_TOPIC_2 = "sensors/humidity";

    private static final String BROKER_HOST = "152f30e8c480481886072e4f8250d91a.s1.eu.hivemq.cloud";

    private static final int BROKER_PORT = 8883;

    private static final boolean BROKER_TLS = true;

    private static final boolean BROKER_TLS_VERIFY = false;

    private static final String BROKER_USER = "smartgrid";

    private static final String BROKER_PASSWORD = "1SmartGrid!";

    @Test
    void sendReceiveSync() throws Exception {

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {

            // Set up a thread with a blocking receiver for the message.
            Either<Throwable, Message> result = client.readSync(
                    TEST_TOPIC, Message.of("50K"), TEST_TOPIC, null, 10000);

            assertTrue(result.isRight());

            assertEquals("50K",result.get().

            getPayload());
        }
    }

    @Test
    void sendReceiveSyncWithTopicFilter() throws Exception{

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {

            CompletableFuture<Either<Throwable, Message>> asyncMsgSender1 = CompletableFuture.supplyAsync(() ->
                    client.readSync(TEST_TOPIC, Message.of("50K"), TEST_TOPIC, null, 2000));

            CompletableFuture<Either<Throwable, Message>> asyncMsgSender2 = CompletableFuture.supplyAsync(() ->
                    client.readSync(TEST_TOPIC, Message.of("50K"), TEST_TOPIC_2, null, 2000));

            // check futureTopic2 first. Should not receive message from topic one
            Either<Throwable, Message> resultTopic2 = asyncMsgSender2.join();
            assertTrue(resultTopic2.isLeft());

            Either<Throwable, Message> resultTopic1 = asyncMsgSender1.join();
            assertTrue(resultTopic1.isRight());
            assertEquals("50K", resultTopic1.get().getPayload());
        }
    }

    @Disabled("This test has timing issues and is not reliable yet")
    @Test
    void sendReceiveSyncWithMessageFilter() throws Exception {

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {

            MessageFilter messageFilter1 = createMessageFilter("1");
            MessageFilter messageFilter2 = createMessageFilter("2");

            // Perform the two reads in parallel
            CompletableFuture<Either<Throwable, Message>> futureFilter1 = CompletableFuture.supplyAsync(() ->
                    client.readSync(
                            TEST_TOPIC,
                            Message.of("{ \"sensorId\": 1, \"value\": \"50K\" }"),
                            TEST_TOPIC,
                            MessageFilterMapper.INSTANCE.mapToDriverApi(messageFilter1),
                            1000));

            CompletableFuture<Either<Throwable, Message>> futureFilter2 = CompletableFuture.supplyAsync(() ->
                    client.readSync(
                            TEST_TOPIC,
                            Message.of("{ \"sensorId\": 2, \"value\": \"100K\" }"),
                            TEST_TOPIC,
                            MessageFilterMapper.INSTANCE.mapToDriverApi( messageFilter2),
                            2000));

            // futureFilter1 should receive sensorId=1 message only
            Either<Throwable, Message> result1 = futureFilter1.join();
            LOG.info("Result for filter1: {}", result1.isLeft() ? result1.getLeft().getMessage() : result1.get().getPayload());
            assertTrue(result1.isRight());
            assertEquals("{ \"sensorId\": 1, \"value\": \"50K\" }", result1.get().getPayload());

            // futureFilter2 should receive sensorId=2 message only
            Either<Throwable, Message> result2 = futureFilter2.join();
            LOG.info("Result for filter2: {}", result2.isLeft() ? result2.getLeft().getMessage() : result2.get().getPayload());
            assertTrue(result2.isRight());
            assertEquals("{ \"sensorId\": 2, \"value\": \"100K\" }", result2.get().getPayload());
        }
    }

    @Test
    void sendAndReceiveSyncTimeout() throws Exception {

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {

            Either<Throwable, Message> future = client.readSync(TEST_TOPIC, Message.of("50K"), TEST_TOPIC_2, null, 1000);
            // no message sent to topic
            assertInstanceOf(TimeoutException.class, future.getLeft());
        }
    }

    @Test
    void sendAndReceiveSyncUnsupportedFilter() throws Exception {

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {
            MessageFilter messageFilter = new MessageFilter();
            XPathFilterType xPathFilter = new XPathFilterType();
            messageFilter.setXpapathFilter(xPathFilter);

            Either<Throwable, Message> future = client.readSync(
                    TEST_TOPIC, Message.of("Hello"),
                    TEST_TOPIC,
                    MessageFilterMapper.INSTANCE.mapToDriverApi(messageFilter), 1);

            client.sendSync(TEST_TOPIC, Message.of("Hello"));

            assertInstanceOf(OperationNotSupportedException.class, future.getLeft());
        }
    }

    @Test
    void sendReceiveAsynch() throws Exception {

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {

            CompletableFuture<Either<Throwable, Message>> future = new CompletableFuture<>();
            client.subscribe(TEST_TOPIC, null, future::complete);

            CompletableFuture<Either<Throwable, Void>> sendAck = client.sendAsynch(TEST_TOPIC, Message.of("46 Kelvin"));
            sendAck.get();

            Awaitility.await().until(() -> {
                Either<Throwable, Message> result = future.get();
                assertTrue(result.isRight());
                assertEquals("46 Kelvin", result.get().getPayload());
                return true;
            });
        }
    }

    @Test
    void sendReceiveAsynchWithMessageFilter() throws Exception {

        com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription ifDesc = createMessagingInterfaceDescription();
        GenMessagingClientFactory factory = DriverFactoryLoader.getMessagingDriver(ifDesc.getMessagingPlatformType());
        try (GenMessagingClient client = factory.create(ifDesc)) {

            MessageFilter messageFilter1 = createMessageFilter("1");
            MessageFilter messageFilter2 = createMessageFilter("2");

            List<String> sensor1Results = new ArrayList<>();
            List<String> sensor2Results = new ArrayList<>();

            client.subscribe(TEST_TOPIC, MessageFilterMapper.INSTANCE.mapToDriverApi(messageFilter1), (resp ->
                    sensor1Results.add(
                            resp.getOrElseGet(t -> Message.of(t.getMessage())).getPayload())));

            client.subscribe(TEST_TOPIC, MessageFilterMapper.INSTANCE.mapToDriverApi(messageFilter2), (resp ->
                    sensor2Results.add(
                            resp.getOrElseGet(t -> Message.of(t.getMessage())).getPayload())));

            CompletableFuture<Void> writeSensor1 = CompletableFuture.runAsync(() -> {
                for (int i = 0; i < 20; i++) {
                    try {
                        client.sendSync(TEST_TOPIC, Message.of("{ \"sensorId\": 1, \"value\": \"50K\" }"));
                    } catch (Exception e) {
                        LOG.error("setVal() Safe current failed", e);
                    }
                }
            });

            CompletableFuture<Void> writeSensor2 = CompletableFuture.runAsync(() -> {
                for (int i = 0; i < 20; i++) {
                    try {
                        client.sendSync(TEST_TOPIC, Message.of("{ \"sensorId\": 2, \"value\": \"100K\" }"));
                    } catch (Exception e) {
                        LOG.error("setVal() Receive time failed", e);
                    }
                }
            });

            writeSensor1.join();
            writeSensor2.join();

            Awaitility.await().until(() -> sensor1Results.size()==20 && sensor2Results.size()==20);
        }
    }

    private com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription createMessagingInterfaceDescription() {

        var interfaceDesc = new MessagingInterfaceDescription();
        interfaceDesc.setPlatform(MessagingPlatformType.MQTT_5);

        var messageBrokerList = new MessageBrokerList();
        var messageBrokerListElem = new MessageBrokerListElement();
        messageBrokerListElem.setTls(BROKER_TLS);
        messageBrokerListElem.setHost(BROKER_HOST);
        messageBrokerListElem.setPort(String.valueOf(BROKER_PORT));
        messageBrokerListElem.setTlsVerifyCertificate(BROKER_TLS_VERIFY);
        messageBrokerList.getMessageBrokerListElement().add(messageBrokerListElem);
        interfaceDesc.setMessageBrokerList(messageBrokerList);

        var messageBrokerAuthentication = new MessageBrokerAuthentication();
        var messageBrokerAuthenticationBasic = new MessageBrokerAuthenticationBasic();
        messageBrokerAuthenticationBasic.setUsername(BROKER_USER);
        messageBrokerAuthenticationBasic.setPassword(BROKER_PASSWORD);
        messageBrokerAuthentication.setBasicAuthentication(messageBrokerAuthenticationBasic);
        interfaceDesc.setMessageBrokerAuthentication(messageBrokerAuthentication);

        return MessagingInterfaceDescMapper.INSTANCE.mapToDriverApi(interfaceDesc);
    }

    private MessageFilter createMessageFilter(String matchesRegex) {

        MessageFilter messageFilter = new MessageFilter();
        JMESPathFilterType jmesPathFilter = new JMESPathFilterType();
        jmesPathFilter.setQuery("sensorId");
        jmesPathFilter.setMatchesRegex(matchesRegex);
        messageFilter.setJmespathFilter(jmesPathFilter);
        return messageFilter;
    }
}
