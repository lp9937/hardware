package com.hardware.server.service.netty.tcp;

import com.hardware.server.service.netty.AbstractNettyServerService;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Scope("prototype")
public class NettyTcpServerService extends AbstractNettyServerService {
    @Autowired
    private ServerBootstrap serverBootstrap;
    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private ChannelInitializer channelInitializer;
    private ChannelFuture channelFuture;

    public NettyTcpServerService setBossGroup(EventLoopGroup bossGroup) {
        this.bossGroup = bossGroup;
        return this;
    }

    public NettyTcpServerService setWorkerGroup(EventLoopGroup workerGroup) {
        this.workerGroup = workerGroup;
        return this;
    }

    public NettyTcpServerService setChannelInitializer(ChannelInitializer channelInitializer) {
        this.channelInitializer = channelInitializer;
        return this;
    }

//    public NettyTcpServerService setChannelFutures(List<ChannelFuture> channelFutures) {
//        this.channelFutures = channelFutures;
//        return this;
//    }

    @Override
    public boolean startUp() {
        //设置线程池
        serverBootstrap.group(bossGroup,workerGroup);
        //设置通道
        serverBootstrap.channel(NioServerSocketChannel.class);
        //设置tcp参数
        //链接缓冲池的大小(ServerSocketChannel的设置)
        serverBootstrap.option(ChannelOption.SO_BACKLOG,1024);
        //设置地址重用
        serverBootstrap.childOption(ChannelOption.SO_REUSEADDR,true);
        //维持链接的活跃，清除死链接(SocketChannel的设置)
        serverBootstrap.childOption(ChannelOption.SO_KEEPALIVE,true);
        //关闭延迟发送
        serverBootstrap.childOption(ChannelOption.TCP_NODELAY,true);
        //接收缓存
        serverBootstrap.childOption(ChannelOption.SO_RCVBUF,1024*256);
        serverBootstrap.childOption(ChannelOption.SO_SNDBUF,1024*256);
        serverBootstrap.handler(new LoggingHandler(LogLevel.ERROR));
        //设置通道工厂
        serverBootstrap.childHandler(channelInitializer);
        //绑定地址
        try {
            channelFuture =serverBootstrap.bind(getServiceAddress()).sync();
        } catch (InterruptedException e) {
            isRunning = false;
            log.error(e.toString(), e);
        }

        //默认添加关闭事件的监听器
        addListener();
        isRunning=true;
        return true;
    }

    @Override
    public boolean stop() {
        if(bossGroup!=null){
            bossGroup.shutdownGracefully();
        }
        if(workerGroup!=null){
            workerGroup.shutdownGracefully();
        }
        return true;
    }

    @Override
    public AbstractNettyServerService addListener(ChannelFutureListener listener) {
        channelFuture.channel().closeFuture().addListener(listener);
        return this;
    }
}
