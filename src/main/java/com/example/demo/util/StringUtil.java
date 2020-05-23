package com.example.demo.util;

/**
 * @description 一些常用的字符串工具类
 * @author chenpengwei
 * @date 2019/12/13 下午 4:42
 */ 
public class StringUtil{


    /**
     * @description 输入值不为null返回输入值，为空或者null返回""
     * @param content 输入的参数
     * @return String
     * @author chenpengwei
     * @date 2019-3-5 上午10:09:38
     */
    public static String getNotNullStr(String content){
        return null != content ? content : "";
    }
    
}