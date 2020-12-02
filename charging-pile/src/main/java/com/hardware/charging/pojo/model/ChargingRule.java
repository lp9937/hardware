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
public class ChargingRule extends ModelBase implements Serializable {
    /**
    * 车场id
     *
     * @mbg.generated
     */
    private Integer parkingId;

    /**
    * 分段计费开始时间
     *
     * @mbg.generated
     */
    private Date sectionStart;

    /**
    * 分段计费结束时间
     *
     * @mbg.generated
     */
    private Date sectionEnd;

    /**
    * 分段计费子序列号
     *
     * @mbg.generated
     */
    private String subSerialNumber;

    /**
    * 计费单位
     *
     * @mbg.generated
     */
    private Byte chargeUnit;

    /**
    * 单位费用
     *
     * @mbg.generated
     */
    private BigDecimal unitCost;

    /**
    * 最高费用
     *
     * @mbg.generated
     */
    private BigDecimal ceilingCost;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parkingId=").append(parkingId);
        sb.append(", sectionStart=").append(sectionStart);
        sb.append(", sectionEnd=").append(sectionEnd);
        sb.append(", subSerialNumber=").append(subSerialNumber);
        sb.append(", chargeUnit=").append(chargeUnit);
        sb.append(", unitCost=").append(unitCost);
        sb.append(", ceilingCost=").append(ceilingCost);
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