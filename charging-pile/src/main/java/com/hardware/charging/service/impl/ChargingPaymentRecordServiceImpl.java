package com.hardware.charging.service.impl;

import com.hardware.charging.mapper.ChargingPaymentRecordMapper;
import com.hardware.charging.pojo.domain.ChargingPaymentRecordDo;
import com.hardware.charging.pojo.model.ChargingPaymentRecord;
import com.hardware.charging.service.ChargingPaymentRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingPaymentRecordServiceImpl
        extends BaseServiceImpl<ChargingPaymentRecordDo, ChargingPaymentRecord>
        implements ChargingPaymentRecordService {
    private final ChargingPaymentRecordMapper chargingPaymentRecordMapper;
}
