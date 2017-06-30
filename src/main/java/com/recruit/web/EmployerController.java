package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.common.aop.Operation;
import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.entity.vo.EmployerViewHeaderObject;
import com.recruit.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 17/6/18.
 * 发布信息controller
 */
@RestController
public class EmployerController {
    @Autowired
    private EmployerService employerService;

    @RequestMapping(value = "/employer/add", method = RequestMethod.POST)
    public ResultModel save(@RequestBody EmployerDto record) {
        employerService.addEmployer(record);
        return new ResultModel(200, "发布信息待审核");
    }
    @Operation(name = "employerCount")
    @RequestMapping(value = "/employer/queryDetail/{id}", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail(@PathVariable("id") long id) {
        EmployerDetailEntity employerEntity =  employerService.queryEmployerDetail(id);
        return new ResultModel(200,employerEntity);
    }
    @RequestMapping(value = "/employer/queryEmpViewHeader", method = RequestMethod.POST)
    public ResultModel queryEmployerDetail(@RequestBody EmployerDto record) {
//        if (record.getPageNumber() != 0 && record.getPageSize() != 0) {
//            PageHelper.startPage(record.getPageNumber(), record.getPageSize());
//        }
        List<EmployerBasic> basicList =  employerService.queryEmployerViewHeader(record);
//        int total = employerService.queryCountViewCount(record);
//        Map<String, Object> map = new LinkedHashMap<>();
//        map.put("rows", basicList);
//        map.put("total", total);
        return new ResultModel(200, basicList);
    }
}
