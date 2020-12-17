package com.hardware.server.service.charging.message.body.server;

import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;

public class StartChargingControlServerMessageBody extends ChargingPileServerMessageBody {
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
     * 充电生效类型
     * 占4字节
     * 0:即时充电
     * 1:定时启动充电
     * 2:预约充电
     */
    private long effectiveType;
    /**
     * 预留字段
     * 占4字节
     */
    private long reserve3;
    /**
     * 充电策略
     * 占4字节
     * 0:充满为止
     * 1:时间控制充电
     * 2:金额控制充电
     * 3:电量控制充电
     */
    private long chargingStrategy;
    /**
     * 充电策略参数
     * 占4字节
     * 时间单位为 1 秒
     * 金额单位为 0.01 元
     * 电量时单位为 0.01kw
     */
    private long chargingStrategyParam;
    /**
     * 预约/定时启动时间
     * 占8字节
     */
    private long startUpTime;
    /**
     * 预约超时时间
     * 占1字节
     * 单位分钟
     */
    private short appointmentTimeout;
    /**
     * 用户卡号/用户识别号
     * 占32字节
     */
    private byte[] cardNumber;
    /**
     * 断网充电标志
     * 0‐不允许 1‐允许
     * 占1字节
     */
    private short disconnectionChargingFlag;
    /**
     * 离线可充电电量
     * 占4字节(0.01kw)
     */
    private long offLineChargingCapacity;

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

    public long getEffectiveType() {
        return effectiveType;
    }

    public void setEffectiveType(long effectiveType) {
        this.effectiveType = effectiveType;
    }

    public long getReserve3() {
        return reserve3;
    }

    public void setReserve3(long reserve3) {
        this.reserve3 = reserve3;
    }

    public long getChargingStrategy() {
        return chargingStrategy;
    }

    public void setChargingStrategy(long chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public long getChargingStrategyParam() {
        return chargingStrategyParam;
    }

    public void setChargingStrategyParam(long chargingStrategyParam) {
        this.chargingStrategyParam = chargingStrategyParam;
    }

    public long getStartUpTime() {
        return startUpTime;
    }

    public void setStartUpTime(long startUpTime) {
        this.startUpTime = startUpTime;
    }

    public short getAppointmentTimeout() {
        return appointmentTimeout;
    }

    public void setAppointmentTimeout(short appointmentTimeout) {
        this.appointmentTimeout = appointmentTimeout;
    }

    public byte[] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(byte[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getDisconnectionChargingFlag() {
        return disconnectionChargingFlag;
    }

    public void setDisconnectionChargingFlag(short disconnectionChargingFlag) {
        this.disconnectionChargingFlag = disconnectionChargingFlag;
    }

    public long getOffLineChargingCapacity() {
        return offLineChargingCapacity;
    }

    public void setOffLineChargingCapacity(long offLineChargingCapacity) {
        this.offLineChargingCapacity = offLineChargingCapacity;
    }

    @Override
    public StartChargingControlServerMessageBody encoder(ByteBuf bodyByteBuf) {
        bodyByteBuf.writeShortLE(getReserve1());
        bodyByteBuf.writeShortLE(getReserve2());
        bodyByteBuf.writeByte(getChargingGunPort());
        bodyByteBuf.writeIntLE((int)getEffectiveType());
        bodyByteBuf.writeIntLE((int)getReserve3());
        bodyByteBuf.writeIntLE((int)getChargingStrategy());
        bodyByteBuf.writeIntLE((int)getChargingStrategyParam());
        bodyByteBuf.writeLongLE(getStartUpTime());
        bodyByteBuf.writeByte(getAppointmentTimeout());
        bodyByteBuf.writeBytes(cardNumber);
        bodyByteBuf.writeByte(getDisconnectionChargingFlag());
        bodyByteBuf.writeIntLE((int)getOffLineChargingCapacity());
        return this;
    }

    @Override
    public int getLength() {
        return MessageFieldConst.START_CHARGING_CONTROL_MESSAGE_BODY_LENGTH;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.START_CHARGING_CONTROL_SERVER_CMD;
    }
}
