package com.hardware.server.service;

/**
 * 服务器服务
 */
public interface IServerService {
    /**
     * 获取服务节点
     * @return
     */
    String getServiceNode();
    /**
     * 获取服务Id
     * @return
     */
    String getServiceId();

    /**
     * 注册到服务管理类中
     * @return
     */
    IServerService register();

    /**
     * 从服务管理类中注销
     * @return
     */
    IServerService unRegister();
    /**
     * 启动服务
     * @return
     */
    boolean startUp();

    /**
     * 停止服务
     * @return
     */
    boolean stop();

    /**
     * 服务是否在运行
     * @return
     */
    boolean isRunning();
}
