package com.example.demo.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;

@RestController
public class TestController {
	
	@GetMapping(path = "/greeting", produces = "application/json")
	public ResponseEntity<Message> greeting(){
		Message msg = new Message("Hello from Demo Application");
		return new ResponseEntity<Message>(msg, new HttpHeaders(), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/usercount", produces = "application/json")
	public ResponseEntity<Message> userCount(){
		Message msg = new Message("This Application has 10,000 users");
		return new ResponseEntity<Message>(msg, new HttpHeaders(), HttpStatus.OK);
		
	}
	

}
