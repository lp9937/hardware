package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.client.SignInClientMessageBody;
import com.hardware.server.service.charging.message.body.server.SignInServerMessageBody;
import org.springframework.stereotype.Component;

@Component
@MessageHandleRegister("CHARGING_PILE")
public class SignInMessageHandler extends
        AbstractChargingPileMessageHandler<SignInClientMessageBody, SignInServerMessageBody> {
    @Override
    public CommandEnum getCommand() {
        return CommandEnum.SIGN_SERVER_CMD;
    }

    @Override
    public CommandEnum getReqCommand() {
        return CommandEnum.SIGN_CMD;
    }

    @Override
    protected ChargingPileMessageHead headHandle(
            ChargingPileMessageHead head) {
        return head.setCommandType(CommandEnum.SIGN_SERVER_CMD.getCode());
    }

    @Override
    protected SignInServerMessageBody bodyHandle(SignInClientMessageBody body) {
        return new SignInServerMessageBody();
    }
}
