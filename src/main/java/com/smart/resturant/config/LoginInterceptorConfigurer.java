package com.smart.resturant.config;

import ch.qos.logback.classic.spi.EventArgUtil;
import com.smart.resturant.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/** 处理器拦截器的注册 */
@Configuration // 加载当前的拦截器进行注册
public class LoginInterceptorConfigurer implements WebMvcConfigurer {
    /** 配置拦截器 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 创建自定义的拦截器对象
        HandlerInterceptor interceptor = new LoginInterceptor();
        // 配置白名单：存放在一个List集合
        List<String> patterns = new ArrayList<>();
        patterns.add("/cee/**");
        patterns.add("/date/**");
        patterns.add("/font/**");
        patterns.add("/IE6/**");
        patterns.add("/FONTS/**");
        patterns.add("/images/**");
        patterns.add("/js/**");
        patterns.add("/upload/**");
        patterns.add("/cee/**");
        patterns.add("/reg.html");
        patterns.add("/login.html");
        patterns.add("/index.html");
        // 完成拦截器的注册
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(patterns); // 表示要拦截的url是什么
    }
}
