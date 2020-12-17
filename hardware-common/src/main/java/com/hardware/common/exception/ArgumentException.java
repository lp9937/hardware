package com.hardware.common.exception;

import com.hardware.common.enums.IBaseEnum;

/**
 * Created by lp on 2020/12/03
 * 参数异常定义
 */
public class ArgumentException extends RuntimeException {
    private IBaseEnum exceptionCode;
    public ArgumentException(IBaseEnum exceptionCode) {
        super(exceptionCode.getDesc());
        this.exceptionCode = exceptionCode;
    }

    public ArgumentException(IBaseEnum exceptionCode,String message){
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public ArgumentException(String message) {
        super(message);
    }

    public ArgumentException(Throwable cause) {
        super(cause);
    }

    public ArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public IBaseEnum getExceptionCode(){
        return exceptionCode;
    }
}
