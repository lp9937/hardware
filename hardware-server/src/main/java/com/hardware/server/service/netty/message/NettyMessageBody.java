package com.hardware.server.service.netty.message;

import io.netty.buffer.ByteBuf;

public abstract class NettyMessageBody{
    private ByteBuf body;

    public ByteBuf getBody() {
        return body;
    }

    public NettyMessageBody setBody(ByteBuf body) {
        this.body = body;
        return this;
    }
}
