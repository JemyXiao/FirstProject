package com.recruit.service.impl;

import com.recruit.entity.RecruitTechMaster;
import com.recruit.mapper.RecruitTechMasterMapper;
import com.recruit.service.TechMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jmx on 17/6/21.
 */
@Service
public class TechMasterServiceImpl implements TechMasterService {
    @Autowired
    private RecruitTechMasterMapper techMasterMapper;
    @Override
    public int addTechMaster(RecruitTechMaster record) {
        return techMasterMapper.insert(record);
    }

    @Override
    public int updateTechMaster(RecruitTechMaster record) {
        return techMasterMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteTechMaster(long id) {
        return techMasterMapper.deleteByPrimaryKey(id);
    }
}
