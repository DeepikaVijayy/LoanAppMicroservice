package com.cognizant.loanapp.login.loginclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanAppLoginClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAppLoginClientApplication.class, args);
	}

}
