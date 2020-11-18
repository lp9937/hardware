package com.hardware.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    /**
     * 0-2分别表示开发，测试，生产环境
     */
    private static byte environ=0;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        //获取当前环境
        Environment env= applicationContext.getEnvironment();
        String[] activeProfiles=env.getActiveProfiles();
        for (String activeProfile : activeProfiles) {
            if("dev".equals(activeProfile)){
                environ=0;
                break;
            }else if("test".equals(activeProfile)){
                environ=1;
                break;
            }else if("prod".equals(activeProfile)){
                environ=2;
                break;
            }
        }
    }

    /**
     * 通过beanId获取bean
     * @param beanId
     * @param <T>
     * @return
     */
    public static <T> T get(String beanId){
        if(applicationContext==null){
            return null;
        }
        return (T)applicationContext.getBean(beanId);
    }

    /**
     * 通过类获取bean
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T get(Class<T> clazz){
        if(applicationContext==null){
            return null;
        }
        return applicationContext.getBean(clazz);
    }

    /**
     * 通过类获取bean
     * @param clazz
     * @param params
     * @param <T>
     * @return
     */
    public static <T> T get(Class<T> clazz,Object... params){
        if(applicationContext==null){
            return null;
        }
        return applicationContext.getBean(clazz,params);
    }

    /**
     * 当前环境是否为开发环境
     * @return
     */
    public static boolean isDev(){
        return environ==0;
    }

    /**
     * 当前环境是否为测试环境
     * @return
     */
    public static boolean isTest(){
        return environ==1;
    }

    /**
     * 当前环境是否为生成环境
     * @return
     */
    public static boolean isProd(){
        return environ==2;
    }
}
