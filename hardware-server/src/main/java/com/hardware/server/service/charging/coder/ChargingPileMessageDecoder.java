package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.ExceptionEnum;
import com.hardware.common.enums.HardwareEnum;
import com.hardware.common.exception.PacketException;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.charging.message.ChargingPileMessage;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.request.ChargingPileRequestMessageBody;
import com.hardware.server.service.netty.coder.INettyTcpMessageDecoder;
import com.hardware.server.service.netty.register.MessageRegistryService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ChargingPileMessageDecoder implements
        INettyTcpMessageDecoder<ChargingPileMessage> {
    @Autowired
    private MessageRegistryService messageRegistryService;
    @Override
    public HardwareEnum getHardwareType() {
        return HardwareEnum.CHARGING_PILE;
    }
    @Override
    public ChargingPileMessage decoder(ByteBuf byteBuf) {
        if(byteBuf.readUnsignedShort()!= MessageFieldConst.START_FIELD_VALUE){
            //todo 数据包异常，直接丢弃这个包，抛出异常
            throw new PacketException(ExceptionEnum.UNRECOGNIZED_PACKAGE);
        }
        //消息头数据处理
        ByteBuf headBuf= Unpooled.buffer(MessageFieldConst.HEAD_LENGTH);
        byteBuf.readBytes(headBuf);

        ChargingPileMessageHead messageHead=new ChargingPileMessageHead();
        messageHead.setHead(headBuf).decoder();

        //消息体数据处理
        int bodyLength=messageHead.getLength()
                -MessageFieldConst.HEAD_LENGTH
                -MessageFieldConst.CHECK_FIELD_LENGTH;
        ByteBuf bodyBuf=Unpooled.buffer(bodyLength);
        byteBuf.readBytes(bodyBuf);
        ChargingPileRequestMessageBody messageBody=
                (ChargingPileRequestMessageBody)messageRegistryService
                        .getMessage(Long.valueOf(messageHead.getCommandType()));
        ((ChargingPileRequestMessageBody)messageBody.setBody(bodyBuf)).decoder();

        ChargingPileMessage chargingPileMessage=new ChargingPileMessage();
        chargingPileMessage.setMessageHead(messageHead)
                .setMessageBody(messageBody);
        return chargingPileMessage;
    }
}
