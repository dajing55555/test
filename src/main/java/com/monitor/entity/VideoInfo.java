package com.monitor.entity;

import java.sql.Timestamp;

/**
 * 实时监控视频实体类
 */
public class VideoInfo {
    private int id;
    /**
     * 设备id
     */
    private int equipmentId;
    /**
     * 视频路径
     */
    private String filePath;
    /**
     * 视频上报时间
     */
    private Timestamp createTime;
    /**
     * 视频结束时间
     */
    private Timestamp endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public VideoInfo() {
    }

    public VideoInfo(int id, int equipmentId, String filePath, Timestamp createTime, Timestamp endTime) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.filePath = filePath;
        this.createTime = createTime;
        this.endTime = endTime;
    }
}
