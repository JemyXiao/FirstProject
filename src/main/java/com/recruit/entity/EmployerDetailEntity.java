package com.recruit.entity;

import lombok.Data;

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

}