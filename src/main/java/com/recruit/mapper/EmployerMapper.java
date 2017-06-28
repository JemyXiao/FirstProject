package com.recruit.mapper;

import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.vo.EmployerViewHeaderObject;

import java.util.List;

public interface EmployerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(EmployerDetailEntity record);

    int insertSelective(EmployerDetailEntity record);

    EmployerDetailEntity queryEmployerDetail(Long id);

    EmployerDetailEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmployerDetailEntity record);

    int updateByPrimaryKey(EmployerDetailEntity record);

    List<EmployerBasic> queryEmployerViewHeader();
}