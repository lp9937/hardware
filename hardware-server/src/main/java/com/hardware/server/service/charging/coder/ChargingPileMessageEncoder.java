package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareType;
import com.hardware.server.service.charging.message.ChargingPileMessage;
import com.hardware.server.service.netty.coder.INettyTcpMessageEncoder;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

@Component
public class ChargingPileMessageEncoder implements
        INettyTcpMessageEncoder<ChargingPileMessage> {
    @Override
    public HardwareType getHardwareType() {
        return HardwareType.CHARGING_PILE;
    }
    @Override
    public ByteBuf encoder(ChargingPileMessage chargingPileMessage) {
        return null;
    }
}
