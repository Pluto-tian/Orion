package com.pluto.config;

import com.pluto.interceptor.CheckTokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author Hoaer
 * @version 1.0
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Resource
    CheckTokenInterceptor checkTokenInterceptor;
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkTokenInterceptor).addPathPatterns("/shopcart/**", "/orders/**", "/useraddr/**", "/user/check");
    }
}
