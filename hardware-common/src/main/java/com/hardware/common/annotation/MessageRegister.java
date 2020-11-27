package com.hardware.common.annotation;

import com.hardware.common.enums.CommandEnum;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * Created by lp on 2020/11/24
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
@Qualifier
public @interface MessageRegister {
    //CommandEnum command() default CommandEnum.ALL;
}


