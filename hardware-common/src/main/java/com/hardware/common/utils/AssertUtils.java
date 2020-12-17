package com.hardware.common.utils;

import com.hardware.common.enums.ExceptionEnum;
import com.hardware.common.exception.ArgumentException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Collection;
import java.util.Set;

/**
 * 断言工具
 */
public final class AssertUtils {
    private AssertUtils(){ }
    private static final String ARGUMENT_CANNOT_BE_BLANK="参数不能为空白";
    private static final String ARGUMENT_CANNOT_BE_EMPTY="参数不能为空";

    private static Validator validator;
    static {
        validator= Validation.buildDefaultValidatorFactory().getValidator();
    }

    public static <T> void validate(T t){
        Set<ConstraintViolation<T>> constraintViolations=validator.validate(t);
        if(!CollectionUtils.isEmpty(constraintViolations)){
            StringBuilder msg=new StringBuilder();
            constraintViolations.forEach(item->{
                msg.append(item.getMessage()).append("|");
            });
            throw new ArgumentException(ExceptionEnum.ILLEGAL_ARGUMENT,msg.toString());
        }
    }

    /**
     * 判断字符串是否为空白字符串
     * @param str
     */
    public static void isBlank(String str){
        isBlank(str,ARGUMENT_CANNOT_BE_BLANK);
    }

    /**
     * 判断字符串是否为空白字符串
     * @param str
     * @param message
     */
    public static void isBlank(String str,String message){
        if(StringUtils.isBlank(str)){
            throw new ArgumentException(ExceptionEnum.ILLEGAL_ARGUMENT,message);
        }
    }

    /**
     * 判断字符串是否为空
     * @param str
     */
    public static void isEmpty(String str){
        isEmpty(str,ARGUMENT_CANNOT_BE_EMPTY);
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @param message
     */
    public static void isEmpty(String str,String message){
        if(StringUtils.isEmpty(str)){
            throw new ArgumentException(ExceptionEnum.ILLEGAL_ARGUMENT,message);
        }
    }

    /**
     * 判断对象是否为null
     * @param t
     * @param <T>
     */
    public static <T> void isNull(T t){
        isNull(t,ARGUMENT_CANNOT_BE_EMPTY);
    }

    /**
     * 判断对象是否为null
     * @param t
     * @param message
     * @param <T>
     */
    public static <T> void isNull(T t,String message){
        if(t==null){
            throw new ArgumentException(ExceptionEnum.ILLEGAL_ARGUMENT,message);
        }
    }

    /**
     * 判断集合是否为空
     * @param collection
     * @param <T>
     */
    public static <T> void isEmpty(Collection<T> collection){
        isEmpty(collection,ARGUMENT_CANNOT_BE_EMPTY);
    }

    /**
     * 判断集合是否为空
     * @param collection
     * @param message
     * @param <T>
     */
    public static <T> void isEmpty(Collection<T> collection,String message){
        if(CollectionUtils.isEmpty(collection)){
            throw new ArgumentException(ExceptionEnum.ILLEGAL_ARGUMENT,message);
        }
    }
}
