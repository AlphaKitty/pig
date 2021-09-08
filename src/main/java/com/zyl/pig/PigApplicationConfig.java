package com.zyl.pig;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import java.util.concurrent.TimeUnit;

/**
 * 相当于application.xml
 * 扫描Mybatis mapper
 * 扫描组件 但排除Controller注解 因为这是Spring容器的扫面 Controller有专门的ServletContext扫描
 */
@Configuration
@ComponentScan(basePackages = {"com.zyl.pig.service"},
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class PigApplicationConfig {

	// 这里配置除了Controller之外的其他Bean 比如数据库连接池 事务管理器 业务Bean等

	@Bean
	public OkHttpClient okHttpClient() {
		OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS);
		builder.connectionPool(new ConnectionPool(1000, 60 * 1000, TimeUnit.MILLISECONDS));
		return builder.build();
	}

}
