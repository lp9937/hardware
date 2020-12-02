package com.hardware.server.service.charging.message.body.client;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

@Component
@MessageRegister
public class StatusClientMessageBody extends
        ChargingPileClientMessageBody {
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
     * 充电枪数量
     * 占1字节
     */
    private short chargingGunNumber;
    /**
     * 充电口号
     * 占1字节
     */
    private short chargingPort;
    /**
     * 充电枪类型
     * 占1字节
     */
    private short chargingGunType;
    /**
     * 工作状态
     * 占1字节
     */
    private short workerState;
    /**
     * 当前SOC
     * 占1字节
     */
    private short currentSoc;
    /**
     * 告警状态
     * 占4字节
     */
    private long alarmState;
    /**
     * 连接状态
     * 占1字节
     */
    private short connectionState;
    /**
     * 本机充电累计充电费用
     * 占4字节
     */
    private long chargingCharge;
    /**
     * 内部变量2
     * 占4字节
     */
    private long internalVariables1;
    /**
     * 内部变量3
     * 占4字节
     */
    private long internalVariables2;
    /**
     * 直流充电电压
     * 占2字节
     */
    private int dcChargingVoltage;
    /**
     * 直流充电电流
     * 占2字节
     */
    private int dcChargingCurrent;
    /**
     * BMS需求电压
     * 占2字节
     */
    private int bmsDemandVoltage;
    /**
     * BMS需求电流
     * 占2字节
     */
    private int bmsDemandCurrent;
    /**
     * BMS充电模式
     * 占1字节
     * 1‐ 恒压
     * 2‐ 恒流
     */
    private short bmsChargingMode;
    /**
     * 交流A相充电电压
     * 占2字节
     */
    private int acAPhaseChargingVoltage;
    /**
     * 交流B相充电电压
     * 占2字节
     */
    private int acBPhaseChargingVoltage;
    /**
     * 交流C相充电电压
     * 占2字节
     */
    private int acCPhaseChargingVoltage;
    /**
     * 交流A相充电电流
     * 占2字节
     */
    private int acAPhaseChargingCurrent;
    /**
     * 交流B相充电电流
     * 占2字节
     */
    private int acBPhaseChargingCurrent;
    /**
     * 交流C相充电电流
     * 占2字节
     */
    private int acCPhaseChargingCurrent;
    /**
     * 剩余充电时间(min)
     * 占2字节
     */
    private int remainingChargingTime;
    /**
     * 充电时长(sec)
     * 占4字节
     */
    private long chargingTime;
    /**
     * 本次充电累计充电电量(0.01kwh)
     * 占4字节
     */
    private long chargingCapacity;
    /**
     * 充电前电表读数(0.01kw)
     * 占4字节
     */
    private long beforeMeterReading;
    /**
     * 当前电表读数(0.01kw)
     * 占4字节
     */
    private long currentMeterReading;
    /**
     * 充电启动方式
     * 占1字节
     * 0：本地刷卡启动
     * 1：后台启动
     * 2：本地管理员启动
     */
    private short startingMode;
    /**
     * 充电策略
     * 占1字节
     * 0 自动充满
     * 1 按时间充满
     * 2 定金额
     * 3 按电量充满
     */
    private short chargingStrategy;
    /**
     * 充电策略参数
     * 占4字节
     * 时间单位为 1 秒
     * 金额单位为 0.01 元
     * 电量时单位为 0.01kw
     */
    private long chargingStrategyParam;
    /**
     * 预约标志
     * 占1字节
     * 0‐无预约（无效）
     * 1‐预约有效
     */
    private short appointmentFlag;
    /**
     * 充电/预约卡号
     * 占32字节
     * ASSIC码，不够长度填’\0’
     */
    private byte[] cardNumber;
    /**
     * 预约超时时间
     * 占1字节
     * 单位分钟
     */
    private short appointmentTimeout;
    /**
     * 预约/开始充电开始时间
     * 占8字节
     * 标准时间
     */
    private long chargingStartTime;
    /**
     * 充电前卡余额
     * 占4字节
     */
    private long beforeBalance;
    /**
     * 预留
     * 占4字节
     */
    private long reserve3;
    /**
     * 充电功率
     * 占4字节(0.1kw)
     */
    private long chargingPower;
    /**
     * 系统变量3
     * 占4字节
     */
    private long sysVariable1;
    /**
     * 系统变量4
     * 占4字节
     */
    private long sysVariable2;
    /**
     * 系统变量5
     * 占4字节
     */
    private long sysVariable3;

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

    public short getChargingGunNumber() {
        return chargingGunNumber;
    }

    public void setChargingGunNumber(short chargingGunNumber) {
        this.chargingGunNumber = chargingGunNumber;
    }

    public short getChargingPort() {
        return chargingPort;
    }

    public void setChargingPort(short chargingPort) {
        this.chargingPort = chargingPort;
    }

    public short getChargingGunType() {
        return chargingGunType;
    }

    public void setChargingGunType(short chargingGunType) {
        this.chargingGunType = chargingGunType;
    }

    public short getWorkerState() {
        return workerState;
    }

    public void setWorkerState(short workerState) {
        this.workerState = workerState;
    }

    public short getCurrentSoc() {
        return currentSoc;
    }

    public void setCurrentSoc(short currentSoc) {
        this.currentSoc = currentSoc;
    }

    public long getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(long alarmState) {
        this.alarmState = alarmState;
    }

    public short getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(short connectionState) {
        this.connectionState = connectionState;
    }

    public long getChargingCharge() {
        return chargingCharge;
    }

    public void setChargingCharge(long chargingCharge) {
        this.chargingCharge = chargingCharge;
    }

    public long getInternalVariables1() {
        return internalVariables1;
    }

    public void setInternalVariables1(long internalVariables1) {
        this.internalVariables1 = internalVariables1;
    }

    public long getInternalVariables2() {
        return internalVariables2;
    }

    public void setInternalVariables2(long internalVariables2) {
        this.internalVariables2 = internalVariables2;
    }

    public int getDcChargingVoltage() {
        return dcChargingVoltage;
    }

    public void setDcChargingVoltage(int dcChargingVoltage) {
        this.dcChargingVoltage = dcChargingVoltage;
    }

    public int getDcChargingCurrent() {
        return dcChargingCurrent;
    }

    public void setDcChargingCurrent(int dcChargingCurrent) {
        this.dcChargingCurrent = dcChargingCurrent;
    }

    public int getBmsDemandVoltage() {
        return bmsDemandVoltage;
    }

    public void setBmsDemandVoltage(int bmsDemandVoltage) {
        this.bmsDemandVoltage = bmsDemandVoltage;
    }

    public int getBmsDemandCurrent() {
        return bmsDemandCurrent;
    }

    public void setBmsDemandCurrent(int bmsDemandCurrent) {
        this.bmsDemandCurrent = bmsDemandCurrent;
    }

    public short getBmsChargingMode() {
        return bmsChargingMode;
    }

    public void setBmsChargingMode(short bmsChargingMode) {
        this.bmsChargingMode = bmsChargingMode;
    }

    public int getAcAPhaseChargingVoltage() {
        return acAPhaseChargingVoltage;
    }

    public void setAcAPhaseChargingVoltage(int acAPhaseChargingVoltage) {
        this.acAPhaseChargingVoltage = acAPhaseChargingVoltage;
    }

    public int getAcBPhaseChargingVoltage() {
        return acBPhaseChargingVoltage;
    }

    public void setAcBPhaseChargingVoltage(int acBPhaseChargingVoltage) {
        this.acBPhaseChargingVoltage = acBPhaseChargingVoltage;
    }

    public int getAcCPhaseChargingVoltage() {
        return acCPhaseChargingVoltage;
    }

    public void setAcCPhaseChargingVoltage(int acCPhaseChargingVoltage) {
        this.acCPhaseChargingVoltage = acCPhaseChargingVoltage;
    }

    public int getAcAPhaseChargingCurrent() {
        return acAPhaseChargingCurrent;
    }

    public void setAcAPhaseChargingCurrent(int acAPhaseChargingCurrent) {
        this.acAPhaseChargingCurrent = acAPhaseChargingCurrent;
    }

    public int getAcBPhaseChargingCurrent() {
        return acBPhaseChargingCurrent;
    }

    public void setAcBPhaseChargingCurrent(int acBPhaseChargingCurrent) {
        this.acBPhaseChargingCurrent = acBPhaseChargingCurrent;
    }

    public int getAcCPhaseChargingCurrent() {
        return acCPhaseChargingCurrent;
    }

    public void setAcCPhaseChargingCurrent(int acCPhaseChargingCurrent) {
        this.acCPhaseChargingCurrent = acCPhaseChargingCurrent;
    }

    public int getRemainingChargingTime() {
        return remainingChargingTime;
    }

    public void setRemainingChargingTime(int remainingChargingTime) {
        this.remainingChargingTime = remainingChargingTime;
    }

    public long getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(long chargingTime) {
        this.chargingTime = chargingTime;
    }

    public long getChargingCapacity() {
        return chargingCapacity;
    }

    public void setChargingCapacity(long chargingCapacity) {
        this.chargingCapacity = chargingCapacity;
    }

    public long getBeforeMeterReading() {
        return beforeMeterReading;
    }

    public void setBeforeMeterReading(long beforeMeterReading) {
        this.beforeMeterReading = beforeMeterReading;
    }

    public long getCurrentMeterReading() {
        return currentMeterReading;
    }

    public void setCurrentMeterReading(long currentMeterReading) {
        this.currentMeterReading = currentMeterReading;
    }

    public short getStartingMode() {
        return startingMode;
    }

    public void setStartingMode(short startingMode) {
        this.startingMode = startingMode;
    }

    public short getChargingStrategy() {
        return chargingStrategy;
    }

    public void setChargingStrategy(short chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public long getChargingStrategyParam() {
        return chargingStrategyParam;
    }

    public void setChargingStrategyParam(long chargingStrategyParam) {
        this.chargingStrategyParam = chargingStrategyParam;
    }

    public short getAppointmentFlag() {
        return appointmentFlag;
    }

    public void setAppointmentFlag(short appointmentFlag) {
        this.appointmentFlag = appointmentFlag;
    }

    public byte[] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(byte[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ChargingPileClientMessageBody setCardNumber(ByteBuf byteBuf){
        if(cardNumber==null){
            cardNumber=new byte[MessageFieldConst.CARD_NUMBER_FIELD_LENGTH];
        }
        byteBuf.readBytes(cardNumber);
        return this;
    }

    public short getAppointmentTimeout() {
        return appointmentTimeout;
    }

    public void setAppointmentTimeout(short appointmentTimeout) {
        this.appointmentTimeout = appointmentTimeout;
    }

    public long getChargingStartTime() {
        return chargingStartTime;
    }

    public void setChargingStartTime(long chargingStartTime) {
        this.chargingStartTime = chargingStartTime;
    }

    public long getBeforeBalance() {
        return beforeBalance;
    }

    public void setBeforeBalance(long beforeBalance) {
        this.beforeBalance = beforeBalance;
    }

    public long getReserve3() {
        return reserve3;
    }

    public void setReserve3(long reserve3) {
        this.reserve3 = reserve3;
    }

    public long getChargingPower() {
        return chargingPower;
    }

    public void setChargingPower(long chargingPower) {
        this.chargingPower = chargingPower;
    }

    public long getSysVariable1() {
        return sysVariable1;
    }

    public void setSysVariable1(long sysVariable1) {
        this.sysVariable1 = sysVariable1;
    }

    public long getSysVariable2() {
        return sysVariable2;
    }

    public void setSysVariable2(long sysVariable2) {
        this.sysVariable2 = sysVariable2;
    }

    public long getSysVariable3() {
        return sysVariable3;
    }

    public void setSysVariable3(long sysVariable3) {
        this.sysVariable3 = sysVariable3;
    }

    @Override
    public StatusClientMessageBody decoder() {
        ByteBuf body=getBody();
        setReserve1(body.readUnsignedShortLE());
        setReserve2(body.readUnsignedShortLE());
        setCode(body);
        setChargingGunNumber(body.readUnsignedByte());
        setChargingPort(body.readUnsignedByte());
        setChargingGunType(body.readUnsignedByte());
        setWorkerState(body.readUnsignedByte());
        setCurrentSoc(body.readUnsignedByte());
        setAlarmState(body.readUnsignedIntLE());
        setConnectionState(body.readUnsignedByte());
        setChargingCharge(body.readUnsignedIntLE());
        setInternalVariables1(body.readUnsignedIntLE());
        setInternalVariables2(body.readUnsignedIntLE());
        setDcChargingVoltage(body.readUnsignedShortLE());
        setDcChargingCurrent(body.readUnsignedShortLE());
        setBmsDemandVoltage(body.readUnsignedShortLE());
        setBmsDemandCurrent(body.readUnsignedShortLE());
        setBmsChargingMode(body.readUnsignedByte());
        setAcAPhaseChargingVoltage(body.readUnsignedShortLE());
        setAcBPhaseChargingVoltage(body.readUnsignedShortLE());
        setAcCPhaseChargingVoltage(body.readUnsignedShortLE());
        setAcAPhaseChargingCurrent(body.readUnsignedShortLE());
        setAcBPhaseChargingCurrent(body.readUnsignedShortLE());
        setAcCPhaseChargingCurrent(body.readUnsignedShortLE());
        setRemainingChargingTime(body.readUnsignedShortLE());
        setChargingTime(body.readUnsignedIntLE());
        setChargingCapacity(body.readUnsignedIntLE());
        setBeforeMeterReading(body.readUnsignedIntLE());
        setCurrentMeterReading(body.readUnsignedIntLE());
        setStartingMode(body.readUnsignedByte());
        setChargingStrategy(body.readUnsignedByte());
        setChargingStrategyParam(body.readUnsignedIntLE());
        setAppointmentFlag(body.readUnsignedByte());
        setCardNumber(body);
        setAppointmentTimeout(body.readUnsignedByte());
        setChargingStartTime(body.readLongLE());
        setBeforeBalance(body.readUnsignedIntLE());
        setReserve3(body.readUnsignedIntLE());
        setChargingPower(body.readUnsignedIntLE());
        setSysVariable1(body.readUnsignedIntLE());
        setSysVariable2(body.readUnsignedIntLE());
        setSysVariable3(body.readUnsignedIntLE());
        return this;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.STATE_CMD;
    }
}
