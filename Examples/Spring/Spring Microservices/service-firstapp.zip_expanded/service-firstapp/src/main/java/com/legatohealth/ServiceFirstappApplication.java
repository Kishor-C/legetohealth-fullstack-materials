package com.legatohealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // registers in Eureka Server by looking at 8761
public class ServiceFirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFirstappApplication.class, args);
	}

}
