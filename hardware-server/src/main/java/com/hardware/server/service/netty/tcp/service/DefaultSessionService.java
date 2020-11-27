package com.hardware.server.service.netty.tcp.service;

import com.hardware.common.enums.ExceptionEnum;
import com.hardware.common.exception.ArgumentException;
import com.hardware.server.service.netty.session.ISession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
public class DefaultSessionService implements ISessionService<ISession> {
    private final Map<Long,ISession> sessions
            =new ConcurrentHashMap<>();
    @Override
    public ISession get(long sessionId) {
        return sessions.get(sessionId);
    }

    @Override
    public boolean add(ISession session) {
        if(session==null){
            throw new ArgumentException(ExceptionEnum.ILLEGAL_ARGUMENT,
                    "illegal parameter,session parameter cannot be empty.");
        }
        if(log.isDebugEnabled()){
            log.debug("add session:"+session.getChannel().id().asLongText()+
                    ",sessionId "+session.getSessionId());
        }
        sessions.put(session.getSessionId(),session);
        return true;
    }

    @Override
    public boolean remove(ISession session) {
        if(session==null){
            log.info("illegal parameter,parameter cannot be empty");
            return false;
        }
        sessions.remove(session.getSessionId());
        return true;
    }
}
