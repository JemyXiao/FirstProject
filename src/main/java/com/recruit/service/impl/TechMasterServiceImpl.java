package com.recruit.service.impl;

import com.recruit.config.Constant;
import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.enums.TaskTypeEnum;
import com.recruit.mapper.*;
import com.recruit.service.BaseSkillService;
import com.recruit.service.EmployerService;
import com.recruit.service.ScoreService;
import com.recruit.service.TechMasterService;
import com.recruit.util.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    private final ScoreService scoreService;

    @Autowired
    public TechMasterServiceImpl(RecruitMasterWorkMappingMapper masterWorkMappingMapper, RecruitMasterWorkCaseMapper masterWorkCaseMapper, TechMasterSkillMapperMapper skillMapperMapper, RecruitTechMasterMapper techMasterMapper, EmpMasterMapperEntityMapper empMasterMapperEntityMapper, BaseSkillService baseSkillService, EmployerService employerService, ScoreService scoreService) {
        this.masterWorkMappingMapper = masterWorkMappingMapper;
        this.masterWorkCaseMapper = masterWorkCaseMapper;
        this.skillMapperMapper = skillMapperMapper;
        this.techMasterMapper = techMasterMapper;
        this.empMasterMapperEntityMapper = empMasterMapperEntityMapper;
        this.baseSkillService = baseSkillService;
        this.employerService = employerService;
        this.scoreService = scoreService;
    }

    @Override
    public int addTechMaster(RecruitTechMaster record) {
        return techMasterMapper.insert(record);
    }

    @Override
    public int updateTechMaster(RecruitTechMaster record) {
        //更新或插入skill
        if (record.getSkills() != null) {
            RecruitTechMaster master = new RecruitTechMaster();
            master.setId(record.getId());
            master.setOwnerSkills(record.getOwnerSkills());
            techMasterMapper.updateByPrimaryKeySelective(master);
            //删除之前管关联关系
            skillMapperMapper.deleteByMasterId(record.getId());
            //插入新关联关系
            for (Long skillId : record.getSkills()) {
                TechMasterBasicSkillMapper mapper = new TechMasterBasicSkillMapper();
                mapper.setSkillId(skillId);
                mapper.setTechMasterId(record.getId());
                skillMapperMapper.insert(mapper);
            }
        } else {
            //更新master
            techMasterMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    //更新或插入worksCase
    @Override
    public int updateWorksCase(RecruitMasterWorkCase workCase, Long masterId) {
        //新增
        if (StringUtils.isEmpty(workCase.getId())) {
            masterWorkCaseMapper.insert(workCase);
            RecruitMasterWorkMapping mapping = new RecruitMasterWorkMapping();
            mapping.setTechMasterId(masterId);
            mapping.setWorkCaseId(workCase.getId());
            masterWorkMappingMapper.insert(mapping);
        } else {
            masterWorkCaseMapper.updateByPrimaryKeySelective(workCase);
        }
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
    public int applyEmployer(long id, HttpServletRequest request) {
        //获取登录人信息
        RecruitTechMaster techMaster = getTechMaster(request);
        EmpMasterMapperEntity entity = new EmpMasterMapperEntity();
        entity.setEmployerId(id);
        entity.setTechMasterId(techMaster.getId());
        //待确认状态
        entity.setStatus(Constant.TODO_SURE);
        return empMasterMapperEntityMapper.insert(entity);
    }

    @Override
    public RecruitTechMaster getTechMaster(HttpServletRequest request) {
        String openId = CookieUtils.getCookieValue(request, "COFFEE_TOKEN");
        return techMasterMapper.selectByOpenId(openId);
    }

    @Override
    public RecruitTechMaster getTechMasterById(Long id) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("id", id);
        RecruitTechMaster master = techMasterMapper.selectAllMaster(map).get(0);
        List<RecruitBaseSkill> baseSkills = baseSkillService.getBaseSkillInfo(master.getId());
        master.setBaseSkillList(baseSkills);
        List<RecruitMasterWorkCase> workCases = masterWorkCaseMapper.selectByMasterId(master.getId());
        master.setWorksCases(workCases);
        //获取平均分，综合分
        RecruitScore score = scoreService.avgScoreBeMaster(id);
        if (!Objects.isNull(score)) {
            Map<String, Object> objectMap = new HashMap<>();
            objectMap.put("type", TaskTypeEnum.EMP.getType());
            objectMap.put("beRatedId", id);
            //获取历史评价列表
            List<RecruitScore> scoreList = scoreService.queryScoreList(objectMap);
            score.setScoreList(scoreList);
            master.setMasterScore(score);
        }
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
     *
     * @param map
     * @return
     */
    @Override
    public int checkTechMaster(Map map) {
        return techMasterMapper.checkTechMaster(map);
    }

    @Override
    public int verified(Map map) {
        return techMasterMapper.verified(map);
    }

    @Override
    public RecruitTechMaster getMasterByOpenId(String openId) {
        return techMasterMapper.selectByOpenId(openId);
    }

    @Override
    public List<EmployerBasic> getEmployerByReview(Long masterId) {
        return employerService.queryEmployerByReview(masterId);
    }

    @Override
    public int selectByMasterId(Long masterId) {
        return masterWorkMappingMapper.selectWorkCaseByMasterId(masterId);
    }

    //删除workCase
    @Override
    public int deleteWorkCasById(long id) {
        masterWorkCaseMapper.deleteByPrimaryKey(id);
        //删除关联关系
        masterWorkMappingMapper.deleteByWorkId(id);
        return 1;
    }

    //查询workCase
    @Override
    public RecruitMasterWorkCase queryWorkCase(long id) {
        return masterWorkCaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<RecruitTechMaster> getMasterWatchList(Long empId) {
        return techMasterMapper.getMasterWatchList(empId);
    }
}
