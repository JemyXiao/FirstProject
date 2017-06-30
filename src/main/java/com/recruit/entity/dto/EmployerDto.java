package com.recruit.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Transient;
import java.util.List;

/**
 * Created by jmx on 2017/6/30.
 *  发布信息dto
 */
public class EmployerDto {
    private Long id;
    /**
     * 項目類型一级类型
     */
    private Long businessParentId;
    /**
     * 项目类型二级类型
     */
    private Long businessId;
    /**
     * 所需技能列表
     */
    private List<Long> skillList;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目描述
     */
    private String projectDesc;
    /**
     * 价格预算
     */
    private String projectBudget;
    /**
     * 项目周期
     */
    private String objectCycle;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 倾向让谁完成项目
     */
    private String trendComplete;

    /**
     * 状态类型
     * @return
     */
    private String status;

    @JSONField(serialize = false)
    private int pageNumber;
    @Transient
    @JSONField(serialize = false)
    private int pageSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBusinessParentId() {
        return businessParentId;
    }

    public void setBusinessParentId(Long businessParentId) {
        this.businessParentId = businessParentId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public List<Long> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Long> skillList) {
        this.skillList = skillList;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(String projectBudget) {
        this.projectBudget = projectBudget;
    }

    public String getObjectCycle() {
        return objectCycle;
    }

    public void setObjectCycle(String objectCycle) {
        this.objectCycle = objectCycle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTrendComplete() {
        return trendComplete;
    }

    public void setTrendComplete(String trendComplete) {
        this.trendComplete = trendComplete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
