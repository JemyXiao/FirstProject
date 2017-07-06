package com.recruit.mapper;

import com.recruit.entity.RecruitMasterWorkCase;
import com.recruit.entity.RecruitMasterWorkCaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitMasterWorkCaseMapper {
    int countByExample(RecruitMasterWorkCaseExample example);

    int deleteByExample(RecruitMasterWorkCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitMasterWorkCase record);

    int insertSelective(RecruitMasterWorkCase record);

    List<RecruitMasterWorkCase> selectByExample(RecruitMasterWorkCaseExample example);

    RecruitMasterWorkCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitMasterWorkCase record, @Param("example") RecruitMasterWorkCaseExample example);

    int updateByExample(@Param("record") RecruitMasterWorkCase record, @Param("example") RecruitMasterWorkCaseExample example);

    int updateByPrimaryKeySelective(RecruitMasterWorkCase record);

    int updateByPrimaryKey(RecruitMasterWorkCase record);
}