package com.hardware.server.service.charging.message.body.server;

import com.hardware.server.service.charging.message.ChargingPileMessageBody;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public abstract class ChargingPileServerMessageBody extends ChargingPileMessageBody {
    public ChargingPileServerMessageBody encoder(){
        ByteBuf bodyByteBuf= Unpooled.buffer(getLength());
        encoder(bodyByteBuf);
        setBody(bodyByteBuf);
        return this;
    }
    protected abstract ChargingPileServerMessageBody encoder(ByteBuf bodyByteBuf);
    public abstract int getLength();
}
