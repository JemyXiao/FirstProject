package com.recruit.service.impl;

import com.recruit.config.Constant;
import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.enums.TaskTypeEnum;
import com.recruit.mapper.*;
import com.recruit.service.EmployerService;
import com.recruit.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by jmx on 17/6/18.
 */
@Service
@Transactional
public class EmployerServiceImpl implements EmployerService {
    private final EmployerMapper employerMapper;
    private final EmpSkillMapperMapper skillMapperMapper;
    private final EmpMasterMapperEntityMapper mapperEntityMapper;
    private final RecruitBusinessMapper businessMapper;
    private final ScoreService scoreService;

    @Autowired
    public EmployerServiceImpl(EmployerMapper employerMapper, EmpSkillMapperMapper skillMapperMapper, EmpMasterMapperEntityMapper mapperEntityMapper, RecruitBusinessMapper businessMapper, ScoreService scoreService) {
        this.employerMapper = employerMapper;
        this.skillMapperMapper = skillMapperMapper;
        this.mapperEntityMapper = mapperEntityMapper;
        this.businessMapper = businessMapper;
        this.scoreService = scoreService;
    }

    @Override
    public int addEmployer(EmployerDto record) {
        record.setStatus(Constant.TODO_AUDIT);
        if (Objects.isNull(record.getId())) {
            employerMapper.insert(record);
        } else {
            //修改发布信息
            //删除关联关系
            skillMapperMapper.deleteByEmpId(record.getId());
            employerMapper.updateByPrimaryKeySelective(record);

        }
        for (Long bus : record.getSkillList()) {
            EmployerSkillMapper mapper = new EmployerSkillMapper();
            mapper.setEmployerId(record.getId());
            mapper.setSkillId(bus);
            skillMapperMapper.insert(mapper);
        }

        return 1;
    }

    @Override
    public EmployerDetailEntity queryEmployerDetail(Long id, boolean flag) {
        EmployerDetailEntity entity = employerMapper.queryEmployerDetail(id);
        //baseSkills
        List<RecruitBaseSkill> skillList = skillMapperMapper.selectSkillByEmpId(id);
        entity.setBaseSkills(skillList);
        //申请列表
        List<RecruitTechMaster> masterList = mapperEntityMapper.getApplyMasterList(id);
        entity.setApplyList(masterList);
        RecruitBusiness recruitBusinessChild = businessMapper.selectByPrimaryKey(entity.getBusinessId());
        RecruitBusiness recruitBusinessParent = businessMapper.selectByPrimaryKey(entity.getBusinessParentId());
        recruitBusinessChild.setParentBusiness(recruitBusinessParent);
        entity.setRecruitBusiness(recruitBusinessChild);
        //获取平均分，综合分
        RecruitScore score = scoreService.avgScoreBeEmployer(Long.valueOf(entity.getMasterId()));
        if (!Objects.isNull(score)) {
            Map<String, Object> objectMap = new HashMap<>();
            objectMap.put("type", TaskTypeEnum.EMP.getType());
            objectMap.put("beRatedId", id);
            //获取历史评价列表
            List<RecruitScore> scoreList = scoreService.queryScoreList(objectMap);
            score.setScoreList(scoreList);
            entity.setEmpScore(score);
        }
        return entity;

    }

    //个人信息查询任务详情
    @Override
    public EmployerDetailEntity queryUserInfoEmp(Long id) {
        EmployerDetailEntity entity = queryEmployerDetail(id, true);
//        entity.setEmpScore(null);
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("taskId", id);
        //获取历史评价列表
        List<RecruitScore> scoreList = scoreService.queryScoreList(objectMap);
        Map<String, Object> map = new HashMap<>(2);
        for (RecruitScore score1 : scoreList) {
            //
            if (score1.getTaskType().equals(TaskTypeEnum.EMP.getType())) {
                map.put("emp", score1);
            } else {
                map.put("master", score1);
            }
        }
        entity.setScoreMap(map);
        return entity;
    }

    @Override
    public List<EmployerBasic> queryEmployerViewHeader(EmployerDto record) {
        List<EmployerBasic> employerBasics = employerMapper.queryEmployerViewHeader(record);
        return employerPackage(employerBasics);
    }

    /**
     * 查詢发布信息牛人关联信息
     *
     * @param record
     * @return
     */
    @Override
    public List<EmpMasterMapperEntity> queryEmpMasterMap(EmpMasterMapperEntity record) {
        return null;
    }

    @Override
    public int queryCountViewCount(EmployerDto record) {
        return employerMapper.queryCountViewCount(record);
    }

    /**
     * 审核任务
     *
     * @param id
     * @return
     */
    @Override
    public int checkEmp(Long id, String status, String reason) {
        EmployerDetailEntity record = new EmployerDetailEntity();
        record.setStatus(status);
        record.setReason(reason);
        record.setId(id);
        return employerMapper.checkEmp(record);
    }

    /**
     * 任务认证
     *
     * @param map
     * @return
     */
    @Override
    public int verified(Map map) {
        return employerMapper.verified(map);
    }

    //查询接收任务列表
    @Override
    public List<EmployerBasic> queryEmployerByReview(Long masterId) {
        List<EmployerBasic> employerBasics = employerMapper.queryEmployerByReview(masterId);
        return employerPackage(employerBasics);
    }

    /**
     * 选定牛人接口
     *
     * @param map
     * @return
     */
    @Override
    public int confirmMaster(Map map) {
        return mapperEntityMapper.confirmMaster(map);
    }

    /**
     * 更新状态
     *
     * @param map
     * @return
     */
    @Override
    public int updateStatus(Map map) {
        return employerMapper.updateStatus(map);
    }

    public List<EmployerBasic> employerPackage(List<EmployerBasic> employerBasics) {
        for (EmployerBasic employerBasic : employerBasics) {
            RecruitBusiness recruitBusinessChild = businessMapper.selectByPrimaryKey(employerBasic.getBusinessId());
            RecruitBusiness recruitBusinessParent = businessMapper.selectByPrimaryKey(employerBasic.getBusinessParentId());
            recruitBusinessChild.setParentBusiness(recruitBusinessParent);
            employerBasic.setRecruitBusiness(recruitBusinessChild);
            List<RecruitBaseSkill> list = skillMapperMapper.selectSkillByEmpId(employerBasic.getId());
            employerBasic.setBaseSkills(list);
        }
        return employerBasics;
    }
}
