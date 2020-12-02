package com.hardware.server.service.charging.message.body.client;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

@Component
@MessageRegister
public class HeartbeatClientMessageBody extends ChargingPileClientMessageBody {
    /**
     * 预留字段
     * 占2字节
     */
    private int reserve1;
    /**
     * 预留字段
     * 占2字节
     */
    private int reserve2;
    /**
     * 心跳序号,无符号short
     * 占2字节
     */
    private int SerialNumber;

    public int getReserve1() {
        return reserve1;
    }

    public HeartbeatClientMessageBody setReserve1(int reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public int getReserve2() {
        return reserve2;
    }

    public HeartbeatClientMessageBody setReserve2(int reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public HeartbeatClientMessageBody setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
        return this;
    }

    @Override
    public HeartbeatClientMessageBody decoder() {
        ByteBuf body=getBody();
        setReserve1(body.readUnsignedShortLE());
        setReserve2(body.readUnsignedShortLE());
        setCode(body);
        setSerialNumber(body.readUnsignedShortLE());
        return this;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.HEARTBEAT_CMD;
    }
}
