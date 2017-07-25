package com.recruit.common.Interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jmx
 * on 2017/7/24
 */
@Configuration
@Slf4j
public class ValidInterceptor extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*");
    }
    /**
     * 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestHandlerInterceptor())
                //添加需要验证登录用户操作权限的请求
                .addPathPatterns("/admin/*")
                //排除不需要验证登录用户操作权限的请求
                .excludePathPatterns("/login","/user/*");
    }

}
