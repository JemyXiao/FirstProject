package com.recruit.mapper;

import com.recruit.entity.RecruitMasterWorkMapping;
import com.recruit.entity.RecruitMasterWorkMappingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitMasterWorkMappingMapper {
    int countByExample(RecruitMasterWorkMappingExample example);

    int deleteByExample(RecruitMasterWorkMappingExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByWorkId(Long masterId);

    int insert(RecruitMasterWorkMapping record);

    int insertSelective(RecruitMasterWorkMapping record);

    List<RecruitMasterWorkMapping> selectByExample(RecruitMasterWorkMappingExample example);

    RecruitMasterWorkMapping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitMasterWorkMapping record, @Param("example") RecruitMasterWorkMappingExample example);

    int updateByExample(@Param("record") RecruitMasterWorkMapping record, @Param("example") RecruitMasterWorkMappingExample example);

    int updateByPrimaryKeySelective(RecruitMasterWorkMapping record);

    int updateByPrimaryKey(RecruitMasterWorkMapping record);

    int selectWorkCaseByMasterId(Long masterId);

}