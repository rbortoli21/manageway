package com.manageway.infrastructure.config;

import com.manageway.web.converter.StringToIdConverter;
import com.manageway.web.filter.ContextFilter;
import com.manageway.web.filter.util.AuthUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    private final AuthUtil authUtil;

    public WebConfiguration(AuthUtil authUtil) {
        this.authUtil = authUtil;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIdConverter());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ContextFilter(authUtil));
    }
}
