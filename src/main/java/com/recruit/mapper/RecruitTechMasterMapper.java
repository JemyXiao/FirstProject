package com.recruit.mapper;

import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.recruitTechMasterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitTechMasterMapper {
    int countByExample(recruitTechMasterExample example);

    int deleteByExample(recruitTechMasterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitTechMaster record);

    int insertSelective(RecruitTechMaster record);

    List<RecruitTechMaster> selectByExample(recruitTechMasterExample example);

    RecruitTechMaster selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitTechMaster record, @Param("example") recruitTechMasterExample example);

    int updateByExample(@Param("record") RecruitTechMaster record, @Param("example") recruitTechMasterExample example);

    int updateByPrimaryKeySelective(RecruitTechMaster record);

    int updateByPrimaryKey(RecruitTechMaster record);
}