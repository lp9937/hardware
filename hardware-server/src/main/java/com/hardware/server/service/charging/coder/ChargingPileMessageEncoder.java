package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.charging.message.ChargingPileMessage;
import com.hardware.server.service.charging.message.body.response.ChargingPileResponseMessageBody;
import com.hardware.server.service.netty.coder.INettyTcpMessageEncoder;
import com.hardware.server.service.netty.message.NettyMessageHead;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.springframework.stereotype.Component;

@Component
public class ChargingPileMessageEncoder implements
        INettyTcpMessageEncoder<ChargingPileMessage> {
    @Override
    public HardwareEnum getHardwareType() {
        return HardwareEnum.CHARGING_PILE;
    }
    @Override
    public ByteBuf encoder(ChargingPileMessage chargingPileMessage) {
        ChargingPileResponseMessageBody body=
                ((ChargingPileResponseMessageBody)chargingPileMessage
                        .getMessageBody()).encoder();

        NettyMessageHead head=chargingPileMessage.getMessageHead();
        //消息体长度+校验位长度
        int length=MessageFieldConst.HEAD_LENGTH+body.getLength()+MessageFieldConst.CHECK_FIELD_LENGTH;
        head.setLength(length).encoder();

        //零拷贝方法1
//        CompositeByteBuf byteBuf=Unpooled.compositeBuffer();
//        byteBuf.addComponents(true,head.getHead(),body.getBody());
//        byteBuf.writeByte(chargingPileMessage.getCheck());

        //零拷贝方法2
        ByteBuf byteBuf=Unpooled.wrappedBuffer(head.getHead(),body.getBody());
        //校验位
        byteBuf.writeByte(chargingPileMessage.getCheck());
        return byteBuf;
    }
}
