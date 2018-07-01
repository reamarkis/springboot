package com.markis.springboot.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorld {
		
	@RequestMapping("/")
	@ResponseBody
	ResponseEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}
}