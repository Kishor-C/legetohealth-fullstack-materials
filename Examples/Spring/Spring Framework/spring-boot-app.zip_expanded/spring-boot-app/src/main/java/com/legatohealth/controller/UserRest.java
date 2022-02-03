package com.legatohealth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.beans.User;

@RestController
@RequestMapping("api")
public class UserRest {

	@GetMapping(path = "/test") // HTTP - GET: http://localhost:8080/api/test
	public ResponseEntity<Object> testing() {
		ResponseEntity<Object> response = null;
		User user = new User();
		user.setUserId(123);
		user.setName("Raj");
		user.setAge(40);
		response = ResponseEntity.status(HttpStatus.OK).body(user);
		return response;
	}
}
