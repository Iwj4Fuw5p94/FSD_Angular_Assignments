package com.hexaware.customer.springoauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authorization.AuthenticatedAuthorizationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http.authorizeHttpRequests(auth->{
			auth.requestMatchers("/").permitAll();
			auth.anyRequest().authenticated();
			})
				
			.oauth2Login(Customizer.withDefaults())
			.formLogin(Customizer.withDefaults()).build();
	}
	
	public UserDetailsService userDetailsService() {
		 UserDetails admin=org.springframework.security.core.userdetails.User.withUsername("tom")
				 .password("123")
				 .roles("admin")
				 .build();
		return new InMemoryUserDetailsManager(admin);
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
		
		authenticationProvider.setUserDetailsService(userDetailsService());
	authenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
return authenticationProvider;
	}
}
