package com.recruit.service;

import com.recruit.entity.RecruitTechMaster;

/**
 * Created by jmx on 17/6/21.
 */
public interface TechMasterService {
    int addTechMaster(RecruitTechMaster record);

    int updateTechMaster(RecruitTechMaster record);

    int deleteTechMaster(long id);
}
