package com.recruit.service;

import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.vo.EmployerViewHeaderObject;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
public interface EmployerService {
    int addEmployer(EmployerDetailEntity employerEntity);

    EmployerDetailEntity queryEmployerDetail(Long id);

    List<EmployerBasic> queryEmployerViewHeader();
}
