package com.monitor.service.equipmentInfo;

import com.monitor.entity.EquipmentInfo;
import com.monitor.vo.EquipmentQueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EquipmentInfoService {

    /**
     * 设备信息列表
     * 分页
     * @param queryVo
     * @return
     */
    List<EquipmentInfo> queryEquipmentListByPage(EquipmentQueryVo queryVo);

    /**
     * 所有设备信息
     * 用于地图上坐标位置显示
     * @return
     */
    List<EquipmentInfo> queryEquipmentList();
}
