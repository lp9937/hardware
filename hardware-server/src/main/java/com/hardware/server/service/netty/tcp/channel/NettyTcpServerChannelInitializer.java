package com.hardware.server.service.netty.tcp.channel;

import com.hardware.common.utils.SpringUtils;
import com.hardware.server.service.netty.coder.*;
import com.hardware.server.service.netty.handler.HardwareLoggingHandler;
import com.hardware.server.service.property.HardwareProperties;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.timeout.IdleStateHandler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NettyTcpServerChannelInitializer extends
        ChannelInitializer<NioSocketChannel> {
    @Autowired
    private BeanFactory beanFactory;
    @Autowired
    private FrameCoderFactory frameCoderFactory;
    @Autowired
    private HardwareLoggingHandler hardwareLoggingHandler;
    @Autowired
    private NettyTcpMessageDecoder nettyTcpMessageDecoder;
    @Autowired
    private NettyTcpMessageEncoder nettyTcpMessageEncoder;

    private final HardwareProperties.Netty.Tcp tcp;
    public NettyTcpServerChannelInitializer(HardwareProperties.Netty.Tcp tcp){
        this.tcp=tcp;
    }

    @Override
    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
        //获取管道
        ChannelPipeline pipeline=nioSocketChannel.pipeline();
        //解决粘包、拆包
        pipeline.addLast("frameDecoder",getLengthFieldBasedFrameDecoder());
        pipeline.addLast("frameEncoder",getLengthFieldBasedFrameEncoder());
        //编解码
        pipeline.addLast("decoder",nettyTcpMessageDecoder);
        pipeline.addLast("encoder",nettyTcpMessageEncoder);

        if(!SpringUtils.isProd()){
            pipeline.addLast("logger", hardwareLoggingHandler);
        }

        pipeline.addLast("idleStateHandler",
                new IdleStateHandler(tcp.getReaderIdleTimeSeconds(),
                        tcp.getWriterIdleTimeSeconds(),
                        tcp.getAllIdleTimeSeconds()));
        //todo 消息处理handler
        
    }

    private LengthFieldBasedFrameDecoder getLengthFieldBasedFrameDecoder(){
        FrameDecoderParam param =frameCoderFactory.getFrameDecoderParam(
                item-> tcp.getOptions().getHardwareType().equals(item.getHardwareType().getCode()));
        LengthFieldBasedFrameDecoder decoder=
                beanFactory.getBean(LengthFieldBasedFrameDecoder.class, param);
        return decoder;
    }

    private LengthFieldBasedFrameEncoder getLengthFieldBasedFrameEncoder(){
        FrameEncoderParam param= frameCoderFactory.getFrameEncoderParam(
                item->tcp.getOptions().getHardwareType().equals(item.getHardwareType().getCode()));
        LengthFieldBasedFrameEncoder encoder=
                beanFactory.getBean(LengthFieldBasedFrameEncoder.class,param);
        return encoder;
    }
}
