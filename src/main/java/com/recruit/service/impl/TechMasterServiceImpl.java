package com.recruit.service.impl;

import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.mapper.RecruitMasterWorkCaseMapper;
import com.recruit.mapper.RecruitMasterWorkMappingMapper;
import com.recruit.mapper.RecruitTechMasterMapper;
import com.recruit.mapper.TechMasterSkillMapperMapper;
import com.recruit.service.EmployerService;
import com.recruit.service.TechMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jmx on 17/6/21.
 */
@Service
@Transactional
public class TechMasterServiceImpl implements TechMasterService {

    private final RecruitTechMasterMapper techMasterMapper;

    private final TechMasterSkillMapperMapper skillMapperMapper;

    private final RecruitMasterWorkCaseMapper masterWorkCaseMapper;

    private final RecruitMasterWorkMappingMapper masterWorkMappingMapper;



    private final EmployerService employerService;

    @Autowired
    public TechMasterServiceImpl(RecruitMasterWorkMappingMapper masterWorkMappingMapper, RecruitMasterWorkCaseMapper masterWorkCaseMapper, TechMasterSkillMapperMapper skillMapperMapper, RecruitTechMasterMapper techMasterMapper, EmployerService employerService) {
        this.masterWorkMappingMapper = masterWorkMappingMapper;
        this.masterWorkCaseMapper = masterWorkCaseMapper;
        this.skillMapperMapper = skillMapperMapper;
        this.techMasterMapper = techMasterMapper;
        this.employerService = employerService;
    }

    @Override
    public int addTechMaster(RecruitTechMaster record) {
        return techMasterMapper.insert(record);
    }

    @Override
    public int updateTechMaster(RecruitTechMaster record) {
        //更新master
        int masterNum = techMasterMapper.updateByPrimaryKeySelective(record);
        //更新或插入skill
        for (Long skillId : record.getSkills()) {
            TechMasterBasicSkillMapper mapper = new TechMasterBasicSkillMapper();
            mapper.setSkillId(skillId);
            mapper.setTechMasterId(record.getId());
            skillMapperMapper.insert(mapper);
        }

        //更新或插入worksCase
        for (RecruitMasterWorkCase workCase : record.getWorksCases()) {
            masterWorkCaseMapper.insert(workCase);
            RecruitMasterWorkMapping mapping = new RecruitMasterWorkMapping();
            mapping.setTechMasterId(record.getId());
            mapping.setWorkCaseId(workCase.getId());
            masterWorkMappingMapper.insert(mapping);
        }
        return masterNum;
    }

    @Override
    public int deleteTechMaster(long id) {
        return techMasterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public RecruitTechMaster getTechMaster(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        Long userId = null;
        for (Cookie ck : cookies) {
            if ("userId".equals(ck.getName())) {
                userId = Long.valueOf(ck.getValue());
                break;
            }
        }
        RecruitTechMaster techMaster = techMasterMapper.selectByPrimaryKey(userId);
        return techMaster;
    }

    @Override
    public List<EmployerBasic> getEmployerByMasterId(EmployerDto record) {
        return employerService.queryEmployerViewHeader(record);
    }
}
