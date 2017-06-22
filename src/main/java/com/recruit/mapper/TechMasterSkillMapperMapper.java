package com.recruit.mapper;

import com.recruit.entity.RecruitTechMaster;

/**
 * Created by jmx on 2017/6/22.
 */
public interface TechMasterSkillMapperMapper {
    int insert(RecruitTechMaster record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(TechMasterSkillMapperMapper record);
}
