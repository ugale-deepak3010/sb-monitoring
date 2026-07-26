package com.sb_monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String getMethodName() {
		return "Hello <br> It's supports Actuator <br> /actuator";
	}
	
	@GetMapping("/")
	public String get() {
		return "Hello <br> It's supports Actuator <br> /actuator <br> /hello";
	}
	

}
