package com.hardware.server.service.netty.register;

import com.hardware.common.annotation.HardwareHandleRegister;
import com.hardware.server.service.netty.handler.IHardwareHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class MessageHandlerRegistryService<V extends IHardwareHandler>{
    @Autowired
    @HardwareHandleRegister
    private List<IHardwareHandler> messageHandlers;

    @PostConstruct
    public void start(){
        messageHandlers.forEach(item->item.start());
    }

    @PreDestroy
    public void stop(){
        messageHandlers.forEach(item->item.stop());
        messageHandlers.clear();
    }

    public V getHandler(int type){
        return (V)messageHandlers.stream().filter(item->{
            if(item.getType().getCode().equals(type)){
                return true;
            }
            return false;
        }).findFirst().orElse(null);
    }
}
