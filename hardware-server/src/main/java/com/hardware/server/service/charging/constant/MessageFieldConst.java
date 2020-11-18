package com.hardware.server.service.charging.constant;

public final class MessageFieldConst {
    /**
     * 起始字段的值
     */
    public static final int START_FIELD_VALUE=0xAAF5;
    /**
     * 版本字段的值
     */
    public static final byte VERSION_FIELD_VALUE=0x10;
    /**
     * 起始字段占用字节数
     */
    public static final int START_FIELD_LENGTH=2;
    /**
     * 长度字段占用字节数
     */
    public static final int LENGTH_FIELD_LENGTH=2;
    /**
     * 消息头长度
     * 2字节起始字段+2字节长度字段+1字节版本字段+1字节序列号字段+2命令字段
     */
    public static final int MESSAGE_HEAD_LENGTH=8;
    /**
     * 校验字段占用字节数
     */
    public static final int CHECK_FIELD_LENGTH=1;

    /**
     * 充电桩编码字段占用字节数
     */
    public static final int CODE_FIELD_LENGTH =32;
    /**
     * 时间字段占用字节数
     */
    public static final int DATETIME_FIELD_LENGTH=8;
    /**
     * 心跳响应消息体占用字节数
     */
    public static final int HEARTBEAT_RESPONSE_MESSAGE_BODY_LENGTH=6;

    private MessageFieldConst(){

    }
}
