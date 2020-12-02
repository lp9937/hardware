package com.hardware.server.service.charging.message.body.client;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

/**
 * Created by lp on 2020/11/30
 * 充电纪录上报
 */
@Component
@MessageRegister
public class ChargingRecordClientMessageBody
        extends  ChargingPileClientMessageBody{
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
     * 充电枪位置类型
     * 1‐直流 2‐交流
     * 占1字节
     */
    private short currentType;
    /**
     * 充电枪口
     * 占1字节
     */
    private short chargingGunPort;
    /**
     * 充电卡号
     * 占32字节
     */
    private byte[] cardNumber;
    /**
     * 充电开始时间
     * 占8字节
     */
    private byte[] startTime;
    /**
     * 充电结束时间
     * 占8字节
     */
    private byte[] endTime;
    /**
     * 充电时间长度
     * 占4字节，单位秒
     */
    private long duration;
    /**
     * 开始SOC
     * 占1字节
     */
    private short startSoc;
    /**
     * 停止SOC
     * 占1字节
     */
    private short endSoc;
    /**
     * 充电结束原因
     * 占4字节
     */
    private long terminationReason;
    /**
     * 本次充电电量
     * 占4字节
     */
    private long currentChargingCapacity;
    /**
     * 充电前电表读数(0.01kw)
     * 占4字节
     */
    private long beforeMeterReading;
    /**
     * 充电后电表读数(0.01kw)
     * 占4字节
     */
    private long afterMeterReading;
    /**
     * 本次充电金额
     * 占4字节
     */
    private long currentChargingAmount;
    /**
     * todo 文档这一列缺失
     * 内部索引
     * 占4字节
     */
    private long index;
    /**
     * 充电前卡余额
     * 占4字节
     */
    private long beforeBalance;
    /**
     * 当前充电纪录索引
     * 占4字节
     */
    private long currentChargingRecordIndex;
    /**
     * 总充电纪录条目
     * 占4字节
     */
    private long totalChargeRecordEntry;
    /**
     * 预留字段
     * 占1字节
     */
    private short reserve3;
    /**
     * 充电策略
     * 0:充满为止
     * 1:时间控制充电
     * 2:金额控制充电
     * 3:电量控制充电
     * 占1字节
     */
    private short chargingStrategy;
    /**
     * 充电策略参数
     * 时间单位1秒
     * 金额单位为 0.01 元
     * 电量时单位为 0.01kw
     * 占4字节
     */
    private long chargingStrategyParam;
    /**
     * 车辆VIN
     * 占17字节
     */
    private byte[] vehicleVin;
    /**
     * 车牌号
     * 占8字节
     */
    private byte[] licensePlateNumber;
    /**
     * 时段电量
     * 占96字节
     * 每一项占2字节，长度48
     */
    private int[] periodElectricity;
    /**
     * 启动方式
     * 占1字节
     * 0：本地刷卡启动
     * 1：后台启动
     * 2：本地管理员启动
     */
    private short startupMode;

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

    public short getCurrentType() {
        return currentType;
    }

    public void setCurrentType(short currentType) {
        this.currentType = currentType;
    }

    public short getChargingGunPort() {
        return chargingGunPort;
    }

    public void setChargingGunPort(short chargingGunPort) {
        this.chargingGunPort = chargingGunPort;
    }

    public byte[] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(byte[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardNumber(ByteBuf byteBuf){
        if(cardNumber==null){
            cardNumber=new byte[MessageFieldConst.CARD_NUMBER_FIELD_LENGTH];
        }
        byteBuf.readBytes(cardNumber);
    }

    public byte[] getStartTime() {
        return startTime;
    }

    public void setStartTime(byte[] startTime) {
        this.startTime = startTime;
    }

    public void setStartTime(ByteBuf byteBuf){
        if(startTime==null){
            startTime=new byte[MessageFieldConst.DATETIME_FIELD_LENGTH];
        }
        byteBuf.readBytes(startTime);
    }

    public byte[] getEndTime() {
        return endTime;
    }

    public void setEndTime(byte[] endTime) {
        this.endTime = endTime;
    }

    public void setEndTime(ByteBuf byteBuf){
        if(endTime==null){
            endTime=new byte[MessageFieldConst.DATETIME_FIELD_LENGTH];
        }
        byteBuf.readBytes(endTime);
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public short getStartSoc() {
        return startSoc;
    }

    public void setStartSoc(short startSoc) {
        this.startSoc = startSoc;
    }

    public short getEndSoc() {
        return endSoc;
    }

    public void setEndSoc(short endSoc) {
        this.endSoc = endSoc;
    }

    public long getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(long terminationReason) {
        this.terminationReason = terminationReason;
    }

    public long getCurrentChargingCapacity() {
        return currentChargingCapacity;
    }

    public void setCurrentChargingCapacity(long currentChargingCapacity) {
        this.currentChargingCapacity = currentChargingCapacity;
    }

    public long getBeforeMeterReading() {
        return beforeMeterReading;
    }

    public void setBeforeMeterReading(long beforeMeterReading) {
        this.beforeMeterReading = beforeMeterReading;
    }

    public long getAfterMeterReading() {
        return afterMeterReading;
    }

    public void setAfterMeterReading(long afterMeterReading) {
        this.afterMeterReading = afterMeterReading;
    }

    public long getCurrentChargingAmount() {
        return currentChargingAmount;
    }

    public void setCurrentChargingAmount(long currentChargingAmount) {
        this.currentChargingAmount = currentChargingAmount;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public long getBeforeBalance() {
        return beforeBalance;
    }

    public void setBeforeBalance(long beforeBalance) {
        this.beforeBalance = beforeBalance;
    }

    public long getCurrentChargingRecordIndex() {
        return currentChargingRecordIndex;
    }

    public void setCurrentChargingRecordIndex(long currentChargingRecordIndex) {
        this.currentChargingRecordIndex = currentChargingRecordIndex;
    }

    public long getTotalChargeRecordEntry() {
        return totalChargeRecordEntry;
    }

    public void setTotalChargeRecordEntry(long totalChargeRecordEntry) {
        this.totalChargeRecordEntry = totalChargeRecordEntry;
    }

    public short getReserve3() {
        return reserve3;
    }

    public void setReserve3(short reserve3) {
        this.reserve3 = reserve3;
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

    public byte[] getVehicleVin() {
        return vehicleVin;
    }

    public void setVehicleVin(byte[] vehicleVin) {
        this.vehicleVin = vehicleVin;
    }

    public void setVehicleVin(ByteBuf byteBuf){
        if(vehicleVin==null){
            vehicleVin=new byte[MessageFieldConst.VEHICLE_VIN_FILED_LENGTH];
        }
        byteBuf.readBytes(vehicleVin);
    }

    public byte[] getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(byte[] licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public void setLicensePlateNumber(ByteBuf byteBuf){
        if(licensePlateNumber==null){
            licensePlateNumber=new byte[MessageFieldConst.LICENSE_PLATE_NUMBER_FILED_LENGTH];
        }
        byteBuf.readBytes(licensePlateNumber);
    }

    public int[] getPeriodElectricity() {
        return periodElectricity;
    }

    public void setPeriodElectricity(int[] periodElectricity) {
        this.periodElectricity = periodElectricity;
    }

    public void setPeriodElectricity(ByteBuf byteBuf){
        if(periodElectricity==null){
            periodElectricity=new int[MessageFieldConst.PERIOD_ELECTRICITY_FILED_LENGTH];
        }
        for(int i=0;i<periodElectricity.length;i++){
            periodElectricity[i]=byteBuf.readUnsignedShortLE();
        }
    }

    public short getStartupMode() {
        return startupMode;
    }

    public void setStartupMode(short startupMode) {
        this.startupMode = startupMode;
    }

    @Override
    public ChargingRecordClientMessageBody decoder() {
        ByteBuf body=getBody();
        setReserve1(body.readUnsignedShortLE());
        setReserve2(body.readUnsignedShortLE());
        setCode(body);
        setCurrentType(body.readUnsignedByte());
        setChargingGunPort(body.readUnsignedByte());
        setCardNumber(body);
        setStartTime(body);
        setEndTime(body);
        setDuration(body.readUnsignedIntLE());
        setStartSoc(body.readUnsignedByte());
        setEndSoc(body.readUnsignedByte());
        setTerminationReason(body.readUnsignedIntLE());
        setCurrentChargingCapacity(body.readUnsignedIntLE());
        setBeforeMeterReading(body.readUnsignedIntLE());
        setAfterMeterReading(body.readUnsignedIntLE());
        setCurrentChargingAmount(body.readUnsignedIntLE());
        setIndex(body.readUnsignedIntLE());
        setBeforeBalance(body.readUnsignedIntLE());
        setCurrentChargingRecordIndex(body.readUnsignedIntLE());
        setTotalChargeRecordEntry(body.readUnsignedIntLE());
        setReserve3(body.readUnsignedByte());
        setChargingStrategy(body.readUnsignedByte());
        setChargingStrategyParam(body.readUnsignedIntLE());
        setVehicleVin(body);
        setLicensePlateNumber(body);
        setPeriodElectricity(body);
        setStartupMode(body.readUnsignedByte());
        return this;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.CHARGING_RECORD_CMD;
    }
}
