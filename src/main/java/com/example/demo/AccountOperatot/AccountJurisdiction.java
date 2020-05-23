package com.example.demo.AccountOperatot;

/**
 * @Deacription 账户权限处理类
 * @Author chenpengwei
 * @Date 2019/12/16 上午 9:31
 * @Version 1.0
 **/
public enum AccountJurisdiction implements RoleOperator {

    //管理员权限
    admin{
        @Override
        public String getJurisdiction() {
            return "adminAcconut";
        }
    },

    //用户权限
    user{
        @Override
        public String getJurisdiction() {
            return "userAcconut";
        }
    },

    //系统权限
    system{
        @Override
        public String getJurisdiction() {
            return "systemAcconut";
        }
    }
}
