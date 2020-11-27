package com.hardware.server.service.netty.handler;

import com.hardware.common.constant.HardwareConstant;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import com.hardware.server.service.netty.session.ISession;
import com.hardware.server.service.netty.session.builder.DefaultSessionBuilder;
import com.hardware.server.service.netty.session.dispatcher.DefaultDispatcher;
import com.hardware.server.service.netty.tcp.service.DefaultSessionService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@ChannelHandler.Sharable
@Slf4j
public class HardwareTcpMessageHandler extends ChannelInboundHandlerAdapter {
    @Autowired
    private DefaultDispatcher dispatcher;
    @Autowired
    private DefaultSessionBuilder sessionBuilder;
    @Autowired
    private DefaultSessionService sessionService;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        AbstractNettyMessage message=(AbstractNettyMessage)msg;
        dispatcher.dispatch(message, ctx.channel());
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
        ISession session=sessionBuilder.build(ctx.channel());
        boolean isSuccess =sessionService.add(session);
        if(!isSuccess){
            session.close();
            return;
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if(log.isErrorEnabled()){
            log.error("channel exception caught",cause);
        }
        super.exceptionCaught(ctx, cause);
        long sessionId=ctx.channel().attr(HardwareConstant.CHANNEL_SESSION_ID).get();
        ISession session=sessionService.get(sessionId);
        if(session!=null){
            session.close();
        }else{
            ctx.close();
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        long sessionId=ctx.channel().attr(HardwareConstant.CHANNEL_SESSION_ID).get();
        ISession session = sessionService.get(sessionId);
        if(session!=null){
            session.close();
            sessionService.remove(session);
        }
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }
}
