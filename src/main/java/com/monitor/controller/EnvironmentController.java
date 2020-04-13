package com.monitor.controller;

import com.monitor.common.Result;
import com.monitor.common.ResultStatus;
import com.monitor.service.environment.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("environment")
public class EnvironmentController {

    @Autowired
    private EnvironmentService environmentService;

    @RequestMapping("list")
    @ResponseBody
    public Result queryEnvironmentList(){
        Result result = new Result();
        List list =  environmentService.queryEnvironmentList();
        result.setData(list);
        result.setResult(ResultStatus.SUCCESS);
        return result;
    }
}
