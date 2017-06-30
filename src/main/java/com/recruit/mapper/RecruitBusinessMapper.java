package com.recruit.mapper;

import com.recruit.entity.RecruitBusiness;

import java.util.List;

public interface RecruitBusinessMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RecruitBusiness record);

    int insertSelective(RecruitBusiness record);

    List<RecruitBusiness> selectAllBusiness();

    RecruitBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecruitBusiness record);

    int updateByPrimaryKey(RecruitBusiness record);
}