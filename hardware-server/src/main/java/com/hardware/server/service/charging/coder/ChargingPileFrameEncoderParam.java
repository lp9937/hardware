package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
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
        return MessageFieldConst.LENGTH_FIELD_LENGTH;
    }

    @Override
    public boolean isLengthIncludesLengthFieldLength() {
        return true;
    }

    @Override
    public int getLengthAdjustment() {
        return MessageFieldConst.LENGTH_FIELD_LENGTH+MessageFieldConst.START_FIELD_LENGTH;
    }

    @Override
    public int getStartFieldValue() {
        return MessageFieldConst.START_FIELD_VALUE;
    }

    @Override
    public int getStartFieldLength() {
        return MessageFieldConst.START_FIELD_LENGTH;
    }

    @Override
    public boolean isLengthIncludesStartFieldLength() {
        return true;
    }
}
