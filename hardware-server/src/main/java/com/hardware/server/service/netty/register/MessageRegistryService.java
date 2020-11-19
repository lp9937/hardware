package com.hardware.server.service.netty.register;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.server.service.IService;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import com.hardware.server.service.netty.message.NettyMessageBody;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Component
public class MessageRegistryService<T extends NettyMessageBody> implements IService {
    private final Map<Long,Class<? extends T>> messages=new HashMap<>();

    private void register(){
        ClassPathScanningCandidateComponentProvider provider
                =new ClassPathScanningCandidateComponentProvider(false);

        provider.addIncludeFilter(new AnnotationTypeFilter(MessageRegister.class));
        Set<BeanDefinition> beanDefinitions =provider.findCandidateComponents("*");
        beanDefinitions.forEach(item->{
            String className= item.getBeanClassName();
            try {
                Class clazz= Class.forName(className);
                if(AbstractNettyMessage.class.isAssignableFrom(clazz)) {
                    MessageRegister messageRegister = (MessageRegister) clazz.getAnnotation(MessageRegister.class);
                    if (messageRegister != null) {
                        messages.put(messageRegister.command().getCode(), clazz);
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
    }

    @PostConstruct
    @Override
    public boolean startup() {
        register();
        return true;
    }

    @Override
    public boolean stop() {
        messages.clear();
        return true;
    }

    public T getMessage(Long key){
        return createMessage(key);
    }

    private T createMessage(Long key){
        Class<? extends T> clazz=messages.get(key);
        if(clazz!=null){
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
