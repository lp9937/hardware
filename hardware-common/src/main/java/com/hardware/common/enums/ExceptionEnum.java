package com.hardware.common.enums;

public enum ExceptionEnum implements IBaseEnum<Long> {
    UNRECOGNIZED_PACKAGE(0,"不识别的包"),
    ;

    ExceptionEnum(long code, String message){
        this.code=code;
        this.message=message;
    }

    private long code;
    private String message;

    @Override
    public Long getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return message;
    }
}
