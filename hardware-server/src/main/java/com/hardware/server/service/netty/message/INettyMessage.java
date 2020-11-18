package com.hardware.server.service.netty.message;

import com.hardware.server.service.IHardwareType;

public interface INettyMessage<H extends NettyMessageHead,
        B extends NettyMessageBody> extends IHardwareType {
    H getMessageHead();
    B getMessageBody();
}
