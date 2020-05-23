package com.example.demo.control;

import com.example.demo.AccountOperatot.AccountJurisdiction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Deacription 用户Controller
 * @Author chenpengwei
 * @Date 2019/12/16 上午 10:06
 * @Version 1.0
 **/
@Controller
public class Account {


    /**
     * @description 获取用户权限
     * @Param [account：账户名]
     * @return java.lang.String 账户权限
     * @author chenpengwei
     * @date 2019/12/16 上午 9:30
     */
    @RequestMapping("getAccountJurisdiction")
    @ResponseBody
    public String getAccountJurisdiction(String account){

        return AccountJurisdiction.valueOf(account).getJurisdiction();
    }
}
