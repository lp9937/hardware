package com.hardware.server.service.netty.session.dispatcher;

import com.hardware.common.constant.HardwareConstant;
import com.hardware.server.service.netty.handler.IHardwareHandler;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import com.hardware.server.service.netty.register.MessageHandlerRegistryService;
import com.hardware.server.service.netty.session.ISession;
import com.hardware.server.service.netty.tcp.service.DefaultSessionService;
import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DefaultDispatcher implements IDispatcher {
    @Autowired
    private DefaultSessionService sessionService;
    @Autowired
    private MessageHandlerRegistryService<?> messageHandlerRegistryService;
    @Override
    public void dispatch(AbstractNettyMessage message, Channel channel) {
        //获取会话id
        long sessionId=channel
                .attr(HardwareConstant.CHANNEL_SESSION_ID).get();
        ISession session=sessionService.get(sessionId);
        if(session==null){
            log.error("session is null,channelId is:"+channel.id().asLongText());
            return;
        }
        message.setAttribute(HardwareConstant.ATTRIBUTE_SESSION_KEY,session);
        IHardwareHandler handler = messageHandlerRegistryService.getHandler(
                message.getHardwareType().getCode());
        handler.add(message);
    }
}
