package com.recruit.web;

import com.recruit.entity.DataDictionaryEntity;
import com.recruit.entity.ResultModel;
import com.recruit.service.BusinessService;
import com.recruit.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 17/6/18.
 */
@RestController
public class DataDictionaryController {
    @Autowired
    private DataDictionaryService dataDictionaryService;

    @RequestMapping(value = "/dataDictionary/getByCode/{id}", method = RequestMethod.GET)
    public ResultModel selectDictionary(@PathVariable("id") long id) {
        Map<String,Object> map = new HashMap<>();
        map.put("code",id);
        List<DataDictionaryEntity> dataDictionaryEntities = dataDictionaryService.getDataDictionary(map);
        return new ResultModel(200,dataDictionaryEntities);
    }
}
