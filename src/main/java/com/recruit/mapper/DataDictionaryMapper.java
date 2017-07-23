package com.recruit.mapper;

import com.recruit.entity.DataDictionaryEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/6/25
 */
public interface DataDictionaryMapper {

    List<DataDictionaryEntity> getDataDictionary(Map map);

    int insert(DataDictionaryEntity entity);

    long queryNextValue(long codeType);
}
