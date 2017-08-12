package com.recruit.entity;

import lombok.Data;

import java.util.Date;
@Data
public class RecruitWatchList {
    private Long id;

    private Long watchMaterId;

    private Long empMasterId;

    private String status;

    private Date createdAt;

    private Date updatedAt;

}