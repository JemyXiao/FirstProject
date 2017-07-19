package com.recruit.service.impl;

import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.mapper.*;
import com.recruit.service.BaseSkillService;
import com.recruit.service.EmployerService;
import com.recruit.service.TechMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private final EmpMasterMapperEntityMapper empMasterMapperEntityMapper;

    private final BaseSkillService baseSkillService;

    private final EmployerService employerService;

    @Autowired
    public TechMasterServiceImpl(RecruitMasterWorkMappingMapper masterWorkMappingMapper, RecruitMasterWorkCaseMapper masterWorkCaseMapper, TechMasterSkillMapperMapper skillMapperMapper, RecruitTechMasterMapper techMasterMapper, EmpMasterMapperEntityMapper empMasterMapperEntityMapper, BaseSkillService baseSkillService, EmployerService employerService) {
        this.masterWorkMappingMapper = masterWorkMappingMapper;
        this.masterWorkCaseMapper = masterWorkCaseMapper;
        this.skillMapperMapper = skillMapperMapper;
        this.techMasterMapper = techMasterMapper;
        this.empMasterMapperEntityMapper = empMasterMapperEntityMapper;
        this.baseSkillService = baseSkillService;
        this.employerService = employerService;
    }

    @Override
    public int addTechMaster(RecruitTechMaster record) {
        return techMasterMapper.insert(record);
    }

    @Override
    public int updateTechMaster(RecruitTechMaster record) {
        record.setStatus("待审核");
        //更新master
        int masterNum = techMasterMapper.updateByPrimaryKeySelective(record);
        //更新或插入skill
        if (record.getSkills()!=null) {
            for (Long skillId : record.getSkills()) {
                TechMasterBasicSkillMapper mapper = new TechMasterBasicSkillMapper();
                mapper.setSkillId(skillId);
                mapper.setTechMasterId(record.getId());
                skillMapperMapper.insert(mapper);
            }
        }
        return masterNum;
    }

    //更新或插入worksCase
    @Override
    public int updateWorksCase(RecruitMasterWorkCase workCase, Long masterId) {
        masterWorkCaseMapper.insert(workCase);
        RecruitMasterWorkMapping mapping = new RecruitMasterWorkMapping();
        mapping.setTechMasterId(masterId);
        mapping.setWorkCaseId(workCase.getId());
        masterWorkMappingMapper.insert(mapping);
        return 2;
    }

    @Override
    public int deleteTechMaster(long id) {
        return techMasterMapper.deleteByPrimaryKey(id);
    }

    /**
     * 牛人申請发布信息
     *
     * @param id
     * @return
     */
    @Override
    public int applyEmployer(long id,HttpServletRequest request) {
        EmpMasterMapperEntity entity = new EmpMasterMapperEntity();
        entity.setEmployerId(id);
        entity.setTechMasterId(1L);
        entity.setStatus("待确认");
        return empMasterMapperEntityMapper.insert(entity);
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
        return techMasterMapper.selectByPrimaryKey(userId);
    }

    @Override
    public RecruitTechMaster getTechMasterById(Long id) {
        Map map = new HashMap();
        map.put("id",id);
        RecruitTechMaster master =  techMasterMapper.selectAllMaster(map).get(0);
        List<RecruitBaseSkill> baseSkills = baseSkillService.getBaseSkillInfo(master.getId());
        master.setBaseSkillList(baseSkills);
        List<RecruitMasterWorkCase> workCases = masterWorkCaseMapper.selectByMasterId(master.getId());
        master.setWorksCases(workCases);
        return master;
    }

    @Override
    public List<EmployerBasic> getEmployerByMasterId(EmployerDto record) {
        return employerService.queryEmployerViewHeader(record);
    }

    @Override
    public List<RecruitTechMaster> selectAllMaster(Map map) {
        return techMasterMapper.selectAllMaster(map);
    }

    /**
     * 用户审核
     * @param map
     * @return
     */
    @Override
    public int checkTechMaster(Map map) {
        return techMasterMapper.checkTechMaster(map);
    }
}
