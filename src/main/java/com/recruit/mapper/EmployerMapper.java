package com.recruit.mapper;

import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.entity.vo.EmployerViewHeaderObject;

import java.util.List;
import java.util.Map;

public interface EmployerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(EmployerDto record);

    int insertSelective(EmployerDetailEntity record);

    EmployerDetailEntity queryEmployerDetail(Long id);

    EmployerDetailEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmployerDto record);

    int checkEmp(EmployerDetailEntity record);


    int updateByPrimaryKey(EmployerDetailEntity record);

    List<EmployerBasic> queryEmployerViewHeader(EmployerDto record);

    int queryCountViewCount(EmployerDto record);

    int verified(Map map);

    List<EmployerBasic> queryEmployerByReview(Long masterId);

    int updateStatus(Map map);


}