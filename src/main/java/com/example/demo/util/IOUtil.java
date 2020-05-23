package com.example.demo.util;

import java.io.Closeable;

/**
 * @Deacription 一些常用的工具类
 * @Author chenpengwei
 * @Date 2019/12/11 下午 4:02
 * @Version 1.0
 **/
public class IOUtil {


    /**
     * @description 关闭io流 
     * @Param [io]
     * @return void
     * @author chenpengwei
     * @date 2019/12/11 下午 4:07
     */ 
    public static void closeIOTmplates(Closeable ...io){
        for (Closeable closeable : io) {
            try {
                if (null != io) closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

