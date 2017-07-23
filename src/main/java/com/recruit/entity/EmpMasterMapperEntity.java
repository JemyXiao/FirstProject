package com.recruit.entity;

import lombok.Data;

import java.util.Date;
@Data
public class EmpMasterMapperEntity {

    private Long id;

    private Long techMasterId;

    private Long employerId;

    private String status;

    private Date createdAt;

    private Date updatedAt;

}