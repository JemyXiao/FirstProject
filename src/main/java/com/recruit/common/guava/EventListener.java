package com.recruit.common.guava;

import com.google.common.eventbus.Subscribe;
import com.recruit.entity.EmployerOperator;
import com.recruit.service.EmpOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by jmx on 16/6/14.
 * 监听处理
 */
@Component
public class EventListener {
    @Autowired
    private EmpOperatorService operatorService;
    @Subscribe
      public void listen(EmployerOperator o) {
        EmployerOperator employerOperator = operatorService.selectByPrimaryKey(o.getEmployerId());
        if (Objects.isNull(employerOperator)) {
            operatorService.insert(o);
        }else {
            operatorService.update(o);
        }

    }
}
