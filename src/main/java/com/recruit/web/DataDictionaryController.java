package com.recruit.web;

import com.recruit.entity.ResultModel;
import com.recruit.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jmx on 17/6/18.
 */
@RestController
public class DataDictionaryController {
    private final BusinessService businessService;

    @Autowired
    public DataDictionaryController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @RequestMapping(value = "/dataDictionary/getByCode/{code}", method = RequestMethod.GET)
    public ResultModel deleteTechMaster(@PathVariable("id") long id) {
//        techMasterService.deleteTechMaster(id);
        return new ResultModel(200,null);
    }
}
