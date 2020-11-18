package com.hardware.server.service.charging.message.body.request;

import com.hardware.server.service.charging.message.ChargingPileMessageBody;

public class HeartbeatRequestMessageBody extends ChargingPileMessageBody {
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
     * 心跳序号
     * 占2字节
     */
    private short SerialNumber;

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

    public short getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(short serialNumber) {
        SerialNumber = serialNumber;
    }
}
