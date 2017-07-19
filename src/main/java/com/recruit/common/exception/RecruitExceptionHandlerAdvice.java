package com.recruit.common.exception;

import com.recruit.common.mail.MailContract;
import com.recruit.common.mail.MailSenderHelper;
import com.recruit.entity.ResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by jmx on 17/6/20.
 * 全局异常控制类
 */
@RestControllerAdvice
public class RecruitExceptionHandlerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(RecruitExceptionHandlerAdvice.class);
//    @Autowired
//    private MailSenderHelper mailSenderHelper;
    @ExceptionHandler(value = {Exception.class})
    public ResultModel exception(Exception ex) {
        logger.error("error happens", ex);
        ResultModel result = new ResultModel(400);
        result.setMessage(ex.getMessage());
//        MailContract mailContract = new MailContract();
//        mailContract.setTo(new String[]{"jinming.xiao@ele.me"});
//        mailSenderHelper.sendMail(mailContract,"erro");
        return result;
    }
}
