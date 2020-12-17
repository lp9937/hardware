package com.hardware.charging.controller;

import com.hardware.charging.pojo.dto.ChargingRecordDto;
import com.hardware.charging.pojo.info.ChargingRecordInfo;
import com.hardware.charging.service.ChargingRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/charging-record")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingRecordController extends
        BaseController<ChargingRecordInfo, ChargingRecordDto> {
    private final ChargingRecordService chargingRecordService;
}
