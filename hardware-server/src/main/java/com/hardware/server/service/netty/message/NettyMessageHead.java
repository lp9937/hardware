package com.hardware.server.service.netty.message;

import com.hardware.server.service.netty.coder.INettyTcpMessageDecoder;
import io.netty.buffer.ByteBuf;

public abstract class NettyMessageHead implements INettyTcpMessageDecoder {
    private ByteBuf head;

    public ByteBuf getHead() {
        return head;
    }

    public NettyMessageHead setHead(ByteBuf head) {
        this.head = head;
        return this;
    }
}
