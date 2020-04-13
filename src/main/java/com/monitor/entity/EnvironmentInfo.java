package com.monitor.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 环境实体类
 */
public class EnvironmentInfo implements Serializable {

    private int id;
    /**
     * 温度℃
     */
    private double temperature;
    /**
     * 湿度%RH
     */
    private double humidity;
    /**
     *
     */
    private double volume;
    /**
     * 重量kg
     */
    private double weight;
    /**
     * 风速m/s
     */
    private double wind;
    /**
     * 光照lux
     */
    private double light;
    /**
     * 二氧化碳PPM
     */
    private double CO2;
    /**
     * 监测上报时间
     */
    private Timestamp monitorTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public double getLight() {
        return light;
    }

    public void setLight(double light) {
        this.light = light;
    }

    public double getCO2() {
        return CO2;
    }

    public void setCO2(double CO2) {
        this.CO2 = CO2;
    }

    public Timestamp getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Timestamp monitorTime) {
        this.monitorTime = monitorTime;
    }

    public EnvironmentInfo() {
    }

    public EnvironmentInfo(int id, double temperature, double humidity, double volume, double weight, double wind, double light, double CO2, Timestamp monitorTime) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.volume = volume;
        this.weight = weight;
        this.wind = wind;
        this.light = light;
        this.CO2 = CO2;
        this.monitorTime = monitorTime;
    }
}
