package com.smartgridready.communicator.messaging.mapper;

import com.smartgridready.driver.api.messaging.model.MessageBroker;
import com.smartgridready.ns.v0.MessageBrokerList;

import java.util.ArrayList;
import java.util.List;

public class BrokerListMapper {

    List<MessageBroker> mapToDriverApi(MessageBrokerList messageBrokerList) {
        List<MessageBroker> result = new ArrayList<>();
        messageBrokerList.getMessageBrokerListElement().forEach(messageBroker ->
                result.add(MessageBrokerMapper.INSTANCE.mapToDriverApi(messageBroker))
        );
        return result;
    }
}
