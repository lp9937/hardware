package com.hardware.charging.controller;

import com.hardware.charging.pojo.dto.ChargingPaymentRecordDto;
import com.hardware.charging.pojo.info.ChargingPaymentRecordInfo;
import com.hardware.charging.service.ChargingPaymentRecordService;
import com.hardware.charging.wrapper.impl.ChargingPaymentRecordWrapperImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/payment-record")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingPaymentRecordController extends
        BaseController<ChargingPaymentRecordInfo, ChargingPaymentRecordDto> {
    private final ChargingPaymentRecordWrapperImpl chargingPaymentRecordWrapper;

}
