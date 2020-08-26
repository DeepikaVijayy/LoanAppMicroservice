package com.cognizant.loanapp.login.loginclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class LoanAppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	
	  @Override protected void configure(AuthenticationManagerBuilder auth) throws
	  Exception {
	  
	  auth.userDetailsService(userDetailsService);
	  
	  }
	 
		/*
		 * @Bean public AuthenticationProvider authProvider() {
		 * 
		 * DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		 * auth.setUserDetailsService(userDetailsService);
		 * auth.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); return auth;
		 * 
		 */

	
	  @Override protected void configure(HttpSecurity http) throws Exception {
	  
			http.authorizeRequests()
					.antMatchers("/user").permitAll()
					.anyRequest().authenticated();
			/* .and().formLogin(); */
		/* .loginPage("/showMyLoginForm") .loginProcessingUrl("/authenticateTheUser") */
	  
	  }
	  
	  @Override
	  @Bean
	  public AuthenticationManager authenticationManagerBean() throws Exception{
		  return super.authenticationManagerBean();
	  }
	 

	
	  @Bean protected PasswordEncoder getPasswordEncoder() { 
		  return NoOpPasswordEncoder.getInstance(); }
	 

}
