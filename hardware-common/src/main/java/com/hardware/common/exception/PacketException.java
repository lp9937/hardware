package com.hardware.common.exception;

import com.hardware.common.enums.IBaseEnum;

/**
 * 自定义数据包异常
 * Created by lp on 2020/11/18
 */
public class PacketException extends RuntimeException {
    private IBaseEnum exceptionCode;

    public PacketException(IBaseEnum exceptionCode) {
        super(exceptionCode.getDesc());
        this.exceptionCode = exceptionCode;
    }

    public PacketException(String message) {
        super(message);
    }

    public PacketException(Throwable cause) {
        super(cause);
    }

    public PacketException(String message, Throwable cause) {
        super(message, cause);
    }

    public IBaseEnum getExceptionCode(){
        return exceptionCode;
    }
}
