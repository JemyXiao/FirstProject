package com.recruit.entity;

import lombok.Data;

/**
 * Created by jmx on 2017/6/28.
 * 发布信息操作类
 */
@Data
public class EmployerOperator {

    private Long id;

    private Long employerId;

    private int visitCount;

    private int applyCount;

    private int recommendCount;

}
