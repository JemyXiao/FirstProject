package com.recruit.web;

import com.recruit.entity.RecruitIndustry;
import com.recruit.entity.ResultModel;
import com.recruit.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jmx on 2017/7/8.
 */
@RestController
public class IndustryController {
    @Autowired
    private IndustryService industryService;
    @RequestMapping(value = "/industry/getAllIndustry", method = RequestMethod.GET)
    public ResultModel getBusinessInfo() {
        List<RecruitIndustry> industryList = industryService.queryAllIndustry();
        return new ResultModel(200, industryList);
    }
}
