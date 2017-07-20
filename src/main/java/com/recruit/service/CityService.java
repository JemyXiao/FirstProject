package com.recruit.service;

import com.recruit.entity.RecruitCity;

import java.util.List;

/**
 * Created by jmx on 2017/6/24.
 */
public interface CityService {

    List<RecruitCity> getAllCity();

    int insert(RecruitCity record);
}
