package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DigitalSignKey {

	// inject the property signing.key to this variable
	@Value("${signing.key}")
	private String key;
	
	public String getKey() {
		return key;
	}
}
