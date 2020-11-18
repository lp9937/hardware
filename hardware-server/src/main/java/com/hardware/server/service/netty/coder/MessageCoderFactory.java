package com.hardware.server.service.netty.coder;

import com.hardware.server.service.netty.message.AbstractNettyMessage;
import io.netty.buffer.ByteBuf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class MessageCoderFactory {
    @Autowired
    private List<INettyTcpMessageDecoder> decoders;
    @Autowired
    private List<INettyTcpMessageEncoder> encoders;
    public <T> T messageDecoder(ByteBuf byteBuf,
                                Predicate<? super INettyTcpMessageDecoder> predicate){
        INettyTcpMessageDecoder decoder = decoders.stream()
                .filter(predicate).findFirst().get();
        return (T)decoder.decoder(byteBuf);
    }

    public <T> T messageEncoder(AbstractNettyMessage abstractNettyMessage,
                                Predicate<? super INettyTcpMessageEncoder> predicate){
        INettyTcpMessageEncoder encoder=encoders.stream()
                .filter(predicate).findFirst().get();
        return (T)encoder.encoder(abstractNettyMessage);
    }
}
