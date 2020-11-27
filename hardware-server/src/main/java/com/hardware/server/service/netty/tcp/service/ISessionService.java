package com.hardware.server.service.netty.tcp.service;

import com.hardware.server.service.netty.session.ISession;

/**
 * Created by lp on 2020/11/21
 * 为会话提供服务
 */
public interface ISessionService<T extends ISession> {
    ISession get(long sessionId);
    boolean add(T session);
    boolean remove(T session);
}
