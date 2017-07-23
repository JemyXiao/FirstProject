package com.recruit.entity;

import lombok.Data;

/**
 * 牛人工作經驗
 */
@Data
public class RecruitMasterWorkCase {

    private Long id;
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
}