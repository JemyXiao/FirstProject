package com.recruit.mapper;

import com.recruit.entity.EmployerSkillMapper;
import com.recruit.entity.RecruitBaseSkill;

import java.util.List;
/**
 * Created by jmx on 2017/6/22.
 *
 */
public interface EmpSkillMapperMapper {
    int insert(EmployerSkillMapper record);
    int deleteByEmpId(Long employerId);
    int updateByPrimaryKey(EmployerSkillMapper record);
    List<RecruitBaseSkill> selectSkillByEmpId(Long employerId);
}
