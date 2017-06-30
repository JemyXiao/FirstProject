package com.recruit.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by jmx on 2017/6/29.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
