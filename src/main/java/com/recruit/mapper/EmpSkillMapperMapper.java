package com.recruit.mapper;

import com.recruit.entity.EmployerSkillMapper;

/**
 * Created by jmx on 2017/6/22.
 *
 */
public interface EmpSkillMapperMapper {
    int insert(EmployerSkillMapper record);
    int deleteByPrimaryKey(EmployerSkillMapper record);
    int updateByPrimaryKey(EmployerSkillMapper record);

}
