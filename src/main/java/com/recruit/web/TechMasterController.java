package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.common.exception.RecruitValidationException;
import com.recruit.common.validate.ValidateService;
import com.recruit.config.Constant;
import com.recruit.entity.RecruitMasterWorkCase;
import com.recruit.entity.RecruitMasterWorkMapping;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.TechMasterService;
import com.recruit.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 17/6/18.
 * 牛人controller
 */
@RestController
public class TechMasterController {

    @Autowired
    private TechMasterService techMasterService;

    /**
     * 人员信息完善
     *
     * @param record
     * @return
     */
    @RequestMapping(value = "/techMaster/add", method = RequestMethod.POST)
    public ResultModel saveTechMaster(HttpServletRequest request, @RequestBody RecruitTechMaster record) {
        techMasterService.addTechMaster(record);
        return new ResultModel(200, "添加信息成功");
    }

    /**
     * 修改人员信息
     *
     * @param record
     * @return
     */
    @RequestMapping(value = "/techMaster/update", method = RequestMethod.POST)
    public ResultModel updateTechMaster(@RequestBody RecruitTechMaster record, HttpServletRequest request) {
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        //赋值跟新id
        record.setId(techMaster.getId());
        record.setStatus(Constant.TODO_EDIT);
        techMasterService.updateTechMaster(record);
        return new ResultModel(200, "修改信息成功");
    }

    /**
     * 修改工作案例信息
     *
     * @param record
     * @return
     */
    @RequestMapping(value = "/techMasterWorksCase/update", method = RequestMethod.POST)
    public ResultModel updateTechMasterWorkCases(@RequestBody RecruitMasterWorkCase record, HttpServletRequest request) throws Exception {
        ValidateService.valid(record);
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        //赋值跟新id
        techMasterService.updateWorksCase(record, techMaster.getId());
        return new ResultModel(200, "修改信息成功");
    }

    /**
     * 刪除工作案例信息
     *
     * @param request
     * @return
     */
    @GetMapping("/techMaster/delWorksCase")
    public ResultModel deleteWorkCase(HttpServletRequest request) {
        long id = Long.valueOf(request.getParameter("id"));
        techMasterService.deleteWorkCasById(id);
        return new ResultModel(200, ErrorCode.DELETE_OK);
    }

    //根据id查询工作案例
    @GetMapping("/techMaster/queryWorkCase")
    public ResultModel queryWorkCase(HttpServletRequest request) {
        long id = Long.valueOf(request.getParameter("id"));
        RecruitMasterWorkCase workCase = techMasterService.queryWorkCase(id);
        return new ResultModel(200, workCase);

    }

    /**
     * 提交审核
     */
    @GetMapping("/checkMaster")
    public ResultModel checkMaster(HttpServletRequest request) {
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        //赋值跟新id
        RecruitTechMaster master = new RecruitTechMaster();
        master.setStatus(Constant.TODO_AUDIT);
        master.setId(techMaster.getId());
        int cont = techMasterService.selectByMasterId(master.getId());
        if (cont < 2) {
            throw new RecruitValidationException("作品案例最少两条，请完善");
        }
        techMasterService.updateTechMaster(master);
        return new ResultModel(200, "审核已提交");
    }

    /**
     * 删除人员信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/techMaster/delete/{id}", method = RequestMethod.GET)
    public ResultModel deleteTechMaster(@PathVariable("id") long id) {
        techMasterService.deleteTechMaster(id);
        return new ResultModel(200, JSON.toJSON("删除信息成功"));
    }

    /**
     * 牛人发送申请意向
     * todo
     */
    @RequestMapping(value = "/techMaster/applyEmployer/{id}", method = RequestMethod.GET)
    public ResultModel applyEmployer(@PathVariable("id") long id, HttpServletRequest request) {
        techMasterService.applyEmployer(id, request);
        return new ResultModel(200, JSON.toJSON("申请成功"));
    }

    /**
     * 查询牛人列表
     * todo
     */
    @RequestMapping(value = "/techMaster/queryMasterList", method = RequestMethod.GET)
    public ResultModel queryMasterList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        int cityId = StringUtils.isEmpty(request.getParameter("cityId")) ? 0 : Integer.parseInt(request.getParameter("cityId"));
        int industryId = StringUtils.isEmpty(request.getParameter("industryId")) ? 0 : Integer.parseInt(request.getParameter("industryId"));
        String queryParam = request.getParameter("queryParam");
        Map<String, Object> map = new HashMap();
        map.put("cityId", cityId);
        map.put("industryId", industryId);
        map.put("queryParam", queryParam);
        map.put("status", Constant.COMPLETED);
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> techMasterService.selectAllMaster(map));
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 查询牛人详情
     * todo
     */
    @RequestMapping(value = "/techMaster/queryMasterDetail", method = RequestMethod.GET)
    public ResultModel queryMasterDetail(HttpServletRequest request) {
        //获取登录人信息
        Long id;
        String string = request.getParameter("id");
        if (StringUtils.isEmpty(string)) {
            RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
            id = techMaster.getId();
        } else {
            id = Long.valueOf(string);
        }
        RecruitTechMaster master = techMasterService.getTechMasterById(id);
        return new ResultModel(200, master);
    }

}
