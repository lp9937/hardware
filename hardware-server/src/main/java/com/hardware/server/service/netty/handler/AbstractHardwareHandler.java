package com.hardware.server.service.netty.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.common.factory.ThreadNameFactory;
import com.hardware.common.utils.ExecutorUtils;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class AbstractHardwareHandler implements IHardwareHandler {
    @Autowired
    @MessageHandleRegister("CHARGING_PILE")
    private List<IMessageHandler> handlers;
    private static final int DEFAULT_CAPACITY=5000;
    private static final int DEFAULT_EXECUTOR_CORE_SIZE=5;
    private static final String THREAD_PREFIX_NAME="MESSAGE-QUEUE";
    /**
     * 消息队列
     */
    private final BlockingQueue<AbstractNettyMessage> queues;
    /**
     * 消息处理线程池
     */
    private volatile ExecutorService executorService;
    /**
     * 线程池中线程个数
     */
    private final int executorCoreSize;
    private final AtomicInteger count;
    private final int capacity;
    /** 是否停止 */
    private volatile boolean isStop = true;

    protected AbstractHardwareHandler(){
        this(DEFAULT_CAPACITY,DEFAULT_EXECUTOR_CORE_SIZE);
    }

    protected AbstractHardwareHandler(int capacity, int executorCoreSize){
        this.capacity=capacity;
        queues=new LinkedBlockingQueue<>(capacity);
        count=new AtomicInteger(0);
        this.executorCoreSize=executorCoreSize;
    }

    /**
     * 队列添加数据有三种方法：add、put、offer
     * 1.add方法在添加元素的时候，若超出了队列长度会直接抛出“队列已满”异常
     * 2.put方法在添加元素的时候，若超出了队列长度，会阻塞等待队列有剩余空间
     * 3.offer方法在添加元素的时候，若超出了队列长度，会直接返回false，
     * 如果设置了等待时间，在等待时间内不断去检测队列长度，当检查到有剩余空间，就添加元素，否则就返回false
     *
     * 队列移除数据有三种方法：remove、poll、take
     * 1.remove方法在移除元素的时候，若队列为空，会抛出“没有此元素”异常
     * 2.poll方法在移除元素的时候，若队列为空，直接返回null
     * 3.take方法在移除元素的时候，若队列为空，会阻塞等待队列有数据
     * @param message
     */
    @Override
    public void add(AbstractNettyMessage message){
        AtomicInteger count = this.count;
        try {
            queues.put(message);
            int c=count.incrementAndGet();
            if(log.isDebugEnabled()){
                log.debug("when adding messages,the queue size is:"+c);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            //if(log.isWarnEnabled()){
            log.info("[#Queue.add] [message loss:"+message.getCommand().toString()+"]");
            Thread.currentThread().interrupt();
            //}
        }
    }

    @Override
    public synchronized boolean start() {
        if(this.executorService!=null){
            throw new IllegalStateException("The executorService has not been stopped.");
        }
        ThreadNameFactory factory=new ThreadNameFactory(THREAD_PREFIX_NAME);
        executorService= Executors.newFixedThreadPool(executorCoreSize,factory);
        for(int i=0;i<executorCoreSize;++i){
            executorService.execute(doWork());
        }
        isStop=false;
        return true;
    }

    @Override
    public synchronized boolean stop() {
        log.info("Message handle executor is stopping ...");
        if(executorService!=null){
            ExecutorUtils.shutdownAndAwaitTermination(executorService);
            executorService=null;
        }
        log.info("Message handle executor is stopped.");
        isStop=true;
        queues.clear();
        return true;
    }

    @Override
    public boolean isFull() {
        return count.intValue()>=capacity;
    }

    public void handle(AbstractNettyMessage message) {
        IMessageHandler handler= getHandler(message.getCommand());
        if(handler!=null){
            handler.handle(message);
        }
    }

    private IMessageHandler getHandler(CommandEnum command){
        IMessageHandler handler;
        for(int i=0;i<handlers.size();i++){
            handler=handlers.get(i);
            if(handler.getReqCommand().equals(command)){
                return handler;
            }
        }
        return null;
    }

    private Runnable doWork(){
        AtomicInteger count = this.count;
        return ()->{
            while(!isStop){
                try {
                    handle(queues.take());
                    int c=count.decrementAndGet();
                    if(log.isDebugEnabled()){
                        log.debug("when handling messages,the queue size is:"+c);
                    }
                } catch (InterruptedException e) {
                    //if(log.isWarnEnabled()){
                    log.info("[#Core.QueueMessageExecutorProcessor.doWork] [Stop process].");
                    //}
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        };
    }
}