package com.hardware.server.service.charging.message;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.netty.message.AbstractNettyMessage;

/**
 * 充电桩消息包
 * @param <B> 充电桩消息体
 */
public class ChargingPileMessage<B extends ChargingPileMessageBody> extends
        AbstractNettyMessage<ChargingPileMessageHead,B> {
    @Override
    public HardwareEnum getHardwareType() {
        return HardwareEnum.CHARGING_PILE;
    }

    /**
     * 充电桩校验位
     */
    private byte check;

    public byte getCheck() {
        return check;
    }

    public void setCheck(byte check) {
        this.check = check;
    }
}
