package com.recruit.service;

import com.recruit.entity.RecruitScore;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/8/2.
 */
public interface ScoreService {

    //牛人评价发包方
    int scoreEmployer(RecruitScore score);

    //发包方评价牛人
    int scoreMaster(RecruitScore score);

    //查询发包方评价分

    RecruitScore avgScoreEmployer(Long taskId);

    //查询牛人评价分

    RecruitScore avgScoreMaster(Long taskId);

    //查询作为发包方各项平均分
    RecruitScore avgScoreBeEmployer(Long masterId);

    //查询牛人各项平均分
    RecruitScore avgScoreBeMaster(Long masterId);

    //評分列表
    List<RecruitScore> queryScoreList(Map map);
}
