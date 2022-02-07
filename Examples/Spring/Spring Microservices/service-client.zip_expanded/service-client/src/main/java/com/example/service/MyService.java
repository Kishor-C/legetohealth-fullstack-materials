package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.Client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MyService {

	@Autowired
	private Client client; 
	
	@CircuitBreaker(name = "fetchFirstApp", fallbackMethod = "getFirstAppDataAlternate")
	public String getFirstAppData() {
		System.out.println("----Request is going to firstApp from the client-----");
		String data = client.invokeFirstApp(); // this calls first microservice
		return data;
	}
	
	public String getFirstAppDataAlternate(Throwable t) {
		System.out.println("----Request is not going to firstApp from the client, this is fallback method----");
		System.err.println("---"+t+"-----");
		return "Alternate response from fallback method";
	}
}
