package com.hardware.charging.pojo.info;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * 开始充电信息
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ChargingStartInfo {
    // @Valid属于javax下的,而@Validated属于spring下;
    // @Valid支持嵌套校验,而@Validated不支持;
    // @Validated支持分组,而@Valid不支持。
    /**
     * 流水号
     */
    @NotBlank(message = "流水号不能为空")
    private String serialNo;
    /**
     * 充电桩编号
     */
    @NotBlank(message="充电桩编号不能为空")
    private String code;
    /**
     * 充电生效类型
     * 0:即时充电
     * 1:定时启动充电
     * 2:预约充电
     */
    @Range(min = 0,max = 2,message ="充电生效类型取值范围为[0,2]")
    private Integer effectiveType=0;
    /**
     * 充电策略
     * 0:充满为止
     * 1:时间控制充电
     * 2:金额控制充电
     * 3:电量控制充电
     */
    @Range(min=0,max=3,message = "充电策略取值范围为[0,3]")
    private Integer chargingStrategy=0;
    /**
     * 充电策略参数
     * 时间单位为 1 秒
     * 金额单位为 0.01 元
     * 电量时单位为 0.01kw
     */
    @NotNull(message="充电策略参数不能为空")
    private Integer chargingStrategyParam;
    /**
     * 用户卡号/用户识别号
     */
    @NotBlank(message="用户识别号不能为空")
    @Size(max=16,message = "用户识别号最大长度为16")
    private String cardNumber;
}
