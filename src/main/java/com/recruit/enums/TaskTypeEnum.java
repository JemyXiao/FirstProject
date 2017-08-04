package com.recruit.enums;

/**
 * Created by jmx
 * 2017/6/25.
 */
public enum TaskTypeEnum {

    EMP("emp"), MASTER("master");
    private String type;


    TaskTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
