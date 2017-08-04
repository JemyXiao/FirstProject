package com.recruit.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 发布信息类
 */
@Data
public class EmployerDetailEntity extends EmployerBasic {

    private String companyName;

    private String trendComplete;

    private String projectDesc;

    private String publisher;

    private String phone;

    private String projectCycle;

    private String reason;

    private String masterId;

    private List<RecruitTechMaster> applyList;

    private RecruitScore empScore;

    private Map scoreMap;

}