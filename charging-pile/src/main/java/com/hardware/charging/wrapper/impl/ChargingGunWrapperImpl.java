package com.hardware.charging.wrapper.impl;

import com.hardware.charging.pojo.domain.ChargingGunDo;
import com.hardware.charging.pojo.dto.ChargingGunDto;
import com.hardware.charging.pojo.info.ChargingGunInfo;
import com.hardware.charging.service.impl.ChargingGunServiceImpl;
import com.hardware.charging.wrapper.ChargingGunWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_=@Autowired)
public class ChargingGunWrapperImpl
        extends BaseWrapperImpl<ChargingGunInfo, ChargingGunDto, ChargingGunDo>
        implements ChargingGunWrapper {
    private final ChargingGunServiceImpl chargingGunService;
}
