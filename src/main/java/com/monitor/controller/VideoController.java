package com.monitor.controller;

import com.monitor.common.Result;
import com.monitor.common.ResultStatus;
import com.monitor.service.video.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping("list")
    @ResponseBody
    public Result queryVideoList(){
        Result result = new Result();
        List list = videoService.queryVideoList();
        result.setData(list);
        result.setResult(ResultStatus.SUCCESS);
        return result;
    }

}
