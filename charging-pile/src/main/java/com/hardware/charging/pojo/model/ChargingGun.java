package com.hardware.charging.pojo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ChargingGun extends ModelBase implements Serializable {
    /**
    * 充电桩id
     *
     * @mbg.generated
     */
    private Integer chargingPileId;

    /**
    * 充电枪类型（1：交流，2：直流）
     *
     * @mbg.generated
     */
    private Byte chargingGunType;

    /**
    * 充电抢状态(1:空闲状态，2:工作状态)
     *
     * @mbg.generated
     */
    private Byte chargingGunStatus;

    /**
    * 与车连接状态（1：断开 2：半连接 3：连接）
     *
     * @mbg.generated
     */
    private Byte connectionStatus;

    /**
    * 充电电压
     *
     * @mbg.generated
     */
    private Integer chargingVoltage;

    /**
    * 充电电流
     *
     * @mbg.generated
     */
    private Integer chargingCurrent;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chargingPileId=").append(chargingPileId);
        sb.append(", chargingGunType=").append(chargingGunType);
        sb.append(", chargingGunStatus=").append(chargingGunStatus);
        sb.append(", connectionStatus=").append(connectionStatus);
        sb.append(", chargingVoltage=").append(chargingVoltage);
        sb.append(", chargingCurrent=").append(chargingCurrent);
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