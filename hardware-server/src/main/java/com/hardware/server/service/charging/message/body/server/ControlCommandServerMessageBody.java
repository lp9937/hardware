package com.hardware.server.service.charging.message.body.server;

import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;

/**
 * Created by lp on 2020/11/30
 * 充电桩控制命令消息体
 */
public class ControlCommandServerMessageBody
        extends ChargingPileServerMessageBody {
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
     * 充电枪口
     * 占1字节
     */
    private short chargingGunPort;
    /**
     * 命令启始标志
     * 占4字节
     */
    private long cmdStartAddress;
    /**
     * 参数个数
     * 占1个字节
     */
    private short argumentCount;
    /**
     * 命令参数长度
     * 占2字节
     */
    private int argumentLength;
    /**
     * 命令参数
     */
    private byte[] argument;

    public int getReserve1() {
        return reserve1;
    }

    public void setReserve1(int reserve1) {
        this.reserve1 = reserve1;
    }

    public int getReserve2() {
        return reserve2;
    }

    public void setReserve2(int reserve2) {
        this.reserve2 = reserve2;
    }

    public short getChargingGunPort() {
        return chargingGunPort;
    }

    public void setChargingGunPort(short chargingGunPort) {
        this.chargingGunPort = chargingGunPort;
    }

    public long getCmdStartAddress() {
        return cmdStartAddress;
    }

    public void setCmdStartAddress(long cmdStartAddress) {
        this.cmdStartAddress = cmdStartAddress;
    }

    public short getArgumentCount() {
        return argumentCount;
    }

    public void setArgumentCount(short argumentCount) {
        this.argumentCount = argumentCount;
    }

    public int getArgumentLength() {
        return argumentLength;
    }

    public void setArgumentLength(int argumentLength) {
        this.argumentLength = argumentLength;
    }

    public byte[] getArgument() {
        return argument;
    }

    public void setArgument(byte[] argument) {
        this.argument = argument;
    }

    @Override
    protected ControlCommandServerMessageBody encoder(ByteBuf bodyByteBuf) {
        bodyByteBuf.writeShortLE(getReserve1());
        bodyByteBuf.writeShortLE(getReserve2());
        bodyByteBuf.writeByte(getChargingGunPort());
        bodyByteBuf.writeIntLE((int)getCmdStartAddress());
        bodyByteBuf.writeByte(getArgumentCount());
        bodyByteBuf.writeShortLE(getArgumentLength());
        bodyByteBuf.writeBytes(getArgument());
        return this;
    }

    @Override
    public int getLength() {
        return MessageFieldConst.CONTROL_COMMAND_MESSAGE_BODY_LENGTH
                +getArgument().length;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.CONTROL_COMMAND_SERVER_CMD;
    }
}
