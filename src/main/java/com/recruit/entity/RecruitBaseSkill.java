package com.recruit.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class RecruitBaseSkill {
    private Long id;

    private String skillName;

    private String skillType;

    @JSONField(serialize = false)
    private Date createdAt;

    @JSONField(serialize = false)
    private Date updatedAt;

    private Long skillCode;

    public RecruitBaseSkill(String skillName) {
        this.skillName = skillName;
    }
    public RecruitBaseSkill() {
    }
}