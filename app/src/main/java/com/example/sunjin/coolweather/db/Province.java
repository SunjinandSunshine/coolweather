package com.example.sunjin.coolweather.db;

/**
 * Created by SUNJIN on 2017/12/26.
 */

public class Province {
    private int id;
    private String provinceName;
    private int provinceCode;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getProvinceName() {
        return provinceName;
    }

    private void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private int getProvinceCode() {
        return provinceCode;
    }

    private void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
