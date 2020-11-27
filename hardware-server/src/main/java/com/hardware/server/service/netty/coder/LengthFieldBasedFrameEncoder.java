package com.hardware.server.service.netty.coder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

public class LengthFieldBasedFrameEncoder extends MessageToMessageEncoder<ByteBuf> {
    private final FrameEncoderParam param;
    public LengthFieldBasedFrameEncoder(FrameEncoderParam param){
        this.param=param;
    }

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext,
                          ByteBuf byteBuf, List<Object> out) throws Exception {
        int length=byteBuf.readableBytes();
        //todo 编码
//        if(param.isLengthIncludesLengthFieldLength()){
//            length=length+param.getLengthFieldLength();
//        }
//        if(param.isLengthIncludesStartFieldLength()){
//            length=length+param.getStartFieldLength();
//        }
    }
}
