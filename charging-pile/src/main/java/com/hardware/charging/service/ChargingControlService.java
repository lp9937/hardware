package com.hardware.charging.service;

import com.hardware.charging.pojo.info.ChargingStartInfo;

public interface ChargingControlService {
    String start(ChargingStartInfo chargingStartInfo);
}
