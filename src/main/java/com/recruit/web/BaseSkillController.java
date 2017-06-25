package com.recruit.web;

import com.recruit.entity.RecruitBaseSkill;
import com.recruit.entity.ResultModel;
import com.recruit.service.BaseSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
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
