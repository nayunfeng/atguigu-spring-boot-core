package com.atguigu.webrestfulcrud.config;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvc相关配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addRedirectViewController("/", "/login");
        registry.addRedirectViewController("/index.html", "/login");
    }

    @Bean(name = "localeResolver")
    public LinkLocaleResolver localeResolver() {
        return new LinkLocaleResolver();
    }
}
