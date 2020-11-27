package com.hardware.server.service.netty.handler;

import com.hardware.common.enums.HardwareEnum;
import com.hardware.server.service.netty.message.AbstractNettyMessage;

public interface IHardwareHandler {
    /**
     * 启动消息处理器
     * @return
     */
    boolean start();

    /**
     * 停止消息处理器
     * @return
     */
    boolean stop();

    /**
     * 向消息队列添加消息
     * @param message
     */
    void add(AbstractNettyMessage message);

    /**
     * 判断消息队列是否满了
     * @return
     */
    boolean isFull();

    /**
     * 获取处理什么硬件的消息
     * @return
     */
    HardwareEnum getType();
}
