package com.blz.hellorestmessaging.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestApiController {
	
	@RequestMapping(value= {"","/","/home"})
	public String showHello() {
		return "Hello From BridgeLabz";
	}
}
