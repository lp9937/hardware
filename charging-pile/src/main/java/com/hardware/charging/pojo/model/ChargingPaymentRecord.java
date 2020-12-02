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
public class ChargingPaymentRecord extends ModelBase implements Serializable {
    /**
    * 充电纪录id
     *
     * @mbg.generated
     */
    private Integer chargingRecordId;

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
    * 支付渠道
     *
     * @mbg.generated
     */
    private Byte paymentChannel;

    /**
    * 支付方式
     *
     * @mbg.generated
     */
    private Byte paymentMethod;

    /**
    * 应缴金额
     *
     * @mbg.generated
     */
    private BigDecimal shouldAmount;

    /**
    * 实缴金额
     *
     * @mbg.generated
     */
    private BigDecimal actualAmount;

    /**
    * 优惠金额
     *
     * @mbg.generated
     */
    private BigDecimal discountAmount;

    /**
    * 是否减免(0：否，1：是)
     *
     * @mbg.generated
     */
    private Boolean isReduction;

    /**
    * 减免规则id
     *
     * @mbg.generated
     */
    private Integer reductionRuleId;

    /**
    * 是否已退款(0：否，1：是)
     *
     * @mbg.generated
     */
    private Boolean isRefund;

    /**
    * 退款金额
     *
     * @mbg.generated
     */
    private BigDecimal refundAmount;

    /**
    * 支付流水号
     *
     * @mbg.generated
     */
    private String serialNumber;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chargingRecordId=").append(chargingRecordId);
        sb.append(", chargingStartTime=").append(chargingStartTime);
        sb.append(", chargingEndTime=").append(chargingEndTime);
        sb.append(", paymentChannel=").append(paymentChannel);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", shouldAmount=").append(shouldAmount);
        sb.append(", actualAmount=").append(actualAmount);
        sb.append(", discountAmount=").append(discountAmount);
        sb.append(", isReduction=").append(isReduction);
        sb.append(", reductionRuleId=").append(reductionRuleId);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", serialNumber=").append(serialNumber);
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