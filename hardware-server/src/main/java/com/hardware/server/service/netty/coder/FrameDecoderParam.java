package com.hardware.server.service.netty.coder;

import com.hardware.server.service.IHardwareType;

public abstract class FrameDecoderParam implements IHardwareType {
    /**
     * 获取帧最大长度字节
     * @return
     */
    public abstract int getMaxFrameLength();

    /**
     * 获取长度偏移字节
     * @return
     */
    public abstract int getLengthFieldOffset();

    /**
     * 获取长度字段占用字节
     * @return
     */
    public abstract int getLengthFieldLength();

    /**
     *
     * @return
     */
    public abstract int getLengthAdjustment();

    /**
     *
     * @return
     */
    public abstract int getInitialBytesToStrip();
}
