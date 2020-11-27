package com.hardware.server.service.netty.coder;

import com.hardware.common.constant.HardwareConstant;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

@Component
@Scope("prototype")
@ChannelHandler.Sharable
public class NettyTcpMessageDecoder extends MessageToMessageDecoder<ByteBuf> {
    @Autowired
    private MessageCoderFactory messageCoderFactory;
    @Override
    protected void decode(ChannelHandlerContext ctx,
                          ByteBuf byteBuf,
                          List<Object> list) throws Exception {
        Predicate<? super INettyTcpMessageDecoder> predicate=
                item->item.getHardwareType().getCode().equals(ctx.channel().attr(HardwareConstant.HARDWARE_TYPE).get());
        try {
            Object obj = messageCoderFactory.messageDecoder(byteBuf,predicate);
            list.add(obj);
        }catch(NoSuchElementException ex){
            throw new NoSuchElementException("There is no decoder with hardware type of "
                    +ctx.channel().attr(HardwareConstant.HARDWARE_TYPE).get());
        }
    }
}
