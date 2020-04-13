package com.monitor.service.equipmentInfo.impl;

import com.monitor.dao.EquipmentInfoMapper;
import com.monitor.entity.EquipmentInfo;
import com.monitor.service.equipmentInfo.EquipmentInfoService;
import com.monitor.vo.EquipmentQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentInfoServiceImpl implements EquipmentInfoService {

    @Autowired
    private EquipmentInfoMapper equipmentInfoMapper;

    @Override
    public List<EquipmentInfo> queryEquipmentListByPage(EquipmentQueryVo queryVo) {
        return equipmentInfoMapper.queryEquipmentListByPage(queryVo);
    }

    @Override
    public List<EquipmentInfo> queryEquipmentList() {
        return equipmentInfoMapper.queryEquipmentList();
    }
}
