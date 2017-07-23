package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RecruitBusiness implements Serializable {
    private Long id;

    private String businessName;

    private String businessCode;

    private Long parentId;

    private List<RecruitBusiness> children;

    private RecruitBusiness parentBusiness;

    @JSONField(serialize = false)
    private Date createdAt;

    @JSONField(serialize = false)
    private Date updatedAt;

}