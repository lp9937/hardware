package com.hardware.server.service.charging.message.body.response;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.springframework.stereotype.Component;

@Component
@MessageRegister
public class SignInResponseMessageBody extends ChargingPileResponseMessageBody {
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

    @Override
    public SignInResponseMessageBody encoder() {
        ByteBuf bodyByteBuf
                =Unpooled.buffer(MessageFieldConst.SIGN_IN_RESPONSE_MESSAGE_BODY_LENGTH);
        bodyByteBuf.writeShortLE(reserve1);
        bodyByteBuf.writeShortLE(reserve2);
        setBody(bodyByteBuf);
        return this;
    }

    @Override
    public int getLength() {
        return MessageFieldConst.SIGN_IN_RESPONSE_MESSAGE_BODY_LENGTH;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.SIGN_RESPONSE_CMD;
    }
}
