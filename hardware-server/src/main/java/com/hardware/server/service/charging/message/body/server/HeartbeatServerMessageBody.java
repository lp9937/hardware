package com.hardware.server.service.charging.message.body.server;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.springframework.stereotype.Component;

//@Component
//@MessageRegister
public class HeartbeatServerMessageBody extends ChargingPileServerMessageBody {
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

    public HeartbeatServerMessageBody setReserve1(short reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public short getReserve2() {
        return reserve2;
    }

    public HeartbeatServerMessageBody setReserve2(short reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public int getAck() {
        return ack;
    }

    public HeartbeatServerMessageBody setAck(int ack) {
        this.ack = ack;
        return this;
    }

    @Override
    public HeartbeatServerMessageBody encoder(ByteBuf bodyByteBuf) {
//        ByteBuf bodyByteBuf=
//                Unpooled.buffer(MessageFieldConst.HEARTBEAT_RESPONSE_MESSAGE_BODY_LENGTH);
        bodyByteBuf.writeShortLE(reserve1);
        bodyByteBuf.writeShortLE(reserve2);
        bodyByteBuf.writeShortLE(ack);
        //setBody(bodyByteBuf);
        return this;
    }

    @Override
    public int getLength() {
        return MessageFieldConst.HEARTBEAT_RESPONSE_MESSAGE_BODY_LENGTH;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.HEARTBEAT_SERVER_CMD;
    }

}
