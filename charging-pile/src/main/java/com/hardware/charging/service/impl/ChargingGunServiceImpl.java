package com.hardware.charging.service.impl;

import com.hardware.charging.mapper.ChargingGunMapper;
import com.hardware.charging.pojo.domain.ChargingGunDo;
import com.hardware.charging.pojo.model.ChargingGun;
import com.hardware.charging.service.ChargingGunService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingGunServiceImpl
        extends BaseServiceImpl<ChargingGunDo, ChargingGun>
        implements ChargingGunService {
    private final ChargingGunMapper chargingGunMapper;

}
