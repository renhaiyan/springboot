package com.self.controller;

import com.self.servlet.MyInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@SpringBootApplication(scanBasePackages = {"com.self.controller","com.self.service.impl"})
@SpringBootApplication
@EnableAutoConfiguration//启用springboot的配置
@ComponentScan(basePackages = {"com.self.controller","com.self.datasource","com.self.exception","com.self.servlet","com.self.service.impl"})
@ServletComponentScan(basePackages = {"com.self.servlet"})
@EnableTransactionManagement
@MapperScan(value="com.self.mapper")
public class SpringbootApplication extends WebMvcConfigurerAdapter {

	/*@Bean
	public ServletListenerRegistrationBean<TestListener> testListener(){

		ServletListenerRegistrationBean<TestListener> bean = new ServletListenerRegistrationBean<TestListener>();
		bean.setListener(new TestListener());
		return bean;
	}
	@Bean
	public FilterRegistrationBean testFilter(){

		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new TestFilter());
		bean.addUrlPatterns("/*");

		return bean;
	}

	@Bean
	public ServletRegistrationBean testServlet(){

		ServletRegistrationBean bean = new ServletRegistrationBean();
		bean.setServlet(new TestServlet());
		bean.addUrlMappings("/testServlet");
		return bean;
	}*/

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(args));

		/*SpringApplication application = new SpringApplication(SpringbootApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);*/

//		new SpringApplicationBuilder(SpringbootApplication.class).bannerMode(Banner.Mode.OFF).run();
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
	}

	@Bean
	public MyInterceptor myInterceptor(){

		return new MyInterceptor();
	}
}
