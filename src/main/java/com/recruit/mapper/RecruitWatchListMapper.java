package com.recruit.mapper;

import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.RecruitWatchList;
import com.recruit.entity.RecruitWatchListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecruitWatchListMapper {
    int countByExample(RecruitWatchListExample example);

    int deleteByExample(RecruitWatchListExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByWatchList(RecruitWatchList watchList);

    int insert(RecruitWatchList record);

    int insertSelective(RecruitWatchList record);

    List<RecruitWatchList> selectByExample(RecruitWatchListExample example);


    RecruitWatchList selectByPrimaryKey(Long id);

    RecruitWatchList selectByWatchList(RecruitWatchList watchList);

    int updateByExampleSelective(@Param("record") RecruitWatchList record, @Param("example") RecruitWatchListExample example);

    int updateByExample(@Param("record") RecruitWatchList record, @Param("example") RecruitWatchListExample example);

    int updateByPrimaryKeySelective(RecruitWatchList record);

    int updateByPrimaryKey(RecruitWatchList record);

}