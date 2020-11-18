package com.hardware.server.service.netty.handler;

import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Slf4j
public class HardwareLoggingHandler extends LoggingHandler {
    public HardwareLoggingHandler(){
        super(LogLevel.DEBUG);
    }

    private final ChannelFutureListener exceptionListener= channelFuture -> {
        if(!channelFuture.isSuccess()){
            Throwable throwable= channelFuture.cause();
            if(throwable!=null){
                log.error(throwable.toString(),throwable);
            }
        }
    };

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        if(logger.isEnabled(this.internalLevel)){
            logger.log(internalLevel,this.format(ctx,"WRITE",msg));
        }
        ChannelPromise channelPromise=promise.unvoid();
        channelPromise.addListener(exceptionListener);
    }
}
