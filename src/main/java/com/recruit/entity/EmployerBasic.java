package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by jmx on 17/6/21.
 * 首页响应基础信息
 */
@Data
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
    /**
     *
     */

    @JSONField(serialize = false)
    private Date createdAt;
    /**
     *
     */

    @JSONField(serialize = false)
    private Date updatedAt;


}
