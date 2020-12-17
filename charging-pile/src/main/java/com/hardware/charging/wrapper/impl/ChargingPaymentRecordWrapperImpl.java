package com.hardware.charging.wrapper.impl;

import com.hardware.charging.pojo.domain.ChargingPaymentRecordDo;
import com.hardware.charging.pojo.dto.ChargingPaymentRecordDto;
import com.hardware.charging.pojo.info.ChargingPaymentRecordInfo;
import com.hardware.charging.service.impl.ChargingPaymentRecordServiceImpl;
import com.hardware.charging.wrapper.ChargingPaymentRecordWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingPaymentRecordWrapperImpl
        extends BaseWrapperImpl<ChargingPaymentRecordInfo, ChargingPaymentRecordDto, ChargingPaymentRecordDo>
        implements ChargingPaymentRecordWrapper {
    private final ChargingPaymentRecordServiceImpl chargingPaymentRecordService;
}
