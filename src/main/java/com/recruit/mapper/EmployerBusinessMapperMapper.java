package com.recruit.mapper;

import com.recruit.entity.EmployerDetailEntity;

/**
 * Created by jmx on 2017/6/22.
 *
 */
public interface EmployerBusinessMapperMapper {
    int insert(EmployerDetailEntity record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(EmployerBusinessMapperMapper record);
}
