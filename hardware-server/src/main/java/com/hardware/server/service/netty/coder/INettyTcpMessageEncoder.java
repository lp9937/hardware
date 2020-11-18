package com.hardware.server.service.netty.coder;

import com.hardware.server.service.IHardwareType;
import io.netty.buffer.ByteBuf;

public interface INettyTcpMessageEncoder<T> extends IHardwareType {
    ByteBuf encoder(T t);
}
