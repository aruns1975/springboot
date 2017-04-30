package com.arun.spring.boot.examples.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo")
public class GreetResourse {

	@ApiOperation("Greeting rest call")
	@RequestMapping(path="greet", method=RequestMethod.GET)
	public String greet(){
		return "Hello, World";
	}
}
