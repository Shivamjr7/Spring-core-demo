package com.shivam.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shivam.springdemo.model.UNO;

@Configuration
@ComponentScan(basePackages = "com.shivam.springdemo")
public class AppConfig {

	@Bean
	public UNO unoBean() {
		return new UNO();
	}

}
