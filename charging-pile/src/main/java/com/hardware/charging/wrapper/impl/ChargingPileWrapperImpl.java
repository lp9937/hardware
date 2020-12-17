package com.hardware.charging.wrapper.impl;

import com.hardware.charging.pojo.domain.ChargingPileDo;
import com.hardware.charging.pojo.dto.ChargingPileDto;
import com.hardware.charging.pojo.info.ChargingPileInfo;
import com.hardware.charging.service.impl.ChargingPileServiceImpl;
import com.hardware.charging.wrapper.ChargingPileWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ChargingPileWrapperImpl
        extends BaseWrapperImpl<ChargingPileInfo, ChargingPileDto, ChargingPileDo>
        implements ChargingPileWrapper {
    private final ChargingPileServiceImpl chargingPileService;
}
