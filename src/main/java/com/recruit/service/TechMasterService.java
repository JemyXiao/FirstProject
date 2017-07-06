package com.recruit.service;

import com.recruit.entity.EmployerBasic;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.dto.EmployerDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jmx on 17/6/21.
 */
public interface TechMasterService {
    int addTechMaster(RecruitTechMaster record);

    int updateTechMaster(RecruitTechMaster record);

    int deleteTechMaster(long id);

    RecruitTechMaster getTechMaster(HttpServletRequest request);

    List<EmployerBasic> getEmployerByMasterId(EmployerDto record);
}
