package com.hardware.charging.controller;

import com.hardware.charging.pojo.dto.ChargingRuleDto;
import com.hardware.charging.pojo.info.ChargingRuleInfo;
import com.hardware.charging.service.ChargingRuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/charging-rule")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingRuleController extends
        BaseController<ChargingRuleInfo, ChargingRuleDto> {
    private final ChargingRuleService chargingRuleService;
}
