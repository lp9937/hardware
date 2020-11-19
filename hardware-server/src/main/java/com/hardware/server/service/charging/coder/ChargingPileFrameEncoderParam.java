package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.netty.coder.FrameEncoderParam;
import org.springframework.stereotype.Component;

@Component
public class ChargingPileFrameEncoderParam extends FrameEncoderParam {
    private static final HardwareEnum HARDWARE_ENUM = HardwareEnum.CHARGING_PILE;
    @Override
    public HardwareEnum getHardwareType() {
        return HARDWARE_ENUM;
    }

    @Override
    public int getLengthFieldLength() {
        return 0;
    }

    @Override
    public boolean isLengthIncludesLengthFieldLength() {
        return false;
    }

    @Override
    public int getLengthAdjustment() {
        return 0;
    }

    @Override
    public int getStartFieldValue() {
        return 0;
    }

    @Override
    public int getStartFieldLength() {
        return 0;
    }

    @Override
    public boolean isLengthIncludesStartFieldLength() {
        return false;
    }
}
