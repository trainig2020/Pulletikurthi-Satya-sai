package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;

import com.fasterxml.jackson.databind.introspect.WithMember;
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource);
		
		
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
