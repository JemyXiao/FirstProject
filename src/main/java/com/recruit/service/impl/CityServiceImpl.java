package com.recruit.service.impl;

import com.recruit.entity.RecruitCity;
import com.recruit.mapper.RecruitCityMapper;
import com.recruit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jmx on 2017/6/24.
 */
@Service
@Transactional
public class CityServiceImpl implements CityService {
    @Autowired
    private RecruitCityMapper cityMapper;
    @Override
    public List<RecruitCity> getAllCity() {
        return cityMapper.selectAllCity();
    }
}
