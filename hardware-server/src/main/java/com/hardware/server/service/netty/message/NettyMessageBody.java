package com.hardware.server.service.netty.message;

import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;

public abstract class NettyMessageBody{
    private ByteBuf body;

    public ByteBuf getBody() {
        return body;
    }

    public NettyMessageBody setBody(ByteBuf body) {
        this.body = body;
        int ref=body.refCnt();
        return this;
    }

    /**
     * 获取消息体对应的命令
     * @return
     */
    public abstract CommandEnum getCommand();
}
