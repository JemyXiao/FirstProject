package com.recruit.service.impl;

import com.recruit.common.exception.RecruitValidationException;
import com.recruit.entity.RecruitIndustry;
import com.recruit.entity.RecruitIndustryExample;
import com.recruit.mapper.RecruitIndustryMapper;
import com.recruit.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by jmx on 2017/7/8.
 */
@Service
public class IndustryServiceImpl implements IndustryService {

    @Autowired
    private RecruitIndustryMapper mapper;

    /**
     * 查询行业列表
     *
     * @return
     */
    @Override
    public List<RecruitIndustry> queryAllIndustry() {
        RecruitIndustryExample example = new RecruitIndustryExample();
        return mapper.selectByExample(example);
    }

    /**
     * 新增行业
     *
     * @param recruitIndustry
     * @return
     */
    @Override
    public int insert(RecruitIndustry recruitIndustry) {
        RecruitIndustry record = mapper.selectIndustry(recruitIndustry.getIndustryName());
        if (!Objects.isNull(record)) {
            throw new RecruitValidationException("行业名称已存在，请修改");
        }
        long code = mapper.selectMaxCode();
        recruitIndustry.setIndustryCode(code);
        return mapper.insert(recruitIndustry);
    }

    @Override
    public int fail(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
