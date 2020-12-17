package com.hardware.charging.controller;

import com.hardware.charging.pojo.info.ChargingStartInfo;
import com.hardware.charging.service.ChargingControlService;
import com.hardware.common.api.ResponseResult;
import com.hardware.common.utils.AssertUtils;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/charging-control")
@RequiredArgsConstructor(onConstructor_= @Autowired)
public class ChargingControlController{
    private final ChargingControlService chargingControlService;

    /**
     * 开始充电控制命令
     * @param chargingStartInfo
     * @return
     */
    @PostMapping(value = "/start")
    public ResponseResult start(@RequestBody ChargingStartInfo chargingStartInfo){
        AssertUtils.validate(chargingStartInfo);
        String result=chargingControlService.start(chargingStartInfo);
        return ResponseResult.success(result);
    }
}
