package com.recruit.mapper;

import com.recruit.entity.RecruitScore;
import com.recruit.entity.RecruitScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecruitScoreMapper {
    int countByExample(RecruitScoreExample example);

    int deleteByExample(RecruitScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitScore record);

    int insertSelective(RecruitScore record);

    List<RecruitScore> selectByExample(RecruitScoreExample example);

    RecruitScore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitScore record, @Param("example") RecruitScoreExample example);

    int updateByExample(@Param("record") RecruitScore record, @Param("example") RecruitScoreExample example);

    int updateByPrimaryKeySelective(RecruitScore record);

    int updateByPrimaryKey(RecruitScore record);

    RecruitScore selectByParam(Map map);

    RecruitScore queryAvgEmp(Map map);

    RecruitScore queryAvgMaster(Map map);

    List<RecruitScore> queryScoreList(Map map);


}