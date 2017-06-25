package com.recruit.mapper;

import com.recruit.entity.DataDictionaryEntity;

import java.util.List;

/**
 * Created by jmx on 2017/6/25.
 */
public interface DataDictionaryMapper {
    List<DataDictionaryEntity> getDataDictionary(Long code);
}
