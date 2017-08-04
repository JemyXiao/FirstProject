package com.recruit.service.impl;

import com.recruit.common.exception.RecruitValidationException;
import com.recruit.entity.RecruitBaseSkill;
import com.recruit.entity.RecruitBusiness;
import com.recruit.entity.RecruitCity;
import com.recruit.mapper.RecruitBaseSkillMapper;
import com.recruit.mapper.RecruitCityMapper;
import com.recruit.service.BaseSkillService;
import com.recruit.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 2017/6/24.
 */
@Service
@Transactional
@Slf4j
public class BaseSkillServiceImpl implements BaseSkillService {
    @Autowired
    private RecruitBaseSkillMapper baseSkillMapper;

    @Override
    public List<RecruitBaseSkill> getBaseSkillInfo() {
        return baseSkillMapper.selectALLSkill();
    }

    @Override
    public List<RecruitBaseSkill> getBaseSkillInfo(Long id) {
        return baseSkillMapper.selectSkillByMasterId(id);
    }

    @Override
    public int insert(RecruitBaseSkill record) {
        //查询是否有相同名字的技能
        RecruitBaseSkill recruitBaseSkill = baseSkillMapper.selectBySelect(new RecruitBaseSkill(record.getSkillName().trim()));
        if (!ObjectUtils.isEmpty(recruitBaseSkill)) {
            throw new RecruitValidationException("技能已经存在，请修改");
        }
        long skillCode = baseSkillMapper.maxSkillCode(record.getSkillType());
        record.setSkillCode(skillCode);
        baseSkillMapper.insert(record);
        return 1;
    }

    @Override
    public int delete(Long id) {
        return baseSkillMapper.deleteByPrimaryKey(id);
    }

    //修改技能名称
    @Override
    public int update(RecruitBaseSkill record) {
        return baseSkillMapper.updateByPrimaryKeySelective(record);
    }
}
