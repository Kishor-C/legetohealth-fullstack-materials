package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientApplication.class, args);
	}
	@Bean // registers the RestTemplate in the spring container
	@LoadBalanced // uses client side load balancer to equally distribute the load
	public RestTemplate createTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
