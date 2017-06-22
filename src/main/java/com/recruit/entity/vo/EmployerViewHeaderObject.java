package com.recruit.entity.vo;

import com.recruit.entity.EmployerBasic;

/**
 * Created by jmx on 17/6/21.
 */
public class EmployerViewHeaderObject extends EmployerBasic {

    private int visitCount;
    private int applyCount;
    private int recommendCount;

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public int getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(int applyCount) {
        this.applyCount = applyCount;
    }

    public int getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(int recommendCount) {
        this.recommendCount = recommendCount;
    }
}
