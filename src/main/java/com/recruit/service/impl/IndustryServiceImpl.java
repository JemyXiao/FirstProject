package com.recruit.service.impl;

import com.recruit.entity.RecruitIndustry;
import com.recruit.entity.RecruitIndustryExample;
import com.recruit.mapper.RecruitIndustryMapper;
import com.recruit.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jmx on 2017/7/8.
 */
@Service
public class IndustryServiceImpl implements IndustryService {
    @Autowired
    private RecruitIndustryMapper mapper;
    @Override
    public List<RecruitIndustry> queryAllIndustry() {
        RecruitIndustryExample example = new RecruitIndustryExample();
        return mapper.selectByExample(example);
    }
}
