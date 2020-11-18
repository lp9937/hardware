package com.hardware.server.service;

/**
 * 抽象服务器服务基类
 */
public abstract class AbstractServerService implements IServerService {
    private String serviceId;
    private String serviceNode;
    protected boolean isRunning;

    @Override
    public String getServiceNode() {
        return serviceNode;
    }

    public AbstractServerService setServiceNode(String serviceNode){
        this.serviceNode=serviceNode;
        return this;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    public AbstractServerService setServiceId(String serviceId){
        this.serviceId=serviceId;
        return this;
    }

    @Override
    public boolean isRunning(){
        return isRunning;
    }
}
