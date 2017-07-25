package com.recruit.service.impl;

import com.recruit.common.exception.RecruitValidationException;
import com.recruit.entity.RecruitCity;
import com.recruit.mapper.RecruitCityMapper;
import com.recruit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

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

    @Override
    public int insert(RecruitCity record) {

        RecruitCity city = cityMapper.selectCityBySelect(new RecruitCity(record.getCityName()));

        if (!Objects.isNull(city)) {
            throw new RecruitValidationException("城市已经存在，请修改");
        }
        long cityCode = cityMapper.maxCityCode();

        record.setCityCode(cityCode);

        return cityMapper.insert(record);
    }

    @Override
    public int fail(Long id) {
        return cityMapper.deleteByPrimaryKey(id);
    }
}
