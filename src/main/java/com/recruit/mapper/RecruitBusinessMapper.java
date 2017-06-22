package com.recruit.mapper;

import com.recruit.entity.RecruitBusiness;
import com.recruit.entity.recruitBusinessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitBusinessMapper {
    int countByExample(recruitBusinessExample example);

    int deleteByExample(recruitBusinessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitBusiness record);

    int insertSelective(RecruitBusiness record);

    List<RecruitBusiness> selectByExample(recruitBusinessExample example);

    RecruitBusiness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitBusiness record, @Param("example") recruitBusinessExample example);

    int updateByExample(@Param("record") RecruitBusiness record, @Param("example") recruitBusinessExample example);

    int updateByPrimaryKeySelective(RecruitBusiness record);

    int updateByPrimaryKey(RecruitBusiness record);
}