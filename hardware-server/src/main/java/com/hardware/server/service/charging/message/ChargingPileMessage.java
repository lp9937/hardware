package com.hardware.server.service.charging.message;

import com.hardware.common.enums.CommandEnum;
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
     * 占1字节
     */
    private short check;

    public short getCheck() {
        return check;
    }

    public void setCheck(short check) {
        this.check = check;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.getInstance(getMessageHead().getCommandType());
    }
}
