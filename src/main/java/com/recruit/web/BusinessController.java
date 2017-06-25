package com.recruit.web;

import com.recruit.entity.RecruitBusiness;
import com.recruit.entity.ResultModel;
import com.recruit.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
public class BusinessController {
    private final BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @RequestMapping(value = "/business/getBusinessInfo", method = RequestMethod.GET)
    public ResultModel getBusinessInfo() {
        List<RecruitBusiness> businesses = businessService.getBusinessInfo();
        return new ResultModel(200, businesses);
    }
}
