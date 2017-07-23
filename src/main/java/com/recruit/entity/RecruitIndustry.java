package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * 行业类
 */
@Data
public class RecruitIndustry {

    private Long id;

    private Long industryCode;

    private String industryName;

    @JSONField(serialize = false)
    private Date createdAt;

    @JSONField(serialize = false)
    private Date updatedAt;

}