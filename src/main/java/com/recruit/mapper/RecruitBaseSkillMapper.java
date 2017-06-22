package com.recruit.mapper;

import com.recruit.entity.RecruitBaseSkill;
import com.recruit.entity.RecruitBaseSkillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitBaseSkillMapper {
    int countByExample(RecruitBaseSkillExample example);

    int deleteByExample(RecruitBaseSkillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitBaseSkill record);

    int insertSelective(RecruitBaseSkill record);

    List<RecruitBaseSkill> selectByExample(RecruitBaseSkillExample example);

    RecruitBaseSkill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitBaseSkill record, @Param("example") RecruitBaseSkillExample example);

    int updateByExample(@Param("record") RecruitBaseSkill record, @Param("example") RecruitBaseSkillExample example);

    int updateByPrimaryKeySelective(RecruitBaseSkill record);

    int updateByPrimaryKey(RecruitBaseSkill record);
}