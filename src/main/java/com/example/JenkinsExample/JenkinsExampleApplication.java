package com.example.JenkinsExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

	@GetMapping("/get")
    public String get(){
     return "This is a Jenkins Example";
	}

}
