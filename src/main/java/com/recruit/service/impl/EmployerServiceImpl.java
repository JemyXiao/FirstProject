package com.recruit.service.impl;

import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.vo.EmployerViewHeaderObject;
import com.recruit.mapper.EmployerBusinessMapperMapper;
import com.recruit.mapper.EmployerMapper;
import com.recruit.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
@Service
@Transactional
public class EmployerServiceImpl implements EmployerService {
    @Autowired
    private EmployerMapper employerMapper;
    @Autowired
    private EmployerBusinessMapperMapper businessMapperMapper;

    @Override
    public int addEmployer(EmployerDetailEntity employerEntity) {
         int emp = employerMapper.insert(employerEntity);
         int bus = businessMapperMapper.insert(employerEntity);
         return  emp+bus;
    }

    @Override
    public List<EmployerDetailEntity> queryEmployerDetail(EmployerDetailEntity record) {
        return employerMapper.queryEmployerDetail(record);
    }

    @Override
    public List<EmployerViewHeaderObject> queryEmployerViewHeader() {
        return employerMapper.queryEmployerViewHeader();
    }
}
