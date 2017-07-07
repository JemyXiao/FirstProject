package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class RecruitIndustry {
    private Long id;

    private Long industryCode;

    private String industryName;
    @JSONField(serialize = false)
    private Date createdAt;
    @JSONField(serialize = false)
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(Long industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}