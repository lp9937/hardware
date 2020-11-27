package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.request.StatusRequestMessageBody;
import com.hardware.server.service.charging.message.body.response.StatusResponseMessageBody;
import org.springframework.stereotype.Component;

@Component
@MessageHandleRegister("CHARGING_PILE")
public class StatusMessageHandler extends
        AbstractChargingPileMessageHandler<StatusRequestMessageBody, StatusResponseMessageBody> {
    @Override
    protected ChargingPileMessageHead headHandle(ChargingPileMessageHead head) {
        return head.setCommandType(CommandEnum.STATE_RESPONSE_CMD.getCode());
    }

    @Override
    protected StatusResponseMessageBody bodyHandle(StatusRequestMessageBody body) {
        StatusResponseMessageBody responseBody=new StatusResponseMessageBody();
        responseBody.setChargingPort(body.getChargingPort());
        //todo 后台计费需要设置以下字段
        responseBody.setCardNumber(body.getCardNumber());
        responseBody.setBalance(0);
        responseBody.setCurrentChargingCharge(0);
        return responseBody;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.STATE_RESPONSE_CMD;
    }

    @Override
    public CommandEnum getReqCommand() {
        return CommandEnum.STATE_CMD;
    }
}
