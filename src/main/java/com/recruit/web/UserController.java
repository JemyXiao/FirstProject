package com.recruit.web;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.recruit.common.mail.PassWordDecoder;
import com.recruit.entity.ResultModel;
import com.recruit.util.CookieUtils;
import com.recruit.util.ErrorCode;
import com.recruit.util.TokenProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.recruit.entity.UserEntity;
import com.recruit.mapper.UserMapper;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/admin/getUsers")
    public ResultModel getUsers() {
        return new ResultModel(200,userMapper.getAll());
    }

    @GetMapping("/admin/getUser")
    public ResultModel getUser(Long id) {
        return new ResultModel(200,userMapper.getOne(id));
    }
    @GetMapping("/admin/getUserInfo")
    public ResultModel getUserInfo(HttpServletRequest request) {
        String token = CookieUtils.getCookieValue(request, "COFFEE_TOKEN");
        UserEntity entity = userMapper.getUserByToken(token);
        return new ResultModel(200,entity);

    }

    @PostMapping("/admin/addUser")
    public ResultModel save(@RequestBody UserEntity user) throws IOException {
        user.setPassWord(PassWordDecoder.encode(user.getPassWord()));
        userMapper.insert(user);
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));

    }

    @PostMapping(value = "/admin/update")
    public ResultModel update(@RequestBody UserEntity user) {
        userMapper.update(user);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    @RequestMapping(value = "/admin/deleteUser/{id}")
    public ResultModel delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    @PostMapping("/login")
    public ResultModel login(@RequestBody UserEntity userEntity, HttpServletResponse response) {
        try {
            userEntity.setPassWord(PassWordDecoder.encode(userEntity.getPassWord()).trim());
        } catch (IOException e) {
            log.error("加密异常", e);
        }
        UserEntity entity = userMapper.getUserBySelect(userEntity);
        if (Objects.isNull(entity)) {
            return new ResultModel(401, "用戶不存在,请联系管理员添加");
        } else {
            String token = TokenProcessor.getInstance().generateToken(userEntity.getUserName(), true);
            userEntity.setToken(token);
            userMapper.update(userEntity);
            CookieUtils.setTokenToCookie(response, token);
            return new ResultModel(200, "登录成功", userEntity);
        }
    }


}