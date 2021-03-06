package com.recruit.service.impl;

import com.recruit.entity.RecruitBusiness;
import com.recruit.entity.RecruitCity;
import com.recruit.mapper.RecruitBaseSkillMapper;
import com.recruit.mapper.RecruitBusinessMapper;
import com.recruit.mapper.RecruitCityMapper;
import com.recruit.service.BusinessService;
import com.recruit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by jmx on 2017/6/24.
 */
@Service
@Transactional
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private RecruitBusinessMapper businessMapper;

    @Override
    public List<RecruitBusiness> getBusinessInfo() {
        List<RecruitBusiness> businessList = businessMapper.selectAllBusiness();
        List<RecruitBusiness> childBusinessList = new ArrayList<>();
        List<RecruitBusiness> newBusinessList = new ArrayList<>();
        for (RecruitBusiness recruitBusiness : businessList) {
            if (recruitBusiness.getParentId() == 0) {
                newBusinessList.add(recruitBusiness);
            } else childBusinessList.add(recruitBusiness);
        }
        for (RecruitBusiness business : newBusinessList) {
            List<RecruitBusiness> childLists = new ArrayList<>();
            for (RecruitBusiness childList : childBusinessList){
                if (Objects.equals(business.getId(), childList.getParentId()))  {
                    childLists.add(childList);
                }
            }
            business.setChildren(childLists);
        }
        return newBusinessList;
    }

    @Override
    public List<RecruitBusiness> getBusinessType(Map map) {
        return businessMapper.selectBusinessType(map);
    }

    @Override
    public int insert(RecruitBusiness business) {
        long code = businessMapper.queryMaxCode(business.getParentId());
        business.setBusinessCode(String.valueOf(code));
        return businessMapper.insert(business);
    }
}
