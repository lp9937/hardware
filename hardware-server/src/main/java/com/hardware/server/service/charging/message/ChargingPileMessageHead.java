package com.hardware.server.service.charging.message;

import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.netty.message.NettyMessageHead;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * Created by lp on 2020/11/17
 * 充电桩网络消息头
 * 魔法头short+长度short+版本号byte+序列号byte+协议命令号short
 */
public class ChargingPileMessageHead extends NettyMessageHead {
    /**
     * 起始字段，无符号short
     * 占2字节
     */
    private int startField;
    /**
     * 报文长度字段,无符号short
     * 占2字节
     * 起始字段到校验和字段整个报文长度
     */
    private int length;
    /**
     * 版本字段,无符号byte
     * 占1个字节
     */
    private short version;
    /**
     * 序号字段,无符号byte
     * 占1个字节，取值0~0xFF
     */
    private short sequenceNumber;
    /**
     * 命令类型字段,无符号short
     * 占2字节
     */
    private int commandType;

    public ChargingPileMessageHead(){
        startField= MessageFieldConst.START_FIELD_VALUE;
        version=MessageFieldConst.VERSION_FIELD_VALUE;
    }

    public int getStartField() {
        return startField;
    }

    public void setStartField(int startField) {
        this.startField = startField;
    }

    public int getLength() {
        return length;
    }
    @Override
    public ChargingPileMessageHead setLength(int length) {
        this.length = length;
        return this;
    }

    public short getVersion() {
        return version;
    }

    public ChargingPileMessageHead setVersion(short version) {
        this.version = version;
        return this;
    }

    public short getSequenceNumber() {
        return sequenceNumber;
    }

    public ChargingPileMessageHead setSequenceNumber(short sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public int getCommandType() {
        return commandType;
    }

    public ChargingPileMessageHead setCommandType(int commandType) {
        this.commandType = commandType;
        return this;
    }

    @Override
    public ChargingPileMessageHead decoder() {
        ByteBuf head = getHead();
        setLength(head.readUnsignedShortLE())
                .setVersion(head.readUnsignedByte())
                .setSequenceNumber(head.readUnsignedByte())
                .setCommandType(head.readUnsignedShortLE());
        return this;
    }

    @Override
    public ChargingPileMessageHead encoder() {
        ByteBuf headByteBuf= Unpooled.buffer(MessageFieldConst.HEAD_LENGTH);
        headByteBuf.writeShort(startField);
        headByteBuf.writeShortLE(length);
        headByteBuf.writeByte(version);
        headByteBuf.writeByte(sequenceNumber);
        headByteBuf.writeShortLE(commandType);
        setHead(headByteBuf);
        return this;
    }
}
