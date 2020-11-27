package com.hardware.common.annotation;

import com.hardware.common.enums.HardwareEnum;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by lp on 2020/11/24
 */
@Documented
@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface HardwareHandleRegister {
//    @AliasFor(annotation = Qualifier.class)
//    String value();
    //HardwareEnum type() default HardwareEnum.ALL;
}
