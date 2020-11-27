package com.hardware.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public final class ExecutorUtils {
    private static final int DEFAULT_AWAIT_TERMINATE_MINUTES = 1;
    private ExecutorUtils(){

    }

    public static List<Runnable> shutdownAndAwaitTermination(final ExecutorService executorService){
        return shutdownAndAwaitTermination(executorService,DEFAULT_AWAIT_TERMINATE_MINUTES,TimeUnit.MINUTES);
    }

    /**
     * 关闭{@link ExecutorService}，在指定的时间内{@param awaitTerminateTimeout}等待
     * {@param executorService}中已经开始的任务结束
     * @param executorService
     * @param awaitTerminateTimeout
     * @param timeUnit
     * @return
     */
    public static List<Runnable> shutdownAndAwaitTermination(final ExecutorService executorService,
                                                             final long awaitTerminateTimeout,
                                                             final TimeUnit timeUnit){
        List<Runnable> result=null;
        /**停止接收新任务，原来的任务继续执行*/
        executorService.shutdown();

        try {
            /**
             * 等所有已提交的任务(包括正在跑的和队列中等待的)执行完
             * 或者等超时时间到了
             * 或者线程被中断，抛出InterruptedException异常
             */
            boolean terminateResult = executorService.awaitTermination(awaitTerminateTimeout,timeUnit);
            log.info("[#ExecutorUtils.safeShutdown] " +
                    "[Shutdown "+(terminateResult?"Success":"Fail")+"]");
            //失败，再次停止
            if(!terminateResult){
                /**停止接收新任务，原来的任务停止执行*/
                result=executorService.shutdownNow();
                if(result!=null){
                    for(Runnable runnable:result){
                        log.warn("[#ExecutorUtils.surplusRunnable] "+
                                "[Runnable "+runnable+"]");
                    }
                }
                terminateResult=executorService.awaitTermination(awaitTerminateTimeout,timeUnit);
                log.info("[#ExecutorUtils.safeShutdownNow] " +
                        "[ShutdownNow "+(terminateResult?"Success":"Fail")+"]");
            }
        } catch (InterruptedException e) {
            log.info("[ExecutorUtils.safeShutdown] [Shutdown:"+e+"]");
            result=executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        return result;
    }
}
