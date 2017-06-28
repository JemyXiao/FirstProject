package com.recruit.common.aop;

import com.recruit.common.guava.AsyncEvtBusHelper;
import com.recruit.entity.EmployerOperator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

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
    //定义拦截规则：拦截被@Permission注解的类中的方法
    @Pointcut("@annotation(com.recruit.common.aop.Operation)")
    public void annotationPointcut() {
        //no need to implement
    }


    @AfterReturning("@annotation(com.recruit.common.aop.Operation)")
    public void beforeExec(JoinPoint point){
        try{
            EmployerOperator operator = new EmployerOperator();
            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method=signature.getMethod();
            String name = method.getDeclaredAnnotation(Operation.class).name();
            Object[] args = point.getArgs();
            operator.setEmployerId((Long) args[0]);
            switch (name) {
                case "employerCount": operator.setVisitCount(1);
            }
            System.out.println(Arrays.toString(args));
            asyncEvtBusHelper.post(operator);
        }catch(Exception ex){
            log.error("aop count error", ex);
        }
    }

}
