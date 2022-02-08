package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("protected-app")
public class ProtectedController {

	@GetMapping(value = "/fetch")
	public String getApi() {
		return "Get Info";
	}
	@PostMapping(value = "/store")
	public String postApi() {
		return "Post Info";
	}
}
