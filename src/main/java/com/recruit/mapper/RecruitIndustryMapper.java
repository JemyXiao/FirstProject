package com.recruit.mapper;

import com.recruit.entity.RecruitIndustry;
import com.recruit.entity.RecruitIndustryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitIndustryMapper {
    int countByExample(RecruitIndustryExample example);

    int deleteByExample(RecruitIndustryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitIndustry record);

    int insertSelective(RecruitIndustry record);

    List<RecruitIndustry> selectByExample(RecruitIndustryExample example);

    RecruitIndustry selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitIndustry record, @Param("example") RecruitIndustryExample example);

    int updateByExample(@Param("record") RecruitIndustry record, @Param("example") RecruitIndustryExample example);

    int updateByPrimaryKeySelective(RecruitIndustry record);

    int updateByPrimaryKey(RecruitIndustry record);
}