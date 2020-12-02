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
    public static final int HEAD_LENGTH =8;
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
     * 预留字段1(占2字节)+预留字段2(占2字节)+心跳应答(占2字节)
     */
    public static final int HEARTBEAT_RESPONSE_MESSAGE_BODY_LENGTH=6;
    /**
     * 签到响应消息体占用字节数
     * 预留字段1(占2字节)+预留字段2(占2字节)
     */
    public static final int SIGN_IN_RESPONSE_MESSAGE_BODY_LENGTH=4;
    /**
     * 充电/预约卡号字段占用字节数
     */
    public static final int CARD_NUMBER_FIELD_LENGTH=32;
    /**
     * 状态响应消息消息体长度
     */
    public static final int STATE_RESPONSE_MESSAGE_BODY_LENGTH=45;
    /**
     * 开启充电控制命令消息体长度
     */
    public static final int START_CHARGING_CONTROL_MESSAGE_BODY_LENGTH=67;
    /**
     * 开启充电控制命令响应消息体长度
     */
    public static final int START_CHARGING_CONTROL_RESPONSE_MESSAGE_BODY_LENGTH=41;
    /**
     * 控制命令消息体长度，不包含命令参数的长度
     */
    public static final int CONTROL_COMMAND_MESSAGE_BODY_LENGTH=12;
    /**
     * 车辆VIN长度
     */
    public static final int VEHICLE_VIN_FILED_LENGTH=17;
    /**
     * 车牌号字段长度
     */
    public static final int LICENSE_PLATE_NUMBER_FILED_LENGTH=8;
    /**
     * 时段电量字段长度
     */
    public static final int PERIOD_ELECTRICITY_FILED_LENGTH=48;
    /**
     * 电费计价策略命令，定义最大6个时间时段
     */
    public static final int ELECTRICITY_PRICE_STRATEGY_UNIT_FILED_LENGTH=6;
    /**
     * 电费计价策略命令消息体长度
     */
    public static final int ELECTRICITY_PRICE_STRATEGY_MESSAGE_BODY_LENGTH=48;

    private MessageFieldConst(){

    }
}
