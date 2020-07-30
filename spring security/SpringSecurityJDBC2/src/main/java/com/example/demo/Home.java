package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
@GetMapping("/")
public String Home() {
	return ("<h1>Welcome<h1>");
	
}
@GetMapping("/user")
public String User() {
	return("<h1>Hello user<h1>");
}
@GetMapping("/admin")
public String Admin() {
	return("<h1>Hello Adimn<h1>");
}
}
