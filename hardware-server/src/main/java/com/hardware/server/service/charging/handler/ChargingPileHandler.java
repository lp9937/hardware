package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.HardwareHandleRegister;
import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.netty.handler.AbstractHardwareHandler;
import org.springframework.stereotype.Component;

@Component
@HardwareHandleRegister
public class ChargingPileHandler extends AbstractHardwareHandler {
    @Override
    public HardwareEnum getType() {
        return HardwareEnum.CHARGING_PILE;
    }
}
