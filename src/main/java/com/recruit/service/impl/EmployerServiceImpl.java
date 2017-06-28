package com.recruit.service.impl;

import com.recruit.entity.EmployerBasic;
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
        employerEntity.setStatus("待审核");
        int emp = employerMapper.insert(employerEntity);
        int bus = businessMapperMapper.insert(employerEntity);
        return emp + bus;
    }

    @Override
    public EmployerDetailEntity queryEmployerDetail(Long id) {
        return employerMapper.queryEmployerDetail(id);
    }

    @Override
    public List<EmployerBasic> queryEmployerViewHeader() {
        return employerMapper.queryEmployerViewHeader();
    }
}
