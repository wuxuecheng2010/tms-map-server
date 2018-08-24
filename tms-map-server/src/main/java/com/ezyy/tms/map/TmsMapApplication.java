package com.ezyy.tms.map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages= {"com.ezyy.tms.map"})
@MapperScan("com.ezyy.tms.map.mapper")
public class TmsMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsMapApplication.class, args);
		
	}
	
	
	
	
}