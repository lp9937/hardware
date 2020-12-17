package com.hardware.charging.service.impl;

import com.hardware.charging.mapper.ChargingRecordMapper;
import com.hardware.charging.pojo.domain.ChargingRecordDo;
import com.hardware.charging.pojo.model.ChargingRecord;
import com.hardware.charging.service.ChargingRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingRecordServiceImpl
        extends BaseServiceImpl<ChargingRecordDo, ChargingRecord>
        implements ChargingRecordService {
    private final ChargingRecordMapper chargingRecordMapper;
}
