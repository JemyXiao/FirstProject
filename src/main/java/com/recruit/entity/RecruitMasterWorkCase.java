package com.recruit.entity;

public class RecruitMasterWorkCase {
    private Long id ;

    /**
     * 工作经验
     */
    private String workName;
    /**
     * 职责
     */
    private String responsibilities;
    /**
     * 作品链接
     */
    private String worksLink;
    /**
     * 作品描述
     */
    private String worksDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getWorksLink() {
        return worksLink;
    }

    public void setWorksLink(String worksLink) {
        this.worksLink = worksLink;
    }

    public String getWorksDesc() {
        return worksDesc;
    }

    public void setWorksDesc(String worksDesc) {
        this.worksDesc = worksDesc;
    }
}