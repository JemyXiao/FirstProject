package com.recruit.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.recruit.common.validate.DV;
import lombok.Data;

import javax.persistence.Transient;
import java.util.List;

/**
 * Created by jmx on 2017/6/30.
 * 发布信息dto
 */
@Data
public class EmployerDto {
    private Long id;
    /**
     * 項目類型一级类型
     */
    @DV(description = "项目类型")
    private Long businessParentId;
    /**
     * 项目类型二级类型
     */
    private Long businessId;
    /**
     * 所需技能列表
     */
    private List<Long> skillList;
    /**
     * 项目名称
     */
    @DV(description = "项目名称")
    private String projectName;
    /**
     * 项目描述
     */
    @DV(description = "项目描述")
    private String projectDesc;
    /**
     * 价格预算
     */
    @DV(description = "价格预算")
    private String projectBudget;
    /**
     * 项目周期
     */
    @DV(description = "项目周期")
    private String projectCycle;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 倾向让谁完成项目
     */
    @DV(description = "倾向让谁完成项目")
    private String trendComplete;

    /**
     * 状态类型
     *
     * @return
     */
    private String status;

    /**
     * 发布者id
     *
     * @return
     */
    private Long masterId;

    @JSONField(serialize = false)
    private int pageNumber;

    @Transient
    @JSONField(serialize = false)
    private int pageSize;
}
