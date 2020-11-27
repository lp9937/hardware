package com.hardware.server.service.netty.session.builder;

import com.hardware.server.service.netty.session.ISession;
import io.netty.channel.Channel;

/**
 * Created by lp on 2020/10/14
 * 会话创建者
 * @param <T>
 */
public interface ISessionBuilder<T extends ISession> {
    T build(Channel channel);
}
