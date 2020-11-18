package com.hardware.common.enums;

public enum HardwareType {
    CHARGING_PILE(0,"充电桩")

    ;

    HardwareType(int code,String desc){
        this.code=code;
        this.desc=desc;
    }

    public static HardwareType getInstance(int code){
        for (HardwareType type:values()) {
            if(type.getCode()==code){
                return type;
            }
        }
        return null;
    }

    private int code;
    private String desc;
    public int getCode(){
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
