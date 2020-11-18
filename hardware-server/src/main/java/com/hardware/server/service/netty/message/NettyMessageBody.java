package com.hardware.server.service.netty.message;

import io.netty.buffer.ByteBuf;

public class NettyMessageBody {
    private ByteBuf body;

    public ByteBuf getBody() {
        return body;
    }

    public void setBody(ByteBuf body) {
        this.body = body;
    }
}
