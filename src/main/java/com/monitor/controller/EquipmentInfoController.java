package com.monitor.controller;

import com.monitor.common.Result;
import com.monitor.common.ResultStatus;
import com.monitor.entity.EquipmentInfo;
import com.monitor.service.equipmentInfo.EquipmentInfoService;
import com.monitor.vo.EquipmentQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("equipment")
public class EquipmentInfoController {

    @Autowired
    private EquipmentInfoService equipmentInfoService;

    @RequestMapping(value = "/list/{pageNo}", method = RequestMethod.GET)
    @ResponseBody
    public Result queryEquipmentListByPage(EquipmentQueryVo queryVo){
       List<EquipmentInfo> info =  equipmentInfoService.queryEquipmentListByPage(queryVo);
        Result result = new Result();
        result.setData(info);
        result.setResult(ResultStatus.SUCCESS);
        return result;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Result queryEquipmentListByPage(){
        List<EquipmentInfo> info =  equipmentInfoService.queryEquipmentList();
        Result result = new Result();
        result.setData(info);
        result.setResult(ResultStatus.SUCCESS);
        return result;
    }


}
