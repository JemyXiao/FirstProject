package com.recruit.service.impl;

import com.recruit.entity.RecruitScore;
import com.recruit.enums.TaskTypeEnum;
import com.recruit.mapper.RecruitScoreMapper;
import com.recruit.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/8/2.
 */
@Slf4j
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private RecruitScoreMapper mapper;

    //牛人评价发包方
    @Override
    public int scoreEmployer(RecruitScore score) {
        //设置类型为发包方
        score.setTaskType(TaskTypeEnum.EMP.getType());
        return mapper.insert(score);
    }

    //发包方评价牛人
    @Override
    public int scoreMaster(RecruitScore score) {
        score.setTaskType(TaskTypeEnum.MASTER.getType());
        return mapper.insert(score);
    }

    //查询发包方评价分
    @Override
    public RecruitScore avgScoreEmployer(Long taskId) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("taskId", taskId);
        map.put("type", TaskTypeEnum.EMP.getType());
        return mapper.selectByParam(map);
    }

    //查询牛人评价分
    @Override
    public RecruitScore avgScoreMaster(Long taskId) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("taskId", taskId);
        map.put("type", TaskTypeEnum.MASTER.getType());
        return mapper.selectByParam(map);
    }

    //查询作为发包方各项平均分
    @Override
    public RecruitScore avgScoreBeEmployer(Long masterId) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("beRatedId", masterId);
        map.put("type", TaskTypeEnum.EMP.getType());
        return mapper.queryAvgEmp(map);
    }

    //查询牛人各项平均分
    @Override
    public RecruitScore avgScoreBeMaster(Long masterId) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("beRatedId", masterId);
        map.put("type", TaskTypeEnum.MASTER.getType());
        return mapper.queryAvgMaster(map);
    }

    //評分列表
    @Override
    public List<RecruitScore> queryScoreList(Map map) {
        return mapper.queryScoreList(map);
    }


}
