package com.recruit.service;

import com.recruit.entity.RecruitIndustry;

import java.util.List;

/**
 * Created by jmx on 2017/7/8.
 */
public interface IndustryService {
    List<RecruitIndustry> queryAllIndustry();

    int insert(RecruitIndustry recruitIndustry);

    int fail(Long id);
}
