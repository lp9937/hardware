package com.hardware.server.service.netty.session.dispatcher;

import com.hardware.server.service.netty.message.AbstractNettyMessage;
import io.netty.channel.Channel;

public interface IDispatcher {
    void dispatch(AbstractNettyMessage message, Channel channel);
}
