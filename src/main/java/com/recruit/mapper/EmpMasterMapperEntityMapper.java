package com.recruit.mapper;

import com.recruit.entity.EmpMasterMapperEntity;

public interface EmpMasterMapperEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmpMasterMapperEntity record);

    EmpMasterMapperEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmpMasterMapperEntity record);

    int updateByPrimaryKey(EmpMasterMapperEntity record);
}