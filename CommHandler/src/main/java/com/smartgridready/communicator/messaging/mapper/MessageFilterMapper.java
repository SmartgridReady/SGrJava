package com.smartgridready.communicator.messaging.mapper;


import com.smartgridready.ns.v0.MessageFilter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MessageFilterMapper {
    MessageFilterMapper INSTANCE = Mappers.getMapper( MessageFilterMapper.class );
    com.smartgridready.driver.api.messaging.model.filter.MessageFilter mapToDriverApi(MessageFilter messageFilter);
}
