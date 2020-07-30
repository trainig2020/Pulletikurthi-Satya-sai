package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
		auth.inMemoryAuthentication()
		      .withUser("root")
	         .password("Root")
	         .roles("USER")
	         .and()
	        .withUser("satya")
	        .password("satya")
	        .roles("ADMIN");
		    
		    
		
	}
@Bean
public PasswordEncoder encoder() {
	return NoOpPasswordEncoder.getInstance();
	
}
@Override
protected void configure(HttpSecurity security)throws Exception {
	security.authorizeRequests()
	        .antMatchers("/admin").hasRole("ADMIN")
	        .antMatchers("/user").hasAnyRole("USER","ADMIN")
	        .antMatchers("/").permitAll()
	        .and().formLogin();
}
}
