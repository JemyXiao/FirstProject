package com.recruit.mapper;

import com.recruit.entity.RecruitBusiness;

import java.util.List;
import java.util.Map;

public interface RecruitBusinessMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RecruitBusiness record);

    int insertSelective(RecruitBusiness record);

    List<RecruitBusiness> selectAllBusiness();

    List<RecruitBusiness> selectBusinessType(Map map);

    RecruitBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecruitBusiness record);

    int updateByPrimaryKey(RecruitBusiness record);

    long queryMaxCode(Long parentId);
}