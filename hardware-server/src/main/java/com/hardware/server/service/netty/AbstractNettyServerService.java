package com.hardware.server.service.netty;

import com.hardware.server.service.AbstractServerService;
import com.hardware.server.service.IServerService;
import com.hardware.server.service.bootstrap.manager.NettyServiceManager;
import io.netty.channel.ChannelFutureListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNettyServerService extends AbstractServerService {
    @Autowired
    private NettyServiceManager nettyServiceManager;
    private Integer servicePort;
    private InetSocketAddress serviceAddress;

    public Integer getServicePorts(){
        return servicePort;
    }

    public AbstractNettyServerService setServicePorts(Integer servicePort){
        this.servicePort=servicePort;
        return this;
    }

    public InetSocketAddress getServiceAddress(){
        return serviceAddress;
    }

    public AbstractNettyServerService setServiceAddress(InetAddress address){
        serviceAddress=new InetSocketAddress(address, servicePort);
        return this;
    }

    /**
     * 默认添加close监听事件
     * @return
     */
    protected AbstractNettyServerService addListener(){
        addListener(ChannelFutureListener.CLOSE);
        return this;
    }

    public abstract AbstractNettyServerService addListener(ChannelFutureListener listener);

    @Override
    public IServerService register() {
        return nettyServiceManager.register(getServiceId(),this);
    }

    @Override
    public IServerService unRegister() {
        return nettyServiceManager.unRegister(getServiceId());
    }
}
