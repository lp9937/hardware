package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.client.StatusClientMessageBody;
import com.hardware.server.service.charging.message.body.server.StatusServerMessageBody;
import org.springframework.stereotype.Component;

@Component
@MessageHandleRegister("CHARGING_PILE")
public class StatusMessageHandler extends
        AbstractChargingPileMessageHandler<StatusClientMessageBody, StatusServerMessageBody> {
    @Override
    protected ChargingPileMessageHead headHandle(ChargingPileMessageHead head) {
        return head.setCommandType(CommandEnum.STATE_SERVER_CMD.getCode());
    }

    @Override
    protected StatusServerMessageBody bodyHandle(StatusClientMessageBody body) {
        StatusServerMessageBody responseBody=new StatusServerMessageBody();
        responseBody.setChargingPort(body.getChargingPort());
        //todo 后台计费需要设置以下字段
        responseBody.setCardNumber(body.getCardNumber());
        responseBody.setBalance(0);
        responseBody.setCurrentChargingCharge(0);
        return responseBody;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.STATE_SERVER_CMD;
    }

    @Override
    public CommandEnum getReqCommand() {
        return CommandEnum.STATE_CMD;
    }
}
