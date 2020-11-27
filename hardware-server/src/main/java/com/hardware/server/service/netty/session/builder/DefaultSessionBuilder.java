package com.hardware.server.service.netty.session.builder;

import com.hardware.common.constant.HardwareConstant;
import com.hardware.server.service.netty.session.DefaultSession;
import io.netty.channel.Channel;
import io.netty.util.Attribute;
import org.springframework.stereotype.Component;

@Component
public class DefaultSessionBuilder implements ISessionBuilder<DefaultSession> {
    @Override
    public DefaultSession build(Channel channel) {
        DefaultSession session=new DefaultSession(channel);
        Attribute<Long> attribute=channel.attr(HardwareConstant.CHANNEL_SESSION_ID);
        attribute.set(session.getSessionId());
        return session;
    }
}
