package com.smartgridready.communicator.messaging.mapper;

import com.smartgridready.ns.v0.MessagingInterfaceDescription;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {BrokerListMapper.class})
public interface MessagingInterfaceDescMapper {
    MessagingInterfaceDescMapper INSTANCE = Mappers.getMapper( MessagingInterfaceDescMapper.class );

    @Mapping(target = "messagingPlatformType", expression = "java( PlatformTypeMapper.mapToDriverApi(source.getPlatform()) )")
    com.smartgridready.driver.api.messaging.model.MessagingInterfaceDescription mapToDriverApi(MessagingInterfaceDescription source);
}
