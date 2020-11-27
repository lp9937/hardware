package com.hardware.common.enums;

public enum CommandEnum implements IBaseEnum<Integer> {
    HEARTBEAT_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)101,"心跳应答命令"),
    HEARTBEAT_CMD(HardwareEnum.CHARGING_PILE,(short)102,"心跳命令"),
    STATE_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)103,"状态应答命令"),
    STATE_CMD(HardwareEnum.CHARGING_PILE,(short)104,"状态命令"),
    SIGN_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)105,"签到应答命令"),
    SIGN_CMD(HardwareEnum.CHARGING_PILE,(short)106,"签到命令"),
    ALARM_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)107,"告警应答命令"),
    ALARM_CMD(HardwareEnum.CHARGING_PILE,(short)108,"告警命令"),
    CHARGING_RECORD_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)201,"充电纪录应答命令"),
    CHARGING_RECORD_CMD(HardwareEnum.CHARGING_PILE,(short)202,"充电纪录命令"),
    ACCOUNT_QUERY_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)203,"账户查询应答命令"),
    ACCOUNT_QUERY_CMD(HardwareEnum.CHARGING_PILE,(short)204,"账户查询命令"),
    CHARGING_PASS_VALIDATION_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)205,"充电密码验证应答命令"),
    CHARGING_PASS_VALIDATION_CMD(HardwareEnum.CHARGING_PILE,(short)206,"充电密码验证命令"),
    SERVER_REQUEST_BMS_CMD(HardwareEnum.CHARGING_PILE,(short)301,"请求BMS命令"),
    CLIENT_REPORT_BMS_CMD(HardwareEnum.CHARGING_PILE,(short)302,"上报BMS命令"),
    SERVER_RESPONSE_BMS_CMD(HardwareEnum.CHARGING_PILE,(short)303,"应答BMS命令"),
    CLIENT_REPORT_BMS_DEFAULT_CMD(HardwareEnum.CHARGING_PILE,(short)304,"上报BMS命令(默认)"),
    CHARGING_RECORD_QUERY_CMD(HardwareEnum.CHARGING_PILE,(short)401,"充电纪录查询命令"),
    REPORT_CHARGING_RECORD_QUERY_CMD(HardwareEnum.CHARGING_PILE,(short)402,"充电纪录上报命令"),

    ERASE_REQUEST_CMD(HardwareEnum.CHARGING_PILE,(short)1001,"擦除指令命令"),
    ERASE_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1002,"应答擦除指令命令"),
    ISSUE_UPGRADE_FILE_NAME_CMD(HardwareEnum.CHARGING_PILE,(short)1003,"下发升级文件名命令"),
    ISSUE_UPGRADE_FILE_NAME_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1004,"下发升级文件名应答命令"),
    ISSUE_UPGRADE_FILE_SIZE_CMD(HardwareEnum.CHARGING_PILE,(short)1005,"下发升级文件大小命令"),
    ISSUE_UPGRADE_FILE_SIZE_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1006,"下发升级文件大小应答命令"),
    ISSUE_UPGRADE_FILE_DATA_CMD(HardwareEnum.CHARGING_PILE,(short)1007,"下发升级文件数据命令"),
    ISSUE_UPGRADE_FILE_DATA_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1008,"下发升级文件数据应答命令"),
    ISSUE_UPGRADE_FILE_DATA_END_CMD(HardwareEnum.CHARGING_PILE,(short)1009,"下发升级文件数据结束命令"),
    ISSUE_UPGRADE_FILE_DATA_END_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1010,"下发升级文件数据结束应答命令"),
    RESTART_CMD(HardwareEnum.CHARGING_PILE,(short)1011,"重启命令"),
    RESTART_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1012,"重启应答命令"),
    ELECTRICITY_PRICING_STRATEGY_QUERY_CMD(HardwareEnum.CHARGING_PILE,(short)1101,"24小时电费计价策略查询命令"),
    ELECTRICITY_PRICING_STRATEGY_QUERY_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1102,"24小时电费计价策略应答命令"),
    ELECTRICITY_PRICING_STRATEGY_SETTING_CMD(HardwareEnum.CHARGING_PILE,(short)1103,"24小时电费计价策略设置命令"),
    ELECTRICITY_PRICING_STRATEGY_SETTING_RESPONSE_CMD(HardwareEnum.CHARGING_PILE,(short)1104,"24小时电费计价策略设置应答命令"),







    ALL(HardwareEnum.ALL,10000,"所有命令"),
    ;

    CommandEnum(HardwareEnum type,int code, String desc){
        this.type=type;
        this.code=code;
        this.desc=desc;
    }

    public static CommandEnum getInstance(int code){
        for (CommandEnum item:values()) {
            if(item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }

    private HardwareEnum type;
    private int code;
    private String desc;
    public HardwareEnum getType(){
        return type;
    }
    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "CommandEnum{" +
                "type=" + type +
                ", code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
