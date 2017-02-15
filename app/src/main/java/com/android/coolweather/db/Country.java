package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by duchunwei on 2017/2/15.
 * 县级
 */

public class Country extends DataSupport {
    /**
     * 记录字段
     */
    private int id;
    /**
     * 县城名
     */
    private String countryName;
    /**
     * 县所对应的天气id
     */
    private String weatherId;
    /**
     * 县所属的城市id值
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
