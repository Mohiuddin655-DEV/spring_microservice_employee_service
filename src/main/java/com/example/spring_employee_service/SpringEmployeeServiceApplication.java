package com.example.spring_employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeServiceApplication.class, args);
	}

}
