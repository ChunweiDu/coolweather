package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by duchunwei on 2017/2/15.
 * 城市级
 */

public class City extends DataSupport {
    /**
     * 记录字段
     */
    private int id;
    /**
     * 城市名
     */
    private String cityName;
    /**
     * 城市代号
     */
    private int cityCode;
    /**
     * 城市所属省份id值
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
