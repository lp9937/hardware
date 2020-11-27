package com.hardware.server.service.netty.handler;

import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.netty.message.AbstractNettyMessage;

public interface IMessageHandler {
    void handle(AbstractNettyMessage message);
    CommandEnum getCommand();
    CommandEnum getReqCommand();
}
