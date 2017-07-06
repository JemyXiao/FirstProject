package com.recruit.web;

import com.recruit.entity.EmployerBasic;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.ResultModel;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.TechMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
     * @param record
     * @return
     */
    @RequestMapping(value = "/techMaster/add", method = RequestMethod.POST)
    public ResultModel saveTechMaster(HttpServletRequest request,@RequestBody RecruitTechMaster record) {
        techMasterService.addTechMaster(record);
        return new ResultModel(200, "添加信息成功");
    }

    /**
     * 修改人员信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/techMaster/update", method = RequestMethod.POST)
    public ResultModel updateTechMaster(@RequestBody RecruitTechMaster record,HttpServletRequest request) {
//        //获取登录人信息
//        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
//        //赋值跟新id
        record.setId(1L);
        techMasterService.updateTechMaster(record);
        return new ResultModel(200, "修改信息成功");
    }

    /**
     * 删除人员信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/techMaster/delete/{id}", method = RequestMethod.GET)
    public ResultModel deleteTechMaster(@PathVariable("id") long id) {
        techMasterService.deleteTechMaster(id);
        return new ResultModel(200, "删除信息成功");
    }
    /**
     * 牛人发送申请意向
     * todo
     */
    /**
     * 查询牛肉列表
     * todo
     */

    /**
     * 个人发出、接收招募信息
     * todo
     */
    @RequestMapping(value = "/techMaster/getEmployer", method = RequestMethod.GET)
    public ResultModel getEmployerByMasterId(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        String status = request.getParameter("status");
        //获取登录人信息
        RecruitTechMaster techMaster = techMasterService.getTechMaster(request);
        //查询发出方信息
        if (status.equals("send")) {
            EmployerDto record = new EmployerDto();
            record.setPageNumber(pageNumber);
            record.setPageSize(pageSize);
            record.setMasterId(techMaster.getId());
            techMasterService.getEmployerByMasterId(record);
        }else {

        }


        return new ResultModel(200,"查询成功" );
    }


}
