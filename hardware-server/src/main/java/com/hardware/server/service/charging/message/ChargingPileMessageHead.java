package com.hardware.server.service.charging.message;

import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.netty.message.NettyMessageHead;

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
     * 版本字段
     */
    private byte version;
    /**
     * 序号字段
     */
    private byte sequenceNumber;
    /**
     * 命令类型字段
     * 占2字节
     */
    private short commandType;

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

    public void setLength(int length) {
        this.length = length;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public byte getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(byte sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public short getCommandType() {
        return commandType;
    }

    public void setCommandType(short commandType) {
        this.commandType = commandType;
    }
}
