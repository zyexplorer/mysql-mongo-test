                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           package com.wenwo.data.statistics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           @SpringBootApplication
@MapperScan("com.wenwo.data.statistics.dao.mysql")
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	}
}