package com.recruit.entity;

import lombok.Data;

import java.util.Date;

/**
 * 牛人工作经验映射表
 */
@Data
public class RecruitMasterWorkMapping {

    private Long id;

    private Long techMasterId;

    private Long workCaseId;

    private Date createdAt;

    private Date updatedAt;
}