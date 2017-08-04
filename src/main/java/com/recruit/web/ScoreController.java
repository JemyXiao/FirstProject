package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.recruit.entity.RecruitScore;
import com.recruit.entity.ResultModel;
import com.recruit.service.ScoreService;
import com.recruit.util.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jmx
 * 2017/8/2.
 */
@Slf4j
@RestController
public class ScoreController {

    private final ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    //牛人评分发包方(态度,配合度,及时支付维度)
    @PostMapping("/score/employer")
    public ResultModel scoreEmployer(@RequestBody RecruitScore score) {
        scoreService.scoreEmployer(score);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    //发布方评分牛人(态度,质量,效率维度)
    @PostMapping("/score/master")
    public ResultModel scoreMaster(@RequestBody RecruitScore score) {
        scoreService.scoreMaster(score);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    //查询发布方评价得分
    @GetMapping("/score/avgEmployer")
    public ResultModel employerAvgScore(HttpServletRequest request) {
        Long empId = Long.parseLong(request.getParameter("id"));
        RecruitScore score = scoreService.avgScoreEmployer(empId);
        return new ResultModel(200, score);
    }
    //查询发布方评价得分
    @GetMapping("/score/avgMaster")
    public ResultModel masterAvgScore(HttpServletRequest request) {
        Long masterId = Long.parseLong(request.getParameter("id"));
        RecruitScore score = scoreService.avgScoreMaster(masterId);
        return new ResultModel(200, score);
    }
}
