package com.recruit.mapper;

import com.recruit.entity.RecruitBaseSkill;

import java.util.List;

public interface RecruitBaseSkillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RecruitBaseSkill record);

    int insertSelective(RecruitBaseSkill record);

    List<RecruitBaseSkill> selectALLSkill();

    RecruitBaseSkill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecruitBaseSkill record);

    int updateByPrimaryKey(RecruitBaseSkill record);
}