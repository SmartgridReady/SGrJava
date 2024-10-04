package com.smartgridready.communicator.messaging.mapper;

import com.smartgridready.ns.v0.MessageBrokerListElement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MessageBrokerMapper {
    MessageBrokerMapper INSTANCE = Mappers.getMapper( MessageBrokerMapper.class );
    com.smartgridready.driver.api.messaging.model.MessageBroker mapToDriverApi(MessageBrokerListElement messageBroker);
}
