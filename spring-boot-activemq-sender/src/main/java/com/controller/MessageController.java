package com.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {
	@Autowired
	public Queue queue;
	
	@Autowired
	public JmsTemplate jmsTemplate;
	
	@GetMapping("/message")
	public ResponseEntity<String> publish(@RequestParam String message) {
		jmsTemplate.convertAndSend(queue, message);
		return ResponseEntity.ok(message);
	}
	
	@GetMapping("/")
	public String home() {
		return "Hello World";
	}
}
