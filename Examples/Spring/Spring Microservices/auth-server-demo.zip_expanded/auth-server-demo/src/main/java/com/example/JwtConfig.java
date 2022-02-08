package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

// this class instantiates TokenStore & JwtAccessTokenConverter
@Configuration
public class JwtConfig {

	// Add the key to token converter that is used during the conversion 
	@Autowired
	private DigitalSignKey key;
	
	// This adds the signing key to the token converter, this is used to convert the token
	@Bean
	public JwtAccessTokenConverter jwtAccessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey(key.getKey());// add the key to the converter 
		return converter;
	}
	// TokenStore to store the converter token
	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(jwtAccessTokenConverter());
	}
}
