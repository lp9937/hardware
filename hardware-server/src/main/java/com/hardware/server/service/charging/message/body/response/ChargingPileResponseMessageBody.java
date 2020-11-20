package com.hardware.server.service.charging.message.body.response;

import com.hardware.server.service.charging.message.ChargingPileMessageBody;

public abstract class ChargingPileResponseMessageBody extends ChargingPileMessageBody {
    public abstract ChargingPileResponseMessageBody encoder();
}
