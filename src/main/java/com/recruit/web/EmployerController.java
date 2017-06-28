package com.recruit.web;

import com.recruit.common.aop.Operation;
import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.ResultModel;
import com.recruit.entity.vo.EmployerViewHeaderObject;
import com.recruit.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 * 发布信息controller
 */
@RestController
public class EmployerController {
    @Autowired
    private EmployerService employerService;

    @RequestMapping(value = "/employer/add", method = RequestMethod.POST)
    public ResultModel save(@RequestBody EmployerDetailEntity record) {
        employerService.addEmployer(record);
        return new ResultModel(200, "发布信息待审核");
    }
    @Operation(name = "employerCount")
    @RequestMapping(value = "/employer/queryDetail/{id}", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail(@PathVariable("id") long id) {
        EmployerDetailEntity employerEntity =  employerService.queryEmployerDetail(id);
        return new ResultModel(200,employerEntity);
    }
    @RequestMapping(value = "/employer/queryEmpViewHeader", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail() {
        List<EmployerBasic> viewHeaderObjects =  employerService.queryEmployerViewHeader();
        return new ResultModel(200,viewHeaderObjects);
    }
}
