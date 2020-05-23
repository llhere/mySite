package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * 设置匹配.do后缀的请求
	 * @param dispatcherServlet
	 * @return
	 */
/*
	@Bean
	public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
		ServletRegistrationBean bean = new ServletRegistrationBean(dispatcherServlet);
		bean.addUrlMappings("*.do");
		bean.addUrlMappings("*.js","*.css","*.png","*.jpg","*.gif");
		return bean;
	}
*/


//修改之后的
}
