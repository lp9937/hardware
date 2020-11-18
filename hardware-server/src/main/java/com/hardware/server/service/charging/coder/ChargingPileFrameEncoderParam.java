package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareType;
import com.hardware.server.service.netty.coder.FrameEncoderParam;
import org.springframework.stereotype.Component;

@Component
public class ChargingPileFrameEncoderParam extends FrameEncoderParam {
    private static final HardwareType hardwareType=HardwareType.CHARGING_PILE;
    @Override
    public HardwareType getHardwareType() {
        return hardwareType;
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
