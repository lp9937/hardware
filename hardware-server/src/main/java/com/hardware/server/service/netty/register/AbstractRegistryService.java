package com.hardware.server.service.netty.register;

import com.hardware.server.service.IService;
import com.hardware.server.service.netty.message.AbstractNettyMessage;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class AbstractRegistryService<K,V> implements IService {
    private final Map<K,Class<? extends V>> mapCache =new HashMap<>();

    @Override
    public boolean stop() {
        mapCache.clear();
        return true;
    }

    public V getValue(K key){
        return createObject(key);
    }

    private V createObject(K key){
        Class<? extends V> clazz=mapCache.get(key);
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

    protected void register(Class annotationClass){
        ClassPathScanningCandidateComponentProvider provider
                =new ClassPathScanningCandidateComponentProvider(false);
        provider.addIncludeFilter(new AnnotationTypeFilter(annotationClass));
        Set<BeanDefinition> beanDefinitions =provider.findCandidateComponents("*");
        beanDefinitions.forEach(item->{
            String className= item.getBeanClassName();
            try {
                Class clazz= Class.forName(className);
                if(AbstractNettyMessage.class.isAssignableFrom(clazz)) {
                    Annotation annotation = clazz.getAnnotation(annotationClass);
                    if (annotation != null) {
                        put(annotation,clazz);
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
    }

    protected abstract void put(Annotation annotation,Class clazz);

    protected void put(K key,Class clazz){
        mapCache.put(key,clazz);
    }
}
