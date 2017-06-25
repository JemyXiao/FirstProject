package com.recruit.service.impl;

import com.recruit.entity.RecruitBaseSkill;
import com.recruit.entity.RecruitCity;
import com.recruit.mapper.RecruitBaseSkillMapper;
import com.recruit.mapper.RecruitCityMapper;
import com.recruit.service.BaseSkillService;
import com.recruit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jmx on 2017/6/24.
 */
@Service
public class BaseSkillServiceImpl implements BaseSkillService {
    @Autowired
    private RecruitBaseSkillMapper baseSkillMapper;

    @Override
    public List<RecruitBaseSkill> getBaseSkillInfo() {
        return baseSkillMapper.selectALLSkill();
    }
}
