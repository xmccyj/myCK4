package com.qa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/appController")
public class AppController {
	@RequestMapping("/app")
	public Object app(){
		
		return 0;
	}
}
