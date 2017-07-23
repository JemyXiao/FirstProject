package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.*;
import com.recruit.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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

    @Autowired
    private BaseSkillService baseSkillService;

    @Autowired
    private CityService cityService;

    @Autowired
    private IndustryService industryService;

    @Autowired
    private DataDictionaryService dataDictionaryService;

    @Autowired
    private BusinessService businessService;

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
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("status", status);
        techMasterService.checkTechMaster(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 技能新增
     */
    @PostMapping(value = "/addSkill")
    public ResultModel addSkill(@RequestBody RecruitBaseSkill record) {
        baseSkillService.insert(record);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 技能删除
     */
    @GetMapping("/deleteSkill")
    public ResultModel deleteSkill(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        baseSkillService.delete(id);
        return new ResultModel(200, JSON.toJSON(ErrorCode.DELETE_OK));
    }

    /**
     * 技能查询
     */
    @GetMapping("/querySkillList")
    public ResultModel querySkillList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> baseSkillService.getBaseSkillInfo());
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 城市列表
     */
    @GetMapping("/queryCityList")
    public ResultModel queryCityList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> cityService.getAllCity());
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 新增城市
     */
    @PostMapping("/addCity")
    public ResultModel addCity(@RequestBody RecruitCity record) {
        cityService.insert(record);
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 行业查询
     */
    @GetMapping("/queryAllIndustry")
    public ResultModel queryAllIndustry(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> industryService.queryAllIndustry());
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 行业新增
     */
    @PostMapping("/addIndustry")
    public ResultModel addIndustry(@RequestBody RecruitIndustry industry) {
        industryService.insert(industry);
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 数据字典查询
     */
    @GetMapping("/queryDataDictionary")
    public ResultModel queryDataDictionary(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> dataDictionaryService.getDataDictionary(new HashMap()));
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 数据字新增
     */
    @PostMapping("/addDataDictionary")
    public ResultModel addDataDictionary(@RequestBody DataDictionaryEntity entity) {
        dataDictionaryService.insert(entity);
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 业务类型(策划，设计，活动，影视)
     */
    @GetMapping("/queryBusinessType")
    public ResultModel queryBusinessType() {
        Map<String, Object> map = new HashMap();
        map.put("parentId", 0);
        List<RecruitBusiness> businessList = businessService.getBusinessType(map);
        return new ResultModel(200, businessList);
    }

    /**
     * 查询所有业务数据
     */
    @GetMapping("/queryBusinessList")
    public ResultModel queryBusinessList(HttpServletRequest request) {
        List<RecruitBusiness> businessList = businessService.getBusinessInfo();
        return new ResultModel(200, businessList);
    }

    /**
     * 新增业务
     */
    @PostMapping("/addBusiness")
    public ResultModel addBusiness(@RequestBody RecruitBusiness record) {
        businessService.insert(record);
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }
}
