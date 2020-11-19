package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.netty.coder.FrameDecoderParam;
import org.springframework.stereotype.Component;

@Component
public class ChargingPileFrameDecoderParam extends FrameDecoderParam {
    private static final HardwareEnum HARDWARE_ENUM = HardwareEnum.CHARGING_PILE;
    @Override
    public HardwareEnum getHardwareType() {
        return HARDWARE_ENUM;
    }

    @Override
    public int getMaxFrameLength() {
        return 0;
    }

    @Override
    public int getLengthFieldOffset() {
        return 0;
    }

    @Override
    public int getLengthFieldLength() {
        return 0;
    }

    @Override
    public int getLengthAdjustment() {
        return 0;
    }

    @Override
    public int getInitialBytesToStrip() {
        return 0;
    }
}
