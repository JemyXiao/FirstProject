package com.recruit.common.Interceptor;

import com.alibaba.fastjson.JSON;
import com.recruit.entity.UserEntity;
import com.recruit.mapper.UserMapper;
import com.recruit.service.CityService;
import com.recruit.util.CookieUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * Created by jmx
 * 2017/7/24.
 */
@Slf4j
@Component
public class TestHandlerInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getMethod().equalsIgnoreCase("OPTIONS")) {
            return true;
        }
        String token = CookieUtils.getCookieValue(request, "COFFEE_TOKEN");
        if (token == null || StringUtils.isEmpty(token)) {
            responseContent(response, "COOKIE_IS_NULL", "token为空");
            return false;
        }
        if (userMapper==null) {
            BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
            userMapper = (UserMapper) factory.getBean("userMapper");
        }
        UserEntity userEntity = userMapper.getUserByToken(token);

        if (Objects.isNull(userEntity)) {
            responseContent(response, "USER_NOT_FOUND", "用户不存在");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
    }

    private void responseContent(HttpServletResponse httpServletResponse, String code, String message) {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setHeader("content-type", "application/json;charset=UTF-8");
        ServletOutputStream outputStream;
        try {
            outputStream = httpServletResponse.getOutputStream();
            Map<String, String> map = new HashMap<>();
            map.put("code", code);
            map.put("message", message);
            outputStream.write(JSON.toJSONString(map).getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            log.info("outputStream exception.", e);
        }
    }
}
