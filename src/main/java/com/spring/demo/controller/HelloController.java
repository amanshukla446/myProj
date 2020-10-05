package com.spring.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "index";
		
	}
}
