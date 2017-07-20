package com.recruit.mapper;

import com.recruit.entity.RecruitBaseSkill;

import java.util.List;
import java.util.Map;

public interface RecruitBaseSkillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RecruitBaseSkill record);

    int insertSelective(RecruitBaseSkill record);

    List<RecruitBaseSkill> selectALLSkill();

    List<RecruitBaseSkill> selectSkillByMasterId(Long id);

    RecruitBaseSkill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecruitBaseSkill record);

    int updateByPrimaryKey(RecruitBaseSkill record);

    long maxSkillCode(String skillType);

    RecruitBaseSkill selectBySelect(RecruitBaseSkill record);
}