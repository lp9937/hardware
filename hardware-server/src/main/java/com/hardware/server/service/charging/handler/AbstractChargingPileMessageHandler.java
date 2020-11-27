package com.hardware.server.service.charging.handler;

import com.hardware.common.constant.HardwareConstant;
import com.hardware.server.service.charging.message.ChargingPileMessage;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.request.ChargingPileRequestMessageBody;
import com.hardware.server.service.charging.message.body.response.ChargingPileResponseMessageBody;
import com.hardware.server.service.netty.handler.AbstractMessageHandler;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import com.hardware.server.service.netty.session.ISession;

public abstract class AbstractChargingPileMessageHandler<Q extends ChargingPileRequestMessageBody,
        P extends ChargingPileResponseMessageBody> extends AbstractMessageHandler {

    public byte computeCheck(ChargingPileMessage<P> response) {
        return 0;
    }

    @Override
    public void handle(AbstractNettyMessage message) {
        ISession session=(ISession)message.getAttribute(HardwareConstant.ATTRIBUTE_SESSION_KEY);
        ChargingPileMessage<Q> request=(ChargingPileMessage<Q>)message;
        ChargingPileMessageHead head= headHandle(request.getMessageHead());

        ChargingPileMessage<P> response=
                new ChargingPileMessage<>();
        response.setMessageHead(head);
        P body=bodyHandle(request.getMessageBody());
        response.setMessageBody(body);

        response.setCheck(computeCheck(response));
        session.write(response);
    }

    protected abstract ChargingPileMessageHead headHandle(ChargingPileMessageHead head);

    protected abstract P bodyHandle(Q body);
}
