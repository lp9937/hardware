package com.hardware.server.service.netty.coder;

import com.hardware.server.service.netty.message.AbstractNettyMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class NettyTcpMessageEncoder extends MessageToMessageEncoder<AbstractNettyMessage> {
    @Autowired
    private MessageCoderFactory messageCoderFactory;
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext,
                          AbstractNettyMessage abstractNettyMessage,
                          List<Object> list) throws Exception {
        Predicate<? super INettyTcpMessageEncoder> predicate=
                item->item.getHardwareType()==abstractNettyMessage.getHardwareType();
        list.add(messageCoderFactory.messageEncoder(abstractNettyMessage,predicate));
    }
}
