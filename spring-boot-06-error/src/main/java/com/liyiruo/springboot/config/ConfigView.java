package com.liyiruo.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liyiruo
 * @data 2020/3/27  3:59 下午
 */
//@Configuration
public class ConfigView implements WebMvcConfigurer {
    /***
     * 这个重写方法是增加了一个视图控制器
       * @param registry
     * @return {}
     * @author liyiruo
     * @date 2020/3/30 10:38 上午
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        ////http://localhost:8080/mypage
        registry.addViewController("/mypage").setViewName("/err");
        /**
         * 系统默认设置的error 页面重定向到/err
         * http://localhost:8080/error 发生错误的页面都会进入err页面
         */
        registry.addViewController("/error").setViewName("/err");
    }
}
