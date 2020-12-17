package com.hardware.charging.controller;

import com.hardware.charging.pojo.dto.ChargingGunDto;
import com.hardware.charging.pojo.info.ChargingGunInfo;
import com.hardware.charging.service.ChargingGunService;
import com.hardware.charging.wrapper.ChargingGunWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/charging-gun")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingGunController extends
        BaseController<ChargingGunInfo, ChargingGunDto> {
    private final ChargingGunService chargingGunService;

}