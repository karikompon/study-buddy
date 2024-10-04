package com.study_buddy.token_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KeycloakManagementDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(KeycloakManagementDemoApplication.class, args);
	}
}
