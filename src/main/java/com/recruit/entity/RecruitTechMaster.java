package com.recruit.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 牛人实体类
 */
@Data
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
     * 技能列表
     */
    private List<RecruitBaseSkill> baseSkillList;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;

}