package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

// Object will be maintained in the container
@Configuration
public class MessageBean {

	// inject the property value to a variable
	@Value("${user.message}") // this injects value of user.message from the yml file
	private String message;
	
	public String getMessage() {
		return message;
	}
}
