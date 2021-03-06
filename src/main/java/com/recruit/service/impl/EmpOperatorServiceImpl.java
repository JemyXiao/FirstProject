package com.recruit.service.impl;

import com.recruit.entity.EmployerOperator;
import com.recruit.mapper.EmpOperatorMapper;
import com.recruit.service.EmpOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jmx on 2017/6/28.
 */
@Service
@Transactional
public class EmpOperatorServiceImpl implements EmpOperatorService {
    @Autowired
    private EmpOperatorMapper mapper;
    @Override
    public int insert(EmployerOperator operator) {
        return mapper.insert(operator);
    }

    @Override
    public int update(EmployerOperator operator) {
        return mapper.update(operator);
    }

    @Override
    public EmployerOperator selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
