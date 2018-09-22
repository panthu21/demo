package com.sourcecloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.sourcecloud")
public class SpringInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializer.class, args);
	}
}
