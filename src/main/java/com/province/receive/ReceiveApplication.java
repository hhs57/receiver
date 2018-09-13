package com.province.receive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.province.receive.dao")
public class ReceiveApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(ReceiveApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(ReceiveApplication.class, args);
	}
}
