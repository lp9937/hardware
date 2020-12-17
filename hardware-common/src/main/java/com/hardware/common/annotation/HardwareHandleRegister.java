package com.hardware.common.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
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
