package com.liyiruo.springboot.config;

import com.liyiruo.springboot.filter.MyFilter;
import com.liyiruo.springboot.listener.MyListenner;
import com.liyiruo.springboot.servlet.HelloServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;
import java.util.Arrays;

/**
 * 注册servlet相关组件
 *
 * @author liyiruo
 * @data 2020/3/30  2:01 下午
 */
@Configuration
public class MyServletConfig {

    /***
     * 使用定制器修改Servlet容器配置
       * @param
     * @return {{@link WebServerFactoryCustomizer}}
     * @author liyiruo
     * @date 2020/3/30 7:14 下午
     */
    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer() {

        return new WebServerFactoryCustomizer() {
            @Override
            public void customize(WebServerFactory factory) {
                ConfigurableWebServerFactory serverFactory = (ConfigurableWebServerFactory) factory;
                serverFactory.setPort(8099);
                /*serverFactory.setErrorPages();
                serverFactory.setCompression();
                serverFactory.setAddress();
                serverFactory.setServerHeader();*/
            }
        };
    }

    /**
     * 注册servlet组件
     */
    @Bean
    public ServletRegistrationBean helloServlet() {
        ServletRegistrationBean<HelloServlet> bean = new ServletRegistrationBean<>(new HelloServlet(), "/hello");
//        bean.setServlet();
//        bean.setUrlMappings();
        //设置servlet组件的参数
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        //设置自定义filter
        bean.setFilter(new MyFilter());
        //走完这个过滤器以后，走下面的路经
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(new MyListenner());
        return bean;
    }
}
