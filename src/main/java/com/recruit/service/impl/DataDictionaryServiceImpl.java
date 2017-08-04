package com.recruit.service.impl;

import com.recruit.entity.DataDictionaryEntity;
import com.recruit.entity.RecruitBaseSkill;
import com.recruit.mapper.DataDictionaryMapper;
import com.recruit.mapper.RecruitBaseSkillMapper;
import com.recruit.service.BaseSkillService;
import com.recruit.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/6/24
 */
@Service
@Transactional
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Autowired
    private DataDictionaryMapper mapper;

    @Override
    public List<DataDictionaryEntity> getDataDictionary(Map map) {
        return mapper.getDataDictionary(map);
    }

    @Override
    public int insert(DataDictionaryEntity entity) {
        long value = mapper.queryNextValue(entity.getCode());
        entity.setValue(String.valueOf(value));
        return mapper.insert(entity);
    }

    @Override
    public int fail(Long id) {
        return mapper.failData(id);
    }

    @Override
    public int update(DataDictionaryEntity entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }
}
