package com.hardware.charging.service.impl;

import com.hardware.charging.mapper.ChargingRuleMapper;
import com.hardware.charging.pojo.domain.ChargingRuleDo;
import com.hardware.charging.pojo.model.ChargingRule;
import com.hardware.charging.service.ChargingRuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingRuleServiceImpl
        extends BaseServiceImpl<ChargingRuleDo, ChargingRule>
        implements ChargingRuleService {
    private final ChargingRuleMapper chargingRuleMapper;
}
