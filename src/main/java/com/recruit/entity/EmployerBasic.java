package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * Created by jmx on 17/6/21.
 *  首页响应基础信息
 */
public class EmployerBasic {

    private Long id;
    /**
     * 发布openId
     */
    private String openId;
    /**
     * 项目预算
     */
    private int projectBudget;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     *
     */
    private String status;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     *

     */
    private Long businessId;
    /**
     *
     */
    private Long businessParentId;
    /**
     *
     */
    private List<RecruitBaseSkill> baseSkills;
    /**
     *
     */
    private RecruitBusiness recruitBusiness;
    /**
     *
     */
    private int visitCount;
    /**
     *
     */
    private int applyCount;
    /**
     *
     */
    private int recommendCount;

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


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(int projectBudget) {
        this.projectBudget = projectBudget;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public int getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(int applyCount) {
        this.applyCount = applyCount;
    }

    public int getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(int recommendCount) {
        this.recommendCount = recommendCount;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getBusinessParentId() {
        return businessParentId;
    }

    public void setBusinessParentId(Long businessParentId) {
        this.businessParentId = businessParentId;
    }

    public List<RecruitBaseSkill> getBaseSkills() {
        return baseSkills;
    }

    public void setBaseSkills(List<RecruitBaseSkill> baseSkills) {
        this.baseSkills = baseSkills;
    }

    public RecruitBusiness getRecruitBusiness() {
        return recruitBusiness;
    }

    public void setRecruitBusiness(RecruitBusiness recruitBusiness) {
        this.recruitBusiness = recruitBusiness;
    }
}
