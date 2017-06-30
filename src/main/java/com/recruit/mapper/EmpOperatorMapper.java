package com.recruit.mapper;

import com.recruit.entity.EmployerOperator;

/**
 * Created by jmx on 2017/6/28.
 */
public interface EmpOperatorMapper {
    int insert(EmployerOperator operator);
    int update(EmployerOperator operator);
    EmployerOperator selectByPrimaryKey(Long id);
}
