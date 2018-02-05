package com.es;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
	@RequestMapping
	public String hello() {
		  return "Hello World";
	}
}
