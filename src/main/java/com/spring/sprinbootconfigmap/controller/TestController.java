package com.spring.sprinbootconfigmap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sprconf")
public class TestController {

	
	  @Value("${message.display}")
	  private String propmessage;
	
	@GetMapping("/displaymessage/")
	public ResponseEntity<String> displayUserMessage() {
		return new ResponseEntity<String>(propmessage, HttpStatus.OK);
	}

}
