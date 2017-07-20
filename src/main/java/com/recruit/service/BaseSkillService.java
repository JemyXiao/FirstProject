package com.recruit.service;

import com.recruit.entity.RecruitBaseSkill;
import com.recruit.entity.RecruitCity;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 2017/6/24.
 */
public interface BaseSkillService {

    List<RecruitBaseSkill> getBaseSkillInfo();

    List<RecruitBaseSkill> getBaseSkillInfo(Long id);

    int insert(RecruitBaseSkill record);

    int delete(Long id);
}
