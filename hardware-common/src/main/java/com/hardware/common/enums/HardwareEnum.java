package com.hardware.common.enums;

public enum HardwareEnum implements IBaseEnum<Integer> {
    CHARGING_PILE(0,"充电桩"),



    ALL(99,"所有设备")
    ;

    HardwareEnum(int code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public static HardwareEnum getInstance(int code){
        for (HardwareEnum type:values()) {
            if(type.getCode()==code){
                return type;
            }
        }
        return null;
    }

    private int code;
    private String desc;

    public Integer getCode(){
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
