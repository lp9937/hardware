package com.hardware.server.service.charging.message.body.response;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageBody;
import io.netty.buffer.ByteBuf;

@MessageRegister(command = CommandEnum.SIGN_RESPONSE_CMD)
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

    @Override
    public Object decoder(ByteBuf byteBuf) {
        return null;
    }

    @Override
    public HardwareEnum getHardwareType() {
        return null;
    }
}
