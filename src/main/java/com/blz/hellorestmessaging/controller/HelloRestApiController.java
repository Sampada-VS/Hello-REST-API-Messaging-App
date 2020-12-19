package com.blz.hellorestmessaging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestApiController {
	
	@RequestMapping(value= {"","/","/home"})
	public String showHello() {
		return "Hello From BridgeLabz";
	}
	
	@RequestMapping(value= {"/query"},method=RequestMethod.GET)
	public String showHello(@RequestParam(value="name") String name, @RequestParam(value="lname") String lname) {
		return "Hello "+name+" "+lname+" ..";
	}
	
	@GetMapping("/param/{name}")
	public String showHello(@PathVariable String name) {
		return "Hello "+name+" from BridgeLabz.";
	}
}
