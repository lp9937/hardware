package com.hardware.server.service.netty.coder;

import com.hardware.server.service.IHardwareType;

public abstract class FrameEncoderParam implements IHardwareType {
    /**
     * 获取长度字段占用字节
     * @return
     */
    public abstract int getLengthFieldLength();

    /**
     * 长度是否包含长度字段的长度
     * @return
     */
    public abstract boolean isLengthIncludesLengthFieldLength();

    public abstract int getLengthAdjustment();

    /**
     * 获取帧起始字段的值
     * @return
     */
    public abstract int getStartFieldValue();

    /**
     * 获取起始字段占用字节
     * @return
     */
    public abstract int getStartFieldLength();

    /**
     * 长度是否包含起始字段占用的字节
     * @return
     */
    public abstract boolean isLengthIncludesStartFieldLength();
}
