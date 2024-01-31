package com.hexaware.springboot2web.appConfig;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Autowired
	Environment env;
	@Bean
	public DataSource getDataSorce() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("url"));
		dataSource.setUsername(env.getProperty("uname"));
		dataSource.setPassword(env.getProperty("password"));
		return dataSource;	
	}
	

}
