package com.hardware.common.annotation;

import com.hardware.common.enums.CommandEnum;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MessageHandleRegister {
    @AliasFor(annotation =Qualifier.class)
    String value() default "";
    //CommandEnum command() default CommandEnum.ALL;
}
