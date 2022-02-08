package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("microservice3")
public class App3Controller {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String m3() {
		LOG.info("--------inside m3()------");
		String response = restTemplate.getForObject("http://APP2/microservice2", String.class);
		return response;
	}
}
