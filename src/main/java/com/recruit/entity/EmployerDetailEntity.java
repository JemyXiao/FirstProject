package com.recruit.entity;

/**
 * 发布信息类
 */
public class EmployerDetailEntity extends EmployerBasic{

    private String companyName;

    private String trendComplete;

    private String projectDesc;

    private String publisher;

    private String phone;

    private String objectCycle;

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

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getObjectCycle() {
        return objectCycle;
    }

    public void setObjectCycle(String objectCycle) {
        this.objectCycle = objectCycle;
    }
}