package com.hardware.server.service.netty.message;

public abstract class AbstractNettyMessage<H extends NettyMessageHead,
        B extends NettyMessageBody> implements INettyMessage<H, B> {
    private H messageHead;
    private B messageBody;

    @Override
    public H getMessageHead() {
        return messageHead;
    }

    public AbstractNettyMessage<H,B> setMessageHead(H messageHead){
        this.messageHead=messageHead;
        return this;
    }

    @Override
    public B getMessageBody() {
        return messageBody;
    }

    public AbstractNettyMessage<H,B> setMessageBody(B messageBody){
        this.messageBody=messageBody;
        return this;
    }
}
