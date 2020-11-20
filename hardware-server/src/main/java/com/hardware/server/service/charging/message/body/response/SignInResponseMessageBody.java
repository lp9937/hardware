package com.hardware.server.service.charging.message.body.response;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

@MessageRegister(command = CommandEnum.SIGN_RESPONSE_CMD)
public class SignInResponseMessageBody extends ChargingPileResponseMessageBody {
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
    public SignInResponseMessageBody encoder() {
        ByteBuf bodyByteBuf
                =Unpooled.buffer(MessageFieldConst.SIGN_IN_RESPONSE_MESSAGE_BODY_LENGTH);
        bodyByteBuf.writeByte(reserve1);
        bodyByteBuf.writeByte(reserve2);
        return this;
    }
}
