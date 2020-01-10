package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.mapper")
@ComponentScan(basePackages = {"com.entity","com.impl","com.interfaces","com.jpython"})
public class JPythonTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JPythonTestApplication.class, args);
	}

}
