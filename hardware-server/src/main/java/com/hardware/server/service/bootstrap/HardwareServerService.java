package com.hardware.server.service.bootstrap;

import com.hardware.server.service.bootstrap.manager.NettyServiceManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class HardwareServerService {
    @Autowired
    private NettyServiceManager nettyServiceManager;


    @PostConstruct
    public void startUp() {
        log.info("Begin to start hardware service");
        //todo 注册消息
        //todo 启动具体服务
//        nettyServiceManager.startUp();
        log.info("Hardware service started");
    }

    //@PreDestroy
    public boolean stop() {
        log.info("Begin to stop hardware service");

        log.info("Hardware service stopped");
        return false;
    }
}
