package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;
@Data
public class RecruitCity {
    private Long id;

    private String cityName;

    private Integer hotTop;
    @JSONField(serialize = false)
    private Date createdAt;
    @JSONField(serialize = false)
    private Date updatedAt;

    private Long cityCode;

    public RecruitCity() {
    }

    public RecruitCity(String cityName) {
        this.cityName = cityName;
    }
}