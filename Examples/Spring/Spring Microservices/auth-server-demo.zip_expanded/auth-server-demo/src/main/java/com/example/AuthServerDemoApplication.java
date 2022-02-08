package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer // this can receive a token 
@EnableAuthorizationServer // this creates auth server to generate & validate token
public class AuthServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerDemoApplication.class, args);
	}

	// this method is executed when microservice sends the token to authserver for verification
	// an endpoint the microservice would use to send the token, this method would recieve it and return the acknowledgement
	@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> user(OAuth2Authentication token) {
		Map<String, Object> userInfo = new HashMap<String, Object>();
		userInfo.put("user", token.getUserAuthentication().getPrincipal()); // this stores the user information
		userInfo.put("authorities", token.getUserAuthentication().getAuthorities()); // this stores the user roles
		return userInfo;
	}
}
