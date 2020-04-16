package com.liyiruo.springboot.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author liyiruo
 * @data 2020/3/30  2:09 下午
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化操作");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Myfileter过滤完成");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter销毁");
    }
}
