package com.recruit.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by jmx
 * 2017/6/22.
 */
@Data
public class TechMasterBasicSkillMapper {

    private Long id;

    private Long techMasterId;

    private Long skillId;

    private Date createdAt;

    private Date updatedAt;
}
