package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.request.SignInRequestMessageBody;
import com.hardware.server.service.charging.message.body.response.SignInResponseMessageBody;
import org.springframework.stereotype.Component;

@Component
@MessageHandleRegister("CHARGING_PILE")
public class SignInMessageHandler extends
        AbstractChargingPileMessageHandler<SignInRequestMessageBody,SignInResponseMessageBody> {
    @Override
    public CommandEnum getCommand() {
        return CommandEnum.SIGN_RESPONSE_CMD;
    }

    @Override
    public CommandEnum getReqCommand() {
        return CommandEnum.SIGN_CMD;
    }

    @Override
    protected ChargingPileMessageHead headHandle(
            ChargingPileMessageHead head) {
        return head.setCommandType(CommandEnum.SIGN_RESPONSE_CMD.getCode());
    }

    @Override
    protected SignInResponseMessageBody bodyHandle(SignInRequestMessageBody body) {
        return new SignInResponseMessageBody();
    }
}
