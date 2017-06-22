package com.recruit.common.aop;

import com.recruit.common.guava.AsyncEvtBusHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by jmx on 17/6/20.
 * aop操作记录处理
 */
@Aspect
@Component
public class OperatorRecord {
    private final static Logger log = LoggerFactory.getLogger(OperatorRecord.class);
    private final AsyncEvtBusHelper asyncEvtBusHelper;

    @Autowired
    public OperatorRecord(AsyncEvtBusHelper asyncEvtBusHelper) {
        this.asyncEvtBusHelper = asyncEvtBusHelper;
    }

    @Pointcut("@annotation(com.recruit.common.aop.Operation))")
    @Before("@annotation(com.recruit.common.aop.Operation)")
    public void beforeExec(JoinPoint joinPoint){
        try{
            MethodSignature ms=(MethodSignature) joinPoint.getSignature();
            Method method=ms.getMethod();
            String name = method.getDeclaredAnnotation(Operation.class).name();
            asyncEvtBusHelper.post(name);
        }catch(Exception ex){
            log.error("aop count error", ex);
        }
    }

}
