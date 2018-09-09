package com.hzdsn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class App {

	/**
	 * springboot启动
	 * @param args
	 */
	public static void main(String[] args) {
		//args可以为空。。111
		SpringApplication.run(App.class, args);
	}
}
