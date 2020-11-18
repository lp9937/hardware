package com.hardware.server.service.netty.coder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class NettyTcpMessageDecoder extends MessageToMessageDecoder<ByteBuf> {
    @Autowired
    private MessageCoderFactory messageCoderFactory;
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext,
                          ByteBuf byteBuf,
                          List<Object> list) throws Exception {
        Predicate<? super INettyTcpMessageDecoder> predicate=
                item->item.getHardwareType().getCode()==byteBuf.readInt();
        list.add(messageCoderFactory.messageDecoder(byteBuf,predicate));
    }
}
