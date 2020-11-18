package com.hardware.server.service.netty.message;

public abstract class AbstractNettyMessage<H extends NettyMessageHead,B extends NettyMessageBody>
        implements INettyMessage<H, B> {
    private H messageHead;
    private B messageBody;

    @Override
    public H getMessageHead() {
        return messageHead;
    }

    @Override
    public B getMessageBody() {
        return messageBody;
    }
}
