package com.example.demo.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Deacription
 * @Author chenpengwei
 * @Date 2019/12/16 上午 10:02
 * @Version 1.0
 **/
public class ReplaceTemplateFileUtil {

    /**
     * @description 根据反射获取字段值
     * @Param []
     * @return java.lang.String
     * @author chenpengwei
     * @date 2019/12/13 下午 5:23
     */
    public String getFiledValue(Object vo, String FiledName) throws InvocationTargetException, IllegalAccessException {
        Class classzz = vo.getClass();
        Method[] methods = classzz.getMethods();
        for (Method method : methods) {
            if (method.getName().equals("get" + FiledName)){
                System.out.println(method.invoke(vo));
                return (String) method.invoke(vo);
            }
        }

        return null;
    }

}
