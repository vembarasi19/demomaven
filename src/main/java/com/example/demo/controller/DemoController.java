package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/demo/api")
public class DemoController {
	
	
		@GetMapping("/welcome")
		public String welcome() {
			return "welcome to demo app";
		}
			@GetMapping("/greeting")
			public String greeting() {
				return "greeting to demo app";
			}
			@GetMapping("/hello")
			public String hello() {
				return "hello to demo app";
			
		}

	}



