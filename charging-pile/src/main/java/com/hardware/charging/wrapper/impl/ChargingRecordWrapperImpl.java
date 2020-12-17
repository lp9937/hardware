package com.hardware.charging.wrapper.impl;

import com.hardware.charging.pojo.domain.ChargingRecordDo;
import com.hardware.charging.pojo.dto.ChargingRecordDto;
import com.hardware.charging.pojo.info.ChargingRecordInfo;
import com.hardware.charging.service.impl.ChargingRecordServiceImpl;
import com.hardware.charging.wrapper.ChargingRecordWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingRecordWrapperImpl
        extends BaseWrapperImpl<ChargingRecordInfo, ChargingRecordDto, ChargingRecordDo>
        implements ChargingRecordWrapper {
    private final ChargingRecordServiceImpl chargingRecordService;
}
