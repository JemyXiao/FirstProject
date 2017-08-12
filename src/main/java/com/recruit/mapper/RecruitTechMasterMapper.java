package com.recruit.mapper;

import com.recruit.entity.RecruitTechMaster;

import java.util.List;
import java.util.Map;

public interface RecruitTechMasterMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RecruitTechMaster record);

    int insertSelective(RecruitTechMaster record);

    RecruitTechMaster selectByPrimaryKey(Long id);

    RecruitTechMaster selectByOpenId(String openId);

    int updateByPrimaryKeySelective(RecruitTechMaster record);

    int updateByPrimaryKey(RecruitTechMaster record);

    List<RecruitTechMaster> selectAllMaster(Map map);

    int checkTechMaster(Map map);

    int verified(Map map);

    List<RecruitTechMaster> getMasterWatchList(Long empId);
}