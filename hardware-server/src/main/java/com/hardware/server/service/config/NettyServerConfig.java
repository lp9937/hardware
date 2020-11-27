package com.hardware.server.service.config;

import com.hardware.common.factory.ThreadNameFactory;
import com.hardware.common.utils.SpringUtils;
import com.hardware.server.service.netty.coder.FrameDecoderParam;
import com.hardware.server.service.netty.coder.FrameEncoderParam;
import com.hardware.server.service.netty.coder.LengthFieldBasedFrameEncoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.timeout.IdleStateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.ThreadFactory;

@Configuration
public class NettyServerConfig {

    @Bean
    @Scope("prototype")
    public NioEventLoopGroup getEventLoopGroup(int nThreads, ThreadFactory threadFactory){
        return new NioEventLoopGroup(nThreads,threadFactory);
    }

    @Bean
    @Scope("prototype")
    public ThreadNameFactory getThreadFactory(String prefixName,boolean isDaemon){
        return new ThreadNameFactory(prefixName,isDaemon);
    }

    @Bean
    @Scope("prototype")
    public ServerBootstrap getServerBootstrap(){
        return new ServerBootstrap();
    }

    @Bean
    @Scope("prototype")
    public Bootstrap getBootstrap(){
        return new Bootstrap();
    }

    @Bean
    @Scope("prototype")
    public LengthFieldBasedFrameDecoder getLengthFieldBasedFrameDecoder(
            FrameDecoderParam param){
        return new LengthFieldBasedFrameDecoder(param.getByteOrder(),param.getMaxFrameLength(),
                param.getLengthFieldOffset(),param.getLengthFieldLength(),
                param.getLengthAdjustment(),param.getInitialBytesToStrip(),false);
    }

    @Bean
    @Scope("prototype")
    public LengthFieldBasedFrameEncoder getLengthFieldBasedFrameEncoder(
            FrameEncoderParam param){
        return new LengthFieldBasedFrameEncoder(param);
    }
}
