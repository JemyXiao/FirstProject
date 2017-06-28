package com.recruit.web;

import com.recruit.common.aop.Operation;
import com.recruit.entity.RecruitCity;
import com.recruit.entity.ResultModel;
import com.recruit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 *
 */
@RestController
public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @RequestMapping(value = "/city/getAllCity", method = RequestMethod.GET)
    public ResultModel getAllCity() {
        List<RecruitCity> recruitCities = cityService.getAllCity();
        return new ResultModel(200, recruitCities);
    }
}
