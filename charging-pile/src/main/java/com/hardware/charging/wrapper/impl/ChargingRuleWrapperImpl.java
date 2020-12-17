package com.hardware.charging.wrapper.impl;

import com.hardware.charging.pojo.domain.ChargingRuleDo;
import com.hardware.charging.pojo.dto.ChargingRuleDto;
import com.hardware.charging.pojo.info.ChargingRuleInfo;
import com.hardware.charging.service.impl.ChargingRuleServiceImpl;
import com.hardware.charging.wrapper.ChargingRuleWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingRuleWrapperImpl
        extends BaseWrapperImpl<ChargingRuleInfo, ChargingRuleDto, ChargingRuleDo>
        implements ChargingRuleWrapper {
    private final ChargingRuleServiceImpl chargingRuleService;
}
