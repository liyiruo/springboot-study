package com.liyiruo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * http://localhost:8080/webjars/jquery/3.4.1/jquery.js  这个可以访问；
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	/**
	 * 自定义一个视图解析器
	 */
	class MyViewResolver implements ViewResolver{
		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}
	/**
	 * 将视图解析器加入容器
	 */

	@Bean
	public ViewResolver myViewresoler() {

		return new MyViewResolver();
	}


}
