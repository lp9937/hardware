package com.hardware.charging.controller;

import com.hardware.charging.pojo.dto.ChargingPileDto;
import com.hardware.charging.pojo.info.ChargingPileInfo;
import com.hardware.charging.service.ChargingPileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/charging-pile")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingPileController extends
        BaseController<ChargingPileInfo, ChargingPileDto> {
    private final ChargingPileService chargingPileService;
}
