package com.hardware.server.service.charging.message.body.request;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;

@MessageRegister(command = CommandEnum.HEARTBEAT_CMD)
public class HeartbeatRequestMessageBody extends ChargingPileRequestMessageBody {
    /**
     * 预留字段
     * 占2字节
     */
    private short reserve1;
    /**
     * 预留字段
     * 占2字节
     */
    private short reserve2;
    /**
     * 心跳序号,无符号short
     * 占2字节
     */
    private int SerialNumber;

    public short getReserve1() {
        return reserve1;
    }

    public HeartbeatRequestMessageBody setReserve1(short reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public short getReserve2() {
        return reserve2;
    }

    public HeartbeatRequestMessageBody setReserve2(short reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public HeartbeatRequestMessageBody setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
        return this;
    }

    @Override
    public HeartbeatRequestMessageBody decoder() {
        ByteBuf body=getBody();
        ((HeartbeatRequestMessageBody)setReserve1(body.readShort())
                .setReserve2(body.readShort())
                .setCode(body))
                .setSerialNumber(body.readUnsignedShort());
        return this;
    }
}
