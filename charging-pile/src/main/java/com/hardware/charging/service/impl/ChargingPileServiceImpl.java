package com.hardware.charging.service.impl;

import com.hardware.charging.mapper.ChargingPileMapper;
import com.hardware.charging.pojo.domain.ChargingPileDo;
import com.hardware.charging.pojo.model.ChargingPile;
import com.hardware.charging.service.ChargingPileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingPileServiceImpl
        extends BaseServiceImpl<ChargingPileDo, ChargingPile>
        implements ChargingPileService {
    private final ChargingPileMapper chargingPileMapper;
}
