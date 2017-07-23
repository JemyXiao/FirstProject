package com.recruit.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by jmx
 * 2017/6/29.
 */
@Data
public class EmployerSkillMapper {

    private Long id;

    private Long employerId;

    private Long skillId;

    private Date createdAt;

    private Date updatedAt;

}
