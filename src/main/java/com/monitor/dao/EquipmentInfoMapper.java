package com.monitor.dao;

import com.monitor.entity.EquipmentInfo;
import com.monitor.vo.EquipmentQueryVo;

import java.util.List;

public interface EquipmentInfoMapper {

    /**
     * 所有设备信息(分页)
     * @param queryVo
     * @return
     */
    List<EquipmentInfo> queryEquipmentListByPage(EquipmentQueryVo queryVo);

    /**
     * 所有设备信息
     * @return
     */
    List<EquipmentInfo> queryEquipmentList();
}
