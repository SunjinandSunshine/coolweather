package com.example.sunjin.coolweather.db;

/**
 * Created by SUNJIN on 2017/12/26.
 */

public class City {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getCityName() {
        return cityName;
    }

    private void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private int getCityCode() {
        return cityCode;
    }

    private void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    private int getProvinceId(int provinceId) {
        return provinceId;
    }

    private void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
    
}
