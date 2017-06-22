package com.recruit.web;

import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.ResultModel;
import com.recruit.entity.vo.EmployerViewHeaderObject;
import com.recruit.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/employer/queryDetail", method = RequestMethod.POST)
    public ResultModel queryEmployerDetail(@RequestBody EmployerDetailEntity record) {
        List<EmployerDetailEntity> employerEntityList =  employerService.queryEmployerDetail(record);
        return new ResultModel(200,employerEntityList);
    }
    @RequestMapping(value = "/employer/queryEmpViewHeader", method = RequestMethod.GET)
    public ResultModel queryEmployerDetail() {
        List<EmployerViewHeaderObject> viewHeaderObjects =  employerService.queryEmployerViewHeader();
        return new ResultModel(200,viewHeaderObjects);
    }
}
