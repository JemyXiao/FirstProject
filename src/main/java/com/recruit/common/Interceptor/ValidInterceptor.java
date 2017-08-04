package com.recruit.common.Interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.FileNotFoundException;

/**
 * Created by jmx
 * on 2017/7/24
 */
@Configuration
@Slf4j
public class ValidInterceptor extends WebMvcConfigurerAdapter {

    @Value("${upload.path}")
    private String path;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*");
    }
    /**
     * 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testHandlerInterceptor())
                //添加需要验证登录用户操作权限的请求
                .addPathPatterns("/admin/*")
                //排除不需要验证登录用户操作权限的请求
                .excludePathPatterns("/login","/user/*","/admin/fileUpload");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        String path = null;
//        try {
//            path = ResourceUtils.getFile(System.getProperty("user.dir") + "/upload/").getAbsolutePath();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        registry.addResourceHandler("/upload/**").addResourceLocations("file:/root/recruit/upload/","file:/root/recruit/upload/");
        registry.addResourceHandler("/breviary/**").addResourceLocations("file:/root/recruit/upload/","file:/root/recruit/breviary/");

        super.addResourceHandlers(registry);
    }
    @Bean
    public TestHandlerInterceptor testHandlerInterceptor() {
        return new TestHandlerInterceptor();
    }

}
