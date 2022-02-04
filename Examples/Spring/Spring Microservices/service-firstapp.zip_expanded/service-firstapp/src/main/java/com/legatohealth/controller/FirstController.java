package com.legatohealth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myfirstapp")
public class FirstController {
	@GetMapping
	public ResponseEntity<Object> greetings() {
		System.out.println("---greetings()-----");
		return ResponseEntity.status(200).body("FirstApp!");
	}
}
