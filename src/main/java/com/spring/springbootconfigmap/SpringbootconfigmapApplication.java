package com.spring.springbootconfigmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.sprinbootconfigmap.controller.TestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
public class SpringbootconfigmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootconfigmapApplication.class, args);
	}
}
