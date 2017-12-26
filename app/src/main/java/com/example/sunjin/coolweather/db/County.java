package com.example.sunjin.coolweather.db;

/**
 * Created by SUNJIN on 2017/12/26.
 */

public class County {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getCountyName() {
        return countyName;
    }

    private void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    private String getWeatherId() {
        return weatherId;
    }

    private void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    private int getCityId() {
        return cityId;
    }

    private void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
