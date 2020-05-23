package com.example.demo.AccountOperatot;

/**
 * @Deacription
 * @Author chenpengwei
 * @Date 2019/12/16 上午 9:32
 * @Version 1.0
 **/
@FunctionalInterface
public interface RoleOperator {

    /**
     * @description 获取账户权限 
     * @return java.lang.String：账户权限
     * @author chenpengwei
     * @date 2019/12/16 上午 9:56
     */ 
    String getJurisdiction();

}
