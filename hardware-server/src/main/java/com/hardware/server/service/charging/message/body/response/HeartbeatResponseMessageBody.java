package com.hardware.server.service.charging.message.body.response;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.charging.message.ChargingPileMessageBody;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

@MessageRegister(command = CommandEnum.HEARTBEAT_RESPONSE_CMD)
public class HeartbeatResponseMessageBody extends ChargingPileResponseMessageBody {
    /**
     * 预留字段
     */
    private short reserve1;
    /**
     * 预留字段
     */
    private short reserve2;
    /**
     * 心跳应答序号,无符号short
     * 占2字节,从1开始累加,到最大值时,重新从1开始累加
     */
    private int ack;

    public short getReserve1() {
        return reserve1;
    }

    public HeartbeatResponseMessageBody setReserve1(short reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public short getReserve2() {
        return reserve2;
    }

    public HeartbeatResponseMessageBody setReserve2(short reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public int getAck() {
        return ack;
    }

    public HeartbeatResponseMessageBody setAck(int ack) {
        this.ack = ack;
        return this;
    }

    @Override
    public HeartbeatResponseMessageBody encoder() {
        ByteBuf bodyByteBuf=
                Unpooled.buffer(MessageFieldConst.HEARTBEAT_RESPONSE_MESSAGE_BODY_LENGTH);
        bodyByteBuf.writeShort(reserve1);
        bodyByteBuf.writeShort(reserve2);
        bodyByteBuf.writeShort(ack);
        setBody(bodyByteBuf);
        return this;
    }
}
