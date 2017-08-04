package com.recruit.mapper;

import com.recruit.entity.TechMasterBasicSkillMapper;

/**
 * Created by jmx on 2017/6/22.
 */
public interface TechMasterSkillMapperMapper {
    int insert(TechMasterBasicSkillMapper record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(TechMasterSkillMapperMapper record);

    int deleteByMasterId(Long masterId);
}
