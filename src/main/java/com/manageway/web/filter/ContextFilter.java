package com.manageway.web.filter;

import com.manageway.domain.ApplicationContext;
import com.manageway.domain.TenantId;
import com.manageway.web.filter.util.AuthUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.UUID;

public class ContextFilter implements HandlerInterceptor {

    private final AuthUtil authUtil;

    public ContextFilter(AuthUtil authUtil) {
        this.authUtil = authUtil;
    }

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler) {
        final String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer "))
            return true;

        String tenantId = authUtil.extractTenantId(header);
        if (tenantId != null)
            ApplicationContext.setInstance(new ApplicationContext(new TenantId(UUID.fromString(tenantId))));

        return true;
    }

    @Override
    public void afterCompletion(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
                                @NonNull Object handler, Exception ex) {
        ApplicationContext.clearInstance();
    }
}
