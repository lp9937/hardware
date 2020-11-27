package com.hardware.common.constant;

import io.netty.util.AttributeKey;

public final class HardwareConstant {
    private HardwareConstant(){

    }

    public static final String ATTRIBUTE_SESSION_KEY="session";


    public final static AttributeKey<Integer> HARDWARE_TYPE =AttributeKey.valueOf("hardware_type");
    public final static AttributeKey<Long> CHANNEL_SESSION_ID =AttributeKey.valueOf("channel_session_id");
}
