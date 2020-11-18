package com.hardware.server.service.charging.message.body.request;

import com.hardware.server.service.charging.message.ChargingPileMessageBody;

public class SignInRequestMessageBody extends ChargingPileMessageBody {
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
     * 预留字段
     * 占1字节
     */
    private byte reserve3;
    /**
     * 充电桩软件版本
     * 占4字节
     */
    private int softVersion;
    /**
     * 充电桩项目类型
     * 占2字节
     */
    private short reserve4;
    /**
     * 启动次数
     * 占4字节
     * 终端每次启动，计数保存
     */
    private int startupTime;
    /**
     * 数据上传模式
     * 占1字节
     * 1：应答模式
     * 2：主动上报模式
     */
    private byte uploadMode;
    /**
     * 签到间隔时间，单位分钟
     * 占2字节
     */
    private short signIntervalTime;
    /**
     * 工作模式
     * 占1字节
     * 0：正常工作模式
     * 1：IAP模式
     */
    private byte workingMode;
    /**
     * 充电枪个数
     * 占1字节
     */
    private byte chargingGunNum;
    /**
     * 心跳上报周期
     * 占1字节
     */
    private byte heartbeatPeriod;
    /**
     * 心跳包检测超时次数
     * 占1字节
     */
    private byte heartbeatTimeoutTimes;
    /**
     * 充电纪录数量
     * 占4字节
     */
    private int chargingRecordsNum;
    /**
     * 当前充电桩系统时间
     * 占8字节
     */
    private byte[] dateTime;
    /**
     * 预留
     * 占8字节
     */
    private byte[] reserve5;
    /**
     * 预留
     * 占8字节
     */
    private byte[] reserve6;
    /**
     * 预留
     * 占8字节
     */
    private byte[] reserve7;

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

    public byte getReserve3() {
        return reserve3;
    }

    public void setReserve3(byte reserve3) {
        this.reserve3 = reserve3;
    }

    public int getSoftVersion() {
        return softVersion;
    }

    public void setSoftVersion(int softVersion) {
        this.softVersion = softVersion;
    }

    public short getReserve4() {
        return reserve4;
    }

    public void setReserve4(short reserve4) {
        this.reserve4 = reserve4;
    }

    public int getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(int startupTime) {
        this.startupTime = startupTime;
    }

    public byte getUploadMode() {
        return uploadMode;
    }

    public void setUploadMode(byte uploadMode) {
        this.uploadMode = uploadMode;
    }

    public short getSignIntervalTime() {
        return signIntervalTime;
    }

    public void setSignIntervalTime(short signIntervalTime) {
        this.signIntervalTime = signIntervalTime;
    }

    public byte getWorkingMode() {
        return workingMode;
    }

    public void setWorkingMode(byte workingMode) {
        this.workingMode = workingMode;
    }

    public byte getChargingGunNum() {
        return chargingGunNum;
    }

    public void setChargingGunNum(byte chargingGunNum) {
        this.chargingGunNum = chargingGunNum;
    }

    public byte getHeartbeatPeriod() {
        return heartbeatPeriod;
    }

    public void setHeartbeatPeriod(byte heartbeatPeriod) {
        this.heartbeatPeriod = heartbeatPeriod;
    }

    public byte getHeartbeatTimeoutTimes() {
        return heartbeatTimeoutTimes;
    }

    public void setHeartbeatTimeoutTimes(byte heartbeatTimeoutTimes) {
        this.heartbeatTimeoutTimes = heartbeatTimeoutTimes;
    }

    public int getChargingRecordsNum() {
        return chargingRecordsNum;
    }

    public void setChargingRecordsNum(int chargingRecordsNum) {
        this.chargingRecordsNum = chargingRecordsNum;
    }

    public byte[] getDateTime() {
        return dateTime;
    }

    public void setDateTime(byte[] dateTime) {
        this.dateTime = dateTime;
    }

    public byte[] getReserve5() {
        return reserve5;
    }

    public void setReserve5(byte[] reserve5) {
        this.reserve5 = reserve5;
    }

    public byte[] getReserve6() {
        return reserve6;
    }

    public void setReserve6(byte[] reserve6) {
        this.reserve6 = reserve6;
    }

    public byte[] getReserve7() {
        return reserve7;
    }

    public void setReserve7(byte[] reserve7) {
        this.reserve7 = reserve7;
    }
}
