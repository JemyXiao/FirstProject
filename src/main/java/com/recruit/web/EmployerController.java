package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.common.aop.Operation;
import com.recruit.common.validate.ValidateService;
import com.recruit.config.Constant;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.RecruitWatchList;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.EmployerService;
import com.recruit.service.TechMasterService;
import com.recruit.service.WatchListService;
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

    private final EmployerService employerService;
    private final TechMasterService techMasterService;
    private final WatchListService watchListService;

    @Autowired
    public EmployerController(EmployerService employerService, TechMasterService techMasterService, WatchListService watchListService) {
        this.employerService = employerService;
        this.techMasterService = techMasterService;
        this.watchListService = watchListService;
    }

    /**
     * 发布信息添加
     *
     * @param record  发布信息数据
     * @param request request servlet
     * @return ResultModel
     * @throws Exception exception
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
     *
     * @param id id
     * @return ResultModel
     */
    @Operation(name = "employerCount")
    @RequestMapping(value = "/employer/queryDetail/{id}", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail(@PathVariable("id") long id) {
        EmployerDetailEntity employerEntity = employerService.queryEmployerDetail(id, false);
        employerEntity.setPhone(null);
        return new ResultModel(200, employerEntity);
    }

    /**
     * 发布大厅列表
     *
     * @param record record
     * @return ResultModel
     */
    @RequestMapping(value = "/employer/queryEmpViewHeader", method = RequestMethod.POST)
    public ResultModel queryEmployerDetail(@RequestBody EmployerDto record) {
        if (record.getPageNumber() != 0 && record.getPageSize() != 0) {
            PageHelper.startPage(record.getPageNumber(), record.getPageSize());
        }
        record.setStatus(" != '" + Constant.RUNNING + "'");
        PageInfo pageInfo = PageHelper.startPage(record.getPageNumber(), record.getPageSize()).doSelectPageInfo(() -> employerService.queryEmployerViewHeader(record));
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rows", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(map));
    }

    /**
     * 确认牛人执行任务
     *
     * @param request servlet request
     * @return ResultModel
     */
    @GetMapping("/employer/confirm")
    public ResultModel confirm(HttpServletRequest request) {
        Long empId = Long.parseLong(request.getParameter("taskId"));
        Long masterId = Long.parseLong(request.getParameter("masterId"));
        Map<String, Object> map = new HashMap<>();
        map.put("empId", empId);
        map.put("masterId", masterId);
        employerService.confirmMaster(map);
        map.put("status", Constant.RUNNING);
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
        Map<String, Object> map = new HashMap<>();
        map.put("empId", empId);
        map.put("status", status);
        employerService.updateStatus(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 关注牛人
     */
    @GetMapping("/employer/watchMaster")
    public ResultModel watchMaster(HttpServletRequest request) {
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        //关注牛人id
        Long masterId = Long.parseLong(request.getParameter("masterId"));
        //操了类型
        String operateType = request.getParameter("operateType");
        RecruitWatchList watchList = new RecruitWatchList();
        watchList.setWatchMaterId(masterId);
        watchList.setEmpMasterId(techMaster.getId());
        watchList.setStatus(operateType);
        watchListService.watch(watchList);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));

    }


}
