package com.hardware.common.api;

import com.hardware.common.enums.ResponseCode;
import lombok.*;

/**
 * Created by lp on 2020/12/
 * 响应结果
 * @param <T>
 */
@Data
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PROTECTED)
public class ResponseResult<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据
     */
    private T data;
    /**
     * 返回成功结果
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> success(){
        return success(null);
    }

    /**
     * 返回成功结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> success(T data){
        ResponseCode code=ResponseCode.SUCCESS;
        return new ResponseResult<>(code.getCode(),code.getDesc(),data);
    }

    /**
     * 返回失败结果
     * @param code
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> fail(ResponseCode code){
        return new ResponseResult<>(code.getCode(),code.getDesc(),null);
    }

    /**
     * 返回失败结果
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> fail(){
        return fail(ResponseCode.FAILED);
    }

    /**
     * 拒绝访问
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> accessDenied(){
        return accessDenied(null);
    }

    /**
     * 拒绝访问
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> accessDenied(T data){
        ResponseCode code=ResponseCode.ACCESS_DENIED;
        return new ResponseResult<>(code.getCode(),code.getDesc(),data);
    }

    /**
     * 未登录或登陆过期
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> unAuthorized() {
        return unAuthorized(null);
    }

    /**
     * 未登录或登陆过期
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> unAuthorized(T data){
        ResponseCode code=ResponseCode.UNAUTHORIZED;
        return new ResponseResult<>(code.getCode(),code.getDesc(),data);
    }

    /**
     * 返回验证失败结果
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> validateFailed() {
        return validateFailed(null);
    }

    /**
     * 返回验证失败结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> validateFailed(T data) {
        ResponseCode code=ResponseCode.VALIDATE_FAILED;
        return new ResponseResult<>(code.getCode(),code.getDesc(),data);
    }
}
