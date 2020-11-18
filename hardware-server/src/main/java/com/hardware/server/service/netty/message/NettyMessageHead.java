package com.hardware.server.service.netty.message;

import io.netty.buffer.ByteBuf;

public class NettyMessageHead {
    private ByteBuf head;

    public ByteBuf getHead() {
        return head;
    }

    public void setHead(ByteBuf head) {
        this.head = head;
    }
}
