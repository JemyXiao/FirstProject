package com.recruit.service;

import com.recruit.entity.RecruitBusiness;
import com.recruit.entity.RecruitCity;

import java.util.List;
import java.util.Map;

/**
 * Created by jmx
 * 2017/6/24.
 */
public interface BusinessService {

    List<RecruitBusiness> getBusinessInfo();

    List<RecruitBusiness> getBusinessType(Map map);

    int insert(RecruitBusiness business);

}
