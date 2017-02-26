package com.arun.spring.boot.swaggertest.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class Greetings {

	@ApiOperation("Greet the world")
	@RequestMapping("/greet")
	public String greet(){
		return "Hello, World";
	}
}
