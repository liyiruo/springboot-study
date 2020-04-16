package com.liyiruo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liyiruo
 * @data 2020/3/26  6:57 下午
 */
@EnableWebMvc  //不能加这个注解
@Configuration
public class MySpringMvcConfigurer  implements WebMvcConfigurer {
    /**
     * 这个方法的功能是：如果请求为/liyiruo 会转发到 success
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/liyiruo").setViewName("success");
    }
}
