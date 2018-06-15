package com.zhang.rabbit.inteceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhang.rabbit.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by robin on 2016/10/11.
 */
public class LoginFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(LoginFilter.class);

    // 不进行拦截的请求
    private String[] IGNORE_URI = {"/toLogin", "/generateCode", "/verifyCode", "/generateTelCode"};


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String excludeUrl = filterConfig.getInitParameter("excludeUrl");
        this.IGNORE_URI = excludeUrl.split(",");
    }

    @SuppressWarnings("Duplicates")
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setContentType("text/html;charset=UTF-8");
        String pathInfo = request.getPathInfo();
        logger.info("pathInfo:{}", pathInfo);
        boolean flag = false;
        for (int i = 0, j = IGNORE_URI.length; i < j; i++) {
            if (pathInfo.equals(IGNORE_URI[i])) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if (null == user) {
                response.sendRedirect(request.getContextPath() + "/v1/toLogin");
                return;
            }


        }

        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}
