package com.recruit.common.guava;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

/**
 * Created by jmx on 16/6/14.
 * 监听处理
 */
@Component
public class EventListener {
    @Subscribe
      public void listen(Object o) {
        System.out.println(o);
    }
}
