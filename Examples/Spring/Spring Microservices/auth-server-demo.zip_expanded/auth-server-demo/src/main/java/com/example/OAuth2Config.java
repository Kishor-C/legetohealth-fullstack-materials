package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

// Registers the application in the oauth server
@Configuration
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private TokenStore tokenStore;
	@Autowired
	private JwtAccessTokenConverter converter;
	// configure the application credentials like id, password, grant-types, type of application
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

		clients.inMemory().withClient("my-client").secret("{noop}secretpassword")
		.authorizedGrantTypes("password").scopes("web", "mobile");
	}
	// this must add the instances that generates the token and also the instance that holds the user information
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(tokenStore)
		.accessTokenConverter(converter)
		.authenticationManager(authenticationManager)
		.userDetailsService(userDetailsService);	
	}
}
