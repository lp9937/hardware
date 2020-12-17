package com.hardware.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public enum ResponseCode implements IBaseEnum<Long> {
    SUCCESS(200L,"操作成功"),
    UNAUTHORIZED(401L,"暂未登陆或token已经过期"),
    ACCESS_DENIED(403L,"没有相关权限"),
    VALIDATE_FAILED(404L,"参数检验失败"),
    FAILED(500L,"操作失败"),
    ;

    private Long code;
    private String desc;
}
