package com.hardware.server.service.charging.coder;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.netty.coder.FrameDecoderParam;
import org.springframework.stereotype.Component;

import java.nio.ByteOrder;
import java.security.PrivateKey;

@Component
public class ChargingPileFrameDecoderParam extends FrameDecoderParam {
    private static final HardwareEnum HARDWARE_ENUM = HardwareEnum.CHARGING_PILE;
    private static final int MAX_FRAME_LENGTH=0x8000;
    private static final int LENGTH_FIELD_OFFSET=2;
    private static final int LENGTH_FIELD_LENGTH=2;
    private static final int LENGTH_ADJUSTMENT=-4;
    private static final int INITIAL_BYTES_TO_STRIP=0;
    @Override
    public HardwareEnum getHardwareType() {
        return HARDWARE_ENUM;
    }

    @Override
    public int getMaxFrameLength() {
        return MAX_FRAME_LENGTH;
    }

    @Override
    public int getLengthFieldOffset() {
        return LENGTH_FIELD_OFFSET;
    }

    @Override
    public int getLengthFieldLength() {
        return LENGTH_FIELD_LENGTH;
    }

    @Override
    public int getLengthAdjustment() {
        return LENGTH_ADJUSTMENT;
    }

    @Override
    public int getInitialBytesToStrip() {
        return INITIAL_BYTES_TO_STRIP;
    }

    /**
     * 大端序：高位字节存放在内存的低地址，低位字节存放在内存的高地址
     * 小端序：低位字节存放在内存的低地址，高位字节存放在内存的高地址
     * @return
     */
    @Override
    public ByteOrder getByteOrder() {
        return ByteOrder.LITTLE_ENDIAN;
    }
}
