package com.hardware.server.service.netty.message;

import com.hardware.server.service.netty.coder.INettyTcpMessageDecoder;
import io.netty.buffer.ByteBuf;

public abstract class NettyMessageBody implements INettyTcpMessageDecoder {
    private ByteBuf body;

    public ByteBuf getBody() {
        return body;
    }

    public NettyMessageBody setBody(ByteBuf body) {
        this.body = body;
        return this;
    }
}
