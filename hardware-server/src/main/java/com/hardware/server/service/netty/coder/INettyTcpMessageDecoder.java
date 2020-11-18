package com.hardware.server.service.netty.coder;

import com.hardware.server.service.IHardwareType;
import io.netty.buffer.ByteBuf;

public interface INettyTcpMessageDecoder<T> extends IHardwareType {
    T decoder(ByteBuf byteBuf);
}
