package com.recruit.service.impl;

import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.mapper.*;
import com.recruit.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Autowired
    public EmployerServiceImpl(EmployerMapper employerMapper, EmpSkillMapperMapper skillMapperMapper, EmpMasterMapperEntityMapper mapperEntityMapper, RecruitBusinessMapper businessMapper) {
        this.employerMapper = employerMapper;
        this.skillMapperMapper = skillMapperMapper;
        this.mapperEntityMapper = mapperEntityMapper;
        this.businessMapper = businessMapper;
    }

    @Override
    public int addEmployer(EmployerDto record) {
        record.setStatus("待审核");
        int emp = employerMapper.insert(record);
        for (Long bus : record.getSkillList()) {
            EmployerSkillMapper mapper = new EmployerSkillMapper();
            mapper.setEmployerId(record.getId());
            mapper.setSkillId(bus);
            skillMapperMapper.insert(mapper);
        }
        return emp;
    }

    @Override
    public EmployerDetailEntity queryEmployerDetail(Long id) {
        EmployerDetailEntity entity = employerMapper.queryEmployerDetail(id);
        RecruitBusiness recruitBusinessChild = businessMapper.selectByPrimaryKey(entity.getBusinessId());
        RecruitBusiness recruitBusinessParent = businessMapper.selectByPrimaryKey(entity.getBusinessParentId());
        recruitBusinessChild.setParentBusiness(recruitBusinessParent);
        entity.setRecruitBusiness(recruitBusinessChild);
        return entity;

    }

    @Override
    public List<EmployerBasic> queryEmployerViewHeader(EmployerDto record) {
        List<EmployerBasic> employerBasics = employerMapper.queryEmployerViewHeader(record);
        for (EmployerBasic employerBasic : employerBasics) {
            RecruitBusiness recruitBusinessChild = businessMapper.selectByPrimaryKey(employerBasic.getBusinessId());
            RecruitBusiness recruitBusinessParent = businessMapper.selectByPrimaryKey(employerBasic.getBusinessParentId());
            recruitBusinessChild.setParentBusiness(recruitBusinessParent);
            employerBasic.setRecruitBusiness(recruitBusinessChild);
        }
        return employerBasics;
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
}
