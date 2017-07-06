package com.recruit.common.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Order(1)
@WebFilter(filterName = "recruitFilter", urlPatterns = "/*")
public class RecruitFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Content-Type");
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            Cookie cookie = new Cookie("openId", "12345");
            response.addCookie(cookie);
        } else {
            for (Cookie ck : cookies) {
                if (!"openId".equals(ck.getName())) {
                    Cookie cookie = new Cookie("openId", "12345");
                    response.addCookie(cookie);
                    System.out.println(cookie.getValue());
                }
            }
        }
        chain.doFilter(request, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }
}