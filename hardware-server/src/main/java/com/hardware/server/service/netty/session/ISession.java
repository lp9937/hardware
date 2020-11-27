package com.hardware.server.service.netty.session;

import com.hardware.server.service.netty.message.AbstractNettyMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;

/**
 * Created by lp on 2020/10/24
 * 封装会话的业务逻辑
 */
public interface ISession {
    /**
     * 判断会话是否处于连接状态
     * @return
     */
    boolean isConnect();

    /**
     * 向channel中写入消息
     * @param message
     */
    void write(AbstractNettyMessage message);

    /**
     * 关闭channel
     * @return
     */
    ChannelFuture close();

    /**
     * 获取sessionId
     * @return
     */
    Long getSessionId();

    /**
     * 获取通道
     * @return
     */
    Channel getChannel();
}
