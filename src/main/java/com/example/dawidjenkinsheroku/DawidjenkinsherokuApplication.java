package com.example.dawidjenkinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DawidjenkinsherokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DawidjenkinsherokuApplication.class, args);
	}

	@GetMapping
	public String get(){
		return "Hello jenkins";
	}
}
