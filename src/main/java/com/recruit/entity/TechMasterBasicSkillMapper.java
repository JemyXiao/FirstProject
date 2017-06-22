package com.recruit.entity;

import java.util.Date;

/**
 * Created by jmx on 2017/6/22.
 */
public class TechMasterBasicSkillMapper {
    private Long id;
    private Long techMasterId;
    private Long skillId;
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

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
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
