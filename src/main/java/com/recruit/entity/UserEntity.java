package com.recruit.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;

    private String passWord;

    private String token;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
}