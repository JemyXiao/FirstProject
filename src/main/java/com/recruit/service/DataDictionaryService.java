package com.recruit.service;

import com.recruit.entity.DataDictionaryEntity;

import java.util.List;

/**
 * Created by jmx on 2017/6/24.
 */
public interface DataDictionaryService {
    List<DataDictionaryEntity> getDataDictionary(Long code);

}
