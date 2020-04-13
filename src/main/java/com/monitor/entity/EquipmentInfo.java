package com.monitor.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备信息实体类
 */
public class EquipmentInfo implements Serializable {
    private Integer id;
    /**
     * 设备名称
     */
    private String equipName;
    /**
     * 设备型号
     */
    private String equipType;
    /***
     * 出厂日期
     */
    private Date  productDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }
}
