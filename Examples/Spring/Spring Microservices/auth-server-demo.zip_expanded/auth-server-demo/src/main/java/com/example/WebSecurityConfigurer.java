package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

// Registers the user who can access the protected resource
@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Override // register the user
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Alex").password("{noop}alex123").roles("ADMIN", "USER")
		.and()
		.withUser("Guest").password("{noop}guest123").roles("USER");
	}
	// AuthenticationManagerBean is used to create the token from the user & the application
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}
	// UserDetailsService would configure the user details that can be injected to authenticate the user
	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		// TODO Auto-generated method stub
		return super.userDetailsServiceBean();
	}
}
