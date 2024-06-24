package com.manageway.web.filter;

import com.manageway.domain.ApplicationContext;
import com.manageway.domain.TenantId;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class ContextFilter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        ApplicationContext.setInstance(new ApplicationContext(new TenantId(null)));
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ApplicationContext.clearInstance();
    }
}
