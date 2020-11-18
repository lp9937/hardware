package com.hardware.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HarewareServerApplicationTests {

	@Test
	void contextLoads() {
		initBootstrap();
	}

	private void initBootstrap() {
		EventLoopGroup loopGroup = new NioEventLoopGroup(4);
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.group(loopGroup).channel(NioSocketChannel.class);
		// 设置该选项以后，如果在两小时内没有数据的通信时，TCP会自动发送一个活动探测数据报文
		bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
		// 设置禁用nagle算法
		bootstrap.option(ChannelOption.TCP_NODELAY, true);
		// 设置连接超时时长
		bootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10 * 1000);
		// 设置初始化Channel
		bootstrap.handler(new ChannelInitializer<Channel>() {
			@Override
			protected void initChannel(Channel ch) throws Exception {
				for(int i=0;i<100;i++) {
					ch.write(i);
				}
			}
		});

		try {
			Channel channel=bootstrap.connect("10.10.20.87",6111).sync().channel();
			for(int i=0;i<10;i++){
				channel.write(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
