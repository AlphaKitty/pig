package com.zyl.pig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 这个类对应web.xml的DispatcherServlet或者springmvc.xml的配置 所以要专门扫描Controller
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.zyl.pig.service.*.controller")
public class PigWebMvcConfig implements WebMvcConfigurer {

	/**
	 * 自定义拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// registry.addInterceptor(interceptor)
		//         .addPathPatterns("/**");
	}

	/**
	 * 自定义跨域
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		        .allowedOriginPatterns("*")
		        .allowedMethods("GET", "POST", "PUT", "OPTION", "DELETE")
		        .allowCredentials(true)
		        .maxAge(3600)
		        .allowedHeaders("*");
	}

}
