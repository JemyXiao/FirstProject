package com.recruit.service;

import com.recruit.entity.DataDictionaryEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/6/24
 */
public interface DataDictionaryService {

    List<DataDictionaryEntity> getDataDictionary(Map map);

    int insert(DataDictionaryEntity entity);
}
