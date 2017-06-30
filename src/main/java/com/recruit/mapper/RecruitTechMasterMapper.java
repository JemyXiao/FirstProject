package com.recruit.mapper;

import com.recruit.entity.RecruitTechMaster;

public interface RecruitTechMasterMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RecruitTechMaster record);

    int insertSelective(RecruitTechMaster record);

    RecruitTechMaster selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecruitTechMaster record);

    int updateByPrimaryKey(RecruitTechMaster record);
}