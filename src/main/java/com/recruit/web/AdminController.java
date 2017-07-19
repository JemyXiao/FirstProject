package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.EmployerService;
import com.recruit.service.TechMasterService;
import com.recruit.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jmx
 * 2017/7/19.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private EmployerService employerService;

    @Autowired
    private TechMasterService techMasterService;

    /**
     * 任务列表查询
     */
    @GetMapping("/queryEmpList")
    public ResultModel queryEmpList(HttpServletRequest request) {
        EmployerDto record = new EmployerDto();
        record.setStatus(request.getParameter("status"));
        PageInfo pageInfo = PageHelper.startPage(Integer.parseInt(request.getParameter("pageNumber")), Integer.parseInt(request.getParameter("pageSize"))).doSelectPageInfo(() -> employerService.queryEmployerViewHeader(record));
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rows", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(map));
    }

    /**
     * 任务详情查询
     */
    @GetMapping("/detailEmp")
    public ResultModel detailEmp(HttpServletRequest request) {
        EmployerDetailEntity employerEntity = employerService.queryEmployerDetail(Long.parseLong(request.getParameter("id")));
        return new ResultModel(200, employerEntity);
    }

    /**
     * 任务审核
     */
    @GetMapping("/checkEmp")
    public ResultModel checkEmp(HttpServletRequest request) {
        employerService.checkEmp(Long.parseLong(request.getParameter("id")), request.getParameter("status"));
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 用户列表查询
     */
    @GetMapping("/queryMasterList")
    public ResultModel queryMasterList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        String status = request.getParameter("status");
        Map<String, Object> map = new HashMap();
        map.put("status", status);
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> techMasterService.selectAllMaster(map));
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }
    /**
     * 用户详情查询
     */
    @GetMapping("/queryMasterDetail")
    public ResultModel queryMasterDetail(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        RecruitTechMaster master = techMasterService.getTechMasterById(id);
        return new ResultModel(200, master);
    }
    /**
     * 用户审核
     */
    @GetMapping("/checkMaster")
    public ResultModel checkMaster(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        String status = request.getParameter("status");
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("status",status);
        techMasterService.checkTechMaster(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }
}
