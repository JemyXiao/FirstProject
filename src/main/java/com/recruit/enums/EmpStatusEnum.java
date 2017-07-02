package com.recruit.enums;

/**
 * Created by jmx on 2017/7/2.
 * 发布信息状态
 */
public enum EmpStatusEnum {
    RECRUITMENT("recruitment");
    private String name;

    EmpStatusEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
