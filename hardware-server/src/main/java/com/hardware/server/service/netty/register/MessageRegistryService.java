package com.hardware.server.service.netty.register;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.server.service.netty.message.NettyMessageBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageRegistryService<V extends NettyMessageBody>{
    @Autowired
    @MessageRegister
    private List<NettyMessageBody> messageBodies;

    public V getMessageBody(int command){
        return (V)messageBodies.stream().filter(item->{
            if(item.getCommand().getCode().equals(command)){
                return true;
            }
            return false;
        }).findFirst().orElse(null);
    }
}
