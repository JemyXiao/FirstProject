package com.recruit.service;

import com.recruit.entity.EmpMasterMapperEntity;
import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.entity.vo.EmployerViewHeaderObject;

import java.util.List;

/**
 * Created by jmx on 17/6/18.
 */
public interface EmployerService {
    int addEmployer(EmployerDto employerEntity);

    EmployerDetailEntity queryEmployerDetail(Long id);

    List<EmployerBasic> queryEmployerViewHeader(EmployerDto record);

    List<EmpMasterMapperEntity> queryEmpMasterMap(EmpMasterMapperEntity record);

    int queryCountViewCount(EmployerDto record);

    int checkEmp(Long id,String status);
}
