package com.recruit.mapper;

import com.recruit.entity.RecruitCity;
import com.recruit.entity.RecruitCityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitCityMapper {
    int countByExample(RecruitCityExample example);

    int deleteByExample(RecruitCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitCity record);

    int insertSelective(RecruitCity record);

    List<RecruitCity> selectByExample(RecruitCityExample example);

    RecruitCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitCity record, @Param("example") RecruitCityExample example);

    int updateByExample(@Param("record") RecruitCity record, @Param("example") RecruitCityExample example);

    int updateByPrimaryKeySelective(RecruitCity record);

    int updateByPrimaryKey(RecruitCity record);
}