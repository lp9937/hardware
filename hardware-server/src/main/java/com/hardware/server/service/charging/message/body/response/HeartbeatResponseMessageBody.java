package com.hardware.server.service.charging.message.body.response;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageBody;
import io.netty.buffer.ByteBuf;

@MessageRegister(command = CommandEnum.HEARTBEAT_RESPONSE_CMD)
public class HeartbeatResponseMessageBody extends ChargingPileMessageBody {
    /**
     * 预留字段
     */
    private short reserve1;
    /**
     * 预留字段
     */
    private short reserve2;
    /**
     * 累加，到最大值时，从1重新开始累加
     */
    private short ack;

    public short getReserve1() {
        return reserve1;
    }

    public void setReserve1(short reserve1) {
        this.reserve1 = reserve1;
    }

    public short getReserve2() {
        return reserve2;
    }

    public void setReserve2(short reserve2) {
        this.reserve2 = reserve2;
    }

    public short getAck() {
        return ack;
    }

    public void setAck(short ack) {
        this.ack = ack;
    }

    @Override
    public Object decoder(ByteBuf byteBuf) {
        return null;
    }

    @Override
    public HardwareEnum getHardwareType() {
        return null;
    }
}
