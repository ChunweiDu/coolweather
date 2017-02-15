package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by duchunwei on 2017/2/15.
 * 省份
 */

public class Province extends DataSupport {
    /**
     * 记录字段
     */
    private int id;
    /**
     * 省份名
     */
    private String provinceName;
    /**
     * 省份代号
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
