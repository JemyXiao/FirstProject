package com.recruit.entity;

import com.recruit.enums.UserSexEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;

    private String passWord;

    private UserSexEnum userSex;

    private String nickName;

    public UserEntity() {
        super();
    }

    public UserEntity(String userName, String passWord, UserSexEnum userSex) {
        super();
        this.passWord = passWord;
        this.userName = userName;
        this.userSex = userSex;
    }
}