package com.recruit.mapper;

import com.recruit.entity.EmpMasterMapperEntity;
import com.recruit.entity.RecruitTechMaster;

import java.util.List;
import java.util.Map;

public interface EmpMasterMapperEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmpMasterMapperEntity record);

    EmpMasterMapperEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmpMasterMapperEntity record);

    int updateByPrimaryKey(EmpMasterMapperEntity record);

    List<RecruitTechMaster> getApplyMasterList(Long employerId);

    int confirmMaster(Map map);
}