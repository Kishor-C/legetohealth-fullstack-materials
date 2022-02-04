package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

	@Autowired
	private MessageBean bean;
	
	@GetMapping
	public ResponseEntity<Object> readConfigMessage() {
		// getMessage() returns the value the config file has
		return ResponseEntity.status(200).body(bean.getMessage());
	}
}
