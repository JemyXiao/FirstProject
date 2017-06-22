package com.recruit.web;

import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.ResultModel;
import com.recruit.service.TechMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jmx on 17/6/18.
 * 牛人controller
 */
public class TechMasterController {
    @Autowired
    private TechMasterService techMasterService;
    @RequestMapping(value = "/techMaster/add", method = RequestMethod.POST)
    public ResultModel saveTechMaster(@RequestBody RecruitTechMaster record) {
        techMasterService.addTechMaster(record);
        return new ResultModel(200, "条件信息成功");
    }
    @RequestMapping(value = "/techMaster/update", method = RequestMethod.POST)
    public ResultModel updateTechMaster(@RequestBody RecruitTechMaster record) {
        techMasterService.addTechMaster(record);
        return new ResultModel(200, "修改信息成功");
    }

    @RequestMapping(value = "/techMaster/delete/{id}", method = RequestMethod.GET)
    public ResultModel deleteTechMaster(@PathVariable("id") long id) {
        techMasterService.deleteTechMaster(id);
        return new ResultModel(200, "删除成功");
    }
}
