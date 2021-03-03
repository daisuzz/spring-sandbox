package com.dais39.samplespringinterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ApplicationConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FooInterceptor()).addPathPatterns("/foo");
        registry.addInterceptor(new BarInterceptor()).addPathPatterns("/bar");
        registry.addInterceptor(new NotFooBarInterceptor()).excludePathPatterns("/foo", "/bar");
    }
}
