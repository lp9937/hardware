package com.hardware.common.utils;

import org.apache.commons.lang3.StringUtils;

public final class StrUtils {
    private StrUtils(){}

    /**
     * 字符串首字母转小写
     * @param str
     * @return
     */
    public static String toLowerCaseFirstOne(String str){
        AssertUtils.isBlank(str);

        char[]chars=str.toCharArray();
        chars[0]=Character.toLowerCase(chars[0]);
        return String.valueOf(chars);
    }

    /**
     * 字符串首字母转大写
     * @param str
     * @return
     */
    public static String toUpperCaseFirstOne(String str){
        AssertUtils.isBlank(str);

        char[]chars=str.toCharArray();
        chars[0]=Character.toUpperCase(chars[0]);
        return String.valueOf(chars);
    }
}
