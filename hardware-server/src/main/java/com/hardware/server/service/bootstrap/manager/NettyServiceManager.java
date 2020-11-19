package com.hardware.server.service.bootstrap.manager;

import com.hardware.common.factory.ThreadNameFactory;
import com.hardware.common.utils.SpringUtils;
import com.hardware.server.service.netty.AbstractNettyServerService;
import com.hardware.server.service.netty.register.MessageRegistryService;
import com.hardware.server.service.netty.tcp.NettyTcpServerService;
import com.hardware.server.service.netty.tcp.channel.NettyTcpServerChannelInitializer;
import com.hardware.server.service.property.HardwareProperties;
import io.netty.channel.nio.NioEventLoopGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class NettyServiceManager {
    @Autowired
    private HardwareProperties hardwareProperties;
    @Autowired
    private BeanFactory beanFactory;
    @Autowired
    private MessageRegistryService messageRegistryService;
    private final Map<String, AbstractNettyServerService> nettyServerServiceMap=new HashMap<>();

    @PostConstruct
    public void initial(){
        HardwareProperties.Netty netty=hardwareProperties.getNetty();
        List<HardwareProperties.Netty.Tcp> tcpList=netty.getTcpList();
        if(!CollectionUtils.isEmpty(tcpList)){
            tcpList.forEach(item->{
                NettyTcpServerService nettyTcpServerService =
                        SpringUtils.get(NettyTcpServerService.class);
                nettyTcpServerService=(NettyTcpServerService)nettyTcpServerService
                        .setServiceNode(hardwareProperties.getServiceNode())
                        .setServiceId(item.getOptions().getServiceId());
                nettyTcpServerService=(NettyTcpServerService)nettyTcpServerService
                        .setServicePorts(item.getOptions().getPort())
                        .setServiceAddress(item.getOptions().getAddress());
                ThreadNameFactory bossThreadFactory=beanFactory.getBean(ThreadNameFactory.class,
                        item.getOptions().getServiceId()+"Boss",false);
                ThreadNameFactory workerThreadFactory=beanFactory.getBean(ThreadNameFactory.class,
                        item.getOptions().getServiceId()+"Worker",false);
                nettyTcpServerService.setBossGroup(beanFactory
                        .getBean(NioEventLoopGroup.class, item.getBossThreadNum(),bossThreadFactory));
                nettyTcpServerService.setWorkerGroup(beanFactory
                        .getBean(NioEventLoopGroup.class, item.getWorkerThreadNum(),workerThreadFactory));
                nettyTcpServerService.setChannelInitializer(
                        SpringUtils.get(NettyTcpServerChannelInitializer.class,item));
                nettyTcpServerService.register();
            });
        }
        if(!CollectionUtils.isEmpty(netty.getUdpList())){

        }
    }

    public boolean startUp(){
        nettyServerServiceMap.forEach((k,v)->v.startUp());
        return true;
    }

    public AbstractNettyServerService register(String serviceId,
                                               AbstractNettyServerService service){
        AbstractNettyServerService value=nettyServerServiceMap.putIfAbsent(serviceId,service);
        if(value!=null){
            log.info("Failed to add service,Duplicate service ID"+serviceId);
            return value;
        }
        return service;
    }

    public AbstractNettyServerService unRegister(String serviceId){
        return nettyServerServiceMap.remove(serviceId);
    }
}
