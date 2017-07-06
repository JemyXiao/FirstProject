package com.recruit.entity;

import java.util.Date;

public class RecruitMasterWorkMapping {
    private Long id;

    private Long techMasterId;

    private Long workCaseId;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTechMasterId() {
        return techMasterId;
    }

    public void setTechMasterId(Long techMasterId) {
        this.techMasterId = techMasterId;
    }

    public Long getWorkCaseId() {
        return workCaseId;
    }

    public void setWorkCaseId(Long workCaseId) {
        this.workCaseId = workCaseId;
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