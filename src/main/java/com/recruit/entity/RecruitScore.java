package com.recruit.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RecruitScore {

    private Long id;
    //任务id
    private Long taskId;
    //被评分对象id
    private Long beRatedId;
    //评价配型(发包方或者牛人维度)
    private String taskType;
    //态度
    private Double attitudeScore;
    //及时支付
    private Double payTimeScore;
    //配合度
    private Double coordinationScore;
    //质量
    private Double qualityScore;
    //效率
    private Double effectScore;
    //评价内容
    private String comment;
    //综合分数
    private Double compScore;
    //历史评分记录
    private List<RecruitScore> scoreList;

    private Date createdAt;

    private Date updatedAt;

}

