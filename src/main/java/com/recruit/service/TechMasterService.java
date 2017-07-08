package com.recruit.service;

import com.recruit.entity.EmployerBasic;
import com.recruit.entity.RecruitMasterWorkCase;
import com.recruit.entity.RecruitTechMaster;
import com.recruit.entity.dto.EmployerDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 17/6/21.
 */
public interface TechMasterService {
    int addTechMaster(RecruitTechMaster record);

    int updateTechMaster(RecruitTechMaster record);

    int updateWorksCase(RecruitMasterWorkCase workCase,Long masterId);

    int deleteTechMaster(long id);

    int applyEmployer(long id,HttpServletRequest request);

    RecruitTechMaster getTechMaster(HttpServletRequest request);

    RecruitTechMaster getTechMasterById(Long id);

    List<EmployerBasic> getEmployerByMasterId(EmployerDto record);

    List<RecruitTechMaster> selectAllMaster(Map map);

}
