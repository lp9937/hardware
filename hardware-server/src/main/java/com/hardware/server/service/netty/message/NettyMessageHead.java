package com.hardware.server.service.netty.message;

import io.netty.buffer.ByteBuf;

public abstract class NettyMessageHead{
    private ByteBuf head;

    public ByteBuf getHead() {
        return head;
    }

    public NettyMessageHead setHead(ByteBuf head) {
        this.head = head;
        return this;
    }

    public abstract NettyMessageHead setLength(int length);

    public abstract NettyMessageHead decoder();

    public abstract NettyMessageHead encoder();
}
