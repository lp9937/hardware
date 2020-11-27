package com.hardware.server.service.netty.session;

import com.hardware.common.utils.SpringUtils;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by lp on 2020/11/21
 * 会话业务逻辑的抽象实现
 */
@Slf4j
public class DefaultSession implements ISession {
    /**
     * Java内存模型中的可见性、原子性和有序性
     * 1.可见性：指线程之间的可见性，一个线程修改的状态对另一个线程是可见的，
     * volatile只能保证被修饰内容具有可见性，但不能保证原子性，
     * 在java中volatile、synchronized和final实现可见性
     * 2.原子性：原子是世界上最小的单位，具有不可分割性。
     * java的concurrent包下提供了一些原子类，比如：AtomicInteger、AtomicLong、AtomicReference等
     * 在java中synchronized和在lock、unlock中操作保证原子性
     * 3.有序性:java语言提供了volatile和synchronized两个关键字来保证线程之间操作的有序性，
     * volatile是因为其本身包含“禁止指令重排序”的语义，synchronized是由“一个变量在同一时刻只允许
     * 一条线程对其进行lock操作”这条规则获得的，此规则决定了持有同一个对象锁的两个同步块只能串行执行
     */
    protected volatile Channel channel;
    private final long sessionId;
    private static final AtomicLong generateId=new AtomicLong(0);

    public DefaultSession(Channel channel){
        this.channel=channel;
        sessionId=generateId.incrementAndGet();
    }

    @Override
    public boolean isConnect() {
        if(channel!=null){
            return channel.isActive();
        }
        return false;
    }

    @Override
    public ChannelFuture close() {
        if(channel!=null){
            return channel.close();
        }
        return null;
    }

    @Override
    public void write(AbstractNettyMessage message) {
        if(message!=null){
            ChannelFuture channelFuture=channel.writeAndFlush(message);
            channelFuture.addListener((GenericFutureListener) future -> {
                if(!SpringUtils.isProd()){
                    int command= message.getCommand().getCode();
                    log.info("message send success,message type is "+command);
                }
            });
        }
    }

    @Override
    public Long getSessionId(){
        return sessionId;
    }

    @Override
    public Channel getChannel() {
        return channel;
    }
}
