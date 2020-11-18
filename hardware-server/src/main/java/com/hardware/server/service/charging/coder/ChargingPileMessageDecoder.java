package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareType;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.charging.message.ChargingPileMessage;
import com.hardware.server.service.netty.coder.INettyTcpMessageDecoder;
import io.netty.buffer.ByteBuf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ChargingPileMessageDecoder implements
        INettyTcpMessageDecoder<ChargingPileMessage> {
    @Override
    public HardwareType getHardwareType() {
        return HardwareType.CHARGING_PILE;
    }
    @Override
    public ChargingPileMessage decoder(ByteBuf byteBuf) {
        if(byteBuf.readUnsignedShort()!= MessageFieldConst.START_FIELD_VALUE){
            //todo 数据包异常，直接丢弃这个包
        }
        return null;
    }
}
