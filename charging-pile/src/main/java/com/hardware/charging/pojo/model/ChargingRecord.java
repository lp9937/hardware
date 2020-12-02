package com.hardware.charging.pojo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ChargingRecord extends ModelBase implements Serializable {
    /**
    * 充电枪id
     *
     * @mbg.generated
     */
    private Integer chargingGunId;

    /**
    * 充电开始时间
     *
     * @mbg.generated
     */
    private Date chargingStartTime;

    /**
    * 充电结束时间
     *
     * @mbg.generated
     */
    private Date chargingEndTime;

    /**
    * 订单号
     *
     * @mbg.generated
     */
    private String orderNumber;

    /**
    * 充电类型（1：普通类型，2：预约类型）
     *
     * @mbg.generated
     */
    private Byte chargingType;

    /**
    * 收费规则id
     *
     * @mbg.generated
     */
    private Integer chargeRuleId;

    /**
    * 充电预约时间
     *
     * @mbg.generated
     */
    private Date chargingAppointmentTime;

    /**
    * 充电启动方式(1：本地刷卡启动 2：后台启动 3：本地管理员启动)
     *
     * @mbg.generated
     */
    private Byte chargingStartMode;

    /**
    * 充电策略（1：自动充满 2：按时间充 3：按金额充 4：按电量充）
     *
     * @mbg.generated
     */
    private Byte chargingStrategy;

    /**
    * 充电前电表读数
     *
     * @mbg.generated
     */
    private BigDecimal degreeBeforeCharging;

    /**
    * 当前度数
     *
     * @mbg.generated
     */
    private BigDecimal currentDegree;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chargingGunId=").append(chargingGunId);
        sb.append(", chargingStartTime=").append(chargingStartTime);
        sb.append(", chargingEndTime=").append(chargingEndTime);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", chargingType=").append(chargingType);
        sb.append(", chargeRuleId=").append(chargeRuleId);
        sb.append(", chargingAppointmentTime=").append(chargingAppointmentTime);
        sb.append(", chargingStartMode=").append(chargingStartMode);
        sb.append(", chargingStrategy=").append(chargingStrategy);
        sb.append(", degreeBeforeCharging=").append(degreeBeforeCharging);
        sb.append(", currentDegree=").append(currentDegree);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}