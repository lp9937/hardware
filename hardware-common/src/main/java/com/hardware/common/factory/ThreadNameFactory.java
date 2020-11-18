package com.hardware.common.factory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNameFactory implements ThreadFactory {
    private final ThreadGroup group;
    private final AtomicInteger threadNumber;
    private final String prefixName;
    //是否守护线程
    private final boolean isDaemon;

    public ThreadNameFactory(String prefixName){
        this(prefixName,false);
    }

    public ThreadNameFactory(String prefixName,boolean isDaemon){
        SecurityManager securityManager=System.getSecurityManager();
        if(securityManager!=null){
            group=securityManager.getThreadGroup();
        }else{
            group=Thread.currentThread().getThreadGroup();
        }
        this.prefixName=prefixName+"-thread-";
        this.isDaemon=isDaemon;
        this.threadNumber=new AtomicInteger(0);
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread=new Thread(group,runnable,
                prefixName+threadNumber.getAndIncrement(),0);
        //设置是否守护线程
        thread.setDaemon(isDaemon);
        if(!isDaemon){
            if(thread.getPriority()!=Thread.NORM_PRIORITY){
                thread.setPriority(Thread.NORM_PRIORITY);
            }
        }
        return thread;
    }

    public String getPrefixName(){
        return prefixName;
    }
}
