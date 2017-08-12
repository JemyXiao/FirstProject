package com.recruit.service.impl;

import com.recruit.config.Constant;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.RecruitWatchList;
import com.recruit.mapper.RecruitWatchListMapper;
import com.recruit.service.WatchListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/8/8.
 */
@Slf4j
@Service
@Transactional
public class WatchListServiceImpl implements WatchListService {

    private final RecruitWatchListMapper mapper;

    @Autowired
    public WatchListServiceImpl(RecruitWatchListMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int insert(RecruitWatchList watchList) {

        return mapper.insert(watchList);
    }

    @Override
    public int update(RecruitWatchList watchList) {
        return mapper.updateByPrimaryKeySelective(watchList);
    }

    @Override
    public List<RecruitWatchList> queryList(Map map) {
        return null;
    }

    @Override
    public int watch(RecruitWatchList watchList) {
        //状态为关注
        if (Constant.WATCH.equals(watchList.getStatus())) {
            insert(watchList);
        } else {
            //状态为取消关注
            mapper.deleteByWatchList(watchList);
        }
        return 0;
    }

    @Override
    public RecruitWatchList queryByWatchList(RecruitWatchList watchList) {
        return mapper.selectByWatchList(watchList);
    }

    @Override
    public List<RecruitTechMaster> getMasterWatchList(Long empId) {
        return null;
    }
}
