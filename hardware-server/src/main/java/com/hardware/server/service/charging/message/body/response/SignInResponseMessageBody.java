package com.hardware.server.service.charging.message.body.response;

import com.hardware.server.service.charging.message.ChargingPileMessageBody;

public class SignInResponseMessageBody extends ChargingPileMessageBody {
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
}
