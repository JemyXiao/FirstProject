package com.recruit.web;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.common.mail.PassWordDecoder;
import com.recruit.config.Constant;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.EmployerService;
import com.recruit.service.TechMasterService;
import com.recruit.util.CookieUtils;
import com.recruit.util.ErrorCode;
import com.recruit.util.HttpURLConnectionUtils;
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
    @Autowired
    private HttpURLConnectionUtils httpURLConnectionUtils;
    @Autowired
    private TechMasterService techMasterService;
    @Autowired
    private EmployerService employerService;

    @GetMapping("/admin/getUsers")
    public ResultModel getUsers() {
        return new ResultModel(200, userMapper.getAll());
    }

    @GetMapping("/admin/getUser")
    public ResultModel getUser(Long id) {
        return new ResultModel(200, userMapper.getOne(id));
    }

    @GetMapping("/admin/getUserInfo")
    public ResultModel getUserInfo(HttpServletRequest request) {
        String token = CookieUtils.getCookieValue(request, "COFFEE_TOKEN");
        UserEntity entity = userMapper.getUserByToken(token);
        return new ResultModel(200, entity);

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

    @GetMapping("/user/login")
    public ResultModel userLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        log.info("techMater:{}", techMaster);
        if (!Objects.isNull(techMaster)) {
            return new ResultModel(200, "登录成功", techMaster.getOpenId());
        } else {
            String code = request.getParameter("code");
            Map<String, Object> map = httpURLConnectionUtils.getGetTokenUrl(code);
            String token = httpURLConnectionUtils.getToken();
            map.put("accessToken", token);
            JSONObject object = httpURLConnectionUtils.getUserInfo(map);
            RecruitTechMaster master = new RecruitTechMaster();
            master.setOpenId((String) object.get("openid"));
            master.setNickName((String) object.get("nickname"));
            master.setSex(object.get("sex").equals(1) ? "MAN" : "WOMEN");
            master.setStatus(Constant.TODO_EDIT);
            master.setHeadImgUrl((String) object.get("headimgurl"));
            RecruitTechMaster master1 = techMasterService.getMasterByOpenId((String) object.get("openid"));
            if (Objects.isNull(master1)) {
                techMasterService.addTechMaster(master);
            }
            return new ResultModel(200, "登录成功", JSON.toJSON(master.getOpenId()));
        }

    }

    //個人信息我的任务查询

    /**
     * 个人发出、接收招募信息
     * todo
     */
    @RequestMapping(value = "/techMaster/getEmployer", method = RequestMethod.GET)
    public ResultModel getEmployerByMasterId(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        String status = request.getParameter("status");
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        //查询发出方信息
        Map<String, Object> map = new LinkedHashMap<>();
        PageInfo pageInfo;
        //获取发出
        if (status.equals("send")) {
            EmployerDto record = new EmployerDto();
            record.setPageNumber(pageNumber);
            record.setPageSize(pageSize);
            record.setMasterId(techMaster.getId());
            pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> techMasterService.getEmployerByMasterId(record));
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return new ResultModel(200, map);
        } else { //接收任务信息
            pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> techMasterService.getEmployerByReview(techMaster.getId()));
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return new ResultModel(200, map);
        }

    }
    //个人信息我的任务详情
    @RequestMapping(value = "/userInfo/queryDetailEmp/{id}", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail(@PathVariable("id") long id) {
        EmployerDetailEntity employerEntity = employerService.queryUserInfoEmp(id);
        return new ResultModel(200, employerEntity);
    }
}