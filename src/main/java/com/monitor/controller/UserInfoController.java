package com.monitor.controller;

import com.monitor.common.Result;
import com.monitor.common.ResultStatus;
import com.monitor.entity.UserInfo;
import com.monitor.service.userInfo.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("index")
    public String loginIn(){
        return "main";
    }


    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public Result login(UserInfo info, Model model){
        UserInfo userInfo = userInfoService.login(info);
        Result result = new Result();
        if(userInfo != null){
            result.setData(userInfo);
            result.setResult(ResultStatus.SUCCESS);
        }else {
            result.setResult(ResultStatus.LOGIN_FAIL);
        }
        return result;
    }
}
