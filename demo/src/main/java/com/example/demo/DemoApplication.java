package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello world!";
//	}
//
//	@GetMapping
//	public List<String> hello(){
//		return List.of("Hello", "World");
//	}


}
