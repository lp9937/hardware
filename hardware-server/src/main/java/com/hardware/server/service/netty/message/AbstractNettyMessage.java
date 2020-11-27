package com.hardware.server.service.netty.message;

import com.hardware.common.enums.CommandEnum;

import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractNettyMessage<H extends NettyMessageHead,
        B extends NettyMessageBody> implements INettyMessage<H, B> {
    private H messageHead;
    private B messageBody;

    private final ConcurrentHashMap<Object,Object> attributes=new ConcurrentHashMap<>(3);

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

    public AbstractNettyMessage<H,B> setAttribute(Object key,Object value){
        attributes.put(key,value);
        return this;
    }

    public Object getAttribute(Object key){
        return attributes.get(key);
    }

    public AbstractNettyMessage<H,B> removeAttribute(Object key){
        attributes.remove(key);
        return this;
    }

    public abstract CommandEnum getCommand();
}
