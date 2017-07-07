package com.recruit.entity.vo;

/**
 * Created by jmx on 2017/7/7.
 */
public class TechMasterViewHeaderVo {
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 城市id
     */
    private String cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 个人介绍
     */
    private String selfIntroduction;
    /**
     * 职位头衔
     */
    private String jobTitle;
    /**
     * 日薪资(8小时)
     */
    private String dailyWage;
    /**
     * 联系方式
     */
    private String phone;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(String dailyWage) {
        this.dailyWage = dailyWage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
