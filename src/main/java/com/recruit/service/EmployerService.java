package com.recruit.service;

import com.recruit.entity.EmpMasterMapperEntity;
import com.recruit.entity.EmployerBasic;
import com.recruit.entity.EmployerDetailEntity;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.entity.vo.EmployerViewHeaderObject;
import com.recruit.enums.TaskTypeEnum;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 17/6/18.
 */
public interface EmployerService {
    int addEmployer(EmployerDto employerEntity);

    EmployerDetailEntity queryEmployerDetail(Long id);

    EmployerDetailEntity queryUserInfoEmp(Long id);

    List<EmployerBasic> queryEmployerViewHeader(EmployerDto record);

    List<EmpMasterMapperEntity> queryEmpMasterMap(EmpMasterMapperEntity record);

    int queryCountViewCount(EmployerDto record);

    int checkEmp(Long id,String status,String reason);

    int verified(Map map);

    List<EmployerBasic> queryEmployerByReview(Long masterId);

    int confirmMaster(Map map);

    int updateStatus(Map map);
}
