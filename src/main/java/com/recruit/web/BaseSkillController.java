package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.recruit.entity.RecruitBaseSkill;
import com.recruit.entity.ResultModel;
import com.recruit.service.BaseSkillService;
import com.recruit.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
@RestController
public class BaseSkillController {
    private final BaseSkillService baseSkillService;

    @Autowired
    public BaseSkillController(BaseSkillService baseSkillService) {
        this.baseSkillService = baseSkillService;
    }

    @RequestMapping(value = "/skill/getSkillInfo", method = RequestMethod.GET)
    public ResultModel getSkillInfo() {
        List<RecruitBaseSkill> baseSkills = baseSkillService.getBaseSkillInfo();
        return new ResultModel(200, baseSkills);
    }
}
