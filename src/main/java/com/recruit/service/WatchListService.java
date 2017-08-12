package com.recruit.service;

import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.RecruitWatchList;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/8/8.
 */
public interface WatchListService {

    int insert(RecruitWatchList watchList);

    int update(RecruitWatchList watchList);

    List<RecruitWatchList> queryList(Map map);

    int watch(RecruitWatchList watchList);

    RecruitWatchList queryByWatchList(RecruitWatchList watchList);

    List<RecruitTechMaster> getMasterWatchList(Long empId);
}
