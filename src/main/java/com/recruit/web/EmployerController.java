package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.common.aop.Operation;
import com.recruit.common.validate.ValidateService;
import com.recruit.config.Constant;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.EmployerService;
import com.recruit.service.TechMasterService;
import com.recruit.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jmx on 17/6/18.
 * 发布信息controller
 */
@RestController
public class EmployerController {
    @Autowired
    private EmployerService employerService;
    @Autowired
    private TechMasterService techMasterService;

    /**
     * 发布信息添加
     * @param record
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/employer/add", method = RequestMethod.POST)
    public ResultModel save(@RequestBody EmployerDto record, HttpServletRequest request) throws Exception {
        ValidateService.valid(record);
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        record.setMasterId(techMaster.getId());
        employerService.addEmployer(record);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 发布信息详情
     * @param id
     * @return
     */
    @Operation(name = "employerCount")
    @RequestMapping(value = "/employer/queryDetail/{id}", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail(@PathVariable("id") long id) {
        EmployerDetailEntity employerEntity = employerService.queryEmployerDetail(id);
        return new ResultModel(200, employerEntity);
    }

    /**
     * 发布大厅列表
     * @param record
     * @return
     */
    @RequestMapping(value = "/employer/queryEmpViewHeader", method = RequestMethod.POST)
    public ResultModel queryEmployerDetail(@RequestBody EmployerDto record) {
        if (record.getPageNumber() != 0 && record.getPageSize() != 0) {
            PageHelper.startPage(record.getPageNumber(), record.getPageSize());
        }
        record.setStatus(Constant.COMPLETED);
        PageInfo pageInfo = PageHelper.startPage(record.getPageNumber(), record.getPageSize()).doSelectPageInfo(() -> employerService.queryEmployerViewHeader(record));
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rows", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(map));
    }

    /**
     * 确认牛人执行任务
     * @param request
     * @return
     */
    @GetMapping("/employer/confirm")
    public ResultModel confirm(HttpServletRequest request) {
        Long empId = Long.parseLong(request.getParameter("taskId"));
        Long masterId = Long.parseLong(request.getParameter("masterId"));
        Map map = new HashMap();
        map.put("empId", empId);
        map.put("masterId", masterId);
        employerService.confirmMaster(map);
        map.put("status", "进行中");
        employerService.updateStatus(map);
        return new ResultModel(200, JSON.toJSON("绑定成功"));
    }

    /**
     * 确认牛人已完成操作
     */
    @GetMapping("/employer/completed")
    public ResultModel completed(HttpServletRequest request) {
        Long empId = Long.parseLong(request.getParameter("id"));
        String status = request.getParameter("status");
        Map map = new HashMap();
        map.put("empId", empId);
        map.put("status", status);
        employerService.updateStatus(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

}
