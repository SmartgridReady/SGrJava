package com.smartgridready.communicator.messaging.client;

import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.MqttGlobalPublishFilter;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.datatypes.MqttTopic;
import com.hivemq.client.mqtt.mqtt5.Mqtt5AsyncClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5Client;
import com.hivemq.client.mqtt.mqtt5.Mqtt5ClientBuilder;
import com.hivemq.client.mqtt.mqtt5.message.publish.Mqtt5Publish;
import com.hivemq.client.mqtt.mqtt5.message.publish.Mqtt5PublishResult;
import com.hivemq.client.mqtt.mqtt5.message.subscribe.suback.Mqtt5SubAck;
import com.hivemq.client.mqtt.mqtt5.message.unsubscribe.unsuback.Mqtt5UnsubAck;
import com.smartgridready.communicator.common.helper.JsonHelper;
import com.smartgridready.driver.api.messaging.GenMessagingClient;
import com.smartgridready.driver.api.messaging.Message;
import com.smartgridready.ns.v0.JMESPathFilterType;
import com.smartgridready.ns.v0.MessageBrokerAuthentication;
import com.smartgridready.ns.v0.MessageBrokerAuthenticationBasic;
import com.smartgridready.ns.v0.MessageBrokerListElement;
import com.smartgridready.ns.v0.MessageFilter;

import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.ns.v0.MessagingInterfaceDescription;
import io.vavr.control.Either;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.OperationNotSupportedException;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.hivemq.client.mqtt.MqttGlobalPublishFilter.ALL;

public class HiveMqtt5MessagingClient implements GenMessagingClient {

    private static final Logger LOG = LoggerFactory.getLogger(HiveMqtt5MessagingClient.class);
    private static final String MESSAGE_LOG_TEMPLATE ="Received topic={} message={} client={}";

    private final MessagingInterfaceDescription interfaceDescription;

    private final Mqtt5BlockingClient syncClient;

    private final Mqtt5AsyncClient asyncClient;

    public HiveMqtt5MessagingClient(MessagingInterfaceDescription messagingInterfaceDesc) {
        this.interfaceDescription = messagingInterfaceDesc;

        syncClient = createClient().toBlocking();
        syncClient.connect();

        asyncClient = createClient().toAsync();
        asyncClient.connectWith().send().join();
    }

    @Override
    public void sendSync(String topic, Message message) {
        sendSync(topic, message, syncClient);
        syncClient.unsubscribeWith().topicFilter(topic).send();
    }

    private static void sendSync(String topic, Message message, Mqtt5BlockingClient syncClient) {
        Mqtt5PublishResult publish = syncClient.publishWith()
                .topic(topic)
                .qos(MqttQos.EXACTLY_ONCE)
                .payload(Optional.ofNullable(message.getPayload()).orElse("").getBytes(StandardCharsets.UTF_8))
                .send();

        if (LOG.isInfoEnabled()) {
            LOG.info("MQTT message send result: Topic={} payload={} status={}",
                    topic,
                    message.getPayload(),
                    publish.getError().map(Throwable::getMessage).orElse("OK"));
        }
    }


    @Override
    public Either<Throwable, Message> readSync(
            String  readCmdMessageTopic,
            Message readCmdMessage,
            String inMessageTopic,
            MessageFilter messageFilter,
            long timeoutSec) {

        // Validate the message payload filter.
        try {
            validateMessagePayloadFilter(messageFilter);
        } catch (OperationNotSupportedException | IllegalArgumentException e) {
            return (Either.left(e));
        }

        // Subscribe to the inMessageTopic
        Mqtt5SubAck res = syncClient.subscribeWith().topicFilter(inMessageTopic).send();
        if (res.getReasonString().isPresent()) {
            return Either.left(new GenDriverException("Unable to subscribe to inMessageTopic=" + inMessageTopic + ", " + res.getReasonString()));
        }
        // Prepare future for receiving the response message.
        CompletableFuture<Either<Throwable, Message>> readFuture = CompletableFuture.supplyAsync(
                () -> receiveResponseMessage(inMessageTopic, messageFilter, timeoutSec, syncClient));

        // Now send the read command message
        sendSync(readCmdMessageTopic, readCmdMessage, syncClient);

        // and wait for the response message
        try {
            return readFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            Thread.currentThread().interrupt();
            return Either.left(e);
        } finally {
            syncClient.unsubscribeWith()
                    .topicFilter(readCmdMessageTopic)
                    .addTopicFilter(inMessageTopic)
                    .send();
        }
    }

    private Either<Throwable, Message> receiveResponseMessage(String topic, MessageFilter messageFilter, long timeoutSec, Mqtt5BlockingClient syncClient) {

        try (Mqtt5BlockingClient.Mqtt5Publishes publishes = syncClient.publishes(MqttGlobalPublishFilter.ALL, true)) {

            Mqtt5Publish mqtt5Publish = null;
            while (mqtt5Publish==null) {
                try {
                    Optional<Mqtt5Publish> received = publishes.receive(timeoutSec, TimeUnit.MILLISECONDS);
                    received.ifPresent(this::logReceivedMessage);

                    if (received.isEmpty()) {
                        return Either.left(new TimeoutException("Timeout received while waiting for message on topic=" + topic));
                    }

                    mqtt5Publish = received
                            .filter(publish -> publish.getTopic().equals(MqttTopic.of(topic)))
                            .filter(publish -> isMessagePayloadFilterMatch(publish, messageFilter))
                            .orElse(null);

                    if (mqtt5Publish != null) {
                        mqtt5Publish.acknowledge();
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("Message {} did match filter.", new String(received.get().getPayloadAsBytes(), StandardCharsets.UTF_8));
                        }
                    } else {
                        LOG.debug("Message did not match filter.");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    LOG.error("Thread waiting for message from topic {} has been interrupted", topic, e);
                    return Either.left(e);
                }
            }
            return Either.right(Message.of(new String(mqtt5Publish.getPayloadAsBytes(), StandardCharsets.UTF_8)));
        }
    }


    @Override
    public CompletableFuture<Either<Throwable, Void>> sendAsynch(String topic, Message message) {

        return asyncClient.publishWith()
                .topic(topic)
                .qos(MqttQos.EXACTLY_ONCE)
                .payload(Optional.ofNullable(message.getPayload()).orElse("").getBytes(StandardCharsets.UTF_8))
                .send()
                .thenApply( result -> {
                    if (result.getError().isPresent()) {
                        LOG.error("Send message '{}' asysnc failed. {}", message.getPayload(), result.getError().get());
                        return Either.left(result.getError().get());
                    }
                    LOG.debug("Send message '{}' OK", message.getPayload());
                    return Either.right(null);
                });
    }

    @Override
    public void subscribe(String topic, MessageFilter messageFilter, Consumer<Either<Throwable, Message>> callback) throws GenDriverException {

        CompletableFuture<Mqtt5SubAck> asyncRes = asyncClient.subscribeWith()
                .topicFilter(topic)
                .qos(MqttQos.AT_LEAST_ONCE)
                .send()
                .whenComplete((subAck, subException) -> {
                    if (subException!=null) {
                        LOG.error("MQTT subscribe failed", subException);
                        callback.accept(Either.left(subException));
                    } else {
                        LOG.info("Subscription to topic {} successful.", topic);
                        asyncClient.publishes(ALL,
                                publish -> {
                                    logReceivedMessage(publish);
                                    Optional.of(publish)
                                            .filter(p -> MqttTopic.of(topic).equals(p.getTopic()))
                                            .filter(p -> isMessagePayloadFilterMatch(publish, messageFilter))
                                            .ifPresent(p -> {
                                                if (LOG.isDebugEnabled()) {
                                                    LOG.debug("Topic={} did match topic={}", publish.getTopic(), topic);
                                                }
                                                String receivedMessage = new String(publish.getPayloadAsBytes(), StandardCharsets.UTF_8);
                                                callback.accept(Either.right(Message.of(receivedMessage)));
                                            });
                                });
                    }
                });

        handleAsyncResult(asyncRes);
    }

    @Override
    public void unsubscribe(String topic) throws GenDriverException {

        CompletableFuture<Mqtt5UnsubAck> asyncResult = asyncClient.unsubscribeWith().topicFilter(topic).send();
        handleAsyncResult(asyncResult);
    }

    @SuppressWarnings("java:S112") // Just throwing out of the lambda to catch and convert outside.
    private void handleAsyncResult(CompletableFuture<?> asyncResult) throws GenDriverException {

        try {
            asyncResult.whenComplete(((o, throwable) -> {
                if (throwable!=null) {
                    throw new RuntimeException(throwable);
                }
            })).join();
        } catch (Exception e) {
            throw new GenDriverException(e.getCause());
        }
    }

    private boolean isMessagePayloadFilterMatch(Mqtt5Publish publish, MessageFilter messageFilter) {
        String payload = new String(publish.getPayloadAsBytes(), StandardCharsets.UTF_8);
        return isMessagePayloadFilterMatch(payload, messageFilter);
    }

    private Mqtt5Client createClient() {

        // HiveMqtt5MessagingClientFactory ensures the at least one broker is configured.
        MessageBrokerListElement messageBroker
            = interfaceDescription.getMessageBrokerList().getMessageBrokerListElement().get(0);

        Mqtt5ClientBuilder clientBuilder = MqttClient.builder()
                .serverHost(messageBroker.getHost())
                .serverPort(Integer.parseInt(messageBroker.getPort()))
                .useMqttVersion5();

        if (interfaceDescription.getClientId() != null) {
            clientBuilder = clientBuilder.identifier(interfaceDescription.getClientId());
        }


        if (messageBroker.isTls() && messageBroker.isTlsVerifyCertificate()) {
            // enable certificate verification with default trust manager
            clientBuilder = clientBuilder.sslWithDefaultConfig();
            LOG.debug("SSL default config");
        } else if (messageBroker.isTls()) {
            // remove trust manager, no verification
            clientBuilder = clientBuilder
                    .sslConfig()
                    .hostnameVerifier(NonValidatingHostnameVerifier.getInstance())
                    .trustManagerFactory(NonValidatingTrustManagerFactory.getInstance())
                    .applySslConfig();
            LOG.debug("SSL config without certificate validation");
        }

        MessageBrokerAuthentication messageBrokerAuthentication = interfaceDescription.getMessageBrokerAuthentication();
        if (messageBrokerAuthentication.getBasicAuthentication() != null) {
            MessageBrokerAuthenticationBasic basicAuth = messageBrokerAuthentication.getBasicAuthentication();
            clientBuilder.simpleAuth()
                    .username(basicAuth.getUsername())
                    .password(basicAuth.getPassword().getBytes(StandardCharsets.UTF_8))
                    .applySimpleAuth();
        }

        return clientBuilder.build();
    }

    /**
     * Checks if a message payload filter is present and returns true if no filter is present
     * or the message matches the filter criteria.
     *
     * @param payload The received message payload
     * @param messageFilter Payload filter for messages to be processed.
     * @return {@code true} if the message payload matches the filter.
     */
    static boolean isMessagePayloadFilterMatch(String payload, MessageFilter messageFilter) {

        if (messageFilter == null) {
            return true;    // always match
        }
        if (payload == null) {
            return false;    // no match
        }

        String regex = ".";
        if (messageFilter.getJmespathFilter() != null) {
            try {
                JMESPathFilterType filter = messageFilter.getJmespathFilter();
                regex = filter.getMatchesRegex();
                payload = JsonHelper.parseJsonResponse(filter.getQuery(), payload).getString();
            } catch (GenDriverException e) {
                return false; // no match
            }
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(payload);
        return matcher.find();
    }

    static void validateMessagePayloadFilter(MessageFilter messageFilter) throws OperationNotSupportedException {

        if (messageFilter == null) {
            return; // null means no-filter, that's fine
        }
        if (messageFilter.getRegexFilter() != null) {
            throw new OperationNotSupportedException("Regex message filter not supported yet.");
        }
        if (messageFilter.getXpapathFilter() != null) {
            throw new OperationNotSupportedException("Xpath message filter not supported yet.");
        }
    }

    private void logReceivedMessage(Mqtt5Publish publish) {
        LOG.debug(MESSAGE_LOG_TEMPLATE,
                publish.getTopic(),
                new String(publish.getPayloadAsBytes(), StandardCharsets.UTF_8),
                syncClient.hashCode());
    }

    @Override
    public void close() {
        syncClient.disconnect();
        asyncClient.disconnect();
    }
}
