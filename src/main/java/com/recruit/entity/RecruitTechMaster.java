package com.recruit.entity;

import java.util.Date;
import java.util.List;

/**
 * 牛人实体类
 */
public class RecruitTechMaster {

    private Long id;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 登录信息id
     */
    private String openId;
    /**
     * 日薪资(8小时)
     */
    private String dailyWage;
    /**
     * 城市id
     */
    private Long cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区域id
     */
    private Long areaId;
    /**
     * 性别
     */
    private String sex;
    /**
     * 状态(审核中，审核通过)
     */
    private String status;
    /**
     * 职位头衔
     */
    private String jobTitle;
    /**
     * 职业类型
     */
    private String recruitType;
    /**
     * 工作经验
     */
    private String workExperience;
    /**
     * 联系方式
     */
    private String phone;

    /**
     * 牛人评分
     */
    private Integer score;
    /**
     * 个人介绍
     */
    private String selfIntroduction;

    /**
     * 擅长技能
     */
    private List<Long> skills;
    /**
     * 行业id
     */
    private Long industryId;
    /**
     * 行业名称
     */
    private String industryName;

    /**
     * 作品案例
     */
    private List<RecruitMasterWorkCase> worksCases;

    /**
     *
     */
    private List<RecruitBaseSkill> baseSkillList;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(String dailyWage) {
        this.dailyWage = dailyWage;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRecruitType() {
        return recruitType;
    }

    public void setRecruitType(String recruitType) {
        this.recruitType = recruitType;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public List<Long> getSkills() {
        return skills;
    }

    public void setSkills(List<Long> skills) {
        this.skills = skills;
    }

    public List<RecruitMasterWorkCase> getWorksCases() {
        return worksCases;
    }

    public void setWorksCases(List<RecruitMasterWorkCase> worksCases) {
        this.worksCases = worksCases;
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public List<RecruitBaseSkill> getBaseSkillList() {
        return baseSkillList;
    }

    public void setBaseSkillList(List<RecruitBaseSkill> baseSkillList) {
        this.baseSkillList = baseSkillList;
    }
}