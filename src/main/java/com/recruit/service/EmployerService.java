package com.recruit.service;

import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.vo.EmployerViewHeaderObject;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
public interface EmployerService {
    int addEmployer(EmployerDetailEntity employerEntity);

    List<EmployerDetailEntity> queryEmployerDetail(EmployerDetailEntity record);

    List<EmployerViewHeaderObject> queryEmployerViewHeader();
}
