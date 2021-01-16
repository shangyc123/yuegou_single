package com.zr.yuegou_single.utils;


import com.zr.yuegou_single.constant.RedisConstant;

public class StringUtils {
    public static String GenerateRedisKey(String uuid){


        return new StringBuilder().append(RedisConstant.userToken).append(uuid).toString();

    }

    public static String GenerateRedisKey(String pre,String key){
        return new StringBuilder().append(pre).append(key).toString();
    }

}
